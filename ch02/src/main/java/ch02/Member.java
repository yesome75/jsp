package ch02;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Member")
public class Member extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String[] mail = request.getParameterValues("mail");
		String job = request.getParameter("job");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("이름 : " + name+"<p>");
		out.println("아이디 : " + id+"<p>");
		out.println("암호 : " + password+"<p>");
		out.println("성별 : " + gender+"<p>");
		out.println("메일 수신 : ");
		if (mail == null) out.println("수신 메일이 없습니다<p>");
		else 
			for(int i=0; i < mail.length;i++) {
				if (i == mail.length - 1) out.println(mail[i]+"<p>");
				else out.println(mail[i]+", ");
			}
		out.println("직업 : " + job+"<p>");
		out.println("</body></html>");
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}
}