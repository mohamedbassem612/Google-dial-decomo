package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ums {
    public final defpackage.umy a;

    public ums(defpackage.umy umyVar) {
        this.a = umyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ums) && aooh.n(this.a, ((defpackage.ums) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "DisambiguationData(contact=" + this.a + ')';
    }
}
