package com.yzx.cloudproviderpayment8001.servicetest;


import com.yzx.cloudcommon.entity.core.EwDataStorage;
import com.yzx.cloudproviderpayment8001.service.EwDataStorageService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataStoreServiceTest {

    @Autowired
    private EwDataStorageService ewDataStorageService;

    @Test
    public void ttt() {

        EwDataStorage byId = ewDataStorageService.getById(1211871655355449345L);
        System.err.println(byId);

    }

}
