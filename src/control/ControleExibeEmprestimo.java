package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Emprestimo;

public class ControleExibeEmprestimo {
	public ControleExibeEmprestimo() {
		BDSimulado bds = new BDSimulado();
		
		//recuperar emprestimos
		ArrayList<Emprestimo> emprestimos = bds.geEmprestimos();
		
		//exibir emprestimos
		
		
		
	}

}
