package defpackage;

/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gda extends defpackage.aomd {
    /* synthetic */ java.lang.Object a;
    int b;
    java.lang.Object c;
    final /* synthetic */ defpackage.gdb d;
    java.lang.Object e;
    java.lang.Object f;
    java.lang.Object g;
    java.lang.Object h;
    java.lang.Object i;
    java.lang.Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gda(defpackage.gdb gdbVar, defpackage.aoln aolnVar) {
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
