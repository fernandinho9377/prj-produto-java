package org.senai.prjprodutosjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


//http://localhost:8080/api/user/usuario/add?nome=Playstation5&descricao=VideoGamedafabricanteSONY&valor=4900.90

@Controller
@RequestMapping(path = "/api/usuario")
public class UsuarioController {
 
    @Autowired
    UsuarioRepository uRepository;
    
    @PostMapping("/add")
    public @ResponseBody String addUsuario(
            @RequestParam String nome,
            @RequestParam String descricao,
            @RequestParam Integer valor){
        Usuario objU = new Usuario();
            objU.setNome(nome);
            objU.setDescricao(descricao);
            objU.setValor(valor);
            uRepository.save(objU);
            return "Salvo";
        }
        @GetMapping("/all")
        public @ResponseBody Iterable<Usuario> buscarUsuario(){
    return uRepository.findAll();
}

}
