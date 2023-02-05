/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CalcagnoAPI340HW.CalcagnoAPI340HW;

/**
 *
 * @author josephcalcagno
 */
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author josephcalcagno
 */
@RestController
public class CalcagnoController {
    
      
    @GetMapping("/joke")
    public Object joke() {
        try {
         String url = "https://official-joke-api.appspot.com/jokes/random";
            RestTemplate restTemplate = new RestTemplate();
            ObjectMapper mapper = new ObjectMapper();

            String jSonQuote = restTemplate.getForObject(url, String.class);
            JsonNode root = mapper.readTree(jSonQuote);

            //Print the whole response to console.
            System.out.println(root);
            
            String setUp = root.get("setup").asText();
            String punchLine = root.get("punchline").asText();
            
           
            System.out.println();
            System.out.println("Setup: " + setUp);
            System.out.println("Punch Line: " + punchLine);  
            System.out.println(); 
           
            
            
            
            
            return root; 
            } catch (JsonProcessingException ex) {
            Logger.getLogger(CalcagnoController.class.getName()).log(Level.SEVERE, null, ex);
            return "error in /quote";
        } 
        
    }
    
    
}













