import java.awt.*;
import java.awt.event .*;
import java.sql.*;
class  lib extends Frame implements TextListener
{
int m;
Label l1,l2,l3;
TextField t1,t2;
	
	lib()
	{
	setResizable(true);
	setBackground(new Color(155,163,255));
	setLayout(null);
	l1=new Label("Username");
	l2=new Label("password");
	l3=new Label("");
	l1.setFont(new Font("Arial Black",Font.BOLD,12));
	l1.setForeground(Color.white);
	l1.setBackground(new Color(0,9,128));
	l2.setFont(new Font("Arial Black",Font.BOLD,12));
	l2.setForeground(Color.white);
	l2.setBackground(new Color(0,9,128));
	
	t1=new TextField("");
	t2=new TextField("");
	l1.setBounds(100,100,80,30);
	l2.setBounds(100,200,80,30);
	t1.setBounds(250,100,150,30);
	t2.setBounds(250,200,150,30);
	l3.setBounds(500,500,300,30);
	add(l1);
	add(l2);
	add(l3);
	add(t1);
	add(t2);
	t2.setEchoChar('*');
	t2.addTextListener(this);
	}
	public void textValueChanged(TextEvent me)
	{
	if(me.getSource()==t2)
	{
	m++;
	if(m<5)
	l3.setText("password strength is weak");
	else if(m>4&&m<7)
	l3.setText("password strength is medium");
	else 
	l3.setText("password strength is strong");
	
	if(t1.getText().equals("sakshi")&&t2.getText().equals("sakshi123"))
	{
	libmenu l=new libmenu();
	l.setSize(1000,1000);
	l.setVisible(true);
	}
	}}
	public static void main(String arg[])
	{
	lib t=new lib();
	t.setSize(500,500);
	t.setVisible(true);
	t.setTitle("welcome to library");
	}
	}

/* class libmenu main class*/
class libmenu extends Frame implements ActionListener
{
MenuBar mb=new MenuBar();
Menu m1,m2,m3,m4,m5;
MenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12,mi13,mi14,mi15;

	libmenu()
	{
	
	m1=new Menu("Library");
	m2=new Menu("Student");	
	m3=new Menu("Book");
	m4=new Menu("catalog");
	m5=new Menu("help");

	mi1=new MenuItem("New");
	mi2=new MenuItem("Search");
	mi3=new MenuItem("Delete");
	mi4=new MenuItem("update");

	mi5=new MenuItem("New");
	mi6=new MenuItem("search");
	mi7=new MenuItem("delete");
	mi8=new MenuItem("update");

	mi9=new MenuItem("Issue");
	mi10=new MenuItem("Return");
	mi11=new MenuItem("Exit");
	mi12=new MenuItem("Authorname");
	mi13=new MenuItem("Publisher name");
	mi14=new MenuItem("Bookname");
	mi15=new MenuItem("about us");
		
	mb.add(m1);
	mb.add(m4);
	mb.add(m5);
	m1.add(m2);
	m1.add(m3);
	
	m2.add(mi1);
	m2.add(mi2);
	m2.add(mi3);
	m2.add(mi4);
	
	m3.add(mi5);
	m3.add(mi6);
	m3.add(mi7);
	m3.add(mi8);
	
	m1.add(mi9);
	m1.add(mi10);
	m1.add(mi11);
		
	m4.add(mi12);
	m4.add(mi13);
	m4.add(mi14);
	
	m5.add(mi15);
	
	setMenuBar(mb);
	mi1.addActionListener(this);
	mi2.addActionListener(this);
	mi3.addActionListener(this);
	mi4.addActionListener(this);
	mi5.addActionListener(this);
	mi6.addActionListener(this);
	mi7.addActionListener(this);
	mi8.addActionListener(this);
	mi9.addActionListener(this);
	mi10.addActionListener(this);
	mi11.addActionListener(this);
	mi12.addActionListener(this);
	mi13.addActionListener(this);
	mi14.addActionListener(this);
	mi15.addActionListener(this);
	}


	
	public void actionPerformed(ActionEvent me)
	{
	if(me.getSource()==mi1)
	{
	studentnew s=new studentnew();
	s.setSize(500,500);
	s.setVisible(true);
	s.setTitle("add new student");
	}
	
	if(me.getSource()==mi2)
	{
	ssearch s=new ssearch();
	s.setSize(500,500);
	s.setVisible(true);
	s.setTitle("search");
	}
	
	if(me.getSource()==mi3)
	{
	sdelete s=new sdelete();
	s.setSize(500,500);
	s.setVisible(true);
	s.setTitle("delete student");
	}

	if(me.getSource()==mi4)
	{
	supdate s=new supdate();
	s.setSize(500,500);
	s.setVisible(true);
	s.setTitle("update student record");
	}
	
	
	if(me.getSource()==mi5)
	{
	booknew s=new booknew();
	s.setSize(500,500);
	s.setVisible(true);
	s.setTitle("add new book");
	}
	
	if(me.getSource()==mi6)
	{
	bsearch s=new bsearch();
	s.setSize(500,500);
	s.setVisible(true);
	s.setTitle("search book record");
	}

	if(me.getSource()==mi7)
	{
	bdelete s=new bdelete();
	s.setSize(500,500);
	s.setVisible(true);
	s.setTitle("delete book record");
	}

	if(me.getSource()==mi8)
	{
	bupdate s=new bupdate();
	s.setSize(500,500);
	s.setVisible(true);
	s.setTitle("update boook record");
	}
	
	if(me.getSource()==mi9)
	{
	issue s=new issue();
	s.setSize(500,500);
	s.setVisible(true);
	s.setTitle("issue book to student");
	}
	
	if(me.getSource()==mi10)
	{
	returnn s=new returnn();
	s.setSize(500,500);
	s.setVisible(true);
	s.setTitle("issue book to student");
	}
	
	if(me.getSource()==mi11)
	{	
	System.exit(0);
	}
	
	if(me.getSource()==mi12)
	{
	author1 s=new author1();
	s.setSize(500,500);
	s.setVisible(true);
	s.setTitle("authors");
	}
	
	if(me.getSource()==mi13)
	{
	publisher s=new publisher();
	s.setSize(500,500);
	s.setVisible(true);
	s.setTitle("publishers");
	}	
	
	if(me.getSource()==mi14)
	{
	books s=new books();
	s.setSize(500,500);
	s.setVisible(true);
	s.setTitle("books");
	}
	
	if(me.getSource()==mi15)
	{
	about s=new about();
	s.setSize(500,500);
	s.setVisible(true);
	s.setTitle("state and city");
	}
	
	
	}

	}
	
	/* to add new student, studentnew class*/
	class studentnew extends Frame implements ActionListener,ItemListener
	{
	Connection con;
	Statement st;

int k,i;
Label l[]=new Label[6];
TextField t1,t2,t5;
String s[]={"Rollno","Name","address","trade","semester","no of books"};
Choice ch1,ch2;
TextArea ta;
Button b;
	
	studentnew()
	{
	setLayout(null);
	setSize(500,600);
	setBackground(new Color(155,163,255));
	Label lbl=new Label("New Student");
	lbl.setBounds(0,10,500,60);
	lbl.setFont(new Font("Arial Black",Font.BOLD,36));
	lbl.setForeground(Color.white);
	lbl.setBackground(new Color(0,9,108));
	add(lbl);
	for(i=0;i<6;i++,k++)
	{
	l[i]=new Label(s[k]);
	l[i].setBounds(100,i*50+100,70,30);
	l[i].setFont(new Font("Arial Black",Font.BOLD,12));
	l[i].setForeground(Color.white);
	l[i].setBackground(new Color(0,9,108));
	add(l[i]);
	}
	t1=new TextField("");
	t2=new TextField("");
	ta=new TextArea("");
	ch1=new Choice();
	ch2=new Choice();
	
	t5=new TextField("");
	
	b=new Button("save");

	t1.setBounds(200,100,100,30);
	t2.setBounds(200,150,100,30);
	ta.setBounds(400,200,200,100);
	ch1.setBounds(200,250,70,30);
	
	ch2.setBounds(200,300,70,30);
	
	t5.setBounds(200,350,100,30);
	
	b.setBounds(600,600,100,30);
	
	ch1.add("btech");
	ch1.add("bca");
	ch1.add("mca");
	ch1.add("mtech");
	
	ch2.add("one");
	ch2.add("two");
	ch2.add("three");
	ch2.add("four");
	ch2.add("fifth");
	ch2.add("sixth");
	ch2.add("seventh");
	ch2.add("eigth");

	
	add(t1);
	add(t2);
	add(ta);
	add(ch1);
	add(ch2);
	add(t5);
	add(b);
	b.addActionListener(this);
	ch1.addItemListener(this);
	ch2.addItemListener(this);

	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	System.out.print("Driver loaded");
	con=DriverManager.getConnection("jdbc:odbc:library");
	System.out.print("connected");
	st=con.createStatement();
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}
		
	}

	public void itemStateChanged(ItemEvent me)
	{
		if(me.getSource()==ch1)
	{
	ch2.removeAll();
	try
	{
	ResultSet rs=st.executeQuery("select semester from course where trade='"+ch1.getSelectedItem()+"'");

	while(rs.next())
	{
	ch2.add(rs.getString(1));
	}
	
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}}
	}
		public void actionPerformed(ActionEvent me)
	{

	if(me.getSource()==b)
	{
	try
	{
	st.execute("insert into student values("+t1.getText()+", ' "+t2.getText()+" ',' "+ta.getText()+" ',' "+
ch1.getSelectedItem()+"','"+ch2.getSelectedItem()+"',"+t5.getText()+")");

	
	t1.setText("");
	t2.setText("");
	ta.setText("");
	
	t5.setText("");
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}
	}
		
	}}

	/* to delete record of student, sdelete class*/

	class sdelete extends Frame implements ActionListener
	{
	Connection con;
	Statement st;
	Label l1;
	public static TextField t1=new TextField("");
	Button b;
	sdelete()
	{
	setLayout(null);
	setBackground(new Color(155,163,255));
	Label lbl=new Label("Delete Student");
	lbl.setBounds(0,10,500,60);
	lbl.setFont(new Font("Arial Black",Font.BOLD,36));
	lbl.setForeground(Color.white);
	lbl.setBackground(new Color(0,9,108));
	add(lbl);
	
	l1=new Label("rollno");
	t1=new TextField("");
	b=new Button("show");
	l1.setBounds(200,100,100,30);
	
	t1.setBounds(300,100,100,30);
	l1.setFont(new Font("Times new Roman",Font.BOLD,12));
	l1.setBackground(new Color(0,9,108));
	l1.setForeground(Color.white);
	t1.setFont(new Font("Times new Roman",Font.BOLD,12));
	t1.setForeground(new Color(0,9,108));
	b.setBounds(250,400,70,30);
	add(l1);
	add(t1);
	add(b);
	b.addActionListener(this);
	}
	

	public void actionPerformed(ActionEvent me)
	{
	if(me.getSource()==b)
	{
	sdeletem d=new sdeletem();
	d.setSize(500,500);
	d.setVisible(true);
	}
		
	}
	
	}

