package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {

		int j = JOptionPane.showConfirmDialog(null, "ARE YOU HAPPY");

		if (j == 1) {

			if (meDoMe() == 1) {
				youDoYou();

			} else {

				JOptionPane.showMessageDialog(null, "Change Something");
			}

		}

		else if (j == 0) {
			youDoYou();
		}

	}

	static int meDoMe() {
		return JOptionPane.showConfirmDialog(null, "Do you want to be happy");
	}

	static void youDoYou() {

		JOptionPane.showMessageDialog(null, "Keep Doing Whatever You're Doing");
	}

}
