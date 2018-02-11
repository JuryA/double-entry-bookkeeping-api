package com.project.springjta.doubleentry;

import com.project.springjta.doubleentry.validation.TransferValidationException;
import java.io.Serializable;

/**
 * Value object representing a single monetary transaction towards an account.
 *
 * @author yanimetaxas
 * @since 14-Nov-14
 * @see Transaction
 */
public final class TransactionLeg implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String accountRef;

    private final Money amount;

    public TransactionLeg(String accountRef, Money amount) {
        if (accountRef == null) {
            throw new TransferValidationException("accountRef is null");
        }
        if (amount == null) {
            throw new TransferValidationException("amount is null");
        }
        this.accountRef = accountRef;
        this.amount = amount;
    }

    public Money getAmount() {
        return amount;
    }

    public String getAccountRef() {
        return accountRef;
    }
}

