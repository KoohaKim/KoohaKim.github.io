package Class.Week4.Week4_0508;

public class SpaceInvaderTest {
  public static void main(String[] args) {
    SpaceInvader si = new SpaceInvader();

    si.moveleft();
    si.moveright();
    System.out.println(si.location);
  }
}