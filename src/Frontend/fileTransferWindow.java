/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import java.awt.*;
import java.util.ArrayList;

/**
 *
 * @author stian
 */
public class fileTransferWindow extends javax.swing.JFrame {

    ArrayList<Dimension> screenSizeDimensions;

    /**
     * Creates new form fileTransferWindow
     */
    public fileTransferWindow() {
        screenSizeDimensions = new ArrayList<Dimension>();
        figureOutScreenSize();
        
        initComponents();


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transferProgress = new javax.swing.JProgressBar();
        transferProgressLabel = new javax.swing.JLabel();
        transferIconLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(transferWindowLocation(screenSizeDimensions.get(0)));
        setUndecorated(true);

        transferProgress.setValue(32);

        transferProgressLabel.setText("32%");

        transferIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/network_medium.png"))); // NOI18N

        jLabel1.setText("Transferring .../IMG_3504.JPG to ArnoldComputer");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(transferProgress, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(transferIconLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(transferProgressLabel))
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, transferProgressLabel)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, transferIconLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(transferProgress, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel transferIconLabel;
    private javax.swing.JProgressBar transferProgress;
    private javax.swing.JLabel transferProgressLabel;
    // End of variables declaration//GEN-END:variables

    private Point transferWindowLocation(Dimension screenSize){
        System.out.println("x: "+(screenSize.width)+"  y: "+(screenSize.height));
        return new Point(screenSize.width-this.getPreferredSize().width,screenSize.height-this.getPreferredSize().height);
    }
    
    private void figureOutScreenSize() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gs = ge.getScreenDevices();

// Get size of each screen
        for (int i = 0; i < gs.length; i++) {
            DisplayMode dm = gs[i].getDisplayMode();
            screenSizeDimensions.add(new Dimension(dm.getHeight(),dm.getWidth()));
        }
    }
}