/* another form for deletion,class sdeletem */

class sdeletem extends Frame implements ActionListener
	{
	Connection con;
	Statement st;
	
	int k,i;
Label l[]=new Label[6];
Label l1,l2,l3,l4,l5,l6;
String s[]={"Rollno","Name","address","trade","semester","no of books"};

Button b;
	sdeletem()
	{
	setBackground(new Color(155,163,255));
	setLayout(null);
	for(i=0;i<6;i++,k++)
	{
	l[i]=new Label(s[k]);
	l[i].setBounds(100,i*50+100,100,30);
	l[i].setFont(new Font("Times new Roman",Font.BOLD,12));
	l[i].setBackground(new Color(0,9,108));
	l[i].setForeground(Color.white);
	add(l[i]);
	}
	
	l1=new Label("");
	l2=new Label("");
	l6=new Label("");
	l3=new Label("");
	l4=new Label("");
	l5=new Label("");
	
	b=new Button("delete");
	l1.setBounds(220,100,100,30);
	l2.setBounds(220,150,100,30);
	l6.setBounds(220,200,100,30);

	l3.setBounds(220,250,100,30);
	
	l4.setBounds(220,300,100,30);
	
	l5.setBounds(220,350,100,30);
	l1.setFont(new Font("Times new Roman",Font.BOLD,12));
	l1.setBackground(new Color(0,9,108));
	l1.setForeground(Color.white);
	l2.setFont(new Font("Times new Roman",Font.BOLD,12));
	l2.setBackground(new Color(0,9,108));
	l2.setForeground(Color.white);
	l3.setFont(new Font("Times new Roman",Font.BOLD,12));
	l3.setBackground(new Color(0,9,108));
	l3.setForeground(Color.white);
	l4.setFont(new Font("Times new Roman",Font.BOLD,12));
	l4.setBackground(new Color(0,9,108));
	l4.setForeground(Color.white);
	l5.setFont(new Font("Times new Roman",Font.BOLD,12));	
	l5.setBackground(new Color(0,9,108));
	l5.setForeground(Color.white);
	l6.setFont(new Font("Times new Roman",Font.BOLD,12));
	l6.setBackground(new Color(0,9,108));
	l6.setForeground(Color.white);
	b.setBounds(600,600,100,30);
	add(l1);
	add(l2);
	add(l6);
	add(l3);
	add(l4);
	add(l5);
	add(b);
	b.addActionListener(this);
	

	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	System.out.print("Driver loaded");
	con=DriverManager.getConnection("jdbc:odbc:library");
	System.out.print("connected");
	st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from student where rollno="+sdelete.t1.getText() );
	if(rs.next())
	{
	l1.setText(rs.getString(1));
	l2.setText(rs.getString(2));
	l6.setText(rs.getString(3));
	l3.setText(rs.getString(4));
	l4.setText(rs.getString(5));
	l5.setText(rs.getString(6));
	
	}
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}





	}
		
	
public void actionPerformed(ActionEvent me)
	{
		if(me.getSource()==b)
		{
			try
			{
			st.execute("delete * from student where rollno="+sdelete.t1.getText() );
			}
			catch(Exception ex)
			{
			System.out.print(ex.getMessage());
			}
		}

	}
	
	}

	/* new class ssearch for searching in stdent record*/
	
class ssearch extends Frame implements ActionListener
	{
	Connection con;
	Statement st;
	Label l1;
	public static TextField t1=new TextField("");
	Button b;
	ssearch()
	{
	setLayout(null);
	Label lbl=new Label("Search Student");
	lbl.setBounds(0,10,500,60);
	lbl.setFont(new Font("Arial Black",Font.BOLD,36));
	lbl.setForeground(Color.white);
	lbl.setBackground(new Color(0,9,108));
	add(lbl);
	setBackground(new Color(155,163,255));
	l1=new Label("rollno");
	t1=new TextField("");
	b=new Button("show");
	l1.setBounds(200,100,100,30);
	
	t1.setBounds(300,100,100,30);
	
	b.setBounds(250,400,100,30);
	add(l1);
	add(t1);
	add(b);
	b.addActionListener(this);
	}
	

	public void actionPerformed(ActionEvent me)
	{
	if(me.getSource()==b)
	{
	ssearchm d=new ssearchm();
	d.setSize(500,500);
	d.setVisible(true);
	}
		
	}
	
	}

/*new class further to ssearch */

class ssearchm extends Frame implements ActionListener
	{
	Connection con;
	Statement st;
	
	int k,i;
Label l[]=new Label[6];
Label l1,l2,l3,l4,l5,l6;
String s[]={"Rollno","Name","address","trade","semester","no of books"};

Button b;
	ssearchm()
	{
	setBackground(new Color(155,163,255));
	setLayout(null);
	for(i=0;i<6;i++,k++)
	{
	l[i]=new Label(s[k]);
	l[i].setBounds(100,i*50+100,100,30);
	l[i].setFont(new Font("Times new Roman",Font.BOLD,12));
	l[i].setBackground(new Color(0,9,108));
	l[i].setForeground(Color.white);	
	add(l[i]);
	}
	
	l1=new Label("");
	l2=new Label("");
	l6=new Label("");
	l3=new Label("");
	l4=new Label("");
	l5=new Label("");
	
	b=new Button("close");
	l1.setBounds(220,100,100,30);
	l2.setBounds(220,150,100,30);
	l6.setBounds(220,200,100,30);
	l3.setBounds(220,250,100,30);
	l4.setBounds(220,300,100,30);
	l5.setBounds(220,350,100,30);
	l1.setFont(new Font("Times new Roman",Font.BOLD,12));
	l1.setBackground(new Color(0,9,108));
	l1.setForeground(Color.white);
	l2.setFont(new Font("Times new Roman",Font.BOLD,12));
	l2.setBackground(new Color(0,9,108));
	l2.setForeground(Color.white);
	l3.setFont(new Font("Times new Roman",Font.BOLD,12));
	l3.setBackground(new Color(0,9,108));
	l3.setForeground(Color.white);
	l4.setFont(new Font("Times new Roman",Font.BOLD,12));
	l4.setBackground(new Color(0,9,108));
	l4.setForeground(Color.white);
	l5.setFont(new Font("Times new Roman",Font.BOLD,12));	
	l5.setBackground(new Color(0,9,108));
	l5.setForeground(Color.white);
	l6.setFont(new Font("Times new Roman",Font.BOLD,12));
	l6.setBackground(new Color(0,9,108));
	l6.setForeground(Color.white);
	b.setBounds(600,600,100,30);
	add(l1);
	add(l2);
	add(l6);
	add(l3);
	add(l4);
	add(l5);
	add(b);
	b.addActionListener(this);
	

	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	System.out.print("Driver loaded");
	con=DriverManager.getConnection("jdbc:odbc:library");
	System.out.print("connected");
	st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from student where rollno="+ssearch.t1.getText() );
	if(rs.next())
	{
	l1.setText(rs.getString(1));
	l2.setText(rs.getString(2));
	l6.setText(rs.getString(3));
	l3.setText(rs.getString(4));
	l4.setText(rs.getString(5));
	l5.setText(rs.getString(6));
	
	}
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}





	}
		
	
