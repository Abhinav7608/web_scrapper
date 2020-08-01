import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.File;  
import java.io.FileWriter;
import java.io.PrintStream;
import org.jsoup.select.Elements;
public class webscrap1 extends javax.swing.JFrame {
        String url;
        Document doc;
        String ele;
        String FileName;
       String TextArea;
       String html;
       String title;
       String paraText;
       String linkText;
       String imageText;
       String buttonText;
       
    public webscrap1() throws IOException {
        initComponents();
        setSize(1200,300);
        setVisible(true);
       
     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        tf3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tf5 = new javax.swing.JTextField();
        bt5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Enter Url");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 30, 100, 16);
        getContentPane().add(tf);
        tf.setBounds(120, 22, 880, 30);

        jButton1.setText("Fetch Html Code");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 70, 140, 25);

        bt2.setText("Title");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(280, 70, 130, 25);

        jButton2.setText("Paragraphs");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(430, 70, 140, 25);

        jButton4.setText("Links");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(600, 70, 61, 25);

        jButton5.setText("Images");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(680, 70, 75, 25);

        jButton6.setText("Buttons");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(770, 70, 75, 25);

        bt3.setText("Get element by id");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3);
        bt3.setBounds(300, 130, 190, 25);
        getContentPane().add(tf3);
        tf3.setBounds(130, 122, 150, 30);

        jLabel2.setText("Enter Value");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 130, 80, 16);

        jButton7.setText("Get element by class");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(520, 130, 180, 25);

        jLabel3.setText("Enter Element");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 180, 90, 16);
        getContentPane().add(tf5);
        tf5.setBounds(140, 170, 160, 30);

        bt5.setText("Get element text");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        getContentPane().add(bt5);
        bt5.setBounds(330, 170, 220, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      def();
        html=doc.html();
        
        System.out.println(html);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
def();
        title = doc.title();
       
        System.out.println(title);
    }//GEN-LAST:event_bt2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
def();
   Elements para1=doc.select("p");
      System.out.println("\n*****paragraph*****");
      for(Element para :para1)
      {
          System.out.println("\n"+para.text());
           paraText = para.text();
          
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
def();
     Elements links = doc.select("a[href]");
      for (Element link : links) {
        // get the value from the href attribute
         System.out.println("\nlink: " + link.attr("href"));
        System.out.println("text: " + link.text());
        linkText = link.attr("href")+link .text();
        
      }// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
def();
  Elements pic1=doc.select("img[src]");
        System.out.println("*****img*****");
      for(Element pic : pic1)
      {
             System.out.println("\n"+pic.attr("src"));
             imageText=pic.attr("src");
             
      }// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 def();
        Elements bt1=doc.select("button");
      for(Element bt : bt1)
      {
          System.out.println("\n"+bt.text());
          buttonText=bt.text();
       
      }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
def();
String id2=tf3.getText();
Element id1=doc.getElementById(id2);
        System.out.println(id1.text());

    }//GEN-LAST:event_bt3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     def();
     String   id=tf3.getText();
Elements id2=doc.getElementsByClass(id);
for(Element id1:id2){
    System.out.println("\n"+id1.text());
    
}

    }//GEN-LAST:event_jButton7ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
def();
ele=tf5.getText();
Elements ele1=doc.select(ele);
for(Element ele2 : ele1){
    System.out.println(ele2.text());
    
}
// TODO add your handling code here:
    }//GEN-LAST:event_bt5ActionPerformed
public void def()
{
         url=tf.getText();
            try {
                doc = Jsoup.connect(url).get();
            } catch (IOException ex) {
                Logger.getLogger(webscrap1.class.getName()).log(Level.SEVERE, null, ex);
            }
}
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
            java.util.logging.Logger.getLogger(webscrap1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(webscrap1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(webscrap1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(webscrap1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new webscrap1().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(webscrap1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tf;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf5;
    // End of variables declaration//GEN-END:variables
}
