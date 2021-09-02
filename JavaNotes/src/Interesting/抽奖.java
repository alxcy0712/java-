package Interesting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 抽奖 {
    public static final String[] price = {"一等奖：MacBook Pro","二等奖：iPhone 12 Pro Max","三等奖：AirPods Pro","安慰奖：大嘴巴子"};


    public static void main(String[] args) {
        JFrame frame = new JFrame("抽奖！抽大奖啦！");
        JPanel jPanel = new JPanel();
        JTextArea textArea = new JTextArea();
        JLabel actualPrice = new JLabel();
        JButton jButton = new JButton("抽奖！");

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long random = System.currentTimeMillis()%100;
                int i = 0 ;
                while(i < 30){

                }
                String now = "";
                if(random == 8){
                    now = price[0];
                }else if(random > 10 && random % 33 == 0){
                    now = price[1];
                }else if(random < 18){
                    now = price[2];
                }else{
                    now = price[3];
                }
                actualPrice.setText(now);
            }
        });

        jPanel.setLayout(new BorderLayout());
        textArea.setText(price[0]+"\n"+price[1]+"\n"+price[2]+"\n"+price[3]);
        textArea.setEnabled(false);
        jPanel.add(new JScrollPane(textArea),BorderLayout.NORTH);
        jPanel.add(actualPrice,BorderLayout.CENTER);
        jPanel.add(jButton,BorderLayout.SOUTH);
        frame.add(jPanel);

        frame.setSize(200,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
}
