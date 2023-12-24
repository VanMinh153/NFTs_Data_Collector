/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package viewtest;

import models.Tweet;

/**
 *
 * @author quyetdaika
 */
public class TweetPanel extends javax.swing.JPanel {

    /**
     * Creates new form TweetPanel
     * @param tweet
     */
    public TweetPanel(Tweet tweet) {
        initComponents();
        
        lbName.setText(tweet.getName());
        lbUser.setText(tweet.getUser());
        lbCreatedAt.setText(tweet.getCreatedAt());
        jtaContent.setText(tweet.getContent());
        lbComment.setText("cmt:" + tweet.getComment());
        lbRetweet.setText("retweet:" + tweet.getRetweet());
        lbLike.setText("like:" + tweet.getLike());
        lbView.setText("view:" + tweet.getView());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtaContent = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lbName = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        lbCreatedAt = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbComment = new javax.swing.JLabel();
        lbRetweet = new javax.swing.JLabel();
        lbLike = new javax.swing.JLabel();
        lbView = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtaContent.setColumns(20);
        jtaContent.setRows(5);
        jScrollPane1.setViewportView(jtaContent);

        lbName.setText("name");

        lbUser.setText("username");

        lbCreatedAt.setText("createdAt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbName)
                .addGap(41, 41, 41)
                .addComponent(lbUser)
                .addGap(31, 31, 31)
                .addComponent(lbCreatedAt)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(lbUser)
                    .addComponent(lbCreatedAt))
                .addContainerGap())
        );

        lbComment.setText("comment");

        lbRetweet.setText("retweet");

        lbLike.setText("like");

        lbView.setText("view");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbComment)
                .addGap(54, 54, 54)
                .addComponent(lbRetweet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(lbLike)
                .addGap(56, 56, 56)
                .addComponent(lbView)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbComment)
                    .addComponent(lbRetweet)
                    .addComponent(lbLike)
                    .addComponent(lbView))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaContent;
    private javax.swing.JLabel lbComment;
    private javax.swing.JLabel lbCreatedAt;
    private javax.swing.JLabel lbLike;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbRetweet;
    private javax.swing.JLabel lbUser;
    private javax.swing.JLabel lbView;
    // End of variables declaration//GEN-END:variables
}
