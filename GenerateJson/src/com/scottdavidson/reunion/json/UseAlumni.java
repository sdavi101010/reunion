package com.scottdavidson.reunion.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UseAlumni {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Alumni gregAlumni = new Alumni();
		gregAlumni.setClassPhoto("BlankGreg.png");

		Alumni.Name greg = new Alumni.Name();
		greg.setFirst("Greg");
		greg.setLast("Blank");
		gregAlumni.setName(greg);
		
		
		Alumni scottAlumni = new Alumni();
		scottAlumni.setClassPhoto("DavidsonScott.png");

		Alumni.Name scott = new Alumni.Name();
		scott.setFirst("Scott");
		scott.setLast("Davidson");
		scottAlumni.setName(scott);

		Alumnis alumnis = new Alumnis();
		Alumni[] alumniArray = new Alumni[2];
		alumniArray[0] = gregAlumni;
		alumniArray[1] = scottAlumni;
		alumnis.setAlumnis(alumniArray);
		
		AlumniList alumniList = new AlumniList();
		alumniList.getAlumniList().add(gregAlumni);
		alumniList.getAlumniList().add(scottAlumni);
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("alumnis.json"), alumnis);
			mapper.writeValue(new File("alumniList.json"), alumniList);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
