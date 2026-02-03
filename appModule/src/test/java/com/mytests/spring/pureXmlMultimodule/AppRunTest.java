package com.mytests.spring.pureXmlMultimodule;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:app-config.xml")
class AppRunTest {


    @Autowired
    private AppModuleBean1 appBean1;

    @Autowired
    private AppModuleBean2 appBean2;

    @Autowired
    private LibBean1 libBean1;

    @Autowired
    private LibBean2 libBean2;

    @Test
    void testBeans() {
        assertNotNull(appBean1);
        assertNotNull(appBean2);
        assertNotNull(libBean1);
        assertNotNull(libBean2);
    }
}