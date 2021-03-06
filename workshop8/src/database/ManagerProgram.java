/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author HuanPMSE61860
 */
public class ManagerProgram extends javax.swing.JFrame {

    ItemDBAccess dbAccess = null;
    Suppliers suppliers;
    Items items;
    ItemFullModel itemModel;
    SupplierFullModel supplierModel;
    boolean addNewItem = true, addNewSupplier = true;

    /**
     * Creates new form ManagerProgram
     */
    public ManagerProgram() {
        initComponents();
        dbAccess = new ItemDBAccess();
        suppliers = new Suppliers();
        suppliers.loadFromDB(dbAccess);
        items = new Items();
        int getAll = 3;
        items.loadFromDB(dbAccess, suppliers, getAll);
        itemModel = new ItemFullModel(items);
        supplierModel = new SupplierFullModel(suppliers);
        setupModel();
    }

    public void setupModel() {
        tblItems.setModel(itemModel);
        this.cbSuppliers.setModel(new DefaultComboBoxModel(suppliers));
        tblSuppliers.setModel(supplierModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSuppliers = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtSupCode = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSupName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        chbxColloborating = new javax.swing.JCheckBox();
        btnNewSup = new javax.swing.JButton();
        btnSaveSup = new javax.swing.JButton();
        btnDeleteSup = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItems = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnNewItem = new javax.swing.JButton();
        btnSaveItem = new javax.swing.JButton();
        btnDeleteItem = new javax.swing.JButton();
        txtItemCode = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        txtUnit = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        cbSuppliers = new javax.swing.JComboBox();
        chbxSupplying = new javax.swing.JCheckBox();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manager Program");
        setResizable(false);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel8.setText("Supplier List");

        tblSuppliers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSuppliers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSuppliersMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblSuppliersMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblSuppliers);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Supplier Details"));

        jLabel9.setText("Supplier Code:");

        jLabel10.setText("Supplier Name:");

        jLabel11.setText("Address:");

        jLabel12.setText("Collaborating:");

        btnNewSup.setText("Add New");
        btnNewSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewSupActionPerformed(evt);
            }
        });

        btnSaveSup.setText("Save");
        btnSaveSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSupActionPerformed(evt);
            }
        });

        btnDeleteSup.setText("Delete");
        btnDeleteSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSupCode, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSupName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbxColloborating))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnNewSup, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveSup, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteSup, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSupCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtSupName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chbxColloborating)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewSup)
                    .addComponent(btnSaveSup)
                    .addComponent(btnDeleteSup))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Manage Suppliers", jPanel1);

        jLabel1.setText("Item List");

        tblItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemsMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblItemsMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblItems);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Item Details"));

        jLabel2.setText("Item Code:");

        jLabel3.setText("Item Name:");

        jLabel4.setText("Supplier:");

        jLabel5.setText("Unit:");

        jLabel6.setText("Price:");

        jLabel7.setText("Supplying:");

        btnNewItem.setText("Add New");
        btnNewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewItemActionPerformed(evt);
            }
        });

        btnSaveItem.setText("Save");
        btnSaveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveItemActionPerformed(evt);
            }
        });

        btnDeleteItem.setText("Delete");
        btnDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemActionPerformed(evt);
            }
        });

        cbSuppliers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtItemCode)
                    .addComponent(txtItemName)
                    .addComponent(cbSuppliers, 0, 200, Short.MAX_VALUE)
                    .addComponent(txtUnit)
                    .addComponent(txtPrice))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(chbxSupplying))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaveItem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(chbxSupplying))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewItem)
                    .addComponent(btnSaveItem)
                    .addComponent(btnDeleteItem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manage Items", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblItemsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemsMouseReleased
        int row = tblItems.getSelectedRow();
        int column = tblItems.getSelectedColumn();
        tblItems.getCellEditor(row, column).cancelCellEditing();
    }//GEN-LAST:event_tblItemsMouseReleased

    private void tblItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemsMouseClicked
        addNewItem = false;
        int pos = tblItems.getSelectedRow();
        Item item = itemModel.getItems().get(pos);
        txtItemCode.setText(item.getItemCode());
        txtItemCode.setEditable(false);
        txtItemCode.setBackground(Color.LIGHT_GRAY);
        txtItemName.setText(item.getItemName());
        int index = suppliers.find(item.getSupplier().getSupCode());
        cbSuppliers.setSelectedIndex(index);
        txtUnit.setText(item.getUnit());
        txtPrice.setText("" + item.getPrice());
        chbxSupplying.setSelected(item.isSupplying());
    }//GEN-LAST:event_tblItemsMouseClicked

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        int pos = tblItems.getSelectedRow();
        if (pos < 0 || pos >= items.size()) {
            JOptionPane.showMessageDialog(this, "Please select a row before deleting");
            return;
        }
        String itemCode = txtItemCode.getText();
        String sql = "DELETE FROM Items WHERE itemCode='" + itemCode + "'";
        String msg = "The item " + itemCode + " has been deleted from DB";
        try {
            int n = dbAccess.executeUpdate(sql);
            if (n > 0) {
                JOptionPane.showMessageDialog(this, msg);
                itemModel.getItems().removeElementAt(pos);
                tblItems.updateUI();
                tblItems.clearSelection();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnDeleteItemActionPerformed

    private void btnNewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewItemActionPerformed
        addNewItem = true;
        txtItemCode.setText("");
        txtItemCode.setEditable(true);
        txtItemCode.setBackground(Color.WHITE);
        txtItemCode.requestFocus();
        txtItemName.setText("");
        if (cbSuppliers.getItemCount() > 0) {
            cbSuppliers.setSelectedIndex(0);
        }
        txtUnit.setText("");
        txtPrice.setText("");
        chbxSupplying.setSelected(false);
        tblItems.clearSelection();
    }//GEN-LAST:event_btnNewItemActionPerformed

    private void btnSaveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveItemActionPerformed
        String itemCode = txtItemCode.getText();
        if (itemCode == null || itemCode.equals("")) {
            JOptionPane.showMessageDialog(this, "Please input code");
            return;
        }
        if (!itemCode.matches("E\\d{4}")) {
            JOptionPane.showMessageDialog(this, "Code must be Exxxx");
            return;
        }
        String itemName = txtItemName.getText();
        Supplier supplier = (Supplier) cbSuppliers.getSelectedItem();
        if (supplier == null) {
            JOptionPane.showMessageDialog(this, "Please add Supplier before adding Item");
            return;
        }
        String supCode = supplier.getSupCode();
        String unit = txtUnit.getText();
        int price = 0;
        if (txtPrice != null && !txtPrice.getText().equals("")) {
            if (!txtPrice.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Price must be number and not less than 0");
                return;
            }
            price = Integer.parseInt(txtPrice.getText());
        }
        boolean supplying = chbxSupplying.isSelected();
        Item item = new Item(itemCode, itemName, supplier, unit, price, supplying);
        String sql = "";
        try {
            if (addNewItem) {
                sql = "SELECT * FROM Items WHERE itemCode='" + itemCode + "'";
                ResultSet rs = dbAccess.executeQuery(sql);
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Item code " + itemCode + " is already existed");
                    rs.close();
                    return;
                } else {
                    sql = "INSERT INTO Items VALUES('" + itemCode + "','" + itemName
                            + "','" + supCode + "','" + unit + "','" + price + "','" + (supplying ? 1 : 0) + "')";
                    rs.close();
                }
            } else {
                sql = "UPDATE Items SET itemName='" + itemName + "',supCode='"
                        + supCode + "',unit='" + unit + "',price='" + price
                        + "',supplying='" + (supplying ? 1 : 0) + "' WHERE itemCode='" + itemCode + "'";
            }
            String msg = "An item has been added/updated";
            int n = dbAccess.executeUpdate(sql);
            if (n > 0) {
                JOptionPane.showMessageDialog(this, msg);
                if (!addNewItem) {
                    int pos = tblItems.getSelectedRow();
                    itemModel.getItems().set(pos, item);
                } else {
                    itemModel.getItems().add(item);
                }
                tblItems.updateUI();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnSaveItemActionPerformed

    private void tblSuppliersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSuppliersMouseReleased
        int row = tblSuppliers.getSelectedRow();
        int column = tblSuppliers.getSelectedColumn();
        tblSuppliers.getCellEditor(row, column).cancelCellEditing();
    }//GEN-LAST:event_tblSuppliersMouseReleased

    private void tblSuppliersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSuppliersMouseClicked
        addNewSupplier = false;
        int pos = tblSuppliers.getSelectedRow();
        Supplier supplier = supplierModel.getSuppliers().get(pos);
        txtSupCode.setText(supplier.getSupCode());
        txtSupCode.setEditable(false);
        txtSupCode.setBackground(Color.LIGHT_GRAY);
        txtSupName.setText(supplier.getSupName());
        txtAddress.setText(supplier.getAddress());
        chbxColloborating.setSelected(supplier.isColloborating());
    }//GEN-LAST:event_tblSuppliersMouseClicked

    private void btnDeleteSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSupActionPerformed
        int pos = tblSuppliers.getSelectedRow();
        if (pos < 0 || pos >= suppliers.size()) {
            JOptionPane.showMessageDialog(this, "Please select a row before deleting");
            return;
        }
        String supCode = txtSupCode.getText();
        String sql = "SELECT * FROM Items WHERE supCode='" + supCode + "'";
        try {
            ResultSet rs = dbAccess.executeQuery(sql);
            if (rs.next()) {
                int r = JOptionPane.showConfirmDialog(this, "This supplier code is currently used for some items."
                        + "\nDo you want to delete all items before delete this supplier?", "SupCode using", JOptionPane.YES_NO_OPTION);
                if (r == JOptionPane.YES_OPTION) {
                    rs.close();
                    sql = "DELETE FROM Items WHERE supCode='" + supCode + "'";
                    dbAccess.executeUpdate(sql);
                    for (int i = 0; i < items.size(); i++) {
                        if (items.get(i).getSupplier().getSupCode().equals(supCode)) {
                            itemModel.getItems().remove(i);
                            i--;
                        }
                    }
                    tblItems.updateUI();
                } else {
                    rs.close();
                    return;
                }
            }
            sql = "DELETE FROM Suppliers WHERE supCode='" + supCode + "'";
            String msg = "The supplier " + supCode + " has been deleted from DB";
            int n = dbAccess.executeUpdate(sql);
            if (n > 0) {
                JOptionPane.showMessageDialog(this, msg);
                supplierModel.getSuppliers().removeElementAt(pos);
                this.cbSuppliers.setModel(new DefaultComboBoxModel(suppliers));
                tblSuppliers.updateUI();
                tblSuppliers.clearSelection();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnDeleteSupActionPerformed

    private void btnNewSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewSupActionPerformed
        addNewSupplier = true;
        txtSupCode.setText("");
        txtSupCode.setEditable(true);
        txtSupCode.setBackground(Color.WHITE);
        txtSupCode.requestFocus();
        txtSupName.setText("");
        txtAddress.setText("");
        chbxColloborating.setSelected(false);
        tblSuppliers.clearSelection();
    }//GEN-LAST:event_btnNewSupActionPerformed

    private void btnSaveSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveSupActionPerformed
        String supCode = txtSupCode.getText();
        if (supCode == null || supCode.equals("")) {
            JOptionPane.showMessageDialog(this, "Please input code");
            return;
        }
        String supName = txtSupName.getText();
        String address = txtAddress.getText();
        boolean colloborating = chbxColloborating.isSelected();
        Supplier supplier = new Supplier(supCode, supName, address, colloborating);
        String sql = "";
        try {
            if (addNewSupplier) {
                sql = "SELECT * FROM Suppliers WHERE supCode='" + supCode + "'";
                ResultSet rs = dbAccess.executeQuery(sql);
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Supplier code " + supCode + " is already existed");
                    rs.close();
                    return;
                } else {
                    sql = "INSERT INTO Suppliers VALUES('" + supCode + "','" + supName
                            + "','" + address + "','" + (colloborating ? 1 : 0) + "')";
                    rs.close();
                }
            } else {
                sql = "UPDATE Suppliers SET supName='" + supName + "',address='"
                        + address + "',colloborating='" + (colloborating ? 1 : 0)
                        + "' WHERE supCode='" + supCode + "'";
            }
            String msg = "An supplier has been added/updated";
            int n = dbAccess.executeUpdate(sql);
            if (n > 0) {
                JOptionPane.showMessageDialog(this, msg);
                if (!addNewSupplier) {
                    int pos = tblSuppliers.getSelectedRow();
                    supplierModel.getSuppliers().set(pos, supplier);
                } else {
                    supplierModel.getSuppliers().add(supplier);
                }
                this.cbSuppliers.setModel(new DefaultComboBoxModel(suppliers));
                tblSuppliers.updateUI();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnSaveSupActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        int tab = jTabbedPane1.getSelectedIndex();
        if (tab == 0) {
            btnNewItemActionPerformed(null);
        } else {
            btnNewSupActionPerformed(null);
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

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
            java.util.logging.Logger.getLogger(ManagerProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.JButton btnDeleteSup;
    private javax.swing.JButton btnNewItem;
    private javax.swing.JButton btnNewSup;
    private javax.swing.JButton btnSaveItem;
    private javax.swing.JButton btnSaveSup;
    private javax.swing.JComboBox cbSuppliers;
    private javax.swing.JCheckBox chbxColloborating;
    private javax.swing.JCheckBox chbxSupplying;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblItems;
    private javax.swing.JTable tblSuppliers;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSupCode;
    private javax.swing.JTextField txtSupName;
    private javax.swing.JTextField txtUnit;
    // End of variables declaration//GEN-END:variables
}
