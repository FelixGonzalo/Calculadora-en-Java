package calculadora;

import java.util.ArrayList;

/**
 *
 * @author Felix Castro
 */
public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanFondo = new javax.swing.JPanel();
        jtxtPantalla = new javax.swing.JTextField();
        jbtnSuma = new javax.swing.JButton();
        jbtnResta = new javax.swing.JButton();
        jbtnDivision = new javax.swing.JButton();
        jbtnMultiplicacion = new javax.swing.JButton();
        jbtnIgual = new javax.swing.JButton();
        jbtnBorrar = new javax.swing.JButton();
        jbtnBorrarTodo = new javax.swing.JButton();
        jbtnSiete = new javax.swing.JButton();
        jbtnOcho = new javax.swing.JButton();
        jbtnNueve = new javax.swing.JButton();
        jbtnCuatro = new javax.swing.JButton();
        jbtnCinco = new javax.swing.JButton();
        jbtnSeis = new javax.swing.JButton();
        jbtnUno = new javax.swing.JButton();
        jbtnTwo = new javax.swing.JButton();
        jbtnTres = new javax.swing.JButton();
        jbtnCero = new javax.swing.JButton();
        jbtnPunto = new javax.swing.JButton();
        jbtnCerrar = new javax.swing.JButton();
        jlbMensaje = new javax.swing.JLabel();
        jlbMovimiento = new javax.swing.JLabel();
        jbtnMinimizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jpanFondo.setBackground(new java.awt.Color(172, 177, 193));
        jpanFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jtxtPantalla.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxtPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jbtnSuma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnSuma.setText("+");
        jbtnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSumaActionPerformed(evt);
            }
        });

        jbtnResta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnResta.setText("-");
        jbtnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRestaActionPerformed(evt);
            }
        });

        jbtnDivision.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnDivision.setText("/");
        jbtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivisionActionPerformed(evt);
            }
        });

        jbtnMultiplicacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnMultiplicacion.setText("*");
        jbtnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultiplicacionActionPerformed(evt);
            }
        });

        jbtnIgual.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jbtnIgual.setText("=");
        jbtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIgualActionPerformed(evt);
            }
        });

        jbtnBorrar.setBackground(new java.awt.Color(155, 191, 84));
        jbtnBorrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnBorrar.setText("C");
        jbtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBorrarActionPerformed(evt);
            }
        });

        jbtnBorrarTodo.setBackground(new java.awt.Color(247, 78, 78));
        jbtnBorrarTodo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnBorrarTodo.setText("AC");
        jbtnBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBorrarTodoActionPerformed(evt);
            }
        });

        jbtnSiete.setBackground(new java.awt.Color(245, 242, 242));
        jbtnSiete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnSiete.setText("7");
        jbtnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSieteActionPerformed(evt);
            }
        });

        jbtnOcho.setBackground(new java.awt.Color(245, 242, 242));
        jbtnOcho.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnOcho.setText("8");
        jbtnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOchoActionPerformed(evt);
            }
        });

        jbtnNueve.setBackground(new java.awt.Color(245, 242, 242));
        jbtnNueve.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnNueve.setText("9");
        jbtnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNueveActionPerformed(evt);
            }
        });

        jbtnCuatro.setBackground(new java.awt.Color(245, 242, 242));
        jbtnCuatro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnCuatro.setText("4");
        jbtnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCuatroActionPerformed(evt);
            }
        });

        jbtnCinco.setBackground(new java.awt.Color(245, 242, 242));
        jbtnCinco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnCinco.setText("5");
        jbtnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCincoActionPerformed(evt);
            }
        });

        jbtnSeis.setBackground(new java.awt.Color(245, 242, 242));
        jbtnSeis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnSeis.setText("6");
        jbtnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSeisActionPerformed(evt);
            }
        });

        jbtnUno.setBackground(new java.awt.Color(245, 242, 242));
        jbtnUno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnUno.setText("1");
        jbtnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUnoActionPerformed(evt);
            }
        });

        jbtnTwo.setBackground(new java.awt.Color(245, 242, 242));
        jbtnTwo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnTwo.setText("2");
        jbtnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTwoActionPerformed(evt);
            }
        });

        jbtnTres.setBackground(new java.awt.Color(245, 242, 242));
        jbtnTres.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnTres.setText("3");
        jbtnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTresActionPerformed(evt);
            }
        });

        jbtnCero.setBackground(new java.awt.Color(245, 242, 242));
        jbtnCero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnCero.setText("0");
        jbtnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCeroActionPerformed(evt);
            }
        });

        jbtnPunto.setBackground(new java.awt.Color(245, 242, 242));
        jbtnPunto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnPunto.setText(".");
        jbtnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPuntoActionPerformed(evt);
            }
        });

        jbtnCerrar.setBackground(new java.awt.Color(255, 51, 51));
        jbtnCerrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCerrar.setText("x");
        jbtnCerrar.setBorder(null);
        jbtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCerrarActionPerformed(evt);
            }
        });

        jlbMensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbMensaje.setForeground(new java.awt.Color(255, 51, 51));
        jlbMensaje.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jlbMovimiento.setForeground(new java.awt.Color(102, 102, 102));
        jlbMovimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbMovimiento.setText("CALCULADORA");
        jlbMovimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jlbMovimiento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jlbMovimientoMouseDragged(evt);
            }
        });
        jlbMovimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbMovimientoMousePressed(evt);
            }
        });

        jbtnMinimizar.setBackground(new java.awt.Color(23, 208, 45));
        jbtnMinimizar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtnMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnMinimizar.setText("-");
        jbtnMinimizar.setBorder(null);
        jbtnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinimizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanFondoLayout = new javax.swing.GroupLayout(jpanFondo);
        jpanFondo.setLayout(jpanFondoLayout);
        jpanFondoLayout.setHorizontalGroup(
            jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanFondoLayout.createSequentialGroup()
                        .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtPantalla)
                            .addGroup(jpanFondoLayout.createSequentialGroup()
                                .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpanFondoLayout.createSequentialGroup()
                                        .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jpanFondoLayout.createSequentialGroup()
                                                .addComponent(jbtnUno)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbtnTwo))
                                            .addGroup(jpanFondoLayout.createSequentialGroup()
                                                .addComponent(jbtnCero)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbtnPunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtnTres))
                                    .addGroup(jpanFondoLayout.createSequentialGroup()
                                        .addComponent(jbtnSiete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtnOcho))
                                    .addGroup(jpanFondoLayout.createSequentialGroup()
                                        .addComponent(jbtnBorrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtnBorrarTodo))
                                    .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jbtnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanFondoLayout.createSequentialGroup()
                                            .addComponent(jbtnCuatro)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jbtnCinco)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jbtnSeis))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpanFondoLayout.createSequentialGroup()
                                        .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jbtnResta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbtnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbtnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jbtnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanFondoLayout.createSequentialGroup()
                        .addComponent(jlbMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpanFondoLayout.setVerticalGroup(
            jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanFondoLayout.createSequentialGroup()
                .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addComponent(jbtnMinimizar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addComponent(jlbMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnBorrarTodo)
                        .addComponent(jbtnBorrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnSuma)
                        .addComponent(jbtnMultiplicacion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSiete)
                    .addComponent(jbtnOcho)
                    .addComponent(jbtnNueve)
                    .addComponent(jbtnResta)
                    .addComponent(jbtnDivision))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanFondoLayout.createSequentialGroup()
                        .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnCuatro)
                            .addComponent(jbtnCinco)
                            .addComponent(jbtnSeis))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnUno)
                            .addComponent(jbtnTwo)
                            .addComponent(jbtnTres))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnCero)
                            .addComponent(jbtnPunto))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jbtnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCeroActionPerformed
        jtxtPantalla.setText(jtxtPantalla.getText() + "0");
    }//GEN-LAST:event_jbtnCeroActionPerformed

    private void jbtnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUnoActionPerformed
        jtxtPantalla.setText(jtxtPantalla.getText() + "1");
    }//GEN-LAST:event_jbtnUnoActionPerformed

    private void jbtnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTwoActionPerformed
        jtxtPantalla.setText(jtxtPantalla.getText() + "2");
    }//GEN-LAST:event_jbtnTwoActionPerformed

    private void jbtnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTresActionPerformed
        jtxtPantalla.setText(jtxtPantalla.getText() + "3");
    }//GEN-LAST:event_jbtnTresActionPerformed

    private void jbtnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCuatroActionPerformed
        jtxtPantalla.setText(jtxtPantalla.getText() + "4");
    }//GEN-LAST:event_jbtnCuatroActionPerformed

    private void jbtnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCincoActionPerformed
        jtxtPantalla.setText(jtxtPantalla.getText() + "5");
    }//GEN-LAST:event_jbtnCincoActionPerformed

    private void jbtnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSeisActionPerformed
        jtxtPantalla.setText(jtxtPantalla.getText() + "6");
    }//GEN-LAST:event_jbtnSeisActionPerformed

    private void jbtnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSieteActionPerformed
        jtxtPantalla.setText(jtxtPantalla.getText() + "7");
    }//GEN-LAST:event_jbtnSieteActionPerformed

    private void jbtnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOchoActionPerformed
        jtxtPantalla.setText(jtxtPantalla.getText() + "8");
    }//GEN-LAST:event_jbtnOchoActionPerformed

    private void jbtnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNueveActionPerformed
        jtxtPantalla.setText(jtxtPantalla.getText() + "9");
    }//GEN-LAST:event_jbtnNueveActionPerformed

    private void jbtnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPuntoActionPerformed
        jtxtPantalla.setText(jtxtPantalla.getText() + ".");
    }//GEN-LAST:event_jbtnPuntoActionPerformed

    private void jbtnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSumaActionPerformed
        jtxtPantalla.setText(jtxtPantalla.getText() + "+");
    }//GEN-LAST:event_jbtnSumaActionPerformed

    private void jbtnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRestaActionPerformed
        jtxtPantalla.setText(jtxtPantalla.getText() + "-");
    }//GEN-LAST:event_jbtnRestaActionPerformed

    private void jbtnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultiplicacionActionPerformed
        jtxtPantalla.setText(jtxtPantalla.getText() + "*");
    }//GEN-LAST:event_jbtnMultiplicacionActionPerformed

    private void jbtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivisionActionPerformed
        jtxtPantalla.setText(jtxtPantalla.getText() + "/");
    }//GEN-LAST:event_jbtnDivisionActionPerformed

    private void jbtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBorrarActionPerformed
        String ecuacion = jtxtPantalla.getText().substring(0, jtxtPantalla.getText().length() - 1);
        jtxtPantalla.setText(ecuacion);
    }//GEN-LAST:event_jbtnBorrarActionPerformed

    private void jbtnBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBorrarTodoActionPerformed
        jtxtPantalla.setText("");
    }//GEN-LAST:event_jbtnBorrarTodoActionPerformed

    private void jbtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIgualActionPerformed
        //temp: es utilizado como variable ayuda
        //tempResultado ejemplos: "-5" "+6" "/8" "*9"
        try {
//1) Dividimos la ecuación para obtener el arrayOperNum 
            ArrayList<String> arrayOperNum = new ArrayList<>(); // ejemplo de array:  | +2 | -6 | /4 | *7 |
            String ecuacion = jtxtPantalla.getText();
            String temp = "";
            String tempOperNum = ecuacion.substring(0, 1);//Agregamos el primer número o la operación "-" o "+"
            for (int i = 1; i < ecuacion.length(); i++) {
                temp = ecuacion.substring(i, i + 1); //obtiene un caracter de la ecuación
                if (temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/")) {
                    arrayOperNum.add(tempOperNum);
                    tempOperNum = "";
                }
                tempOperNum = tempOperNum + temp;
            }
            arrayOperNum.add(tempOperNum); //Agregamos la ultima operación y variable

//1)FIN
//2) Resolvemos la Ecuación
            String tempEcuacion = ""; //Permite resolver la ecuación en partes, tiene valores como: "-5+6" "5/2" "6*9"
            String nodo; // se usa para obtener cada valor del arrayOperNum
            double tempResultado = 0; // permite obtener el valor al resolver una "tempEcuacion"
//2.1) Primero "*" y "/"
            int band = 0;//permite salir del bucle 
            do {
                band = 0;
                for (int i = 0; i < arrayOperNum.size(); i++) {
                    nodo = arrayOperNum.get(i); //obtenemos el primer valor del arrayOperNum
                    temp = nodo.substring(0, 1); // obtenemos el primer caracter del nodo, para analizar la operación 
                    if (temp.equals("*") || temp.equals("/")) {
                        tempEcuacion = arrayOperNum.get(i - 1) + nodo;//unimos un valor del array anterior a uno que tiene operación "*" o "/" ejemplo:  9 y "/2"
                        if (temp.equals("*")) { // resolvemos la "tempEcuacion" acorde a la operacion
                            String numeros[] = tempEcuacion.split("\\*"); // se usa un metodo "split" que separa un String utilizando en este caso "*" como separador
                            tempResultado = Double.parseDouble(numeros[0]) * Double.parseDouble(numeros[1]); //el metodo parseDouble convierte un String en double
                        } else if (temp.equals("/")) {
                            String numeros[] = tempEcuacion.split("\\/"); // el separador en este caso se acompaña con "\\" por  que "/" es un caracter especial
                            tempResultado = Double.parseDouble(numeros[0]) / Double.parseDouble(numeros[1]);
                        }
                        if (tempResultado > 0) {//verificamos que tenga una operación cada valor, en el caso que el tempResultado se ubique en el centro de la ecuación
                            temp = "+" + tempResultado; // mostramos el +
                            arrayOperNum.set(i, temp); //establecemos eltempResultado dentro del array
                        } else {
                            arrayOperNum.set(i, Double.toString(tempResultado));// para negativos no es necesario
                        }
                        arrayOperNum.remove(i - 1); //eliminamos el valor anterior que usamos en la tempEcuacion
                        break; //salimos del FOR al resolver una "tempEcuacion"
                    }

                }

                for (String string : arrayOperNum) { //Verifica que en la ecuación no hay "*" ni "/"
                    temp = string.substring(0, 1);
                    if (temp.equals("*") || temp.equals("/")) {
                        band = 1;
                    }
                }
            } while (band == 1);
//2.1)FIN
//2.2) operaciones "+" y "-"
            do {
                if (arrayOperNum.get(0).substring(0, 1).equals("+")) { //Se quita el simbolo "+" en el primer valor del array por que genera errores al usar el metodo "split" más adelante
                    arrayOperNum.set(0, arrayOperNum.get(0).substring(1)); //se usa el metodo "substring" para quitar el primer caracter
                }
                for (int i = 1; i < arrayOperNum.size(); i++) {
                    nodo = arrayOperNum.get(i); //obtenemos el primer valor del arrayOperNum
                    temp = nodo.substring(0, 1); // obtenemos el primer caracter del nodo, para analizar la operación 
                    if (temp.equals("+") || temp.equals("-")) {
                        tempEcuacion = arrayOperNum.get(i - 1) + nodo;//unimos un valor del array anterior a uno que tiene operación "+" o "-" ejemplo:  9 y "-2"
                        if (temp.equals("+")) {
                            String numeros[] = tempEcuacion.split("\\+");
                            tempResultado = Double.parseDouble(numeros[0]) + Double.parseDouble(numeros[1]);
                        } else if (temp.equals("-")) {
                            String numeros[] = tempEcuacion.split("\\-");
                            if (numeros.length == 3) { // controla cuando un valor tiene simbolo "-" y no se puede convertir a double
                                tempResultado = Double.parseDouble(numeros[1]) * -1 - Double.parseDouble(numeros[2]);
                            } else {
                                tempResultado = Double.parseDouble(numeros[0]) - Double.parseDouble(numeros[1]);
                            }
                        }
                        if (tempResultado > 0) {
                            temp = "+" + tempResultado;
                            arrayOperNum.set(i, temp);
                        } else {
                            arrayOperNum.set(i, Double.toString(tempResultado));
                        }
                        arrayOperNum.remove(i - 1);
                        break;
                    }
                }

            } while (arrayOperNum.size() > 1); // no se usa "band" por que debe terminar al tener un solo valor en el array, es decir el resultado final
//2.2)FIN
            jlbMensaje.setText(jtxtPantalla.getText()); // mostramos la operación en pantalla
            jtxtPantalla.setText(arrayOperNum.get(0)); //mostramos el resultado en pantalla (el unico valor del arrayOperNum)
        } catch (Exception e) {
            jlbMensaje.setText("No Entiendo !!");
        }

    }//GEN-LAST:event_jbtnIgualActionPerformed

    private void jbtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnCerrarActionPerformed

    private void jbtnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jbtnMinimizarActionPerformed

