/**
 * 
 */
package com.src;
/**
 * @author PAVINANDY
 *
 */
import java.time.LocalDate;

public class DateApiClass
{
	public static void main(String args[])
	{
		LocalDate ld = LocalDate.now();  
		LocalDate ld1 = LocalDate.of(2019, 10, 25);  
		System.out.println(ld);  //returns the current date
		System.out.println(ld.minusDays(1));  //returns the current date minus 1
		System.out.println(ld.getDayOfMonth());  //returns the day of the month
		System.out.println(ld.isAfter(ld1));  //returns whether the day is after the specified date
		System.out.println(ld.isEqual(ld1));  //returns whether the day is equal to the the specified date
		System.out.println(ld.isLeapYear());  //returns whether the year is leap year
		System.out.println(ld.lengthOfMonth());  //returns the number of days in a month
		System.out.println(ld.atStartOfDay());  //returns the local day time at the start of the day
		System.out.println(ld.now());  //returns the current date
		System.out.println(ld.withYear(2022));  //changes the year to the specified year
	}
}
