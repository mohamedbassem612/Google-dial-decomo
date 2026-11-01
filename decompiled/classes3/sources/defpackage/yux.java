package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yux implements defpackage.yva {
    public final java.util.List a;

    public yux(java.util.List list) {
        aooh.f(list, "reasons");
        this.a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.yux) && aooh.n(this.a, ((defpackage.yux) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "NotReady(reasons=" + this.a + ')';
    }
}
