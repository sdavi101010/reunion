package com.scottdavidson.reunion.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Alumni {
	
	public static class Name {
		private String first;
		private String middle;
		private String last;
		private String nick;
		private String maiden;
		public String getFirst() {
			return first;
		}
		public void setFirst(String first) {
			this.first = first;
		}
		public String getMiddle() {
			return middle;
		}
		public void setMiddle(String middle) {
			this.middle = middle;
		}
		public String getLast() {
			return last;
		}
		public void setLast(String last) {
			this.last = last;
		}
		public String getNick() {
			return nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public String getMaiden() {
			return maiden;
		}
		public void setMaiden(String maiden) {
			this.maiden = maiden;
		}
		
		
	}

	private Name name;
	private String classPhoto;
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public String getClassPhoto() {
		return classPhoto;
	}
	public void setClassPhoto(String classPhoto) {
		this.classPhoto = classPhoto;
	}
	
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		Alumni alumni = new Alumni();
		alumni.setClassPhoto("BlankGreg.png");

		Alumni.Name name = new Alumni.Name();
		name.setFirst("Greg");
		name.setLast("Blank");
		alumni.setName(name);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("alumni.json"), alumni);

	}
	
	
	
}
