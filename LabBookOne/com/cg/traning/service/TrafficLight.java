package com.cg.traning.service;


public class TrafficLight {

    public String showTrafficSignals(String str)
    {
        
           switch(str)
           {
               case "GREEN" :
                   return "Go"; //no need to write break if return is there
                                //as return itself ends the execution of method          
               case "RED" :
                   return "Stop";
              
               case "YELLOW":
                    return "Ready";
               
               default:
                   return "Not following traffic rules can result in penalty or worst!";
           }
    }
}
