package com.scottdavidson.reunion.json;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;
import com.fasterxml.jackson.*;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AlumniTest {

	@Test
	public void basicTest() throws IOException {

		Alumni alumni = new Alumni();
		alumni.setClassPhoto("BlankGreg.png");

		Alumni.Name name = new Alumni.Name();
		name.setFirst("Greg");
		name.setLast("Blank");
		alumni.setName(name);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("alumni.json"), alumni);

//		JsonFactory f = new JsonFactory();
//		JsonGenerator g = f.createJsonGenerator(new File("./alumni.json"), JsonEncoding.UTF8);
//
//		g.writeStartObject();
	}
}
