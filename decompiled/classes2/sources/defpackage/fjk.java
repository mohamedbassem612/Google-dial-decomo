package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fjk implements defpackage.fjg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ fjk(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.fjg
    public final void a(float f) {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ((defpackage.fka) obj).k(f);
        } else {
            ((defpackage.fjo) obj).k.k(f);
            ((defpackage.fei) obj).aD();
        }
    }
}
