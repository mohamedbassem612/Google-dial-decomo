package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aoka implements aoql {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public aoka(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.CharSequence, java.lang.Object] */
    public final java.util.Iterator a() {
        int i = this.$cid;
        if (i == 0) {
            return aooc.H((java.lang.Object[]) this.a);
        }
        if (i == 1) {
            return new dzf(dzl.b((android.view.ViewGroup) this.a).a(), bbb.d);
        }
        if (i == 2) {
            return this.a.iterator();
        }
        if (i != 3) {
            return i != 4 ? new defpackage.aoqy(this.a) : this.a;
        }
        return aooc.e((aonn) this.a);
    }
}
