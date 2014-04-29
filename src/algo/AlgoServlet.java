package algo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Servlet implementation class AlgoServlet
 */
@WebServlet("/AlgoServlet")
public class AlgoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlgoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String strList=null;
    	if(request.getParameter("list").toString().equals("")){
    		strList="There is no list there.";
    	}else{
    		strList = request.getParameter("list").toString();
    		List<Integer> list = new ArrayList<Integer>();
    		for(String s : strList.split(";")){
    			list.add(Integer.parseInt(s));
    		}
    		int n = Integer.parseInt(request.getParameter("n"));
    		list = removeDuplicatesA(list);
    		strList = "";
    		for(Integer i : list){
    			strList = strList + ";" + i;
    		}
    		strList = strList.substring(1);
    		n = nthLargestA(list,n);
    		strList = "The list is: " + strList +"<br/>The Nth largest element is: "+n;
    	}
    	response.setContentType("text/html");  
    	response.setCharacterEncoding("UTF-8"); 
    	response.getWriter().write(strList); 
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    }
    
    private List<Integer> removeDuplicatesA(List<Integer> list){
    	List<Integer> newlist = new ArrayList<Integer>();
    	for(Integer i : list){
    		if(!newlist.contains(i)){
    			newlist.add(i);
    		}
    	}
    	return newlist;
    }
    
    private List<Integer> removeDuplicatesB(List<Integer> list){
    	Set<Integer> set = new HashSet<Integer>(list);
    	list = new ArrayList<Integer>(set);
    	return list;
    }
    
    private int nthLargestA(List<Integer> list, int n){
    	
    	return n;
    }
    
    private int nthLargestB(List<Integer> list, int n){
    	
    	return n;
    }
}
