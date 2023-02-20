public class ArrayListTest {

    public static void inc(ArrayList list) {
        for (int i = 0; i < 10000; i++)
            list.add(i);
    }
    public static void main(String[] args) throws InterruptedException {
        ArrayList arrayList = new ArrayList();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                inc(arrayList);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                inc(arrayList);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(arrayList.size());
    }
}
