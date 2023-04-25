package com.cydeo.bootstrap;

import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {


    private RegionRepository regionRepository;

    public DataGenerator(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("------------REGION STARTS----------------");

        System.out.println("regions in Canada: "+regionRepository.findByCountry("Canada"));
        System.out.println(regionRepository.findDistinctByCountry("Canada"));
        System.out.println(regionRepository.findByCountryContainingIgnoreCase("United"));
        System.out.println(regionRepository.findByCountryContainingOrderByRegion("United"));
        System.out.println(regionRepository.findTop2ByCountry("Canada"));

        System.out.println("------------REGION ENDS----------------");
    }
}
