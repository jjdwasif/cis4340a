
public class OuterSer implements Serializable {
  private int rank;
  class InnerSer implements Serializable {
    protected String name;
    // ...
  }
}

// compliant

public class OuterSer implements Serializable {
  private int rank;
  static class InnerSer implements Serializable {
    protected String name;
    // ...
  }
}
