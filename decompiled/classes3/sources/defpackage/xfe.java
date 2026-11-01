package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xfe implements defpackage.xhf {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ xfe(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.xhf
    public final java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.xfp) this.a).performSetResult(obj);
        }
        if (i != 1) {
            return this.a;
        }
        return defpackage.xfp.resultDecoder$lambda$0((defpackage.xfp) this.a, (androidx.activity.result.ActivityResult) obj);
    }
}
