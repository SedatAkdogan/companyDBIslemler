package com.sedat.repository;

import com.sedat.repository.entity.Calisan;

public class RunnerCalisanRepository {
    public static void main(String[] args) {

        CalisanRepository calisanRepository = new CalisanRepository();
        System.out.println(calisanRepository.save(new Calisan("Lionel","Messi")));


    }
}
