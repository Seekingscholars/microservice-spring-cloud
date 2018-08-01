package com.itmuch.cloud.generator.utils;


import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Map;

public class FreemarkerUtil {
    public static Configuration CONFIG;

    public FreemarkerUtil() {
    }

    public static String fillTemplate(String s, Map<String, Object> data) throws IOException, TemplateException {
        Template t = new Template((String)null, new StringReader(s), CONFIG);
        StringWriter w = new StringWriter();
        t.getConfiguration();

        try {
            t.process(data, w);
        } catch (Exception var5) {
            System.out.println("读取freemarker模板时出现异常 " + var5);
        }

        return w.getBuffer().toString();
    }

    public static String fillTemplateFile(String file, Map<String, Object> data) throws IOException, TemplateException {
        Configuration cfg = CONFIG;
        cfg.setDefaultEncoding("UTF-8");
        Template t = cfg.getTemplate(file);
        StringWriter w = new StringWriter();
        t.getConfiguration();
        t.process(data, w);
        return w.getBuffer().toString();
    }
}
