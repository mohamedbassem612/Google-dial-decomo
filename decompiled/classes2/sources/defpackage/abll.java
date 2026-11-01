package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abll implements abmb, abmh {
    public final abia a;

    public abll(abia abiaVar) {
        this.a = abiaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.abll) && aooh.n(this.a, ((defpackage.abll) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Banner(banner=" + this.a + ')';
    }
}
