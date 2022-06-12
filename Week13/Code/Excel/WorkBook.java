package Week13.Excel;

import javax.swing.*;
import java.util.Date;

public class WorkBook {
    String title;
    String path;
    String author;
    double fileSize;
    Date dateCreated;
    Date dateEdited;
    Sheet[] sheets;
    boolean isEditsSaved;

    public WorkBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.path = "c://users//yaman";
        this.dateCreated = new Date();
        this.dateEdited = new Date();
        this.sheets = new Sheet[10];
        this.isEditsSaved = true;
    }

    public void createSheet(){
        if(0 >= this.sheets.length) System.out.println("MAXIMUM NUMBER OF SHEETS EXCEEDED");// TODO: GET INDEX
        this.sheets[0] = new Sheet(); // TODO: GET CURRENT SHEET INDEX
        this.isEditsSaved = false;
        this.dateEdited = new Date();
    }

    public void saveFile(String path){
        System.out.println(this.isEditsSaved);
        if(!this.isEditsSaved) JOptionPane.showConfirmDialog(null,"ARE YOU SURE YOU WANT TO SAVE?");
        this.path = path;
        this.dateEdited = new Date();
        this.isEditsSaved = true;
    }
}
