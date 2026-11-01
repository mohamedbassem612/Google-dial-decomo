package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hlr implements defpackage.hls {
    public final java.lang.String a;

    public hlr(java.lang.String str) {
        aooh.f(str, "uuid");
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.hlr) && aooh.n(this.a, ((defpackage.hlr) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Uuid(uuid=" + this.a + ')';
    }
}
