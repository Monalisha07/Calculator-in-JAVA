package hello; 
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	private double first = 0, second = 0, result = 0;
	private String operator, answer;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			Calculator window = new Calculator();
			window.frmCalculator.setVisible(true);
		});
	}

	
	/**
	 * @wbp.parser.entryPoint
	 */
	public Calculator() {
		initialize();
	}

	
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().setBackground(Color.GRAY);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 384, 317);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		frmCalculator.setResizable(true);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setBounds(10, 11, 345, 47);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnB = new JButton("B");
		btnB.setBounds(22, 73, 74, 35);
		btnB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				StringBuilder number = new StringBuilder(textField.getText());
				textField.setText(number.deleteCharAt(number.length() - 1).toString());// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btnB);
		JButton btnC = new JButton("C");
		btnC.setBounds(95, 73, 74, 35);
		btnC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("");// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btnC);

		JButton btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 13));
		btnPercent.setBounds(169, 73, 74, 35);
		btnPercent.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				first = Double.valueOf(textField.getText());
				textField.setText("");
				operator = "%";first = Double.valueOf(textField.getText());
				textField.setText("");
				operator = "%";// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btnPercent);
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnPlus.setBounds(266, 73, 74, 35);
		btnPlus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				first = Double.valueOf(textField.getText());
				textField.setText("");
				operator = "+";// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btnPlus);
		JButton btn7 = new JButton("7");
		btn7.setBounds(22, 121, 74, 35);
		btn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btn7);
		JButton btn8 = new JButton("8");
		btn8.setBounds(95, 121, 74, 35);
		btn8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btn8);
		JButton btn9 = new JButton("9");
		btn9.setBounds(169, 121, 74, 35);
		btn9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btn9);
			JButton btnSub = new JButton("-");
		btnSub.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnSub.setBounds(266, 121, 74, 35);
		btnSub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				first = Double.valueOf(textField.getText());
				textField.setText("");
				operator = "-";// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btnSub);
		JButton btn4 = new JButton("4");
		btn4.setBounds(22, 153, 74, 35);
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btn4);
		JButton btn5 = new JButton("5");
		btn5.setBounds(95, 153, 74, 35);
		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btn5);
		JButton btn6 = new JButton("6");
		btn6.setBounds(169, 153, 74, 35);
		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btn6);
		JButton btnMul = new JButton("*");
		btnMul.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnMul.setBounds(266, 153, 74, 35);
		btnMul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				first = Double.valueOf(textField.getText());
				textField.setText("");
				operator = "*";// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btnMul);
		JButton btn1 = new JButton("1");
		btn1.setBounds(22, 188, 74, 35);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setBounds(95, 188, 74, 35);
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setBounds(169, 188, 74, 35);
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btn3);
		JButton btnDiv = new JButton("/");
		btnDiv.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnDiv.setBounds(266, 188, 74, 35);
		btnDiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				first = Double.valueOf(textField.getText());
				textField.setText("");
				operator = "/";// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btnDiv);
		JButton btn0 = new JButton("0");
		btn0.setBounds(22, 224, 74, 35);
		btn0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btn0);

		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(95, 224, 74, 35);
		btnDot.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnDot.getText();
				textField.setText(number);// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btnDot);
		JButton btn00 = new JButton("00");
		btn00.setBounds(169, 224, 74, 35);
		btn00.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn00.getText();
				textField.setText(number);// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btn00);
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnEqual.setBounds(266, 224, 74, 35);
		btnEqual.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				second = Double.valueOf(textField.getText());
				if (operator.equals("+")) {
					result = first + second;
					answer = String.format("%.2f", result);
					first = 0.0;
					second = 0.0;
					textField.setText(answer);

				} else if (operator.equals("-")) {
					result = first - second;
					answer = String.format("%.2f", result);
					first = 0.0;
					second = 0.0;
					textField.setText(answer);

				} else if (operator.equals("*")) {
					result = first * second;
					answer = String.format("%.2f", result);
					first = 0.0;
					second = 0.0;
					textField.setText(answer);

				} else if (operator.equals("/")) {
					result = first / second;
					answer = String.format("%.2f", result);
					first = 0.0;
					second = 0.0;
					textField.setText(answer);

				} else if (operator.equals("%")) {
					result = first % second;
					answer = String.format("%.2f", result);
					first = 0.0;
					second = 0.0;
					textField.setText(answer);

				}// TODO Auto-generated method stub
				
			}
			
		});
		frmCalculator.getContentPane().add(btnEqual);
	}
}