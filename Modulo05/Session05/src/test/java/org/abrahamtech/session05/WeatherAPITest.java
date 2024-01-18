package org.abrahamtech.session05;

import org.abrahamtech.session05.model.CurrentWeather;
import org.abrahamtech.session05.model.Weather;
import org.abrahamtech.session05.util.Axios;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherAPITest {

    private WeatherAPI weatherAPI;
    private Axios axiosMock;

    @BeforeEach
    public void setup() {
        // Crea un mock (un objeto simulación) de tipo Axios
        axiosMock = mock(Axios.class);

        // Le doy al WeatherAPI la instancia del mock
        // para evitar usar el código original
        weatherAPI = new WeatherAPI(axiosMock);
    }

    @Test
    @DisplayName("WeatherAPI should return 10°C if API returns 10°C")
    public void apiTemperature() throws Exception {
        // [ARRANGE] ----------------------------------------------
        final double TEMPERATURE = 10;
        final double LATITUDE = 33.87987597483;
        final double LONGITUDE = -29.458974545;

        // Creando mi objeto de respuesta para la simulación
        Weather weather = new Weather();
        CurrentWeather currentWeather = new CurrentWeather();
        currentWeather.setTemperature(TEMPERATURE);
        weather.setCurrent_weather(currentWeather);

        // Simular que el API regresa un objeto
        // que contiene los 10°C

        // Para cualquier parámetro string
        // Y para cualquier parámetro Object
        // regresa...
        when(axiosMock.request(anyString(), any())).thenReturn(weather);

        // [ACT] ----------------------------------------------
        double temperature = weatherAPI.getCurrentWeather(LATITUDE, LONGITUDE);

        // [ASSERT] ----------------------------------------------
        assertEquals(TEMPERATURE, temperature);
    }
}
