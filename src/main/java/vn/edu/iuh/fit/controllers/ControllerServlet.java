package vn.edu.iuh.fit.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.entities.Log;
import vn.edu.iuh.fit.entities.Role;
import vn.edu.iuh.fit.repositories.LogRepository;
import vn.edu.iuh.fit.repositories.RoleRepository;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = {"/ControllerServlet", "/control"})
public class ControllerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        PrintWriter out = response.getWriter();

        if(action.equalsIgnoreCase("xxx")){
            out.println("You call action xxxx");
            LogRepository repository = new LogRepository();
            List<Log> lst = repository.findAll();
            lst.forEach(out::println);

        }else if(action.equalsIgnoreCase("yyy")){
            RoleRepository roleRepository =new RoleRepository();
            Role role =new Role("slave","slave","role cho slave",1);
            roleRepository.addRole(role);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action.equalsIgnoreCase("xxx")){

        }else if(action.equalsIgnoreCase("yyy")){

        }
    }

}
