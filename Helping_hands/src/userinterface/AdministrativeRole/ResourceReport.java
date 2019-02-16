/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import static Business.EcoSystem.path;
import Business.Enterprise.Enterprise;
import Business.Enterprise.NGOEnterprise;
import Business.Resources.EducationResource;
import Business.Resources.FoodResource;
import Business.Resources.HealthResource;
import Business.Resources.MoneyResource;
import Business.Resources.Resource;
import Business.Utility.Exporter;
import java.awt.CardLayout;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.MainPanel;

/**
 *
 * @author arpit
 */
public class ResourceReport extends javax.swing.JPanel {
private JPanel userProcessContainer;
    Map<String, List<Resource>> resourcesOffered;
     private EcoSystem system;
    private Enterprise enterprise;
     private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form ResourceReport
     */
    public ResourceReport(JPanel userProcessContainer,Map<String, List<Resource>> resourcesOffered) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.resourcesOffered=resourcesOffered;
        
        populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void populate()
    {
    
     DefaultTableModel model = (DefaultTableModel) resourceTable.getModel();

        model.setRowCount(0);   
    
    for (Map.Entry<String, List<Resource>> resourceList : resourcesOffered.entrySet()) {
        if(resourceList.getKey().equalsIgnoreCase("Food")){
            if(!(resourceList.getValue().size()==0))
            {
            for (Resource resources : resourceList.getValue()){ 
                { 
                Object row[] = new Object[10];
                row[0] = resourceList.getKey();
                row[1]= "NA";
                row[2]=  "NA";
                row[3] = ((FoodResource)resources).getNumberOfFoodPackets();
                row[4] = "NA"; 
                row[5] = "NA";
                row[6]="NA";
                row[7]= "NA";
                row[8]="NA";
                row[9] = ((FoodResource)resources).getExpiryDate();
                ((DefaultTableModel) resourceTable.getModel()).addRow(row);
                }
            }
        }
        }
        
       if(resourceList.getKey().equalsIgnoreCase("Money")){
            if(!(resourceList.getValue().size()==0))
            for (Resource resources : resourceList.getValue()){ 
                { 
                Object row[] = new Object[10];
                row[0] = resourceList.getKey();
                row[1]= "NA";
                row[2]=  "NA";
                row[3] = "NA";
                row[4] = "NA"; 
                row[5] = "NA";
                row[6]="NA";
                row[7]= "NA";
                row[8]=((MoneyResource)resources).getAmount();
                row[9] = ((MoneyResource)resources).getExpiryDate();
                ((DefaultTableModel) resourceTable.getModel()).addRow(row);
                }
            }
        }
       
         if(resourceList.getKey().equalsIgnoreCase("Health")){
              if(!(resourceList.getValue().size()==0))
            for (Resource resources : resourceList.getValue()){ 
                
                { 
                Object row[] = new Object[10];
                row[0] = resourceList.getKey();
                row[1]= "NA";
                row[2]=  "NA";
                row[3] = "NA";
                row[4] = ((HealthResource)resources).getMedicineName();
                row[5] = ((HealthResource)resources).getNumberOfPackets();
                row[6]=((HealthResource)resources).getMedicineType();
                row[7]= ((HealthResource)resources).getNumberOfDoctors();
                row[8]="NA";
                row[9] = ((HealthResource)resources).getExpiryDate();
                ((DefaultTableModel) resourceTable.getModel()).addRow(row);
                }
            }
        }
    
         if(resourceList.getKey().equalsIgnoreCase("Education")){
              if(!(resourceList.getValue().size()==0))
            for (Resource resources : resourceList.getValue()){ 
                { 
                Object row[] = new Object[10];
                row[0] = resourceList.getKey();
                row[1]= ((EducationResource)resources).getNumberOfTeachers();
                row[2]=  ((EducationResource)resources).getNumberOfSupplyMaterial();
                row[3] = "NA";
                row[4] = "NA"; 
                row[5] = "NA";
                row[6]="NA";
                row[7]= "NA";
                row[8]="NA";
                row[9] = ((EducationResource)resources).getExpiryDate();
                ((DefaultTableModel) resourceTable.getModel()).addRow(row);
                }
            }
        }
         
    }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        resourceTable = new javax.swing.JTable();
        exportToexcel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buttonDashboard = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        raiseCSRRequestButton = new javax.swing.JPanel();
        ngoFunctionLabel = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        manageUserAccount = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        manageResourceButton = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        viewRequestsButton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        manageEmployeeButton = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        manageReport = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        viewResourceRequestsButton = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resourceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Resource Type", "No. of Teacher ", "No. of Education Suppliers", "No. of Food Packets", "Name of Medicine", "No. of Medicine", "Medicine Type", "No. of Doctors", "Money offered in USD", "Expiry date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(resourceTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 1320, 113));

