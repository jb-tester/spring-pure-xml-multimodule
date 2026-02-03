package com.mytests.spring.pureXmlMultimodule;

// gutter is ok
public class AppModuleBean1
{
    private final LibBean1 bean;
    private String someProp;
    private String someProp3;

    // gutters are ok
    public AppModuleBean1(LibBean1 libBean1,
                          AppModuleBean2 appModuleBean2) {
        this.bean = libBean1;
        this.someProp3 = appModuleBean2.getSomeProp();
    }

    // gutters are ok
    public void setSomeProp(String value) {
        this.someProp = value;
    }

    public String getSomeProp() {
        return someProp;
    }

    public LibBean1 getBean() {
        return bean;
    }

    public String getSomeProp3() {
        return someProp3;
    }

    @Override
    public String toString() {
        return "AppModuleBean1{" +
               "bean=" + bean.toString() +
               ", someProp='" + someProp + '\'' +
               ", someProp3='" + someProp3 + '\'' +
               '}';
    }
}
