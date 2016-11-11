package com.ryan.osgi.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Rayn
 * @email liuwei412552703@163.com
 * Created by Rayn on 2016/11/11 13:23.
 */
public class OtherTestCase {
    public static final Logger LOG = LoggerFactory.getLogger(OtherTestCase.class);


    @Test
    public void testLog() throws Exception {
        LOG.info("test");

    }
}
