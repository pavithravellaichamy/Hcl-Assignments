package com.src;

public class SpringException extends RuntimeException
{
	public String exceptionMsg;
	public SpringException(String exceptionMsg)
	{
		this.exceptionMsg=exceptionMsg;
	}
	public String getExceptionMsg() {  //getter and setters
		return exceptionMsg;
	}
	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	
	
}
