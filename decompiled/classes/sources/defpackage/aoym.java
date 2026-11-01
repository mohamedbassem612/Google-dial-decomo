package defpackage;

/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoym extends defpackage.aomd {
    public /* synthetic */ java.lang.Object a;
    public int b;
    public java.lang.Object c;
    public java.lang.Object d;
    final /* synthetic */ defpackage.gdb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoym(defpackage.gdb gdbVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.e = gdbVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
