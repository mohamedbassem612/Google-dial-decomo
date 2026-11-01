package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abmd implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ float a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ abmd(float f, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = f;
        this.b = obj;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid == 0) {
            return aehj.T(this.a, (java.lang.String) this.b, (cav) obj, ((java.lang.Integer) obj2).intValue());
        }
        cav cavVar = (cav) obj;
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        int i = iIntValue & 3;
        if (cavVar.H(i != 2, iIntValue & 1)) {
            pez.bT(((defpackage.qxl) this.b).c, azm.g(cmw.c, this.a), cavVar, 0);
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
