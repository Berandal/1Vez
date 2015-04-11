package Examen1;

import javax.swing.JOptionPane;

public class ex_Acido_urico extends NODO_EXAMEN1{

	String exa_realizado="",resul_acidoi="";
	double total_exa=0,abono=0,bills=0,saldo=0, saldos=0;
	String ingresos="";
	boolean menu=false;
	
	
	public ex_Acido_urico(){

		super.ventana1();
		double total=10000;
		setTotal_exa(total);

		ingresos=JOptionPane.showInputDialog("INGRESE EL RESULTADO DE ACIDO URICO");
			setResul_acidoi(ingresos);
				menu=true;
				
				
			
				
				
			bills=getTotal_exa()*50/100;
				
			setAbono(bills);
			
			saldo=getTotal_exa()-getAbono();
				setSaldos(saldo);
				setSaldo_final(getSaldos());
		
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
				"\nACIDO URICO: "+getResul_acidoi();
		
		return final_general;
	}
	public String getExa_realizado() {
		return exa_realizado;
	}
	public void setExa_realizado(String exa_realizado) {
		this.exa_realizado = exa_realizado;
	}
	public String getResul_acidoi() {
		return resul_acidoi;
	}
	public void setResul_acidoi(String resul_acidoi) {
		this.resul_acidoi = resul_acidoi;
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
