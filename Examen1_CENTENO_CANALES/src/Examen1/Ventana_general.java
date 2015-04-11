package Examen1;



import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ventana_general extends JFrame implements ActionListener,Serializable {
	private JButton jbtn_agregar;
	private JButton jbtn_mostrar;
	private JButton jbtn_buscar;
	private JButton jbtn_eliminar;
	private JButton jbtn_guarda;
	private JButton jbtn_recuperar;
	private JButton jbtn_salir;
	private Lista_examen1 lista = new Lista_examen1();
	private JTextArea jta_muestras;
	private JButton jbtn_mostrargene;
	private JButton jbtn_abono;
	
	public Ventana_general() {
		setSize(615,596);
		setResizable(false);
		setTitle("SISTEMA DE CLINICA");
		getContentPane().setBackground(Color.GRAY);
		getContentPane().setLayout(null);
		
		JPanel jp_flowlayout = new JPanel();
		jp_flowlayout.setBackground(new Color(112, 128, 144));
		jp_flowlayout.setBounds(10, 11, 283, 271);
		getContentPane().add(jp_flowlayout);
		jp_flowlayout.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		jbtn_agregar = new JButton("AGREGAR CLIENTE");
		jbtn_agregar.setFont(new Font("Tahoma", Font.PLAIN, 19));
		jp_flowlayout.add(jbtn_agregar);
		
		jbtn_mostrar = new JButton("MOSTRAR CLIENTES");
		jbtn_mostrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jp_flowlayout.add(jbtn_mostrar);
		
		jbtn_mostrargene = new JButton("MOSTRAR RECAUDADO");
		jbtn_mostrargene.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jp_flowlayout.add(jbtn_mostrargene);
		
		jbtn_buscar = new JButton("BUSCAR (numero de DNI)");
		jbtn_buscar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jp_flowlayout.add(jbtn_buscar);
		
		jbtn_abono = new JButton("ABONAR A LA CUENTA");
		jbtn_abono.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jp_flowlayout.add(jbtn_abono);
		
		jbtn_eliminar = new JButton("ELIMINAR (numero de DNI)");
		jbtn_eliminar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jp_flowlayout.add(jbtn_eliminar);
		
		jbtn_guarda = new JButton("GUARDAR");
		jbtn_guarda.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jp_flowlayout.add(jbtn_guarda);
		
		jbtn_recuperar = new JButton("RECUPERAR");
		jbtn_recuperar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jp_flowlayout.add(jbtn_recuperar);
		
		JPanel jp_adsolut = new JPanel();
		jp_adsolut.setBackground(Color.DARK_GRAY);
		jp_adsolut.setBounds(294, 11, 272, 494);
		getContentPane().add(jp_adsolut);
		jp_adsolut.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 252, 472);
		jp_adsolut.add(scrollPane);
		
		jta_muestras = new JTextArea();
		jta_muestras.setForeground(new Color(127, 255, 0));
		jta_muestras.setBackground(Color.BLACK);
		scrollPane.setViewportView(jta_muestras);
		
		jbtn_salir = new JButton("");
		jbtn_salir.setIcon(new ImageIcon(Ventana_general.class.getResource("/recursos/salir.png")));
		jbtn_salir.setBounds(10, 431, 101, 94);
		getContentPane().add(jbtn_salir);
		
		jbtn_agregar.addActionListener(this);
		jbtn_mostrar.addActionListener(this);
		jbtn_buscar.addActionListener(this);
		jbtn_eliminar.addActionListener(this);
		jbtn_guarda.addActionListener(this);
		jbtn_recuperar.addActionListener(this);
		jbtn_salir.addActionListener(this);
		jbtn_mostrargene.addActionListener(this);
		jbtn_abono.addActionListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public void ingresa(){
		lista.inserta();
		
	}
	
	public void ultimo(){
		
		String ultima_vista="";
		
		ultima_vista=lista.mostrar_todo();
		
		jta_muestras.setText(ultima_vista);
	
		
	}
	
	public void busca(){
		
		jta_muestras.setText(lista.buscar());
		
	}
	
	


	public void actionPerformed(ActionEvent accion) {
		
	if (accion.getSource()==jbtn_agregar) {
		ingresa();
		
		
		
	}
	if (accion.getSource()==jbtn_mostrar) {
		ultimo();
	}
	
	if (accion.getSource()==jbtn_buscar) {
		busca();
	}
	
	if (accion.getSource()==jbtn_eliminar) {
		
		lista.elimina();
	}
	
	if (accion.getSource()==jbtn_guarda) {
		
	try {
		lista.Guardar();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	}
	
	if (accion.getSource()==jbtn_recuperar) {
		
		try {
			lista.leer();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	if (accion.getSource()==jbtn_mostrargene) {
		jta_muestras.setText(lista.muestra_general());
		
	}
	
	if (accion.getSource()==jbtn_abono) {
		
		lista.abono();
		
	}
	
	if (accion.getSource()==jbtn_salir) {
		
		System.exit(EXIT_ON_CLOSE);
		
		
	}
	
	}
}