public void actionPerformed(ActionEvent me)
	{
		if(me.getSource()==b)
		{
			this.setVisible(false);
		}

	}
	}

/* new class supdate for updation*/

class supdate extends Frame implements ActionListener
	{
	Connection con;
	Statement st;
	Label l1;
	public static TextField t1=new TextField("");
	Button b;

	supdate()
	{
	Label lbl=new Label("Update Student");
lbl.setBounds(0,10,500,60);
lbl.setFont(new Font("Arial Black",Font.BOLD,36));
lbl.setForeground(Color.white);
lbl.setBackground(new Color(0,9,108));
add(lbl);
setBackground(new Color(155,163,255));
	setLayout(null);
	l1=new Label("rollno");
	t1=new TextField("");
	b=new Button("show");
	l1.setBounds(200,100,100,30);
	
	t1.setBounds(300,100,100,30);
	l1.setFont(new Font("Times new Roman",Font.BOLD,12));
l1.setBackground(new Color(0,9,108));
l1.setForeground(Color.white);
t1.setFont(new Font("Times new Roman",Font.BOLD,12));
t1.setForeground(new Color(0,9,108));
	b.setBounds(250,400,30,30);
	add(l1);
	add(t1);
	add(b);
	b.addActionListener(this);
	}
	

	public void actionPerformed(ActionEvent me)
	{
	if(me.getSource()==b)
	{
	supdatem d=new supdatem();
	d.setSize(500,500);
	d.setVisible(true);
	}
		
	}
	}
/* class supdatem further to supdate*/

class supdatem extends Frame implements ActionListener,ItemListener
	{
	Connection con;
	Statement st;
	
	int k,i;
Label l[]=new Label[6];
TextField t2,t5;
TextArea ta;
Label l1;
Choice ch1,ch2;
String s1[]={"bca","btech","mca","mtech"};
String s2[]={"one","two","three","fourth","fifth","sixth","seventh","eigth"};

String s[]={"Rollno","Name","address","trade","semester","no of books"};

Button b,b1;
	supdatem()
	{
	setBackground(new Color(155,163,255));
	setLayout(null);
	for(i=0;i<6;i++,k++)
	{
	l[i]=new Label(s[k]);
	l[i].setBounds(100,i*50+100,100,30);
	l[i].setFont(new Font("Times new Roman",Font.BOLD,12));
	l[i].setBackground(new Color(0,9,108));
	l[i].setForeground(Color.white);
	add(l[i]);
	}
	l1=new Label("");	
	t2=new TextField("");
	t3=new TextField("");
	t4=new TextField("");
	t5=new TextField("");
	ta=new TextArea("");
	ch1=new Choice();
	ch2=new Choice();
	b=new Button("update");
	b1=new Button("close");
	l1.setBounds(220,100,100,30);
	t2.setBounds(220,150,100,30);
	ta.setBounds(200,200,100,30);
	
	ch1.setBounds(300,250,100,30);
	ch2.setBounds(300,300,100,30);
	
	t5.setBounds(200,350,100,30);
	b.setBounds(500,500,100,30);
	b1.setBounds(600,500,100,30);
	
	l1.setFont(new Font("Times new Roman",Font.BOLD,12));
l1.setBackground(new Color(0,9,108));
l1.setForeground(Color.white);
	t2.setFont(new Font("Times new Roman",Font.BOLD,12));
t2.setForeground(new Color(0,9,108));
	ta.setFont(new Font("Times new Roman",Font.BOLD,12));
ta.setForeground(new Color(0,9,108));
	t5.setFont(new Font("Times new Roman",Font.BOLD,12));
t5.setForeground(new Color(0,9,108));
	add(l1);
	add(t2);
	add(ta);
	add(t5);
	add(b);
	add(b1);
	add(ch1);
	add(ch2);
	b.addActionListener(this);
	b1.addActionListener(this);
	ch1.addItemListener(this);
	ch2.addItemListener(this);	

	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	System.out.print("Driver loaded");
	con=DriverManager.getConnection("jdbc:odbc:library");
	System.out.print("connected");
	st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from student where rollno="+supdate.t1.getText() );
	if(rs.next())
	{
	l1.setText(rs.getString(1));
	t2.setText(rs.getString(2));
	ta.setText(rs.getString(3));
	ch1.add(rs.getString(4));
	ch2.add(rs.getString(5));
	t5.setText(rs.getString(6));
	
	}
	
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}
	for(i=0;i<4;i++)
	{
	
	ch1.add(s1[i]);
	}
	
	for(i=0;i<8;i++)
	{
	ch2.add(s2[i]);
	}
	}
		
public void itemStateChanged(ItemEvent me)
	{
		if(me.getSource()==ch1)
	{
	ch2.removeAll();
	try
	{
	ResultSet rs=st.executeQuery("select semester from course where trade='"+ch1.getSelectedItem()+"'");

	while(rs.next())
	{
	ch2.add(rs.getString(1));
	}
	
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}}
	}	

public void actionPerformed(ActionEvent me)
	{
		if(me.getSource()==b1)
		{
			this.setVisible(false);
		}
		if(me.getSource()==b)
		{

		try
		{
		st.execute("update student set name='"+t2.getText()+"',address='"+ta.getText()+"',trade='"
                                     +ch1.getSelectedItem()+"',semester='"+ch2.getSelectedItem()+"',nobook="+t5.getText()+"
                                      where rollno ="+l1.getText());
		}
//
		catch(Exception ex)
		{
		System.out.print(ex.getMessage());	
		}
		}
	}
	}


/* now work starts for book table*/

/* to add new book, booknew class*/
	class booknew extends Frame implements ActionListener
	{
	Connection con;
	Statement st;

int k,i;
Label l[]=new Label[6];
TextField t1,t2,t3,t4,t5;
String s[]={"bookid","name","author","publisher","cost","state"};
Choice ch;
Button b;
	booknew()
	{
	setBackground(new Color(155,163,255));
Label lbl=new Label("New Book");
lbl.setBounds(0,10,500,60);
lbl.setFont(new Font("Arial Black",Font.BOLD,36));
lbl.setForeground(Color.white);
lbl.setBackground(new Color(0,9,108));
add(lbl);
setLayout(null);
	for(i=0;i<6;i++,k++)
	{
	l[i]=new Label(s[k]);
	l[i].setBounds(100,i*50+100,100,30);
	l[i].setFont(new Font("Times new Roman",Font.BOLD,12));
	l[i].setBackground(new Color(0,9,108));
	l[i].setForeground(Color.white);
	add(l[i]);
	}
	
	t1=new TextField("");
	t2=new TextField("");
	t3=new TextField("");
	t4=new TextField("");
	t5=new TextField("");
	ch=new Choice();
	ch.add("issued");
	ch.add("not issued");
	
	b=new Button("save");
	t1.setBounds(200,100,100,30);
	t2.setBounds(200,150,100,30);
	t3.setBounds(400,200,200,100);
	t4.setBounds(200,250,30,30);
	
	t5.setBounds(200,300,30,30);
	
	t1.setFont(new Font("Times new Roman",Font.BOLD,12));
	t1.setForeground(new Color(0,9,108));
	t2.setFont(new Font("Times new Roman",Font.BOLD,12));
	t2.setForeground(new Color(0,9,108));
	t3.setFont(new Font("Times new Roman",Font.BOLD,12));
	t3.setForeground(new Color(0,9,108));
	t4.setFont(new Font("Times new Roman",Font.BOLD,12));
	t4.setForeground(new Color(0,9,108));
	t5.setFont(new Font("Times new Roman",Font.BOLD,12));
	t5.setForeground(new Color(0,9,108));
	
	ch.setBounds(200,350,100,30);
	b.setBounds(600,600,100,30);
	add(t1);
	add(t2);
	add(ch);
	add(t3);
	add(t4);
	add(t5);
	add(b);
	b.addActionListener(this);
	
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	System.out.print("Driver loaded");
	con=DriverManager.getConnection("jdbc:odbc:library");
	System.out.print("connected");
	st=con.createStatement();
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}		
	}

	public void actionPerformed(ActionEvent me)
	{
	if(me.getSource()==b)
	{
	try
	{
	st.execute("insert into book values("+t1.getText()+",'"+t2.getText()+"','"+t3.getText()+"','"+
t4.getText()+"','"+t5.getText()+"','"+ch.getSelectedItem()+"')");

	
	t1.setText("");
	t2.setText("");
	t3.setText("");
	t4.setText("");
	t5.setText("");
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}
	}
		
	}}

