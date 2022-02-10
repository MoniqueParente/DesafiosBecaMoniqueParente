package io.github.moniqueparente.MPPecas.services.imp;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import io.github.moniqueparente.MPPecas.dto.request.ItemVendaDtoRequest;
import io.github.moniqueparente.MPPecas.dto.response.ItemVendaDtoResponse;
import io.github.moniqueparente.MPPecas.mappers.MapperItemVendaAtualizar;
import io.github.moniqueparente.MPPecas.mappers.MapperItemVendaRequestToItemVenda;
import io.github.moniqueparente.MPPecas.mappers.MapperItemVendaToItemVendaResponse;
import io.github.moniqueparente.MPPecas.repository.ItemVendaRepository;
import io.github.moniqueparente.MPPecas.services.ItemVendaServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ItemVendaService implements ItemVendaServiceInterface {

    private final ItemVendaRepository itemVendaRepository;
    private final MapperItemVendaRequestToItemVenda mapperItemVendaRequestToItemVenda;
    private final MapperItemVendaToItemVendaResponse mapperItemVendaToItemVendaResponse;
    private final MapperItemVendaAtualizar mapperItemVendaAtualizar;


    public ItemVendaDtoResponse criar(@RequestBody @Valid ItemVendaDtoRequest itemVendaDtoRequest){

        ItemVenda itemVenda = mapperItemVendaRequestToItemVenda.toModel(itemVendaDtoRequest);

        itemVendaRepository.save(itemVenda);

        ItemVendaDtoResponse itemVendaDtoResponse = mapperItemVendaToItemVendaResponse.toResponse(itemVenda);

        return itemVendaDtoResponse;
    }

    public ItemVendaDtoResponse atualizar(@RequestBody @Valid ItemVendaDtoRequest itemVendaDtoRequest, Integer id){
        ItemVenda itemVendaObtido = itemVendaRepository.findById(id).get();

        mapperItemVendaAtualizar.atualizar(itemVendaDtoRequest, itemVendaObtido);

        itemVendaRepository.save(itemVendaObtido);

        return mapperItemVendaToItemVendaResponse.toResponse(itemVendaObtido);
    }

    public void deletar (Integer id) {
        itemVendaRepository.deleteById(id);
    }


    public List<ItemVendaDtoResponse> listar() {

        List<ItemVenda> listaItemVenda = itemVendaRepository.findAll();

        return listaItemVenda
                .stream()
                .map(mapperItemVendaToItemVendaResponse::toResponse)
                .collect(Collectors.toList());

    }

    public ItemVendaDtoResponse obter(Integer id) {
        ItemVenda itemVenda = itemVendaRepository.findById(id).get();

        return mapperItemVendaToItemVendaResponse.toResponse(itemVenda);
    }

    public ItemVenda obterEntity(Integer id) {
        ItemVenda itemVenda = itemVendaRepository.findById(id).get();

        return itemVenda;
    }

}
