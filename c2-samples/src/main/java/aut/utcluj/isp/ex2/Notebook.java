package aut.utcluj.isp.ex2;

/**
 * @author stefan
 */
public class Notebook {
    private String osVersion;
    private String name, serialNumber;

    public Notebook(String name, String serialNumber, String osVersion) {
        this.name = name;
        this.osVersion = osVersion;
        this.serialNumber = serialNumber;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public String start() {
        System.out.println("Notebook "+ this.name +" started");
        return "Notebook "+ this.name +" started";
    }
}