/* to delete record of book, bdelete class*/
	class bdelete extends Frame implements ActionListener
	{
	Connection con;
	Statement st;
	Label l1;
	public static TextField t1=new TextField("");
	Button b;
	bdelete()
	{
	setLayout(null);
	setBackground(new Color(155,163,255));
Label lbl=new Label("Search Book");
lbl.setBounds(0,10,500,60);
lbl.setFont(new Font("Arial Black",Font.BOLD,36));
lbl.setForeground(Color.white);
lbl.setBackground(new Color(0,9,108));
add(lbl);
	l1=new Label("bookno");
	t1=new TextField("");
	b=new Button("show");
	l1.setBounds(200,100,100,30);
	
	t1.setBounds(300,100,100,30);
	l1.setFont(new Font("Times new Roman",Font.BOLD,12));
l1.setBackground(new Color(0,9,108));
l1.setForeground(Color.white);
t1.setFont(new Font("Times new Roman",Font.BOLD,12));
t1.setForeground(new Color(0,9,108));

	b.setBounds(250,400,30,30);
	add(l1);
	add(t1);
	add(b);
	b.addActionListener(this);
	}
	

	public void actionPerformed(ActionEvent me)
	{
	if(me.getSource()==b)
	{
	bdeletem d=new bdeletem();
	d.setSize(500,500);
	d.setVisible(true);
	}
		
	}
	
	}

/* another form for deletion,class sdeletem */

class bdeletem extends Frame implements ActionListener
	{
	Connection con;
	Statement st;
	
	int k,i;
Label l[]=new Label[6];
Label l1,l2,l3,l4,l5,l6;
String s[]={"book id","Name","author","publisher","cost","status"};

Button b;
	bdeletem()
	{
setLayout(null);
	setBackground(new Color(155,163,255));
	for(i=0;i<6;i++,k++)
	{
	l[i]=new Label(s[k]);
	l[i].setBounds(100,i*50+100,100,30);
	l[i].setFont(new Font("Times new Roman",Font.BOLD,12));
l[i].setBackground(new Color(0,9,108));
l[i].setForeground(Color.white);
	add(l[i]);
	}
	
	l1=new Label("");
	l2=new Label("");
	l6=new Label("");
	l3=new Label("");
	l4=new Label("");
	l5=new Label("");
	l1.setFont(new Font("Times new Roman",Font.BOLD,12));
l1.setBackground(new Color(0,9,108));
l1.setForeground(Color.white);
l2.setFont(new Font("Times new Roman",Font.BOLD,12));
l2.setBackground(new Color(0,9,108));
l2.setForeground(Color.white);
l3.setFont(new Font("Times new Roman",Font.BOLD,12));
l3.setBackground(new Color(0,9,108));
l3.setForeground(Color.white);
l4.setFont(new Font("Times new Roman",Font.BOLD,12));
l4.setBackground(new Color(0,9,108));
l4.setForeground(Color.white);
l5.setFont(new Font("Times new Roman",Font.BOLD,12));
l5.setBackground(new Color(0,9,108));
l5.setForeground(Color.white);
l6.setFont(new Font("Times new Roman",Font.BOLD,12));
l6.setBackground(new Color(0,9,108));
l6.setForeground(Color.white);
	b=new Button("delete");
	l1.setBounds(200,100,100,30);
	l2.setBounds(200,150,30,30);
	l6.setBounds(200,200,100,30);
	
	l3.setBounds(200,250,30,30);
	
	l4.setBounds(200,300,30,30);
	
	l5.setBounds(200,350,100,30);
	
	b.setBounds(600,600,100,30);
	add(l1);
	add(l2);
	add(l6);
	add(l3);
	add(l4);
	add(l5);
	add(b);
	b.addActionListener(this);
	

	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	System.out.print("Driver loaded");
	con=DriverManager.getConnection("jdbc:odbc:library");
	System.out.print("connected");
	st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from book where bookid="+bdelete.t1.getText() );
	if(rs.next())
	{
	l1.setText(rs.getString(1));
	l2.setText(rs.getString(2));
	l6.setText(rs.getString(3));
	l3.setText(rs.getString(4));
	l4.setText(rs.getString(5));
	l5.setText(rs.getString(6));
	
	}
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}





	}
		
	
public void actionPerformed(ActionEvent me)
	{
		if(me.getSource()==b)
		{
			try
			{
			st.execute("delete * from book where bookid="+bdelete.t1.getText() );
			}
			catch(Exception ex)
			{
			System.out.print(ex.getMessage());
			}
		}

	}
	
	}

/* new class bsearch for searching in book record*/
	
class bsearch extends Frame implements ActionListener
	{
	Connection con;
	Statement st;
	Label l1;
	public static TextField t1=new TextField("");
	Button b;
	bsearch()
	{
	setLayout(null);
	setBackground(new Color(155,163,255));
Label lbl=new Label("Search Book");
lbl.setBounds(0,10,500,60);
lbl.setFont(new Font("Arial Black",Font.BOLD,36));
lbl.setForeground(Color.white);
lbl.setBackground(new Color(0,9,108));
add(lbl);

	l1=new Label("book id");
	t1=new TextField("");
	b=new Button("show");
	l1.setBounds(200,100,100,30);
	t1.setBounds(300,100,100,30);
	
l1.setFont(new Font("Times new Roman",Font.BOLD,12));
l1.setBackground(new Color(0,9,108));
l1.setForeground(Color.white);
t1.setFont(new Font("Times new Roman",Font.BOLD,12));
t1.setForeground(new Color(0,9,108));

	b.setBounds(250,400,30,30);
	add(l1);
	add(t1);
	add(b);
	b.addActionListener(this);
	}
	

	public void actionPerformed(ActionEvent me)
	{
	if(me.getSource()==b)
	{
	bsearchm d=new bsearchm();
	d.setSize(500,500);
	d.setVisible(true);
	}
		
	}
	
	}

/*new class further to ssearch */

class bsearchm extends Frame implements ActionListener
	{
	Connection con;
	Statement st;
	
	int k,i;
Label l[]=new Label[6];
Label l1,l2,l3,l4,l5,l6;
String s[]={"book id","Name","author","publisher","cost","status"};

Button b;
	bsearchm()
	{
	setLayout(null);
	
	setBackground(new Color(155,163,255));
	for(i=0;i<6;i++,k++)
	{
	l[i]=new Label(s[k]);
	l[i].setBounds(100,i*50+100,100,30);
	l[i].setFont(new Font("Times new Roman",Font.BOLD,12));
	l[i].setBackground(new Color(0,9,108));
	l[i].setForeground(Color.white);
	add(l[i]);
	}
	
	l1=new Label("");
	l2=new Label("");
	l6=new Label("");
	l3=new Label("");
	l4=new Label("");
	l5=new Label("");
	
	b=new Button("close");
	
	l1.setBounds(220,100,100,30);
	l2.setBounds(220,150,30,30);
	l6.setBounds(220,200,100,30);
	l3.setBounds(220,250,30,30);
	l4.setBounds(220,300,30,30);
	l5.setBounds(220,350,100,30);
	l1.setFont(new Font("Times new Roman",Font.BOLD,12));
l1.setBackground(new Color(0,9,108));
l1.setForeground(Color.white);
l2.setFont(new Font("Times new Roman",Font.BOLD,12));
l2.setBackground(new Color(0,9,108));
l2.setForeground(Color.white);
l3.setFont(new Font("Times new Roman",Font.BOLD,12));
l3.setBackground(new Color(0,9,108));
l3.setForeground(Color.white);
l4.setFont(new Font("Times new Roman",Font.BOLD,12));
l4.setBackground(new Color(0,9,108));
l4.setForeground(Color.white);
l5.setFont(new Font("Times new Roman",Font.BOLD,12));
l5.setBackground(new Color(0,9,108));
l5.setForeground(Color.white);
l6.setFont(new Font("Times new Roman",Font.BOLD,12));
l6.setBackground(new Color(0,9,108));
l6.setForeground(Color.white);

	b.setBounds(600,600,100,30);
	add(l1);
	add(l2);
	add(l6);
	add(l3);
	add(l4);
	add(l5);
	add(b);
	b.addActionListener(this);
	

	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	System.out.print("Driver loaded");
	con=DriverManager.getConnection("jdbc:odbc:library");
	System.out.print("connected");
	st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from book where bookid="+bsearch.t1.getText() );
	if(rs.next())
	{
	l1.setText(rs.getString(1));
	l2.setText(rs.getString(2));
	l6.setText(rs.getString(3));
	l3.setText(rs.getString(4));
	l4.setText(rs.getString(5));
	l5.setText(rs.getString(6));
	
	}
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}





	}
		
	
public void actionPerformed(ActionEvent me)
	{
		if(me.getSource()==b)
		{
			this.setVisible(false);
		}

	}
	}

/* new class bupdate for updation*/

class bupdate extends Frame implements ActionListener
	{
	Connection con;
	Statement st;
	Label l1;
	public static TextField t1=new TextField("");
	Button b;
	bupdate()
	{
	setBackground(new Color(155,163,255));
Label lbl=new Label("update Book");
lbl.setBounds(0,10,500,60);
lbl.setFont(new Font("Arial Black",Font.BOLD,36));
lbl.setForeground(Color.white);
lbl.setBackground(new Color(0,9,108));
add(lbl);
	setLayout(null);
	l1=new Label("book id");
	t1=new TextField("");
	b=new Button("show");
	l1.setBounds(200,100,100,30);
	
	t1.setBounds(300,100,100,30);
	l1.setFont(new Font("Times new Roman",Font.BOLD,12));
l1.setBackground(new Color(0,9,108));
l1.setForeground(Color.white);
t1.setFont(new Font("Times new Roman",Font.BOLD,12));
t1.setForeground(new Color(0,9,108));
	b.setBounds(250,400,30,30);
	add(l1);
	add(t1);
	add(b);
	b.addActionListener(this);
	}
	

	public void actionPerformed(ActionEvent me)
	{
	if(me.getSource()==b)
	{
	bupdatem d=new bupdatem();
	d.setSize(500,500);
	d.setVisible(true);
	}
		
	}
	}
