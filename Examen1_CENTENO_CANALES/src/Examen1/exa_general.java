package Examen1;

import javax.swing.JOptionPane;

public class exa_general extends NODO_EXAMEN1 {
	String exa_realizado="",resul_glice="",resul_trigli="",resul_coles="";
	double total_exa=0,abono=0,bills=0,saldo=0, saldos=0;
	boolean menu=false;
	
	


	public exa_general(){
		super.ventana1();
		
		do {
			String key="";
			key=JOptionPane.showInputDialog("CUAL PAQUETE DESEA REALIZARSE"+
			"\n 1) GLISEMIA($10000)"+
				"\n 2) PAQUETE DE TRIGLICERIDOS Y COLESTEROL($20000 )"+
			"\n 3) PAQUETE TOTAL"+
			"\n 4)FINALIZAR");
			int llave=Integer.parseInt(key);
			
			switch (llave) {
			case 1:
				menu=true;
				double total=10000;
				String ingresos="";
				
				ingresos=JOptionPane.showInputDialog("RESULTADO DE GLICEMIO");
				setResul_glice(ingresos);
				setResul_coles("EXAMEN NO REALIZADO");
				setResul_trigli("EXAMEN NO REALIZADO");
				setExa_total(total);	
				setExa_1("GLICEMIA");
				
			bills=getExa_total()*50/100;
				
			setAbono(bills);
			
			saldos=getExa_total()-getAbono();
				setSaldo(saldos);
				
				setSaldo_final(getSaldo());
				
				
				break;
				
			case 2:
				menu=true;
				double tota=20000;
				
				setExa_total(tota);	
				setExa_1("PAQUETE DE TRIGLICERIDOS Y COLESTEROL");
				setResul_glice("EXAMEN NO REALIZADO");
				
				ingresos=JOptionPane.showInputDialog("RESULTADO DE triglisediros");
				setResul_trigli(ingresos);
				
				ingresos=JOptionPane.showInputDialog("RESULTADO DE COLESTEROL");
				setResul_coles(ingresos);
				
				bills=getExa_total()*50/100;
				
				setAbono(bills);
				
				saldos=getExa_total()-getAbono();
					setSaldo(saldos);
					setSaldo_final(getSaldo());
					
				break;
				
			case 3:
				menu=true;
				double totales=30000;
				setExa_total(totales);	
				setExa_1("PAQUETE TOTAL");
				
				
				ingresos=JOptionPane.showInputDialog("RESULTADO DE GLICEMIO");
				setResul_glice(ingresos);
				ingresos=JOptionPane.showInputDialog("RESULTADO DE triglisediros");
				setResul_trigli(ingresos);
				
				ingresos=JOptionPane.showInputDialog("RESULTADO DE COLESTEROL");
				setResul_coles(ingresos);
				bills=getExa_total()*50/100;
				
				setAbono(bills);
				
				saldos=getExa_total()-getAbono();
					setSaldo(saldos);
					setSaldo_final(getSaldo());
				break;
			case 4:
				
				menu=false;
					break;
				

			default:
				break;
			}
			
		} while (menu);
	}

	
	public String mostrar(){
		String final_general="RESULTADOS FINALES"+"\n";
		
		final_general+= super.mostrar()+
				"\nExamen o paquete realizados:  "+getExa_1()+
				"\nCosto de examen: "+getExa_total()+
				"\nAbono inicial: "+getAbono()+
				"\nSaldo a pagar: "+getSaldo()+
				"\nSaldo final: "+getSaldo_final()+" ESTE ES EL SALDO A COBRAR"+
				"\n*****RESULTADOS DE EXAMENES******"+
				"\nGLICEMIA:"+getResul_glice()+
				"\nTRIGLICERIDOS: "+getResul_trigli()+
				"\nCOLESTEROL: "+getResul_coles();
		
		return final_general;
	}

	public String getExa_1() {
		return exa_realizado;
	}


	public void setExa_1(String exa_1) {
		this.exa_realizado = exa_1;
	}


	

	public double getExa_total() {
		return total_exa;
	}


	public void setExa_total(double exa_glice) {
		this.total_exa = exa_glice;
	}




	public String getResul_glice() {
		return resul_glice;
	}


	public void setResul_glice(String resul_glice) {
		this.resul_glice = resul_glice;
	}


	public String getResul_trigli() {
		return resul_trigli;
	}


	public void setResul_trigli(String resul_trigli) {
		this.resul_trigli = resul_trigli;
	}


	public String getResul_coles() {
		return resul_coles;
	}


	public void setResul_coles(String resul_coles) {
		this.resul_coles = resul_coles;
	}


	public double getAbono() {
		return abono;
	}


	public void setAbono(double abono) {
		this.abono = abono;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
