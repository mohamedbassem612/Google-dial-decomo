package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wsh implements ahth {
    public final defpackage.wgz a;

    public wsh(defpackage.wgz wgzVar) {
        aooh.f(wgzVar, "activationParams");
        this.a = wgzVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.wsh) && aooh.n(this.a, ((defpackage.wsh) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "XatuChipClickEvent(activationParams=" + this.a + ')';
    }
}
