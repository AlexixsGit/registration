package co.com.bancolombia.model.regitrationpetition.gateways;

import co.com.bancolombia.model.regitrationpetition.RegitrationPetition;
import reactor.core.publisher.Mono;

public interface RegitrationPetitionRepository {

    Mono<RegitrationPetition> searchRegistrationPetition();
    Mono<RegitrationPetition> saveRegistrationPetition();

}
