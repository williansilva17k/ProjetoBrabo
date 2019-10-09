/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author WILLIAN
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        cdBorda1 = new javax.swing.JPanel();
        cdNome = new javax.swing.JLabel();
        cdCPF = new javax.swing.JLabel();
        cdLinguagem = new javax.swing.JLabel();
        cdEspecializacao = new javax.swing.JLabel();
        codNome = new javax.swing.JTextField();
        codCPF = new javax.swing.JTextField();
        codEspecializacao = new javax.swing.JComboBox<>();
        cadastrar = new javax.swing.JButton();
        codLinguagens = new javax.swing.JComboBox<>();
        cdCad = new javax.swing.JLabel();
        jMenu = new javax.swing.JMenuBar();
        cadFunc = new javax.swing.JMenu();
        codProjeto = new javax.swing.JMenu();
        codRelatorio = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bem Vindo!");
        setResizable(false);

        cdBorda1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cdNome.setText("Nome");

        cdCPF.setText("CPF");

        cdLinguagem.setText("Linguagens");

        cdEspecializacao.setText("Especialização");

        codEspecializacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Front-End", "Back-End" }));

        cadastrar.setBackground(new java.awt.Color(58, 65, 84));
        cadastrar.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        cadastrar.setForeground(new java.awt.Color(0, 0, 0));
        cadastrar.setText("Cadastrar");
        cadastrar.setBorderPainted(false);
        cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrar.setFocusPainted(false);
        cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cadastrarMouseExited(evt);
            }
        });
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        codLinguagens.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java / JavaScript", "C / C++ / C#", "C# / .NET", "PHP", "Python", "Ruby", "Perl", ".lua" }));

        javax.swing.GroupLayout cdBorda1Layout = new javax.swing.GroupLayout(cdBorda1);
        cdBorda1.setLayout(cdBorda1Layout);
        cdBorda1Layout.setHorizontalGroup(
            cdBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cdBorda1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(cdBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cdNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cdCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cdLinguagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cdEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cdBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cdBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(codNome, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .addComponent(codCPF)
                        .addComponent(codEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(codLinguagens, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        cdBorda1Layout.setVerticalGroup(
            cdBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cdBorda1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(cdBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cdBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cdBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdLinguagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codLinguagens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cdBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        cdCad.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        cdCad.setForeground(new java.awt.Color(0, 0, 0));
        cdCad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cdCad.setText("Cadastro");

        cadFunc.setText("Cadastro de Funcionario");
        jMenu.add(cadFunc);

        codProjeto.setText("Projetos");
        jMenu.add(codProjeto);

        codRelatorio.setText("Relátorios");
        jMenu.add(codRelatorio);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(cdBorda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(cdCad, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(cdCad)
                .addGap(18, 18, 18)
                .addComponent(cdBorda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(886, 572));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Funcionario cadastrado com sucesso!");
    }//GEN-LAST:event_cadastrarActionPerformed

    private void cadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarMouseEntered
        cadastrar.setBackground(new Color(235, 235, 235));
        cadastrar.setForeground(new Color(58, 65, 84));
    }//GEN-LAST:event_cadastrarMouseEntered

    private void cadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarMouseExited
        cadastrar.setBackground(new Color(58, 65, 84));
        cadastrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_cadastrarMouseExited

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu cadFunc;
    private javax.swing.JButton cadastrar;
    private javax.swing.JPanel cdBorda1;
    private javax.swing.JLabel cdCPF;
    private javax.swing.JLabel cdCad;
    private javax.swing.JLabel cdEspecializacao;
    private javax.swing.JLabel cdLinguagem;
    private javax.swing.JLabel cdNome;
    private javax.swing.JTextField codCPF;
    private javax.swing.JComboBox<String> codEspecializacao;
    private javax.swing.JComboBox<String> codLinguagens;
    private javax.swing.JTextField codNome;
    private javax.swing.JMenu codProjeto;
    private javax.swing.JMenu codRelatorio;
    private javax.swing.JMenuBar jMenu;
    // End of variables declaration//GEN-END:variables
}