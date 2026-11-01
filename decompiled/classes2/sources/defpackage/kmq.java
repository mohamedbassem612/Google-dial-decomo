package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kmq implements defpackage.kmw {
    public final java.util.List a;

    public kmq(java.util.List list) {
        this.a = list;
    }

    @Override // defpackage.kmw
    public final int a() {
        return -4;
    }

    @Override // defpackage.kmw
    public final long b() {
        return -4L;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kmq) && aooh.n(this.a, ((defpackage.kmq) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Filters(filters=" + this.a + ')';
    }
}
