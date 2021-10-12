package ${package}.core.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ApiServiceTest {

    private ApiService apiService = new ApiService();

    @Test
    public void whenHelloEmpty() {
        ApiDto apiDto = new ApiDto("Hello World");
        Assert.assertEquals(apiDto, apiService.isApiUp());
    }

}
