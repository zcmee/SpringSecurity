package zcm.com.github.SpringSecurity.filters;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Order(1)
@Component //Dzieki temu spring ją wykryje i będzie mógł nią zarządzać
public class FirstFilter implements Filter {

//Żeby filter został poprawnie dodany, to
//metoda init we filtrze sie nie wykona w przypadku gdy metoda wyrzuci servlet exception lub nie wykona sie w czasie zdefiniowanym przez kontener webowy (czyli po prostu sie zawiesi)

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init() : FirstFilter");
    }

    //ona bedzie
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("FirstFilter: do Filter");
        chain.doFilter(request, response); //kontynówanie drogi, do nastepnego zasobu, co ma sie odwołać
    }

    //Jest wywoływana, że filtr jest usówany z aplikacji. Można ją wywołać w momencie, kiedy wszytskie wątki korzystającege z danego filtru opuściły metodę
    //ona usówa handlery
    @Override
    public void destroy() {
        System.out.println("destroy() : FirstFilter");
    }
}
