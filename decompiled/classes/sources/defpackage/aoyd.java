package defpackage;

/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoyd extends defpackage.aomd {
    public /* synthetic */ java.lang.Object a;
    public int b;
    public java.lang.Object c;
    final /* synthetic */ defpackage.gdb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoyd(defpackage.gdb gdbVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.d = gdbVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
