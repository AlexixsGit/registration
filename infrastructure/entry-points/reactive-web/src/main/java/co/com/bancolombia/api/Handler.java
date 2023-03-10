package co.com.bancolombia.api;

import co.com.bancolombia.usecase.registrationpetition.RegistrationPetitionUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {
    private  final RegistrationPetitionUseCase useCase;
    public Mono<ServerResponse> searchRegistrationPetition(ServerRequest serverRequest) {
        return ServerResponse.ok().bodyValue(useCase.searchRegistrationPetition());
    }

    public Mono<ServerResponse> listenGETOtherUseCase(ServerRequest serverRequest) {
        // useCase2.logic();
        return ServerResponse.ok().bodyValue("");
    }

    public Mono<ServerResponse> listenPOSTUseCase(ServerRequest serverRequest) {
        // usecase.logic();
        return ServerResponse.ok().bodyValue("");
    }
}
