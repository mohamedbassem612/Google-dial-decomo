package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wrs implements ahth {
    public final defpackage.wgz a;

    public wrs(defpackage.wgz wgzVar) {
        aooh.f(wgzVar, "activationParams");
        this.a = wgzVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.wrs) && aooh.n(this.a, ((defpackage.wrs) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ErrorDialogPositiveButtonClickEvent(activationParams=" + this.a + ')';
    }
}
