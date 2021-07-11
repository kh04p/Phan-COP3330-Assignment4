/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Khoa Phan
 */
package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
<<<<<<< HEAD
import javafx.scene.control.ListView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
=======
import javafx.scene.control.Button;
>>>>>>> parent of 7ba6887 (14th Commit: Done with NewFile and OpenFile functions.)

public class mainController {
    //Limit of 100 lists total
    String filePath = "C:\\Users\\khoa1\\Desktop\\random_todo_list.txt";
    String exportFilePath = "C:\\Users\\khoa1\\Desktop\\exported_list.txt";

    @FXML
<<<<<<< HEAD
    private ListView ListOfTodoList = new ListView();

    @FXML
    public void initialize() {
        ArrayList<LinkedHashMap<String, LinkedHashMap<String, LinkedHashMap<String, String>>>> bigList = file.getBigList();

        for (int i = 0; i < bigList.size(); i++) {
            LinkedHashMap<String, LinkedHashMap<String, LinkedHashMap<String, String>>> todoList = bigList.get(i);
            String todoListName = (String) todoList.keySet().toArray()[0];
            ListOfTodoList.getItems().add(todoListName);
        }
=======
    private Button newFileButton;

    @FXML
    private Button openFileButton;

    @FXML
    private Button exportFileButton;

    @FXML
    private Button newListButton;

    @FXML
    private Button openListButton;

    @FXML
    private Button deleteListButton;

    @FXML
    void newFile(ActionEvent event) {
        //Once newFileButton is clicked, user will be directed to saveTodo.fxml to enter a file name to save to local directory.
        //changeScene(saveTodo.fxml) will be used
        //New File variable will be created to create empty text file using file path from user -> Return exception if file cannot be created
>>>>>>> parent of 7ba6887 (14th Commit: Done with NewFile and OpenFile functions.)
    }

    @FXML
    void openFile(ActionEvent event) {
        //Once openFileButton is clicked, user will be prompted for file path through openTodo.fxml -> changeScene(openTodo.fxml)
        //An arraylist of arraylists of maps will be created and each map will contain item's name, current state, due date and description.
        //File and Scanner variables will be created using provided file path -> Return exception if file cannot be opened
        //while scanner.hasNextLine()
            //Another Scanner will be created to scan each character in each line
            //while Scanner has next
            //Scanned data will be put into temporary Map
            //Map will be put into temporary ArrayList of Maps
        //temporary ArrayList of Maps will be put into bigger ArrayList of ArrayLists of Maps
        //Populate listView in mainTodo.fxml with names of each list
        //New data will be added to the same ArrayList of ArrayLists of Maps if user wishes to open another file
<<<<<<< HEAD

        ArrayList<LinkedHashMap<String, LinkedHashMap<String, LinkedHashMap<String, String>>>> bigList = new ArrayList<>();

        try {
            bigList = file.read(filePath);
        } catch (IOException e) {
            System.out.println("Unable to read file");
        }

        for (int i = 0; i < bigList.size(); i++) {
            LinkedHashMap<String, LinkedHashMap<String, LinkedHashMap<String, String>>> todoList = bigList.get(i);
            String todoListName = (String) todoList.keySet().toArray()[0];
            ListOfTodoList.getItems().add(todoListName);
        }
=======
>>>>>>> parent of 7ba6887 (14th Commit: Done with NewFile and OpenFile functions.)
    }

    @FXML
    void exportFile(ActionEvent event) {
        //Once exportFileButton is clicked, program will convert current ArrayList of ArrayLists of Maps into String
        //User will be prompted for name of file
        //BufferedWriter will be used to write String into file and save it -> Return exception if file cannot be created

        todo todo = new todo();
        todo.changeScene("saveTodo.fxml");
    }

    @FXML
    void newList(ActionEvent event) {
        //Once newListButton is clicked, an empty ArrayList of Maps will be created
        //User will be directed to editTodo.fxml to edit new list
        //changeScene(editTodo.fxml) will be used
        file.addTodoList("New Todo List (edit to change name)");
        ListOfTodoList.getItems().add("New Todo List (edit to change name)");
    }

    @FXML
    void openList(ActionEvent event) {
        //Once a list is selected and openListButton is clicked, program will record name of list
        //User will be directed to editTodo.fxml to edit each item in list
        //changeScene(editTodo.fxml) will be used
        file.setCurrentTodoList((String) ListOfTodoList.getSelectionModel().getSelectedItem());
        todo todo = new todo();
        todo.changeScene("editTodo.fxml");
    }

    @FXML
    void deleteList(ActionEvent event) {
        //Program will record name of list and search within current ArrayLists of ArrayLists of Maps
        //Once correct ArrayList is found, program will remove it and return confirmation
        file.removeTodoList((String) ListOfTodoList.getSelectionModel().getSelectedItem());
        ListOfTodoList.getItems().remove(ListOfTodoList.getSelectionModel().getSelectedItem());
    }
}
