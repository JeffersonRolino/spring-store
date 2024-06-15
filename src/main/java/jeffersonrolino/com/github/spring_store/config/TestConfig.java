package jeffersonrolino.com.github.spring_store.config;

import jeffersonrolino.com.github.spring_store.entities.Order;
import jeffersonrolino.com.github.spring_store.entities.User;
import jeffersonrolino.com.github.spring_store.entities.enums.OrderStatus;
import jeffersonrolino.com.github.spring_store.repositories.OrderRepository;
import jeffersonrolino.com.github.spring_store.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    private final UserRepository userRepository;

    private final OrderRepository orderRepository;

    public TestConfig(final UserRepository userRepository, final OrderRepository orderRepository) {
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User user2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(user1, user2));

        Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, user1);
        Order order2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, user2);
        Order order3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, user1);

        orderRepository.saveAll(Arrays.asList(order1, order2, order3));
    }
}
