package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Perguntas;
import model.Questionario;
import model.RespostaUsuario;
import model.RespostasCad;
import model.Usuario;
import service.UsuarioService;

@Controller
public class UsuarioController {

	private UsuarioService usuarioService;
	
	@Autowired(required = true)
	@Qualifier(value = "UsuarioService")
	public void setUsuarioService(UsuarioService ps) {
	this.usuarioService = ps;
	}
	
	@RequestMapping(value = "/Usuarios", method = RequestMethod.GET)
			public String listUsuarios(Model model) {
			model.addAttribute("Usuario", new Usuario());
			model.addAttribute("listUsuarios", this.usuarioService.listUsuario());
			return "Usuario";
			}
	
	// For add and update usuario both
	@RequestMapping(value = "/Usuario/add", method = RequestMethod.POST)
	public String addUsuario(@ModelAttribute("Usuario") Usuario p) {
	if (p.getCodUsu()== 0) {
	// new phone, add it
	this.usuarioService.addUsuario(p);
	} else {
	// existing phone, call update
	this.usuarioService.updateUsuario(p);
	}
	return "redirect:/Usuarios";
	}
	
	@RequestMapping("/remove/{id}")
	public String removeUsuario(@PathVariable("id") int id) {
	this.usuarioService.removeUsuario(id);
	return "redirect:/removeUsuarios";
	}
	
	@RequestMapping("/edit/{id}")
	public String editUsuario(@PathVariable("id") int id, Model model) {
	model.addAttribute("usuario", this.usuarioService.getUsuarioById(id));
	model.addAttribute("listusuario", this.usuarioService.listUsuario());
	return "usuario";
	}

	
	

	
	
	@RequestMapping(value = "/Questionario", method = RequestMethod.GET)
	public String listQuestionario(Model model) {
	model.addAttribute("Questionario", new Questionario());
	model.addAttribute("listQuestionario", this.usuarioService.listQuestionario());
	return "Questionario";
	}

// For add and update Questionario both
@RequestMapping(value = "/Questionario/add", method = RequestMethod.POST)
public String addQuestionario(@ModelAttribute("Questionario") Questionario p) {
if (p.getCodQuest()== 0) {
// new phone, add it
this.usuarioService.addQuestionario(p);
} else {
// existing phone, call update
this.usuarioService.updateQuestionario(p);
}
return "redirect:/Questionario";
}

@RequestMapping("/removeQuestionario/{id}")
public String removeQuestionario(@PathVariable("id") int id) {
this.usuarioService.removeQuestionario(id);
return "redirect:/removeQuestionario";
}

@RequestMapping("/editQuestionario/{id}")
public String editQuestionario(@PathVariable("id") int id, Model model) {
model.addAttribute("Questionario", this.usuarioService.getQuestionarioByIdget(id));
model.addAttribute("listQuestionario", this.usuarioService.listQuestionario());
return "Questionario";
}

	



@RequestMapping(value = "/Perguntas", method = RequestMethod.GET)
public String listPerguntas(Model model) {
model.addAttribute("Perguntas", new Perguntas());
model.addAttribute("listPerguntas", this.usuarioService.listPerguntas());
return "Perguntas";
}

//For add and update Questionario both
@RequestMapping(value = "/Perguntas/add", method = RequestMethod.POST)
public String addPerguntas(@ModelAttribute("Perguntas") Perguntas p) {
if (p.getCodPerg()== 0) {
//new phone, add it
this.usuarioService.addPerguntas(p);
} else {
//existing phone, call update
this.usuarioService.updatePerguntas(p);
}
return "redirect:/Perguntas";
}

@RequestMapping("/removePerguntas/{id}")
public String removePerguntas(@PathVariable("id") int id) {
this.usuarioService.removePerguntas(id);
return "redirect:/removePerguntas";
}

@RequestMapping("/editPerguntas/{id}")
public String editPerguntas(@PathVariable("id") int id, Model model) {
model.addAttribute("Perguntas", this.usuarioService.getPerguntasByIdget(id));
model.addAttribute("listPerguntas", this.usuarioService.listPerguntas());
return "Perguntas";
}










@RequestMapping(value = "/RespostasCad", method = RequestMethod.GET)
public String listRespostasCad(Model model) {
model.addAttribute("RespostasCad", new RespostasCad());
model.addAttribute("listRespostasCad", this.usuarioService.listRespostasCad());
return "RespostasCad";
}

//For add and update RespostasCad both
@RequestMapping(value = "/RespostasCad/add", method = RequestMethod.POST)
public String addRespostasCad(@ModelAttribute("RespostasCad") RespostasCad p) {
if (p.getCodRespCad()== 0) {
//new phone, add it
this.usuarioService.addRespostasCad(p);
} else {
//existing phone, call update
this.usuarioService.updateRespostasCad(p);
}
return "redirect:/RespostasCad";
}

@RequestMapping("/removeRespostasCad/{id}")
public String removeRespostasCad(@PathVariable("id") int id) {
this.usuarioService.removeRespostasCad(id);
return "redirect:/removeRespostasCad";
}

@RequestMapping("/editRespostasCad/{id}")
public String editRespostasCad(@PathVariable("id") int id, Model model) {
model.addAttribute("RespostasCad", this.usuarioService.getRespostasCadByIdget(id));
model.addAttribute("listRespostasCad", this.usuarioService.listRespostasCad());
return "RespostasCad";
}



@RequestMapping(value = "/RespostaUsuario", method = RequestMethod.GET)
public String listRespostaUsuario(Model model) {
model.addAttribute("RespostaUsuario", new RespostaUsuario());
model.addAttribute("listRespostaUsuario", this.usuarioService.listRespostaUsuario());
return "RespostaUsuario";
}

//For add and update RespostaUsuario both
@RequestMapping(value = "/RespostaUsuario/add", method = RequestMethod.POST)
public String addQuestionario(@ModelAttribute("RespostaUsuario") RespostaUsuario p) {
if (p.getCodRespUsu()== 0) {
//new phone, add it
this.usuarioService.addRespostaUsuario(p);
} else {
//existing phone, call update
this.usuarioService.updateRespostaUsuario(p);
}
return "redirect:/RespostaUsuario";
}

@RequestMapping("/removeRespostaUsuario/{id}")
public String removeRespostaUsuario(@PathVariable("id") int id) {
this.usuarioService.removeRespostaUsuario(id);
return "redirect:/removeRespostaUsuario";
}

@RequestMapping("/editRespostaUsuario/{id}")
public String editRespostaUsuario(@PathVariable("id") int id, Model model) {
model.addAttribute("RespostaUsuario", this.usuarioService.getRespostaUsuarioByIdget(id));
model.addAttribute("listRespostaUsuario", this.usuarioService.listRespostaUsuario());
return "RespostaUsuario";
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
}
