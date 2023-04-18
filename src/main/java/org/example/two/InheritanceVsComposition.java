package org.example.two;

public class InheritanceVsComposition {

  public static void main(String[] args) {
    new BlackWizard().doBlackMagic();
    new BlackWizardDecorator().doBlackMagic();
  }

  private static class Wizard {
    public void doMagic() {
      System.out.print("magic is done");
      System.out.println("");
    }
  }

  private static class BlackWizard extends Wizard {
    public void doBlackMagic() {
      System.out.println("Black magic is done");
    }
  }

  private static class BlackWizardDecorator {
    private static Wizard WIZARD = new Wizard();

    public void doBlackMagic() {
      System.out.print("[Decorator] Black ");
      WIZARD.doMagic();
    }
  }
}
