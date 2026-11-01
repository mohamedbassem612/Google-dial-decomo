package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tgl extends snl {
    public final java.util.List a;

    public tgl(java.util.List list) {
        aooh.f(list, "items");
        this.a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.tgl) && aooh.n(this.a, ((defpackage.tgl) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Success(items=" + this.a + ')';
    }
}
