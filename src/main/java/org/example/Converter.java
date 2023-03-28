package org.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;

@WebService(serviceName = "ConverterWS")
public class Converter {

    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "value") double mt){
        return mt*11;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code,1000);
    }

    @WebMethod
    List<Compte> getComptes(){
        List<Compte> comptes = List.of(new Compte[]{new Compte(1, 1000),
                new Compte(2, 2000),
                new Compte(3, 3000)});
        return comptes;
    }

}