        exportToexcel.setBackground(new java.awt.Color(0, 0, 0));
        exportToexcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportToexcelMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("EXPORT TO EXCEL");

        javax.swing.GroupLayout exportToexcelLayout = new javax.swing.GroupLayout(exportToexcel);
        exportToexcel.setLayout(exportToexcelLayout);
        exportToexcelLayout.setHorizontalGroup(
            exportToexcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exportToexcelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        exportToexcelLayout.setVerticalGroup(
            exportToexcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exportToexcelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(exportToexcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 440, 210, 50));

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("BACK");

        javax.swing.GroupLayout backLayout = new javax.swing.GroupLayout(back);
        back.setLayout(backLayout);
        backLayout.setHorizontalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        backLayout.setVerticalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 440, -1, 50));
        add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 60, 50));

        jLabel9.setBackground(new java.awt.Color(22, 16, 16));
        jLabel9.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(22, 16, 16));
        jLabel9.setText("MANAGE REPORTS");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 500, 70));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 2320, 13));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 13, -1, -1));

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel21.setText("a corporate social responsiblity request");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 320, -1));

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel23.setText("Click on \"Raise CSR request\"  to raise ");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 320, 26));

        jLabel28.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel28.setText("Click on \"Manage user account\"  to view and");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 340, 30));

        jLabel29.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel29.setText("  and update the user information.");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 320, 20));
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 130, -1, 100));

        jLabel31.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel31.setText("Click on \"Manage organization and employee\" ");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 350, 26));

        jLabel32.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel32.setText(" to add organization or employee");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 320, -1));

        jLabel34.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel34.setText("Click on \"Manage resource\"  to manage");
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 320, 26));

        jLabel35.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel35.setText("the resource of corporate");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 320, -1));

        jLabel41.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel41.setText("Click on \"Manage user account\"  to view and");
        jPanel3.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 50, 340, 30));

        jLabel42.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel42.setText("  and update the user information.");
        jPanel3.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 80, 320, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-admin-settings-male-24.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 40, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-coins-filled-50.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 60, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-plus-filled-50.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 50, 60, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-unicast-filled-50.png"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 60, 50));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-user-groups-filled-50.png"))); // NOI18N
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 60, 50));

        jLabel44.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel44.setText("Click on \"Manage Reports\"  to view and");
        jPanel3.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 150, 340, 30));

        jLabel45.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel45.setText("  and update the user information.");
        jPanel3.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 180, 320, 20));
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 150, 60, 50));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 740, 2290, 250));

        jLabel24.setBackground(new java.awt.Color(22, 16, 16));
        jLabel24.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(22, 16, 16));
        jLabel24.setText("RESOURCE REPORTS");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 140, 260, 70));

        jPanel4.setBackground(new java.awt.Color(22, 16, 16));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setBackground(new java.awt.Color(102, 102, 102));
        jLabel26.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Helping");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 13, 170, 70));

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Hands");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 13, 140, 70));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 430, 13));

        buttonDashboard.setBackground(new java.awt.Color(22, 16, 16));
        buttonDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDashboardMouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Dashboard");

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pen-tablet.png"))); // NOI18N

        javax.swing.GroupLayout buttonDashboardLayout = new javax.swing.GroupLayout(buttonDashboard);
        buttonDashboard.setLayout(buttonDashboardLayout);
        buttonDashboardLayout.setHorizontalGroup(
            buttonDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonDashboardLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
        );
        buttonDashboardLayout.setVerticalGroup(
            buttonDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonDashboardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(36, 36, 36))
            .addGroup(buttonDashboardLayout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.add(buttonDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 116, 430, 55));

        raiseCSRRequestButton.setBackground(new java.awt.Color(22, 16, 16));
        raiseCSRRequestButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                raiseCSRRequestButtonMouseClicked(evt);
            }
        });
        raiseCSRRequestButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ngoFunctionLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        ngoFunctionLabel.setForeground(new java.awt.Color(204, 204, 204));
        ngoFunctionLabel.setText("Raise CSR Request");
        raiseCSRRequestButton.add(ngoFunctionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));
        raiseCSRRequestButton.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 0, -1, 38));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coin-stack-1.png"))); // NOI18N
        raiseCSRRequestButton.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 40, 30));

        jPanel4.add(raiseCSRRequestButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 173, 430, 56));

        manageUserAccount.setBackground(new java.awt.Color(22, 16, 16));
        manageUserAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageUserAccountMouseClicked(evt);
            }
        });
        manageUserAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Manage User Account");
        manageUserAccount.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 22, -1, -1));
        manageUserAccount.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 0, -1, 90));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id-card-1.png"))); // NOI18N
        manageUserAccount.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 40, 30));

        jPanel4.add(manageUserAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 303, 430, 61));

        manageResourceButton.setBackground(new java.awt.Color(22, 16, 16));
        manageResourceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageResourceButtonMouseClicked(evt);
            }
        });
        manageResourceButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Manage Resource ");
        manageResourceButton.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));
        manageResourceButton.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, -1, 90));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user-add.png"))); // NOI18N
        manageResourceButton.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 40, 30));

        jPanel4.add(manageResourceButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 366, 430, 64));

        viewRequestsButton.setBackground(new java.awt.Color(22, 16, 16));
        viewRequestsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewRequestsButtonMouseClicked(evt);
            }
        });
        viewRequestsButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("View open request");
        viewRequestsButton.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/email-outbox.png"))); // NOI18N
        viewRequestsButton.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 40, 30));

        jPanel4.add(viewRequestsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 437, 430, 63));

        manageEmployeeButton.setBackground(new java.awt.Color(22, 16, 16));
        manageEmployeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageEmployeeButtonMouseClicked(evt);
            }
        });
        manageEmployeeButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Manage Organization and Employee");
        manageEmployeeButton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));
        manageEmployeeButton.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, -1, 90));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/building-6.png"))); // NOI18N
        manageEmployeeButton.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 40, 30));

        jPanel4.add(manageEmployeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 236, 430, 60));

        manageReport.setBackground(new java.awt.Color(204, 204, 204));
        manageReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageReportMouseClicked(evt);
            }
        });
        manageReport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Manage Reports");
        manageReport.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file-notes-document.png"))); // NOI18N
        manageReport.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 40, 30));

        jPanel4.add(manageReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 507, 430, 63));

        logoutJButton.setBackground(new java.awt.Color(22, 16, 16));
        logoutJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutJButtonMouseClicked(evt);
            }
        });
        logoutJButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(204, 204, 204));
        jLabel50.setText("Logout");
        logoutJButton.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 199, -1));
        logoutJButton.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 23, 39, -1));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lock-unlock-1.png"))); // NOI18N
        logoutJButton.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 40, 30));

        jPanel4.add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 647, 430, -1));

        viewResourceRequestsButton.setBackground(new java.awt.Color(22, 16, 16));
        viewResourceRequestsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewResourceRequestsButtonMouseClicked(evt);
            }
        });
        viewResourceRequestsButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("View Resource requests");
        viewResourceRequestsButton.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/email-outbox.png"))); // NOI18N
        viewResourceRequestsButton.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 30));

        jPanel4.add(viewResourceRequestsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 577, 406, 63));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 990));
    }// </editor-fold>//GEN-END:initComponents

    private void exportToexcelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportToexcelMouseClicked
    try {
        // TODO add your handling code here:
        
        Exporter export = new Exporter();
      Date date = new Date();
    String DATE_FORMAT = "MMddyyyyhhmmss";
    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
    
        export.exportTable(resourceTable,new File(path+"ExportResource"+sdf.format(date)+".csv"));
       
//            catch(Exception e)
//        {
//        
//             JOptionPane.showMessageDialog(null,e);
//        }
    } catch (IOException ex) {
        Logger.getLogger(ResourceReport.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_exportToexcelMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backMouseClicked

    private void buttonDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDashboardMouseClicked
        AdminWorkAreaJPanel systemAdminWorkAreaJPanel = new AdminWorkAreaJPanel(userProcessContainer, enterprise, system);
        userProcessContainer.add("systemAdminWorkAreaJPanel", systemAdminWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_buttonDashboardMouseClicked

    private void raiseCSRRequestButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_raiseCSRRequestButtonMouseClicked
        if (enterprise.getEnterpriseType().equals(NGOEnterprise.EnterpriseType.NGO)) {
            StartFundRaiser startFundRaiser = new StartFundRaiser(userProcessContainer, enterprise, system);
            userProcessContainer.add("startFundRaiser", startFundRaiser);

            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            RaiseCSRActivityJPanel raiseCsrActivityJPanel = new RaiseCSRActivityJPanel(userProcessContainer, enterprise, system);
            userProcessContainer.add("raiseCsrActivityJPanel", raiseCsrActivityJPanel);

            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_raiseCSRRequestButtonMouseClicked

    private void manageUserAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserAccountMouseClicked
        ManageUserAccountJPanel manageUserAccountJPanel = new ManageUserAccountJPanel(userProcessContainer, enterprise, system);
        userProcessContainer.add("manageUserAccountJPanel", manageUserAccountJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageUserAccountMouseClicked

    private void manageResourceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageResourceButtonMouseClicked
        ManageResourcesJPanel manageResourcesJPanel = new ManageResourcesJPanel(userProcessContainer, enterprise, system);
        userProcessContainer.add("manageResourcesJPanel", manageResourcesJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageResourceButtonMouseClicked

    private void viewRequestsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewRequestsButtonMouseClicked
        if (enterprise.getEnterpriseType().equals(NGOEnterprise.EnterpriseType.NGO)) {
            ViewFundRaiserRequestsJPanel viewRequestsJPanel = new ViewFundRaiserRequestsJPanel(userProcessContainer, enterprise, system);
            userProcessContainer.add("viewRequestsJPanel", viewRequestsJPanel);

            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            ViewCSRRequestsJPanel viewRequestsJPanel = new ViewCSRRequestsJPanel(userProcessContainer, enterprise, system);
            userProcessContainer.add("viewRequestsJPanel", viewRequestsJPanel);

            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_viewRequestsButtonMouseClicked

    private void manageEmployeeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmployeeButtonMouseClicked
        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise, system);
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeButtonMouseClicked

    private void manageReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageReportMouseClicked
        // TODO add your handling code here:
        ManageReports manageReports = new ManageReports(userProcessContainer, enterprise, system);
        userProcessContainer.add("manageReports", manageReports);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageReportMouseClicked

    private void logoutJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutJButtonMouseClicked
        userProcessContainer.removeAll();
        dB4OUtil.storeSystem(system);
        MainPanel mainJPanel = new MainPanel();
        userProcessContainer.add("mainJPanel", mainJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_logoutJButtonMouseClicked

    private void viewResourceRequestsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewResourceRequestsButtonMouseClicked

        ViewOpenResourceRequestsJPanel viewOpenResourceRequestsJPanel = new ViewOpenResourceRequestsJPanel(userProcessContainer, enterprise, system);
        userProcessContainer.add("viewOpenResourceRequestsJPanel", viewOpenResourceRequestsJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewResourceRequestsButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel back;
    private javax.swing.JPanel buttonDashboard;
    private javax.swing.JPanel exportToexcel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel logoutJButton;
    private javax.swing.JPanel manageEmployeeButton;
    private javax.swing.JPanel manageReport;
    private javax.swing.JPanel manageResourceButton;
    private javax.swing.JPanel manageUserAccount;
    private javax.swing.JLabel ngoFunctionLabel;
    private javax.swing.JPanel raiseCSRRequestButton;
    private javax.swing.JTable resourceTable;
    private javax.swing.JPanel viewRequestsButton;
    private javax.swing.JPanel viewResourceRequestsButton;
    // End of variables declaration//GEN-END:variables
}
