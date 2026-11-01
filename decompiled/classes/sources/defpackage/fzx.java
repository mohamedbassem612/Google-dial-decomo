package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fzx extends defpackage.gaa {
    private final java.lang.Throwable a;

    public fzx(java.lang.Throwable th) {
        super(false);
        this.a = th;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.fzx) {
            defpackage.fzx fzxVar = (defpackage.fzx) obj;
            if (this.c == fzxVar.c && defpackage.aooh.n(this.a, fzxVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return defpackage.anty.L(this.c) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Error(endOfPaginationReached=" + this.c + ", error=" + this.a + ')';
    }
}
