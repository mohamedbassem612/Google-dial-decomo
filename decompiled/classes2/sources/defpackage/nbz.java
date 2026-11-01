package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nbz {
    public final j$.time.Instant a;
    public final aenj b;
    public final aosy c;

    public nbz(j$.time.Instant instant, aenj aenjVar, aosy aosyVar) {
        aooh.f(instant, "time");
        aooh.f(aenjVar, "taskName");
        aooh.f(aosyVar, "task");
        this.a = instant;
        this.b = aenjVar;
        this.c = aosyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nbz) {
            defpackage.nbz nbzVar = (defpackage.nbz) obj;
            if (aooh.n(this.a, nbzVar.a) && aooh.n(this.b, nbzVar.b) && aooh.n(this.c, nbzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "SequencerData(time=" + this.a + ", taskName=" + this.b + ", task=" + this.c + ')';
    }
}
