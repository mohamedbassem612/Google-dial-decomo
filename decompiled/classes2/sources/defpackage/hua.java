package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hua extends aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.hub b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hua(defpackage.hub hubVar, aoln aolnVar) {
        super(aolnVar);
        this.b = hubVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        java.lang.Object objA = this.b.a(this);
        return objA != aolu.a ? new aoiw(objA) : objA;
    }
}
