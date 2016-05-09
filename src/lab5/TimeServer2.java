package lab5;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeServer2 {

	public static void main(String[] args) {
		Date date = new Date();
		DateFormat df = DateFormat.getDateInstance();
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String line = scan.nextLine();
			if (line.equals("date")) {
				df = DateFormat.getDateInstance(DateFormat.DATE_FIELD);
				System.out.println(df.format(date));
			} else if (line.equals("time")) {
				df = DateFormat.getTimeInstance(DateFormat.SHORT);
				System.out.println(df.format(date));
			}
			//ASDJHNKJEBRFUIDFBBRF
		}
		scan.close();
		/*
		 * try (DatagramSocket ds = new DatagramSocket(30000)) {
		 * //ds.setSoTimeout(10000); DatagramPacket d = new DatagramPacket(new
		 * byte[1024], 1024); ds.receive(d); ds.send(p); } catch (Exception e) {
		 * e.printStackTrace(System.out); }
		 */
	}
}
