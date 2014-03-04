package tl.tree.functions;

import tl.TLValue;
import tl.tree.TLNode;
import java.io.PrintStream;

public class ShootNode implements TLNode {

  private TLNode expression;
  private PrintStream out;

  public ShootNode(TLNode e) {
    this(e, System.out);
  }

  public ShootNode(TLNode e, PrintStream o) {
    expression = e;
    out = o;
  }

  @Override
  public TLValue evaluate() {
    
    TLValue value = expression.evaluate();
    out.println("0x0c 0x00  0x80  0x04  0x00  0x64  0x05  0x01  0x00  0x20  0x00  0x00  0x01  0x68" + value);
    return TLValue.VOID;
  }
}
