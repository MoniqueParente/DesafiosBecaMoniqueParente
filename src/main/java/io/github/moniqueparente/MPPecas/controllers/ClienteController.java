package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.domains.Cliente;
import io.github.moniqueparente.MPPecas.dto.request.ClienteDto;
import io.github.moniqueparente.MPPecas.services.imp.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteDto> criar(@RequestBody Cliente cliente){

        return ResponseEntity.created(null).body(clienteService.criar(cliente));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ClienteDto> atualizar(@RequestBody ClienteDto clienteDto,
                                             @PathVariable Integer id){
        return ResponseEntity.created(null)
                .body(new ClienteDto(clienteService.atualizar(clienteDto,id)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ClienteDto> deletar(@PathVariable Integer id) {

        clienteService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity<List<ClienteDto>> listar(){

        List<ClienteDto> clienteLista = clienteService.listar();
        return ResponseEntity.ok(clienteLista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDto> obter(@PathVariable Integer id) {

        ClienteDto clienteObtido = clienteService.obter(id);
        return ResponseEntity.ok(clienteObtido);
    }
}