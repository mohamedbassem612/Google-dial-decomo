package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kjl {
    public final java.util.List a;
    public final int b;

    public kjl(java.util.List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kjl) {
            defpackage.kjl kjlVar = (defpackage.kjl) obj;
            if (aooh.n(this.a, kjlVar.a) && this.b == kjlVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "DetailedCallHistoryUiModel(detailedCallHistoryEntries=" + this.a + ", callType=" + this.b + ')';
    }
}
