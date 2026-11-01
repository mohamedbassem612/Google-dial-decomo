package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anms {
    private final java.lang.String a;
    private final java.lang.Object b;

    public anms(java.lang.String str, java.lang.Object obj) {
        java.util.logging.Logger logger = defpackage.anmv.c;
        this.a = str;
        this.b = obj;
    }

    public final java.lang.Object a() {
        return b(defpackage.anmv.k());
    }

    public final java.lang.Object b(defpackage.anmv anmvVar) {
        defpackage.anqg anqgVar = anmvVar.f;
        java.lang.Object objD = anqgVar == null ? null : anqgVar.d(this, hashCode(), 0);
        return objD == null ? this.b : objD;
    }

    public final java.lang.String toString() {
        return this.a;
    }
}
