package Metier;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Model.Message;

public interface IChat extends Remote{
	
	public ArrayList<Message> readMessages() throws RemoteException;
    public void sendMessage(Message message) throws RemoteException;

}
