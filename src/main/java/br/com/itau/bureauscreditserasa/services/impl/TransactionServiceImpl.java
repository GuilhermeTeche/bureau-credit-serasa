package br.com.itau.bureauscreditserasa.services.impl;

import br.com.itau.bureauscreditserasa.dtos.MockBureauSerasaResponse;
import br.com.itau.bureauscreditserasa.dtos.TransactionSaveDTO;
import br.com.itau.bureauscreditserasa.services.TransactionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TransactionServiceImpl implements TransactionService {


    private final MockBureauSerasaResponse mockBureauSerasaResponse;

    public TransactionServiceImpl(MockBureauSerasaResponse mockBureauSerasaResponse) {
        this.mockBureauSerasaResponse = mockBureauSerasaResponse;
    }

    @Override
    public MockBureauSerasaResponse create(TransactionSaveDTO transactionSaveDTO) {
        MockBureauSerasaResponse transaction = executeConsultInBureauSerasa(transactionSaveDTO);

        return transaction;
    }


    private MockBureauSerasaResponse executeConsultInBureauSerasa(TransactionSaveDTO transactionSaveDTO) {
        return mockBureauSerasaResponse.getMockBureauSerasa();
    }

}
