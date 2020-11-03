package br.ufs.dcomp.InetAddressTest;

import java.net.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            //Pegando o domínio do servidor
            String name = "www.ufs.br";
            InetAddress address = InetAddress.getByName(name); 
            System.out.println( "Name:      "+ name);
            //Pegar somente o ip
            System.out.println( "Address:   "+ address.getHostAddress());
            //Nome e IP
            //System.out.println( "Address:   "+ address);

        } catch (UnknownHostException e){
            System.out.println(e.getMessage());
        }                
    }
}
