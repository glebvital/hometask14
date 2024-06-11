import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame {
    String holder;
    String Sign;
    Calculator(){
        JFrame jFrame = new JFrame("Calculator");
        jFrame.setSize(325,400);
        jFrame.setResizable(false);
        jFrame.setLayout(null);

        JTextField jTextField = new JTextField("");
        jTextField.setSize(290,50);
        jTextField.setLocation(10,40);
        jTextField.setEditable(false);
        jTextField.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        jFrame.add(jTextField);

        JTextField holderField = new JTextField("");
        holderField.setSize(290,30);
        holderField.setLocation(10,5);
        holderField.setForeground(Color.LIGHT_GRAY);
        holderField.setEditable(false);
        holderField.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        jFrame.add(holderField);

        JButton num1 = new JButton("1");
        num1.setSize(50,50);
        num1.setLocation(10,100);
        num1.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"1");
            }
        });
        jFrame.add(num1);

        JButton num2 = new JButton("2");
        num2.setSize(50,50);
        num2.setLocation(70,100);
        num2.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"2");
            }
        });
        jFrame.add(num2);

        JButton num3 = new JButton("3");
        num3.setSize(50,50);
        num3.setLocation(130,100);
        num3.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        num3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"3");
            }
        });
        jFrame.add(num3);

        JButton plus = new JButton("+");
        plus.setSize(50,50);
        plus.setLocation(190,100);
        plus.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jTextField.getText().isEmpty()) {
                    holder = jTextField.getText();
                    Sign = "+";
                    holderField.setText(holder + " " + Sign);
                    jTextField.setText("");
                }else {
                    Sign = "+";
                    holderField.setText(holder + " " + Sign);
                }
            }
        });
        jFrame.add(plus);

        JButton num4 = new JButton("4");
        num4.setSize(50,50);
        num4.setLocation(10,160);
        num4.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        num4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"4");
            }
        });
        jFrame.add(num4);

        JButton num5 = new JButton("5");
        num5.setSize(50,50);
        num5.setLocation(70,160);
        num5.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        num5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"5");
            }
        });
        jFrame.add(num5);

        JButton num6 = new JButton("6");
        num6.setSize(50,50);
        num6.setLocation(130,160);
        num6.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        num6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"6");
            }
        });
        jFrame.add(num6);

        JButton minus = new JButton("-");
        minus.setSize(50,50);
        minus.setLocation(190,160);
        minus.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jTextField.getText().isEmpty()) {
                    holder = jTextField.getText();
                    Sign = "-";
                    holderField.setText(holder + " " + Sign);
                    jTextField.setText("");
                }else {
                    Sign = "-";
                    holderField.setText(holder + " " + Sign);
                }
            }
        });
        jFrame.add(minus);

        JButton num7 = new JButton("7");
        num7.setSize(50,50);
        num7.setLocation(10,220);
        num7.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        num7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"7");
            }
        });
        jFrame.add(num7);

        JButton num8 = new JButton("8");
        num8.setSize(50,50);
        num8.setLocation(70,220);
        num8.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        num8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"8");
            }
        });
        jFrame.add(num8);

        JButton num9 = new JButton("9");
        num9.setSize(50,50);
        num9.setLocation(130,220);
        num9.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        num9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"9");
            }
        });
        jFrame.add(num9);

        JButton times = new JButton("x");
        times.setSize(50,50);
        times.setLocation(190,220);
        times.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        times.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jTextField.getText().isEmpty()) {
                    holder = jTextField.getText();
                    Sign = "x";
                    holderField.setText(holder + " " + Sign);
                    jTextField.setText("");
                }else {
                    Sign = "x";
                    holderField.setText(holder + " " + Sign);
                }
            }
        });
        jFrame.add(times);

        JButton num0 = new JButton("0");
        num0.setSize(50,50);
        num0.setLocation(70,280);
        num0.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        num0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"0");
            }
        });
        jFrame.add(num0);

        JButton division = new JButton("/");
        division.setSize(50,50);
        division.setLocation(130,280);
        division.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jTextField.getText().isEmpty()) {
                    holder = jTextField.getText();
                    Sign = "/";
                    holderField.setText(holder + " " + Sign);
                    jTextField.setText("");
                }else {
                    Sign = "/";
                    holderField.setText(holder + " " + Sign);
                }
            }
        });
        jFrame.add(division);

        JButton dot = new JButton(".");
        dot.setSize(50,50);
        dot.setLocation(250,160);
        dot.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+".");
            }
        });
        jFrame.add(dot);

        JButton equals = new JButton("=");
        equals.setSize(50,50);
        equals.setLocation(190,280);
        equals.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Sign.equals("+")&& !jTextField.getText().isEmpty()&&holderField.getText().length()<=10){
                    jTextField.setText(String.valueOf(Double.parseDouble(holder)+Double.parseDouble(jTextField.getText())));
                    holderField.setText(jTextField.getText());
                } else if (Sign.equals("-")&& !jTextField.getText().isEmpty()&&holderField.getText().length()<=10) {
                    jTextField.setText(String.valueOf(Double.parseDouble(holder)+Double.parseDouble(jTextField.getText())));
                    holderField.setText(jTextField.getText());
                } else if (Sign.equals("x")&& !jTextField.getText().isEmpty()&&holderField.getText().length()<=10){
                    jTextField.setText(String.valueOf(Double.parseDouble(holder)+Double.parseDouble(jTextField.getText())));
                    holderField.setText(jTextField.getText());
                } else if (Sign.equals("/")&& !jTextField.getText().isEmpty()&&holderField.getText().length()<=10){
                    jTextField.setText(String.valueOf(Double.parseDouble(holder)+Double.parseDouble(jTextField.getText())));
                    holderField.setText(jTextField.getText());
                } else {
                    jTextField.setText("");
                    holderField.setText("");
                    holder = "";
                    Sign = "";
                }

            }
        });
        jFrame.add(equals);

        JButton delete = new JButton("◄");
        delete.setSize(50,50);
        delete.setLocation(10,280);
        delete.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jTextField.getText().isEmpty()){
                    jTextField.setText(jTextField.getText().substring(0,jTextField.getText().length()-1));
                }
            }
        });
        jFrame.add(delete);

        JButton clear = new JButton("c");
        clear.setSize(50,50);
        clear.setLocation(250,100);
        clear.setBorder(BorderFactory.createLineBorder(Color.black,3,true));
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText("");
                holderField.setText("");
                holder = "";
                Sign = "";
            }
        });
        jFrame.add(clear);

        jFrame.setVisible(true);
    }


}
