import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BienvenidoJFrame extends JFrame implements ActionListener {

	private ImageIcon imagenLogoCocaCola;
	private JLabel etiquetaLogoCocaCola, etiquetaSistemaControlVacaciones, etiquetaCapturaNombre, etiquetaMarcaRegistrada, etiquetaContraseña;
	private JTextField campoTextoCapturaNombre, campoContraseña;
	private JButton botonIngresar;

	public BienvenidoJFrame() {

		setLayout(null);

		getContentPane().setBackground(Color.RED);
		setTitle("Bienvenido COCA-COLA App");
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

		imagenLogoCocaCola = new ImageIcon("images/logo-coca.png");
		etiquetaLogoCocaCola = new JLabel();
		etiquetaLogoCocaCola.setBounds(30,30,280,140);
		etiquetaLogoCocaCola.setIcon(imagenLogoCocaCola);
		etiquetaLogoCocaCola.setBackground(Color.RED);
		etiquetaLogoCocaCola.setOpaque(true);
		add(etiquetaLogoCocaCola);

		etiquetaSistemaControlVacaciones = new JLabel("Sistema de Control de Vacaciones");
		etiquetaSistemaControlVacaciones.setFont(new Font("Andale Mono",3,13));
		etiquetaSistemaControlVacaciones.setBounds(50,170,250,30);
		etiquetaSistemaControlVacaciones.setForeground(Color.WHITE);
		etiquetaSistemaControlVacaciones.setBackground(Color.RED);
		etiquetaSistemaControlVacaciones.setOpaque(true);
		add(etiquetaSistemaControlVacaciones);

		etiquetaCapturaNombre = new JLabel("Ingrese su nombre :");
		etiquetaCapturaNombre.setFont(new Font("Hack",1,13));
		etiquetaCapturaNombre.setBounds(50,210,200,25);
		etiquetaCapturaNombre.setOpaque(true);
		etiquetaCapturaNombre.setBackground(Color.RED);
		etiquetaCapturaNombre.setForeground(Color.WHITE);
		add(etiquetaCapturaNombre);

		campoTextoCapturaNombre = new JTextField();
		campoTextoCapturaNombre.setBounds(50,240,230,25);
		campoTextoCapturaNombre.setFont(new Font("Hack",1,14));
		campoTextoCapturaNombre.setForeground(Color.RED);
		add(campoTextoCapturaNombre);

		etiquetaContraseña = new JLabel("Ingresa tu contraseña :");
		etiquetaContraseña.setFont(new Font("Hack",3,13));
		etiquetaContraseña.setBounds(50,270,200,25);
		etiquetaContraseña.setBackground(Color.RED);
		etiquetaContraseña.setForeground(Color.WHITE);
		etiquetaContraseña.setOpaque(true);
		add(etiquetaContraseña);

		campoContraseña = new JTextField();
		campoContraseña.setBounds(50,300,230,25);
		campoContraseña.setFont(new Font("Hack",1,14));
		campoContraseña.setForeground(Color.RED);
		add(campoContraseña);

		botonIngresar = new JButton("Ingresar");
		botonIngresar.setForeground(Color.RED);
		botonIngresar.setBackground(Color.WHITE);
		botonIngresar.setBounds(100,345,120,30);
		botonIngresar.addActionListener(this);
		add(botonIngresar);

		etiquetaMarcaRegistrada = new JLabel("©2021 The Coca-Cola Company by Kevo.THRASHER");
		etiquetaMarcaRegistrada.setFont(new Font("Hack",1,12));
		etiquetaMarcaRegistrada.setBounds(10,385,320,25);
		etiquetaMarcaRegistrada.setForeground(Color.WHITE);
		etiquetaMarcaRegistrada.setBackground(Color.RED);
		add(etiquetaMarcaRegistrada);

	}

	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == botonIngresar) {

		}
	}

	public static void main(String[] args) {

		BienvenidoJFrame bienvenidoJFrame = new BienvenidoJFrame();
		bienvenidoJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bienvenidoJFrame.setBounds(0,0,340,450);
		bienvenidoJFrame.setResizable(true);
		bienvenidoJFrame.setLocationRelativeTo(null);
		bienvenidoJFrame.setVisible(true);

	}
}
