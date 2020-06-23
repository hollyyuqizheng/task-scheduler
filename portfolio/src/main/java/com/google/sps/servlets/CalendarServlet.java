package com.google.sps.servlets;

import com.google.gson.Gson;
import com.google.sps.data.CalendarEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Servlet that handles calendar event creation. */
@WebServlet("/calendarServlet")
public class CalendarServlet extends HttpServlet {

  public List<CalendarEvent> eventList;

  public CalendarServlet() {
    eventList = new ArrayList<CalendarEvent>();
  }

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    // TODO
  }

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    Gson gson = new Gson();
    CalendarEvent event = gson.fromJson(request.getReader(), CalendarEvent.class);
    eventList.add(event);
  }
}
