package com.itmuch.cloud.generator;


import com.itmuch.cloud.generator.utils.MybatisGenerate;

public class Create {

	public static void main(String[] args) {
		Create ot=new Create();
		ot.createFile();
	}
	
	public void createFile(){

		// 数据库连接信息
		String url = "jdbc:mysql://rm-bp12f42am0qr84g0upo.mysql.rds.aliyuncs.com:3306/cashloan_user?useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true";
		String MysqlUser = "root_db";
		String mysqlPassword = "ckUFy7FB3lajrZz2S55iqtGmKSvGdXkS";
		
		// 数据库及数据表名称
		String database = "cashloan_user";
		String table = "cl_user";
		
		// 配置作者及pojo说明
		String classAuthor = "nmnl";
		String functionName = "用户-账户表";
 
		// 公共包路径 (例如 BaseDao、 BaseService、 BaseServiceImpl)
		String commonName ="com.itmuch.cloud";

		//实体类路径pojo
		String packageName ="com.itmuch.cloud.pojo";
		//空值.数据填充
		String moduleName = "";

		//service文件生产地址
		String serviceName = "com.itmuch.cloud.service";

		//Mapper文件存储地址  默认在resources中
		//@remarks:  调整mapper.xml , mapper.java 位置 符合当前项目 . @date: 20180406 @author: nmnl
		String mapperName = "com.itmuch.cloud.mapper";

		//db属性
		String db="mysql";
		
		//类名前缀
		String classNamePrefix = "clUser";

		try {
			MybatisGenerate.generateCode(db,url, MysqlUser, mysqlPassword, database, table,commonName,packageName,mapperName,moduleName,classAuthor,functionName,classNamePrefix,serviceName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
