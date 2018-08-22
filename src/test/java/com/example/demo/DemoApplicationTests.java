package com.example.demo;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.web.UserController;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class DemoApplicationTests {

	private MockMvc mvc;

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
	}

	@Test
	public void getHello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/hello")
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().string(equalTo("Hello World!")));
	}

	@Test
	public void testUserController() throws Exception {
		RequestBuilder request = null;
		// request = get("/users/");
		// mvc.perform(request).andExpect(status().isOk())
		// .andExpect(content().string(equalTo("[]")));
		request = post("/users/").param("id", "1").param("name", "mai")
				.param("age", "24");
		// mvc.perform(request).andExpect(content().string(equalTo("success")));
		// request = get("/users/2");
		// mvc.perform(request).andExpect(status().isOk())
		// .andExpect(content().string(equalTo("")));
		// request = put("/users/1").param("name", "mrj").param("age", "25");
		// mvc.perform(request).andExpect(content().string(equalTo("success")));
		// request = delete("/users/1");
		// mvc.perform(request).andExpect(content().string(equalTo("success")));
		// request = get("/users/");
		// mvc.perform(request).andExpect(status().isOk())
		// .andExpect(content().string(equalTo("[]")));
	}

	@Test
	public void contextLoads() {
	}

}
