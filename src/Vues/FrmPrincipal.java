package Vues;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrmPrincipal extends JFrame{

    public FrmPrincipal()
    {
        this.setTitle("TP1 - Interface graphique");
        this.setContentPane(rootPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
                String[] entete = new String[]{"Numéro","Entreprise","Année" };
                String[][] datas = new String[4][3];
                datas[0][0] = "1";
                datas[0][1] = "Microsoft";
                datas[0][2] = "2003";
                datas[1][0] = "2";

                datas[1][1] = "IBM";
                datas[1][2] = "2007";
                datas[2][0] = "3";
                datas[2][1] = "Google";
                datas[2][2] = "2012";
                datas[3][0] = "4";
                datas[3][1] = "Dell";
                datas[3][2] = "2019";

                DefaultTableModel dtmStages = new DefaultTableModel(datas,entete);
                tblStages.setModel(dtmStages);
            }
        });

    }
    private JPanel rootPanel;
    private JTextField txtNom;
    private JTextField txtPrenom;
    private JSpinner spAge;
    private JLabel lblPhoto;
    private JLabel lblNom;
    private JLabel lblPrenom;
    private JLabel lblAge;
    private JPanel pnlTitre;
    private JLabel lblTitre;
    private JLabel lblCompetence;
    private JList lstLangages;
    private JCheckBox chkWeb;
    private JCheckBox chkLourd;
    private JCheckBox chkMobile;
    private JTable tblStages;
    private JLabel lblStages;
}
