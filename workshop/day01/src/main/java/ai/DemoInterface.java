package ai;

public class DemoInterface {
    public static void main(String[] args) {
        Report report = new Report1();
        report.generate();
    }
}

interface IUser {
    abstract void create();
}

abstract class Report {
    abstract void header();
    abstract void body();
    abstract void footer();

    public void generate() {
        header();
        body();
        footer();
    }
}

abstract class ReportWithBody {
    abstract void body();

    public void generate() {
        body();
    }
}

class Report1 extends Report {

    @Override
    void header() {

    }

    @Override
    void body() {

    }

    @Override
    void footer() {

    }
}
