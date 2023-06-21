package currencyconverter;

import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	public class jframe {
	  
	    
	    public static void converter()
	    {
	  
	       
	        JFrame f = new JFrame("CONVERTER");
	       
	       
	        JLabel l1, l2;
	  
	        
	        JTextField t1, t2;
	  
	       
	        JButton b1, b2, b3;
	  
	        
	        l1 = new JLabel("Rupees:");
	        l1.setBounds(20, 40, 60, 30);
	        l2 = new JLabel("Dollars:");
	        l2.setBounds(170, 40, 60, 30);
	  
	        
	        t1 = new JTextField("0");
	        t1.setBounds(80, 40, 70, 30);
	        t2 = new JTextField("0");
	        t2.setBounds(240, 40, 70, 30);
	  
	        
	        b1 = new JButton("Rupee");
	        b1.setBounds(50, 100, 90, 25);
	        b1.setForeground(Color.BLACK);  
	    	b1.setBackground(Color.PINK);  
	        b2 = new JButton("Dollar");
	        b2.setBounds(190, 100, 90, 25);
	        b2.setForeground(Color.BLACK);  
	    	b2.setBackground(Color.PINK);  
	        b3 = new JButton("close");
	        b3.setBounds(150, 150, 90, 30);
	        b3.setForeground(Color.BLACK);  
	    	b3.setBackground(Color.PINK);  
	  
	        
	        b1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e)
	            {
	                
	                double d
	                    = Double.parseDouble(t1.getText());
	  
	                
	                double d1 = (d / 65.25);
	  
	               
	                String str1 = String.valueOf(d1);
	  
	                
	                t2.setText(str1);
	            }
	        });
	  
	       
	        b2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e)
	            {
	                
	                double d2
	                    = Double.parseDouble(t2.getText());
	  
	               
	                double d3 = (d2 * 65.25);
	  
	                String str2 = String.valueOf(d3);
	  
	               
	                t1.setText(str2);
	            }
	        });
	  
	       
	        b3.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e)
	            {
	                f.dispose();
	            }
	        });
	  
	        
	        f.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent e)
	            {
	                System.exit(0);
	            }
	        });
	  
	        
	        f.add(l1);
	        f.add(t1);
	        f.add(l2);
	        f.add(t2);
	        f.add(b1);
	        f.add(b2);
	        f.add(b3);
	  
	        f.setLayout((new BorderLayout(7, 7)));
	        f.getContentPane().setBackground(Color.MAGENTA); 
	    	
	        f.setSize(400, 300);
	        f.setVisible(true);
	    }
	
public static void main(String[] args)
	    {
	        converter();
	    } 
	}
