package owcourse.java.homeworks.hw2.task1;

import lombok.*;

@Data
@Getter
@Setter
@ToString
public class PC {

    private String CPU;

    private String RAM;

    private String manufacturer;

    private String GPU;

    public PC(String CPU,String RAM,String manufacturer, String GPU ){
        this.CPU = CPU;
        this.RAM = RAM;
        this.manufacturer = manufacturer;
        this.GPU = GPU;
    }
}
