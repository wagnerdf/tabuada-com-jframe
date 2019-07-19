package Tabuada;

public class AritimeticaTabuada{
	
	public AritimeticaTabuada() {
		// TODO Auto-generated constructor stub
	}
	
	public String soma(int op) {
		int i;
		String resultado = "";
			for(i=0;i<10;i++) {
				resultado = resultado+("                "+op+"     +     "+i+"     =     "+(op+i)+"\n");
			}
		return resultado;
	}
	
	public String subtracao(int op) {
		int i;
		String resultado = "";
			for(i=0;i<10;i++) {
				resultado = resultado+("                "+op+"     -     "+i+"     =     "+(op-i)+"\n");
			}
		return resultado;
	}
	
	public String divisao(int op) {
		int i;
		int num = op;
		String resultado = "";
			for(i=0;i<10;i++) {
				resultado = resultado+("                "+num+"     /     "+op+"     =     "+(num/op)+"\n");
				num = num+op;
			}
		return resultado;
	}
	
	public String multiplicacao(int op) {
		int i;
		String resultado = "";
			for(i=0;i<10;i++) {
				resultado = resultado+("                "+op+"     *     "+i+"     =     "+(op*i)+"\n");
			}
		return resultado;
	}
	
}