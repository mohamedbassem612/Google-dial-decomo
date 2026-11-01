package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class edp extends defpackage.aomd {
    boolean a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    int e;
    /* synthetic */ java.lang.Object f;
    final /* synthetic */ defpackage.eei g;
    int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edp(defpackage.eei eeiVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.g = eeiVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.f(false, this);
    }
}
