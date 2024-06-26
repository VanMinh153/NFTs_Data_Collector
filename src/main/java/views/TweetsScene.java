package views;

import dataprocessors.GetDataFromJson;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.table.DefaultTableModel;
import models.Hashtag;
import models.Tweet;
import views.NFTsScene;

public class TweetsScene extends javax.swing.JFrame implements GetDataFromJson {
  
  public TweetsScene() {
    initComponents();
    
    listTweetPanels = new ArrayList<>();
    listTweets = getTweetsFromJson();
    addTweetPanel();
    
    hashtags = getHashtagsFromJson();

    defaultTableModel = (DefaultTableModel)tHashtagTrends.getModel();
    addHashtagTrend(); 
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    header = new javax.swing.JPanel();
    jlbHome = new javax.swing.JLabel();
    btNFT = new javax.swing.JButton();
    btTweet = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    btnSearch = new javax.swing.JButton();
    jLabel3 = new javax.swing.JLabel();
    jspTweets = new javax.swing.JScrollPane();
    mainPanel = new javax.swing.JPanel();
    jspHashtagTrends = new javax.swing.JScrollPane();
    tHashtagTrends = new javax.swing.JTable();
    jtfSearch = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jlbResult = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Tweet");
    setBackground(new java.awt.Color(204, 255, 255));

    header.setBackground(new java.awt.Color(204, 255, 204));
    header.setMinimumSize(new java.awt.Dimension(785, 57));
    header.setName(""); // NOI18N

    jlbHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    jlbHome.setText("Home");
    jlbHome.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jlbHomeMouseClicked(evt);
      }
    });

    btNFT.setBackground(new java.awt.Color(255, 255, 204));
    btNFT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btNFT.setText("NFT");
    btNFT.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btNFTMouseClicked(evt);
      }
    });

    btTweet.setBackground(new java.awt.Color(255, 255, 204));
    btTweet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btTweet.setText("Tweet");
    btTweet.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btTweetMouseClicked(evt);
      }
    });

    javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
    header.setLayout(headerLayout);
    headerLayout.setHorizontalGroup(
      headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(headerLayout.createSequentialGroup()
        .addGap(26, 26, 26)
        .addComponent(jlbHome, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btNFT)
        .addGap(32, 32, 32)
        .addComponent(btTweet)
        .addGap(55, 55, 55))
    );
    headerLayout.setVerticalGroup(
      headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(headerLayout.createSequentialGroup()
        .addGap(12, 12, 12)
        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btNFT)
            .addComponent(btTweet))
          .addComponent(jlbHome))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jLabel2.setBackground(new java.awt.Color(204, 255, 255));
    jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    jLabel2.setText("Tweet Posts");

    btnSearch.setText("Search");
    btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnSearchMouseClicked(evt);
      }
    });

    jLabel3.setBackground(new java.awt.Color(204, 255, 255));
    jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    jLabel3.setText("Hashtag Trends");

    jspTweets.setEnabled(false);

    mainPanel.setBackground(new java.awt.Color(255, 255, 255));

    javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
    mainPanel.setLayout(mainPanelLayout);
    mainPanelLayout.setHorizontalGroup(
      mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 582, Short.MAX_VALUE)
    );
    mainPanelLayout.setVerticalGroup(
      mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 425, Short.MAX_VALUE)
    );

    jspTweets.setViewportView(mainPanel);

    tHashtagTrends.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Hashtag", "Times"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.Integer.class
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }
    });
    jspHashtagTrends.setViewportView(tHashtagTrends);

    jtfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        jtfSearchKeyPressed(evt);
      }
    });

    jLabel4.setText("Result:");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(14, 14, 14)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jspTweets, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jlbResult, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jspHashtagTrends, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(jLabel3))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(8, 8, 8)
            .addComponent(btnSearch)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jlbResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addComponent(jspTweets, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jspHashtagTrends, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(25, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void jlbHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbHomeMouseClicked
    // TODO add your handling code here:
    this.dispose();
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Home().setVisible(true);
      }
    });
    
    }//GEN-LAST:event_jlbHomeMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
    // TODO add your handling code here:
    search();
    }//GEN-LAST:event_btnSearchMouseClicked

    private void jtfSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSearchKeyPressed
    // TODO add your handling code here:
    if(evt.getKeyCode() ==  KeyEvent.VK_ENTER){
      search();
    }
    }//GEN-LAST:event_jtfSearchKeyPressed

  private void btNFTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNFTMouseClicked
    // TODO add your handling code here:
    this.dispose();
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new NFTsScene().setVisible(true);
      }
    });
  }//GEN-LAST:event_btNFTMouseClicked

  private void btTweetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTweetMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_btTweetMouseClicked

  private void search(){
    int cnt = 0;
    if(jtfSearch.getText().equals("")) {
      for(Tweet x : listTweets){
        mainPanel.add(new TweetPanel(x));
      }
      return;
    }
    mainPanel.removeAll();
    List<Tweet> currentTweets = new ArrayList<>();
    for(Tweet x : listTweets){
      if(x.getContent().toLowerCase().contains(jtfSearch.getText().toLowerCase())){
        currentTweets.add(x);
        cnt++;
      }
    }
    for(Tweet x : currentTweets){
      mainPanel.add(new TweetPanel(x));
    }
    jlbResult.setText(String.valueOf(cnt));
  }
  
  private void addTweetPanel(){
    for(Tweet tweet : listTweets) {
      TweetPanel panel = new TweetPanel(tweet); 
      listTweetPanels.add(panel); 
    }
    
    BoxLayout boxLayout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS);
    mainPanel.setLayout(boxLayout);
    
    for (TweetPanel tweetPanel : listTweetPanels) {
      mainPanel.add(tweetPanel);
    }
    mainPanel.add(Box.createVerticalStrut(10)); // 10 pixels
  }
  
  private void addHashtagTrend(){
    hashtags.sort((Hashtag o1, Hashtag o2) -> {
      if(o2.getQty() != o1.getQty()) return o2.getQty() - o1.getQty();
      else return o1.getName().compareTo(o2.getName());
    });
    
    for(Hashtag x : hashtags){
      defaultTableModel.addRow(x.getHashtag());
    }
  }
  
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
      java.util.logging.Logger.getLogger(TweetsScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TweetsScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TweetsScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TweetsScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new TweetsScene().setVisible(true);
      }
    });
  }
  
  private List<Hashtag> hashtags;
  private List<TweetPanel> listTweetPanels;
  private List<Tweet> listTweets;
  DefaultTableModel defaultTableModel;
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btNFT;
  private javax.swing.JButton btTweet;
  private javax.swing.JButton btnSearch;
  private javax.swing.JPanel header;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jlbHome;
  private javax.swing.JLabel jlbResult;
  private javax.swing.JScrollPane jspHashtagTrends;
  private javax.swing.JScrollPane jspTweets;
  private javax.swing.JTextField jtfSearch;
  private javax.swing.JPanel mainPanel;
  private javax.swing.JTable tHashtagTrends;
  // End of variables declaration//GEN-END:variables
}