/* class bupdatem further to bupdate*/

class bupdatem extends Frame implements ActionListener
	{
	Connection con;
	Statement st;
	
	int k,i;
Label l[]=new Label[6];
TextField t2,t3,t4,t5,t6;
Label l1;
String s[]={"book id","Name","author","publisher","cost","status"};

Button b,b1;
	bupdatem()
	{
	setBackground(new Color(155,163,255));
setLayout(null);
	for(i=0;i<6;i++,k++)
	{
	l[i]=new Label(s[k]);
	l[i].setBounds(100,i*50+100,100,30);
	l[i].setFont(new Font("Times new Roman",Font.BOLD,12));
l[i].setBackground(new Color(0,9,108));
l[i].setForeground(Color.white);
	add(l[i]);
	}
	l1=new Label("");	
	t2=new TextField("");
	t3=new TextField("");
	t4=new TextField("");
	t5=new TextField("");
	t6=new TextField("");
	b=new Button("update");
	b1=new Button("close");
	l1.setBounds(200,100,100,30);
	t2.setBounds(200,150,30,30);
	t3.setBounds(200,200,100,30);
	
	t4.setBounds(200,250,30,30);
	
	t5.setBounds(200,300,30,30);
	
	t6.setBounds(200,350,100,30);
	b.setBounds(500,500,100,30);
	b1.setBounds(600,500,100,30);
	add(l1);
	add(t2);
	add(t3);
	add(t6);
	add(t4);
	add(t5);
	add(b);
	add(b1);
	
	b.addActionListener(this);
	b1.addActionListener(this);
	
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	System.out.print("Driver loaded");
	con=DriverManager.getConnection("jdbc:odbc://dmrc/library");
	System.out.print("connected");
	st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from book where bookid="+bupdate.t1.getText() );
	if(rs.next())
	{
	l1.setText(rs.getString(1));
	t2.setText(rs.getString(2));
	t3.setText(rs.getString(3));
	t4.setText(rs.getString(4));
	t5.setText(rs.getString(5));
	t6.setText(rs.getString(6));
	
	}
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}





	}
		
	
public void actionPerformed(ActionEvent me)
	{
		if(me.getSource()==b1)
		{
			this.setVisible(false);
		}
		if(me.getSource()==b)
		{

		try
		{
	st.execute("update book set name='"+t2.getText()+"',author='"+t3.getText()+"',publisher='"+t4.getText()+"',cost="+t5.getText()+",status='"+t6.getText()+"' where bookid="+l1.getText());	
		}
		catch(Exception ex)
		{
		System.out.print(ex.getMessage());	
		}
		}
	}
	}

/* to issue a book ,class issue*/

class issue extends Frame implements ActionListener,ItemListener,FocusListener
{
int c;
Connection con;
Statement st;
int k,i;
Label l[]=new Label[12];
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
Choice ch1,ch2,ch3,ch4,ch5,ch6;

String s[]={"Rollno","Name","address","trade","semester","no of books","book id","Name","author","publisher","cost","status"};
TextArea ta;

Button b,b1,b2;
	issue()
	{
	setBackground(new Color(155,163,255));
setLayout(null);
	Label lbl=new Label("Issue Book");
lbl.setBounds(0,10,500,60);
lbl.setFont(new Font("Arial Black",Font.BOLD,36));
lbl.setForeground(Color.white);
lbl.setBackground(new Color(0,9,108));
add(lbl);
	ch1=new Choice();
	ch2=new Choice();
	ch3=new Choice();
	ch4=new Choice();
	ch5=new Choice();
	ch6=new Choice();
	for(i=1;i<13;i++)
	{
	ch2.add(""+i);
	ch5.add(""+i);
	}

	for(i=1;i<32;i++)
	{
	ch1.add(""+i);
	ch4.add(""+i);
	}
	
	for(i=2005;i<2011;i++)
	{
	ch3.add(""+i);
	ch6.add(""+i);
	}


	for(i=0;i<6;i++,k++)
	{
	l[i]=new Label(s[k]);
	l[i].setBounds(100,i*40+100,100,30);
	l[i].setFont(new Font("Times new Roman",Font.BOLD,12));
	l[i].setBackground(new Color(0,9,108));
	l[i].setForeground(Color.white);
	add(l[i]);
	}
	
	for(i=6;i<12;i++,k++)
	{
	l[i]=new Label(s[k]);
	l[i].setBounds(100,i*40+100,100,30);
	l[i].setFont(new Font("Times new Roman",Font.BOLD,12));
	l[i].setBackground(new Color(0,9,108));
	l[i].setForeground(Color.white);
	add(l[i]);
	}

	t1=new TextField("");
	t2=new TextField("");
	ta=new TextArea("");
	t3=new TextField("");
	t4=new TextField("");
	t5=new TextField("");
	t6=new TextField("");
	t7=new TextField("");
	t8=new TextField("");
	t9=new TextField("");
	t10=new TextField("");
	t11=new TextField("");
	b=new Button("show");
	b1=new Button("show");
	b2=new Button("issue");
	
	t1.setBounds(200,100,100,30);
	t2.setBounds(200,140,100,30);
	ta.setBounds(400,180,200,30);
	t3.setBounds(200,220,100,30);
	
	t4.setBounds(200,260,100,30);
	
	t5.setBounds(200,300,100,30);
	t6.setBounds(200,340,100,30);
	t7.setBounds(200,380,100,30);
	t8.setBounds(400,420,200,30);
	t9.setBounds(200,460,100,30);
	
	t10.setBounds(200,500,100,30);
	t11.setBounds(200,540,100,30);
	
	t1.setFont(new Font("Times new Roman",Font.BOLD,12));
t1.setForeground(new Color(0,9,108));
t2.setFont(new Font("Times new Roman",Font.BOLD,12));
t2.setForeground(new Color(0,9,108));
t3.setFont(new Font("Times new Roman",Font.BOLD,12));
t3.setForeground(new Color(0,9,108));
t4.setFont(new Font("Times new Roman",Font.BOLD,12));
t4.setForeground(new Color(0,9,108));
t5.setFont(new Font("Times new Roman",Font.BOLD,12));
t5.setForeground(new Color(0,9,108));
t6.setFont(new Font("Times new Roman",Font.BOLD,12));
t6.setForeground(new Color(0,9,108));
t7.setFont(new Font("Times new Roman",Font.BOLD,12));
t7.setForeground(new Color(0,9,108));
t8.setFont(new Font("Times new Roman",Font.BOLD,12));
t8.setForeground(new Color(0,9,108));
t9.setFont(new Font("Times new Roman",Font.BOLD,12));
t9.setForeground(new Color(0,9,108));
t10.setFont(new Font("Times new Roman",Font.BOLD,12));
t10.setForeground(new Color(0,9,108));
ta.setFont(new Font("Times new Roman",Font.BOLD,12));
ta.setForeground(new Color(0,9,108));
	b.setBounds(500,100,100,30);
	b1.setBounds(500,500,100,30);
	
	b2.setBounds(700,700,100,30);
	add(t1);
	add(t2);
	add(ta);
	add(t3);
	add(t4);
	add(t5);
	add(b);
	add(t6);
	add(t7);
	add(t8);
	add(t9);
	add(t10);
	add(t11);
	add(b1);
	add(b2);	
	b.addActionListener(this);
	b1.addActionListener(this);
	ch1.addItemListener(this);
	ch2.addItemListener(this);
	ch3.addItemListener(this);
	ch4.addItemListener(this);
	ch5.addItemListener(this);
	ch6.addItemListener(this);
	ch1.setBounds(250,550,40,30);
	
	ch2.setBounds(310,550,40,30);
	ch3.setBounds(360,550,40,30);
	ch4.setBounds(250,600,40,30);
	ch5.setBounds(310,600,40,30);
	ch6.setBounds(360,600,40,30);
	add(ch1);
	add(ch2);
	add(ch3);
	add(ch4);
	add(ch5);
	add(ch6);
	b2.addActionListener(this);
	t1.addFocusListener(this);
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	System.out.print("Driver loaded");
	con=DriverManager.getConnection("jdbc:odbc:library");
	System.out.print("connected");
	st=con.createStatement();
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}		
	}

	public void itemStateChanged(ItemEvent me)
	{
	String str;
	k=0;
	String s[]={"1","2","3","4","5","6","7","8","9","10","11","12"};
	
	if(me.getSource()==ch2)
{
if(ch2.getSelectedItem().equals("1")||ch2.getSelectedItem().equals("3")||ch2.getSelectedItem().equals("5")||ch2.getSelectedItem().equals("7")||ch2.getSelectedItem().equals("8")||ch2.getSelectedItem().equals("10")||ch2.getSelectedItem().equals("12"))
{	
	ch1.removeAll();
	for(k=1;k<=31;k++)
	{
	ch1.add(""+k);
	}
}

	else if(ch2.getSelectedItem().equals("2"))
	{
	if(Integer.parseInt(ch3.getSelectedItem())%4==0)
	{
	ch1.removeAll();
	for(k=1;k<=29;k++)
	{
	ch1.add(""+k);
	}}
	else
	{
	ch1.removeAll();
	for(k=1;k<=28;k++)
	{
	ch1.add(""+k);
	}
	}
	}
	else
	{
	ch1.removeAll();
	for(k=1;k<=30;k++)
	{
	ch1.add(""+k);
	}
	}
	}

		if(me.getSource()==ch5)
{
if(ch5.getSelectedItem().equals("1")||ch5.getSelectedItem().equals("3")||ch5.getSelectedItem().equals("5")||ch5.getSelectedItem().equals("7")||ch5.getSelectedItem().equals("8")||ch5.getSelectedItem().equals("10")||ch5.getSelectedItem().equals("12"))
{	
	ch4.removeAll();
	for(k=1;k<=31;k++)
	{
	ch4.add(""+k);
	}
}

	else if(ch5.getSelectedItem().equals("2"))
	{
	if(Integer.parseInt(ch6.getSelectedItem())%4==0)
	{
	ch4.removeAll();
	for(k=1;k<=29;k++)
	{
	ch4.add(""+k);
	}}
	else
	{
	ch4.removeAll();
	for(k=1;k<=28;k++)
	{
	ch4.add(""+k);
	}
	}
	}
	else
	{
	ch4.removeAll();
	for(k=1;k<=30;k++)
	{
	ch4.add(""+k);
	}
	}
	}

	}
	public void actionPerformed(ActionEvent me)
	{

	if(me.getSource()==b2)     /* issue button */
	{
	c=Integer.parseInt(t5.getText());
	
	if(c<2&& t11.getText().equals("not issued"))
	{
	int inc=Integer.parseInt(t5.getText());
	inc++;
	t5.setText(""+inc);
	String chs=ch1.getSelectedItem()+"/"+ch2.getSelectedItem()+"/"+ch3.getSelectedItem();
 
String chs1=ch3.getSelectedItem()+"/"+ch4.getSelectedItem()+"/"+ch5.getSelectedItem();
	String s1="issued";
	try
	{
	st.execute("insert into issueb values("+t1.getText()+","+t6.getText()+",'"+chs+"','"+chs1+"')");
	st.execute("update student set nobook="+inc+" where rollno ="+t1.getText());
	st.execute("update book set status='"+s1+"' where bookid="+t6.getText());
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}
	}
	else
	System.out.print("i am here");
	}
	if(me.getSource()==b)    /* button for showing record of student */
	{
	try
	{
	ResultSet rs=st.executeQuery("select * from student where rollno="+t1.getText());
	if(rs.next())
	{
	t2.setText(rs.getString(2));
	ta.setText(rs.getString(3));
	t3.setText(rs.getString(4));
	t4.setText(rs.getString(5));
	t5.setText(rs.getString(6));
	}
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}
	}
	if(me.getSource()==b1)   
	{
	try
	{
	ResultSet rs=st.executeQuery("select * from book where bookid="+t6.getText());
	if(rs.next())
	{
	t7.setText(rs.getString(2));
	t8.setText(rs.getString(3));
	t9.setText(rs.getString(4));
	t10.setText(rs.getString(5));
	t11.setText(rs.getString(6));
	
	
	}
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}
	}	
	}
	public void focusGained(FocusEvent me)
	{} 
	public void focusLost(FocusEvent me)
	{
	if(me.getSource()==t1)
	{
	try
	{
	ResultSet rs=st.executeQuery("select * from student where rollno="+t1.getText());
	if(rs.next())
	{
	t2.setText(rs.getString(2));
	ta.setText(rs.getString(3));
	t3.setText(rs.getString(4));
	t4.setText(rs.getString(5));
	t5.setText(rs.getString(6));
	
	
	}
	
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}
	}
	}
}

