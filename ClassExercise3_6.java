import javax.swing.JOptionPane;

public class ClassExercise3_6 {
	public enum Months {
			January, Febuary, March, April, May, June, July, August, September, October, November, December
			}
	public static void main(String [] args) {
		Months[] choices= {Months.January , Months.Febuary , Months.March , Months.April , Months.May , Months.June , Months.July , Months.August , Months.September , Months.October , Months.November , Months.December};
		Months USERINPUT = (Months) JOptionPane.showInputDialog(null,"Select a month.", "months", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[11]);
		while(USERINPUT!=null){
		  switch(USERINPUT) {
			case December:
			  JOptionPane.showMessageDialog(null,USERINPUT +" Do you want to build a snowman?");
			break;
			case January:
			JOptionPane.showMessageDialog(null,USERINPUT +" Do you want to build a snowman?");
			break;
			case Febuary:
			JOptionPane.showMessageDialog(null,USERINPUT +" Do you want to build a snowman?");
			break;
			case March:
			JOptionPane.showMessageDialog(null,USERINPUT +" Happy Spring days!");
			break;
			case April:
			JOptionPane.showMessageDialog(null,USERINPUT +" Happy Spring days!");
			break;
			case May:
			JOptionPane.showMessageDialog(null,USERINPUT +" Happy Spring days!");
			break;
			case June:
			JOptionPane.showMessageDialog(null,USERINPUT +"  It’s a summer time.");
			break;
			case July:
			JOptionPane.showMessageDialog(null,USERINPUT +"  It’s a summer time.");
			break;
			case August:
			JOptionPane.showMessageDialog(null,USERINPUT +"  It’s a summer time.!");
			break;
			case September:
			JOptionPane.showMessageDialog(null,USERINPUT +" Welcome to the foliage season!");
			break;
			case October:
			JOptionPane.showMessageDialog(null,USERINPUT +" Welcome to the foliage season!");
			break;
			case November:
			JOptionPane.showMessageDialog(null,USERINPUT +" Welcome to the foliage season!");
			break;
			default:
			JOptionPane.showMessageDialog(null,"Try again");																																							}
			 																					USERINPUT = (Months) JOptionPane.showInputDialog(null,"Select a month.", "months", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[11]);
			}
		}
}

