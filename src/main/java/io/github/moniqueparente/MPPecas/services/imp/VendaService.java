package io.github.moniqueparente.MPPecas.services.imp;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import io.github.moniqueparente.MPPecas.domains.Venda;
import io.github.moniqueparente.MPPecas.dto.request.VendaDtoRequest;
import io.github.moniqueparente.MPPecas.dto.response.VendaDtoResponse;
import io.github.moniqueparente.MPPecas.mappers.MapperVendaAtualizar;
import io.github.moniqueparente.MPPecas.mappers.MapperVendaRequestToVenda;
import io.github.moniqueparente.MPPecas.mappers.MapperVendaToVendaResponse;
import io.github.moniqueparente.MPPecas.repository.VendaRepository;
import io.github.moniqueparente.MPPecas.services.VendaServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class VendaService implements VendaServiceInterface {

    private final VendaRepository vendaRepository;
    private final MapperVendaRequestToVenda mapperVendaRequestToVenda;
    private final MapperVendaToVendaResponse mapperVendaToVendaResponse;
    private final MapperVendaAtualizar mapperVendaAtualizar;

    private final ItemVendaService itemVendaService;

    public VendaDtoResponse criar(VendaDtoRequest vendaDtoRequest) {
        Venda venda = mapperVendaRequestToVenda.toModel(vendaDtoRequest);

        List<ItemVenda> listaItems = venda
                .getItems()
                .stream()
                .map(itemVenda -> {
                    itemVenda = itemVendaService.obterEntity(itemVenda.getId());
                    return itemVenda;
                })
                .collect(Collectors.toList());

        venda.setItems(listaItems);

        vendaRepository.save(venda);

        VendaDtoResponse vendaDtoResponse = mapperVendaToVendaResponse.toResponse(venda);

        return vendaDtoResponse;
    }

    public VendaDtoResponse atualizar(VendaDtoRequest vendaDtoRequest, Integer id) {
        Venda vendaObtida = vendaRepository.findById(id).get();

        mapperVendaAtualizar.atualizar(vendaDtoRequest, vendaObtida);

        vendaRepository.save(vendaObtida);

        return mapperVendaToVendaResponse.toResponse(vendaObtida);

    }

    public void deletar (Integer id) {
        vendaRepository.deleteById(id);
    }

    public List<VendaDtoResponse> listar() {

        List<Venda> listaVenda = vendaRepository.findAll();

        return listaVenda
                .stream()
                .map(mapperVendaToVendaResponse::toResponse)
                .collect(Collectors.toList());

    }

    public VendaDtoResponse obter (Integer id){
        Venda venda = vendaRepository.findById(id).get();

        return mapperVendaToVendaResponse.toResponse(venda);
    }
}
