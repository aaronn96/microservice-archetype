package ${package}.core.service;

import ${package}.core.dto.ApiDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ApiServiceTest {

    private final ApiService apiService = new ApiService();

    @Test
    public void whenHelloEmpty() {
        ApiDto apiDto = new ApiDto("Hello World");
        assertEquals(apiDto, apiService.isApiUp());
    }

}
