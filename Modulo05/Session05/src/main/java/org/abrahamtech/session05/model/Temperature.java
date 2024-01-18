package org.abrahamtech.session05.model;

import lombok.Data;

@Data
public class Temperature {
    private final double temperature;
    private final ThermalSensation sensation;
}
