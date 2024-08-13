
package Controladores;

import Modelo.Visitas;
import Vista.frmVisitas1;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import java.util.UUID;

public class ctrlVisitas1 implements MouseListener{
    
    private Visitas modelo;
    private frmVisitas1 vista;
    
    public ctrlVisitas1(Visitas modelo, frmVisitas1 vista){    
        this.modelo = modelo;
        this.vista = vista;
        
        vista.btnIngresar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == vista.btnIngresar){
            modelo.setNombre(vista.txtNombres.getText());
            modelo.setNombre(vista.txtEdad.getText());
            modelo.setNombre(vista.txtEspecialidad.getText());
            
            modelo.Guardar();
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
  
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    
}
