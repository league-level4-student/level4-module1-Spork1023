package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" , "SATURDAY", "Other"};

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "Its Sunday");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "Its Monday");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "Its Tuesday");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "Its Wednesday");
			break;
		case "Thursday":
			JOptionPane.showMessageDialog(null, "Its Thursday");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "Its Friday");
			break;
		case "Saturday":
		case "SATURDAY":
			JOptionPane.showMessageDialog(null, "Its Saturday");
			break;
		default:
			System.out.println("Error");
			break;
		}
	}
}
