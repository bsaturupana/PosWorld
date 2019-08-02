package Forms;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmSalesInvoice extends javax.swing.JFrame {

    DecimalFormat currencyFormat = new DecimalFormat("#,###0.00");

    public frmSalesInvoice() {
        initComponents();

        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        lblPrivilageCard = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        lblInvoiceDate = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        lblInvoiceNumber = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTable tableSalesInvoice = new javax.swing.JTable();
        dccInvoiceDate = new com.toedter.calendar.JDateChooser();
        txtInvoiceNumber = new javax.swing.JTextField();
        txtPrivilageCard = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblcardType = new javax.swing.JLabel();
        lblBank = new javax.swing.JLabel();
        lblCardName = new javax.swing.JLabel();
        lblCardNumber = new javax.swing.JLabel();
        txtCardName = new javax.swing.JTextField();
        txtCardNumber = new javax.swing.JTextField();
        txtBankName = new javax.swing.JTextField();
        txtCardType = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        lblGrossTotal = new javax.swing.JLabel();
        lblTotalItemDiscount = new javax.swing.JLabel();
        txtTotalItemDiscount = new javax.swing.JTextField();
        txtGrossTotal = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lblspecialDiscount = new javax.swing.JLabel();
        txtSpecialDiscount = new javax.swing.JTextField();
        lblTotalDiscount = new javax.swing.JLabel();
        lblNetTotal = new javax.swing.JLabel();
        lblPaymentType = new javax.swing.JLabel();
        lblCashReceived = new javax.swing.JLabel();
        lblCreditReceived = new javax.swing.JLabel();
        txtTotalDiscount = new javax.swing.JTextField();
        txtNetTotal = new javax.swing.JTextField();
        txtCashReceived = new javax.swing.JTextField();
        txtCreditReceived = new javax.swing.JTextField();
        lblCashBalance = new javax.swing.JLabel();
        txtCashBalance = new javax.swing.JTextField();
        comboPaymentType = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SALES INVOICE");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(45, 62, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPrivilageCard.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPrivilageCard.setForeground(new java.awt.Color(255, 255, 255));
        lblPrivilageCard.setText("PRIVILAGE CARD");
        jPanel1.add(lblPrivilageCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblCustomerName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCustomerName.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerName.setText("CUSTOMER NAME");
        jPanel1.add(lblCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        lblInvoiceDate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblInvoiceDate.setForeground(new java.awt.Color(255, 255, 255));
        lblInvoiceDate.setText("INVOICE DATE");
        jPanel1.add(lblInvoiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        txtCustomerName.setBackground(new java.awt.Color(110, 122, 136));
        txtCustomerName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCustomerName.setForeground(new java.awt.Color(110, 122, 136));
        jPanel1.add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 440, 30));

        lblInvoiceNumber.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblInvoiceNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblInvoiceNumber.setText("INVOICE NUMBER");
        jPanel1.add(lblInvoiceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        tableSalesInvoice.setBackground(new java.awt.Color(110, 122, 136));
        tableSalesInvoice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableSalesInvoice.setForeground(new java.awt.Color(110, 122, 136));
        tableSalesInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CODE", "BATCH NO.", "NAME", "DISCRIPTION", "UNIT PRICE", "DISCOUNT", "QUANTITY", "SALES PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableSalesInvoice.setToolTipText("");
        tableSalesInvoice.setRowHeight(30);
        jScrollPane1.setViewportView(tableSalesInvoice);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1230, 320));
        jPanel1.add(dccInvoiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 160, 30));

        txtInvoiceNumber.setBackground(new java.awt.Color(110, 122, 136));
        txtInvoiceNumber.setForeground(new java.awt.Color(110, 122, 136));
        jPanel1.add(txtInvoiceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 180, 30));

        txtPrivilageCard.setBackground(new java.awt.Color(110, 122, 136));
        txtPrivilageCard.setForeground(new java.awt.Color(110, 122, 136));
        jPanel1.add(txtPrivilageCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 180, 30));

        btnSearch.setBackground(new java.awt.Color(53, 189, 252));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 140, 60));

        jPanel4.setBackground(new java.awt.Color(45, 62, 80));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcardType.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblcardType.setForeground(new java.awt.Color(255, 255, 255));
        lblcardType.setText("CARD TYPE");
        lblcardType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel4.add(lblcardType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 152, 30));

        lblBank.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblBank.setForeground(new java.awt.Color(255, 255, 255));
        lblBank.setText("BANK NAME");
        lblBank.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel4.add(lblBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 152, 30));

        lblCardName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCardName.setForeground(new java.awt.Color(255, 255, 255));
        lblCardName.setText("CARD NAME");
        lblCardName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel4.add(lblCardName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 152, 30));

        lblCardNumber.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCardNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblCardNumber.setText("CARD NUMBER");
        lblCardNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel4.add(lblCardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 152, 30));

        txtCardName.setBackground(new java.awt.Color(110, 122, 136));
        txtCardName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCardName.setForeground(new java.awt.Color(110, 122, 136));
        txtCardName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCardName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardNameActionPerformed(evt);
            }
        });
        jPanel4.add(txtCardName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 200, 30));

        txtCardNumber.setBackground(new java.awt.Color(110, 122, 136));
        txtCardNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCardNumber.setForeground(new java.awt.Color(110, 122, 136));
        txtCardNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCardNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardNumberActionPerformed(evt);
            }
        });
        jPanel4.add(txtCardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 200, 30));

        txtBankName.setBackground(new java.awt.Color(110, 122, 136));
        txtBankName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtBankName.setForeground(new java.awt.Color(110, 122, 136));
        txtBankName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBankName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBankNameActionPerformed(evt);
            }
        });
        jPanel4.add(txtBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 200, 30));

        txtCardType.setBackground(new java.awt.Color(110, 122, 136));
        txtCardType.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCardType.setForeground(new java.awt.Color(110, 122, 136));
        txtCardType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCardType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardTypeActionPerformed(evt);
            }
        });
        jPanel4.add(txtCardType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 200, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, -1, -1));

        jPanel6.setBackground(new java.awt.Color(45, 62, 80));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGrossTotal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblGrossTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblGrossTotal.setText("GROSS TOTAL");
        lblGrossTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel6.add(lblGrossTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 152, 30));

        lblTotalItemDiscount.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblTotalItemDiscount.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalItemDiscount.setText("TOTAL ITEM DISCOUNT");
        lblTotalItemDiscount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel6.add(lblTotalItemDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 152, 30));

        txtTotalItemDiscount.setBackground(new java.awt.Color(110, 122, 136));
        txtTotalItemDiscount.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtTotalItemDiscount.setForeground(new java.awt.Color(110, 122, 136));
        txtTotalItemDiscount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalItemDiscount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotalItemDiscount.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTotalItemDiscount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTotalItemDiscountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTotalItemDiscountFocusLost(evt);
            }
        });
        txtTotalItemDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalItemDiscountActionPerformed(evt);
            }
        });
        jPanel6.add(txtTotalItemDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 200, 30));

        txtGrossTotal.setBackground(new java.awt.Color(110, 122, 136));
        txtGrossTotal.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtGrossTotal.setForeground(new java.awt.Color(110, 122, 136));
        txtGrossTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGrossTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtGrossTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtGrossTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtGrossTotalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGrossTotalFocusLost(evt);
            }
        });
        txtGrossTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrossTotalActionPerformed(evt);
            }
        });
        jPanel6.add(txtGrossTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 200, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, -1, -1));

        jPanel5.setBackground(new java.awt.Color(45, 62, 80));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblspecialDiscount.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblspecialDiscount.setForeground(new java.awt.Color(255, 255, 255));
        lblspecialDiscount.setText("SPECIAL DISCOUNT");
        lblspecialDiscount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel5.add(lblspecialDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 152, 30));

        txtSpecialDiscount.setBackground(new java.awt.Color(110, 122, 136));
        txtSpecialDiscount.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtSpecialDiscount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSpecialDiscount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSpecialDiscount.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSpecialDiscount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSpecialDiscountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSpecialDiscountFocusLost(evt);
            }
        });
        txtSpecialDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecialDiscountActionPerformed(evt);
            }
        });
        jPanel5.add(txtSpecialDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 160, 29));

        lblTotalDiscount.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblTotalDiscount.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalDiscount.setText("TOTAL DISCOUNT");
        lblTotalDiscount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel5.add(lblTotalDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 37, 152, 30));

        lblNetTotal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblNetTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblNetTotal.setText("NET TOTAL");
        lblNetTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel5.add(lblNetTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 75, 152, 30));

        lblPaymentType.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPaymentType.setForeground(new java.awt.Color(255, 255, 255));
        lblPaymentType.setText("PAYMENT - TYPE");
        lblPaymentType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel5.add(lblPaymentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 113, 152, 30));

        lblCashReceived.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCashReceived.setForeground(new java.awt.Color(255, 255, 255));
        lblCashReceived.setText("CASH - RECEIVED");
        lblCashReceived.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel5.add(lblCashReceived, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 151, 152, 30));

        lblCreditReceived.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCreditReceived.setForeground(new java.awt.Color(255, 255, 255));
        lblCreditReceived.setText("CREDIT - RECEIVED");
        lblCreditReceived.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel5.add(lblCreditReceived, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 189, 152, 30));

        txtTotalDiscount.setBackground(new java.awt.Color(110, 122, 136));
        txtTotalDiscount.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtTotalDiscount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalDiscount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotalDiscount.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTotalDiscount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTotalDiscountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTotalDiscountFocusLost(evt);
            }
        });
        txtTotalDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalDiscountActionPerformed(evt);
            }
        });
        jPanel5.add(txtTotalDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 160, 29));

        txtNetTotal.setBackground(new java.awt.Color(110, 122, 136));
        txtNetTotal.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtNetTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNetTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNetTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNetTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNetTotalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNetTotalFocusLost(evt);
            }
        });
        txtNetTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNetTotalActionPerformed(evt);
            }
        });
        jPanel5.add(txtNetTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 160, 29));

        txtCashReceived.setBackground(new java.awt.Color(110, 122, 136));
        txtCashReceived.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCashReceived.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCashReceived.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCashReceived.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCashReceived.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCashReceivedFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCashReceivedFocusLost(evt);
            }
        });
        txtCashReceived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCashReceivedActionPerformed(evt);
            }
        });
        jPanel5.add(txtCashReceived, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 160, 29));

        txtCreditReceived.setBackground(new java.awt.Color(110, 122, 136));
        txtCreditReceived.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCreditReceived.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCreditReceived.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCreditReceived.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCreditReceived.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCreditReceivedFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCreditReceivedFocusLost(evt);
            }
        });
        txtCreditReceived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreditReceivedActionPerformed(evt);
            }
        });
        jPanel5.add(txtCreditReceived, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 160, 29));

        lblCashBalance.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCashBalance.setForeground(new java.awt.Color(255, 255, 255));
        lblCashBalance.setText("CASH - BALANCE");
        lblCashBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel5.add(lblCashBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 227, 152, 30));

        txtCashBalance.setBackground(new java.awt.Color(110, 122, 136));
        txtCashBalance.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCashBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCashBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCashBalance.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCashBalance.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCashBalanceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCashBalanceFocusLost(evt);
            }
        });
        txtCashBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCashBalanceActionPerformed(evt);
            }
        });
        jPanel5.add(txtCashBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 160, 29));

        comboPaymentType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Payment Type -", "Cash", "Bank" }));
        jPanel5.add(comboPaymentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 160, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, 336, -1));

        jPanel2.setBackground(new java.awt.Color(45, 62, 80));
        jPanel2.setToolTipText("");

        btnSave.setBackground(new java.awt.Color(53, 189, 252));
        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(53, 189, 252));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
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

        btnDelete.setBackground(new java.awt.Color(53, 189, 252));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(53, 189, 252));
        btnPrint.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("PRINT");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 690, -1, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 1250, 780));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 653, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearFields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully Saved.", "Sales Invoice", JOptionPane.INFORMATION_MESSAGE);
        clearFields();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtCardNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCardNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCardNameActionPerformed

    private void txtCardNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCardNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCardNumberActionPerformed

    private void txtBankNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBankNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBankNameActionPerformed

    private void txtCardTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCardTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCardTypeActionPerformed

    private void txtSpecialDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecialDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecialDiscountActionPerformed

    private void txtTotalDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalDiscountActionPerformed

    private void txtNetTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNetTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNetTotalActionPerformed

    private void txtCashReceivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCashReceivedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCashReceivedActionPerformed

    private void txtCreditReceivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreditReceivedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditReceivedActionPerformed

    private void txtTotalItemDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalItemDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalItemDiscountActionPerformed

    private void txtGrossTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrossTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrossTotalActionPerformed

    private void txtCashBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCashBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCashBalanceActionPerformed

    private void txtGrossTotalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGrossTotalFocusGained
        if (String.valueOf(convertDecimal(0)).equals(txtGrossTotal.getText())) {
            txtGrossTotal.setText("");
        }
    }//GEN-LAST:event_txtGrossTotalFocusGained

    private void txtTotalItemDiscountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalItemDiscountFocusGained
        if (String.valueOf(convertDecimal(0)).equals(txtTotalItemDiscount.getText())) {
            txtTotalItemDiscount.setText("");
        }
    }//GEN-LAST:event_txtTotalItemDiscountFocusGained

    private void txtSpecialDiscountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSpecialDiscountFocusGained
        if (String.valueOf(convertDecimal(0)).equals(txtSpecialDiscount.getText())) {
            txtSpecialDiscount.setText("");
        }
    }//GEN-LAST:event_txtSpecialDiscountFocusGained

    private void txtTotalDiscountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalDiscountFocusGained
        if (String.valueOf(convertDecimal(0)).equals(txtTotalDiscount.getText())) {
            txtTotalDiscount.setText("");
        }
    }//GEN-LAST:event_txtTotalDiscountFocusGained

    private void txtNetTotalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNetTotalFocusGained
        if (String.valueOf(convertDecimal(0)).equals(txtNetTotal.getText())) {
            txtNetTotal.setText("");
        }
    }//GEN-LAST:event_txtNetTotalFocusGained

    private void txtCashReceivedFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCashReceivedFocusGained
        if (String.valueOf(convertDecimal(0)).equals(txtCashReceived.getText())) {
            txtCashReceived.setText("");
        }
    }//GEN-LAST:event_txtCashReceivedFocusGained

    private void txtCreditReceivedFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCreditReceivedFocusGained
        if (String.valueOf(convertDecimal(0)).equals(txtCreditReceived.getText())) {
            txtCreditReceived.setText("");
        }
    }//GEN-LAST:event_txtCreditReceivedFocusGained

    private void txtCashBalanceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCashBalanceFocusGained
        if (String.valueOf(convertDecimal(0)).equals(txtCashBalance.getText())) {
            txtCashBalance.setText("");
        }
    }//GEN-LAST:event_txtCashBalanceFocusGained

    private void txtGrossTotalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGrossTotalFocusLost
        if (txtGrossTotal.getText().equals("")) {
            txtGrossTotal.setText(String.valueOf(convertDecimal(0)));
        } else if (txtGrossTotal.getText().equals("0")) {
            txtGrossTotal.setText(String.valueOf(convertDecimal(0)));
        }
    }//GEN-LAST:event_txtGrossTotalFocusLost

    private void txtTotalItemDiscountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalItemDiscountFocusLost
        if (txtTotalItemDiscount.getText().equals("")) {
            txtTotalItemDiscount.setText(String.valueOf(convertDecimal(0)));
        } else if (txtTotalItemDiscount.getText().equals("0")) {
            txtTotalItemDiscount.setText(String.valueOf(convertDecimal(0)));
        }
    }//GEN-LAST:event_txtTotalItemDiscountFocusLost

    private void txtSpecialDiscountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSpecialDiscountFocusLost
        if (txtSpecialDiscount.getText().equals("")) {
            txtSpecialDiscount.setText(String.valueOf(convertDecimal(0)));
        } else if (txtSpecialDiscount.getText().equals("0")) {
            txtSpecialDiscount.setText(String.valueOf(convertDecimal(0)));
        }
    }//GEN-LAST:event_txtSpecialDiscountFocusLost

    private void txtTotalDiscountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalDiscountFocusLost
        if (txtTotalDiscount.getText().equals("")) {
            txtTotalDiscount.setText(String.valueOf(convertDecimal(0)));
        } else if (txtTotalDiscount.getText().equals("0")) {
            txtTotalDiscount.setText(String.valueOf(convertDecimal(0)));
        }
    }//GEN-LAST:event_txtTotalDiscountFocusLost

    private void txtNetTotalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNetTotalFocusLost
        if (txtNetTotal.getText().equals("")) {
            txtNetTotal.setText(String.valueOf(convertDecimal(0)));
        } else if (txtNetTotal.getText().equals("0")) {
            txtNetTotal.setText(String.valueOf(convertDecimal(0)));
        }
    }//GEN-LAST:event_txtNetTotalFocusLost

    private void txtCashReceivedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCashReceivedFocusLost
        if (txtCashReceived.getText().equals("")) {
            txtCashReceived.setText(String.valueOf(convertDecimal(0)));
        } else if (txtCashReceived.getText().equals("0")) {
            txtCashReceived.setText(String.valueOf(convertDecimal(0)));
        }
    }//GEN-LAST:event_txtCashReceivedFocusLost

    private void txtCreditReceivedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCreditReceivedFocusLost
        if (txtCreditReceived.getText().equals("")) {
            txtCreditReceived.setText(String.valueOf(convertDecimal(0)));
        } else if (txtCreditReceived.getText().equals("0")) {
            txtCreditReceived.setText(String.valueOf(convertDecimal(0)));
        }
    }//GEN-LAST:event_txtCreditReceivedFocusLost

    private void txtCashBalanceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCashBalanceFocusLost
        if (txtCashBalance.getText().equals("")) {
            txtCashBalance.setText(String.valueOf(convertDecimal(0)));
        } else if (txtCashBalance.getText().equals("0")) {
            txtCashBalance.setText(String.valueOf(convertDecimal(0)));
        }
    }//GEN-LAST:event_txtCashBalanceFocusLost

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully Deleted.", "Sales Invoice", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully Printed.", "Sales Invoice", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmSalesInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSalesInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSalesInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSalesInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSalesInvoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboPaymentType;
    private com.toedter.calendar.JDateChooser dccInvoiceDate;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBank;
    private javax.swing.JLabel lblCardName;
    private javax.swing.JLabel lblCardNumber;
    private javax.swing.JLabel lblCashBalance;
    private javax.swing.JLabel lblCashReceived;
    private javax.swing.JLabel lblCreditReceived;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblGrossTotal;
    private javax.swing.JLabel lblInvoiceDate;
    private javax.swing.JLabel lblInvoiceNumber;
    private javax.swing.JLabel lblNetTotal;
    private javax.swing.JLabel lblPaymentType;
    private javax.swing.JLabel lblPrivilageCard;
    private javax.swing.JLabel lblTotalDiscount;
    private javax.swing.JLabel lblTotalItemDiscount;
    private javax.swing.JLabel lblcardType;
    private javax.swing.JLabel lblspecialDiscount;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtCardName;
    private javax.swing.JTextField txtCardNumber;
    private javax.swing.JTextField txtCardType;
    private javax.swing.JTextField txtCashBalance;
    private javax.swing.JTextField txtCashReceived;
    private javax.swing.JTextField txtCreditReceived;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtGrossTotal;
    private javax.swing.JTextField txtInvoiceNumber;
    private javax.swing.JTextField txtNetTotal;
    private javax.swing.JTextField txtPrivilageCard;
    private javax.swing.JTextField txtSpecialDiscount;
    private javax.swing.JTextField txtTotalDiscount;
    private javax.swing.JTextField txtTotalItemDiscount;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txtPrivilageCard.setText(null);
        txtCustomerName.setText(null);
        txtInvoiceNumber.setText(null);
        txtBankName.setText(null);
        txtCardName.setText(null);
        txtCardType.setText(null);
        txtCardNumber.setText(null);
        txtGrossTotal.setText(String.valueOf(convertDecimal(0)));
        txtTotalItemDiscount.setText(String.valueOf(convertDecimal(0)));
        txtSpecialDiscount.setText(String.valueOf(convertDecimal(0)));
        txtTotalDiscount.setText(String.valueOf(convertDecimal(0)));
        txtNetTotal.setText(String.valueOf(convertDecimal(0)));
        txtCashReceived.setText(String.valueOf(convertDecimal(0)));
        txtCreditReceived.setText(String.valueOf(convertDecimal(0)));
        txtCashBalance.setText(String.valueOf(convertDecimal(0)));

        dccInvoiceDate.setDate(null);

        comboPaymentType.setSelectedIndex(0);

        txtPrivilageCard.requestFocus();
    }

    private void formFormat() {
        this.setLocationRelativeTo(null);

        clearFields();
    }

    private String convertDecimal(double getValue) {
//        DecimalFormat currencyFormat = new DecimalFormat("#, ###.00");
        return currencyFormat.format(getValue);
    }
}
