import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BienvenidoJFrame extends JFrame implements ActionListener {

	private ImageIcon imagenBarraVentana, imagenLogoCocaCola;
	private JLabel etiquetaLogoCocaCola, etiquetaSistemaControlVacaciones, etiquetaCapturaNombre, etiquetaMarcaRegistrada;
	private JTextField campoTextoCapturaNombre;
	private JButton botonIngresar;

	public BienvenidoJFrame() {

		setLayout(null);

		imagenLogoCocaCola = new ImageIcon("images/logo-coca.png");
		etiquetaLogoCocaCola = new JLabel();
		etiquetaLogoCocaCola.setBounds(30,30,300,150);
		etiquetaLogoCocaCola.setIcon(imagenLogoCocaCola);
		etiquetaLogoCocaCola.setForeground(Color.WHITE);
		etiquetaLogoCocaCola.setBackground(Color.RED);
		etiquetaLogoCocaCola.setOpaque(true);
		add(etiquetaLogoCocaCola);

		etiquetaSistemaControlVacaciones = new JLabel("Sistema de Control de Vacaciones");
		etiquetaSistemaControlVacaciones.setBounds(50,170,250,30);
		etiquetaSistemaControlVacaciones.setForeground(Color.WHITE);
		etiquetaSistemaControlVacaciones.setBackground(Color.RED);
		etiquetaSistemaControlVacaciones.setOpaque(true);
		add(etiquetaSistemaControlVacaciones);

		etiquetaCapturaNombre = new JLabel("Ingrese su nombre :");
		etiquetaCapturaNombre.setBounds(50,250,200,25);
		etiquetaCapturaNombre.setOpaque(true);
		etiquetaCapturaNombre.setBackground(Color.RED);
		etiquetaCapturaNombre.setForeground(Color.WHITE);
		add(etiquetaCapturaNombre);

		campoTextoCapturaNombre = new JTextField();
		campoTextoCapturaNombre.setBounds(50,280,200,25);
		campoTextoCapturaNombre.setForeground(Color.RED);
		add(campoTextoCapturaNombre);

		botonIngresar = new JButton("Ingresar");
		botonIngresar.setForeground(Color.RED);
		botonIngresar.setBackground(Color.WHITE);
		botonIngresar.setBounds(90,320,120,30);
		add(botonIngresar);
		botonIngresar.addActionListener(this);

		etiquetaMarcaRegistrada = new JLabel("2021 The Coca-Cola Company by Kevo.THRASHER");
		etiquetaMarcaRegistrada.setBounds(10,380,320,25);
		etiquetaMarcaRegistrada.setForeground(Color.WHITE);
		etiquetaMarcaRegistrada.setBackground(Color.RED);

		add(etiquetaMarcaRegistrada);

	}

	public void actionPerformed(ActionEvent ae) {

	}

	public static void main(String[] args) {

		BienvenidoJFrame bienvenidoJFrame = new BienvenidoJFrame();
		bienvenidoJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bienvenidoJFrame.setTitle("Bienvenido");
		bienvenidoJFrame.getContentPane().setBackground(Color.RED);
		bienvenidoJFrame.setBounds(0,0,350,450);
		bienvenidoJFrame.setResizable(true);
		bienvenidoJFrame.setLocationRelativeTo(null);
		bienvenidoJFrame.setVisible(true);

	}
}
