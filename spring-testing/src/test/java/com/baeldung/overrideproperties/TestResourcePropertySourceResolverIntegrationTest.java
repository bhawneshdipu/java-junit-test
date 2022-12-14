package com.dipu.overrideproperties;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.dipu.overrideproperties.resolver.PropertySourceResolver;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@EnableWebMvc
public class TestResourcePropertySourceResolverIntegrationTest {

    @Autowired
    private PropertySourceResolver propertySourceResolver;

    @Test
    public void shouldTestResourceFile_overridePropertyValues() {
        final String firstProperty = propertySourceResolver.getFirstProperty();
        final String secondProperty = propertySourceResolver.getSecondProperty();

        assertEquals("file", firstProperty);
        assertEquals("file", secondProperty);
    }

}