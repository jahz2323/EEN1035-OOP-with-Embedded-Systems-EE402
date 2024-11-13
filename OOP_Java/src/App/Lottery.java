package App;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Lottery extends Frame implements ActionListener {
	private TextField[] numbers = {new TextField(10),new TextField(10),new TextField(10),new TextField(10),new TextField(10),new TextField(10),new TextField(10)};
	private int[] results;
	private Button draw; 
	public Lottery() {
		super("Lottery");
		this.Initializer(); 
		this.AddActionListener(); 
		this.display();
		this.pack();
		/*
		 *Close window
		 */
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Lottery(); 
	}
	public void display() {
		for(int i=0; i<= numbers.length - 1; i++) {
				this.numbers[i].setText("");
		}
		this.draw.setLabel("Click to roll!!");
	}
	public void Initializer() { 
		for(int i=0; i<= this.numbers.length -1 ; i++ ) {
			this.numbers[i] = new TextField(); 
			this.add(numbers[i]);			
		}
		this.setLayout(new FlowLayout());
		this.draw = new Button(); 
	}
	public int[] Draw() {
		int[] draw_results = {1,1,1,1,1,1,1}; 
		/*
		 * add lottery logic 
		 */
		for(int i =0; i< 5; i++) {
			draw_results[i]= 1 + (int) (Math.random() * 50 ); 
			System.out.print("val" + draw_results[i]);
		}
		for(int i =5; i < 7; i++) {
			draw_results[i]= 1 + (int) (Math.random() * 11 ); 
			System.out.print("val" + draw_results[i]);
		}
		return draw_results;
	}
	public void AddActionListener() {
		this.draw.addActionListener(this);
		this.add(draw);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Click to roll!!")) {
			this.results = this.Draw();
			for(int i=0; i<=numbers.length -1 ; i++) {
				numbers[i].setText("" + this.results[i]);
			}
			System.out.println("Rolling....");
		}
	}

}
