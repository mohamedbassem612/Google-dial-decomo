package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class kpm extends aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.kpq b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpm(defpackage.kpq kpqVar, aoln aolnVar) {
        super(aolnVar);
        this.b = kpqVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        java.lang.Object objC = this.b.c(null, null, this);
        return objC != aolu.a ? new aoiw(objC) : objC;
    }
}
