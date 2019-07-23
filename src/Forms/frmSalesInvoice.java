package Forms;

public class frmSalesInvoice extends javax.swing.JFrame {

    public frmSalesInvoice() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        tableSalesInvoice = new javax.swing.JTable();
        txtBatchNO = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtDiscription = new javax.swing.JTextField();
        txtUnitPrice = new javax.swing.JTextField();
        txtDiscount = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtsalesPrice = new javax.swing.JTextField();
        txtCode = new javax.swing.JTextField();
        dccInvoiceDate = new com.toedter.calendar.JDateChooser();
        txtInvoiceNumber = new javax.swing.JTextField();
        txtPrivilageCard = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblcardType = new javax.swing.JLabel();
        lblBank = new javax.swing.JLabel();
        lblCardName = new javax.swing.JLabel();
        lblCardNumber = new javax.swing.JLabel();
        txtCardName = new javax.swing.JTextField();
        txtCardNumber = new javax.swing.JTextField();
        txtBankName = new javax.swing.JTextField();
        txtCardType = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lblspecialDiscount = new javax.swing.JLabel();
        txtspecialDiscount = new javax.swing.JTextField();
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
        jPanel6 = new javax.swing.JPanel();
        lblGrossTotal = new javax.swing.JLabel();
        lblTotalItemDiscount = new javax.swing.JLabel();
        txtTotalItemDiscount = new javax.swing.JTextField();
        txtGrossTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SALES INVOICE");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPrivilageCard.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPrivilageCard.setText("PRIVILAGE CARD");
        jPanel1.add(lblPrivilageCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblCustomerName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblCustomerName.setText("CUSTOMER NAME");
        jPanel1.add(lblCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        lblInvoiceDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblInvoiceDate.setText("INVOICE DATE");
        jPanel1.add(lblInvoiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, -1, -1));

        txtCustomerName.setBackground(new java.awt.Color(255, 255, 150));
        txtCustomerName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 320, 30));

        lblInvoiceNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblInvoiceNumber.setText("INVOICE NUMBER");
        jPanel1.add(lblInvoiceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        tableSalesInvoice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
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
        tableSalesInvoice.setRowHeight(30);
        jScrollPane1.setViewportView(tableSalesInvoice);
        if (tableSalesInvoice.getColumnModel().getColumnCount() > 0) {
            tableSalesInvoice.getColumnModel().getColumn(5).setHeaderValue("DISCOUNT");
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1230, 330));

        txtBatchNO.setBackground(new java.awt.Color(255, 255, 150));
        txtBatchNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtBatchNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 150, 30));

        txtName.setBackground(new java.awt.Color(255, 255, 150));
        txtName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 150, 30));

        txtDiscription.setBackground(new java.awt.Color(255, 255, 150));
        txtDiscription.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtDiscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 160, 30));

        txtUnitPrice.setBackground(new java.awt.Color(255, 255, 150));
        txtUnitPrice.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 140, 30));

        txtDiscount.setBackground(new java.awt.Color(255, 255, 150));
        txtDiscount.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiscountActionPerformed(evt);
            }
        });
        jPanel1.add(txtDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 160, 30));

        txtQuantity.setBackground(new java.awt.Color(255, 255, 150));
        txtQuantity.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 150, 30));

        txtsalesPrice.setBackground(new java.awt.Color(255, 255, 150));
        txtsalesPrice.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtsalesPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 60, 170, 30));

        txtCode.setBackground(new java.awt.Color(255, 255, 150));
        txtCode.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 30));
        jPanel1.add(dccInvoiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 160, 30));

        txtInvoiceNumber.setBackground(new java.awt.Color(255, 255, 150));
        jPanel1.add(txtInvoiceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 120, 30));

        txtPrivilageCard.setBackground(new java.awt.Color(255, 255, 150));
        jPanel1.add(txtPrivilageCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 120, 30));

        btnUpdate.setBackground(new java.awt.Color(155, 194, 230));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(155, 194, 230));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(155, 194, 230));
        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(673, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcardType.setText("CARD TYPE");
        lblcardType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lblcardType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 152, 30));

        lblBank.setText("BANK NAME");
        lblBank.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lblBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 152, 30));

        lblCardName.setText("CARD NAME");
        lblCardName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lblCardName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 152, 30));

        lblCardNumber.setText("CARD NUMBER");
        lblCardNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lblCardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 152, 30));

        txtCardName.setBackground(new java.awt.Color(255, 255, 150));
        txtCardName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCardName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCardName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardNameActionPerformed(evt);
            }
        });
        jPanel4.add(txtCardName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 200, 30));

        txtCardNumber.setBackground(new java.awt.Color(255, 255, 150));
        txtCardNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCardNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCardNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardNumberActionPerformed(evt);
            }
        });
        jPanel4.add(txtCardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 200, 30));

        txtBankName.setBackground(new java.awt.Color(255, 255, 150));
        txtBankName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtBankName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBankName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBankNameActionPerformed(evt);
            }
        });
        jPanel4.add(txtBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 200, 30));

        txtCardType.setBackground(new java.awt.Color(255, 255, 150));
        txtCardType.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCardType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCardType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardTypeActionPerformed(evt);
            }
        });
        jPanel4.add(txtCardType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 200, 30));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblspecialDiscount.setText("SPECIAL DISCOUNT");
        lblspecialDiscount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(lblspecialDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 152, 30));

        txtspecialDiscount.setBackground(new java.awt.Color(255, 255, 150));
        txtspecialDiscount.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtspecialDiscount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtspecialDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtspecialDiscountActionPerformed(evt);
            }
        });
        jPanel5.add(txtspecialDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 0, 160, 29));

        lblTotalDiscount.setText("TOTAL DISCOUNT");
        lblTotalDiscount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(lblTotalDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 37, 152, 30));

        lblNetTotal.setText("NET TOTAL");
        lblNetTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(lblNetTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 75, 152, 30));

        lblPaymentType.setText("PAYMENT - TYPE");
        lblPaymentType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(lblPaymentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 113, 152, 30));

        lblCashReceived.setText("CASH - RECEIVED");
        lblCashReceived.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(lblCashReceived, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 151, 152, 30));

        lblCreditReceived.setText("CREDIT - RECEIVED");
        lblCreditReceived.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(lblCreditReceived, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 189, 152, 30));

        txtTotalDiscount.setBackground(new java.awt.Color(255, 255, 150));
        txtTotalDiscount.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtTotalDiscount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotalDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalDiscountActionPerformed(evt);
            }
        });
        jPanel5.add(txtTotalDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 39, 160, 29));

        txtNetTotal.setBackground(new java.awt.Color(255, 255, 150));
        txtNetTotal.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtNetTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNetTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNetTotalActionPerformed(evt);
            }
        });
        jPanel5.add(txtNetTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 77, 160, 29));

        txtCashReceived.setBackground(new java.awt.Color(255, 255, 150));
        txtCashReceived.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCashReceived.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCashReceived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCashReceivedActionPerformed(evt);
            }
        });
        jPanel5.add(txtCashReceived, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 153, 160, 29));

        txtCreditReceived.setBackground(new java.awt.Color(255, 255, 150));
        txtCreditReceived.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCreditReceived.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCreditReceived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreditReceivedActionPerformed(evt);
            }
        });
        jPanel5.add(txtCreditReceived, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 191, 160, 29));

        lblCashBalance.setText("CASH - BALANCE");
        lblCashBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(lblCashBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 227, 152, 30));

        txtCashBalance.setBackground(new java.awt.Color(255, 255, 150));
        txtCashBalance.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCashBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCashBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCashBalanceActionPerformed(evt);
            }
        });
        jPanel5.add(txtCashBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 229, 160, 29));

        comboPaymentType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Payment Type -" }));
        jPanel5.add(comboPaymentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 112, 160, 30));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGrossTotal.setText("GROSS TOTAL");
        lblGrossTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(lblGrossTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 152, 30));

        lblTotalItemDiscount.setText("TOTAL ITEM DISCOUNT");
        lblTotalItemDiscount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(lblTotalItemDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 152, 30));

        txtTotalItemDiscount.setBackground(new java.awt.Color(255, 255, 150));
        txtTotalItemDiscount.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtTotalItemDiscount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotalItemDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalItemDiscountActionPerformed(evt);
            }
        });
        jPanel6.add(txtTotalItemDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 200, 30));

        txtGrossTotal.setBackground(new java.awt.Color(255, 255, 150));
        txtGrossTotal.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtGrossTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtGrossTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrossTotalActionPerformed(evt);
            }
        });
        jPanel6.add(txtGrossTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1246, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
  this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearfields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       clearfields();
    }//GEN-LAST:event_btnUpdateActionPerformed

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

    private void txtspecialDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtspecialDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtspecialDiscountActionPerformed

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

    private void txtDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiscountActionPerformed

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
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
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
    private javax.swing.JTable tableSalesInvoice;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtBatchNO;
    private javax.swing.JTextField txtCardName;
    private javax.swing.JTextField txtCardNumber;
    private javax.swing.JTextField txtCardType;
    private javax.swing.JTextField txtCashBalance;
    private javax.swing.JTextField txtCashReceived;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtCreditReceived;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtDiscription;
    private javax.swing.JTextField txtGrossTotal;
    private javax.swing.JTextField txtInvoiceNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNetTotal;
    private javax.swing.JTextField txtPrivilageCard;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTotalDiscount;
    private javax.swing.JTextField txtTotalItemDiscount;
    private javax.swing.JTextField txtUnitPrice;
    private javax.swing.JTextField txtsalesPrice;
    private javax.swing.JTextField txtspecialDiscount;
    // End of variables declaration//GEN-END:variables

    private void clearfields() {
     txtPrivilageCard.setText(null);
     txtCustomerName.setText(null);
     txtInvoiceNumber.setText(null);
     txtBankName.setText(null);
     txtCardName.setText(null);
     txtCardType.setText(null);
     txtCardNumber.setText(null);
     txtGrossTotal.setText(null);
     txtTotalItemDiscount.setText(null);
     txtspecialDiscount.setText(null);
     txtTotalDiscount.setText(null);
     txtNetTotal.setText(null);
     txtCashReceived.setText(null);
     txtCreditReceived.setText(null);
     txtCashBalance.setText(null);
     
     dccInvoiceDate.setDate(null);
     
     comboPaymentType.setSelectedIndex(0);
    }
}
