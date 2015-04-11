package Examen1;

import javax.swing.JOptionPane;

public class exa_hemograma extends NODO_EXAMEN1 {
	
	String exa_1="",resul_hemato="",resul_leuco="",resul_ninfo="",resul_eritro="";
	double total_exa=0,abono=0,bills=0,saldo=0, saldos=0;
	boolean menu=false;
	
	public exa_hemograma(){
		super.ventana1();
		
		do {
			String key="";
			key=JOptionPane.showInputDialog("CUAL PAQUETE DESEA REALIZARSE"+
			"\n 1) PAQUETE DE HEMATOCRITOS Y LEUCOSITOS ($20000)"+
				"\n 2) PAQUETE DE NIMFOCITOS Y ERITROCITOS($20000 )"+
			"\n 3) PAQUETE TOTAL($40000)"+
			"\n 4)FINALIZAR");//se utilizo el simbolo de dolar ya que el de colones daba conflictos al guardar.
			int llave=Integer.parseInt(key);
			
			switch (llave) {
			case 1:
				menu=true;
				double total=10000;
				setTotal_exa(total);
				String ingresos="";
				
				ingresos=JOptionPane.showInputDialog("RESULTADO DE HEMATOCRITOS");
				setResul_hemato(ingresos);
				
				ingresos=JOptionPane.showInputDialog("RESULTADO DE HEMATOCRITOS");
				setResul_leuco(ingresos);
				
				
				setResul_eritro("EXAMEN NO REALIZADO");
				setResul_ninfo("EXAMEN NO REALIZADO");
		
				setExa_1("PAQUETE DE HEMATOCRITOS Y LEUCOSITOS");
				
			bills=getTotal_exa()*50/100;
				
			setAbono(bills);
			
			saldos=getTotal_exa()-getAbono();
				setSaldo(saldos);
				setSaldo_final(getSaldo());
				
				break;
				
			case 2:
				menu=true;
				double totales=20000;
				setTotal_exa(totales);
				String ingreso="";
				
				ingreso=JOptionPane.showInputDialog("RESULTADO DE ERITROCITOS");
				setResul_hemato(ingreso);
				
				ingreso=JOptionPane.showInputDialog("RESULTADO DE NIMFOCITOS");
				setResul_leuco(ingreso);
				
				
			setResul_hemato("EXAMEN NO REALIZADO");
			setResul_leuco("EXAMEN NO REALIZADO");
			
		
				setExa_1("PAQUETE DE HEMATOCRITOS Y LEUCOSITOS");
				
			bills=getTotal_exa()*50/100;
				
			setAbono(bills);
			
			saldos=getTotal_exa()-getAbono();
				setSaldo(saldos);
				setSaldo_final(getSaldo());
				break;
				
			case 3:
				
				menu=true;
				double tota=20000;
				setTotal_exa(tota);
				String ingres="";
				
				ingres=JOptionPane.showInputDialog("RESULTADO DE ERITROCITOS");
				setResul_eritro(ingres);
				
				ingres=JOptionPane.showInputDialog("RESULTADO DE LEUCOCITOSS");
				setResul_leuco(ingres);
				
				ingresos=JOptionPane.showInputDialog("RESULTADO DE NINFOCITOS");
				setResul_ninfo(ingresos);
				
				ingresos=JOptionPane.showInputDialog("RESULTADO DE HEMATROCITOS");
				setResul_hemato(ingresos);
				
				
			
			
		
				setExa_1("PAQUETE TOTAL DE HEMOGRAMA");
				
			bills=getTotal_exa()*50/100;
				
			setAbono(bills);
			
			saldos=getTotal_exa()-getAbono();
				setSaldo(saldos);
				setSaldo_final(getSaldo());
				break;
				
			case 4:
				menu=false;
				break;

			default:
				break;
			}
			
		} while (!menu);
	}
	
	public String mostrar(){
		String final_general="RESULTADOS FINALES"+"\n";
		
		final_general+= super.mostrar()+
				"\nExamen o paquete realizados:  "+getExa_1()+
				"\nCosto de examen: "+getTotal_exa()+
				"\nAbono inicial: "+getAbono()+
				"\nSaldo a pagar: "+getSaldo()+
				"\nSaldo final: "+getSaldo_final()+" ESTE ES EL SALDO A COBRAR"+
				"\n*****RESULTADOS DE EXAMENES******"+
				"\nHEMATOCRITOS:"+getResul_hemato()+
				"\nLEUCOCITOS: "+getResul_leuco()+
				"\nNINFOCITOS: "+getResul_ninfo()+
				"\nERITROCITOS: "+ getResul_eritro();
		
		return final_general;
	}

	public String getResul_hemato() {
		return resul_hemato;
	}

	public void setResul_hemato(String resul_hemato) {
		this.resul_hemato = resul_hemato;
	}

	public String getResul_leuco() {
		return resul_leuco;
	}

	public void setResul_leuco(String resul_leuco) {
		this.resul_leuco = resul_leuco;
	}

	public String getResul_ninfo() {
		return resul_ninfo;
	}

	public void setResul_ninfo(String resul_ninfo) {
		this.resul_ninfo = resul_ninfo;
	}

	public String getResul_eritro() {
		return resul_eritro;
	}

	public void setResul_eritro(String resul_eritro) {
		this.resul_eritro = resul_eritro;
	}

	public double getTotal_exa() {
		return total_exa;
	}

	public void setTotal_exa(double total_exa) {
		this.total_exa = total_exa;
	}

	public double getAbono() {
		return abono;
	}

	public void setAbono(double abono) {
		this.abono = abono;
	}

	public double getBills() {
		return bills;
	}

	public void setBills(double bills) {
		this.bills = bills;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getExa_1() {
		return exa_1;
	}

	public void setExa_1(String exa_1) {
		this.exa_1 = exa_1;
	}


	
	
	

}
