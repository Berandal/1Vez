package Examen1;



import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NODO_EXAMEN1 extends JFrame implements Serializable , ActionListener  {
	private JTextField jtf_cedula;
	private JButton jbtn_seguir;
	private JButton jbtn_atras;
	private double saldo_final=0;
	private String nombre="",num_dni="",edad="";
	



	NODO_EXAMEN1 sgt;
		
	private JTextField jtf_nombre;
	double suma=0;
	private JTextField jtf_edad;

	public NODO_EXAMEN1() {
		getContentPane().setEnabled(false);          }

	public void ventana1(){
	setSize(359,313);
	setResizable(false);
	
	JPanel panel = new JPanel();
	getContentPane().add(panel, BorderLayout.CENTER);
	panel.setLayout(null);
	
	JLabel lblIngresoDeCliente = new JLabel("INGRESO DE CLIENTE");
	lblIngresoDeCliente.setFont(new Font("Tahoma", Font.BOLD, 18));
	lblIngresoDeCliente.setBounds(91, 11, 241, 40);
	panel.add(lblIngresoDeCliente);
	
	JLabel lblNombre = new JLabel("Nombre:");
	lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
	lblNombre.setBounds(10, 47, 95, 35);
	panel.add(lblNombre);
	
	jtf_nombre = new JTextField();
	jtf_nombre.setBounds(77, 56, 217, 20);
	panel.add(jtf_nombre);
	jtf_nombre.setColumns(10);
	
	JLabel lblCedula = new JLabel("DNI:");
	lblCedula.setFont(new Font("Tahoma", Font.PLAIN, 15));
	lblCedula.setBounds(10, 86, 64, 33);
	panel.add(lblCedula);
	
	jtf_cedula = new JTextField();
	jtf_cedula.setBounds(77, 93, 217, 20);
	panel.add(jtf_cedula);
	jtf_cedula.setColumns(10);
	
	jbtn_seguir = new JButton("SEGUIR");
	jbtn_seguir.setFont(new Font("Tahoma", Font.PLAIN, 15));
	jbtn_seguir.setBounds(77, 172, 95, 49);
	panel.add(jbtn_seguir);
	
	jbtn_atras = new JButton("ATRAS");
	jbtn_atras.setFont(new Font("Tahoma", Font.PLAIN, 15));
	jbtn_atras.setBounds(205, 172, 89, 49);
	panel.add(jbtn_atras);
	
	JLabel lblEdad = new JLabel("EDAD: ");
	lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 15));
	lblEdad.setBounds(10, 139, 64, 14);
	panel.add(lblEdad);
	
	jtf_edad = new JTextField();
	jtf_edad.setBounds(77, 138, 217, 20);
	panel.add(jtf_edad);
	jtf_edad.setColumns(10);
	
	setVisible(true);
	
	jbtn_seguir.addActionListener(this);
	jbtn_atras.addActionListener(this);
	

	
	
}

	
	
	public String mostrar(){
	
		
		
		
		String result="***************************************";
		result+="\nNombre del cliente: "+getNombre()+
				"\nNumero de Cedula: "+getNum_dni()+
				"\nEdad: "+getEdad();
		
		return result;
	}

	public void actionPerformed(ActionEvent accion) {
		if (accion.getSource()==jbtn_seguir) {
			setNombre(jtf_nombre.getText());
			setNum_dni(jtf_cedula.getText());
			setEdad(jtf_edad.getText());
			
			setVisible(false);
			
		
			
			
		}
		
		if (accion.getSource()==jbtn_atras) {
			setVisible(false);
			Ventana_general ventana_atras= new Ventana_general();
			ventana_atras.setVisible(true);
		}
	}

	
	public NODO_EXAMEN1 getSgt() {
		return sgt;
	}

	public void setSgt(NODO_EXAMEN1 sgt) {
		this.sgt = sgt;
	}
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getNum_dni() {
		return num_dni;
	}



	public void setNum_dni(String num_dni) {
		this.num_dni = num_dni;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public double getSaldo_final() {
		return saldo_final;
	}

	public void setSaldo_final(double saldo_final) {
		this.saldo_final = saldo_final;
	}

	
}
