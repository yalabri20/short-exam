package DD;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExamApp {

    // main method
    public static void main(String[] args) {
        new ExamApp();
    }

    // constructor
    public ExamApp() {
        // create a JFrame for login
        JFrame loginFrame = new JFrame("Login");
        loginFrame.setSize(300, 200);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLocationRelativeTo(null);
        

        // create JLabels and JTextFields for user inputs
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameTextField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        // create JButton for login
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameTextField.getText();
                String password = String.valueOf(passwordField.getPassword());

                if (username.equals("admin") && password.equals("admin")) {
                    // if login is successful, dispose loginFrame and open main window
                    loginFrame.dispose();
                    new MainWindow();
                } else {
                    // if login fails, show a message
                    JOptionPane.showMessageDialog(loginFrame, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        JButton r=new JButton("Rigester");
        r.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==r)
					new mainWindow2();
			}
        	
        });
        

        // add components to the panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(usernameLabel);
        panel.add(usernameTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(r);

        // add panel to the frame
        loginFrame.getContentPane().add(panel);

        // show the login frame
        loginFrame.setVisible(true);
    }
}

class MainWindow {
    // constructor
    public MainWindow() {
        // create a JFrame for main window
        JFrame mainFrame = new JFrame("Exam");
        mainFrame.setSize(500, 200);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new BorderLayout());

        // add a JLabel for welcome message
        
        
        mainFrame.add(new JLabel("welcome to the exam, if you want to srart exam click Start"), BorderLayout.NORTH);
        
        
        
        
        JButton b1 = new JButton("Start");
        JPanel p11 = new JPanel();
        p11.setLayout(new GridLayout(4,2));
        p11.add(b1);
        mainFrame.add(p11);
        b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
					
					 new windowExam();
						
			}
        	
        });
        
        

        // add welcomeLabel to the main frame
       
        
        // show the main frame
        mainFrame.setVisible(true);
    }
}

class windowExam extends JFrame{
	
	JLabel tf1 ,tf2,tf3,tf4,m1,m2,m3,m4,full1,full2;
	JRadioButton tf11,tf12,tf21,tf22,tf31,tf32,tf41,tf42, m11,m12,m13,m21,m22,m23,m31,m32,m33,m41,m42,m43;
	JButton submit;
	JTextField full11 , full21;
	public windowExam() {
		setTitle("exam");
		setSize(1000,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		s();
		setVisible(true);
	}
	public void s() {
		submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		tf1 = new JLabel(" the capital city of Saudi Arabia is jeddah");
		tf2 = new JLabel(" the capital city of qatar is doha");
		tf3 = new JLabel(" the capital city of qatar is manamah");
		tf4 = new JLabel("the capital city of bahrain is manamah");
		m1 = new JLabel("what is the capital city of qatar");
		m2 = new JLabel("what is the capital city of england");
		m3 = new JLabel("what is the capital city of spain");
		m4 = new JLabel("what is the capital city of germany");
		full1 = new JLabel("How many cities are in Saudi Arabia? ");
	   full2 = new JLabel("How many cities are in qatar?");
	   
	   tf11 = new JRadioButton("T");
	   
	   tf12 = new JRadioButton("F");
	   tf12.isSelected();
	   tf21 = new JRadioButton("T");
	   tf21.isSelected();
	   tf22 = new JRadioButton("F");
	   tf31 = new JRadioButton("T");
	   tf32 = new JRadioButton("F");
	   tf32.isSelected();
	   tf41 = new JRadioButton("T");
	   tf41.isSelected();
	   tf42 = new JRadioButton("F");
	   
	   m11 = new JRadioButton("jeddah");
	   
	   m12 = new JRadioButton("ryadh");
	   
	   m13 = new JRadioButton("doha");
	   m13.isSelected();
	   m21 = new JRadioButton("london");
	   m21.isSelected();
	   m22 = new JRadioButton("manchester");
	   
	   m23 = new JRadioButton("niocastle");

	   m31 = new JRadioButton("berlin");
	   
	   m32 = new JRadioButton("madrid");
	   m32.isSelected();
	   m33 = new JRadioButton("barchalona");
	 
	   m41 = new JRadioButton("berlin");
	   m41.isSelected();
	   m42 = new JRadioButton("munchin");
	   
	   m43 = new JRadioButton("london");
	   
	   full11 = new JTextField(20);
	   full21 = new JTextField(20);
	   
	   submit = new JButton("Submit");
	   submit.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int correctAnswer=0;
			if(tf12.isSelected())
				correctAnswer++;
			if(tf21.isSelected())
				correctAnswer++;
			if(tf32.isSelected())
				correctAnswer++;
			if(tf41.isSelected())
				correctAnswer++;
			if(m13.isSelected())
				correctAnswer++;
			if(m21.isSelected())
				correctAnswer++;
			if(m32.isSelected())
				correctAnswer++;
			if(m41.isSelected())
				correctAnswer++;
			
			String user= full11.getText();
			
			if(Integer.parseInt(user) == 13)
				correctAnswer++;
			String user2= full21.getText();
			if (Integer.parseInt(user2) == 7)
				correctAnswer++;	
			
			
			
			JPanel p9 = new JPanel();
			JLabel resault = new JLabel();
			resault.setText("your correct answer is "+correctAnswer );
			
			p9.add(resault);
			add(p9);
			
			JOptionPane.showMessageDialog(null, resault);
		}
		   
	   });
	   
	   JPanel p = new JPanel();
	   p.setLayout(new GridLayout(50,20));
	   p.add(tf1);
	   p.add(tf11);
	   p.add(tf12);
	   p.add(tf2);
	   p.add(tf21);
	   p.add(tf22);
	   p.add(tf3);
	   p.add(tf31);
	   p.add(tf32);
	   p.add(tf4);
	   p.add(tf41);
	   p.add(tf42);
	  
	   p.add(m1);
	   p.add(m11);
	   p.add(m12);
	   p.add(m13);
	   p.add(m2);
	   p.add(m21);
	   p.add(m22);
	   p.add(m23);
	   p.add(m3);
	   p.add(m31);
	   p.add(m32);
	   p.add(m33);
	   p.add(m4);
	   p.add(m41);
	   p.add(m42);
	   p.add(m43);
	   
	   p.add(full1);
	   p.add(full11);
	   p.add(full2);
	   p.add(full21);
	   
	   p.add(submit);
	  
	   add(p);
	}
	public static void main(String[] args) {
		new windowExam();
	}
	
}






class mainWindow2 extends JFrame{
	
	JLabel fn,ln,e,p,id;
	JTextField fnt,lnt,et,pt,idt;
	JButton s;
	
	public mainWindow2() {
		setTitle("create account");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c();
		setVisible(true);
	}
	public void c() {
    s = new JButton("create");
    s.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new MainWindow();
		}
    	
    });
    fn = new JLabel("insert First Name");	
    ln = new JLabel("insert Last Name");
    e = new JLabel("insert your Email");
    p = new JLabel("insert password");
    id = new JLabel("insert id");
    
    fnt = new JTextField(10);
    lnt = new JTextField(10);
    et = new JTextField(10);
    pt = new JTextField(10);
    idt = new JTextField(10);
    JPanel panell = new JPanel();
    panell.setLayout(new GridLayout(0,2));
    panell.add(fn);
    panell.add(fnt);
    panell.add(ln);
    panell.add(lnt);
    panell.add(e);
    panell.add(et);
    panell.add(p);
    panell.add(pt);
    panell.add(id);
    panell.add(idt);
    panell.add(s);
    add(panell);
    
	}
}