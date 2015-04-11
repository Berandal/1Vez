package Examen1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JOptionPane;

public class Lista_examen1 implements Serializable {

	private NODO_EXAMEN1 inicio;
	private NODO_EXAMEN1 ultimo;
	private double sumas = 0;
	String general = "";
	private int size = 0;

	public Lista_examen1() {
		this.inicio = null;

		this.size = 0;

	}

	public boolean siVacio() {
		return (this.inicio == null);
	}

	public void inserta() {

		int x;
		x = Integer.parseInt(JOptionPane
				.showInputDialog("Que tipo de examen desea realizar?"
						+ "\n 1)General" + "\n 2)Hemograma" + "\n 3)Orina"
						+ "\n 4)Acido Urico"));
		if (x == 1) {

			exa_general nuevo = new exa_general();

			if (siVacio()) {
				this.inicio = nuevo;
			} else {
				ultimo = inicio;
				while (ultimo.sgt != null) {
					ultimo = ultimo.sgt;
				}
				ultimo.sgt = nuevo;
			}

			general += "\n" + nuevo.getNombre() + " " + nuevo.getSaldo();

			sumas += nuevo.getSaldo();

			this.size++;
		}

		else if (x == 2) {
			exa_hemograma nuevo = new exa_hemograma();
			if (siVacio()) {
				this.inicio = nuevo;
			} else {
				ultimo = inicio;
				while (ultimo.sgt != null) {
					ultimo = ultimo.sgt;
				}
				ultimo.sgt = nuevo;
			}

			general += "\n" + nuevo.getNombre() + " " + nuevo.getSaldo();

			sumas += nuevo.getSaldo();
			this.size++;
		} else if (x == 3) {
			ex_Orina nuevo = new ex_Orina();
			if (siVacio()) {
				this.inicio = nuevo;
			} else {
				ultimo = inicio;
				while (ultimo.sgt != null) {
					ultimo = ultimo.sgt;
				}
				ultimo.sgt = nuevo;
			}

			general += "\n" + nuevo.getNombre() + " " + nuevo.getSaldos();

			sumas += nuevo.getSaldos();

			this.size++;
		} else if (x == 4) {
			ex_Acido_urico nuevo = new ex_Acido_urico();
			if (siVacio()) {
				this.inicio = nuevo;
			} else {
				ultimo = inicio;
				while (ultimo.sgt != null) {
					ultimo = ultimo.sgt;
				}
				ultimo.sgt = nuevo;
			}

			general += "\n" + nuevo.getNombre() + " " + nuevo.getSaldos();

			sumas += nuevo.getSaldos();
			this.size++;
		}

	}

	public String muestra_general() {
		String fin = " ";

		fin += "\n" + general;

		fin += "\nEL TOTAL DEL DIA ES: " + sumas;
		return fin;
	}

	public String mostrar_todo() {
		String todo = "";
		String todos = "NOMBRE	" + "SALDOS";
		if (inicio != null) {
			NODO_EXAMEN1 actual = inicio;

			while (actual != null) {
				actual.toString();
				todo += actual.mostrar();
				actual = actual.sgt;
			}
		} else {
			todo = "LISTA TOTALMENTE VACÍA" + "\nLISTA TOTALMENTE VACÍA";
		}

		return todo;
	}

	public String buscar() {
		String encuentra = "";

		NODO_EXAMEN1 actual = inicio;

		String Ced = JOptionPane
				.showInputDialog("Digite el Numero de DNI del cliente a buscar: ");

		do {
			if (actual.getNum_dni().equals(Ced)) {
				actual.toString();
				encuentra = actual.mostrar();
				actual = actual.sgt;
			} else if (actual.getNum_dni() != Ced) {
				actual = actual.sgt;
			}
		} while (actual != null);

		return encuentra;
	}

	public void elimina() {

		NODO_EXAMEN1 ant = null;
		NODO_EXAMEN1 este = inicio;

		String texto = "";

		if (este != null) {

			texto = JOptionPane
					.showInputDialog("Ingrese el numero de DNI del cliente a eliminar ");

			boolean esto = false;

			while (este != null) {

				if (este.getNum_dni().equals(texto)) {

					if (este.getSaldo_final() <= 0) {
						esto = true;
						JOptionPane.showMessageDialog(null,
								"Cliente eliminado cuenta saldada !!!");
						if (este == inicio) {

							if (este.sgt == null) {
								inicio = null;
								;
								break;
							}
							inicio = inicio.sgt;
							;
							break;
						}
						if (este != inicio && este.sgt != null) {
							ant.sgt = este.sgt;
							;
							break;
						}
						if (este.sgt == null) {
							ant.sgt = null;
							;
							break;
						}
					} else {
						JOptionPane.showMessageDialog(null,
								"Aun no se ah cancelado la cuenta");
					}

				}

				ant = este;
				este = este.sgt;

			}
			este = inicio;

			if (este == null) {
				JOptionPane.showMessageDialog(null, " La lista esta vacia");
			}

		}

	}

	public void abono() {
		String encuentra = "";
		double abono = 0, saldo = 0;
		boolean existe=false;

		NODO_EXAMEN1 actual = inicio;

		String dni = JOptionPane
				.showInputDialog("Digite el Numero de DNI del cliente para abonar: ");
		String dnis = JOptionPane
				.showInputDialog("Cuanto desea abonar a la cuenta?");
		abono = Double.parseDouble(dnis);
		do {
			if (actual.getNum_dni().equals(dni)) {
				saldo = actual.getSaldo_final();
				existe=true;
				actual.setSaldo_final(saldo - abono);

				break;
			}else {
				if (existe) {
					JOptionPane.showMessageDialog(null, "NO SE ENCUENTRA EN LA LISTA");
				}
				
			}
			actual = actual.sgt;

		} while (actual != null);

	}

	public void Guardar() throws FileNotFoundException, IOException {
		NODO_EXAMEN1 gue = inicio;
		File g = new File("clinico.dat");
		ObjectOutputStream re = new ObjectOutputStream(new FileOutputStream(g));
		while (gue != null) {
			re.writeObject(gue);
			gue = gue.sgt;
		}
		JOptionPane.showMessageDialog(null, "DATOS GUARDADOS");
		re.close();
	}

	public Lista_examen1 leer() throws FileNotFoundException, IOException,
			ClassNotFoundException {// INICIO METODO RECUPERAR
		File f = new File("clinico.dat");
		NODO_EXAMEN1 Nuevo = null;
		NODO_EXAMEN1 leido = new NODO_EXAMEN1();
		ObjectInputStream OIS = new ObjectInputStream(new FileInputStream(f));

		if (siVacio()) {
			leido = (NODO_EXAMEN1) OIS.readObject();
			JOptionPane.showMessageDialog(null, "DATOS RECUPERADOS");
			inicio = leido;
			Nuevo = leido.sgt;
			ultimo = Nuevo;
		} else {
			JOptionPane.showMessageDialog(null,
					"DATOS RECUPERADOS ANTERIORMENTE");
		}

		OIS.close();
		return this;
	}

}
