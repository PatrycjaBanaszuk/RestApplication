package com.patkadevelopment.Service;

import com.patkadevelopment.Model.Client;
import com.patkadevelopment.Repository.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Transactional
    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Transactional
    @Override
    public void deleteClient(int id) {
        clientRepository.deleteById(id);
    }

    @Transactional
    @Override
    public List<Client> getListofClients() {
        return clientRepository.findAll();
    }

    @Transactional
    @Override
    public Client updateClient(Client client) {
        Client clientforDB = clientRepository.findById(client.getId()).orElseThrow( ()-> new EntityNotFoundException());
        clientforDB.setBusinessPartner(client.getBusinessPartner());
        return clientforDB;
    }

    @Transactional
    @Override
    public Client getClient(int id) {
        return clientRepository.findById(id).orElseThrow(()-> new EntityNotFoundException());
    }

}
