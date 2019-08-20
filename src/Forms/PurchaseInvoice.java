package Forms;

import Util.CommonFunctions;
import com.sun.glass.events.KeyEvent;
import com.sun.javafx.embed.AbstractEvents;
import static java.lang.Double.parseDouble;
import java.text.SimpleDateFormat;
import static java.time.LocalDate.now;
import java.util.Date;
import java.util.Locale;
import javafx.scene.input.KeyCode;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static org.hibernate.ejb.criteria.ValueHandlerFactory.isNumeric;

public class PurchaseInvoice extends javax.swing.JFrame {

    CommonFunctions comFunc = new CommonFunctions();

    private int dialogButton;
    private Date now;

    public PurchaseInvoice() {
        initComponents();
        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        panelFullForm = new javax.swing.JPanel();
        panelMainFields = new javax.swing.JPanel();
        lblPurchaseNumber = new javax.swing.JLabel();
        txtPurchaseNumber = new javax.swing.JTextField();
        lblPurchaseDate = new javax.swing.JLabel();
        dccPurchaseDate = new com.toedter.calendar.JDateChooser();
        lblSupplierName = new javax.swing.JLabel();
        comboSupplierName = new javax.swing.JComboBox();
        panelGridUpdate = new javax.swing.JPanel();
        lblGridUpdate = new javax.swing.JLabel();
        lblItemCode = new javax.swing.JLabel();
        txtItemCode = new javax.swing.JTextField();
        btnSearchItemCode = new javax.swing.JButton();
        lblBatchCode = new javax.swing.JLabel();
        txtBatchCode = new javax.swing.JTextField();
        btnSearchBatchCode = new javax.swing.JButton();
        lblItemName = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        btnSearchItemName = new javax.swing.JButton();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblUnitPrice = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        lblDiscount = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        lblPurchasePrice = new javax.swing.JLabel();
        txtPurchasePrice = new javax.swing.JTextField();
        lblManufactureDate = new javax.swing.JLabel();
        dcManufactureDate = new com.toedter.calendar.JDateChooser();
        lblExpiryDate = new javax.swing.JLabel();
        dcExpiryDate = new com.toedter.calendar.JDateChooser();
        btnUpdateGrid = new javax.swing.JButton();
        panelSearchByItemName = new javax.swing.JPanel();
        txtSearchByItemName = new javax.swing.JTextField();
        btnSearchByItemName = new javax.swing.JButton();
        btnSearchByItemNameClose = new javax.swing.JButton();
        scrollPaneTableSearchByItemName = new javax.swing.JScrollPane();
        tableSearchByItemName = new javax.swing.JTable();
        scrollPaneTableGRN = new javax.swing.JScrollPane();
        tablePurchaseInvoice = new javax.swing.JTable();
        panelButtonFooter = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("PURCHASE INVOICE");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);

        panelFullForm.setBackground(new java.awt.Color(45, 62, 80));
        panelFullForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMainFields.setBackground(new java.awt.Color(45, 62, 80));
        panelMainFields.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelMainFields.setForeground(new java.awt.Color(255, 255, 255));
        panelMainFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPurchaseNumber.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPurchaseNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPurchaseNumber.setText("PURCHASE NUMBER");
        panelMainFields.add(lblPurchaseNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtPurchaseNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPurchaseNumber.setForeground(new java.awt.Color(255, 255, 255));
        panelMainFields.add(txtPurchaseNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 240, 30));

