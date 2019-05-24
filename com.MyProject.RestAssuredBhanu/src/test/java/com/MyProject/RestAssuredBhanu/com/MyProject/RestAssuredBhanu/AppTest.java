package com.MyProject.RestAssuredBhanu.com.MyProject.RestAssuredBhanu;

import org.testng.annotations.Test;

import com.MyProject.WebServices.WebServices;
import com.MyProject.utils.EndPointURI;
import com.MyProject.utils.URL;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void verifyGet()
    {
        
        EndPointURI endPointURI=EndPointURI.REGRES_GET;
        String url= endPointURI.getResourcePath();
        System.out.println(WebServices.Get(URL.fixedURL+url).getBody().asString());
    }
}
