package ObserverSwing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ObserverSwingExample {
    JFrame cadre;

    public static void main(String[] args) {
        ObserverSwingExample example = new ObserverSwingExample();
        example.go();
    }

    public void go () {
        cadre = new JFrame();
        JButton bouton = new JButton("Dois-je le faire ?");
        bouton.addActionListener(new AuditeurAnge());
        bouton.addActionListener(new AuditeurDemon());
        cadre.getContentPane().add(BorderLayout.CENTER, bouton);
        // Définir les propriétés du cadre ici
        cadre.pack();
        cadre.setVisible(true);
    }
}

/**
 * AuditeurAnge
 */
class AuditeurAnge implements ActionListener {
    // Au lieu d’update(), la méthode actionPerformed() est appelée quand l’état du sujet (en l’occurrence le bouton) change.
    public void actionPerformed(ActionEvent event) {
        System.out.println("Ne le fais pas, tu pourrais le regretter!");
    }
}

/**
 * AuditeurDemon
 */
class AuditeurDemon implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        System.out.println("Allez, vas-y, fais-le");
    }
}