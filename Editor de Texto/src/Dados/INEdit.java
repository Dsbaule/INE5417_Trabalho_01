package Dados;

import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.persistence.*;

public class INEdit {
	
	private static EntityManagerFactory factory;
	private static EntityManager em;
	
	public INEdit (){
	    	try {
	    		factory = Persistence.createEntityManagerFactory("inedit_toplink"); // utiliza o TopLink-JPA - ver META-INF/persistence.xml para detalhes sobre esta configuracao
	    		em = factory.createEntityManager();
	    	} catch (Exception e) {
	    		e.printStackTrace();
	    		throw new java.lang.RuntimeException("erro ao configurar o mapeador");
	    	}
	}
		
	public void apagaTodosDadosDoBD () {
	    	try {
	    		em.getTransaction().begin();
	    		em.createQuery("delete from Usuario u").executeUpdate();
	    		em.createQuery("delete from Formatacao f").executeUpdate();
	    		em.createQuery("delete from Documento d").executeUpdate();
	    		em.getTransaction().commit();
	    		em.clear();
		} catch (Exception e) {
			e.printStackTrace();
			throw new java.lang.RuntimeException("erro ao apagar todos os dados do BD");
		}
	}
	
	// USUARIO

	public void cadastraUsuario(String nome) {
		try {
			em.getTransaction().begin();
                        Usuario usuario = em.find(Usuario.class, nome);
			if (usuario == null){			
				usuario = new Usuario(nome);
			}
			em.persist(usuario);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new java.lang.RuntimeException("erro ao inserir usuario");
		}
	}	
		
	public Usuario retornaUsuario(String nome) {
		try {
			return em.find(Usuario.class, nome);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void removeAluno(String nome) {
		try {
			em.remove(em.find(Usuario.class, nome));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// DOCUMENTO
	
	public void cadastraDocumento(String nomeDocumento, Usuario usuario, String texto, Formatacao formatacao) {
		try {
			em.getTransaction().begin();
			Documento documento = em.find(Documento.class, nomeDocumento);
			if (documento == null){			
				documento = new Documento(nomeDocumento, usuario);
			}
                        documento.setTexto(texto);
                        documento.setFormatacao(formatacao);
			em.persist(documento);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new java.lang.RuntimeException("erro ao inserir documento");
		}
	}
	
	public Documento retornaDocumento(String nomeDocumento) {
		try {
			return em.find(Documento.class, nomeDocumento);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void removeDocumento(String nomeDocumento) {
		try {
			em.remove(em.find(Documento.class, nomeDocumento));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// FORMATACAO
	
	public void cadastraFormatacao(String nomeFormatacao, Font fonte, int tamanho, Color corFonte, Color corFundo) {
		try {
			em.getTransaction().begin();
			Formatacao formatacao = em.find(Formatacao.class, nomeFormatacao);
			if (formatacao == null){			
				formatacao = new Formatacao();
			}
			formatacao.setNomeFormatacao(nomeFormatacao);
                        formatacao.setFonte(fonte);
                        formatacao.setTamanho(tamanho);
                        formatacao.setCorFonte(corFonte);
                        formatacao.setCorFundo(corFundo);
			em.persist(formatacao);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new java.lang.RuntimeException("erro ao inserir formatacao");
		}
	}
		
	public Formatacao retornaFormatacao(String nomeFormatacao) {
		try {
			return em.find(Formatacao.class, nomeFormatacao);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void removeFormatacao(String nomeFormatacao) {
		try {
			em.remove(em.find(Formatacao.class, nomeFormatacao));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
