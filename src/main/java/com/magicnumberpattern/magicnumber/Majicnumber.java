package com.magicnumberpattern.magicnumber;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class Majicnumber
{
    @RequestMapping("/")
    public String majicnumber(@RequestParam("number") int number)
    {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        int holder = 0;
        String container="";
        do
        {
            container += number;
            if(number%3==0)
            {
                holder = (number * 3) + 1;
                number = holder;
                container += holder;
            }
            else if (number%2==0)
            {
                holder=(number/2);
                number = holder;
                container+=holder;
            }

        }
        while(number>1);
        return container;
    }

}
