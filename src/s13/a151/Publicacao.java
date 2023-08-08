package s13.a151;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Publicacao {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date horario;
	private String titulo;
	private String conteudo;
	private Integer likes;
	private List<Comentario> comentarios = new ArrayList<>();
	
	public Publicacao() {
		
	}

	public Publicacao(Date horario, String titulo, String conteudo, Integer likes) {
		setHorario(horario);
		setTitulo(titulo);
		setConteudo(conteudo);
		setLikes(likes);
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}
	
	public void adicionarComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	
	public void removerComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(likes + " Likes - ");
		sb.append(sdf.format(horario) + "\n");
		sb.append(conteudo + "\n");
		sb.append("Comentários: \n");
		for (Comentario comentario : comentarios) {
			sb.append(comentario.getTexto() + "\n");
		}
		return sb.toString();
	}
}