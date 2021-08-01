package com.example.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    List<User> users = new ArrayList<>();

    public UserController() {
        users.add(new User(1, 20, "Norbert Patrymoniusz"));
        users.add(new User(2, 44, "Demencjusz Pustyłeb"));
        users.add(new User(3, 56,"Marian Stodoła"));
    }

    @GetMapping
    public List<User> getUsers() {
        return users;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity getUsersById(@PathVariable("id") long id) {
        User userFound = null;

        for (User user : users) {
            if (user.getId() == id) {
                userFound = user;
                break;
            }
        }

        if (userFound == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping(params = "name")
    public ResponseEntity getUsersByName(@RequestParam(value = "name") String name) {
        List<User> filteredUsers = new ArrayList<User>();

        for (User user : users) {
            if (user.getName().equals(name)) {
                filteredUsers.add(user);
            }
        }

        if (filteredUsers.isEmpty()) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity add(@RequestBody User u) {
        users.add(u);
        return new ResponseEntity(u, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity addOrUpdate(@RequestBody User u) {
        ResponseEntity response;

        if (users.contains(u)) {
            int index = users.indexOf(u);
            users.set(index, u);
            response = new ResponseEntity(u, HttpStatus.OK);
        }
        else {
            users.add(u);
            response = new ResponseEntity(u, HttpStatus.CREATED);
        }

        return response;
    }

    @DeleteMapping
    public ResponseEntity delete(@PathVariable("id") long id) {
        boolean found = false;

        for (User user : users) {
            if (user.getId() == id) {
                users.remove(user);
                found = true;
                break;
            }
        }

        if (!found) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(HttpStatus.OK);
    }

}
