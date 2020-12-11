package com.src;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextConfig
{
	@Bean(name="mysql")
	public DataSource getDataSourceMysql()
	{
		return new DataSource("com.mysql.cj.jdbc.Driver","jdbc:mysql://localhost:3306/register","root","pass1234");  //database connection
	}
}
