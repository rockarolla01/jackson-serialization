package com.rockarolla.jackson;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * @author rockarolla01
 * Date: 15.02.2019
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "@type")
public class JacksonTypeInfoMixin {
}
