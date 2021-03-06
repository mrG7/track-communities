/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sotera.dfa.modularity;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JSlider;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
    dtd = "-//com.sotera.dfa.modularity//modularity//EN",
autostore = false)
@TopComponent.Description(
    preferredID = "modularityTopComponent",
//iconBase="SET/PATH/TO/ICON/HERE", 
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "filtersmode", openAtStartup = true)
@ActionID(category = "Window", id = "com.sotera.dfa.modularity.modularityTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
    displayName = "#CTL_modularityAction",
preferredID = "modularityTopComponent")
@Messages({
    "CTL_modularityAction=modularity",
    "CTL_modularityTopComponent=modularity Window",
    "HINT_modularityTopComponent=This is a modularity window"
})
public final class modularityTopComponent extends TopComponent {
    
    private GraphLoader loader = GraphLoader.getInstance();

    public modularityTopComponent() {
        initComponents();
        setName(Bundle.CTL_modularityTopComponent());
        setToolTipText(Bundle.HINT_modularityTopComponent());
        
        // provide a refernce to the drop down and slider
        // to the loader to allow it to update the UI
        // when change are made.
        loader.setFilterBox(this.filterComboBox);
        loader.setZoomSlider(this.zoomSlider);  
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        loadBtn = new javax.swing.JButton();
        selectedDirectoryLabel = new javax.swing.JLabel();
        zoomSlider = new javax.swing.JSlider();
        filterComboBox = new javax.swing.JComboBox();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        fileChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        org.openide.awt.Mnemonics.setLocalizedText(loadBtn, org.openide.util.NbBundle.getMessage(modularityTopComponent.class, "modularityTopComponent.loadBtn.text")); // NOI18N
        loadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBtnActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(selectedDirectoryLabel, org.openide.util.NbBundle.getMessage(modularityTopComponent.class, "modularityTopComponent.selectedDirectoryLabel.text_1")); // NOI18N

        zoomSlider.setMajorTickSpacing(1);
        zoomSlider.setMaximum(3);
        zoomSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        zoomSlider.setPaintTicks(true);
        zoomSlider.setSnapToTicks(true);
        zoomSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                zoomSliderStateChanged(evt);
            }
        });

        filterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterComboBoxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(backButton, org.openide.util.NbBundle.getMessage(modularityTopComponent.class, "modularityTopComponent.backButton.text")); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(modularityTopComponent.class, "modularityTopComponent.jLabel1.text_1")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(modularityTopComponent.class, "modularityTopComponent.jLabel2.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(zoomSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loadBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectedDirectoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadBtn)
                    .addComponent(selectedDirectoryLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backButton)
                            .addComponent(jLabel1)))
                    .addComponent(zoomSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBtnActionPerformed
        
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (file != null){
                this.selectedDirectoryLabel.setText(file.getPath());
                selectedDirectoryLabel.setToolTipText(file.getPath());
            }   
            try {
                loader.loadNewModularityProject(file);
            } catch (InterruptedException ex) {
                Exceptions.printStackTrace(ex);
                // TODO display error
            }
        } 
        
    }//GEN-LAST:event_loadBtnActionPerformed

    private void zoomSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_zoomSliderStateChanged
        JSlider slider = (JSlider) evt.getSource();
        if (!slider.getValueIsAdjusting()){
            loader.zoomToLevel(slider.getValue());
        }
    }//GEN-LAST:event_zoomSliderStateChanged

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        loader.back();
    }//GEN-LAST:event_backButtonActionPerformed

    private void filterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterComboBoxActionPerformed
        loader.applyFilter( (String) filterComboBox.getSelectedItem() );  
    }//GEN-LAST:event_filterComboBoxActionPerformed

    
    
   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JComboBox filterComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loadBtn;
    private javax.swing.JLabel selectedDirectoryLabel;
    private javax.swing.JSlider zoomSlider;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}
