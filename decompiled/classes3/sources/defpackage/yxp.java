package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yxp implements defpackage.yxq {
    public final j$.time.Instant a;
    public final defpackage.yxm b;

    public yxp(j$.time.Instant instant, defpackage.yxm yxmVar) {
        aooh.f(instant, "detectInstant");
        this.a = instant;
        this.b = yxmVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.yxp) {
            defpackage.yxp yxpVar = (defpackage.yxp) obj;
            if (aooh.n(this.a, yxpVar.a) && aooh.n(this.b, yxpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Scam(detectInstant=" + this.a + ", record=" + this.b + ')';
    }
}
