package br.com.itau.bureauscreditserasa.services;

import br.com.itau.bureauscreditserasa.dtos.MockBureauSerasaResponse;
import br.com.itau.bureauscreditserasa.dtos.TransactionSaveDTO;

public interface TransactionService {

    MockBureauSerasaResponse create(TransactionSaveDTO transactionSaveDTO);
    
}
