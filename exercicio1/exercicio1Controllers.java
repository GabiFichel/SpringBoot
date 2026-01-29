package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/idade")
public class exercicio1Controllers {
	@GetMapping("/converter")
	public ResponseEntity<?> converterIdade(@RequestParam int anos) {

	    
	    if (anos < 0) {
	        return ResponseEntity.badRequest()
	                .body("A idade não pode ser negativa.");
	    }

	    if (anos > 120) {
	        return ResponseEntity.badRequest()
	                .body("A idade não pode ser maior que 120 anos.");
	    }

	    int meses = anos * 12;
	    int dias = anos * 365;

	    String classificacao;
	    if (anos < 18) {
	        classificacao = "Menor de idade";
	    } else {
	        classificacao = "Maior de idade";
	    }

	    Map<String, Object> resposta = new HashMap<>();
	    resposta.put("idadeAnos", anos);
	    resposta.put("idadeMeses", meses);
	    resposta.put("idadeDias", dias);
	    resposta.put("classificacao", classificacao);

	    return ResponseEntity.ok(resposta);

	}
}
