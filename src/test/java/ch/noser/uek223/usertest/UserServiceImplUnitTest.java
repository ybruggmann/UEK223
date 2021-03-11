package ch.noser.uek223.usertest;

import ch.noser.uek223.domain.user.User;
import ch.noser.uek223.domain.user.UserRepository;
import ch.noser.uek223.domain.user.UserServiceImpl;
import org.aspectj.lang.annotation.Before;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.Optional;
import java.util.UUID;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
public class UserServiceImplUnitTest {

    @InjectMocks
    private UserServiceImpl userService;
    @Mock
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Mock
    private UserRepository userRepository;

    @Before("")
    public void setUp() throws Exception {

    }

    @Test
    public void findById_provideUserId_expectUser() {
        UUID uuid = UUID.randomUUID();
        Optional<User> testUser = Optional.of(new User(uuid, "yuma.bruggmann@gmx.ch", "Yuma", "Bruggmann", "12345678"));
        when(userRepository.findById(uuid)).thenReturn(testUser);
        Assertions.assertEquals(userService.findById(uuid), testUser.get());
    }

    @Test
    public void findAll_requestAllUsers_returnsAllUsers() throws Exception {

    }
}
