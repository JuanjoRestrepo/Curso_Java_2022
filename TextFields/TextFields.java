import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
   
   private JTextField textfield1;
   private JLabel label1;
   private JButton boton1;

   public Formulario(){
      setLayot(null);
      label1 = new JLabel("Usuario");
      label1.setBounds(10,10,100,30);
      add(label1);
      
      textField1 = new JTextField(); 
      textField1.setBounds(120,17,150,20);
      add(textField1);      
      
      boton1 = new JButton("Aceptar");
      boton1.setBounds(10,80,100,30);
      add(boton1);
      boton1.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent event){
      if(event.getSource() == boton1){
         String texto = textField1.getText();
         
         
      }
      
      
   }
}