package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class BDSimulado {
	private ArrayList<Livro> livros = new ArrayList<Livro> ();
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario> ();
	private ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo> ();
	private ArrayList<Bibliotecario> bibliotecarios = new ArrayList<Bibliotecario> ();
	
	public BDSimulado(){
		Livro l1= new Livro("Livro 1","Autor 1","Editora A","2012","123");
		Livro l2= new Livro("Livro 2","Autor 2","Editora B","2012","122");
		Livro l3= new Livro("Livro 3","Autor 3","Editora C","2010","121");
	      
		  this.livros.add(l1);
	      this.livros.add(l2);
	      this.livros.add(l3);
	      
	      Usuario u1 = new Usuario("Jorgin","RA31232","Direito");
	      Usuario u2 = new Usuario("Vitoria","RA21232","Direito");
	      Usuario u3 = new Usuario("Manuela","RA31200","História");
	      
	      this.usuarios.add(u1);
	      this.usuarios.add(u2);
	      this.usuarios.add(u3);
	      
	      Bibliotecario b1 = new Bibliotecario("Clayton","123321");
	      Bibliotecario b2 = new Bibliotecario("Julia","103321");
	      
	      this.bibliotecarios.add(b1);
	      this.bibliotecarios.add(b2);
	      
	      Emprestimo e1 = new Emprestimo(l1, u3, b2, LocalDate.of(2017, 9, 9), LocalDate.of(2017, 9, 16));
	      Emprestimo e2 = new Emprestimo(l2, u2, b1, LocalDate.of(2017, 8, 03), LocalDate.of(2017, 8, 10));
	      Emprestimo e3 = new Emprestimo(l3, u1, b1, LocalDate.of(2017, 10, 10), LocalDate.of(2017, 10, 17));
	      Emprestimo e4 = new Emprestimo(l1, u1, b2, LocalDate.of(2017, 9, 03), LocalDate.of(2017, 9, 10));
	      
	      this.emprestimos.add(e1);
	      this.emprestimos.add(e2);
	      this.emprestimos.add(e3);
	      this.emprestimos.add(e4);
	
	}
	public ArrayList<Emprestimo> geEmprestimos(){
		return this.emprestimos;
		
	}
	
}
