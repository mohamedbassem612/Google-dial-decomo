package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ljl implements adop {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ljl(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final void a(java.lang.String str) {
        int i = this.$cid;
        if (i == 0) {
            ((ljn) this.a).d(adoa.b, str);
            return;
        }
        java.lang.Object obj = this.a;
        if (i != 1) {
            ((adnr) obj).d(adoa.b, str);
        } else {
            ((ljn) obj).d(adoa.a, str);
        }
    }
}
