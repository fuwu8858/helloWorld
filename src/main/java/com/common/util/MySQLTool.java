package com.common.util;



import java.io.IOException;

public class MySQLTool {

	private static String OS = System.getProperty("os.name").toLowerCase();
	
	public static boolean isLinux(){  
        return OS.indexOf("linux")>=0;  
    }  
      
    public static boolean isMacOS(){  
        return OS.indexOf("mac")>=0&&OS.indexOf("os")>0&&OS.indexOf("x")<0;  
    }  
      
    public static boolean isMacOSX(){  
        return OS.indexOf("mac")>=0&&OS.indexOf("os")>0&&OS.indexOf("x")>0;  
    }  
      
    public static boolean isWindows(){  
        return OS.indexOf("windows")>=0;  
    }  
    
    public static String execMySQL(String action,String user,String password,String host,String port,String database,String path){
    	String backUpStmt = "mysqldump -u"+user+" -p"+password+" -h"+host+" -P"+port +
		" --set-charset --single-transaction --default-character-set=utf8" +
		" --disable-keys -c --no-autocommit --triggers -R "+database+" > "+path;
		String recoveStmt = "cmd /c mysql  -u"+user+" -p"+password+" -h"+host+" -P"+port+" "+database+" <"+path;
		Process p;
		try {
			if(isWindows()){
				p = Runtime.getRuntime().exec(new String[]{"cmd","/c",action == "backup"?backUpStmt:recoveStmt});
			}else{
				p = Runtime.getRuntime().exec(new String[]{"/bin/sh","-c",action == "backup"?backUpStmt:recoveStmt});
			}
			
			p.waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println(String.format("执行数据库备份/还原中断异常:%s", e.getMessage()));
			return "数据库"+(action == "backup"?"备份":"还原")+"中断!";
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(String.format("执行数据库备份/还原连接异常:%s", e.getMessage()));
			return "数据库连接异常";
		}
		return "数据库"+(action == "backup"?"备份":"还原")+"处理成功!";
    }
    
    /**
     * 执行操作系统命令
     * @param cmd

     * @return
     */
    private static int exec(String cmd) {

		Process p;
		
		try {
			if(isWindows()){
				p = Runtime.getRuntime().exec(new String[]{"cmd","/c",cmd});
			}else{
				p = Runtime.getRuntime().exec(new String[]{"/bin/sh","-c",cmd});
			}
			
			p.waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println(String.format("执行数据库备份/还原中断异常:%s", e.getMessage()));

			
			return -1;
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(String.format("执行数据库备份/还原连接异常:%s", e.getMessage()));

			
			return -1;
		}

        System.out.println( "执行命令成功!");
		
		return 1;
	}
    
    /**
     * 导出sql文件
     * @param user
     * @param password
     * @param host
     * @param port
     * @param database
     * @param fileName

     * @return
     */
    public static int dumpSqlFile(String user, String password, String host, String port, String database, String fileName) {
    	String cmd = "mysqldump -u"+user+" -p"+password+" -h"+host+" -P"+port +
    			" --set-charset --single-transaction --default-character-set=utf8" +
    			" --disable-keys -c --no-autocommit --triggers -R "+database+" > "+fileName;
    	System.out.println(String.format("数据库备份开始....%s", cmd));
    	return exec(cmd);
    }
    
    /**
     * 执行sql文件
     * @param user
     * @param password
     * @param host
     * @param port
     * @param database
     * @param fileName

     * @return
     */
    public static int executeSqlFile(String user, String password, String host, String port, String database, String fileName) {
    	String cmd = "mysql  -u"+user+" -p"+password+" -h"+host+" -P"+port+" "+database+" < "+fileName;
    	return exec(cmd);
    }
    
	public static void main(String[] args) throws IOException {
		String str =System.getProperty("user.dir");

		System.out.println(System.getProperty("os.name").toLowerCase());
	}
	
} 