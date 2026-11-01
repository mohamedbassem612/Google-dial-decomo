package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abbh extends aazc {
    public final int a;
    private final long b;

    public abbh(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abbh) {
            defpackage.abbh abbhVar = (defpackage.abbh) obj;
            if (this.a == abbhVar.a && this.b == abbhVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + anty.M(this.b);
    }
}
