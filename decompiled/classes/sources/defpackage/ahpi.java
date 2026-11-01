package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ahpi implements defpackage.ahpm {
    private final defpackage.ahoq a;

    public ahpi(defpackage.ahoq ahoqVar) {
        this.a = ahoqVar;
    }

    @Override // defpackage.ahpm, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }
}
