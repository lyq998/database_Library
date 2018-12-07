package test;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.InfoDao;
import model.Info;

@WebServlet("/SearchInfo")
public class SearchInfoServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("text/html;charset=utf-8");
			String thatid = request.getParameter("id");
			// »Ù ‰»ÎŒ™ø’
			if (thatid.equals("")) {
				InfoDao dao = new InfoDao();

				List<Info> infos = dao.getAllInfo();
				if (infos != null) {
					request.setAttribute("infos", infos);
				}
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/showInfo.jsp");
				rd.forward(request, response);
			} else {
				InfoDao dao = new InfoDao();

				List<Info> infos = dao.getInfoById(thatid);
				if (infos != null) {
					request.setAttribute("infos", infos);
				}
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/showInfo.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {

		}
	}
}
