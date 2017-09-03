package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.UsuarioDao;
import model.Perguntas;
import model.Questionario;
import model.RespostasCad;
import model.Usuario;

public class UsuarioServiceImpl  implements UsuarioService {

	
	@Autowired
	private UsuarioDao usuariodao;
	
	public void setUsuarioDao(UsuarioDao usuariodao)
	{
		this.usuariodao = usuariodao;
	}
	
	@Override
	public void addUsuario(Usuario p) {
		this.usuariodao.addUsuario(p);
	}

	@Override
	public void updateUsuario(Usuario p) {
		
		this.usuariodao.updateUsuario(p);
	}

	@Override
	public List<Usuario> listUsuario() {
		return this.usuariodao.listUsuarios();	
	}

	@Override
	public void removeUsuario(int id) {
		this.usuariodao.removeUsuario(id);
	}

	@Override
	public Usuario getUsuarioById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addQuestionario(Questionario p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateQuestionario(Questionario p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Questionario> listQuestionario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Questionario getQuestionarioByIdget(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeQuestionario(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPerguntas(Perguntas p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePerguntas(Perguntas p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Perguntas> listPerguntas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perguntas getPerguntasByIdget(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePerguntas(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRespostasCad(RespostasCad p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRespostasCad(RespostasCad p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RespostasCad> listRespostasCad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RespostasCad getRespostasCadByIdget(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeRespostasCad(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRespostaUsuario(model.RespostaUsuario p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRespostaUsuario(model.RespostaUsuario p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<model.RespostaUsuario> RespostaUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public model.RespostaUsuario getRespostaUsuarioByIdget(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeRespostaUsuario(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<model.RespostaUsuario> listRespostaUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
}
