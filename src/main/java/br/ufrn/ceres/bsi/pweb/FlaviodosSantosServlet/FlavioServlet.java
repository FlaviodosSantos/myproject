package br.ufrn.ceres.bsi.pweb.FlaviodosSantosServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FlavioServlet
 */
@WebServlet("/FlavioServlet")
public class FlavioServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlavioServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter saida = response.getWriter();

        saida.append("<br>Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Definir o Tipo do Conteúdo response para HTML
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String number = request.getParameter("numero");
        Integer num = Integer.parseInt(number);
        PrintWriter out = response.getWriter();

        response.getWriter().append("Este foi o número digitado: " + num);
        
        //verificando se é par ou impar
            if(num % 2 == 0) 
                out.print("<p>Este numero é par.</p>");
            else
                out.print("<p>Este numero é impar.</p>");
                
        //verificanco se é numero primo
            int contador = 0;
            
            for(int i = 1; i <= num; i++)
                if(num % i == 0)
                    contador++;
            
            if(contador > 2)
                out.print("<p>Este numero não é primo.</p>");
            else
                out.print("<p>Este numero é primo.</p>");
        
        //numeros divisíveis
            for(int i = 1; i <= num; i++)
			    if(num % i == 0) 
                    out.print("<p>Este numero é divisível por : "+i);
        
        //verificando se é numero perfeito
        int cont = 0;
		for(int i = 1; i < num; i++) 
			if(num % i == 0)
				cont += i;
		
		if(cont == num)
            out.print("<p>Este numero é um numero perfeito ! ");
		else
            out.print("<p>Este numero não é um numero perfeito ! ");

        doGet(request, response);
    }
}
