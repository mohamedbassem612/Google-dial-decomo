package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kpy implements defpackage.kpz {
    public final defpackage.kpk a;

    public kpy(defpackage.kpk kpkVar) {
        this.a = kpkVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kpy) && aooh.n(this.a, ((defpackage.kpy) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Failed(exception=" + this.a + ')';
    }
}
