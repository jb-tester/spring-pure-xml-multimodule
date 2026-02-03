package com.mytests.spring.pureXmlMultimodule;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRun {
    public static void main(String[] args)
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
        LibBean2 libBean2= ctx.getBean(LibBean2.class);
        LibBean1 libBean1= ctx.getBean(LibBean1.class);
        AppModuleBean2 appModuleBean2= ctx.getBean(AppModuleBean2.class);
        AppModuleBean1 appModuleBean1= ctx.getBean(AppModuleBean1.class);
        System.out.println(libBean2);
        System.out.println(libBean1);
        System.out.println(appModuleBean2);
        System.out.println(appModuleBean1);

    }
}
