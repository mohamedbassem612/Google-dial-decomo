package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ofi {
    public final defpackage.oeu a;
    public final java.lang.String b;
    private final long c;

    public ofi(defpackage.oeu oeuVar, java.lang.String str) {
        aooh.f(str, "originatingAddress");
        this.a = oeuVar;
        this.b = str;
        this.c = 100L;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ofi) {
            defpackage.ofi ofiVar = (defpackage.ofi) obj;
            if (this.a == ofiVar.a && aooh.n(this.b, ofiVar.b)) {
                long j = ofiVar.c;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 100;
    }

    public final java.lang.String toString() {
        return "Match(resource=" + this.a + ", originatingAddress=" + this.b + ", timestampMillis=100)";
    }
}
