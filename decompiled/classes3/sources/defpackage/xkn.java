package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xkn implements java.lang.AutoCloseable {
    private final /* synthetic */ int $cid;

    public xkn(java.lang.String str, int i, byte[] bArr) {
        this.$cid = i;
        android.os.Trace.beginSection(str.length() > 127 ? java.lang.String.valueOf(str.substring(0, 124)).concat("...") : str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.$cid;
        if (i == 0) {
            java.util.Set set = defpackage.xkp.a;
            return;
        }
        if (i == 1) {
            java.util.Set set2 = defpackage.xkp.a;
        } else if (i != 2) {
            android.os.Trace.endSection();
        } else {
            android.os.Trace.endSection();
        }
    }

    public xkn(java.lang.String str, int i) {
        this.$cid = i;
        android.os.Trace.beginSection(str);
    }
}
