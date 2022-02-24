package com.example.jasypt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

@SpringBootTest
class JasyptApplicationTests {

	@Autowired
	private JasyptTest jasyptTest;

	@Test
	void jasypt_테스트() {
		assertThat("VENH_TISTORY", is(equalTo(jasyptTest.getPropertiesTestValue())));
	}
}
