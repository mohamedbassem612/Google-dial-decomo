package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adjw implements adfq {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ adjw(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public final void a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            int i2 = adjz.i;
            ((tvn) obj).aa((java.lang.String) this.a, (java.lang.Throwable) this.b);
        } else if (i != 1) {
            ((adlc) obj).f(((com.google.android.libraries.micore.superpacks.common.PackManifest) this.a).p(), ((java.util.concurrent.atomic.AtomicBoolean) ((aezs) this.b).b).get());
        } else {
            ((tvn) obj).aa((java.lang.String) this.a, (java.lang.Throwable) this.b);
        }
    }
}
