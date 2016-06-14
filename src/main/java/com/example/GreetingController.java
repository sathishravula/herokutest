package com.example;

import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * Created by sathish on 23/12/15.
 */
@SuppressWarnings("ALL")
@RestController
@Component
public class GreetingController {
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    Service service;



    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Map<String, String> greeting(@RequestParam(value = "email",required = true) String email, @RequestParam(value = "password") String password,@RequestParam(value = "role") String role) {
        Map<String, String> stringMap =service.createUser(email, password, role);
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


//    @ExceptionHandler(Exception.class)
//    public ModelAndView handleError(HttpServletRequest req, Exception exception) {
//        System.out.println("Request: " + req.getRequestURL() + " ------ " + exception.getMessage());
//
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("exception", exception);
//        mav.addObject("url", req.getRequestURL());
//        mav.setViewName("error");
//        return mav;
//    }



    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response> rulesForCustomerNotFound(HttpServletRequest req, Exception e)
    {

        System.out.println("Request: " + req.getRequestURL() + " ++++++ " + e.getMessage());
        Response error = new Response();
        error.setStatus(400);
        error.setMessage(e.getLocalizedMessage());
        return new ResponseEntity<Response>(error, HttpStatus.OK);
    }

}
