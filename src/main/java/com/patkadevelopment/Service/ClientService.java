package com.patkadevelopment.Service;

import com.patkadevelopment.Model.Client;

import java.util.List;

public interface ClientService {

    Client createClient (Client client);
    void deleteClient (final int id);
    List<Client> getListofClients();
    Client updateClient (Client client);
    Client getClient (final int id);

}
