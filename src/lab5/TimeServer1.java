package lab5;

import java.text.DateFormat;
import java.util.Date;

public class TimeServer1 {

	public static void main(String[] args) {
		Date date = new Date();
		DateFormat df = DateFormat.getDateInstance();
		if (args.length > 0) {
			if (args[0].equals("date")) {
				df = DateFormat.getDateInstance(DateFormat.DATE_FIELD);
			} else if (args[0].equals("time")) {
				df = DateFormat.getTimeInstance(DateFormat.SHORT);
			}
			System.out.println(df.format(date));
		}
		/*
		 * try (DatagramSocket ds = new DatagramSocket(30000)) {
		 * //ds.setSoTimeout(10000); DatagramPacket d = new DatagramPacket(new
		 * byte[1024], 1024); ds.receive(d); ds.send(p); } catch (Exception e) {
		 * e.printStackTrace(System.out); }
		 */
	}
}
