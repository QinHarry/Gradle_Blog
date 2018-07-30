package com.my.blog.website.utils;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class TaleUtilsTest {

    private static final Logger logger = LoggerFactory.getLogger(TaleUtilsTest.class);

    TaleUtils taleUtils = new TaleUtils();

    @Test
    public void MD5encode() {
        String passwordEncoded = taleUtils.MD5encode("jingya0724");
        logger.info(passwordEncoded);

    }
}