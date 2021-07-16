package com.company;

public class Main {
    public static void main(String[] args) {
        Folder documents = new Folder("Documents");
        Folder workDocuments = new Folder("Work.Documents");
        Folder schoolDocuments = new Folder("School.Documents");

        DocumentsFile documentFile1 = new DocumentsFile("Task1", "Hello World!");
        DocumentsFile documentFile2 = new DocumentsFile("Task2", "Hello Java!");


        documents.addFile(documentFile1);
        documents.addFile(workDocuments);
        workDocuments.addFile(schoolDocuments);
        schoolDocuments.addFile(documentFile2);

        System.out.println(documents);
        System.out.println(schoolDocuments);
        System.out.println(documentFile2);
    }
}





