package web.servise;

import org.springframework.stereotype.Component;


import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiseImp implements CarServise {
    private static List<Car> car;

    {
        car = new ArrayList<>();

        car.add(new Car("model1", "color1", 1));
        car.add(new Car("model2", "color2", 2));
        car.add(new Car("model3", "color3", 3));
        car.add(new Car("model4", "color4", 4));
        car.add(new Car("model5", "color5", 5));
    }


    @Override
    public List<Car> getCar(Integer count) {
        if (count == null || count >= 5) {

            return car;

        } else {

            return car.stream().limit(count).collect(Collectors.toList());
        }
    }

}
