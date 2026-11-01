package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahno implements defpackage.ahpm {
    private final /* synthetic */ int $cid;

    @Override // defpackage.ahpm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                defpackage.ahns.l();
            }
        } else {
            defpackage.ahns.e.add(defpackage.ahns.g);
            defpackage.afec.a().post(defpackage.ahns.h);
        }
    }
}
