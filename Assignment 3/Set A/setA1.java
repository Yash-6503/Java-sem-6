//Set A
//a)

import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class sa1 extends JFrame implements ActionListener 
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2,b3;
	String sql;
	JPanel p,p1;
	Connection con;
	JTable t;
	JScrollPane js;
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;
	ResultSetMetaData rsmd;
	int columns;
	Vector columnNames = new Vector();
	Vector data=new Vector();
	 
	sa1()
	{
		l1=new JLabel("ENTER PID:");
		l2=new JLabel("ENTER PNAME:");
		l3=new JLabel("ENTER PDESC:");
		l4=new JLabel("ENTER PSTATUS:");
		
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		
		b1=new JButton("INSERT");
		b2=new JButton("DISPLAY");
		b3=new JButton("RESET");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		p1=new JPanel();
		p=new JPanel();
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		p.add(t1);
		p.add(t2);
		p.add(t3);
		p.add(t4);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		add(p);
		setLayout(new GridLayout(2,2));
		setVisible(true);
		setSize(300,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==(JButton)b1)
		{
			int pid = Integer.parseInt(t1.getText());
			String pname=t2.getText();
			String pdesc=t3.getText();
			String pstatus=t4.getText();
			System.out.println("Value is geted");
			try
			{
				Class.forName("org.postgresql.Driver");
				con=DriverManager.getConnection("jdbc:postgresql://server2/ty212","ty212","ty212");
				sql="insert into project values(?,?,?,?)";
				ps=con.prepareStatement(sql);
				ps.setInt(1,pid);
				ps.setString(2,pname);
				ps.setString(3,pdesc);
				ps.setString(4,pstatus);
				int n=ps.executeUpdate();
				if(n!=0)
					JOptionPane.showMessageDialog(null,"Record is inserted...");
				else
					JOptionPane.showMessageDialog(null,"Record ist inserted...");
			}
			catch(Exception ex)
			{
				System.out.println("rail\t"+ex);
			}
		}
		else
		{
			if(e.getSource()==(JButton)b2)
			{
				try
				{
					Class.forName("org.postgresql.Driver");
					con=DriverManager.getConnection("jdbc:postgresql://server2/ty207","ty207","ty207");
					stmt=con.createStatement();
					rs=stmt.executeQuery("Select * from project");
					rsmd=rs.getMetaData();
					columns=rsmd.getColumnCount();
					System.out.println("columns");
					for(int i=1;i<=columns;i++)
					{
						columnNames.addElement(rsmd.getColumnName(i));
					}
					while(rs.next())
					{
						Vector row=new Vector(columns);
						for(int i=1;i<=columns;i++)
						{
							row.addElement(rs.getObject(i));
						}
						data.addElement(row);
					}
					System.out.println("Before table");
					t=new JTable(data,columnNames);
					js=new JScrollPane(t);
					p1.add(js);
					add(p1);
					setSize(500,500);
					setVisible(true);
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
				catch(Exception er)
				{
					System.out.println("rail\t"+er);
				}
			}
			else
			{
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
		}
	}
	public static void main(String args[])
	{
		new sa1();
	}
}
	