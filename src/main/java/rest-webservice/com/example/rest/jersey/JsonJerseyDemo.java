package com.example.rest.jersey;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.model.Student;

/**
 * @author Maulik
 * 
 */
@Path("/jsonJerseyDemo")
public class JsonJerseyDemo {

	@GET
	@Path("/getStudentInfo")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getTrackInJSON() {
		Student student = new Student();
		student.setId("stu001");
		student.setFirstName("Maulik");
		student.setLastName("Patel");
		student.setAge(15);
		student.setAddress("Ranip");
		student.setGender("Male");
		return student;
	}

	@POST
	@Path("/postStudentInfo")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Student student) {
		String result = "Student saved : " + student;
		return Response.status(201).entity(result).build();

	}

}
