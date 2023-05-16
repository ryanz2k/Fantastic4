/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IMS;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Raidi
 */
public class CustomerOrder extends javax.swing.JFrame {

    /**
     * Creates new form CustomerOrder
     */
    public CustomerOrder() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        productname = new javax.swing.JTextField();
        productquantity = new javax.swing.JTextField();
        productprice = new javax.swing.JTextField();
        producttotalprice = new javax.swing.JTextField();
        calculatetotalprice = new javax.swing.JButton();
        addtocart = new javax.swing.JButton();
        backtoprofile = new javax.swing.JButton();
        schwarzbier = new javax.swing.JButton();
        bourbonwhisky = new javax.swing.JButton();
        fruitvodka = new javax.swing.JButton();
        chardonnaywine = new javax.swing.JButton();
        plymouthgin = new javax.swing.JButton();
        plainvodka = new javax.swing.JButton();
        cabernetsauvignonwine = new javax.swing.JButton();
        oldtomgin = new javax.swing.JButton();
        distilledsoju = new javax.swing.JButton();
        stoutbeer = new javax.swing.JButton();
        sweetcider = new javax.swing.JButton();
        navyrum = new javax.swing.JButton();
        scotchwhisky = new javax.swing.JButton();
        bittercider = new javax.swing.JButton();
        rhumagricole = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customercart = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(740, 700));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Shop");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Product:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Quantity:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Price:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Total Price:");

        productname.setEditable(false);
        productname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productname.setPreferredSize(new java.awt.Dimension(72, 25));

        productquantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productquantity.setPreferredSize(new java.awt.Dimension(72, 25));

        productprice.setEditable(false);
        productprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productprice.setPreferredSize(new java.awt.Dimension(72, 25));

        producttotalprice.setEditable(false);
        producttotalprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        producttotalprice.setPreferredSize(new java.awt.Dimension(72, 25));

        calculatetotalprice.setText("Calculate Price");
        calculatetotalprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatetotalpriceActionPerformed(evt);
            }
        });

        addtocart.setText("Add to Cart");
        addtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtocartActionPerformed(evt);
            }
        });

        backtoprofile.setText("Back to Profile");
        backtoprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtoprofileActionPerformed(evt);
            }
        });

        schwarzbier.setText("Schwarzbier");
        schwarzbier.setPreferredSize(new java.awt.Dimension(120, 50));
        schwarzbier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schwarzbierActionPerformed(evt);
            }
        });

        bourbonwhisky.setText("Bourbon Whisky");
        bourbonwhisky.setPreferredSize(new java.awt.Dimension(120, 50));
        bourbonwhisky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bourbonwhiskyActionPerformed(evt);
            }
        });

        fruitvodka.setText("Fruit Vodka");
        fruitvodka.setPreferredSize(new java.awt.Dimension(120, 50));
        fruitvodka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruitvodkaActionPerformed(evt);
            }
        });

        chardonnaywine.setText("Chardonnay Wine");
        chardonnaywine.setPreferredSize(new java.awt.Dimension(120, 50));
        chardonnaywine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chardonnaywineActionPerformed(evt);
            }
        });

        plymouthgin.setText("Plymouth Gin");
        plymouthgin.setPreferredSize(new java.awt.Dimension(120, 50));
        plymouthgin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plymouthginActionPerformed(evt);
            }
        });

        plainvodka.setText("Plain Vodka");
        plainvodka.setPreferredSize(new java.awt.Dimension(120, 50));
        plainvodka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plainvodkaActionPerformed(evt);
            }
        });

        cabernetsauvignonwine.setText("Cabernet Sauvignon Wine");
        cabernetsauvignonwine.setPreferredSize(new java.awt.Dimension(120, 50));
        cabernetsauvignonwine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cabernetsauvignonwineActionPerformed(evt);
            }
        });

        oldtomgin.setText("Old Tom Gin");
        oldtomgin.setPreferredSize(new java.awt.Dimension(120, 50));
        oldtomgin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldtomginActionPerformed(evt);
            }
        });

        distilledsoju.setText("Distilled Soju");
        distilledsoju.setPreferredSize(new java.awt.Dimension(120, 50));
        distilledsoju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distilledsojuActionPerformed(evt);
            }
        });

        stoutbeer.setText("Stout Beer");
        stoutbeer.setPreferredSize(new java.awt.Dimension(120, 50));
        stoutbeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoutbeerActionPerformed(evt);
            }
        });

        sweetcider.setText("Sweet Cider");
        sweetcider.setPreferredSize(new java.awt.Dimension(120, 50));
        sweetcider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sweetciderActionPerformed(evt);
            }
        });

        navyrum.setText("Navy Rum");
        navyrum.setPreferredSize(new java.awt.Dimension(120, 50));
        navyrum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navyrumActionPerformed(evt);
            }
        });

        scotchwhisky.setText("Scotch Whisky");
        scotchwhisky.setPreferredSize(new java.awt.Dimension(120, 50));
        scotchwhisky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scotchwhiskyActionPerformed(evt);
            }
        });

        bittercider.setText("Bitter Cider");
        bittercider.setPreferredSize(new java.awt.Dimension(120, 50));
        bittercider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitterciderActionPerformed(evt);
            }
        });

        rhumagricole.setText("Rhum Agricole");
        rhumagricole.setPreferredSize(new java.awt.Dimension(120, 50));
        rhumagricole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rhumagricoleActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cart");

        customercart.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        customercart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quantity", "Price", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customercart);
        if (customercart.getColumnModel().getColumnCount() > 0) {
            customercart.getColumnModel().getColumn(0).setResizable(false);
            customercart.getColumnModel().getColumn(1).setResizable(false);
            customercart.getColumnModel().getColumn(2).setResizable(false);
            customercart.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(calculatetotalprice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addtocart))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(productname, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(productquantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(productprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(producttotalprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backtoprofile)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bourbonwhisky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(schwarzbier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fruitvodka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(plymouthgin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chardonnaywine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(plainvodka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(oldtomgin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cabernetsauvignonwine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(distilledsoju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sweetcider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stoutbeer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(navyrum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bittercider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(scotchwhisky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rhumagricole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(schwarzbier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bourbonwhisky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(fruitvodka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cabernetsauvignonwine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(oldtomgin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(distilledsoju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(stoutbeer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(sweetcider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(navyrum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(scotchwhisky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bittercider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(rhumagricole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chardonnaywine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(plymouthgin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(plainvodka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(productname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(productquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(productprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(producttotalprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calculatetotalprice)
                            .addComponent(addtocart))
                        .addGap(75, 75, 75)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backtoprofile)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtocartActionPerformed
        // adds the product to the cart
        if(productname.getText().equals("") || productquantity.getText().equals("") || productprice.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please Pick a Product!");
        }
        else if(producttotalprice.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Calculate the Total Price!");
        }
        else{
            String productpicked[] = {productname.getText(),productquantity.getText(),productprice.getText(),producttotalprice.getText()};
            
            DefaultTableModel cartlist = (DefaultTableModel)customercart.getModel();
            cartlist.addRow(productpicked);
            
            productname.setText("");
            productquantity.setText("");
            productprice.setText("");
            producttotalprice.setText("");
        }
    }//GEN-LAST:event_addtocartActionPerformed

    private void backtoprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtoprofileActionPerformed
        // on click sends user to his/her profile
        dispose();
        CustomerProfile back = new CustomerProfile();
        back.setVisible(true);
    }//GEN-LAST:event_backtoprofileActionPerformed

    private void calculatetotalpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatetotalpriceActionPerformed
        // calculate the total price of the product =(productquantity * productprice)
        int quantity = Integer.parseInt(productquantity.getText());
        int price = Integer.parseInt(productprice.getText());
        int total = quantity * price;
        
        String totalpricing = Integer.toString(total);
        producttotalprice.setText(totalpricing);
    }//GEN-LAST:event_calculatetotalpriceActionPerformed

    private void schwarzbierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schwarzbierActionPerformed
        // TODO add your handling code here:
        productname.setText("Schwarzbier");
        productquantity.setText("1");
        productprice.setText("22");
    }//GEN-LAST:event_schwarzbierActionPerformed

    private void chardonnaywineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chardonnaywineActionPerformed
        // TODO add your handling code here:
        productname.setText("Chardonnay Wine");
        productquantity.setText("1");
        productprice.setText("24");
    }//GEN-LAST:event_chardonnaywineActionPerformed

    private void cabernetsauvignonwineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cabernetsauvignonwineActionPerformed
        // TODO add your handling code here:
        productname.setText("Cabernet Sauvignon Wine");
        productquantity.setText("1");
        productprice.setText("26");
    }//GEN-LAST:event_cabernetsauvignonwineActionPerformed

    private void stoutbeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoutbeerActionPerformed
        // TODO add your handling code here:
        productname.setText("Stout Beer");
        productquantity.setText("1");
        productprice.setText("18");
    }//GEN-LAST:event_stoutbeerActionPerformed

    private void scotchwhiskyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scotchwhiskyActionPerformed
        // TODO add your handling code here:
        productname.setText("Scotch Whisky");
        productquantity.setText("1");
        productprice.setText("39");
    }//GEN-LAST:event_scotchwhiskyActionPerformed

    private void bourbonwhiskyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bourbonwhiskyActionPerformed
        // TODO add your handling code here:
        productname.setText("Bourbon Whisky");
        productquantity.setText("1");
        productprice.setText("28");
    }//GEN-LAST:event_bourbonwhiskyActionPerformed

    private void plymouthginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plymouthginActionPerformed
        // TODO add your handling code here:
        productname.setText("Plymouth Gin");
        productquantity.setText("1");
        productprice.setText("28");
    }//GEN-LAST:event_plymouthginActionPerformed

    private void oldtomginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldtomginActionPerformed
        // TODO add your handling code here:
        productname.setText("Old Tom Gin");
        productquantity.setText("1");
        productprice.setText("32");
    }//GEN-LAST:event_oldtomginActionPerformed

    private void sweetciderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sweetciderActionPerformed
        // TODO add your handling code here:
        productname.setText("Sweet Cider");
        productquantity.setText("1");
        productprice.setText("18");
    }//GEN-LAST:event_sweetciderActionPerformed

    private void bitterciderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bitterciderActionPerformed
        // TODO add your handling code here:
        productname.setText("Bitter Cider");
        productquantity.setText("1");
        productprice.setText("18");
    }//GEN-LAST:event_bitterciderActionPerformed

    private void fruitvodkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruitvodkaActionPerformed
        // TODO add your handling code here:
        productname.setText("Fruit Vodka");
        productquantity.setText("1");
        productprice.setText("24");
    }//GEN-LAST:event_fruitvodkaActionPerformed

    private void plainvodkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plainvodkaActionPerformed
        // TODO add your handling code here:
        productname.setText("Plain Vodka");
        productquantity.setText("1");
        productprice.setText("23");
    }//GEN-LAST:event_plainvodkaActionPerformed

    private void distilledsojuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distilledsojuActionPerformed
        // TODO add your handling code here:
        productname.setText("Distilled Soju");
        productquantity.setText("1");
        productprice.setText("24");
    }//GEN-LAST:event_distilledsojuActionPerformed

    private void navyrumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navyrumActionPerformed
        // TODO add your handling code here:
        productname.setText("Navy Rum");
        productquantity.setText("1");
        productprice.setText("24");
    }//GEN-LAST:event_navyrumActionPerformed

    private void rhumagricoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rhumagricoleActionPerformed
        // TODO add your handling code here:
        productname.setText("Rhum Agricole");
        productquantity.setText("1");
        productprice.setText("42");
    }//GEN-LAST:event_rhumagricoleActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtocart;
    private javax.swing.JButton backtoprofile;
    private javax.swing.JButton bittercider;
    private javax.swing.JButton bourbonwhisky;
    private javax.swing.JButton cabernetsauvignonwine;
    private javax.swing.JButton calculatetotalprice;
    private javax.swing.JButton chardonnaywine;
    private javax.swing.JTable customercart;
    private javax.swing.JButton distilledsoju;
    private javax.swing.JButton fruitvodka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton navyrum;
    private javax.swing.JButton oldtomgin;
    private javax.swing.JButton plainvodka;
    private javax.swing.JButton plymouthgin;
    private javax.swing.JTextField productname;
    private javax.swing.JTextField productprice;
    private javax.swing.JTextField productquantity;
    private javax.swing.JTextField producttotalprice;
    private javax.swing.JButton rhumagricole;
    private javax.swing.JButton schwarzbier;
    private javax.swing.JButton scotchwhisky;
    private javax.swing.JButton stoutbeer;
    private javax.swing.JButton sweetcider;
    // End of variables declaration//GEN-END:variables
}
