package demo.spring.springdemo.web;

import demo.spring.springdemo.Ingredient;
import demo.spring.springdemo.Taco;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.stream.Collectors;

import java.util.Arrays;
import demo.spring.springdemo.Ingredient.Type;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

    @GetMapping
    public String showDesignForm(Model model){
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("FLTO", "Florida Tortilla", Type.WRAP),
            new Ingredient("COTO", "Corn Tortilla", Type.WRAP)
        );
        Type[] types = Ingredient.Type.values();
        for (Type foreach : types){
            model.addAttribute(foreach.toString().toLowerCase(), ingredients.stream());
        }
        model.addAttribute("design", new Taco());
        return "design";
    }
}
