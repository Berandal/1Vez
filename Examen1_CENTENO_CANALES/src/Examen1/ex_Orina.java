package Examen1;

import javax.swing.JOptionPane;

public class ex_Orina extends NODO_EXAMEN1{
	
	String exa_realizado="",resul_sedi="",resul_electro="",resul_creati="";
	double total_exa=0,abono=0,bills=0,saldo=0, saldos=0;
	String ingresos="";
	boolean menu=false;
	
	public ex_Orina() {
		super.ventana1();
		
		do {
			String key="";
			key=JOptionPane.showInputDialog("CUAL PAQUETE DESEA REALIZARSE"+
			"\n 1) SEDIMENTOS($20000)"+
				"\n 2) PAQUETE DE ELECTROLITOS Y CREATINA ($25000)"+
			"\n 3) PAQUETE TOTAL DE ORINA"+
			"\n 4)FINALIZAR");
			int llave=Integer.parseInt(key);
			
			switch (llave) {
			case 1:
				menu=true;
				double total=10000;
				setTotal_exa(total);
				
				ingresos=JOptionPane.showInputDialog("RESULTADO DE SEDIMENTOS");
				setResul_sedi(ingresos);
				setResul_electro("EXAMEN NO REALIZADO");
				
				setResul_creati("EXAMEN NO REALIZADO");
				setExa_realizado("SEDIMENTOS");
				
				
			bills=getTotal_exa()*50/100;
				
			setAbono(bills);
			
			saldo=getTotal_exa()-getAbono();
				setSaldos(saldo);
				setSaldo_final(getSaldos());
				
				
				break;
				
			case 2:
				menu=true;
				double tota=25000;
				
				setTotal_exa(tota);
				
				setExa_realizado("PAQUETE DE ELECTROLITOS Y CREATINA");
				setResul_sedi("EXAMEN NO REALIZADO");
				
				
				ingresos=JOptionPane.showInputDialog("RESULTADO DE ELECTROLITOS");
				setResul_electro(ingresos);
				
				ingresos=JOptionPane.showInputDialog("RESULTADO DE CREATINA");
				setResul_creati(ingresos);
				
				bills=getTotal_exa()*50/100;
				
				setAbono(bills);
				
				saldo=getTotal_exa()-getAbono();
					setSaldos(saldo);
					setSaldo_final(getSaldos());
				break;
				
			case 3:
				menu=true;
				double tot=45000;
				
				setTotal_exa(tot);
				
				setExa_realizado("PAQUETE COMPLETO DE ORINA");
			

				ingresos=JOptionPane.showInputDialog("RESULTADO DE SEDIMENTOS");
				setResul_sedi(ingresos);
				
				ingresos=JOptionPane.showInputDialog("RESULTADO DE ELECTROLITOS");
				setResul_electro(ingresos);
				
				ingresos=JOptionPane.showInputDialog("RESULTADO DE CREATINA");
				setResul_creati(ingresos);
				
				bills=getTotal_exa()*50/100;
				
				setAbono(bills);
				
				saldo=getTotal_exa()-getAbono();
					setSaldos(saldo);
					setSaldo_final(getSaldos());
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
				"\nExamen o paquete realizados:  "+getExa_realizado()+
				"\nCosto de examen: "+getTotal_exa()+
				"\nAbono inicial: "+getAbono()+
				"\nSaldo a pagar: "+getSaldos()+
				"\nSaldo final: "+getSaldo_final()+" ESTE ES EL SALDO A COBRAR"+
				"\n*****RESULTADOS DE EXAMENES******"+
				"\nSedimentos:"+getResul_sedi()+
				"\nElectrocitos: "+getResul_electro()+
				"\nCreatina: "+getResul_creati();
		
		return final_general;
	}
	
	public String getExa_realizado() {
		return exa_realizado;
	}
	public void setExa_realizado(String exa_realizado) {
		this.exa_realizado = exa_realizado;
	}
	public String getResul_sedi() {
		return resul_sedi;
	}
	public void setResul_sedi(String resul_sedi) {
		this.resul_sedi = resul_sedi;
	}
	public String getResul_electro() {
		return resul_electro;
	}
	public void setResul_electro(String resul_electro) {
		this.resul_electro = resul_electro;
	}
	public String getResul_creati() {
		return resul_creati;
	}
	public void setResul_creati(String resul_creati) {
		this.resul_creati = resul_creati;
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
	public double getSaldos() {
		return saldos;
	}
	public void setSaldos(double saldos) {
		this.saldos = saldos;
	}

}
