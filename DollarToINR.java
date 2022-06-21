package darsh;

import javax.swing.JOptionPane;

public class DollarToINR {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "In this program, if you will type an amount in dollars(type only numbers), it will convert it into INR and vice versa");
		double dollar = Double.parseDouble(JOptionPane.showInputDialog("Enter money in Dollar"));
		double inr = Double.parseDouble(JOptionPane.showInputDialog("Enter money in INR"));
		
		double to_inr = dollar * 76.51;
		double to_dollar = inr / 76.51;
		JOptionPane.showMessageDialog(null, "Amount in INR: " + to_inr);
		JOptionPane.showMessageDialog(null, "Amount in Dollar: " + to_dollar);
	}

}
