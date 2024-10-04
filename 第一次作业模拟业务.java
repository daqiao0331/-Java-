public class Main {
    static class Computer {
        private String model;
        private String cpu;
        private String neicun;
        private String yingpan;
        private String xianka;

        public Computer(String model, String cpu, String neicun, String yingpan, String xianka) {
            this.model = model;
            this.cpu = cpu;
            this.neicun = neicun;
            this.yingpan = yingpan;
            this.xianka = xianka;
        }

        public String getit() {
            return "型号: " + model + ", CPU: " + cpu + ", 内存: " + neicun + "GB, 硬盘: " + yingpan + "GB, 显卡: " + xianka;
        }
    }

    static class Student {
        private String name;
        private String xuehao;
        private Computer computer;

        public Student(String name, String xuehao, Computer computer) {
            this.name = name;
            this.xuehao = xuehao;
            this.computer = computer;
        }

        public void display() {
            System.out.println(name + " (" + xuehao + ") 的电脑配置如下：");
            System.out.println(computer.getit());
        }
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer("MACBOOK PRO 13", "APPLE M4", "16", "512", "apple gpu");
        Student student1 = new Student("张三", "20180101", computer1);
        student1.display();

        Computer computer2 = new Computer("MSI CREATOR Z16", "Intel i7", "16", "1T", "GeForce RTX 3060");
        Student student2 = new Student("李四", "20180102", computer2);
        student2.display();
    }
}
