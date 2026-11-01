package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agry implements java.io.FilenameFilter {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ agry(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(java.io.File file, java.lang.String str) {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        return i != 0 ? defpackage.agwm.c(str, ".db", ((defpackage.agrx) obj).b) : defpackage.agwm.c(str, ":Singleton.db", ((defpackage.agsa) obj).c);
    }
}
