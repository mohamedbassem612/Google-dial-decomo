package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class icd extends aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.icm b;
    int c;
    defpackage.icc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icd(defpackage.icm icmVar, aoln aolnVar) {
        super(aolnVar);
        this.b = icmVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        java.lang.Object objB = this.b.b(null, this);
        return objB != aolu.a ? new aoiw(objB) : objB;
    }
}
