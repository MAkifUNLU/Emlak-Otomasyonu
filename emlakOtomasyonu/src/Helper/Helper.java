package Helper;

import javax.swing.JOptionPane;

public class Helper {

	public static void showMsg(String str) {
		String msg;
		
		switch (str) {
		case "fill":
			msg = "Please Fill In All Fields !";
			break;

		default:
			msg = str;
		}
		
		JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.INFORMATION_MESSAGE);
	} 
}
