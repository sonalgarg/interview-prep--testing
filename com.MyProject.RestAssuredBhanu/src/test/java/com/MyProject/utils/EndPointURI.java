package com.MyProject.utils;

public enum EndPointURI {

	REGRES_GET("?page=1111"),
	REGRES_POST("/200"),
	REGRES_PUT("/2");
	
	public String resourcePath;
	EndPointURI(String Command)
	{
		this.resourcePath=Command;
	}
	
	public String getResourcePath()
	{
		return this.resourcePath;
	}
	
	public String getResourcePath(String data)
	{
		return this.resourcePath+data;
	}
	
}
