package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sfl {
    public final java.lang.String a;
    public final int b;

    public sfl(java.lang.String str, int i) {
        aooh.f(str, "snackbarText");
        this.a = str;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sfl) {
            defpackage.sfl sflVar = (defpackage.sfl) obj;
            if (aooh.n(this.a, sflVar.a) && this.b == sflVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "SnackbarModel(snackbarText=" + this.a + ", duration=" + this.b + ')';
    }
}
