package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class kqa extends aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.kqb b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqa(defpackage.kqb kqbVar, aoln aolnVar) {
        super(aolnVar);
        this.b = kqbVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        java.lang.Object objA = this.b.a(null, this);
        return objA != aolu.a ? new aoiw(objA) : objA;
    }
}
