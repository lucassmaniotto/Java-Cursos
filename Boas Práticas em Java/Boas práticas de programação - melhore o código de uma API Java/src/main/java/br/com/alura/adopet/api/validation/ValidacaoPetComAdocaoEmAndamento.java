package br.com.alura.adopet.api.validation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.alura.adopet.api.dto.SolicitacaoAdocaoDto;
import br.com.alura.adopet.api.exception.ValidacaoException;
import br.com.alura.adopet.api.model.StatusAdocao;
import br.com.alura.adopet.api.repository.AdocaoRepository;

@Component
public class ValidacaoPetComAdocaoEmAndamento implements ValidacaoSolicitacaoAdocao {
    @Autowired
    private AdocaoRepository adocaoRepository;
    
    public void validar(SolicitacaoAdocaoDto dto) {

        boolean petTemAdocaoEmAndamento = adocaoRepository
                    .existsByPetIdAndStatus(dto.idPet(), StatusAdocao.AGUARDANDO_AVALIACAO);
                    
        if (petTemAdocaoEmAndamento) {
                throw new ValidacaoException("Pet já está aguardando avaliação para ser adotado!");
        }
        
    }
}
