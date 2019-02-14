package com.rockarolla.jackson;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * @author rockarolla01
 * Date: 15.02.2019
 */
public class JacksonCustomizationModule extends SimpleModule {

    public JacksonCustomizationModule() {
        super("rr_test_mudule", new Version(0, 0, 1, null, null, null));
        setMixInAnnotation(Object.class, JacksonTypeInfoMixin.class);
    }
}
