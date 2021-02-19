import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class PantallaPrincipal extends JFrame implements ActionListener {

	private JMenuBar barraMenu;
	private JMenu menuOpciones, menuColorFondo, menuCalcular, menuAcerca;
	private JMenuItem menuItemRojo, menuItemMorado, menuItemNegro, menuItemNuevo, menuItemSalir, menuItemVacaciones, menuItemAcerca;
	private ImageIcon imagenCocaColaBlanco;
	private JLabel etiquetaImagenCocaColaBlanco, etiquetaBienvenido, etiquetaDatosTrabajador, etiquetaNombres, etiquetaApellidoPaterno, etiquetaApellidoMaterno, etiquetaDepartamento, etiquetaAntigüedad, etiquetaResultado, etiquetaMarcaAutor;
	private JTextField areaTextoNombres, areaTextoApellidoPaterno, areaTextoApellidoMaterno;
	private JComboBox comboDepartamento, comboAntiguedad;

	public PantallaPrincipal() {

		setLayout(null);

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
		menuAcerca.addActionListener(this);
		barraMenu.add(menuAcerca);

	}
}
