package com.ryan.osgi.hello;

/**
 * @author Rayn
 * @email liuwei412552703@163.com
 * Created by Rayn on 2016/11/11 14:34.
 */
public class HelloImpl implements Hello {
    /**
     * @param name
     * @return
     */
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
