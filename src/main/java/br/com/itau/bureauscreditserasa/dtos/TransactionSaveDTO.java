package br.com.itau.bureauscreditserasa.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionSaveDTO {

    @NotNull
    @Positive
    @DecimalMin("0.01")
    @Digits(integer=10, fraction=2)
    private BigDecimal amount;

    @NotEmpty
    @Length(min = 1, max = 30)
    @Pattern(regexp = "[a-zA-Z ]*", message = "permitido somente letras e espaço")
    private String cardholderName;

    @NotEmpty
    //@CreditCardNumber
    @Length(min = 1, max = 19)
    @Pattern(regexp = "[0-9]*", message = "permitido somente números")
    private String cardNumber;


}
