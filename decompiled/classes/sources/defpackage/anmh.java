package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anmh implements defpackage.anmi {
    public static final defpackage.anmi a = new defpackage.anmh(0);
    private final /* synthetic */ int $cid;

    public anmh(int i) {
        this.$cid = i;
    }

    @Override // defpackage.anmx
    public final java.io.InputStream a(java.io.InputStream inputStream) {
        return this.$cid != 0 ? new java.util.zip.GZIPInputStream(inputStream) : inputStream;
    }

    @Override // defpackage.anmj, defpackage.anmx
    public final java.lang.String b() {
        return this.$cid != 0 ? "gzip" : "identity";
    }
}
