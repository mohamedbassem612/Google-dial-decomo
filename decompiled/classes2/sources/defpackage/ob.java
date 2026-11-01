package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ob implements defpackage.eol {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public ob(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.eol
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.of) this.a).d(false);
            return;
        }
        java.lang.Object obj = this.a;
        if (i != 1) {
            ((fya) obj).g(false);
        } else {
            ((defpackage.of) obj).d(false);
        }
    }
}
