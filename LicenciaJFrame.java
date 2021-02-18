import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class LicenciaJFrame extends JFrame implements ActionListener, ChangeListener {

	private JLabel etiquetaTerminosCondiciones, etiquetaImagenCocaColaRojo, etiquetaMarcaAutor;
	private JTextArea areaTerminosCondiciones;
	private JCheckBox cajaBoxAcepto;
	private ImageIcon imagenCocaColaRojo;
	private JButton botonNoAcepto, botonContinuar;

	public LicenciaJFrame() {

		setLayout(null);
		setTitle("Licencia de uso");
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

		etiquetaTerminosCondiciones = new JLabel("TÉRMINOS Y CONDICIONES");
		etiquetaTerminosCondiciones.setBounds(150,20,250,25);
		etiquetaTerminosCondiciones.setFont(new Font("FreeSans",1,16));
		add(etiquetaTerminosCondiciones);

		areaTerminosCondiciones = new JTextArea("HOLA...");
		areaTerminosCondiciones.setFont(new Font("Hack",0,12));
		areaTerminosCondiciones.setBounds(15,55,460,200);
		add(areaTerminosCondiciones);

		cajaBoxAcepto = new JCheckBox("Yo Acepto");
		cajaBoxAcepto.setBounds(15,300,100,20);
		cajaBoxAcepto.setFont(new Font("FreeSans",1,13));
		cajaBoxAcepto.addChangeListener(this);
		add(cajaBoxAcepto);

		botonContinuar = new JButton("Continuar");
		botonContinuar.setBounds(15,350,100,25);
		botonContinuar.setFont(new Font("FreeSans",1,13));
		botonContinuar.setEnabled(false);
		botonContinuar.addActionListener(this);
		add(botonContinuar);

		botonNoAcepto = new JButton("No Acepto");
		botonNoAcepto.setBounds(125,350,100,25);
		botonNoAcepto.setFont(new Font("FreeSans",1,13));
		botonNoAcepto.addActionListener(this);
		add(botonNoAcepto);
		
		imagenCocaColaRojo = new ImageIcon("images/coca-cola-rojo.png");
		etiquetaImagenCocaColaRojo = new JLabel();
		etiquetaImagenCocaColaRojo.setBounds(210,290,300,100);
		etiquetaImagenCocaColaRojo.setIcon(imagenCocaColaRojo);
		etiquetaImagenCocaColaRojo.setOpaque(true);
		add(etiquetaImagenCocaColaRojo);

		etiquetaMarcaAutor = new JLabel("©2021 The Coca-Cola Company by Kevo.THRASHER");
		etiquetaMarcaAutor.setBounds(170,410,450,20);
		etiquetaMarcaAutor.setFont(new Font("Hack",1,12));
		add(etiquetaMarcaAutor);

	}

	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == botonNoAcepto) {
			if(JOptionPane.showConfirmDialog(null,"NO ACEPTA LOS TERMINOS Y CONDICIONES el Programa se CERRARA","CERRAR PROGRAMA",JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
				System.exit(0);
			}
		}
	}

	public void stateChanged(ChangeEvent ce) {
		if(cajaBoxAcepto.isSelected() == true) {
			botonNoAcepto.setEnabled(false);
			botonContinuar.setEnabled(true);
		} else {
			botonNoAcepto.setEnabled(true);
			botonContinuar.setEnabled(false);
		}

	}

	public static void main(String[] args) {

		LicenciaJFrame licenciaJFrame = new LicenciaJFrame();
		licenciaJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		licenciaJFrame.setBounds(0,0,500,470);
		licenciaJFrame.setResizable(true);
		licenciaJFrame.setLocationRelativeTo(null);
		licenciaJFrame.setVisible(true);

	}
}
