package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class icf extends aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.icm b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icf(defpackage.icm icmVar, aoln aolnVar) {
        super(aolnVar);
        this.b = icmVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        java.lang.Object objC = this.b.c(this);
        return objC != aolu.a ? new aoiw(objC) : objC;
    }
}
