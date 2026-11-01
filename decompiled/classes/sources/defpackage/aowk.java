package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aowk extends defpackage.aowl {
    public final java.lang.Throwable a;

    public aowk(java.lang.Throwable th) {
        this.a = th;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aowk) && defpackage.aooh.n(this.a, ((defpackage.aowk) obj).a);
    }

    public final int hashCode() {
        java.lang.Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.aowl
    public final java.lang.String toString() {
        return "Closed(" + this.a + ')';
    }
}
