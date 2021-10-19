import java.util.Stack;

class LinkedStack<T> implements Stack<T>
{
   class LLNode<T>
   {
       T info;
       LLNode<T> link;
       public LLNode(T info)
       {
           this.info = info;
           link = null;
       }
       public void setLink(LLNode<T> link)
       {
           this.link = link;
       }
       public LLNode<T> getLink()
       {
           return link;
       }
       public T getInfo()
       {
           return info;
       }
   }
   private LLNode<T> top;
  
   public LinkedStack()
   {
       top = null;
   }

   public void push(T element)
   {
       LLNode<T> newNode = new LLNode<>(element);
       newNode.setLink(top);
       top = newNode;
   }

   public void pop() throws Exception
   {
       if (isEmpty())
       throw new Exception("Pop attempted on an empty stack.");
       else
       top = top.getLink();
   }

   public T peek() throws Exception
   {
       if (isEmpty())
       throw new Exception("Top attempted on an empty stack.");
       else
       return top.getInfo();
   }

   public boolean isEmpty()
   {
       return (top == null);
   }

   public boolean isFull()
   {
       return false;
   }
}