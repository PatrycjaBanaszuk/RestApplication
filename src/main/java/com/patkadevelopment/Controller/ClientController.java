package com.patkadevelopment.Controller;


import com.patkadevelopment.Model.Client;
import com.patkadevelopment.Service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    ClientService clientService;
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    @PostMapping
    public Client createClient (@RequestBody Client client){
        return clientService.createClient(client);
    }

    @PutMapping
    public Client updateClient(@RequestBody Client client){
        return clientService.updateClient(client);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteClient(@PathVariable(value = "id") int id){
        clientService.deleteClient(id);
    }

    @GetMapping(value = "/{id}")
    public Client getClient(@PathVariable(value = "id") int id) {

        return clientService.getClient(id);
    }

    @GetMapping
    public List<Client> getClient(){
        return clientService.getListofClients();
    }
}
