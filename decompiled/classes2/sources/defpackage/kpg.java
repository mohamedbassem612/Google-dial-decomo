package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class kpg extends aomd {
    long a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.kpj c;
    int d;
    defpackage.kpd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpg(defpackage.kpj kpjVar, aoln aolnVar) {
        super(aolnVar);
        this.c = kpjVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        java.lang.Object objB = this.c.b(null, this);
        return objB != aolu.a ? new aoiw(objB) : objB;
    }
}
