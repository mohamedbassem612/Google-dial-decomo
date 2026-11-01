package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class rte extends defpackage.aomd {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    /* synthetic */ java.lang.Object e;
    final /* synthetic */ defpackage.rtg f;
    int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rte(defpackage.rtg rtgVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.f = rtgVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.e(null, null, this);
    }
}
