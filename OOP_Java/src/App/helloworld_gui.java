package App;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JTextField;
import java.awt.event.WindowListener;

public class helloworld_gui extends Frame implements ActionListener{
	private TextField text;
	private Label hello,A_,B_; 
	private String name; 
	private Button upper,lower,Calculate; 
	private TextField A,B,Result; 
	public helloworld_gui(String name_) {
		super("Frame"); 
		name = name_;
		Initializer(); 
		AddActionListeners(); 
		/*
		 *Close window
		 */
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		this.setSize(600,600);
		this.display();
		this.pack();
		this.setVisible(true);
	}
	public void AddActionListeners() {
		this.A.addActionListener(this);
		this.B.addActionListener(this);
		this.Result.addActionListener(this);
		this.upper.addActionListener(this);
		this.lower.addActionListener(this);
		this.Calculate.addActionListener(this);
		
		this.add(hello); 
		this.add(text); 
		this.add(upper); 
		this.add(lower);
		this.add(A_);
		this.add(A); 
		this.add(B_);
		this.add(B); 
		this.add(Result); 
		this.add(Calculate); 
	}
	public void Initializer() {
		this.setLayout(new FlowLayout());
		this.text = new TextField(50);
		this.hello = new Label();
		this.upper = new Button(); 
		this.lower = new Button(); 
		this.A = new TextField(20); 
		this.A_ = new Label(); 
		this.B = new TextField(20); 
		this.B_ = new Label(); 
		this.Result = new TextField(30); 
		this.Calculate = new Button(); 
	}
	public void display() {
		hello.setText("hello world and hello");
		text.setText(name);
		A_.setText("A");
		B_.setText("B");
		upper.setLabel("To uppercase");
		lower.setLabel("To lowercase");
		Calculate.setLabel("Calculate..");
	}
	public void UpperCase() {
		this.name = this.name.toUpperCase(); 
	}
	public void LowerCase() {
		this.name = this.name.toLowerCase(); 
	}
	public void Calculate(int A, int B) {
		int result = A * B;
		Result.setText(String.valueOf(result));
		
	}
	public static void main(String[] args) {
		String jahz = new String("Jahz"); 
		new helloworld_gui(jahz);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("To uppercase")) {
			UpperCase();
			System.out.println("Uppercase"); 
		}
		else if(e.getActionCommand().equals("To lowercase")) {
			LowerCase(); 
			System.out.println("Lowercase"); 
		}
		if(e.getActionCommand().equals("Calculate..")) {
			String input_A = this.A.getText();
			String input_B = this.B.getText();
			try {
			int a = Integer.parseInt(input_A);
			int b = Integer.parseInt(input_B);
			Calculate(a,b); 
			System.out.println("Calculator"); 
			}
			catch (NumberFormatException error) {
				System.out.println(input_A + input_B +"not a valid integer"); 
			}
		}
		
		display();
	}
}
