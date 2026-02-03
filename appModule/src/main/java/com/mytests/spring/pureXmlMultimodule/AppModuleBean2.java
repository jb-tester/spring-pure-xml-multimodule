package com.mytests.spring.pureXmlMultimodule;


// gutter is ok
public class AppModuleBean2 {
    private String someProp;
    private String someProp2;

    public String getSomeProp() {
        return someProp;
    }

    // false-positive error: could not autowire, no String bean found,
    // but the constructor is set in xml
    // gutter for constructor-arg is shown ok
    public AppModuleBean2(String someProp2) {
        this.someProp2 = someProp2;
    }

    // gutter for setter is shown ok
    public void setSomeProp(String someProp) {
        this.someProp = someProp;
    }

    public String getSomeProp2() {
        return someProp2;
    }

    @Override
    public String toString() {
        return "AppModuleBean2{" +
               "someProp='" + someProp + '\'' +
               ", someProp2='" + someProp2 + '\'' +
               '}';
    }
}
