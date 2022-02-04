package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.dto.request.ProdutoDto;
import io.github.moniqueparente.MPPecas.services.imp.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoDto> criar(@RequestBody @Valid ProdutoDto produtoDto){

        return ResponseEntity.created(null).body(produtoService.criar(produtoDto));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProdutoDto> atualizar(@RequestBody ProdutoDto produtoDto,
                                                @PathVariable Integer id){

        return ResponseEntity.created(null)
                .body(produtoService.atualizar(produtoDto,id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProdutoDto> deletar(@PathVariable Integer id) {

        produtoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity<List<ProdutoDto>> Listar(){

        List<ProdutoDto> produtoLista = produtoService.listar();
        return ResponseEntity.ok(produtoLista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDto> obter(@PathVariable Integer id){

        ProdutoDto produtoObtido = produtoService.obter(id);
        return ResponseEntity.ok(produtoObtido);
    }

}