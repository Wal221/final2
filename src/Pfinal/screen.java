package Pfinal;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class screen extends JFrame implements ActionListener {
    public static void main(String[] args) {

    }
    ImageIcon imagem = new ImageIcon(Objects.requireNonNull(getClass().getResource("biscoitinho.jpg")));
    JLabel label;



    public screen(){
        String [] args = new String[3];
        label= new JLabel(imagem);
        label.setBounds(0,0,800,500);
        label.setOpaque(true);
        label.setVisible(true);
        label.setBackground(Color.pink);



        setSize(800,500);
        setTitle("Psicologa Marta");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);


        JButton jButton = new JButton("começa");
        jButton.setBounds(100,200,250,70);
        jButton.setFont(new Font("Arial",Font.ITALIC,40));
        jButton.setForeground(new Color(255, 255, 255));
        jButton.setBackground(new Color(94, 3, 131));
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int[] answers = new int[10];
                String caminho = "src/Pfinal/frases";
                //new screen();

                pjfinal.printDialogs();
                pjfinal.performsDiagnosis(answers, caminho);
                 new Pfinal.Imagem(caminho, 9);

                new pjfinal();

            }
        });


        JButton jButton2 = new JButton("sair");
        jButton2.setBounds(500,200,250,70);
        jButton2.setFont(new Font("Arial",Font.ITALIC,40));
        jButton2.setForeground(new Color(255, 255, 255));
        jButton2.setBackground(new Color(94, 3, 131));

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(jButton);

        add(jButton2);

        jButton.addActionListener(this);

        jButton2.addActionListener(this);

        add(label);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}