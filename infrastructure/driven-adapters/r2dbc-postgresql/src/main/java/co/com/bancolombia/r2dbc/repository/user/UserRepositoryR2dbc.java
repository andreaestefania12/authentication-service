package co.com.bancolombia.r2dbc.repository.user;

import co.com.bancolombia.r2dbc.entity.UserEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;

public interface UserRepositoryR2dbc extends R2dbcRepository<UserEntity, Long> {
    
    Mono<UserEntity> findByEmail(String email);

    Mono<UserEntity> findByIdentification(String identification);
}
