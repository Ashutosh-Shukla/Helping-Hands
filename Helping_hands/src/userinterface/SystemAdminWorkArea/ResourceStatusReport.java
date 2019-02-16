/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Resources.EducationResource;
import Business.Resources.FoodResource;
import Business.Resources.HealthResource;
import Business.Resources.MoneyResource;
import Business.Resources.Resource;
import Business.Utility.Exporter;
import Business.WorkQueue.ResourcesWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.AdministrativeRole.ResourceReport;

/**
 *
 * @author arpit
 */
public class ResourceStatusReport extends javax.swing.JPanel {
private JPanel userProcessContainer;
 private EcoSystem system;
    /**
     * Creates new form ResourceStatusReport
     */
    public ResourceStatusReport(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void populate()
    {
    
        DefaultTableModel model = (DefaultTableModel) resourcestatus.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            if(!(network.getWorkQueue().getWorkRequestList().size()==0))
            for ( WorkRequest request : network.getWorkQueue().getWorkRequestList()) {
                Object[] row = new Object[9];
                row[0] = network.getName();
                row[1] = request.getRequsetId();
                row[2] = ((ResourcesWorkRequest)request).getRequestDescription();
                row[3]= request.getStatus();
                
                
                row[4]=request.getSender();
                row[5]=request.getReceiver();
                row[6]=request.getRequestDate();
                row[7]=request.getResolveDate();
                    for(Resource resource : ((ResourcesWorkRequest)request).getResourceRequested())
                    { if(resource instanceof EducationResource)
                    {
                       row[8]=((EducationResource)resource).getNumberOfSupplyMaterial();
                       row[9]=((EducationResource)resource).getNumberOfTeachers();
                    }
                    if(resource instanceof FoodResource)
                    {
                       row[10]=((FoodResource)resource).getNumberOfFoodPackets();
                    }
                    if(resource instanceof HealthResource)
                    {
                       row[11]=((HealthResource)resource).getMedicineName();
                       row[12]=((HealthResource)resource).getNumberOfPackets();
                       row[13]=((HealthResource)resource).getNumberOfDoctors();
                    }
                     if(resource instanceof MoneyResource)
                    {
                       row[14]=((MoneyResource)resource).getAmount();
                    }
                    }
                
                model.addRow(row);
            }
        }
        for(int i =8;i<14;i++)
        resourcestatus.removeColumn(resourcestatus.getColumnModel().getColumn(8));

    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        resourcestatus = new javax.swing.JTable();
        exportToexcel = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resourcestatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network Name", "Resource Id", "Request Description", "Request Status", "Sender", "Receiver", "RequestDate", "Resolve Date", "Number of Study Supplies", "Number of Teachers", "Number of Food  paclets", "Medicine Name", "Number of Medicine Packets", "Number of Doctor", "Amount Requested"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(resourcestatus);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1383, 205));

        exportToexcel.setText("Export To Excel");
        exportToexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportToexcelActionPerformed(evt);
            }
        });
        add(exportToexcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1286, 295, -1, -1));

        back.setText("Button");
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 403, -1, -1));

        jLabel1.setText("**Export To excel to view details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 256, -1, 53));
    }// </editor-fold>//GEN-END:initComponents

    private void exportToexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportToexcelActionPerformed
        // TODO add your handling code here:
        try {
        Exporter export = new Exporter();
       Date date = new Date();
    String DATE_FORMAT = "MMddyyyyhhmmss";
    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
    
        export.exportTable(resourcestatus,new File("D:/Projects/AED/final project/ExportToExcel/ResourcesRequestedStatus"+sdf.format(date)+".csv"));
       
    } catch (IOException ex) {
        Logger.getLogger(ResourceReport.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_exportToexcelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton exportToexcel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable resourcestatus;
    // End of variables declaration//GEN-END:variables
}
