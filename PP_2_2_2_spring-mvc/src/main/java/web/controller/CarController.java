package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import web.model.Car;
import web.servise.CarServise;


import java.util.List;

@Controller

public class CarController {

    private final CarServise carServise;

    @Autowired
    public CarController(CarServise carServise) {
        this.carServise = carServise;
    }

    @GetMapping("/car")
    public String showAllCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {

        List<Car> messages = carServise.getCar(count);
        model.addAttribute("messages", messages);
        return "cars";
    }
}
