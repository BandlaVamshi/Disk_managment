package hello;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frames extends JFrame {

	private JPanel contentPane;
	public JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frames frame = new Frames();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frames() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		
		JTextArea txtrStart = new JTextArea();
		txtrStart.setBounds(138, 32, 51, 22);
		txtrStart.setText("START");
		contentPane.add(txtrStart);
		
		JTextArea txtrEnd = new JTextArea();
		txtrEnd.setBounds(148, 94, 28, 22);
		txtrEnd.setText("END");
		contentPane.add(txtrEnd);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 130, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(237, 32, 168, 229);
		contentPane.add(textArea);
		
		JTextArea txtrOutput = new JTextArea();
		txtrOutput.setBounds(291, 0, 69, 24);
		txtrOutput.setText("OUTPUT");
		contentPane.add(txtrOutput);

		JTextArea txtrHead = new JTextArea();
		txtrHead.setBounds(137, 162, 41, 22);
		txtrHead.setText("HEAD");
		contentPane.add(txtrHead);
		
		textField_2 = new JTextField();
		textField_2.setBounds(127, 195, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(127, 61, 86, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
	   // public int k = Integer.parseInt(text);		 
		//o = Integer.parseInt(textField.getText());
	//	k = 0;
		//System.out.println(o);
		
	//	k2 = 50;
	//	k2 = Integer.parseInt(textField_2.getText());
		
		JButton btnNewButton = new JButton("FCFS");
		btnNewButton.setBounds(10, 22, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				int k;
				FCFS r = new FCFS();
              textArea.setText(" "); 
				 String text = textField.getText();
				   // textArea.append(text + "\n");
				    textField.selectAll();
				   // System.out.println(text);
				    int k = Integer.parseInt(text);
				//    System.out.println(k);
				    String text1 = textField_1.getText();
				    textField_1.selectAll();
				 
				    int k1 = Integer.parseInt(text1);
				    String text3 = textField_2.getText();
				    textField_2.selectAll();
				    int k2 = Integer.parseInt(text3);
				    r.main(k,k1,k2);
				int[] our = new int[1000];
		        our = r.arr;
		        int n1 = r.n;
		        for(int l = 0;l < n1+1;l++)
		        {
		      //  System.out.println(our[l]);
		        	String s;
		        	s = " " + our[l];
		        	textArea.append(s + "\n");      	
	             		  
			}
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SSTF");
		btnNewButton_1.setBounds(10, 61, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SSTF r = new SSTF();
	              textArea.setText(" "); 
					 String text = textField.getText();
					   // textArea.append(text + "\n");
					    textField.selectAll();
					   // System.out.println(text);
					    int k = Integer.parseInt(text);
					//    System.out.println(k);
					    String text1 = textField_1.getText();
					    textField_1.selectAll();
					    int k1 = Integer.parseInt(text1);
					    String text3 = textField_2.getText();
					    textField_2.selectAll();
					    int k2 = Integer.parseInt(text3);
					    r.main(k,k1,k2);
					int[] our = new int[1000];
			        our = r.b;
			        int n1 = r.n;
			        for(int l = 0;l < n1+1;l++)
			        {
			      //  System.out.println(our[l]);
			        	String s;
			        	s = " " + our[l];
			        	textArea.append(s + "\n");
			        //	System.out.println(our[l]);
			        	
		             		  
				}
				}
				

		});
	
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SCAN");
		btnNewButton_2.setBounds(10, 95, 89, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SCAN r = new SCAN();
	              textArea.setText(" "); 
					 String text = textField.getText();
					   // textArea.append(text + "\n");
					    textField.selectAll();
					   // System.out.println(text);
					    int k = Integer.parseInt(text);
					//    System.out.println(k);
					    String text1 = textField_1.getText();
					    textField_1.selectAll();
					    int k1 = Integer.parseInt(text1);
					    String text3 = textField_2.getText();
					    textField_2.selectAll();
					    int k2 = Integer.parseInt(text3);
					    r.main(k,k1,k2);
					int[] our = new int[1000];
			        our = r.arr;
			        int n1 = r.n;
			        int pos1 = r.pos;
			       // for(int l = 0;l < n1+1;l++)
			        //{
			      //  System.out.println(our[l]);
			        //	String s;
			        //	s = " " + our[l];
			        	//textArea.append(s + "\n");
			        //	System.out.println(our[l]);
			        	
		             		  
				//}
			        
			        for(int i=pos1; i>=0; i--)
			        {
			        	String s;
			        	s = " " + our[i];
			        	textArea.append(s + "\n ");
			        }
						//System.out.println(arr[i] + " ");
					for(int i=pos1+1; i<n1+3; i++)
					{
						String s1;
						s1 = " " + our[i];
						textArea.append(s1 + "\n ");
					}
					//	System.out.println(arr[i] + " ");
				}
				
				
		});
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("CSCAN");
		btnNewButton_3.setBounds(10, 129, 89, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CSCAN r = new CSCAN();
	              textArea.setText(" "); 
					 String text = textField.getText();
					   // textArea.append(text + "\n");
					    textField.selectAll();
					   // System.out.println(text);
					    int k = Integer.parseInt(text);
					//    System.out.println(k);
					    String text1 = textField_1.getText();
					    textField_1.selectAll();
					    int k1 = Integer.parseInt(text1);
					    String text3 = textField_2.getText();
					    textField_2.selectAll();
					    int k2 = Integer.parseInt(text3);
					    r.main(k,k1,k2);
					int[] our = new int[1000];
			        our = r.arr;
			        int n1 = r.n;
			        int pos1 = r.pos;
			       // for(int l = 0;l < n1+1;l++)
			        //{
			      //  System.out.println(our[l]);
			        //	String s;
			        //	s = " " + our[l];
			        	//textArea.append(s + "\n");
			        //	System.out.println(our[l]);
			        	
		             		  
				//}
			        
			        for(int i=pos1; i>=0; i--)
			        {
			        	String s;
			        	s = " " + our[i];
			        	textArea.append(s + "\n ");
			        }
						//System.out.println(arr[i] + " ");
					for(int i=n1+2 ; i>=pos1+1; i--)
					{
						String s1;
						s1 = " " + our[i];
						textArea.append(s1 + "\n ");
					}
					//	System.out.println(arr[i] + " ");
				}
				
				

				
		});
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("CLOOK");
		btnNewButton_4.setBounds(10, 163, 89, 23);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CLOOK r = new CLOOK();
	              textArea.setText(" "); 
					 String text = textField.getText();
					   // textArea.append(text + "\n");
					    textField.selectAll();
					   // System.out.println(text);
					    int k = Integer.parseInt(text);
					//    System.out.println(k);
					    String text1 = textField_1.getText();
					    textField_1.selectAll();
					    int k1 = Integer.parseInt(text1);
					    String text3 = textField_2.getText();
					    textField_2.selectAll();
					    int k2 = Integer.parseInt(text3);
					    r.main(k,k1,k2);
					int[] our = new int[1000];
			        our = r.arr;
			        int n1 = r.n;
			        int pos1 = r.pos;
			       // for(int l = 0;l < n1+1;l++)
			        //{
			      //  System.out.println(our[l]);
			        //	String s;
			        //	s = " " + our[l];
			        	//textArea.append(s + "\n");
			        //	System.out.println(our[l]);
			        	
		             		  
				//}
			        
			        for(int i=pos1; i>=0; i--)
			        {
			        	String s;
			        	s = " " + our[i];
			        	textArea.append(s + "\n ");
			        }
						//System.out.println(arr[i] + " ");
					for(int i=n1 ; i>pos1; i--)
					{
						String s1;
						s1 = " " + our[i];
						textArea.append(s1 + "\n ");
					}
					//	System.out.println(arr[i] + " ");
				}
				
				

	
				
		});
		contentPane.add(btnNewButton_4);
		
		
		
	}
}
