package br.com.itau.bureauscreditserasa.controllers;

import br.com.itau.bureauscreditserasa.dtos.TransactionSaveDTO;
import br.com.itau.bureauscreditserasa.services.TransactionService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class CaptureControllerTest {
	
	@LocalServerPort
    private int port;
	
	@Mock
	private TransactionService service;
	
	@Autowired
    private TestRestTemplate restTemplate;
	
	private static TransactionSaveDTO validSave = TransactionSaveDTO.builder()
			.amount(new BigDecimal(99))
			.cardholderName("Holder Name")
			.cardNumber("1224433212344312")
			.build();
	
	private final String URI = "http://localhost:";
	
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void init() {
		assertThat(this).isNotNull();
	}

    /*//@Test
    public void shouldHaveAnApiToCreate() {
    	HttpEntity<TransactionSaveDTO> request = new HttpEntity<>(validSave);
    	ResponseEntity<String> response = this.restTemplate.postForEntity(URI + port + "/capture", request,
                String.class);
    	assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.getStatusCode());
    }*/

}
