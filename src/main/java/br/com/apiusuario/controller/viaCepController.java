package br.com.apiusuario.controller;

import br.com.apiusuario.model.Usuario;
import br.com.apiusuario.model.ViaCepResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/viacep")
public class viaCepController {
    @Value("${viacep.host}")
    private String viaCepBaseUrl;

    @GetMapping
    public HttpEntity<ViaCepResponse> obterPorCep(@RequestParam("cep") String cep) {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        //		headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> request = new HttpEntity<>(headers);

        ResponseEntity<ViaCepResponse> response = restTemplate.exchange(this.viaCepBaseUrl + cep + "/json",
                HttpMethod.GET, request, ViaCepResponse.class);

        return response;

    }
}
