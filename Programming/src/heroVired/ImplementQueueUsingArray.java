package heroVired;

public class ImplementQueueUsingArray {
    public static class Queue{
       static  int arr[];
       static  int rear=-1;
       static int size;

        Queue(int n){
            arr=new int[n];
            this.size=n;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        public static void add(int d){
         if(rear==size-1){
             System.out.println("Queue is full");
             return;
         }
         rear++;
         arr[rear]=d;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;

        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
      return arr[0];

        }
    }

    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }



}
