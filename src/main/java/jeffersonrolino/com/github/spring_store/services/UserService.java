package jeffersonrolino.com.github.spring_store.services;

import jeffersonrolino.com.github.spring_store.entities.User;
import jeffersonrolino.com.github.spring_store.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.get();
    }

    public User insert(User user){
        return userRepository.save(user);
    }
}
