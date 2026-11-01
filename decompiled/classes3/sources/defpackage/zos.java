package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class zos extends aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.zot b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zos(defpackage.zot zotVar, aoln aolnVar) {
        super(aolnVar);
        this.b = zotVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        java.lang.Object objA = this.b.a(null, null, 0L, this);
        return objA != aolu.a ? new defpackage.zpb(objA) : objA;
    }
}
