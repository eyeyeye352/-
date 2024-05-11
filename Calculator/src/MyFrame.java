import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame {

    //初始化框
    public MyFrame(String name,int x,int y,int w,int h,Color colors) {

        //初始化框框
        super(name);
        setResizable(true);
        setBackground(colors);
        setBounds(x, y, w, h);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //四個Panel
        createPanels();


        //布局、添加
        setLayout(new GridLayout(4,1));
        pack();
    }


    public void createPanels(){

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        Panel p4 = new Panel();

        p1.setBackground(new Color(232, 176, 176));
        p2.setBackground(new Color(216, 144, 234));
        p3.setBackground(new Color(160, 201, 98));
        p4.setBackground(new Color(160, 224, 224));

        p1.setLayout(new FlowLayout());
        p2.setLayout(new FlowLayout());
        p3.setLayout(new FlowLayout());
        p4.setLayout(new FlowLayout());


        createElements(p1,p2,p3,p4);

        add(p1);
        add(p2);
        add(p3);
        add(p4);
    }



    public void createElements(Panel p1,Panel p2,Panel p3,Panel p4){
        //12個文本框
        TextField P1 = new TextField(10);
        Label plus = new Label("+");
        TextField P2 = new TextField(10);
        Button pequal = new Button("=");
        TextField pans = new TextField(15);
        pans.setName("pans");
        pequal.setActionCommand("pequal");
        pequal.addActionListener(new MyAction(P1,P2,pans));

        p1.add(P1);
        p1.add(plus);
        p1.add(P2);
        p1.add(pequal);
        p1.add(pans);


        //minus
        TextField m1 = new TextField(10);
        Label minus = new Label("-");
        TextField m2 = new TextField(10);
        Button mequal = new Button("=");
        TextField mans = new TextField(15);
        mans.setName("mans");
        mequal.setActionCommand("mequal");
        mequal.addActionListener(new MyAction(m1,m2,mans));

        p2.add(m1);
        p2.add(minus);
        p2.add(m2);
        p2.add(mequal);
        p2.add(mans);


        //times
        TextField t1 = new TextField(10);
        Label times = new Label("*");
        TextField t2 = new TextField(10);
        Button tequal = new Button("=");
        TextField tans = new TextField(15);
        tans.setName("tans");
        tequal.setActionCommand("tequal");
        tequal.addActionListener(new MyAction(t1,t2,tans));

        p3.add(t1);
        p3.add(times);
        p3.add(t2);
        p3.add(tequal);
        p3.add(tans);

        //divide
        TextField d1 = new TextField(10);
        Label divide = new Label("/");
        TextField d2 = new TextField(10);
        Button dequal = new Button("=");
        TextField dans = new TextField(15);
        dans.setName("dans");
        dequal.setActionCommand("dequal");
        dequal.addActionListener(new MyAction(d1,d2,dans));

        p4.add(d1);
        p4.add(divide);
        p4.add(d2);
        p4.add(dequal);
        p4.add(dans);

    }
}