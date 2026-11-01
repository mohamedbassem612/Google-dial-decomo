package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aecq {
    public final int a;
    public final java.lang.String b;
    public final int c;
    public final defpackage.aecp d;
    public final j$.time.Instant e;
    public final aeco f;

    public aecq(int i, java.lang.String str, int i2, defpackage.aecp aecpVar, j$.time.Instant instant, aeco aecoVar) {
        aooh.f(str, "accountName");
        aooh.f(instant, "insertionTime");
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = aecpVar;
        this.e = instant;
        this.f = aecoVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aecq) {
            defpackage.aecq aecqVar = (defpackage.aecq) obj;
            if (this.a == aecqVar.a && aooh.n(this.b, aecqVar.b) && this.c == aecqVar.c && this.d == aecqVar.d && aooh.n(this.e, aecqVar.e) && this.f == aecqVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final java.lang.String toString() {
        return "GnpExperimentEntity(databaseId=" + this.a + ", accountName=" + this.b + ", experimentId=" + this.c + ", experimentType=" + this.d + ", insertionTime=" + this.e + ", experimentSource=" + this.f + ')';
    }
}
