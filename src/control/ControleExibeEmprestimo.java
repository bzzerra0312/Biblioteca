package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Emprestimo;
import view.ViewExibeEmprestimoString;
import view.ViewExibeEmprestimos;

public class ControleExibeEmprestimo {
	public ControleExibeEmprestimo() {
		BDSimulado bds = new BDSimulado();
		
		//recuperar emprestimos
		
		ArrayList<Emprestimo> emprestimos = bds.geEmprestimos();
		
		//exibir emprestimos
		
		ViewExibeEmprestimos vee = new ViewExibeEmprestimos(emprestimos);
		
		//exibir emprestimos usando outra classe
		
		String s = "";
		for (int i = 0; i < emprestimos.size(); i++) {
			s = s + "------------\n" + emprestimos.get(i);
			
		}
		
		ViewExibeEmprestimoString vees = new ViewExibeEmprestimoString(s);
	}

}
