/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import Cliente.pantallaPrincipal;
import static Commands.BaseCommand.refPantalla;
import java.io.IOException;

public class LifeCommand extends BaseCommand {       
    public static final String COMMAN_NAME = "life";       
    
    @Override       public String getCommandName() {           
        return COMMAN_NAME;   
    }       
    
    @Override       
    public void execute(String[] args) {           
        if(args == null){
             
            refPantalla.vidaCasillas();
        }
        else{
            new ErrorCommand().execute(null);
        }
    }   
}
