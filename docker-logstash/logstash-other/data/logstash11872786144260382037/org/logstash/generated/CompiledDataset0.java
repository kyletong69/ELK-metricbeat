package org.logstash.generated;

public final class CompiledDataset0 extends org.logstash.config.ir.compiler.BaseDataset
    implements org.logstash.config.ir.compiler.Dataset {
  private final org.logstash.config.ir.compiler.OutputDelegatorExt field0;

  public CompiledDataset0(java.util.Map arguments) {
    field0 = ((org.logstash.config.ir.compiler.OutputDelegatorExt) arguments.get("field0"));
  }

  public java.util.Collection compute(
      org.jruby.RubyArray batchArg, boolean flushArg, boolean shutdownArg) {
    field0.multiReceive(batchArg);
    return null;
  }

  public void clear() {}
}
