package com.example;

import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.*;

/**
 * Created by sathish on 23/12/15.
 */
@RestController
@Repository
public class GreetingController {
    @Autowired
    AccountRepository accountRepository;

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Map<String, String> greeting(@RequestParam(value = "email", defaultValue = "sathish") String email, @RequestParam(value = "password") String password) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("status", "success");
        stringMap.put("message", "user registered successfully");
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        accountRepository.save(user);
        return stringMap;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> user() {
        Iterable<User> iterator1 = accountRepository.findAll();
        List<User> users=IteratorUtils.toList(iterator1.iterator());
        return users;
    }


    @RequestMapping(value = "/users/data", method = RequestMethod.GET)
    public DoctorPaymentResponse datatable(@RequestParam(value = "draw", defaultValue = "1") int draw,
                                           @RequestParam(value = "start", defaultValue = "0") int start,
                                           @RequestParam(value = "searchKey", defaultValue = "") String searchKey) {

        DoctorPaymentResponse response=new DoctorPaymentResponse();
        ArrayList<Object[]> data=new ArrayList<>();
        for(int i=start; i<(start+5);i++){
        Object[] child=new Object[2];
            child[0]="id-"+i;
            child[1]="sathish"+i;
            data.add(child);
        }

        response.setData(data);
        response.setDraw(draw);
        response.setRecordsTotal(100l);
        response.setRecordsFiltered(100l);
        response.setExtra(101l);
        response.setExtra1(102l);
        response.setExtra2("hai sathish");
        return response;
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public
    @ResponseBody
    String handleFileUpload(@RequestParam("name") String name,
                            @RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream =
                        new BufferedOutputStream(new FileOutputStream(new File(name)));
                stream.write(bytes);
                stream.close();
                return "You successfully uploaded " + name + "!";
            } catch (Exception e) {
                return "You failed to upload " + name + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + name + " because the file was empty.";
        }
    }


}
