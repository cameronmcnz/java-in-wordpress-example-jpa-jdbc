package com.mcnz.wordpress;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JavaInWordPressExample {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("wordress-in-java-project");
		EntityManager entityManager = emf.createEntityManager();
		
		entityManager.getTransaction().begin();
		Query query = entityManager.createNamedQuery("Post.findAll");
		
		List<Post> results = query.getResultList();
		
		for (Post post : results) {
			System.out.println(post.getPostTitle());
			if (post.getPostTitle().contains("Goodbye")) {
				//post.setPostTitle("Goodbye World!!!");
				entityManager.remove(post);
			}
		}
		
		entityManager.getTransaction().commit();
		
	}

}
