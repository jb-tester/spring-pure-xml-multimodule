package com.mytests.spring.pureXmlMultimodule;

// no gutter icon for class w/o explicit facet though the bean is defined in the same module xml
// no gutter icon for class even after adding facet
public class LibBean2

{
    private String someProp;
    private String someProp2;

    // autowire-like gutter is shown ok w/o explicit facet; xml-specific one is not shown
    // same - after adding facet
    public LibBean2(String someProp2) {
        this.someProp2 = someProp2;
    }

    // gutters are ok
    public void setSomeProp(String value) {
        this.someProp = value;
    }

    public String getSomeProp() {
        return someProp;
    }

    public String getSomeProp2() {
        return someProp2;
    }

    @Override
    public String toString() {
        return "LibBean2{" +
               "someProp='" + someProp + '\'' +
               ", someProp2='" + someProp2 + '\'' +
               '}';
    }
}
