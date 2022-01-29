package org.planning.restfulcrud.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.planning.restfulcrud.dao.StudentDAO;
import org.planning.restfulcrud.model.Student;

@Path("/StudentDAO")
public class StudentService {

    // URI:
    // /contextPath/servletPath/Student
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Student> getStudents_JSON() {
        List<Student> listOfCountries = StudentDAO.getAllStudents();
        return listOfCountries;
    }

    // URI:
    // /contextPath/servletPath/Student/{StudNo}
    @GET
    @Path("/{StudNo}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Student getStudent(@PathParam("StudNo") String StudNo) {
        return StudentDAO.getStudent(StudNo);
    }

    // URI:
    // /contextPath/servletPath/Student
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Student addStudent(Student Stud) {
        return StudentDAO.addStudent(Stud);
    }

    // URI:
    // /contextPath/servletPath/Student
    @PUT
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Student updateStudent(Student Stud) {
        return StudentDAO.updateStudent(Stud);
    }

    @DELETE
    @Path("/{StudNo}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public void deleteStudent(@PathParam("StudNo") String StudNo) {
        StudentDAO.deleteStudent(StudNo);
    }
 @Path("/{StudNo}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public void allStudent(@PathParam("StudNo") String StudNo) {
        StudentDAO.allStudent(StudNo);
    }
}
