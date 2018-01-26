package com.magicnumberpattern.magicnumber;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Majicnumber
{
    @RequestMapping("/magic")
    public String majicnumber(@RequestParam("number") int number)
    {

        int display = number;
        String container=Integer.toString(number);
        do
        {

            if(number%2==0)
            {
                number=(number/2);

            }
            else
            {
                number = (number * 3) + 1;

            }
            container += "    " + Integer.toString(number);
        }

        while(number>1);

        return "starting number:   " + display + "<br/>" + container;
    }

}
