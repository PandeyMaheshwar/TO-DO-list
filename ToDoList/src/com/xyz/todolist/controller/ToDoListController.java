package com.xyz.todolist.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.xyz.todolist.helper.ToDoList;
import com.xyz.todolist.helper.ToDoListOperations;

@WebServlet("/todo")

public class ToDoListController extends HttpServlet {
ToDoListOperations opr ;
public void init() {
	opr = new ToDoListOperations();
	System.out.println("init call");

}
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
  String id = request.getParameter("id");
  String name = request.getParameter("name");
  String desc = request.getParameter("desc");
  String date = request.getParameter("enddate");
  //Date d = new Date(date);
  LocalDate d = LocalDate.parse(date);
  System.out.println("Date is" + d);
  ToDoList obj = new ToDoList(Integer.parseInt(id), name, desc, d);
  opr.add(obj);
 // MailHelper.sendMail(name, obj.getDate());
  request.setAttribute("mydata", opr.list);
  RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
  rd.forward(request,response);
}
}