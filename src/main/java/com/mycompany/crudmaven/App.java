package com.mycompany.crudmaven;

import com.agung.Imple.PeopleImpleService;
import com.agung.entity.People;
import com.agung.inter.PeopleService;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
       PeopleService peopleService  = new PeopleImpleService();
        try {
       People p = new People();
       p.setNim("2001033");
       p.setNama("jhgddrr");
       peopleService.save(p);
        System.out.println("sukses brroooo");     
        } catch (Exception e) {
            System.out.println("gagal");
        }
       
    }
}
