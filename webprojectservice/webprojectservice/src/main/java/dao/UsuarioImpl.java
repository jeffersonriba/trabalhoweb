package dao;

import java.util.List;

import javax.enterprise.inject.Model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Perguntas;
import model.Questionario;
import model.RespostasCad;
import model.Usuario;


@Repository
public class UsuarioImpl implements UsuarioDao { 

	
	private static final Logger logger = LoggerFactory.getLogger(model.Usuario.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf) 
	{
			this.sessionFactory = sf;
	}

	
	
	
			
	@Override
	public void addUsuario(Usuario p) 
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Usuario saved successfully, Usuario Details=" +p);

		
	}
		
		
	@Override
	public void updateUsuario(Usuario p) {
		
		Session session = this.sessionFactory.getCurrentSession();
				session.update(p);
				logger.info("Usuario updated successfully, Usuario Details="
				+ p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> listUsuarios() {
		
		Session session = this.sessionFactory.getCurrentSession();
				List<Usuario> usuarioList = session.createQuery("from TB_Usuario").list();
				for (Usuario p : usuarioList) {
				logger.info("Usuario List::" + p);
				}
				return usuarioList;

	}

	@Override
	public void removeUsuario(int id)
	{	
		Session session = this.sessionFactory.getCurrentSession();
		Usuario p = (Usuario) session.load(Usuario.class, new Integer(id));
		if (null != p)
		{
		session.delete(p);
		}
		logger.info("Phone deleted successfully, phone details="+ p);
	}

	@Override
	public Usuario getUsuarioByIdget(String email, String senha) {
	
		Session session = this.sessionFactory.getCurrentSession();
		Usuario p = (Usuario) session.load(Usuario.class ,new String(email));
		logger.info("Usuario Logado com suecesso" + p);
		return p;
		
	}



	@Override
	public void addQuestionario(Questionario p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Usuario saved successfully, Questionario Details=" +p);
		
	}

	@Override
	public void updateQuestionario(Questionario p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Questionario updated successfully, Questionario Details="
		+ p);
	}

	@Override
	public List<Questionario> listQuestionario() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Questionario> questionarioList = session.createQuery("from TB_Questionario").list();
		for (Questionario p : questionarioList) {
		logger.info("Questionario List::" + p);
		}
		return questionarioList;
	}

	@Override
	public Questionario getQuestionarioByIdget(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Questionario p = (Questionario) session.load(Questionario.class ,new Integer(id));
		return p;
	}


	@Override
	public void removeQuestionario(int id) {
	
		Session session = this.sessionFactory.getCurrentSession();
		Questionario p = (Questionario) session.load(Questionario.class, new Integer(id));
		if (null != p)
		{
		session.delete(p);
		}
		logger.info("Questionario deleted successfully, phone details="+ p);
		
		
	}


   
	


@Override
public void addPerguntas(Perguntas p) {
	Session session = this.sessionFactory.getCurrentSession();
	session.persist(p);
	logger.info("Perguntas saved successfully, Perguntas Details=" +p);
	
}

@Override
public void updatePerguntas(Perguntas p) {
	Session session = this.sessionFactory.getCurrentSession();
	session.update(p);
	logger.info("Perguntas updated successfully, Questionario Details="
	+ p);
}

@Override
public List<Perguntas> listPerguntas() {
	Session session = this.sessionFactory.getCurrentSession();
	List<Perguntas> perguntasList = session.createQuery("from TB_Perguntas").list();
	for (Perguntas p : perguntasList) {
	logger.info("Questionario List::" + p);
	}
	return perguntasList;
}

@Override
public Perguntas getPerguntasByIdget(int id) {
	Session session = this.sessionFactory.getCurrentSession();
	Perguntas p = (Perguntas) session.load(Perguntas.class ,new Integer(id));
	return p;
}

@Override
public void removePerguntas(int id) {

	Session session = this.sessionFactory.getCurrentSession();
	Perguntas p = (Perguntas) session.load(Perguntas.class, new Integer(id));
	if (null != p)
	{
	session.delete(p);
	}
	logger.info("Questionario deleted successfully, phone details="+ p);
	
	
}
	// TODO Auto-generated method stub	

	






	
@Override
public void addRespostasCad(RespostasCad p) {
	Session session = this.sessionFactory.getCurrentSession();
	session.persist(p);
	logger.info("RespostasCad saved successfully, Perguntas Details=" +p);
	
}

@Override
public void updateRespostasCad(RespostasCad p) {
	Session session = this.sessionFactory.getCurrentSession();
	session.update(p);
	logger.info("Perguntas updated successfully, Questionario Details="
	+ p);
}

@Override
public List<RespostasCad> listRespostasCad() {
	Session session = this.sessionFactory.getCurrentSession();
	List<RespostasCad> RespostasCad = session.createQuery("from TB_RespostasCad").list();
	for (RespostasCad p : RespostasCad) {
	logger.info("Questionario List::" + p);
	}
	return RespostasCad;
}

@Override
public RespostasCad getRespostasCadByIdget(int id) {
	Session session = this.sessionFactory.getCurrentSession();
	RespostasCad p = (RespostasCad) session.load(RespostasCad.class ,new Integer(id));
	return p;
}

@Override
public void removeRespostasCad(int id) {

	Session session = this.sessionFactory.getCurrentSession();
	RespostasCad p = (RespostasCad) session.load(RespostasCad.class, new Integer(id));
	if (null != p)
	{
	session.delete(p);
	}
	logger.info("RespostasCad deleted successfully, phone details="+ p);
	
}







@Override
public void addRespostaUsuario(model.RespostaUsuario p) {
Session session = this.sessionFactory.getCurrentSession();
session.persist(p);
logger.info("RespostaUsuario saved successfully, Perguntas Details=" +p);

}

@Override
public void updateRespostaUsuario(model.RespostaUsuario p) {
Session session = this.sessionFactory.getCurrentSession();
session.update(p);
logger.info("RespostaUsuario updated successfully, Questionario Details="
+ p);
}

@Override
public List<model.RespostaUsuario> listRespostaUsuario() {
Session session = this.sessionFactory.getCurrentSession();
List<model.RespostaUsuario> RespostaUsuario = session.createQuery("from TB_RESPUSU").list();
for (model.RespostaUsuario p : RespostaUsuario) {
logger.info("Questionario List::" + p);
}
return RespostaUsuario;
}

@Override
public model.RespostaUsuario getRespostaUsuarioByIdget(int id) {
Session session = this.sessionFactory.getCurrentSession();
model.RespostaUsuario p = (model.RespostaUsuario) session.load(model.RespostaUsuario.class ,new Integer(id));
return p;
}

@Override
public void removeRespostaUsuario(int id)
{
	Session session = this.sessionFactory.getCurrentSession();
	model.RespostaUsuario p = (model.RespostaUsuario) session.load(model.RespostaUsuario.class, new Integer(id));
	if (null != p)
	{
	session.delete(p);
	}
	logger.info("RespostaUsuario deleted successfully, phone details=" + p);
}





@Override
public List<model.RespostaUsuario> RespostaUsuario() {
	// TODO Auto-generated method stub
	return null;
}
	


	

}