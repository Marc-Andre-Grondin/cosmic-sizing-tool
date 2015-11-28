package models;

import java.util.*;
import javax.persistence.*;
import java.util.ArrayList;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

public class ModelGlossaire extends Model{
  private String language;
  public final static String pathGlossary = System.getProperty("user.dir")+"/"+"Glossary.txt";
  ArrayList  = new ArrayList();



    void setGlossary(String language) {
      
      this.language = language;
      //setChanged();
      //notifyObservers();
    } 

    public String  getGlossary() {
      return language;
    }   
}

   


}