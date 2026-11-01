package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zto extends aomd {
    public /* synthetic */ java.lang.Object a;
    public int b;
    final /* synthetic */ defpackage.uzx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zto(defpackage.uzx uzxVar, aoln aolnVar) {
        super(aolnVar);
        this.c = uzxVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        java.lang.Object objR = this.c.R(null, null, this);
        return objR != aolu.a ? new aoiw(objR) : objR;
    }
}
