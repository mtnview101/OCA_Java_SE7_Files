package core;

public class H17_StringBuilder {

    public static void main(String[] args) {
        final long start = System.nanoTime();
        
        StringBuilder string = new StringBuilder("a");
  int max = 1_000_000;
  for (int i = 0; i < max; i++) {string = string.append("b");}
        final long finish = System.nanoTime();
        final long result = (finish - start);

  System.out.println("Using StringBuilder, elapsed nanoseconds: " + result);}}

