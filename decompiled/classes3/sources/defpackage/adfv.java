package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adfv implements adfq {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ adfv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final void a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((tvn) obj).V((java.lang.Throwable) this.a);
        } else if (i != 1) {
            int i2 = adjs.b;
            ((tvn) obj).V((java.lang.Throwable) this.a);
        } else {
            ((java.util.HashSet) this.a).add(((com.google.android.libraries.micore.superpacks.base.VersionedName) obj).b());
        }
    }
}
