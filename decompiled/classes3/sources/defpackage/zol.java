package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class zol extends aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.zoq b;
    int c;
    apdp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol(defpackage.zoq zoqVar, aoln aolnVar) {
        super(aolnVar);
        this.b = zoqVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        java.lang.Object objC = this.b.c(this);
        return objC != aolu.a ? new defpackage.zpb(objC) : objC;
    }
}
