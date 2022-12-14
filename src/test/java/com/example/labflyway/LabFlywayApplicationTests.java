package com.example.labflyway;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LabFlywayApplicationTests {

	@Test
	void contextLoads() {
	}


    @Autowired
    private Flyway flyway;

    @Test
    public void triggerManualFlywayMigration() {
        flyway.migrate();
    }

}


