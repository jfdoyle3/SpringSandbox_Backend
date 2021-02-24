package com.sandbox.backendsandbox.csv;

import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/csv")
    public String readCSV() {
        List<User> users = null;
        try {
            users = new CsvToBeanBuilder(
                    new FileReader("R:/repository/languages/java/intellj_projects/SpringSandbox_Backend/src/main/resources/static/csvdemo.csv"))
                            .withType(User.class)
                            .build()
                            .parse();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(!users.isEmpty()){
            for(User user : users){
                System.out.println(user.toString());
            }
            return "Results are in the console";
        } else {
            return "Error: users not found";
        }

    }
}