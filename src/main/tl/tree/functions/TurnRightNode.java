package tl.tree.functions;

import tl.TLValue;
import tl.tree.TLNode;
import java.io.PrintStream;

public class TurnRightNode implements TLNode {

  private TLNode expression;
  private PrintStream out;

  public TurnRightNode(TLNode e) {
    this(e, System.out);
  }

  public TurnRightNode(TLNode e, PrintStream o) {
    expression = e;
    out = o;
  }

  @Override
  public TLValue evaluate() {
    
    TLValue value = expression.evaluate();
    out.println("0x0c 0x00  0x80  0x04  0x02  0x9C  0x07  0x00  0x00  0x20  0x00  0x00  0x01  0xD4" + value);
    return TLValue.VOID;
  }
}

