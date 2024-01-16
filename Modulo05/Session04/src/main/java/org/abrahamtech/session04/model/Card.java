package org.abrahamtech.session04.model;

import lombok.Data;

@Data
public class Card {
    private final String pin;
    private final long accountId;
}
