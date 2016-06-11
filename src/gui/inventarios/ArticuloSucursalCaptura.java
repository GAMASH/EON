/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.inventarios;

import abstractt.InternalFrameAbstracto;
import domain.tabla.ArticuloSucursal;

/**
 *
 * @author Developer GAGS
 */
public class ArticuloSucursalCaptura extends InternalFrameAbstracto  {

    private ArticuloSucursal articuloSucursal;
    
    /**
     * Creates new form ArticuloSucursalCaptura
     */
    public ArticuloSucursalCaptura() {
        initComponents();
    }
    
    public void cargar(){
     
        this.articuloSucursalPanel1.setArticuloSucursal(articuloSucursal);
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        articuloSucursalPanel1 = new gui.inventarios.ArticuloSucursalPanel();
        boton1 = new abstractt.Boton();
        boton2 = new abstractt.Boton();

        setTitle("Articulo Sucursal");
        getContentPane().setLayout(null);
        getContentPane().add(articuloSucursalPanel1);
        articuloSucursalPanel1.setBounds(10, 10, 390, 308);

        boton1.setText("Aceptar");
        getContentPane().add(boton1);
        boton1.setBounds(50, 330, 112, 30);

        boton2.setText("Cancelar");
        getContentPane().add(boton2);
        boton2.setBounds(270, 330, 112, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.inventarios.ArticuloSucursalPanel articuloSucursalPanel1;
    private abstractt.Boton boton1;
    private abstractt.Boton boton2;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the articuloSucursal
     */
    public ArticuloSucursal getArticuloSucursal() {
        
        return articuloSucursal;
    }

    /**
     * @param articuloSucursal the articuloSucursal to set
     */
    public void setArticuloSucursal(ArticuloSucursal articuloSucursal) {
        
        this.articuloSucursal = articuloSucursal;
        this.articuloSucursalPanel1.setArticuloSucursal(articuloSucursal);
        cargar();
    }
}