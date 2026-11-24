package example.tags;

import java.io.IOException;
import java.time.LocalDate;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class SysDateImpl extends TagSupport{
	
	//doStartTag()
	@Override
	public int doStartTag() throws JspException {
		return EVAL_BODY_INCLUDE;   //skip_body
	}	
	
	//doEndTag()
	@Override
	public int doEndTag() throws JspException {
		JspWriter out = pageContext.getOut();
		LocalDate today = LocalDate.now();
		try {
			out.println("<h2>Today's date is " + today + "<h2>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;   //skip_page
		
	}
}
