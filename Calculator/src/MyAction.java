import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyAction implements ActionListener {
    TextField p1,p2,pans;
    TextField m1,m2,mans;
    TextField t1,t2,tans;
    TextField d1,d2,dans;

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "pequal":
                plus();
                break;
            case "mequal":
                minus();
                break;
            case "tequal":
                times();
                break;
            case "dequal":
                divide();
                break;
        }

    }

    public MyAction(TextField p1,TextField p2,TextField ans){
        //判斷三個變數
        switch (ans.getName()){
            case "pans":
                this.p1 = p1;
                this.p2 = p2;
                this.pans = ans;
                break;
            case "mans":
                this.m1 = p1;
                this.m2 = p2;
                this.mans = ans;
                break;
            case "tans":
                this.t1 = p1;
                this.t2 = p2;
                this.tans = ans;
                break;
            case "dans":
                this.d1 = p1;
                this.d2 = p2;
                this.dans = ans;
                break;
        }
    }


    public void plus(){
        int a = Integer.parseInt(p1.getText());
        int b = Integer.parseInt(p2.getText());
        pans.setText(String.valueOf(a+b));
        p1.setText("");
        p2.setText("");
    }

    public void minus(){
        int a = Integer.parseInt(m1.getText());
        int b = Integer.parseInt(m2.getText());
        mans.setText(String.valueOf(a-b));
        m1.setText("");
        m2.setText("");
    }

    public void times(){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        tans.setText(String.valueOf(a*b));
        t1.setText("");
        t2.setText("");
    }

    public void divide(){
        int a = Integer.parseInt(d1.getText());
        int b = Integer.parseInt(d2.getText());
        dans.setText((a/b)+".."+(a%b));
        d1.setText("");
        d2.setText("");
    }


}
