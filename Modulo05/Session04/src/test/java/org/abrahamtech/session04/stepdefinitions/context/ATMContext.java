package org.abrahamtech.session04.stepdefinitions.context;

import org.abrahamtech.session04.ATM;
import org.abrahamtech.session04.model.Card;

import lombok.Data;

@Data
public class ATMContext {
    private ATM atm;
    private Card card;
}
