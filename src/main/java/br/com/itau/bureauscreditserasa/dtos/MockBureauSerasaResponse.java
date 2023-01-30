package br.com.itau.bureauscreditserasa.dtos;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class MockBureauSerasaResponse {

    private String name;

    private String cpf;

    private String rg;

    private String cnpj;

    private Boolean restricted;

//    private List<Company> company;


    public MockBureauSerasaResponse getMockBureauSerasa() {
        List myList = new ArrayList();
        myList.add(Company.builder().name("Empresa Fantasma"));
        myList.add(Company.builder().name("Empresa Desserta"));

        return MockBureauSerasaResponse.builder()
                .name("Cleber's Kiosk")
                .cpf("406.048.688-47")
                .rg("40.180.963-5")
                .cpf(null)
                .restricted(true)
//                .company(myList)
                .build();
    }

}
