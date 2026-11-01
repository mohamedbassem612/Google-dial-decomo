package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sfn {
    public final j$.time.Instant a;
    public final snl b;

    public sfn(snl snlVar, j$.time.Instant instant) {
        aooh.f(snlVar, "selfMyCallingCardData");
        aooh.f(instant, "lastUpdateTimestamp");
        this.b = snlVar;
        this.a = instant;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sfn) {
            defpackage.sfn sfnVar = (defpackage.sfn) obj;
            if (aooh.n(this.b, sfnVar.b) && aooh.n(this.a, sfnVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "CacheEntry(selfMyCallingCardData=" + this.b + ", lastUpdateTimestamp=" + this.a + ')';
    }
}
