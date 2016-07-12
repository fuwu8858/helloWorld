package com.common.controller;

import com.common.exception.InvalidDeleteException;
import com.common.exception.InvalidLoginException;
import com.common.util.Constants;
import com.common.util.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import org.springframework.security.access.AccessDeniedException;

@Controller
public class AbstractController {
	
	private static Logger logger = LoggerFactory.getLogger(AbstractController.class);
	
	@Autowired
    protected Boolean debug;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) throws ServletException {
//	        binder.registerCustomEditor(byte[].class,new ByteArrayMultipartFileEditor());
        binder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
            public void setAsText(String value) {
                try {
                    setValue(new SimpleDateFormat(Constants.DATE_FORMAT).parse(value));
                } catch(ParseException e) {
                    setValue(null);
                }
            }

            public String getAsText() {
                return new SimpleDateFormat(Constants.DATE_FORMAT).format((Date) getValue());
            }

        });
    }
	
	@ResponseBody
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    @ExceptionHandler
    public String handleInvalidLoginException(InvalidLoginException ex) {
        logger.warn("InvalidLoginException caught in controller: " + ex.getMessage());
        if (this.debug) {
            ex.printStackTrace();
        }

        return ex.getMessage();
    }
	

	@ResponseBody
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler
    public String handleInvalidDeleteException(InvalidDeleteException ex)
	{
		logger.warn("不可删除异常: " + ex.getMessage());
		return ex.getMessage();
	}
	
	@ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler
    public ResultInfo handleException(Exception ex) {
        logger.warn("捕获到异常: "
            + ex.getMessage());
        if (this.debug) {
            ex.printStackTrace();
        }

        return new ResultInfo(false,"操作中发生错误！请重试！");
    }

    @RequestMapping(value = "/notFound", method = {RequestMethod.POST, RequestMethod.GET})
    public String notFound(){
        return "notFound";
    }

}
