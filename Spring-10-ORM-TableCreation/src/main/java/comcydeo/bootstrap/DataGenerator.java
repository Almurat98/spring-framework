package comcydeo.bootstrap;

import comcydeo.entity.Car;
import comcydeo.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    CarRepository carRepository;

    public DataGenerator(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Car c1= new Car("Ford","Explorer XLT");
        Car c2= new Car("Nissan","Rogue XV");
        Car c3= new Car("BMW","M5");


        carRepository.save(c1);
        carRepository.save(c2);
        carRepository.save(c3);
    }
}
