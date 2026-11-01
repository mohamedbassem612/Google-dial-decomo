package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wrr implements ahth {
    public final defpackage.wgz a;

    public wrr(defpackage.wgz wgzVar) {
        aooh.f(wgzVar, "activationParams");
        this.a = wgzVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.wrr) && aooh.n(this.a, ((defpackage.wrr) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ErrorDialogNegativeButtonClickEvent(activationParams=" + this.a + ')';
    }
}
