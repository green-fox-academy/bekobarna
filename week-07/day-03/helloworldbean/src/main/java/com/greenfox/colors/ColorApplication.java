package com.greenfox.colors;

import com.greenfox.colors.Config.ColorsConfiguration;
import com.greenfox.colors.Model.GreenColor;
import com.greenfox.colors.Model.RedColor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ColorApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ColorsConfiguration.class);

        RedColor redColor = ctx.getBean(RedColor.class);
        redColor.setRedColor();
        redColor.printColor();

        GreenColor greenColor = ctx.getBean(GreenColor.class);
        greenColor.setGreenColor();
        greenColor.printColor();






    }
}
