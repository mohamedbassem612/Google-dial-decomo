package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kav {
    public final boolean a;
    public final defpackage.lpv b;
    public final android.app.Activity c;

    public kav(boolean z, defpackage.lpv lpvVar, android.app.Activity activity) {
        if (lpvVar == null) {
            defpackage.aooh.i("screenSize");
        }
        this.a = z;
        this.b = lpvVar;
        this.c = activity;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kav) {
            defpackage.kav kavVar = (defpackage.kav) obj;
            if (this.a == kavVar.a && this.b == kavVar.b && defpackage.aooh.n(this.c, kavVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((defpackage.anty.L(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "CallLogScreenLoggingContext(isVisible=" + this.a + ", screenSize=" + this.b + ", activity=" + this.c + ')';
    }
}
