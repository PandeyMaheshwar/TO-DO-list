package com.xyz.todolist.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xyz.todolist.helper.ToDoListOperations;

@WebServlet("/delete")
public class DeleteController extends HttpServlet {
 ToDoListOperations opr =  new ToDoListOperations();
 protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
	 String id = request.getParameter("id");
	 PrintWriter out = response.getWriter();
	 if(opr.delete(Integer.parseInt(id))) {
		 request.setAttribute("mydata", ToDoListOperations.list);
		 RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		 rd.forward(request, response);
	 }
	 else {
		out.println("No Id Found Can't Delete");
		 
	 }
	 out.close();
 }
}
