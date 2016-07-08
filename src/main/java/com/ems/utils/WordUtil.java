package com.ems.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;

import org.apache.log4j.Logger;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class WordUtil {
	private static final Logger LOGGER = Logger.getLogger(WordUtil.class);
	/**
	 * @Desc：生成word文件  
	 *  @paramdataMap word中需要展示的动态数据，用map集合来保存  
	 * @paramtemplateName
	 *  word模板名称，例如：test.ftl  
	 *  @paramfilePath文件生成的目标路径，例如：D:/wordFile/ 
	 * 	@paramfileName生成的文件名称 
	 * 例如：test.doc  
	 */
	public static void createWord(Map<String,Object>dataMap,String templateName,String filePath,String fileName){
		try {
			//创建配置实例              
			Configuration configuration = new Configuration(); 
			//设置编码
			configuration.setDefaultEncoding("UTF-8");
			//ftl模板文件 
			File file = new File(filePath);
			configuration.setDirectoryForTemplateLoading(file);
            //获取模板              
			Template template = configuration.getTemplate(templateName); 
			//输出文件
			File outFile = new File(filePath+File.separator+fileName);
			//如果输出目标文件夹不存在则创建
			if(!outFile.getParentFile().exists()){
				outFile.getParentFile().mkdirs();
				}
			//将模板和数据文件合并生成文件
			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile),"UTF-8"));
			//生成文件 
			template.process(dataMap,out);
			//关闭流
			out.flush();
			out.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error("生成 word文档(WordUtil)出错：【msg："+e.getMessage()+"】 ,文件名："+fileName);
			e.printStackTrace();
		}
	}
}
