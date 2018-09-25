package servlets;

import domain.Note;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author 747787
 */

public class NoteServlet extends HttpServlet {
            String title;
            String content;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String path = getServletContext().getRealPath("/WEB-INF/note.txt");
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));

            title = br.readLine();
            content = br.readLine();
            Note note = new Note(title,content);
            request.setAttribute("Note",note);
            
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        br.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path,true)));
        pw.println(request.getAttribute("title"));
        pw.println(request.getAttribute("content"));
        pw.close();

        
       
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        

    }
    

}
