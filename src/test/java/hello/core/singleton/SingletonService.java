package hello.core.singleton;

public class SingletonService {

    // 자기 자신을 내부에 private으로 가짐
    // 이때 static으로 가지기에 클래스 레벨에 딱 1개만 생성된다.
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        // 내부적으로 new SingletonService를 실행해 참조값을 넣어놓은 instance를 반환
        return instance;
    }

    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
