package br.com.fiap.atividadeextra4;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App {

	public static void main(String[] args) {
		
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("PersistenciaAtividade4");
	      EntityManager entitymanager = emfactory.createEntityManager();

	      //Scalar function
	      Query query = entitymanager.createQuery("SELECT * FROM PACIENTE;");
	      List<String> list = query.getResultList();

	      for(String e:list) {
	         System.out.println("PACIENTE NAME :"+e);
	      }
	      
	      //Aggregate function
//	      Query query1 = entitymanager.createQuery("Select MAX(e.salary) from Employee e");
//	      Double result = (Double) query1.getSingleResult();
//	      System.out.println("Max Employee Salary :" + result);
	      
	}
	
}
