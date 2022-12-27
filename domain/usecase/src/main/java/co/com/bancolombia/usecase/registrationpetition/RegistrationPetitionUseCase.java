package co.com.bancolombia.usecase.registrationpetition;

import co.com.bancolombia.model.regitrationpetition.RegitrationPetition;
import co.com.bancolombia.model.regitrationpetition.gateways.RegitrationPetitionRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class RegistrationPetitionUseCase {

    private RegitrationPetitionRepository repository;

    public Mono<RegitrationPetition> searchRegistrationPetition(){
        return  this.repository.searchRegistrationPetition();
    }

}
