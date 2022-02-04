/* * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Author    : Juna Teres Martin
 * Date      : 03/02/2022
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

package oopj;
import java.awt.*;
import java.awt.event.*;
//import java.awt.Password;
public class SignUpPageDemo extends Frame implements ActionListener{
	Button button;
	Label label_name,label_email,label_password;
	TextField name,email,password;
	public SignUpPageDemo(){
		
		//Frame settings
		setTitle("SignUpForm");
		setSize(650,800);
		setVisible(true);
		setLayout(new FlowLayout());
		
		//frame closing
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(ABORT);
			}
		});
		

		//label
	    Label l1=new Label("SIGN UP");
	    l1.setFont(new Font("Verdana", Font.ITALIC, 25));
	    l1.setForeground(Color.blue);
	    add(l1);
	    l1.setBounds(300,80,200,50);

	    label_name=new Label("Full Name");
	    label_name.setFont(new Font("Helvetica", Font.PLAIN, 20));
	    add(label_name);
	    label_name.setBounds(250,200,100,40);
	    name=new TextField(30);
	    add(name);

	    name.setBounds(400,200,100,30);
	    
	    label_email=new Label("Email");
	    label_email.setFont(new Font("Helvetica", Font.PLAIN, 20));
	    add(label_email);
	    label_email.setBounds(250,300,100,40);
	    email=new TextField(30);
	    add(email);
	    email.setBounds(400,300,100,30);
	    
	    label_password=new Label("Password");
	    label_password.setFont(new Font("Helvetica", Font.PLAIN, 20));
	    add(label_password);
	    label_password.setBounds(250,400,100,40);
	    password=new TextField(30);
	    add(password);
	    password.setBounds(400,400,100,30);
	    
	    button=new Button("Submit");
		add(button);
		button.setBounds(350,500,100,50);
		button.setBackground(Color.blue);
		button.addActionListener(this); //registering
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("Name: "+name.getText());
		System.out.println("Email: "+email.getText());
		System.out.println("Password: "+password.getText());
	}

	public static void main(String[]args) {
		SignUpPageDemo obj=new SignUpPageDemo();
	}
}
