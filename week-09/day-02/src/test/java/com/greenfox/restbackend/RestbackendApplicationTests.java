package com.greenfox.restbackend;

import java.nio.charset.Charset;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;


@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@EnableWebMvc
public class RestbackendApplicationTests {

	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
		MediaType.APPLICATION_JSON.getSubtype(),
		Charset.forName("utf8"));

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testDoublingCorrect() throws Exception {
		mockMvc.perform(get("/doubling?input=5")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.result", is(10)));
	}

	@Test
	public void testDoublingError() throws Exception {
		mockMvc.perform(get("/doubling")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.error", is("Please provide an input!")));
	}

	@Test
	public void testGreeterCorrect() throws Exception {
		mockMvc.perform(get("/greeter?name=Petike&title=student")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(content().contentType(contentType))
			.andExpect(jsonPath("$.welcome_message", is("Oh, hi there Petike, my dear student!")));
	}

	@Test
	public void testGreeterNameError() throws Exception {
		mockMvc.perform(get("/greeter?name=Petike")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.error", is("Please provide a title!")));
	}

	@Test
	public void testGreeterTitleError() throws Exception {
		mockMvc.perform(get("/greeter?title=student")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.error", is("Please provide a name!")));
	}

	@Test
	public void testGreeterBothError() throws Exception {
		mockMvc.perform(get("/greeter")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.error", is("Please provide a name!")));
	}

	@Test
	public void testAppendaCorrect() throws Exception {
		mockMvc.perform(get("/appenda/macsk")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(content().contentType(contentType))
			.andExpect(jsonPath("$.appended", is("macska")));
	}

	@Test
	public void testAppendaError() throws Exception {
		mockMvc.perform(get("/appenda/")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isNotFound());
	}








}
