package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bum implements defpackage.arl {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public bum(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.arl
    public final void a(float f) {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i == 0) {
            ((defpackage.bun) obj).h(f, null);
        } else {
            ((defpackage.aqk) obj).a.a(java.lang.Float.valueOf(f));
        }
    }
}
