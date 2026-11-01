package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class jzd extends defpackage.aomd {
    java.lang.Object a;
    long b;
    /* synthetic */ java.lang.Object c;
    final /* synthetic */ defpackage.jzj d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzd(defpackage.jzj jzjVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.d = jzjVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
