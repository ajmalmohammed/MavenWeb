package com.genesys.test;

import junit.framework.Assert;
import org.junit.Test;
import com.genesys.maven.MyApp;;


/**
 * 
 * 
 * @author amohamme
 */
public class MyAppTest
{
       @Test
       public void testPrintHelloWorld() {

            Assert.assertEquals(MyApp.getHelloMaven(), "Hello Maven");

        }

}   