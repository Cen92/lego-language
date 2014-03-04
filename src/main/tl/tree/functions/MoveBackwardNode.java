package tl.tree.functions;

import tl.TLValue;
import tl.tree.TLNode;
import java.io.PrintStream;

public class MoveBackwardNode implements TLNode {

  private TLNode expression;
  private PrintStream out;

  public MoveBackwardNode(TLNode e) {
    this(e, System.out);
  }

  public MoveBackwardNode(TLNode e, PrintStream o) {
    expression = e;
    out = o;
  }

  @Override
  public TLValue evaluate() {
    
    TLValue value = expression.evaluate();
    out.println("0x0c 0x00  0x80  0x04  0x02  0x9C  0x07  0x00  0x00  0x20  0x00  0x00  0x02  0xD0" + value);
    return TLValue.VOID;
  }
}
