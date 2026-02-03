package com.mytests.spring.pureXmlMultimodule;

// no gutter icon for class w/o explicit facet
// no gutter icon for class even after adding facet
public class LibBean1

{
    private String someProp;
    private final String someProp2;
    private final String someProp3;

    // no gutter icons w/o explicit facet
    // autowire-like gutter is shown after adding facet
    // xml-specific gutter is not shown even after adding facet
    public LibBean1(String someProp2,
                    LibBean2 libBean2) {
        this.someProp2 = someProp2;
        this.someProp3 = libBean2.getSomeProp();
    }

    // no gutter icons w/o explicit facet
    // gutter is shown after adding facet
    public void setSomeProp(String value) {
        this.someProp = value;
    }

    public String getSomeProp() {
        return someProp;
    }

    public String getSomeProp2() {
        return someProp2;
    }

    public String getSomeProp3() {
        return someProp3;
    }

    @Override
    public String toString() {
        return "LibBean1{" +
               "someProp='" + someProp + '\'' +
               ", someProp2='" + someProp2 + '\'' +
               ", someProp3='" + someProp3 + '\'' +
               '}';
    }
}