        lblPurchaseDate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPurchaseDate.setForeground(new java.awt.Color(255, 255, 255));
        lblPurchaseDate.setText("PURCHASE DATE");
        panelMainFields.add(lblPurchaseDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, -1));

        dccPurchaseDate.setBackground(new java.awt.Color(110, 122, 136));
        dccPurchaseDate.setForeground(new java.awt.Color(110, 122, 136));
        dccPurchaseDate.setDateFormatString("dd/MM/yyyy");
        panelMainFields.add(dccPurchaseDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 240, 30));

        lblSupplierName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSupplierName.setForeground(new java.awt.Color(255, 255, 255));
        lblSupplierName.setText("SUPPLIER NAME");
        panelMainFields.add(lblSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        comboSupplierName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Return Purpos -" }));
        panelMainFields.add(comboSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 240, 30));

        panelFullForm.add(panelMainFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 130));

        panelGridUpdate.setBackground(new java.awt.Color(45, 62, 80));
        panelGridUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelGridUpdate.setForeground(new java.awt.Color(255, 255, 255));
        panelGridUpdate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGridUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblGridUpdate.setForeground(new java.awt.Color(255, 255, 255));
        lblGridUpdate.setText(" GRID UPDATE");
        panelGridUpdate.add(lblGridUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        lblItemCode.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblItemCode.setForeground(new java.awt.Color(255, 255, 255));
        lblItemCode.setText("ITEM CODE - [F2]");
        panelGridUpdate.add(lblItemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txtItemCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtItemCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtItemCodeFocusLost(evt);
            }
        });
        txtItemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemCodeActionPerformed(evt);
            }
        });
        txtItemCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtItemCodeKeyPressed(evt);
            }
        });
        panelGridUpdate.add(txtItemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 200, 30));

        btnSearchItemCode.setBackground(new java.awt.Color(255, 255, 255));
        btnSearchItemCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Search_Icon.jpg"))); // NOI18N
        btnSearchItemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchItemCodeActionPerformed(evt);
            }
        });
        panelGridUpdate.add(btnSearchItemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 30, 30));

        lblBatchCode.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblBatchCode.setForeground(new java.awt.Color(255, 255, 255));
        lblBatchCode.setText("BATCH CODE - [F2]");
        panelGridUpdate.add(lblBatchCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        txtBatchCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBatchCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBatchCodeFocusLost(evt);
            }
        });
        txtBatchCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatchCodeActionPerformed(evt);
            }
        });
        txtBatchCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBatchCodeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBatchCodeKeyTyped(evt);
            }
        });
        panelGridUpdate.add(txtBatchCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 200, 30));

        btnSearchBatchCode.setBackground(new java.awt.Color(255, 255, 255));
        btnSearchBatchCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Search_Icon.jpg"))); // NOI18N
        btnSearchBatchCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBatchCodeActionPerformed(evt);
            }
        });
        panelGridUpdate.add(btnSearchBatchCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 30, 30));

        lblItemName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblItemName.setForeground(new java.awt.Color(255, 255, 255));
        lblItemName.setText("ITEM NAME - [F2]");
        panelGridUpdate.add(lblItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txtItemName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtItemNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtItemNameFocusLost(evt);
            }
        });
        panelGridUpdate.add(txtItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 200, 30));

        btnSearchItemName.setBackground(new java.awt.Color(255, 255, 255));
        btnSearchItemName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Search_Icon.jpg"))); // NOI18N
        btnSearchItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchItemNameActionPerformed(evt);
            }
        });
        panelGridUpdate.add(btnSearchItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 30, 30));

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setText("QUANTITY");
        panelGridUpdate.add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        txtQuantity.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantityFocusLost(evt);
            }
        });
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantityKeyTyped(evt);
            }
        });
        panelGridUpdate.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 240, 30));

        lblUnitPrice.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUnitPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblUnitPrice.setText("UNIT PRICE");
        panelGridUpdate.add(lblUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        txtUnitPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtUnitPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUnitPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUnitPriceFocusLost(evt);
            }
        });
        txtUnitPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitPriceActionPerformed(evt);
            }
        });
        txtUnitPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnitPriceKeyTyped(evt);
            }
        });
        panelGridUpdate.add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 240, 30));

        lblDiscount.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDiscount.setForeground(new java.awt.Color(255, 255, 255));
        lblDiscount.setText("DISCOUNT");
        panelGridUpdate.add(lblDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        txtDiscount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDiscount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDiscountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDiscountFocusLost(evt);
            }
        });
        txtDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiscountKeyTyped(evt);
            }
        });
        panelGridUpdate.add(txtDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 240, 30));

        lblPurchasePrice.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPurchasePrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPurchasePrice.setText("PURCHASE PRICE");
        panelGridUpdate.add(lblPurchasePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        txtPurchasePrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPurchasePrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPurchasePriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPurchasePriceFocusLost(evt);
            }
        });
        txtPurchasePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPurchasePriceActionPerformed(evt);
            }
        });
        txtPurchasePrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPurchasePriceKeyTyped(evt);
            }
        });
        panelGridUpdate.add(txtPurchasePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 240, 30));

        lblManufactureDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblManufactureDate.setForeground(new java.awt.Color(255, 255, 255));
        lblManufactureDate.setText("MANUFACTURE DATE");
        panelGridUpdate.add(lblManufactureDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        dcManufactureDate.setDateFormatString("dd/MM/yyyy");
        dcManufactureDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dcManufactureDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dcManufactureDateFocusLost(evt);
            }
        });
        panelGridUpdate.add(dcManufactureDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 240, 30));

        lblExpiryDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblExpiryDate.setForeground(new java.awt.Color(255, 255, 255));
        lblExpiryDate.setText("EXPIRY DATE");
        panelGridUpdate.add(lblExpiryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        dcExpiryDate.setDateFormatString("dd/MM/yyyy");
        dcExpiryDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dcExpiryDateFocusLost(evt);
            }
        });
        panelGridUpdate.add(dcExpiryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 240, 30));

        btnUpdateGrid.setBackground(new java.awt.Color(53, 189, 252));
        btnUpdateGrid.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnUpdateGrid.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateGrid.setText("UPDATE");
        btnUpdateGrid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnUpdateGridFocusLost(evt);
            }
        });
        btnUpdateGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateGridActionPerformed(evt);
            }
        });
        panelGridUpdate.add(btnUpdateGrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 140, 50));

        panelFullForm.add(panelGridUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 400, 470));

        panelSearchByItemName.setBackground(new java.awt.Color(45, 62, 80));
        panelSearchByItemName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelSearchByItemName.setForeground(new java.awt.Color(255, 255, 255));
        panelSearchByItemName.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearchByItemName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchByItemNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchByItemNameFocusLost(evt);
            }
        });
        panelSearchByItemName.add(txtSearchByItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 340, 30));

        btnSearchByItemName.setBackground(new java.awt.Color(255, 255, 255));
        btnSearchByItemName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Search_Icon.jpg"))); // NOI18N
        btnSearchByItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByItemNameActionPerformed(evt);
            }
        });
        panelSearchByItemName.add(btnSearchByItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 30, 30));

        btnSearchByItemNameClose.setBackground(new java.awt.Color(53, 189, 252));
        btnSearchByItemNameClose.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSearchByItemNameClose.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchByItemNameClose.setText("CLOSE");
        btnSearchByItemNameClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByItemNameCloseActionPerformed(evt);
            }
        });
        panelSearchByItemName.add(btnSearchByItemNameClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 140, 50));

        tableSearchByItemName.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableSearchByItemName.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableSearchByItemName.setViewportView(tableSearchByItemName);

        panelSearchByItemName.add(scrollPaneTableSearchByItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 380, 310));

        panelFullForm.add(panelSearchByItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 400, 470));

        tablePurchaseInvoice.setBackground(new java.awt.Color(110, 122, 136));
        tablePurchaseInvoice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tablePurchaseInvoice.setForeground(new java.awt.Color(255, 255, 255));
        tablePurchaseInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODE", "BATCH NO", "NAME", "QUANTITY", "UNIT PRICE", "DISCOUNT", "PUR. PRICE", "MAN.DATE", "EXPIARY DATE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePurchaseInvoice.setGridColor(new java.awt.Color(45, 62, 80));
        tablePurchaseInvoice.setRowHeight(30);
        tablePurchaseInvoice.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tablePurchaseInvoice.setSelectionForeground(new java.awt.Color(255, 255, 0));
        tablePurchaseInvoice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tablePurchaseInvoiceFocusLost(evt);
            }
        });
        tablePurchaseInvoice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablePurchaseInvoiceKeyPressed(evt);
            }
        });
        scrollPaneTableGRN.setViewportView(tablePurchaseInvoice);

        panelFullForm.add(scrollPaneTableGRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 1030, 550));

        panelButtonFooter.setBackground(new java.awt.Color(45, 62, 80));

        btnSave.setBackground(new java.awt.Color(53, 189, 252));
        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnSaveFocusLost(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(53, 189, 252));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnResetFocusLost(evt);
            }
        });
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(255, 56, 29));
        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonFooterLayout = new javax.swing.GroupLayout(panelButtonFooter);
        panelButtonFooter.setLayout(panelButtonFooterLayout);
        panelButtonFooterLayout.setHorizontalGroup(
            panelButtonFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonFooterLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelButtonFooterLayout.setVerticalGroup(
            panelButtonFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonFooterLayout.createSequentialGroup()
                .addGroup(panelButtonFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelButtonFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelFullForm.add(panelButtonFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 570, 440, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFullForm, javax.swing.GroupLayout.PREFERRED_SIZE, 1469, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFullForm, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateGridActionPerformed
        checkValidationBeforeGridUpdate();
    }//GEN-LAST:event_btnUpdateGridActionPerformed

    private void txtBatchCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatchCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBatchCodeActionPerformed

    private void txtUnitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitPriceActionPerformed

    private void btnSearchItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchItemNameActionPerformed
//        new SearchByItemName().setVisible(true);
        panelSearchByItemName.setVisible(true);
        panelGridUpdate.setVisible(false);
//        JOptionPane.showMessageDialog(this, "Search successful in 'ITEM NAME'.", "Purchase Invoice", JOptionPane.INFORMATION_MESSAGE);
//        txtItemCode.requestFocus(true);
    }//GEN-LAST:event_btnSearchItemNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearFields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void tablePurchaseInvoiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablePurchaseInvoiceKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            int dialogResult = JOptionPane.showConfirmDialog(this, "Confirm to dalete the data Of selected row ?", "Purchase Invoice", JOptionPane.YES_NO_OPTION);

            if (dialogResult == JOptionPane.YES_OPTION) {
                DefaultTableModel model = (DefaultTableModel) tablePurchaseInvoice.getModel();

                int[] rows = tablePurchaseInvoice.getSelectedRows();

                for (int i = 0; i < rows.length; i++) {
                    model.removeRow(rows[i] - i);
                }
            } else {
                tablePurchaseInvoice.requestFocus(true);
            }
        }
    }//GEN-LAST:event_tablePurchaseInvoiceKeyPressed

    private void txtUnitPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnitPriceFocusLost
        txtUnitPrice.setText(String.valueOf(comFunc.checkIsEmpty(txtUnitPrice.getText(), "Currency")));
        txtDiscount.requestFocus(true);
     }//GEN-LAST:event_txtUnitPriceFocusLost

    private void txtQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusLost
        txtQuantity.setText(String.valueOf(comFunc.checkIsEmpty(txtQuantity.getText(), "Quantity")));
        txtUnitPrice.requestFocus(true);
    }//GEN-LAST:event_txtQuantityFocusLost

    private void txtQuantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusGained
        txtQuantity.selectAll();
    }//GEN-LAST:event_txtQuantityFocusGained

    private void txtUnitPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnitPriceFocusGained
        txtUnitPrice.selectAll();
    }//GEN-LAST:event_txtUnitPriceFocusGained

    private void txtItemCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtItemCodeFocusGained
        txtItemCode.selectAll();
    }//GEN-LAST:event_txtItemCodeFocusGained

    private void txtBatchCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBatchCodeFocusGained
        txtBatchCode.selectAll();
    }//GEN-LAST:event_txtBatchCodeFocusGained

    private void txtItemNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtItemNameFocusGained
        txtItemName.selectAll();
    }//GEN-LAST:event_txtItemNameFocusGained

    private void dcManufactureDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dcManufactureDateFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dcManufactureDateFocusGained

    private void txtBatchCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBatchCodeKeyPressed
