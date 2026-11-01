package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fef implements defpackage.eui {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ fef(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [eui, java.lang.Object] */
    @Override // defpackage.eui
    public final void a() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ((defpackage.fdr) obj).c.b();
            this.b.a();
            return;
        }
        defpackage.fei feiVar = (defpackage.fei) obj;
        defpackage.ewz ewzVar = (defpackage.ewz) obj;
        feiVar.s.set(ewzVar.S((defpackage.hiz) this.b, feiVar.r, 0));
    }
}