//Movimiento de la ventana
    int x, y;
    private void jlbMovimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbMovimientoMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jlbMovimientoMousePressed

    private void jlbMovimientoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbMovimientoMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jlbMovimientoMouseDragged

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnBorrar;
    private javax.swing.JButton jbtnBorrarTodo;
    private javax.swing.JButton jbtnCero;
    private javax.swing.JButton jbtnCerrar;
    private javax.swing.JButton jbtnCinco;
    private javax.swing.JButton jbtnCuatro;
    private javax.swing.JButton jbtnDivision;
    private javax.swing.JButton jbtnIgual;
    private javax.swing.JButton jbtnMinimizar;
    private javax.swing.JButton jbtnMultiplicacion;
    private javax.swing.JButton jbtnNueve;
    private javax.swing.JButton jbtnOcho;
    private javax.swing.JButton jbtnPunto;
    private javax.swing.JButton jbtnResta;
    private javax.swing.JButton jbtnSeis;
    private javax.swing.JButton jbtnSiete;
    private javax.swing.JButton jbtnSuma;
    private javax.swing.JButton jbtnTres;
    private javax.swing.JButton jbtnTwo;
    private javax.swing.JButton jbtnUno;
    private javax.swing.JLabel jlbMensaje;
    private javax.swing.JLabel jlbMovimiento;
    private javax.swing.JPanel jpanFondo;
    private javax.swing.JTextField jtxtPantalla;
    // End of variables declaration//GEN-END:variables
}
