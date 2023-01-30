package br.com.itau.bureauscreditserasa;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CaptureApplicationTests {

    @Test
    void contextLoads() {
        assertThat(this).isNotNull();
    }

}
