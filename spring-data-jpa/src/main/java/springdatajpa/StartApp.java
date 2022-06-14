package springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springdatajpa.model.User;
import springdatajpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Diego Ribeiro Araujo");
        user.setPassword("123456789");
        user.setUsername("Diego34ra");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }

}