class about extends Frame implements ActionListener
{
Label l1,l2,l3;
about()
{
setBackground(new Color(155,163,255));

l1=new Label("MADE BY:");
l2=new Label("JYOTI GARG");
l3=new Label("");
l1.setBounds(100,50,100,50);
l2.setBounds(300,200,100,50);
l3.setBounds(300,300,100,50);
setLayout(null);
add (l1);
add (l2);
add (l3);
}
public void actionPerformed(ActionEvent me)
{
}
}
class returnn extends Frame implements ActionListener
{
	int c,x;
Connection con;
Statement st;
int k,i;
Label l[]=new Label[2];
TextField t1,t2,t3,t4;
Label l1;
Checkbox ch1,ch2;
String s[]={"",""};
Button b1,b2;
	
	returnn()
	{
	setLayout(null);
	setBackground(new Color(155,163,255));
Label lbl=new Label("Return Book");
lbl.setBounds(0,10,500,60);
lbl.setFont(new Font("Arial Black",Font.BOLD,36));
lbl.setForeground(Color.white);
lbl.setBackground(new Color(0,9,108));
add(lbl);
	for(i=0;i<2;i++,k++)
	{
	l[i]=new Label(s[k]);
	l[i].setBounds(300,i*60+300,50,30);
	l[i].setFont(new Font("Times new Roman",Font.BOLD,12));
l[i].setBackground(new Color(0,9,108));
l[i].setForeground(Color.white);
	add(l[i]);
	}
	ch1=new Checkbox("");
	ch2=new Checkbox("");
	
	t1=new TextField("");
	t2=new TextField("");
	t3=new TextField("");
	t4=new TextField("");
	
	b1=new Button("show");
	b2=new Button("return");
	t1.setBounds(200,100,100,30);
	t2.setBounds(300,200,50,30);
	t3.setBounds(360,200,50,30);
	t4.setBounds(420,200,50,30);	

	b1.setBounds(370,300,100,30);
	b2.setBounds(490,300,100,30);
	ch1.setBounds(250,300,50,30);
	ch2.setBounds(250,360,50,30);
	add(t1);
	add(t2);
	add(t3);
	add(t4);
	
	add(b1);
	add(b2);	
	add(ch1);
	add(ch2);	
	b1.addActionListener(this);
	b2.addActionListener(this);
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	System.out.print("Driver loaded");
	con=DriverManager.getConnection("jdbc:odbc:library");
	System.out.print("connected");
	st=con.createStatement();
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}		
	}
public void actionPerformed(ActionEvent me)
{
	if(me.getSource()==b1)
	{
	l[0].setText("");
	l[1].setText("");
	x=0;
	try
	{
ResultSet rs=st.executeQuery("select bookid from issueb where rollno="+t1.getText());
	while(rs.next())
	{
	l[x].setText(rs.getString(1));
	
	x++;
	}
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}
	 
	}

	if(me.getSource()==b2)
	{
	String s0=l[0].getText();
	String s1=l[1].getText();
	if(ch1.getState()&&s0!="")
	{
		try
		{
		st.execute("delete * from issueb where rollno="+t1.getText()+"and bookid="+Integer.parseInt(l[0].getText()));
		st.execute("update student set nobook=(nobook-1) where rollno ="+t1.getText());
		st.execute("update book set status='"+"not issued"+"' where bookid="+Integer.parseInt(l[0].getText()));
		}
		catch(Exception ex)
		{
		System.out.print(ex.getMessage());
		}
	}
	
	if(ch2.getState()&&s1!="")
	{
		try
		{
		st.execute("delete * from issueb where rollno="+t1.getText()+"and bookid="+Integer.parseInt(l[1].getText()));
		st.execute("update student set nobook=(nobook-1) where rollno ="+t1.getText());
		st.execute("update book set status='"+"not issued"+"' where bookid="+Integer.parseInt(l[1].getText()));
		}
		catch(Exception ex)
		{
		System.out.print(ex.getMessage());
		}
	}
	
	}
}

}
	
	
class author1 extends Frame implements ActionListener,ItemListener
{
	Connection con;
	Statement st;
Label l;
public static Choice ch=new Choice();

	Button b;
	
	author1()
	{
	setLayout(null);
	setBackground(new Color(155,163,255));
Label lbl=new Label("Author");
lbl.setBounds(0,10,500,60);
lbl.setFont(new Font("Arial Black",Font.BOLD,36));
lbl.setForeground(Color.white);
lbl.setBackground(new Color(0,9,108));
add(lbl);	
	l=new Label("author name");
	b=new Button("show");
	ch=new Choice();
	l.setBounds(200,200,70,30);
	ch.setBounds(300,200,100,30);
	b.setBounds(250,300,50,30);
	l.setFont(new Font("Times new Roman",Font.BOLD,12));
l.setBackground(new Color(0,9,108));
l.setForeground(Color.white);
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	System.out.print("Driver loaded");
	con=DriverManager.getConnection("jdbc:odbc:library");
	System.out.print("connected");
	st=con.createStatement();
	ResultSet rs=st.executeQuery("select distinct author from book");
	
	while(rs.next())
	{
	ch.add(""+rs.getString(1));
	}
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}

