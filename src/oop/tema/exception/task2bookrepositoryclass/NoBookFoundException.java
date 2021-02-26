package oop.tema.exception.task2bookrepositoryclass;

import java.util.ArrayList;
import java.util.List;

public class NoBookFoundException extends Exception{
    public NoBookFoundException(String message){
        super(message);
    }

}
