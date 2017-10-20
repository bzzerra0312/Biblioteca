package view;

import java.util.ArrayList;

import model.Emprestimo;

public class ViewExibeEmprestimos {
	public ViewExibeEmprestimos(ArrayList<Emprestimo> emprestimos) {
		for (int i = 0; i < emprestimos.size(); i++) {
			System.out.println("--------");
			System.out.println("Título: " + emprestimos.get(i).getLivro().getTitulo());
			System.out.println("Autor: " + emprestimos.get(i).getLivro().getAutor());
			System.out.println("Usuario: " + emprestimos.get(i).getUsuario().getNome());
			System.out.println("Data retirada: " + emprestimos.get(i).getDataRetirada()) ;
			System.out.println("Data devolução: " + emprestimos.get(i).getDataDevolucao());
			
		}
		
		
	}

}
