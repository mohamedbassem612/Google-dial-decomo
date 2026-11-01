package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lyw implements ahth {
    public final long a;
    private final java.util.List b;
    private final java.util.List c;

    public lyw(long j, java.util.List list, java.util.List list2) {
        aooh.f(list, "callScreenTranscriptIds");
        aooh.f(list2, "rttTranscriptIds");
        this.a = j;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lyw) {
            defpackage.lyw lywVar = (defpackage.lyw) obj;
            if (this.a == lywVar.a && aooh.n(this.b, lywVar.b) && aooh.n(this.c, lywVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((anty.M(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "DeleteCallLogItemConfirmedEvent(deletedRowId=" + this.a + ", callScreenTranscriptIds=" + this.b + ", rttTranscriptIds=" + this.c + ')';
    }
}
