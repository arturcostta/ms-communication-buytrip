package br.com.artur.augusto.mscommunicationbuytrip.gateway.http;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompraController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("fila-compras-aguardando")
    private String nomeFila;

    @RequestMapping(path= "/", method = RequestMethod.POST)
    public ResponseEntity<RetornoJson> pagamento(){

    }
}
