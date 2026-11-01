package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoxu extends defpackage.aomd {
    public /* synthetic */ java.lang.Object a;
    public int b;
    final /* synthetic */ defpackage.gdb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoxu(defpackage.gdb gdbVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.c = gdbVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
