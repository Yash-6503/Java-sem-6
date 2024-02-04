import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class setC1 extends JFrame implements ActionListener
{
	JTextField txtname,txtstd;
	JButton btnadd,btndelete,btnsearch;
	JPanel p1;
	Hashtable<String,String>table=new Hashtable<>();
	setC1()
	{
		setTitle("City STD code Information");
		setSize(700,500);
		setVisible(true);
		setLayout(new GridLayout(3,2,20,20));
		setDefaultCloseOperation(JFrame.EXIT_NO_CLOSE);
		JLabel name=new JTextField("Enter city Name:");
		add(Name);
		txtname=new JTextField(10);
		add(txtname);
		JLabel stdcode=new JLabel("enter STD code");
		add(stdcode);
		txtstd=new JTextField(10);
		add(txtstd);
		JLabel op=new JLabel("choose operation:");
		add(op);
		P1=new JPanel();
		P1.setLayout(new GridLayout(1,3,5,5));
		btnadd=new JButton("Add");
		P1.add(btnadd);
		btnadd.addActionListener(this);
		btndelete=new JButton("Delete");
		P1.add(btndelete);
		btndelete.addActionListener(this);
		btnsearch=new JButton("search");
		P1.add(btnsearch);
		btnsearch.addActionListener(this);
		add(P1);
	}//setC1
	public void actionperformed(ActionEvent ae)
	{
		String name=(txtname.gettext());
		String std=(txtstd.gettext());
		if(ae.getSource()==btnadd)
		{
		//System.out.println(table.containsKey(name)||table.containsvalue(std));
		if(table.containsKey(name)||table.containsvalue(std))
		{
		String s2="Duplicates are not alloweded";
		Joptionpane.showMessageDialog(null,s2,s2,Joptionpane.ERROR_MESSAGE);
	}
	else
	{
		table.put(name,std);
		System.out.println(table);
		Joptionpane.showMessageDialog(null,"sucessfully added city & STD code",name,Joptionpane,INFORMATION_MESSAGE);
	}
	txtname.setText(" ");
	txtstd.setText(" ");
	}
	if(ae.getSOurce()==btndelete)
	{
	String s1=JOptionPane.showInputDialog(null,"Sucessfully removed city&STD code",name,JOptionPane.INFORMATION_MESSAGE);
	}
	if(ae.getsource()=btnsearch)
	{
		String s1=JOptionPane.showInputDialog(null,"Enter city");
		if(table.containsKey(s1))
		{
		String s2="STD code:"+table.get(s1);
		JOptionPane.showMessgeDialog(null,s2);
	}
	else
	{
	JOptionPane.showMessageDialog(null,"ERROR OCCURED");
	}
        }
        }
	public static void main(String[] args)
	{
	new setC1();
        }
}
