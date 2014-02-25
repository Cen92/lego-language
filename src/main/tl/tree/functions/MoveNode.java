package tl.tree.functions;

import tl.TLValue;
import tl.tree.TLNode;
import java.io.PrintStream;

public class MoveNode implements TLNode {

  private TLNode expression;
  private PrintStream out;

  public MoveNode(TLNode e) {
    this(e, System.out);
  }

  public MoveNode(TLNode e, PrintStream o) {
    expression = e;
    out = o;
  }

  @Override
  public TLValue evaluate() {
    TLValue value = expression.evaluate();
    out.println(value);
    return TLValue.VOID;
  }
}

