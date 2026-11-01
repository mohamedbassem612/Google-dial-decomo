package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class kpp extends aomd {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    /* synthetic */ java.lang.Object d;
    final /* synthetic */ defpackage.kpq e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpp(defpackage.kpq kpqVar, aoln aolnVar) {
        super(aolnVar);
        this.e = kpqVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        java.lang.Object objE = this.e.e(null, this);
        return objE != aolu.a ? new aoiw(objE) : objE;
    }
}
