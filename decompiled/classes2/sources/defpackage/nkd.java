package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nkd implements defpackage.nke {
    public final java.lang.String a;
    private final boolean b = false;

    public nkd(java.lang.String str) {
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nkd) {
            defpackage.nkd nkdVar = (defpackage.nkd) obj;
            if (aooh.n(this.a, nkdVar.a)) {
                boolean z = nkdVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1237;
    }

    public final java.lang.String toString() {
        return "TranscriptionSummaryUpdateEvent(summaryText=" + this.a + ", isLowConfidence=false)";
    }
}