	add(l);
	add(ch);
	add(b);
	b.addActionListener(this);
	ch.addItemListener(this);
	
	}

	public void actionPerformed(ActionEvent me)
	{
	if(me.getSource()==b)
	{
	authorm d=new authorm();
	d.setSize(1000,1000);
	d.setLocation(100,100);
	d.setVisible(true);
	}
	}
	
	public void itemStateChanged(ItemEvent me)
	{
	}

		
}

class authorm extends Frame implements ActionListener
{
	int m;
	Connection con;
	Statement st;
	int k,i;
Label l[]=new Label[5];
Label l1,l2,l3,l4,l5;
String s[]={"book id","Name","author","publisher","cost"};

Button b1,b2,b3,b4;
	
	authorm()
	{
	setBackground(new Color(155,163,255));
	setLayout(null);
	for(i=0;i<5;i++,k++)
	{
	l[i]=new Label(s[k]);
	l[i].setBounds(100,i*50+100,100,30);
	l[i].setFont(new Font("Times new Roman",Font.BOLD,12));
l[i].setBackground(new Color(0,9,108));
l[i].setForeground(Color.white);
	add(l[i]);
	}
	
	l1=new Label("");
	l2=new Label("");
	l3=new Label("");
	l4=new Label("");
	l5=new Label("");
	
	b1=new Button("first");
	b2=new Button("next");
	b3=new Button("previous");
	b4=new Button("last");
	
	l1.setBounds(220,100,100,30);
	l2.setBounds(220,150,30,30);
	l3.setBounds(220,200,100,30);
	
	l4.setBounds(220,250,30,30);
	
	l5.setBounds(220,300,30,30);
	
	l1.setFont(new Font("Times new Roman",Font.BOLD,12));
l1.setBackground(new Color(0,9,108));
l1.setForeground(Color.white);
l2.setFont(new Font("Times new Roman",Font.BOLD,12));
l2.setBackground(new Color(0,9,108));
l2.setForeground(Color.white);
l3.setFont(new Font("Times new Roman",Font.BOLD,12));
l3.setBackground(new Color(0,9,108));
l3.setForeground(Color.white);
l4.setFont(new Font("Times new Roman",Font.BOLD,12));
l4.setBackground(new Color(0,9,108));
l4.setForeground(Color.white);
l5.setFont(new Font("Times new Roman",Font.BOLD,12));
l5.setBackground(new Color(0,9,108));
l5.setForeground(Color.white);
	b1.setBounds(200,500,50,30);
	b2.setBounds(260,500,50,30);
	b3.setBounds(320,500,50,30);
	b4.setBounds(380,500,50,30);
	
	add(l1);
	add(l2);
	add(l3);
	add(l4);
	add(l5);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	add(b3);
	add(b2);
	add(b4);
	add(b1);
	
	try
	{

	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	System.out.print("Driver loaded");
	con=DriverManager.getConnection("jdbc:odbc:library");
	System.out.print("connected");
	st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from book where author='"+author1.ch.getSelectedItem()+"'");
	
	if(rs.next())
	{
	l1.setText(rs.getString(1));
	l2.setText(rs.getString(2));
	l3.setText(rs.getString(3));
	l4.setText(rs.getString(4));
	l5.setText(rs.getString(5));
	}

	
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}
}
		
	
public void actionPerformed(ActionEvent me)
	{
	
	if(me.getSource()==b4)
	{
	m=0;
	try
	{
	ResultSet rs=st.executeQuery("select * from book where author='"+author1.ch.getSelectedItem()+"'");
	
	while(rs.next())
	{
	l1.setText(rs.getString(1));
	l2.setText(rs.getString(2));
	l3.setText(rs.getString(3));
	l4.setText(rs.getString(4));
	l5.setText(rs.getString(5));
	m++;
	}
	m=m-1;
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}	
	}

	if(me.getSource()==b3)
	{
	if(m>0)
	m--;
	try
	{
	ResultSet rs=st.executeQuery("select * from book where author='"+author1.ch.getSelectedItem()+"'");
	for(int i=0;i<m;i++)
	{
	rs.next();
	}
	if(rs.next())
	{
	l1.setText(rs.getString(1));
	l2.setText(rs.getString(2));
	l3.setText(rs.getString(3));
	l4.setText(rs.getString(4));
	l5.setText(rs.getString(5));
	}
	
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}	
	}


if(me.getSource()==b1)
	{
	m=0;
	try
	{
	ResultSet rs=st.executeQuery("select * from book where author='"+author1.ch.getSelectedItem()+"'");
	
	if(rs.next())
	{
	l1.setText(rs.getString(1));
	l2.setText(rs.getString(2));
	l3.setText(rs.getString(3));
	l4.setText(rs.getString(4));
	l5.setText(rs.getString(5));
	}
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}	
	
}

	if(me.getSource()==b2)
	{
	m++;
	try
	{
	ResultSet rs=st.executeQuery("select * from book where author='"+author1.ch.getSelectedItem()+"'");
	for(int i=0;i<m;i++)
	{
	rs.next();
	}
	if(rs.next())
	{
	l1.setText(rs.getString(1));
	l2.setText(rs.getString(2));
	l3.setText(rs.getString(3));
	l4.setText(rs.getString(4));
	l5.setText(rs.getString(5));
	}
	else
	m--;
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}	
	}
}
		}

class publisher extends Frame implements ActionListener
{
	Connection con;
	Statement st;
Label l;
public static Choice ch=new Choice();

	Button b;
	
	publisher()
	{	
	setLayout(null);
	setBackground(new Color(155,163,255));
	Label lbl=new Label("Publisher");
lbl.setBounds(0,10,500,60);
lbl.setFont(new Font("Arial Black",Font.BOLD,36));
lbl.setForeground(Color.white);
lbl.setBackground(new Color(0,9,108));
add(lbl);
	l=new Label("publisher name");
	b=new Button("show");
	ch=new Choice();
	l.setBounds(200,200,70,30);
	ch.setBounds(300,200,100,30);
	b.setBounds(250,300,50,30);
	l.setFont(new Font("Times new Roman",Font.BOLD,12));
l.setBackground(new Color(0,9,108));
l.setForeground(Color.white);
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	System.out.print("Driver loaded");
	con=DriverManager.getConnection("jdbc:odbc:library");
	System.out.print("connected");
	st=con.createStatement();
	ResultSet rs=st.executeQuery("select distinct publisher from book");
	
	while(rs.next())
	{
	ch.add(""+rs.getString(1));
	}
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}

	add(l);
	add(ch);
	add(b);
	b.addActionListener(this);
	}

	public void actionPerformed(ActionEvent me)
	{
	if(me.getSource()==b)
	{
	publisherm d=new publisherm();
	d.setSize(1000,1000);
	d.setLocation(100,100);
	d.setVisible(true);
	}}
	
	}

class publisherm extends Frame implements ActionListener
{
int m;
	Connection con;
	Statement st;
	int k,i;
Label l[]=new Label[5];
Label l1,l2,l3,l4,l5;
String s[]={"book id","Name","author","publisher","cost"};

Button b1,b2,b3,b4;
	
