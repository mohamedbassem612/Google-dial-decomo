package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aazo extends aazc {
    private final aazd a;
    private final java.util.Map b;
    private final long c;

    public aazo(aazd aazdVar, java.util.Map map, long j) {
        aooh.f(aazdVar, "clientId");
        aooh.f(map, "labelMixin");
        this.a = aazdVar;
        this.b = map;
        this.c = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aazo) {
            defpackage.aazo aazoVar = (defpackage.aazo) obj;
            if (aooh.n(this.a, aazoVar.a) && aooh.n(this.b, aazoVar.b) && this.c == aazoVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + anty.M(this.c);
    }
}
