import java.util.Scanner;

class LibraryManagement {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int bookId[] = new int[100];
        String bookName[] = new String[100];
        boolean isIssued[] = new boolean[100];

        int count = 0;

        while(true){

            System.out.println("\n1 Add Book");
            System.out.println("2 Display Books");
            System.out.println("3 Search Book");
            System.out.println("4 Issue Book");
            System.out.println("5 Return Book");
            System.out.println("6 Exit");

            int choice = sc.nextInt();

            if(choice == 1){

                System.out.print("Enter Book ID: ");
                bookId[count] = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Book Name: ");
                bookName[count] = sc.nextLine();

                isIssued[count] = false;
                count++;

            }

            else if(choice == 2){

                for(int i=0;i<count;i++){

                    System.out.println(bookId[i]+" "+bookName[i]);

                    if(isIssued[i])
                        System.out.println("Issued");
                    else
                        System.out.println("Available");
                }

            }

            else if(choice == 3){

                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();

                for(int i=0;i<count;i++){
                    if(bookId[i] == id){
                        System.out.println("Book Found: "+bookName[i]);
                    }
                }

            }

            else if(choice == 4){

                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();

                for(int i=0;i<count;i++){
                    if(bookId[i] == id){

                        if(!isIssued[i]){
                            isIssued[i] = true;
                            System.out.println("Book Issued");
                        }
                        else{
                            System.out.println("Already Issued");
                        }

                    }
                }

            }

            else if(choice == 5){

                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();

                for(int i=0;i<count;i++){
                    if(bookId[i] == id){
                        isIssued[i] = false;
                        System.out.println("Book Returned");
                    }
                }

            }

            else{
                break;
            }

        }

    }
}