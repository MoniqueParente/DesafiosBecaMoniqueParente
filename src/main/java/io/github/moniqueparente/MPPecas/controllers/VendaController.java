package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.domains.Venda;
import io.github.moniqueparente.MPPecas.dto.request.VendaDtoRequest;
import io.github.moniqueparente.MPPecas.dto.response.VendaDtoResponse;
import io.github.moniqueparente.MPPecas.services.imp.VendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/venda")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @PostMapping
    public ResponseEntity<VendaDtoResponse> criar(@RequestBody @Valid VendaDtoRequest vendaDtoRequest){

        return ResponseEntity.created(null).body(vendaService.criar(vendaDtoRequest));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<VendaDtoResponse> atualizar(@RequestBody @Valid VendaDtoRequest vendaDtoRequest,
                                                      @PathVariable Integer id){

        return ResponseEntity.ok(vendaService.atualizar(vendaDtoRequest,id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Venda> deletar(@PathVariable Integer id) {
        vendaService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<VendaDtoResponse>> listar(){

        List<VendaDtoResponse> vendaLista = vendaService.listar();
        return ResponseEntity.ok(vendaLista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VendaDtoResponse> obter(@PathVariable Integer id){

        VendaDtoResponse vendaObtida = vendaService.obter(id);
        return ResponseEntity.ok(vendaObtida);
    }
}