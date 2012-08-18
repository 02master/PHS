/*
 * chagerooms.java
 *
 * Created on March 25, 2006, 8:52 PM
 */

package phs_project;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author  nhoc
 */
public class chagerooms extends javax.swing.JDialog {
    
    /** Creates new form chagerooms */
    public chagerooms(JFrame parent,boolean check) {
        super(parent,check);
        initComponents();
         if (hotelForm.ODID==null)
        {
            JOptionPane.showMessageDialog(this,"Bạn không thể g�?i trực tiếp form này vì cần có tham số");
        }
        else 
        {
        madonhang.setText(hotelForm.ODID);
        roomInOrdershow();
        //panelChoiceRoom.setVisible(false);
        showChoiceRoom(false);
        beginDate.setLocale(new Locale("vi"));
        endDate.setLocale(new Locale("vi"));
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        madonhang = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomInOrder = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        roomOutOrder = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCusInRoom = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblFreeRoom = new javax.swing.JTable();
        chkAddRoom = new javax.swing.JRadioButton();
        panelChoiceRoom = new javax.swing.JPanel();
        beginDate = new com.toedter.calendar.JDateChooser();
        endDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtOrderDate = new javax.swing.JTextField();
        txtOrderOfCus = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Th\u00eam ph\u00f2ng,chuy\u1ec3n ph\u00f2ng ...");
        setAlwaysOnTop(true);
        jLabel1.setText("M\u00e3 \u0111\u01a1ng h\u00e0ng");

        madonhang.setEditable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh s\u00e1ch ph\u00f2ng \u0111\u00e3 c\u00f3"));
        roomInOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        roomInOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomInOrderMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(roomInOrder);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 153, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh s\u00e1ch ph\u00f2ng c\u00f3 th\u1ec3 chuy\u1ec3n"));
        roomOutOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        roomOutOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomOutOrderMouseClicked(evt);
            }
        });

        jScrollPane2.setViewportView(roomOutOrder);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
        );

        jButton1.setText("<<\u0110\u1ed5i>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Quay l\u1ea1i");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText(">>Chuy\u1ec3n>>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Kh\u00e1ch \u0111ang \u1edf"));
        tblCusInRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblCusInRoom);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh s\u00e1ch ph\u00f2ng c\u00f3 th\u1ec3 th\u00eam"));
        tblFreeRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblFreeRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFreeRoomMouseClicked(evt);
            }
        });

        jScrollPane4.setViewportView(tblFreeRoom);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 158, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
        );

        chkAddRoom.setText("T\u00ecm ph\u00f2ng tr\u1ed1ng");
        chkAddRoom.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        chkAddRoom.setMargin(new java.awt.Insets(0, 0, 0, 0));
        chkAddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAddRoomActionPerformed(evt);
            }
        });

        panelChoiceRoom.setBorder(javax.swing.BorderFactory.createTitledBorder("Ch\u1ecdn ng\u00e0y"));

        jLabel2.setText("Ng\u00e0y \u0111\u1ebfn");

        jLabel3.setText("Ng\u00e0y \u0111i");

        btnSearch.setText("T\u00ecm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panelChoiceRoomLayout = new org.jdesktop.layout.GroupLayout(panelChoiceRoom);
        panelChoiceRoom.setLayout(panelChoiceRoomLayout);
        panelChoiceRoomLayout.setHorizontalGroup(
            panelChoiceRoomLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelChoiceRoomLayout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2)
                .add(10, 10, 10)
                .add(beginDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(19, 19, 19)
                .add(jLabel3)
                .add(18, 18, 18)
                .add(endDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 155, Short.MAX_VALUE)
                .add(btnSearch)
                .add(21, 21, 21))
        );
        panelChoiceRoomLayout.setVerticalGroup(
            panelChoiceRoomLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelChoiceRoomLayout.createSequentialGroup()
                .add(14, 14, 14)
                .add(panelChoiceRoomLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel2)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, beginDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, endDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
            .add(btnSearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        jLabel4.setText("Ng\u00e0y \u0111\u1eb7t");

        jLabel5.setText("Ng\u01b0\u1eddi \u0111\u1eb7t");

        txtOrderDate.setEditable(false);

        txtOrderOfCus.setEditable(false);

        jButton4.setText("<<B\u1edbt");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnAdd.setText("Th\u00eam>>");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panelChoiceRoom, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(madonhang, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtOrderDate, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 28, Short.MAX_VALUE)
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtOrderOfCus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 224, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jButton1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(chkAddRoom)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnAdd))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton2)))
                    .add(layout.createSequentialGroup()
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(madonhang, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel4)
                        .add(txtOrderOfCus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel5)
                        .add(txtOrderDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 182, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jButton3)
                    .add(chkAddRoom)
                    .add(jButton4)
                    .add(btnAdd)
                    .add(jButton2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panelChoiceRoom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
        if (roomtochange==null) {
           JOptionPane.showMessageDialog(this,"Bạn phải ch�?n phòng cần b�? ra !");
           
       }
       else 
       {
            if ((new Integer (roomStatusID)==6)||(new Integer (roomStatusID)==8))
            {
                String sqlremoverom="delete orderdetail where [id] = '"+detailId+"'";
                new Utils().SQLRUN(sqlremoverom);
                JOptionPane.showMessageDialog(this,"Bạn vừa b�? phòng ra kh�?i đơn hàng thành công !");
                roomInOrdershow();
                
            }
            else
            {
               JOptionPane.showMessageDialog(this,"Phòng này không thể thao tác !\n Bạn phải xem lại !\n �?ang ở, đã chuyển, đã trả..");
            }
       }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tblFreeRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFreeRoomMouseClicked
// TODO add your handling code here:
        freeRoomTooAdd= new Utils().SelectedRowToString(tblFreeRoom,0);
        freeRoomTooAddName=new Utils().SelectedRowToString(tblFreeRoom,1);
    }//GEN-LAST:event_tblFreeRoomMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
// TODO add your handling code here:
        
            roomFreeToAdd(new UserFormat().getFormat(beginDate.getDate(),"ngaygio"),new UserFormat().getFormat(endDate.getDate(),"ngaygio"));
       
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
// TODO add your handling code here:
        if (freeRoomTooAdd==null){
            JOptionPane.showMessageDialog(this,"Bạn phải ch�?n phòng cần thêm !");
        }
        else
        {
            int cf3 = JOptionPane.showConfirmDialog(this,"Bạn thực sự muốn thêm phòng: "+freeRoomTooAddName+" ?","Thông báo",0);
            if (cf3==0)
            {
                String sqlinsert ="insert into orderDetail (roomid,orderid,begindate,enddate) values ('"+
                        freeRoomTooAdd+"','"+madonhang.getText()+"','"+new UserFormat().getFormat(beginDate.getDate(),"ngaygio")+"','"+new UserFormat().getFormat(endDate.getDate(),"ngaygio")+"')";
                //JOptionPane.showMessageDialog(this,sqlinsert);
                new Utils().SQLRUN(sqlinsert);
                roomInOrdershow();
                roomFreeToAdd(new UserFormat().getFormat(beginDate.getDate(),"ngaygio"),new UserFormat().getFormat(endDate.getDate(),"ngaygio"));
                freeRoomTooAdd=null;
                JOptionPane.showMessageDialog(this,"Thêm phòng thành công !");
                
            }
            
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void chkAddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAddRoomActionPerformed
// TODO add your handling code here:
        if (chkAddRoom.isSelected()){
           showChoiceRoom(true);
           roomFreeToAdd(new UserFormat().getFormat(beginDate.getDate(),"ngaygio"),new UserFormat().getFormat(endDate.getDate(),"ngaygio"));
           freeRoomTooAdd=null;
        }
        else
        {
        showChoiceRoom(false);
         roomFreeToAdd(new UserFormat().getFormat(beginDate.getDate(),"ngaygio"),new UserFormat().getFormat(endDate.getDate(),"ngaygio"));
         freeRoomTooAdd=null;
        
        }
    }//GEN-LAST:event_chkAddRoomActionPerformed
   private void showChoiceRoom(boolean check)
   {
       //panelChoiceRoom.setVisible(check);
       beginDate.setVisible(check);
       endDate.setVisible(check);
   }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
         if (roomtochange==null) {
           JOptionPane.showMessageDialog(this,"Bạn phải ch�?n phòng cần chuyển");
           
       }
       else 
           if(roomfree==null){
           JOptionPane.showMessageDialog(this,"Bạn phải ch�?n phòng trống để chuyển ");
           }
           else
           { if ((new Integer (roomStatusID)==4)||(new Integer (roomStatusID)==7)){
            JOptionPane.showMessageDialog(this,"Phòng này đã trả, chuyển bạn không thao tác được! ");
            roomInOrdershow();
            }
             else
            {
              int isChange = JOptionPane.showConfirmDialog(this," Bạn thực sự muốn chuyển phòng "+nameroomtochange+" thành phòng "+nameroomfree+"? \n Tất cả khách sẽ phải chuyển, dịch vụ sẽ đã g�?i sẽ chuyển !","Cảnh báo",0);
              if (isChange==0) 
              {
              //SQLRUN("Update orderdetail set roomid='"+roomfree+"' where begindate='"+bd+"' and enddate='"+ed+"'");
              String sqlupdate=" update orderdetail set  enddate=getdate() where id='"+detailId+"' and roomid='"+roomtochange+"'";
              SQLRUN(sqlupdate);
              new Utils().SQLRUN("update roomcurent_detail set roomId='"+roomfree+"' where roomid='"+roomtochange+"'");
              new Utils().SQLRUN("update servicesDetail set roomnum='"+roomfree+"' where roomnum='"+roomtochange+"'");
              new Utils().SQLRUN("update orderdetail set roomstatus=7 where [id]='"+detailId+"'");
              
              String sqlchangeCus="";
             // JOptionPane.showMessageDialog(this,sqlupdate);
              
             
                   String sqlinsert= " insert into orderdetail (orderid,roomid,begindate,enddate,roomstatus) values ('"+orderid+"','"+roomfree +"',getdate(),'"+ed+"','"+roomStatusID+"')";
               SQLRUN(sqlinsert);
              
              //JOptionPane.showMessageDialog(this,sqlinsert);
//JOptionPane.showMessageDialog(this,"Update orderdetail set roomid='"+roomfree+"' where begindate='"+bd+"' and enddate='"+ed+"'"");
              roomInOrdershow(); // refress lai bang roominorder
               /*roomtochange = null; // chuyen het cac bien ve null //
               nameroomtochange = null;
               bd = null;
               ed = null;
               orderid = null;
               roomfree = null;
               nameroomfree= null;
              //roomOutOrdershow("","");
              */
              }
              else{}// hủy b�? việc chuyển phòng
             }
           }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
        this.dispose();
        hotelForm.ODID = null;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
       if (roomtochange==null) {
           JOptionPane.showMessageDialog(this,"Bạn phải ch�?n phòng cần chuyển");
           
       }
       else 
           if(roomfree==null){
           JOptionPane.showMessageDialog(this,"Bạn phải ch�?n phòng trống để chuyển ");
           }
           else
           {
             if ((new Integer (roomStatusID)==4)||(new Integer (roomStatusID)==7))
             {
                 JOptionPane.showMessageDialog(this,"Phòng này đã trả, chuyển bạn không thao tác được! ");
            roomInOrdershow();
             }
             else   
             {
              int isChange = JOptionPane.showConfirmDialog(this," Bạn thực sự muốn đổi phòng "+nameroomtochange+" thành phòng "+nameroomfree+"? \n Tất cả khách, dịch vụ đã g�?i sẽ được chuyển!","Cảnh báo",0);
              if (isChange==0) {
              SQLRUN("Update orderdetail set roomid='"+roomfree+"' where begindate='"+bd+"' and enddate='"+ed+"' and id='"+detailId+"'");
              new Utils().SQLRUN("update roomcurent_detail set roomId='"+roomfree+"' where roomid='"+roomtochange+"'");
              new Utils().SQLRUN("update servicesDetail set roomnum='"+roomfree+"' where roomnum='"+roomtochange+"'");
              roomInOrdershow(); // refress lai bang roominorder
              /* roomtochange = null; // chuyen het cac bien ve null //
               nameroomtochange = null;
               bd = null;
               ed = null;
               orderid = null;
               roomfree = null;
               nameroomfree= null;
               detailId=null;
              //roomOutOrdershow("","");
              */
              }
              else{}
             }
           }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void roomOutOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomOutOrderMouseClicked
// TODO add your handling code here:
       roomfree = SelectedRowToString(roomOutOrder,0);
       nameroomfree= SelectedRowToString(roomOutOrder,1);// name
       
    }//GEN-LAST:event_roomOutOrderMouseClicked

    private void roomInOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomInOrderMouseClicked
