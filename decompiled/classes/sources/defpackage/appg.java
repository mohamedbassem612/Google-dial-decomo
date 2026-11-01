package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class appg implements defpackage.apqd {
    public final defpackage.apqd b;

    public appg(defpackage.apqd apqdVar) {
        if (apqdVar == null) {
            defpackage.aooh.i("delegate");
        }
        this.b = apqdVar;
    }

    @Override // defpackage.apqd
    public long b(defpackage.apoy apoyVar, long j) {
        throw null;
    }

    @Override // defpackage.apqd, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    @Override // defpackage.apqd
    public final defpackage.apqf fP() {
        return this.b.fP();
    }

    public final java.lang.String toString() {
        return getClass().getSimpleName() + '(' + this.b + ')';
    }
}
