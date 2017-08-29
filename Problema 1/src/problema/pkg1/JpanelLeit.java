/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author m78159
 */

public class JpanelLeit extends javax.swing.JPanel {
    Main m;
    public ArrayList<Pessoa> p;
    Ctl c;
    
    /**
     * Creates new form JpanelLeit
     */
    public JpanelLeit(Main m) {
        this.m = m;
        p = new ArrayList<>();
        c = new Ctl();
        this.setSize(400,300);
        initComponents();
        
        jTextField1.addActionListener(c);
        jTextField2.addActionListener(c);
        jTextField3.addActionListener(c);
        jButton1.addActionListener(c);
        jButton2.addActionListener(c);
        
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setText("Nome:");
        add(jLabel1);
        jLabel1.setBounds(40, 50, 50, 20);

        jLabel2.setText("Idade:");
        add(jLabel2);
        jLabel2.setBounds(40, 100, 50, 14);

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        add(jTextField1);
        jTextField1.setBounds(90, 40, 200, 40);

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        add(jTextField2);
        jTextField2.setBounds(90, 90, 200, 40);

        jButton1.setText("Inserir");
        add(jButton1);
        jButton1.setBounds(50, 180, 110, 23);

        jButton2.setText("Limpar");
        add(jButton2);
        jButton2.setBounds(180, 180, 120, 23);
        add(jTextField3);
        jTextField3.setBounds(140, 140, 150, 30);

        jLabel3.setText("Status:");
        add(jLabel3);
        jLabel3.setBounds(90, 140, 50, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField3.setText("Agurandando inserção...");
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        jTextField3.setText("Agurandando inserção...");
    }//GEN-LAST:event_jTextField2FocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    class Ctl implements ActionListener{
        
        
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource() == jButton1){
                try{
                    p.add(new Pessoa(jTextField1.getText(),Integer.parseInt(jTextField2.getText())));
                    jTextField3.setText("Inserido com sucesso!");
                }catch(Exception exc){
                    jTextField3.setText("Algo deu errado.");
                }
            }else
                if(e.getSource() == jButton2){
                    p.clear();
                    jTextField3.setText("Lista limpa!");
                }
        }
    }
}
