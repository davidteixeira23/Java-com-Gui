/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroclientegui;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author David
 */
public class Janela extends JFrame{
   JLabel rotulo0, rotulo1, rotulo2, rotulo3, rotulo4,rotulo5,rotulo6,rotulo7,rotulo8;
    JTextField texto1, texto2, texto3, texto4, texto5, texto6;
    public Janela () {
    super("janela em GUI");
    Container tela = getContentPane();
    setLayout(null);
     
     rotulo0 = new JLabel ("Cadastro do Cliente");
     rotulo1 = new JLabel ("Nome");
     rotulo2 = new JLabel ("CPF");
     rotulo3 = new JLabel ("RG");
     rotulo4 = new JLabel ("Endereço");
     rotulo5 = new JLabel ("Cidade");
     rotulo6 = new JLabel ("Estado");
     rotulo7 = new JLabel ("CEP");
    
     texto1 = new JTextField();
     texto2 = new JTextField();
     texto3 = new JTextField();
     texto4 = new JTextField();
     texto5 = new JTextField();
     texto6 = new JTextField();
   
     rotulo0.setBounds(400,20,200,20);
   
     texto1.setBounds(50,20,80,20);
     texto2.setBounds(50,20,80,20);
     texto3.setBounds(50,20,80,20);
     texto4.setBounds(50,20,80,20);
     texto5.setBounds(50,20,80,20);
     texto6.setBounds(50,20,80,20);
    
     tela.add(rotulo0);
     
     
     
     
     rotulo0.setForeground(Color.RED);
     rotulo0.setFont(new Font("Arial",Font.BOLD,16));
     
     
     setVisible(true);
     setLocationRelativeTo(null);
     setSize(400,200);
    }
    
    
    
    
    
    
}
