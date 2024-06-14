package jeffersonrolino.com.github.spring_store.config;

import jeffersonrolino.com.github.spring_store.entities.User;
import jeffersonrolino.com.github.spring_store.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    private final UserRepository userRepository;

    public TestConfig(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User user2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
