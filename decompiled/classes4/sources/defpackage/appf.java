package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class appf implements apqb {
    public final apqb b;

    public appf(apqb apqbVar) {
        aooh.f(apqbVar, "delegate");
        this.b = apqbVar;
    }

    public void close() {
        this.b.close();
    }

    public final apqf fP() {
        return this.b.fP();
    }

    public void fQ(apoy apoyVar, long j) {
        this.b.fQ(apoyVar, j);
    }

    public void flush() {
        this.b.flush();
    }

    public final java.lang.String toString() {
        return getClass().getSimpleName() + '(' + this.b + ')';
    }
}