//        if (isNumeric(txtBatchCode.getText()) == true) {
//            getToolkit().beep();
//            evt.consume();
//        }
    }//GEN-LAST:event_txtBatchCodeKeyPressed

    private void txtBatchCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBatchCodeKeyTyped
        if (comFunc.allowInteger(evt, txtBatchCode.getText()) == false) {
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtBatchCodeKeyTyped

    private void btnSearchBatchCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBatchCodeActionPerformed
        JOptionPane.showMessageDialog(this, "Search successful in 'BATCH CODE'.", "Purchase Invoice", JOptionPane.INFORMATION_MESSAGE);
        txtBatchCode.requestFocus(true);
    }//GEN-LAST:event_btnSearchBatchCodeActionPerformed

    private void btnSearchItemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchItemCodeActionPerformed
        JOptionPane.showMessageDialog(this, "Search successful in 'ITEM CODE'.", "Purchase Invoice", JOptionPane.INFORMATION_MESSAGE);
        txtItemCode.requestFocus(true);
    }//GEN-LAST:event_btnSearchItemCodeActionPerformed

    private void txtDiscountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiscountFocusGained
        txtDiscount.selectAll();
    }//GEN-LAST:event_txtDiscountFocusGained

    private void txtDiscountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiscountFocusLost
        txtDiscount.setText(String.valueOf(comFunc.checkIsEmpty(txtDiscount.getText(), "Currency")));
        txtPurchasePrice.requestFocus(true);
    }//GEN-LAST:event_txtDiscountFocusLost

    private void txtPurchasePriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPurchasePriceFocusGained
        txtPurchasePrice.selectAll();
    }//GEN-LAST:event_txtPurchasePriceFocusGained

    private void txtPurchasePriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPurchasePriceFocusLost
        txtPurchasePrice.setText(String.valueOf(comFunc.checkIsEmpty(txtPurchasePrice.getText(), "Currency")));
        dcManufactureDate.requestFocus(true);
    }//GEN-LAST:event_txtPurchasePriceFocusLost

    private void txtPurchasePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPurchasePriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPurchasePriceActionPerformed

    private void txtQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyTyped
        if (comFunc.restrictCharacters(evt, txtQuantity.getText()) == false) {
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtQuantityKeyTyped

    private void txtUnitPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnitPriceKeyTyped
        if (comFunc.restrictCharacters(evt, txtUnitPrice.getText()) == false) {
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtUnitPriceKeyTyped

    private void txtDiscountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountKeyTyped
        if (comFunc.restrictCharacters(evt, txtDiscount.getText()) == false) {
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtDiscountKeyTyped

    private void txtPurchasePriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPurchasePriceKeyTyped
        if (comFunc.restrictCharacters(evt, txtPurchasePrice.getText()) == false) {
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtPurchasePriceKeyTyped

    private void txtItemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemCodeActionPerformed
    }//GEN-LAST:event_txtItemCodeActionPerformed

    private void txtItemCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtItemCodeFocusLost
        txtBatchCode.requestFocus(true);
    }//GEN-LAST:event_txtItemCodeFocusLost

    private void txtItemCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemCodeKeyPressed
    }//GEN-LAST:event_txtItemCodeKeyPressed

    private void txtBatchCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBatchCodeFocusLost
        txtItemName.requestFocus(true);
    }//GEN-LAST:event_txtBatchCodeFocusLost

    private void txtItemNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtItemNameFocusLost
        txtQuantity.requestFocus(true);
    }//GEN-LAST:event_txtItemNameFocusLost

    private void txtSearchByItemNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchByItemNameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchByItemNameFocusGained

    private void txtSearchByItemNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchByItemNameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchByItemNameFocusLost

    private void btnSearchByItemNameCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByItemNameCloseActionPerformed
        panelSearchByItemName.setVisible(false);
        panelGridUpdate.setVisible(true);
    }//GEN-LAST:event_btnSearchByItemNameCloseActionPerformed

    private void btnSearchByItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchByItemNameActionPerformed

    private void dcManufactureDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dcManufactureDateFocusLost
        dcExpiryDate.requestFocus(true);
    }//GEN-LAST:event_dcManufactureDateFocusLost

    private void dcExpiryDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dcExpiryDateFocusLost
        btnUpdateGrid.requestFocus(true);
    }//GEN-LAST:event_dcExpiryDateFocusLost

    private void btnUpdateGridFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnUpdateGridFocusLost
        tablePurchaseInvoice.requestFocus(true);
    }//GEN-LAST:event_btnUpdateGridFocusLost

    private void tablePurchaseInvoiceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tablePurchaseInvoiceFocusLost
        btnSave.requestFocus(true);
    }//GEN-LAST:event_tablePurchaseInvoiceFocusLost

    private void btnSaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSaveFocusLost
        btnReset.requestFocus(true);
    }//GEN-LAST:event_btnSaveFocusLost

    private void btnResetFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnResetFocusLost
        btnClose.requestFocus(true);
    }//GEN-LAST:event_btnResetFocusLost

    private void checkValidationBeforeGridUpdate() {
        String sManufactureDate = "";
        String sExpiryDate = "";
        double sQuantity;
        double sUnitPrice;
        double sDiscount;
        double sPurchasePrice;
        boolean isUpdateGrid = false;

        if (txtItemCode.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "The 'ITEM CODE' can not be Blank.", "Purchase Invoice", JOptionPane.WARNING_MESSAGE);
            txtItemCode.requestFocus(true);
        } else if (txtBatchCode.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "The 'BATCH CODE' can not be Blank.", "Purchase Invoice", JOptionPane.WARNING_MESSAGE);
            txtBatchCode.requestFocus(true);
        } else if (txtItemName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "The 'ITEM NAME' can not be Blank.", "Purchase Invoice", JOptionPane.WARNING_MESSAGE);
            txtItemName.requestFocus(true);
        } else if (txtQuantity.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "The 'QUANTITY' can not be Blank.", "Purchase Invoice", JOptionPane.WARNING_MESSAGE);
            txtQuantity.requestFocus(true);
        } else if (txtUnitPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "The 'UNIT PRICE' can not be Blank.", "Purchase Invoice", JOptionPane.WARNING_MESSAGE);
            txtUnitPrice.requestFocus(true);
        } else if (txtDiscount.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "The 'DISCOUNT' can not be Blank.", "Purchase Invoice", JOptionPane.WARNING_MESSAGE);
            txtDiscount.requestFocus(true);
        } else if (txtPurchasePrice.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "The 'PURCHASE PRICE' can not be Blank.", "Purchase Invoice", JOptionPane.WARNING_MESSAGE);
            txtPurchasePrice.requestFocus(true);
        } else {
            sQuantity = comFunc.checkIsEmpty(txtQuantity.getText(), "Quantity");

            sUnitPrice = comFunc.checkIsEmpty(txtUnitPrice.getText(), "Currency");

            sDiscount = comFunc.checkIsEmpty(txtDiscount.getText(), "Currency");

            sPurchasePrice = comFunc.checkIsEmpty(txtPurchasePrice.getText(), "Currency");

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());

            if (dcManufactureDate.getDate() == null) {
                int replyManufactureDate = JOptionPane.showConfirmDialog(this, "'MANUFACTURE DATE' is blank or invalid format. Do you want to continue as it is ?", "Purchase Invoice", JOptionPane.YES_NO_OPTION);

                if (replyManufactureDate == JOptionPane.NO_OPTION) {
                    isUpdateGrid = false;
                    dcManufactureDate.requestFocus();
                } else {
                    sManufactureDate = "";
                }
            } else {
                sManufactureDate = sdf.format(dcManufactureDate.getDate());
            }

            if (dcExpiryDate.getDate() == null) {
                int replyExpiryDate = JOptionPane.showConfirmDialog(this, "'EXPIRY DATE' is blank or invalid format. Do you want to continue as it is ?", "Purchase Invoice", JOptionPane.YES_NO_OPTION);

                if (replyExpiryDate == JOptionPane.NO_OPTION) {
                    dcExpiryDate.requestFocus();
                    isUpdateGrid = false;
                } else {
                    sExpiryDate = "";
                }
            } else {
                sExpiryDate = sdf.format(dcExpiryDate.getDate());
            }

            if (isUpdateGrid = true) {
                updateGrid(txtItemCode.getText(), txtBatchCode.getText(), txtItemName.getText(),
                        comFunc.convertQuantity(sQuantity), comFunc.convertCurrency(sUnitPrice),
                        comFunc.convertCurrency(sDiscount), comFunc.convertCurrency(sPurchasePrice),
                        sManufactureDate, sExpiryDate);
            } else {
                JOptionPane.showMessageDialog(this, "Record will not update due to errors.", "Purchase Invoice", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PurchaseInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseInvoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearchBatchCode;
    private javax.swing.JButton btnSearchByItemName;
    private javax.swing.JButton btnSearchByItemNameClose;
    private javax.swing.JButton btnSearchItemCode;
    private javax.swing.JButton btnSearchItemName;
    private javax.swing.JButton btnUpdateGrid;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboSupplierName;
    private com.toedter.calendar.JDateChooser dcExpiryDate;
    private com.toedter.calendar.JDateChooser dcManufactureDate;
    private com.toedter.calendar.JDateChooser dccPurchaseDate;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel lblBatchCode;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblExpiryDate;
    private javax.swing.JLabel lblGridUpdate;
    private javax.swing.JLabel lblItemCode;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblManufactureDate;
    private javax.swing.JLabel lblPurchaseDate;
    private javax.swing.JLabel lblPurchaseNumber;
    private javax.swing.JLabel lblPurchasePrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JLabel lblUnitPrice;
    private javax.swing.JPanel panelButtonFooter;
    private javax.swing.JPanel panelFullForm;
    private javax.swing.JPanel panelGridUpdate;
    private javax.swing.JPanel panelMainFields;
    private javax.swing.JPanel panelSearchByItemName;
    private javax.swing.JScrollPane scrollPaneTableGRN;
    private javax.swing.JScrollPane scrollPaneTableSearchByItemName;
    private javax.swing.JTable tablePurchaseInvoice;
    private javax.swing.JTable tableSearchByItemName;
    private javax.swing.JTextField txtBatchCode;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtPurchaseNumber;
    private javax.swing.JTextField txtPurchasePrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearchByItemName;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txtPurchaseNumber.setText("");
        dccPurchaseDate.setDate(now);
        comboSupplierName.setSelectedIndex(0);

        txtItemCode.setText("");
        txtBatchCode.setText("");
        txtItemName.setText("");
        txtQuantity.setText(comFunc.convertQuantity(0));
        txtUnitPrice.setText(comFunc.convertCurrency(0));
        txtDiscount.setText(comFunc.convertQuantity(0));
        txtPurchasePrice.setText(comFunc.convertCurrency(0));
        dcManufactureDate.setDate(now);
        dcExpiryDate.setDate(now);

        txtPurchaseNumber.requestFocus();
    }

    private void formFormat() {
        this.setLocationRelativeTo(null);
        
        panelSearchByItemName.setVisible(false);

        clearFields();
    }

    private void updateGrid(String sItemCode, String sBatchCode,
            String sItemName, String sQuantity, String sUnitPrice,
            String sDiscount, String sPurchasePrice,
            String sManufactureDate, String sExpiryDate) {

        DefaultTableModel model = (DefaultTableModel) tablePurchaseInvoice.getModel();

        model.addRow(new Object[]{
            sItemCode, sBatchCode, sItemName, sQuantity, sUnitPrice,
            sDiscount, sPurchasePrice, sManufactureDate, sExpiryDate
        });
    }
}