// TODO add your handling code here:
        roomtochange = SelectedRowToString(roomInOrder,0);//roomid
        orderid = SelectedRowToString(roomInOrder,2);//orderid
        detailId=SelectedRowToString(roomInOrder,1);
        roomStatusID=SelectedRowToString(roomInOrder,3);
        nameroomtochange= SelectedRowToString(roomInOrder,4);// name
        bd =  SelectedRowToString(roomInOrder,5);//begin date
        ed =  SelectedRowToString(roomInOrder,6);//end date
        roomOutOrdershow(bd,ed);// hien cac phong co the
        roomfree= null;
        //orderid=madonhang.getText();
        new Utils().addItemToTable(tblCusInRoom,"select firstname +' '+lastname as [H�? tên] from customers where customerId in (select customerid  from roomcurent_detail where roomid='"+roomtochange+"' )");
        
        
    }//GEN-LAST:event_roomInOrderMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chagerooms(new JFrame(),true).setVisible(true);
            }
        });
    }
    private void roomInOrdershow()// Hien nhung room da co trong don hang so Oid
    {
            String Oid;
            Oid = madonhang.getText();
            String sqltb=  "select * from roomInChangeOd where orderId= '"+Oid+"'";
            new sqlDatabase().addDataTable(sqltb,roomInOrder);
            new Utils().hiddencol(roomInOrder,0);
            new Utils().hiddencol(roomInOrder,1);
            new Utils().hiddencol(roomInOrder,2);
            new Utils().hiddencol(roomInOrder,3);
            roomtochange = null; // chuyen het cac bien ve null //
               nameroomtochange = null;
               bd = null;
               ed = null;
               orderid = null;
               roomfree = null;
               nameroomfree= null;
               detailId=null;
               roomStatusID=null;
           //freeRoomTooAdd=null
               

    }
    private void hiddencol(int colNum )
    {
        roomInOrder.getColumnModel().getColumn(colNum).setMaxWidth(0);
        roomInOrder.getColumnModel().getColumn(colNum).setMinWidth(0); 
        roomInOrder.getColumnModel().getColumn(colNum).setPreferredWidth(0);
    }
    private void roomOutOrdershow(String bd,String ed)// Hien nhung room co the chuyen (phai co tham so ngay cua room can chuyen)
    {
            String sqltb=  "SELECT roomid,roomnumb as [Số phòng],[price] as [Giá] FROM roomjointype "+
                    " WHERE roomid NOT IN (SELECT roomid FROM busyrooms WHERE ('"+bd+"' BETWEEN bd AND ed)"+
                    " OR('"+ed+"'BETWEEN bd AND ed) OR (bd BETWEEN '"+bd+"' AND '"+ed+"')"+
                    " OR(ed BETWEEN '"+bd+"' AND '" +ed+"'))" ;
            new sqlDatabase().addDataTable(sqltb,roomOutOrder);
            new Utils().hiddencol(roomOutOrder,0);
    }
    
     private void roomFreeToAdd(String bd,String ed)// Hien nhung room trong de chuyen)
    {
           if (chkAddRoom.isSelected())
           {
           String sqltb=  "SELECT roomid,roomnumb as [Số phòng],[price] as [Giá] FROM roomjointype "+
                    " WHERE roomid NOT IN (SELECT roomid FROM busyrooms WHERE ('"+bd+"' BETWEEN bd AND ed)"+
                    " OR('"+ed+"'BETWEEN bd AND ed) OR (bd BETWEEN '"+bd+"' AND '"+ed+"')"+
                    " OR(ed BETWEEN '"+bd+"' AND '" +ed+"'))" ;
           // new sqlDatabase().addDataTable(sqltb,roomOutOrder);
            new Utils().addItemToTable(tblFreeRoom,sqltb);
            new Utils().hiddencol(tblFreeRoom,0);
           }
           else
           {
               new Utils().addItemToTable(tblFreeRoom,"select [Số phòng] ='Chưa có'  ,[Giá] = 'Chưa có'");
           }
    }
    
    private void SQLRUN (String SQLTEXT) // Ham de chay cau truy van
     {
       try{
            Connection conn = new connectDatabase().getConnection();
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stm.execute(SQLTEXT);
            conn.close();
            stm.close();
            System.out.println(SQLTEXT);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
     /* private void addItemTooCombobox() // Dua du lieu tu cau truy van vao combobox, chi co 1 truong trong du lieu
     {
        String sqlcb = "select TenTruogn from TenBang";
        ComboBoxName.addItem("Chon 1");
        new sqlDatabase().addDataCombobox(sqlcb,ComboboxName);
     }
      */
    /* private void addItemToTable()// Lay du lieu tu cau truy van dua vao tabe, nhieu ten bang
     {
      
            String sqltb=  "select * from Tenbang";
            new sqlDatabase().addDataTable(sqltb,TableName);
       
     }
     */
     
    private String  SelectedRowToString (JTable TableName, int CollNumb ) // Lay va In ten truong thu CollNumb ra  bietn ReturnValua, lay 1 bien
      {
        //int CollNumb ;
        //CollNumb=0;
        int  RowSelected;
        String ReturnValue;
        RowSelected = TableName.getSelectedRow();
        ReturnValue=TableName.getValueAt(RowSelected,CollNumb).toString();
        System.out.println(ReturnValue+" ");
        return ReturnValue;
        //System.out.println(TableName.getValueAt(RowSelected,CollNumb));
        
      }
     
     // Bien do nguoi dung  tao ra
    private String roomtochange;
    private String nameroomtochange;
    private String bd ;
    private String ed ;
    private String orderid ;
    private String roomfree ;
    private String nameroomfree;
    private String detailId;
    private String freeRoomTooAdd ;
    private String freeRoomTooAddName;
    private String roomStatusID;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser beginDate;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSearch;
    private javax.swing.JRadioButton chkAddRoom;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField madonhang;
    private javax.swing.JPanel panelChoiceRoom;
    private javax.swing.JTable roomInOrder;
    private javax.swing.JTable roomOutOrder;
    private javax.swing.JTable tblCusInRoom;
    private javax.swing.JTable tblFreeRoom;
    private javax.swing.JTextField txtOrderDate;
    private javax.swing.JTextField txtOrderOfCus;
    // End of variables declaration//GEN-END:variables
    
}
