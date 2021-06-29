package com.bft.com;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(urlPatterns = {"/Servlet/*"}, name = "Servlet")

public class Servlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Person person1 = new Person();
        person1.setFirstName("Ольга");
        person1.setLastName("Иванова");

        Person person2 = new Person();
        person2.setFirstName("Алексей");
        person2.setLastName("Петров");

        Person person3 = new Person();
        person3.setFirstName("Ольга");
        person3.setLastName("Михайлова");

        Person person4 = new Person();
        person4.setFirstName("Иван");
        person4.setLastName("Иванов");

        Person person5 = new Person();
        person5.setFirstName("Вячеслав");
        person5.setLastName("Антонов");

        Person person6 = new Person();
        person6.setFirstName("Александр");
        person6.setLastName("Кузьмин");

        Person person7 = new Person();
        person7.setFirstName("Ольга");
        person7.setLastName("Иванова");
        List<Person> personArrayList = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5, person6, person7));

        Gson gson = new Gson();
        String personJSON = gson.toJson(personArrayList);

        PrintWriter printWriter = response.getWriter();
        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        printWriter.write(personJSON);
        printWriter.close();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    public void destroy() {

    }
}
