package com.springboot.workers.springjdbcexample.util;
import java.util.Date;
public class DateTimeUtilities
{
	private static Date d;
	private DateTimeUtilities()
	{
		
	}
	public static String getTimeStamp()
	{
	d=new Date();
	return d.toString();
	}
}