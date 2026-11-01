package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class kqh extends aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.kqj b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqh(defpackage.kqj kqjVar, aoln aolnVar) {
        super(aolnVar);
        this.b = kqjVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        java.lang.Object objE = this.b.e(null, this);
        return objE != aolu.a ? new aoiw(objE) : objE;
    }
}
