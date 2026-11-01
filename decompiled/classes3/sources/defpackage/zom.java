package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class zom extends aomd {
    long a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.zoq c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zom(defpackage.zoq zoqVar, aoln aolnVar) {
        super(aolnVar);
        this.c = zoqVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        java.lang.Object objF = this.c.f(0L, this);
        return objF != aolu.a ? new defpackage.zpb(objF) : objF;
    }
}
