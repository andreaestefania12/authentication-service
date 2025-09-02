package co.com.bancolombia.r2dbc.repository.user;

import co.com.bancolombia.model.user.User;
import co.com.bancolombia.model.user.gateways.UserRepository;
import co.com.bancolombia.r2dbc.entity.UserEntity;
import co.com.bancolombia.r2dbc.helper.ReactiveAdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class UserRepositoryR2dbcAdapter extends ReactiveAdapterOperations<User, UserEntity, Long, UserRepositoryR2dbc>
implements UserRepository {

    public UserRepositoryR2dbcAdapter(UserRepositoryR2dbc repository, ObjectMapper mapper){
        super(repository, mapper, d-> mapper.map(d, User.class));
    }

    @Override
    public Mono<User> saveUser(User user) {
        UserEntity userEntity = this.toData(user);
        return this.repository.save(userEntity)
                .map(savedUserEntity -> this.mapper.map(savedUserEntity,User.class));
    }

    @Override
    public Mono<User> findByEmail(String email) {
        return this.repository.findByEmail(email)
                .map(userEntity -> this.mapper.map(userEntity, User.class));
    }

    @Override
    public Mono<User> findByIdentification(String identification) {
        return this.repository.findByIdentification(identification)
                .map(userEntity -> this.mapper.map(userEntity, User.class));
    }

    @Override
    public Mono<User> updateUser(User user) {
        UserEntity userEntity = this.toData(user);
        return this.repository.save(userEntity).map(savedUserEntity -> this.mapper.map(savedUserEntity,User.class));
    }
}
