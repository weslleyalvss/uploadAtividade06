package atividade06;

public class Main {
	
	public static void main(String[] args) {

		Notebook notebook = new Notebook ("ASUS");
	
		System.out.println(notebook.getTipoAparelho());
		notebook.carregar();
		System.out.println(notebook.toString());
		System.out.println("Bateria: mAh" + notebook.getMAH());
		System.out.println(notebook.getModeloProcessador());
		System.out.println("Potencia: " + notebook.getPotencia());
		System.out.println("Tela: " + notebook.getTipoTela());
	
}

}
