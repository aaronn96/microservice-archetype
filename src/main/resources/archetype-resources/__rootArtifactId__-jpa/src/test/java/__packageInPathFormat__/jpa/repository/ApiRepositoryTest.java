package ${package}.jpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = ApiRepository.class)
public class ApiRepositoryTest {

    @Test
    public void test() { assertTrue(true); }

}
