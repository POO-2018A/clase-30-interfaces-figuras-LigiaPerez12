
package interfaces;

public class PrincipalFiguras extends javax.swing.JFrame {

   
    
    public PrincipalFiguras() {
        initComponents();
        this.setTitle("Interfaces");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmbxFigura = new javax.swing.JComboBox<>();
        lblElejirFigura = new javax.swing.JLabel();
        panelCuadrado = new javax.swing.JPanel();
        lblLadoC = new javax.swing.JLabel();
        txtLadoC = new javax.swing.JTextField();
        lblCuadrado = new javax.swing.JLabel();
        panelRectangulo = new javax.swing.JPanel();
        lblLadoRecA = new javax.swing.JLabel();
        lblLadoRecB = new javax.swing.JLabel();
        txtLadoRecA = new javax.swing.JTextField();
        txtLadoRecB = new javax.swing.JTextField();
        lblRectangulo = new javax.swing.JLabel();
        panelTriangulo = new javax.swing.JPanel();
        lblTriangulo = new javax.swing.JLabel();
        lblBaseT = new javax.swing.JLabel();
        lblAlturaT = new javax.swing.JLabel();
        txtBaseT = new javax.swing.JTextField();
        txtAlturaT = new javax.swing.JTextField();
        lblValorArea = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        panelCirculo = new javax.swing.JPanel();
        lblRadio = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        lblCirculo = new javax.swing.JLabel();
        lblValorPerimetro = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbxFigura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuadrado", "Rectangulo", "Triangulo", "Circulo" }));
        cmbxFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxFiguraActionPerformed(evt);
            }
        });

        lblElejirFigura.setText("Elija la Figura :");

        panelCuadrado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblLadoC.setText("Lado");

        lblCuadrado.setText("CUADRADO");

        javax.swing.GroupLayout panelCuadradoLayout = new javax.swing.GroupLayout(panelCuadrado);
        panelCuadrado.setLayout(panelCuadradoLayout);
        panelCuadradoLayout.setHorizontalGroup(
            panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadradoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblCuadrado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuadradoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLadoC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(txtLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        panelCuadradoLayout.setVerticalGroup(
            panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadradoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblCuadrado)
                .addGap(33, 33, 33)
                .addGroup(panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLadoC))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panelRectangulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblLadoRecA.setText("Lado a");

        lblLadoRecB.setText("Lado b");

        txtLadoRecB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLadoRecBActionPerformed(evt);
            }
        });

        lblRectangulo.setText("RECTANGULO");

        javax.swing.GroupLayout panelRectanguloLayout = new javax.swing.GroupLayout(panelRectangulo);
        panelRectangulo.setLayout(panelRectanguloLayout);
        panelRectanguloLayout.setHorizontalGroup(
            panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectanguloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLadoRecB)
                    .addComponent(lblLadoRecA))
                .addGap(30, 30, 30)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRectangulo)
                    .addComponent(txtLadoRecA, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLadoRecB, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRectanguloLayout.setVerticalGroup(
            panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectanguloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRectangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadoRecA)
                    .addComponent(txtLadoRecA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadoRecB)
                    .addComponent(txtLadoRecB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        panelTriangulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTriangulo.setText("TRIANGULO");

        lblBaseT.setText("Base");

        lblAlturaT.setText("Altura");

        javax.swing.GroupLayout panelTrianguloLayout = new javax.swing.GroupLayout(panelTriangulo);
        panelTriangulo.setLayout(panelTrianguloLayout);
        panelTrianguloLayout.setHorizontalGroup(
            panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrianguloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAlturaT)
                    .addComponent(lblBaseT))
                .addGap(20, 20, 20)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTriangulo)
                    .addGroup(panelTrianguloLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlturaT, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBaseT, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTrianguloLayout.setVerticalGroup(
            panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrianguloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTriangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBaseT)
                    .addComponent(txtBaseT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlturaT)
                    .addComponent(txtAlturaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblValorArea.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        panelCirculo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblRadio.setText("Radio");

        lblCirculo.setText("CIRCULO");

        javax.swing.GroupLayout panelCirculoLayout = new javax.swing.GroupLayout(panelCirculo);
        panelCirculo.setLayout(panelCirculoLayout);
        panelCirculoLayout.setHorizontalGroup(
            panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCirculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRadio)
                .addGroup(panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCirculoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblCirculo))
                    .addGroup(panelCirculoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCirculoLayout.setVerticalGroup(
            panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCirculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCirculo)
                .addGap(18, 18, 18)
                .addGroup(panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRadio))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        lblValorPerimetro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblElejirFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbxFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRectangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblValorArea, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblValorPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btnCalcular)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbxFigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblElejirFigura))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panelCuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(panelCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblValorArea, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblValorPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbxFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxFiguraActionPerformed
     
            panelCirculo.setVisible(true);
            panelTriangulo.setVisible(true);
            panelRectangulo.setVisible(true);
            panelCuadrado.setVisible(true);
        
        
        if(cmbxFigura.getSelectedItem().equals("Cuadrado")){
            panelCirculo.setVisible(false);
            panelTriangulo.setVisible(false);
            panelRectangulo.setVisible(false);
            
        }else if(cmbxFigura.getSelectedItem().equals("Rectangulo")){
            panelCirculo.setVisible(false);
            panelTriangulo.setVisible(false);
            panelCuadrado.setVisible(false);
            
        }else if(cmbxFigura.getSelectedItem().equals("Triangulo")){
            panelRectangulo.setVisible(false);
            panelCirculo.setVisible(false);
            panelCuadrado.setVisible(false);
            
        }else if(cmbxFigura.getSelectedItem().equals("Circulo")){
            panelRectangulo.setVisible(false);
            panelTriangulo.setVisible(false);
            panelCuadrado.setVisible(false);
            
        }

        
    }//GEN-LAST:event_cmbxFiguraActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
   
        if (cmbxFigura.getSelectedItem().equals("Cuadrado")) {
            Figura f1 = new Cuadrado();
            double lado = Double.parseDouble(txtLadoC.getText());
            double cuadrado = f1.calcularArea(lado,0);
            String Cuadrado = String.valueOf(cuadrado);
            lblValorArea.setText("El area del cuadrado es : "+Cuadrado+ "   m2");
            //perimetero
            double ladoP = Double.parseDouble(txtLadoC.getText());
            double cuadrado1 = f1.calcularPerimetro(ladoP,0,0);
            String CuadradoP = String.valueOf(cuadrado1);
            lblValorPerimetro.setText("El perimetro del cuadrado es : "+CuadradoP+ "   m");
            
            
        } else if (cmbxFigura.getSelectedItem().equals("Rectangulo")) {
            Figura f1 = new Rectangulo();
            double lado1 = Double.parseDouble(txtLadoRecA.getText());
            double lado2 = Double.parseDouble(txtLadoRecB.getText());
            double rectangulo = f1.calcularArea(lado1,lado2);
            String Rectangulo = String.valueOf(rectangulo);
            lblValorArea.setText("El area del rectangulo es : "+Rectangulo+ "   m2");
            //perimetro
            double lado1P = Double.parseDouble(txtLadoRecA.getText());
            double lado2P = Double.parseDouble(txtLadoRecB.getText());
            double rectanguloP = f1.calcularPerimetro(lado1P,lado2P,1);
                String RectanguloP = String.valueOf(rectanguloP);
            lblValorPerimetro.setText("El perimetro del rectangulo es : "+RectanguloP+ "   m");
            
            
        } else if (cmbxFigura.getSelectedItem().equals("Triangulo")) {
            Figura f1 = new Triangulo();
            double baseT = Double.parseDouble(txtBaseT.getText());
            double alturaT = Double.parseDouble(txtAlturaT.getText());
            double triangulo = f1.calcularArea(baseT,alturaT);
            String Triangulo = String.valueOf(triangulo);
            lblValorArea.setText("El area del triangulo es : "+Triangulo+ "   m2");
            //perimetro
            double base = Double.parseDouble(txtBaseT.getText());
            double trianguloP = f1.calcularPerimetro(base,base,base);
            String TrianguloP = String.valueOf(trianguloP);
            lblValorPerimetro.setText("El perimetro del triangulo es : "+TrianguloP+ "   m");
            
            
        } else if (cmbxFigura.getSelectedItem().equals("Circulo")) {
            Figura f1 = new Circulo();
            double radio = Double.parseDouble(txtRadio.getText());
            double circulo = f1.calcularArea(radio,0);
            String Circulo = String.valueOf(circulo);
            lblValorArea.setText("El area del circulo es : "+Circulo+ "   m2");
            //perimetro
            double radioP = Double.parseDouble(txtRadio.getText());
            double circuloP = f1.calcularPerimetro(radioP,0,0);
            String CirculoP = String.valueOf(circuloP);
            lblValorPerimetro.setText("El perimetro del circulo es : "+CirculoP+ "   m");
           
            
        } 
        
        
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtLadoRecBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLadoRecBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLadoRecBActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFiguras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cmbxFigura;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblAlturaT;
    private javax.swing.JLabel lblBaseT;
    private javax.swing.JLabel lblCirculo;
    private javax.swing.JLabel lblCuadrado;
    private javax.swing.JLabel lblElejirFigura;
    private javax.swing.JLabel lblLadoC;
    private javax.swing.JLabel lblLadoRecA;
    private javax.swing.JLabel lblLadoRecB;
    private javax.swing.JLabel lblRadio;
    private javax.swing.JLabel lblRectangulo;
    private javax.swing.JLabel lblTriangulo;
    private javax.swing.JLabel lblValorArea;
    private javax.swing.JLabel lblValorPerimetro;
    private javax.swing.JPanel panelCirculo;
    private javax.swing.JPanel panelCuadrado;
    private javax.swing.JPanel panelRectangulo;
    private javax.swing.JPanel panelTriangulo;
    private javax.swing.JTextField txtAlturaT;
    private javax.swing.JTextField txtBaseT;
    private javax.swing.JTextField txtLadoC;
    private javax.swing.JTextField txtLadoRecA;
    private javax.swing.JTextField txtLadoRecB;
    private javax.swing.JTextField txtRadio;
    // End of variables declaration//GEN-END:variables
}
