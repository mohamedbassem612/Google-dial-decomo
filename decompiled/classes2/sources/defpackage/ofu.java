package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ofu {
    public final long a;
    public final java.lang.String b;

    public ofu(long j, java.lang.String str) {
        aooh.f(str, "e164PhoneNumber");
        this.a = j;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ofu) {
            defpackage.ofu ofuVar = (defpackage.ofu) obj;
            if (this.a == ofuVar.a && aooh.n(this.b, ofuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.M(this.a) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "LastCallEntry(creationTimeInMills=" + this.a + ", e164PhoneNumber=" + this.b + ')';
    }
}
