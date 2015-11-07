/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerberos;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Vitor Tozzi
 */
public interface InterfaceServer extends Remote{
    
    public String sayHello()throws RemoteException;
    public boolean authenticate(String filepath) throws RemoteException;
    
}
