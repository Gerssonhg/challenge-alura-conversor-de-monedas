public class Monedas {
    private String base_code;
    private String target_code;
    private double conversion_rate;

    public Monedas(String base_code, String target_code, double conversion_rate) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_rate = conversion_rate;
    }

    public String getBase_code() {
        return base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public double getConversion_rate() {
        return conversion_rate;
    }
}
