package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahrx implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ahrx(java.lang.Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [erg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [erg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [erg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [erg, java.lang.Object] */
    public final java.lang.Object a() {
        int i = this.$cid;
        if (i == 0) {
            this.b.n(this.a);
            return aojh.a;
        }
        if (i == 1) {
            return java.lang.Integer.valueOf(((bkl) this.b).f.e(this.a));
        }
        if (i == 2) {
            this.b.s(this.a);
            return aojh.a;
        }
        if (i == 3) {
            this.b.a(this.a);
            return aojh.a;
        }
        if (i == 4) {
            this.b.o(this.a);
            return aojh.a;
        }
        java.lang.Object obj = this.b;
        int i2 = this.a;
        synchronized (obj) {
            ((apms) obj).w.remove(java.lang.Integer.valueOf(i2));
        }
        return aojh.a;
    }
}
