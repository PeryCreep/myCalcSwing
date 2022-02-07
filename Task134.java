import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Task134 implements ActionListener {

    JTextArea area;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btnplus;
    JButton btnminus;
    JButton btndel;
    JButton btnymn;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btnpoint;
    JButton btnravn;
    JButton btnclear;
    JButton btnnull;
    JButton btnBin;

    String param1 = "";
    String operation;
    float result;
    int resultBin;
    StringBuilder temp = new StringBuilder();
    int a;


    public static void main(String[] args) {
        Task134 task = new Task134();
        task.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        area = new JTextArea(2, 10);
        JPanel innerpanel = new JPanel();//вложенная панель(тут TextArea) и  кнопка очистки
        JPanel panel = new JPanel();// основная панель(тут все три панельки)
        JPanel bottompanel = new JPanel();// тут панелька с числами  и точкой
        JPanel innerbottom1 = new JPanel();// 1 2 3 -
        JPanel innerbottom2 = new JPanel();// 4 5 6 +
        JPanel innerbottom3 = new JPanel();// 7 8 9 /
        JPanel innerbottom4 = new JPanel();// . 0 = *


        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btnplus = new JButton("+");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btnminus = new JButton("-");
        btndel = new JButton("/");
        btnymn = new JButton("*");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnnull = new JButton("0");
        btnpoint = new JButton(".");
        btnravn = new JButton("=");
        btnclear = new JButton("C");
        btnBin = new JButton("Bin");

        btnnull.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnpoint.addActionListener(this);
        btnravn.addActionListener(this);
        btnymn.addActionListener(this);
        btndel.addActionListener(this);
        btnplus.addActionListener(this);
        btnminus.addActionListener(this);
        btnclear.addActionListener(this);
        btnBin.addActionListener(this);

        btn1.setBackground(Color.blue);
        btn2.setBackground(Color.blue);
        btn3.setBackground(Color.blue);
        btn4.setBackground(Color.red);
        btn5.setBackground(Color.red);
        btn6.setBackground(Color.red);

        Font font = new Font("Arial", Font.BOLD, 48);
        btn7.setFont(font);
        btn8.setFont(font);
        btn9.setFont(font);


        innerpanel.add(BorderLayout.CENTER, area);
        innerpanel.add(BorderLayout.EAST, btnclear);

        innerbottom1.add(btn1);
        innerbottom1.add(btn2);
        innerbottom1.add(btn3);
        innerbottom1.add(btnminus);
        innerbottom1.setBackground(Color.pink);

        innerbottom2.add(btn4);
        innerbottom2.add(btn5);
        innerbottom2.add(btn6);
        innerbottom2.add(btnplus);
        innerbottom2.setBackground(Color.pink);

        innerbottom3.add(btn7);
        innerbottom3.add(btn8);
        innerbottom3.add(btn9);
        innerbottom3.add(btndel);
        innerbottom3.setBackground(Color.pink);

        innerbottom4.add(btnpoint);
        innerbottom4.add(btnnull);
        innerbottom4.add(btnravn);
        innerbottom4.add(btnymn);
        innerbottom4.add(btnBin);
        innerbottom4.setBackground(Color.pink);


        bottompanel.setLayout(new BoxLayout(bottompanel, BoxLayout.PAGE_AXIS));
        bottompanel.add(innerbottom1);
        bottompanel.add(innerbottom2);
        bottompanel.add(innerbottom3);
        bottompanel.add(innerbottom4);


        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));//в основном компоненте выравниваю по Y(как стек)
        panel.add(innerpanel);// здесь у меня TExtArea
        panel.add(bottompanel);//здесь кнопки с числами и точка
        panel.setBackground(Color.pink);


        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setTitle("Калькулятор");
        frame.setResizable(false);
        frame.setSize(300, 350);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnnull)) {
            area.append("0");
            param1 = param1 + "0";
        }
        if (e.getSource().equals(btn1)) {
            area.append("1");
            param1 = param1 + "1";
        }
        if (e.getSource().equals(btn2)) {
            area.append("2");
            param1 = param1 + "2";
        }
        if (e.getSource().equals(btn3)) {
            area.append("3");
            param1 = param1 + "3";
        }
        if (e.getSource().equals(btn4)) {
            area.append("4");
            param1 = param1 + "4";
        }
        if (e.getSource().equals(btn5)) {
            area.append("5");
            param1 = param1 + "5";
        }
        if (e.getSource().equals(btn6)) {
            area.append("6");
            param1 = param1 + "6";
        }
        if (e.getSource().equals(btn7)) {
            area.append("7");
            param1 = param1 + "7";
        }
        if (e.getSource().equals(btn8)) {
            area.append("8");
            param1 = param1 + "8";
        }
        if (e.getSource().equals(btn9)) {
            area.append("9");
            param1 = param1 + "9";
        }
        if (e.getSource().equals(btnpoint)) {
            area.append(".");
            param1 = param1 + ".";
        }
        if (e.getSource().equals(btnminus)) {
            if (result == 0) {
                result = Float.parseFloat(param1);
            }else {
                result = result - Float.parseFloat(param1);
            }
            area.append("-");
            operation = "-";
            param1 = "";
        }
        if (e.getSource().equals(btnplus)) {
            if (result == 0) {
                result = Float.parseFloat(param1);
            }else {
                result = result + Float.parseFloat(param1);
            }
            area.append("+");
            operation = "+";
            param1 = "";
        }
        if (e.getSource().equals(btndel)) {
            float temp = Float.parseFloat(param1);
            if (result == 0) {
                result = temp;
            } else {
                result = result / temp;
            }
            area.append("/");
            operation = "/";
            param1 = "";
        }
        if (e.getSource().equals(btnymn)) {
            float temp = Float.parseFloat(param1);
            if (result == 0) {
                result = temp;
            } else {
                result = result * temp;
            }
            area.append("*");
            operation = "*";
            param1 = "";
        }
        if (e.getSource().equals(btnclear)) {
            area.setText("");
            operation = "";
            param1 = "";
            result = 0;

        }
        if (e.getSource().equals(btnravn)) {
            switch (operation) {
                case "/":
                    result = result / Float.parseFloat(param1);
                    param1 = "";
                    break;
                case "+":
                    result = result + Float.parseFloat(param1);
                    param1 = "";
                    break;
                case "-":
                    result = result - Float.parseFloat(param1);
                    param1 = "";
                    break;
                case "*":
                    result = result * Float.parseFloat(param1);
                    param1 = "";
                    break;
            }
            area.setText(String.valueOf(result));
            resultBin = (int)result;
            operation = "";
            result = 0;
            param1 = "";

        }if (e.getSource().equals(btnBin)) {
            while(resultBin != 0){
                temp.append(resultBin % 2);

                resultBin = resultBin/2;
            }
            area.setText(temp.reverse().toString());
            temp.replace(0,temp.length(), "");
        }

    }
}
