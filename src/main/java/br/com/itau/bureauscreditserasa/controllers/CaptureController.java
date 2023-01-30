package br.com.itau.bureauscreditserasa.controllers;

import br.com.itau.bureauscreditserasa.dtos.MockBureauSerasaResponse;
import br.com.itau.bureauscreditserasa.dtos.TransactionSaveDTO;
import br.com.itau.bureauscreditserasa.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("bureau-serasa")
public class CaptureController {

    private final TransactionService transactionService;

    @Autowired
    public CaptureController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("capture")
    public ResponseEntity<Object> create(@RequestBody @Validated TransactionSaveDTO transactionSaveDTO) {
        MockBureauSerasaResponse transaction = transactionService.create(transactionSaveDTO);

        if (transaction.getRestricted()) {
            return ResponseEntity.ok(transaction);
        }
        return (ResponseEntity<Object>) ResponseEntity.badRequest();
    }
}
