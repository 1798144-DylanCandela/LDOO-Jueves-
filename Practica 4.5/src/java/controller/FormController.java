
package controller;

import modelos.Usuario;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


public class FormController {
    
    @RequestMapping(value="form.htm",method=RequestMethod.GET)
    public ModelAndView form(){
        return new ModelAndView("form","command",new Usuario("examble","example@example.com",00,"example"));
        
    }
    
    //Aqui se envia nuestro formulario y se carga :o y se resiven los datos  
    @RequestMapping(value="form.htm",method=RequestMethod.POST)
    
    //ModelMap nos ayuda a procesar mapeos del MODELANDVIEW
    public String form(Usuario per,ModelMap model){
        
        model.addAttribute("nombre",per.getNombre());
        model.addAttribute("apellido",per.getApellido());
        model.addAttribute("correo",per.getCorreo());
        model.addAttribute("edad",per.getEdad());

        return "exito";
    }
}

//LUGAR DE REFERENCIAS PARA HACER ESTA PRACTICA
//Dylan Andres Candela Rodrigez
//Matricula:1798144
//1:https://www.youtube.com/watch?v=ye_0sRyHBmM&t=10s
//2:https://www.youtube.com/watch?v=1jQpvsZoh68
//3:
//4:https://www.youtube.com/watch?v=teyJyFYx5kw
//5:https://www.youtube.com/watch?v=gM3cOAP65nI