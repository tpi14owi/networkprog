package lab5;

import java.net.*;
import java.text.DateFormat;
import java.util.*;

public class PrintDate {
	public static void main(String[] args){

		Date date = new Date();
		DateFormat df = DateFormat.getDateInstance(0, Locale.FRENCH);
		System.out.println(df.format(date));
		df = DateFormat.getDateInstance(0, Locale.GERMAN);
		System.out.println(df.format(date));
		df = DateFormat.getDateInstance(0, Locale.ITALIAN);
		System.out.println(df.format(date));
		df = DateFormat.getDateInstance(0, Locale.UK);
		System.out.println(df.format(date));
	}
}
