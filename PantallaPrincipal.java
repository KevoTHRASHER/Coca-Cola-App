import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class PantallaPrincipal extends JFrame implements ActionListener {

	private JMenuBar barraMenu;
	private JMenu menuOpciones, menuColorFondo, menuCalcular, menuAcerca;
	private JMenuItem menuItemRojo, menuItemMorado, menuItemNegro, menuItemNuevo, menuItemSalir, menuItemVacaciones, menuItemAutor;
	private ImageIcon imagenCocaColaBlanco;
	private JLabel etiquetaImagenCocaColaBlanco, etiquetaBienvenido, etiquetaDatosTrabajador, etiquetaNombres, etiquetaApellidoPaterno, etiquetaApellidoMaterno, etiquetaDepartamento, etiquetaAntiguedad, etiquetaCalculo, etiquetaMarcaAutor;
	private JTextField campoTextoNombres, campoTextoApellidoPaterno, campoTextoApellidoMaterno;
	private JComboBox comboDepartamento, comboAntiguedad;
	private JTextArea areaTextoCalculo;

	public PantallaPrincipal() {

		setLayout(null);

		setTitle("COCA-COLA Vacaciones APP");

		barraMenu = new JMenuBar();
		setJMenuBar();

		menuOpciones = new JMenu("Opciones");
		menuOpciones.setForeground(Color.WHITE);
		barraMenu.add(menuOpciones);

		menuColorFondo = new JMenu("Color Fondo");
		menuColorFondo.setForeground(Color.RED);
		menuOpciones.add(menuColorFondo);

		menuItemRojo = new JMenuItem("Rojo");
		menuItemRojo.setForeground(Color.RED);
		menuItemRojo.addActionListener(this);
		menuColorFondo.add(menuItemRojo);

		menuItemMorado = new JMenuItem("Morado");
		menuItemMorado.setForeground(Color.RED);
		menuItemMorado.addActionListener(this);
		menuColorFondo.add(menuItemMorado);

		menuItemNegro = new JMenuItem("Negro");
		menuItemNegro.setForeground(Color.RED);
		menuItemNegro.addActionListener(this);
		menuColorFondo.add(menuItemNegro);

		menuItemNuevo = new JMenuItem("Nuevo");
		menuItemNuevo.setForeground(Color.RED);
		menuItemNuevo.addActionListener(this);
		menuOpciones.add(menuItemNuevo);

		menuItemSalir = new JMenuItem("Nuevo");
		menuItemSalir.setForeground(Color.RED);
		menuItemSalir.addActionListener(this);
		menuOpciones.add(menuItemSalir);

		menuCalcular = new JMenu("Calcular");
		menuCalcular.setForeground(Color.RED);
		menuOpciones.add(menuCalcular);

		menuItemVacaciones = new JMenuItem("Vacaciones");
		menuItemVacaciones.setForeground(Color.RED);
		menuItemVacaciones.addActionListener(this);
		menuOpciones.add(menuItemVacaciones);

		menuAcerca = new JMenu("Acerca de");
		menuAcerca.setForeground(Color.WHITE);
		barraMenu.add(menuAcerca);

		menuItemAutor = new JMenuItem("Autor");
		menuItemAutor.setForeground(Color.RED);
		menuItemAutor.addActionListener(this);
		menuAcerca.add(menuItemAutor);

		imagenCocaColaBlanco = new ImageIcon("images/coca-cola-blanco.png");
		etiquetaImagenCocaColaBlanco = new JLabel(imagenCocaColaBlanco);
		etiquetaImagenCocaColaBlanco.setBounds(20,30,280,240);
		etiquetaImagenCocaColaBlanco.setBackground(Color.RED);
		add(etiquetaImagenCocaColaBlanco);

		etiquetaBienvenido = new JLabel("Bienvenido a COCA-COLA");
		etiquetaBienvenido.setFont(new Font("Hack",1,20));
		etiquetaBienvenido.setBounds(320,30,280,240);
		add(etiquetaBienvenido);

		etiquetaDatosTrabajador = new JLabel("Datos del trabajador para el cálculo de vacaciones");
		etiquetaDatosTrabajador.setFont("Andale Mono",2,16);
		etiquetaDatosTrabajador.setForeground(Color.WHITE);
		etiquetaDatosTrabajador.Background(Color.RED);
		etiquetaDatosTrabajador.setBounds(70,320,100,50);
		add(etiquetaDatosTrabajador);

		etiquetaNombres = new JLabel("Nombre :");
		etiquetaNombres.setBounds(50,400,100,25);
		etiquetaNombres.setFont(new Font("Hack",1,12));
		etiquetaNombres.setForeground(Color.WHITE);
		etiquetaNombres.setBackground(Color.RED);
		etiquetaNombres.setOpaque(true);
		add(etiquetaNombres);

		campoTextoNombres = new JTextField();
		campoTextoNombres.setBounds(50,435,100,25);
		campoTextoNombres.setFont(new Font("Hack",1,14));
		campoTextoNombres.setForeground(Color.RED);
		add(campoTextoNombres);

		etiquetaApellidoPaterno = new JLabel("Apellido Paterno :");
		etiquetaApellidoPaterno.setBounds(50,470,100,25);
		etiquetaApellidoPaterno.setFont(new Font("Hack",1,12));
		etiquetaApellidoPaterno.setForeground(Color.WHITE);
		etiquetaApellidoPaterno.setBackground(Color.RED);
		etiquetaApellidoPaterno.setOpaque(true);
		add(etiquetaApellidoPaterno);

		campoTextoApellidoPaterno = new JTextField();
		campoTextoApellidoPaterno.setBounds(50,505,100,25);
		campoTextoApellidoPaterno.setFont(new Font("Hack",1,14));
		campoTextoApellidoPaterno.setForeground(Color.RED);
		add(campoTextoApellidoPaterno);

		etiquetaApellidoMaterno = new JLabel("Apellido Materno :");
		etiquetaApellidoMaterno.setBounds(50,540,100,25);
		etiquetaApellidoMaterno.setFont(n0ew Font("Hack",1,12));
		etiquetaApellidoMaterno.setForeground(Color.WHITE);
		etiquetaApellidoMaterno.setBackground(Color.RED);
		etiquetaApellidoMaterno.setOpaque(true);
		add(etiquetaApellidoMaterno);

		campoTextoApellidoMaterno = new JTextField();
		campoTextoApellidoMaterno.setBounds(50,575.100,25);
		campoTextoApellidoMaterno.setFont(new Font("Hack",1,14));
		campoTextoApellidoMaterno.setForeground(Color.RED);
		add(campoTextoApellidoMaterno);

		etiquetaDepartamento = new JLabel("Selecciona el Departamento");
		etiquetaDepartamento.setBounds(200,400,100,25);
		etiquetaDepartamento.setFont(new Font("Hack",1,12));
		etiquetaDepartamento.setForeground(Color.WHITE);
		etiquetaDepartamento.setBackground(Color.RED);
		etiquetaDepartamento.setOpaque(true);
		add(etiquetaDepartamento);

		comboDepartamento = new JComboBox();
		comboDepartamento.setBounds(50,435,100,25);
		comboDepartamento.setFont(new Font("Hack",1,14));
		comboDepartamento.setForeground(Color.RED);
		add(comboDepartamento);

		comboDepartamento.addItem("Atencion a Clientes");
		comboDepartamento.addItem("Departamento Logística");
		comboDepartamento.addItem("Departamento Gerencia");

		etiquetaAntiguedad = new JLabel("Selecciona el Antiguedad");
		etiquetaAntiguedad.setBounds(200,470,100,25);
		etiquetaAntiguedad.setFont(new Font("Hack",1,12));
		etiquetaAntiguedad.setForeground(Color.WHITE);
		etiquetaAntiguedad.setBackground(Color.RED);
		etiquetaAntiguedad.setOpaque(true);
		add(etiquetaAntiguedad);

		comboAntiguedad = new JComboBox();
		comboAntiguedad.setBounds(200,505,100,25);
		comboAntiguedad.setFont(new Font("Hack",1,14));
		comboAntiguedad.setForeground(Color.RED);
		add(comboAntiguedad);

		comboAntiguedad.addItem("1 año de servicio");
		comboAntiguedad.addItem("2 a 6 años de servicio");
		comboAntiguedad.addItem("7 años o más de servicio");

		etiquetaCalculo = new JLabel("Resultado del Cálculo :");
		etiquetaCalculo.setBounds(200,540,100,25);
		etiquetaCalculo.setFont(new Font("Hack",1,12));
		etiquetaCalculo.setForeground(Color.WHITE);
		etiquetaCalculo.setBackground(Color.RED);
		etiquetaCalculo.setOpaque(true);
		add(etiquetaCalculo);

		areaTextoCalculo = new JTextArea();
		areaTextoCalculo.setBounds(200,575,200,75);
		areaTextoCalculo.setFont(new Font("Hack",1,14));
		areaTextoCalculo.setForeground(Color.RED);
		add(areaTextoCalculo);

		etiquetaMarcaAutor = new JLabel("2021 The COCA-COLA Company | Todos los derechos reservados by Kevo.THRASHER");
		etiquetaMarcaAutor.setBounds(50,610,400,25);
		etiquetaMarcaAutor.setFont(new Font("Hack",1,12));
		etiquetaMarcaAutor.setForeground(Color.WHITE);
		etiquetaMarcaAutor.setBackground(Color.RED);
		etiquetaMarcaAutor.setOpaque(true);
		add(etiquetaMarcaAutor);


	}

	public static void main(String[] args) {

		PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
		pantallaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pantallaPrincipal.setBackground(Color.RED);
		pantallaPrincipal.setBounds(0,0,480,600);
		pantallaPrincipal.setResizable(true);
		pantallaPrincipal.setLocationRelativeTo(null);
		pantallaPrincipal.setVisible(true);

	}
}
