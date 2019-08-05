package com.digital;

import com.digital.model.CloudType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "selectcloudservlet",
        urlPatterns = "/Selectcloud"
)
public class SelectCloudProduct extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String cloudType = req.getParameter("Type");

        CloudService cloudService = new CloudService();
        CloudType c = CloudType.valueOf(cloudType);

        List cloudProducts = cloudService.getAvailableProducts(c);

        req.setAttribute("products", cloudProducts);
        RequestDispatcher view = req.getRequestDispatcher("results.jsp");
        view.forward(req, resp);

    }


}



