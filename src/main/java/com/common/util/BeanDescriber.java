package com.common.util;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


public class BeanDescriber {
	
	private static Logger logger = LoggerFactory.getLogger(BeanDescriber.class);
	
	
	/**
	 * javaBean 到 Map的转换
	 * 利用Introspector和PropertyDescriptor 将Bean --> Map
	 * @param obj	要转换的javaBean
	 * @return
	 */
    public static Map<String, Object> decodeBean2Map(Object obj) {  
  
        if(obj == null){  
            return null;  
        }          
        Map<String, Object> map = new HashMap<String, Object>();  
        try {  
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());  
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();  
            for (PropertyDescriptor property : propertyDescriptors) {  
                String key = property.getName();  
  
                // 过滤class属性  
                if (!key.equals("class")) {  
                    // 得到property对应的getter方法  
                    Method getter = property.getReadMethod();  
                    Object value = getter.invoke(obj);  
  
                    map.put(key, value);  
                }  
  
            }  
        } catch (Exception e) {  
        	logger.error("decodeBean2Map Error :" + e);  
        }  
  
        return map;  
  
    }  
    
    /**
     * Map 转换成 javaBean
     * 利用org.apache.commons.beanutils 工具类实现 Map --> Bean
     * @param map
     * @param obj
     */
    public static void encodeMap2Bean(Map<String, Object> map, Object obj) {  
        if (map == null || obj == null) {  
            return;  
        }  
        try {  
            BeanUtils.populate(obj, map);
        } catch (Exception e) {  
        	logger.error("encodeMap2Bean Error " + e);  
        }  
    }
    
    /**
     * Map 转换成 javaBean
     * 利用Introspector,PropertyDescriptor实现 Map --> Bean 
     * @param map
     * @param obj
     */
    public static void transMap2Bean(Map<String, Object> map, Object obj) {  
  
        try {  
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());  
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();  
  
            for (PropertyDescriptor property : propertyDescriptors) {  
                String key = property.getName();  
  
                if (map.containsKey(key)) {  
                    Object value = map.get(key);  
                    // 得到property对应的setter方法  
                    Method setter = property.getWriteMethod();  
                    setter.invoke(obj, value);  
                }  
  
            }  
  
        } catch (Exception e) {  
        	logger.error("transMap2Bean Error " + e);  
        }  
  
        return;  
  
    }

}
