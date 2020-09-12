/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_poo;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;


/**
 *
 * @author Cesar J. Santacruz
 */
public class GestionLogin extends javax.swing.JFrame {

    ArrayList<Tiendas> tiendas = new ArrayList<>();

    /**
     * Creates new form Login
     */
    public GestionLogin() {
        initComponents();
        agregarProductos();
    }

    public void agregarProductos() {
        ////PICHINCHA
        /*TIENDA PCSHOP*/
        LinkedList<Producto> misProductosPCShop = new LinkedList<>();

        //Agregar RAM
        misProductosPCShop.add(new RAM(8, "DDR4", 2133, "Ambas", "Kingston", 76));
        misProductosPCShop.add(new RAM(4, "DDR3", 1333, "Ambas", "Kingston", 64));
        //Agregar Almacenamiento
        misProductosPCShop.add(new Almacenamiento("SSD", "240GB", "Ambas", "Kingston", 78.99));
        misProductosPCShop.add(new Almacenamiento("SSD", "480GB", "Ambas", "WD", 89.99));
        misProductosPCShop.add(new Almacenamiento("HDD", "1TB", "Laptop", "Toshiba", 73.99));
        //Agregar Procesador
        misProductosPCShop.add(new Procesador("i3-9100", "Ambas", "Intel", 209.99));
        misProductosPCShop.add(new Procesador("i5-9400", "Ambas", "Intel", 299.99));
        misProductosPCShop.add(new Procesador("i7-9700", "Ambas", "Intel", 525));
        //Agregar Fuente de poder
        misProductosPCShop.add(new FuenteDePoder("800", "Escritorio", "Altek", 20));
        //No tiene ventilacion

        tiendas.add(new Tiendas("PCShop", "Pichincha", "Quito", misProductosPCShop));

        /*TIENDA TECNOMEGA*/
        LinkedList<Producto> misProductosTecnoMega = new LinkedList<>();

        //Agregar RAM
        misProductosTecnoMega.add(new RAM(8, "DDR3L", 1600, "Ambas", "A-Data", 46.67));
        misProductosTecnoMega.add(new RAM(8, "DDR4", 2400, "Ambas", "A-Data", 40.22));
        misProductosTecnoMega.add(new RAM(4, "DDR4", 2400, "Ambas", "A-Data", 21.67));
        misProductosTecnoMega.add(new RAM(32, "DDR4", 2400, "Ambas", "Corsair", 180.67));
        misProductosTecnoMega.add(new RAM(16, "DDR4", 2400, "Ambas", "Crucial", 104.44));
        misProductosTecnoMega.add(new RAM(8, "DDR4", 2400, "Ambas", "DELL", 155.44));
        misProductosTecnoMega.add(new RAM(16, "DDR4", 2666, "Ambas", "DELL", 220));
        //Agregar Almacenamiento
        misProductosTecnoMega.add(new Almacenamiento("SSD", "256GB", "Laptop", "A-Data", 57.56));
        misProductosTecnoMega.add(new Almacenamiento("SSD", "480GB", "Laptop", "A-Data", 78.89));
        misProductosTecnoMega.add(new Almacenamiento("HDD", "4TB", "Ambas", "DELL", 266.67));
        misProductosTecnoMega.add(new Almacenamiento("HDD", "4TB", "Ambas", "HP", 533.67));
        misProductosTecnoMega.add(new Almacenamiento("SSD", "500GB", "Ambas", "HP", 81.67));
        misProductosTecnoMega.add(new Almacenamiento("SSD", "1TB", "Ambas", "HP", 146.11));
        misProductosTecnoMega.add(new Almacenamiento("SSD", "1TB", "Ambas", "Kingston", 145.56));
        //Agregar Procesador
        misProductosTecnoMega.add(new Procesador("5", "Escritorio", "Ryzen", 273.33));
        misProductosTecnoMega.add(new Procesador("7", "Ambas", "Ryzen", 453.33));
        misProductosTecnoMega.add(new Procesador("9", "Ambas", "Ryzen", 686.87));
        misProductosTecnoMega.add(new Procesador("i9-10850", "Ambas", "Intel", 644.44));
        misProductosTecnoMega.add(new Procesador("i5-9400", "Ambas", "Intel", 230));
        misProductosTecnoMega.add(new Procesador("i7-9700", "Ambas", "Intel", 944.44));
        //Agregar fuente de poder
        misProductosTecnoMega.add(new FuenteDePoder("800W", "Escritorio", "Asus", 271.11));
        misProductosTecnoMega.add(new FuenteDePoder("ATX", "Escritorio", "Corsair", 520));
        misProductosTecnoMega.add(new FuenteDePoder("RM750X", "Escritorio", "Corsair", 172.67));
        misProductosTecnoMega.add(new FuenteDePoder("495W", "Escritorio", "DELL", 185.56));
        //Agregar ventilacion
        misProductosTecnoMega.add(new Ventilacion("Standard", "Escritorio", "DELL", 17.89));
        misProductosTecnoMega.add(new Ventilacion("Liquida", "Escritorio", "Asus", 221.11));
        misProductosTecnoMega.add(new Ventilacion("Standard", "Escritorio", "Instel", 34.44));
        misProductosTecnoMega.add(new Ventilacion("Standard", "Escritorio", "DELL", 21.11));

        tiendas.add(new Tiendas("TecnoMega", "Pichincha", "Quito", misProductosTecnoMega));

        ///GUAYAS
        /*TIENDA PARTES Y PIEZAS*/
        LinkedList<Producto> misProductosPartesYPiezas = new LinkedList<>();

        //Agregar RAM
        misProductosPartesYPiezas.add(new RAM(8, "DDR3", 1600, "Ambas", "Kingston", 50));
        misProductosPartesYPiezas.add(new RAM(8, "DDR4", 2666, "Escritorio", "HP", 46.43));
        //Agregar Almacenamiento
        misProductosPartesYPiezas.add(new Almacenamiento("SSD", "240GB", "Ambas", "Kingston", 39.73));
        misProductosPartesYPiezas.add(new Almacenamiento("SSD", "250GB", "Ambas", "HP", 44.64));
        misProductosPartesYPiezas.add(new Almacenamiento("SSD", "240GB", "Ambas", "WD", 38.84));
        //Agregar Procesador
        misProductosPartesYPiezas.add(new Procesador("i7 9700", "Ambas", "Intel", 437.50));
        misProductosPartesYPiezas.add(new Procesador("i5 9400", "Ambas", "Intel", 236.61));
        misProductosPartesYPiezas.add(new Procesador("i3-10100", "Ambas", "Intel", 183.04));
        misProductosPartesYPiezas.add(new Procesador("7", "Ambas", "Ryzen", 486.61));
        misProductosPartesYPiezas.add(new Procesador("5", "Ambas", "Ryzen", 294.64));
        //Agregar fuente de poder
        misProductosPartesYPiezas.add(new FuenteDePoder("800W", "Escritorio", "Asus", 290.18));
        misProductosPartesYPiezas.add(new FuenteDePoder("600W", "Escritorio", "EVGA", 70.54));
        //Agregar ventilacion
        misProductosPartesYPiezas.add(new Ventilacion("Liquida", "Escritorio", "Corsair", 263.39));
        misProductosPartesYPiezas.add(new Ventilacion("Standard", "Escritorio", "Intel", 25.89));

        tiendas.add(new Tiendas("Partes y Piezas", "Guayas", "Guayaquil", misProductosPartesYPiezas));

        /*TIENDA TECNOSMART*/
        LinkedList<Producto> misProductosTecnosmart = new LinkedList<>();

        //Agregar RAM
        misProductosTecnosmart.add(new RAM(16, "DDR4", 2666, "Ambas", "Corsair", 259.99));
        misProductosTecnosmart.add(new RAM(16, "DDR4", 2133, "Ambas", "Kingston", 149.99));
        misProductosTecnosmart.add(new RAM(32, "DDR4", 3000, "Ambas", "Corsair", 339.99));
        //Agregar Almacenamiento
        misProductosTecnosmart.add(new Almacenamiento("HDD", "10TB", "Ambas", "WD", 517.99));
        misProductosTecnosmart.add(new Almacenamiento("HDD", "1TB", "Ambas", "SeaGate", 67.99));
        misProductosTecnosmart.add(new Almacenamiento("HDD", "4TB", "Ambas", "WD", 156.99));
        //Agregar Procesador
        misProductosTecnosmart.add(new Procesador("i5-10400", "Ambas", "Intel", 282.99));
        misProductosTecnosmart.add(new Procesador("i7-9800X", "Ambas", "Intel", 839.99));
        misProductosTecnosmart.add(new Procesador("i3-8300", "Ambas", "Intel", 194.99));
        //Agregar fuente de poder
        misProductosTecnosmart.add(new FuenteDePoder("800w", "Escritorio", "Speed Mind", 44.90));
        misProductosTecnosmart.add(new FuenteDePoder("700W", "Escritorio", "EVGA", 199.99));
        misProductosTecnosmart.add(new FuenteDePoder("700W", "Escritorio", "Corsair", 118.99));
        //Agregar ventilacion
        misProductosTecnosmart.add(new Ventilacion("Liquida", "Escritorio", "ThermalTake", 319.99));
        misProductosTecnosmart.add(new Ventilacion("Standard", "Escritorio", "Corsair", 135.99));
        misProductosTecnosmart.add(new Ventilacion("Standard", "Escritorio", "Corsair", 89.99));

        tiendas.add(new Tiendas("TECNOSMART", "Guayas", "Guayaquil", misProductosTecnosmart));

        ///AZUAY
        /*TIENDA COMPUPLUS*/
        LinkedList<Producto> misProductosCompuPLus = new LinkedList<>();

        //Agregar RAM
        misProductosCompuPLus.add(new RAM(8, "DDR4", 4133, "Ambas", "XPG", 99));
        misProductosCompuPLus.add(new RAM(8, "DDR4", 2933, "Ambas", "Kingston", 89));
        misProductosCompuPLus.add(new RAM(32, "DDR", 3000, "Ambas", "Corsair", 240));
        //Agregar Almacenamiento
        misProductosCompuPLus.add(new Almacenamiento("SSD", "512GB", "Ambas", "SP", 130));
        misProductosCompuPLus.add(new Almacenamiento("SSD", "500GB", "Ambas", "WD", 90));
        misProductosCompuPLus.add(new Almacenamiento("HDD", "2TB", "Ambas", "SeaGate", 95));
        //Agregar Procesador
        misProductosCompuPLus.add(new Procesador("i3 9100F", "Ambas", "Intel", 129));
        misProductosCompuPLus.add(new Procesador("i7 9700F", "Ambas", "Intel", 499));
        misProductosCompuPLus.add(new Procesador("i5 9400F", "Ambas", "Intel", 235));
        misProductosCompuPLus.add(new Procesador("5", "Ambas", "Ryzen", 230));
        misProductosCompuPLus.add(new Procesador("7", "Ambas", "Ryzen", 499));
        misProductosCompuPLus.add(new Procesador("9", "Ambas", "Ryzen", 750));
        //Agregar fuente de poder
        misProductosCompuPLus.add(new FuenteDePoder("1000W", "Escritorio", "Corsair", 250));
        misProductosCompuPLus.add(new FuenteDePoder("500W", "Escritorio", "EVGA", 70));
        misProductosCompuPLus.add(new FuenteDePoder("800W", "Escritorio", "ASUS", 299));
        //Agregar ventilacion
        misProductosCompuPLus.add(new Ventilacion("Standard", "Escritorio", "Corsair", 49));

        tiendas.add(new Tiendas("Compu Plus", "Azuay", "Cuenca", misProductosCompuPLus));

        /*TIENDA GIGA*/
        LinkedList<Producto> misProductosGiga = new LinkedList<>();

        //Agregar RAM
        misProductosGiga.add(new RAM(8, "DDR3L", 2666, "Laptop", "Kingston", 56.99));
        misProductosGiga.add(new RAM(16, "DDR4", 3000, "Laptop", "Kingston", 103.99));
        //Agregar Almacenamiento
        misProductosGiga.add(new Almacenamiento("SSD", "240GB", "Laptop", "Kingston", 49.99));
        misProductosGiga.add(new Almacenamiento("SSD", "480GB", "Laptop", "Kingston", 84.99));
        misProductosGiga.add(new Almacenamiento("SSD", "120GB", "Laptop", "Kingston", 35.99));
        //Agregar Procesador (NO HAY)
        //Agregar fuente de poder (NO HAY)
        //Agregar ventilacion (NO HAY)

        tiendas.add(new Tiendas("Giga", "Azuay", "Cuenca", misProductosGiga));

        /////Loja
        /*Toners*/
        LinkedList<Producto> misProductosToners = new LinkedList<>();

        //Agregar RAM
        misProductosToners.add(new RAM(8, "DDR4", 2666, "Ambas", "HP", 52));
        misProductosToners.add(new RAM(4, "DDR4", 2666, "Ambas", "Kingston", 36.80));
        misProductosToners.add(new RAM(2, "DDR4", 2666, "Laptop", "Kingston", 59));
        //Agregar Almacenamiento
        misProductosToners.add(new Almacenamiento("SSD", "480GB", "Ambas", "A-Data", 96.40));
        misProductosToners.add(new Almacenamiento("SSD", "2TB", "Ambas", "HP", 404.67));
        misProductosToners.add(new Almacenamiento("HDD", "2TB", "Ambas", "A-Data", 112));
        //Agregar Procesador
        misProductosToners.add(new Procesador("i3-9100F", "Ambas", "Intel", 142.80));
        misProductosToners.add(new Procesador("i5-9400F", "Ambas", "Intel", 263.40));
        misProductosToners.add(new Procesador("i7-9700K", "Ambas", "Intel", 577));
        //Agregar fuente de poder
        misProductosToners.add(new FuenteDePoder("700W", "Escritorio", "Altek", 19.80));
        misProductosToners.add(new FuenteDePoder("600W", "Escritorio", "Anera", 22.40));
        //Agregar ventilacion (NO HAY)

        tiendas.add(new Tiendas("Toners", "Loja", "Loja", misProductosToners));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                cbxEscritorio = new javax.swing.JCheckBox();
                cbxLaptop = new javax.swing.JCheckBox();
                btnEntrar = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Parts & Bits");
                setIconImage(getIconImage());

                cbxEscritorio.setText("Escritorio");

                cbxLaptop.setText("Laptop");

                btnEntrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                btnEntrar.setText("ENTRAR");
                btnEntrar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnEntrarActionPerformed(evt);
                        }
                });

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/login_Escritorio.png"))); // NOI18N

                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/login_Laptop.png"))); // NOI18N

                jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText("PARTS & BITS");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                                .addComponent(jLabel2)
                                                .addGap(49, 49, 49))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addComponent(cbxEscritorio)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cbxLaptop, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(105, 105, 105))))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbxLaptop)
                                        .addComponent(cbxEscritorio))
                                .addGap(47, 47, 47)
                                .addComponent(btnEntrar)
                                .addGap(56, 56, 56))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
            if (cbxEscritorio.isSelected() && cbxLaptop.isSelected()) {
                GestionAmbas nuevaVentana = new GestionAmbas();
                nuevaVentana.setVisible(true);
                this.setVisible(false);
            } else if (cbxEscritorio.isSelected() && !cbxLaptop.isSelected()) {
                GestionEscritorio nuevaVentana = new GestionEscritorio(tiendas);
                nuevaVentana.setVisible(true);
                this.setVisible(false);
            } else if (!cbxEscritorio.isSelected() && cbxLaptop.isSelected()) {
                GestionLaptop nuevaVentana = new GestionLaptop();
                nuevaVentana.setVisible(true);
                this.setVisible(false);
            } else {
                String error = "Seleccione el producto requerido";
                JOptionPane.showMessageDialog(rootPane, error, "Sin seleccion", JOptionPane.ERROR_MESSAGE);
            }
        }//GEN-LAST:event_btnEntrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionLogin().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnEntrar;
        private javax.swing.JCheckBox cbxEscritorio;
        private javax.swing.JCheckBox cbxLaptop;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        // End of variables declaration//GEN-END:variables
}
