/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg1;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
/**
 *
 * @author m78159
 */
public class Jpanel1 extends javax.swing.JPanel {
    Main m;
    /**
     * Creates new form JPanel1
     */
    public Jpanel1(Main m) {
        this.m = m;
        this.setSize(400,300);
        initComponents();
        jPanel1.setLayout(new java.awt.BorderLayout());
    }
    
    public void makeChart(){
        DefaultPieDataset dataset = new DefaultPieDataset();
        for(int i = 0; i < m.ps.fai.size();i++){
            if(m.ps.fai.get(i) > 0)
                dataset.setValue((i*m.ps.getfxNum() + "-" + (i+1)*m.ps.getfxNum()), m.ps.fai.get(i));
        }
        JFreeChart chart = ChartFactory.createPieChart(
                "Quantidade de pessoas na mesma faixa etária", //label
                dataset, //dados
                true, //legenda
                true, //tips?
                false); //locale
        PiePlot plot = (PiePlot) chart.getPlot();
        PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator(
        "{0}: {1}", new DecimalFormat("0"), new DecimalFormat(""));
        plot.setSimpleLabels(true);
        plot.setLabelGenerator(gen);
        ChartPanel chartPanel = new ChartPanel(chart);
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
