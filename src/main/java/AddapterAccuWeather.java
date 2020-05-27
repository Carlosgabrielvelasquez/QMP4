import java.util.List;
import java.util.Map;

public class AddapterAccuWeather implements ProveedorDelClima {
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    List<Map<String, Object>> condicionesClimaticas;

    public  void actualizarDatosDeClima() {
        //TODO Se ejecuta cada x tiempo
        condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");

    }

    public Double getProbabilidadPrecipitacion(){

        return (Double) condicionesClimaticas.get(0).get("PrecipitationProbability"); //Devuelve un número del 0 al 1

    }
}
