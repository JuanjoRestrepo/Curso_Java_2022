import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{

   private JLabel label3;
   
   private JButton boton1, boton2, boton3;

   public Formulario(){
      setLayout(null);
      boton1 = new JButton("1");    
      boton1.setBounds(10,100,90,30);
      add(boton1);
      boton1.addActionListener(this);

      boton2 = new JButton("2");    
      boton2.setBounds(110,100,90,30);
      add(boton2);
      boton2.addActionListener(this);

      boton3 = new JButton("3");    
      boton3.setBounds(210,100,90,30);
      add(boton3);
      boton3.addActionListener(this);
      
      label3 = new JLabel("En espera...");
      label3.setBounds(10,10,300,30);
      add(label3);
   }
   
   public void actionPerformed(ActionEvent evento){
      if(evento.getSource() == boton1){
         label3.setText("Has presionado el botón 1");
      }
      else if (evento.getSource() == boton2){
         label3.setText("Has presionado el botón 2");
      }
      else if (evento.getSource() == boton3){
         label3.setText("Has presionado el botón 3");
      }
   }
      
   public static void main(String args[]){
      Formulario formulario1 = new Formulario();
      formulario1.setBounds(0,0,450,350);
      formulario1.setResizable(false);
      formulario1.setVisible(true);
      formulario1.setLocationRelativeTo(null);
   }
}