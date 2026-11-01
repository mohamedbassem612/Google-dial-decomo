package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ysn extends aomd {
    int a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.ysu c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysn(defpackage.ysu ysuVar, aoln aolnVar) {
        super(aolnVar);
        this.c = ysuVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        java.lang.Object objC = this.c.c(0, this);
        return objC != aolu.a ? new aoiw(objC) : objC;
    }
}
