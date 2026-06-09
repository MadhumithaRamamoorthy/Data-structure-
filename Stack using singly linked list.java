lass Main {
    int data;
    Node next;
    Node(int data){
        this.data =data;
    }
    public class StackImplementation{
        public static stack top = null;
        static void main(){
            Scanner input =new Scanner(System.in);
            System.out.print("1.push(),2.pop(),3.peek(),4.display(),5.size(),6.isEmpty()");
            int choice;
            while(true){
                if(choice == -1){
                    break;
                }
                switch(choice){
                    case 1:{
                        int ele =input.nextInt();
                        push(ele);
                        break;
                    }
                    case 2:{
                        pop();
                        break;
                    }
                    case 3:{
                        peek();
                        break;
                    }
                    case 4:{
                        display();
                        break;
                    }
                    case 5:{
                        isEmpty();
                        break;
                    }
                    case 6:{
                        size();
                        break;
                    }
                public static void isEmpty(){
                    return top == null;
                    }
                    }
                    }
                    }
                }
            }
        }
    }
    }