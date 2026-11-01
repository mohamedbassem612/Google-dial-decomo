package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nmy implements defpackage.nmz {
    public final java.lang.String a;
    public final boolean b;

    public nmy(java.lang.String str, boolean z) {
        aooh.f(str, "summary");
        this.a = str;
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nmy) {
            defpackage.nmy nmyVar = (defpackage.nmy) obj;
            if (aooh.n(this.a, nmyVar.a) && this.b == nmyVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + anty.L(this.b);
    }

    public final java.lang.String toString() {
        return "TranscriptionSummary(summary=" + this.a + ", isLowConfidence=" + this.b + ')';
    }
}
