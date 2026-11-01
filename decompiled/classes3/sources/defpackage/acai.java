package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acai implements aauh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ acai(java.lang.Object obj, long j, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = j;
    }

    public final void a(java.lang.Exception exc) {
        if (this.$cid != 0) {
            ((java.util.concurrent.atomic.AtomicLong) ((aogc) this.b).b).set(this.a);
        } else {
            ((acak) this.b).b(this.a, true);
            hgb.b(acak.a.d(), "Failed to add notification impression to cross-app capping, API might not be available.", exc);
        }
    }
}