	publisherm()
	{
	setLayout(null);
	setBackground(new Color(155,163,255));
	for(i=0;i<5;i++,k++)
	{
	l[i]=new Label(s[k]);
	l[i].setBounds(100,i*50+100,100,30);
	l[i].setFont(new Font("Times new Roman",Font.BOLD,12));
l[i].setBackground(new Color(0,9,108));
l[i].setForeground(Color.white);
	add(l[i]);
	}
	
	l1=new Label("");
	l2=new Label("");
	l3=new Label("");
	l4=new Label("");
	l5=new Label("");
	
	b1=new Button("first");
	b2=new Button("next");
	b3=new Button("previous");
	b4=new Button("last");
	
	l1.setBounds(220,100,100,30);
	l2.setBounds(220,150,30,30);
	l3.setBounds(220,200,100,30);
	
	l4.setBounds(220,250,30,30);
	
	l5.setBounds(220,300,30,30);
	l1.setFont(new Font("Times new Roman",Font.BOLD,12));
l1.setBackground(new Color(0,9,108));
l1.setForeground(Color.white);
l2.setFont(new Font("Times new Roman",Font.BOLD,12));
l2.setBackground(new Color(0,9,108));
l2.setForeground(Color.white);
l3.setFont(new Font("Times new Roman",Font.BOLD,12));
l3.setBackground(new Color(0,9,108));
l3.setForeground(Color.white);
l4.setFont(new Font("Times new Roman",Font.BOLD,12));
l4.setBackground(new Color(0,9,108));
l4.setForeground(Color.white);
l5.setFont(new Font("Times new Roman",Font.BOLD,12));
l5.setBackground(new Color(0,9,108));
l5.setForeground(Color.white);
	b1.setBounds(200,500,50,30);
	b2.setBounds(260,500,50,30);
	b3.setBounds(320,500,50,30);
	b4.setBounds(380,500,50,30);
	
	add(l1);
	add(l2);
	add(l3);
	add(l4);
	add(l5);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	add(b3);
	add(b2);
	add(b4);
	add(b1);
	
	try
	{

	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	System.out.print("Driver loaded");
	con=DriverManager.getConnection("jdbc:odbc:library");
	System.out.print("connected");
	st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from book where publisher='"+publisher.ch.getSelectedItem()+"'");
	
	if(rs.next())
	{
	l1.setText(rs.getString(1));
	l2.setText(rs.getString(2));
	l3.setText(rs.getString(3));
	l4.setText(rs.getString(4));
	l5.setText(rs.getString(5));
	}
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}
}
		
	
public void actionPerformed(ActionEvent me)
	{
	
	if(me.getSource()==b4)
	{
	m=0;
	try
	{
	ResultSet rs=st.executeQuery("select * from book where publisher='"+publisher.ch.getSelectedItem()+"'");
	
	while(rs.next())
	{
	l1.setText(rs.getString(1));
	l2.setText(rs.getString(2));
	l3.setText(rs.getString(3));
	l4.setText(rs.getString(4));
	l5.setText(rs.getString(5));
	m++;
	}
	m=m-1;
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}	
	}

	if(me.getSource()==b3)
	{
	if(m>0)
	m--;
	try
	{
	ResultSet rs=st.executeQuery("select * from book where publisher='"+publisher.ch.getSelectedItem()+"'");
	for(int i=0;i<m;i++)
	{
	rs.next();
	}
	if(rs.next())
	{
	l1.setText(rs.getString(1));
	l2.setText(rs.getString(2));
	l3.setText(rs.getString(3));
	l4.setText(rs.getString(4));
	l5.setText(rs.getString(5));
	}
	
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}	
	}


if(me.getSource()==b1)
	{
	m=0;
	try
	{
	ResultSet rs=st.executeQuery("select * from book where publisher='"+publisher.ch.getSelectedItem()+"'");
	
	if(rs.next())
	{
	l1.setText(rs.getString(1));
	l2.setText(rs.getString(2));
	l3.setText(rs.getString(3));
	l4.setText(rs.getString(4));
	l5.setText(rs.getString(5));
	}
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}	
	
}
	
	if(me.getSource()==b2)
	{
	m++;
	try
	{
	ResultSet rs=st.executeQuery("select * from book where publisher='"+publisher.ch.getSelectedItem()+"'");
	for(int i=0;i<m;i++)
	{
	rs.next();
	
	}
	if(rs.next())
	{
	l1.setText(rs.getString(1));
	l2.setText(rs.getString(2));
	l3.setText(rs.getString(3));
	l4.setText(rs.getString(4));
	l5.setText(rs.getString(5));
	}
	else
	m--;
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}	
	}
}

}	

class books extends Frame implements ActionListener
{
	Connection con;
	Statement st;
Label l;
public static Choice ch=new Choice();

	Button b;
	
	books()
	{	
	setLayout(null);
	setBackground(new Color(155,163,255));
Label lbl=new Label("Book");
lbl.setBounds(0,10,500,60);
lbl.setFont(new Font("Arial Black",Font.BOLD,36));
lbl.setForeground(Color.white);
lbl.setBackground(new Color(0,9,108));
add(lbl);
	l=new Label("book name");
	b=new Button("show");
	ch=new Choice();
	l.setBounds(200,200,70,30);
	ch.setBounds(300,200,100,30);
	b.setBounds(250,300,50,30);
	l.setFont(new Font("Times new Roman",Font.BOLD,12));
l.setBackground(new Color(0,9,108));
l.setForeground(Color.white);
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	System.out.print("Driver loaded");
	con=DriverManager.getConnection("jdbc:odbc:library");
	System.out.print("connected");
	st=con.createStatement();
	ResultSet rs=st.executeQuery("select distinct name from book");
	
	while(rs.next())
	{
	ch.add(""+rs.getString(1));
	}
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}

	add(l);
	add(ch);
	add(b);
	b.addActionListener(this);
	}

	public void actionPerformed(ActionEvent me)
	{
	if(me.getSource()==b)
	{
	booksm d=new booksm();
	d.setSize(1000,1000);
	d.setLocation(100,100);
	d.setVisible(true);
	}}
	
	}

class booksm extends Frame implements ActionListener
{
	int m;
	Connection con;
	Statement st;
	int k,i;
Label l[]=new Label[5];
Label l1,l2,l3,l4,l5;
String s[]={"book id","Name","author","publisher","cost"};

Button b1,b2,b3,b4;
	
	booksm()
	{
	setLayout(null);
	setBackground(new Color(155,163,255));
	for(i=0;i<5;i++,k++)
	{
	l[i]=new Label(s[k]);
	l[i].setBounds(100,i*50+100,100,30);
	l[i].setFont(new Font("Times new Roman",Font.BOLD,12));
l[i].setBackground(new Color(0,9,108));
l[i].setForeground(Color.white);
	add(l[i]);
	}
	
	l1=new Label("");
	l2=new Label("");
	l3=new Label("");
	l4=new Label("");
	l5=new Label("");
	
	l1.setFont(new Font("Times new Roman",Font.BOLD,12));
l1.setBackground(new Color(0,9,108));
l1.setForeground(Color.white);
l2.setFont(new Font("Times new Roman",Font.BOLD,12));
l2.setBackground(new Color(0,9,108));
l2.setForeground(Color.white);
l3.setFont(new Font("Times new Roman",Font.BOLD,12));
l3.setBackground(new Color(0,9,108));
l3.setForeground(Color.white);
l4.setFont(new Font("Times new Roman",Font.BOLD,12));
l4.setBackground(new Color(0,9,108));
l4.setForeground(Color.white);
l5.setFont(new Font("Times new Roman",Font.BOLD,12));
l5.setBackground(new Color(0,9,108));
l5.setForeground(Color.white);
	b1=new Button("first");
	b2=new Button("next");
	b3=new Button("previous");
	b4=new Button("last");
	
	l1.setBounds(220,100,100,30);
	l2.setBounds(220,150,30,30);
	l3.setBounds(220,200,100,30);
	
	l4.setBounds(220,250,30,30);
	
	l5.setBounds(220,300,30,30);
	
	b1.setBounds(200,500,50,30);
	b2.setBounds(260,500,50,30);
	b3.setBounds(320,500,50,30);
	b4.setBounds(380,500,50,30);
	
	add(l1);
	add(l2);
	add(l3);
	add(l4);
	add(l5);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	add(b3);
	add(b2);
	add(b4);
	add(b1);
	
	try
	{

	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	System.out.print("Driver loaded");
	con=DriverManager.getConnection("jdbc:odbc:library");
	System.out.print("connected");
	st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from book where name='"+books.ch.getSelectedItem()+"'");
	
	if(rs.next())
	{
	l1.setText(rs.getString(1));
	l2.setText(rs.getString(2));
	l3.setText(rs.getString(3));
	l4.setText(rs.getString(4));
	l5.setText(rs.getString(5));
	}
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}
}
		
	
public void actionPerformed(ActionEvent me)
	{
	
	if(me.getSource()==b4)
	{
	m=0;
	try
	{
	ResultSet rs=st.executeQuery("select * from book where name='"+books.ch.getSelectedItem()+"'");
	
	while(rs.next())
	{
	l1.setText(rs.getString(1));
	l2.setText(rs.getString(2));
	l3.setText(rs.getString(3));
	l4.setText(rs.getString(4));
	l5.setText(rs.getString(5));
	m++;
	}
	m=m-1;
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}	
	}

	if(me.getSource()==b3)
	{
	if(m>0)
	m--;
	try
	{
	ResultSet rs=st.executeQuery("select * from book where name='"+books.ch.getSelectedItem()+"'");
	for(int i=0;i<m;i++)
	{
	rs.next();
	}
	if(rs.next())
	{
	l1.setText(rs.getString(1));
	l2.setText(rs.getString(2));
	l3.setText(rs.getString(3));
	l4.setText(rs.getString(4));
	l5.setText(rs.getString(5));
	}
	
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}	
	}


	if(me.getSource()==b1)
	{
	m=0;
	try
	{
	ResultSet rs=st.executeQuery("select * from book where name='"+books.ch.getSelectedItem()+"'");
	
	if(rs.next())
	{
	l1.setText(rs.getString(1));
	l2.setText(rs.getString(2));
	l3.setText(rs.getString(3));
	l4.setText(rs.getString(4));
	l5.setText(rs.getString(5));
	}
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}	
	
}
	
	if(me.getSource()==b2)
	{
	m++;
	try
	{
	ResultSet rs=st.executeQuery("select * from book where name='"+books.ch.getSelectedItem()+"'");
	for(int i=0;i<m;i++)
	{
	rs.next();
	
	}
	if(rs.next())
	{
	l1.setText(rs.getString(1));
	l2.setText(rs.getString(2));
	l3.setText(rs.getString(3));
	l4.setText(rs.getString(4));
	l5.setText(rs.getString(5));	}
	else
	m--;
	}
	catch(Exception ex)
	{
	System.out.print(ex.getMessage());
	}	
	}
}

}