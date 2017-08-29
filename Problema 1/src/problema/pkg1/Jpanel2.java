/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg1;
import java.awt.BorderLayout;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author m78159
 */
public class Jpanel2 extends javax.swing.JPanel {
    Main m;
    /**
     * Creates new form JPanel2
     */
    public Jpanel2(Main m) {
        this.m = m;
        this.setSize(400,300);
        initComponents();
        jPanel1.setLayout(new java.awt.BorderLayout());
     
    }
    
    public void makeChart(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i = 0; i < m.ps.fai.size();i++)
            dataset.setValue(m.ps.fai.get(i),"Quantidade",(i*m.ps.getfxNum() + "-" + (i+1)*m.ps.getfxNum()));
        JFreeChart barChart = ChartFactory.createBarChart(
                "Quantidade de pessoas por faixa etária",
                "Faixa Etária", "Quantidade de Pessoas",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);
        ChartPanel chartPanel = new ChartPanel(barChart);
        jPanel1.removeAll();
        jPanel1.add(chartPanel, BorderLayout.CENTER);
        jPanel1.validate();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setLayout(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        add(jPanel1);
        jPanel1.setBounds(10, 10, 380, 250);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
