package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xgh implements defpackage.xpa {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ xgh(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xpa] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, xpa] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, xpa] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, xpa] */
    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        int i = this.$cid;
        if (i == 0) {
            return defpackage.xhy.o(this.a);
        }
        if (i == 1) {
            return defpackage.xhy.o(this.a);
        }
        if (i == 2) {
            return defpackage.xhy.o(this.a);
        }
        ?? r2 = this.a;
        if (i != 3) {
            return i != 4 ? (android.os.PersistableBundle) r2 : defpackage.xhy.o(r2);
        }
        return defpackage.xhy.o(r2);
    }
}
