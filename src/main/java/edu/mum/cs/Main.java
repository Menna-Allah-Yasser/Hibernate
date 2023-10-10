package edu.mum.cs;


import edu.mum.cs.domain.BranchEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//import static javax.persistence.Persistence.createEntityManagerFactory;


public class Main {
    public static void main(String[] args) {

        try {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("edu.mum.cs");

            EntityManager em = emf.createEntityManager();

            BranchEntity branch = new BranchEntity("Alex Branch");

            em.getTransaction().begin();

            System.out.println("1---------------");
            em.persist(branch);
            System.out.println(branch);
            System.out.println("2---------------");
            branch.setBranchName("test");
            System.out.println("3---------------");
            em.getTransaction().commit();
            System.out.println("4---------------");
            em.close();
            emf.close();
            System.out.println("5---------------");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}