package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class yso extends aomd {
    int a;
    int b;
    /* synthetic */ java.lang.Object c;
    final /* synthetic */ defpackage.ysu d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yso(defpackage.ysu ysuVar, aoln aolnVar) {
        super(aolnVar);
        this.d = ysuVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        java.lang.Object objD = this.d.d(0, 0, this);
        return objD != aolu.a ? new aoiw(objD) : objD;
    }
}
