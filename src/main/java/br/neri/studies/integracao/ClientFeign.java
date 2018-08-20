package br.neri.studies.integracao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/*
 * 
 * Exemplo Feign - Será utilizado para consumir serviços
 */

@FeignClient(name = "alias", url = "url_base_entry_point")
public interface ClientFeign {
	
	
	/** No Lugar de Object colocar o Objeto Request e o Response **/
	@RequestMapping(method = RequestMethod.POST, path = "path")
	Object buscaObjeto1(@RequestBody Object requisicao);
	
	@RequestMapping(method = RequestMethod.POST, path ="path")
	Object buscaObjeto2(@RequestBody Object requisicao);
	
	@RequestMapping(method = RequestMethod.POST, path ="path")
	Object buscaObjeto3(@RequestBody Object requisicao);

}
