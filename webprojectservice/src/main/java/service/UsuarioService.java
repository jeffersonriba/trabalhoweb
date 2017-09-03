package service;

import java.util.List;

import model.Perguntas;
import model.Questionario;
import model.RespostaUsuario;
import model.RespostasCad;
import model.Usuario;

public interface UsuarioService 
{

	public void addUsuario(Usuario p);
	public void updateUsuario(Usuario p);
	public List<Usuario> listUsuario();
	public Usuario getUsuarioById(int id);
	public void removeUsuario(int id);
	
	
	
	// Questionario
	public void addQuestionario(Questionario p);
	public void updateQuestionario(Questionario p);
	public List<Questionario> listQuestionario();
	public Questionario getQuestionarioByIdget(int id);
	public void removeQuestionario(int id);
	
	
	// Perguntas
	public void addPerguntas(Perguntas p);
	public void updatePerguntas(Perguntas p);
	public List<Perguntas> listPerguntas();
	public Perguntas getPerguntasByIdget(int id);
	public void removePerguntas(int id);
		
		
	// RespostasCad
	public void addRespostasCad(RespostasCad p);
	public void updateRespostasCad(RespostasCad p);
	public List<RespostasCad> listRespostasCad();
	public RespostasCad getRespostasCadByIdget(int id);
	public void removeRespostasCad(int id);
		
		
	// TB_RESPUSU
	public void addRespostaUsuario(RespostaUsuario p);
	public void updateRespostaUsuario(RespostaUsuario p);
	public List<RespostaUsuario> RespostaUsuario();
	public RespostaUsuario getRespostaUsuarioByIdget(int id);
	public void removeRespostaUsuario(int id);
	List<RespostaUsuario> listRespostaUsuario();
	

	
}
