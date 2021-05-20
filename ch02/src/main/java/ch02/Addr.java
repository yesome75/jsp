package ch02;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Addr")
public class Addr extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		response.setContentType("text/html;charset=utf-8"); //화면으로 보낼때 한글처리
		//출력             응답할때 출력 => 화면(브라우저)
		PrintWriter out = response.getWriter(); //객체를 생성하는 메서드
		out.println("<html><body>");
		out.println("<h2>이름과 주소</h2>");
		out.println("이름 : "+name+"<p>");
		out.println("주소 : "+addr);
		out.println("</body></html>");
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}