package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kkr implements tgy {
    public final java.lang.String a;
    public final dji b;
    public final dji c;
    public final boolean d;
    public final boolean e;
    public final abvz f;
    public final java.lang.String g;
    public final tej h;
    private final long i;
    private final java.lang.String j;

    public kkr(long j, java.lang.String str, dji djiVar, dji djiVar2, boolean z, boolean z2, abvz abvzVar, java.lang.String str2, tej tejVar) {
        aooh.f(str, "number");
        aooh.f(djiVar, "title");
        aooh.f(djiVar2, "subtitle");
        aooh.f(abvzVar, "calledId");
        aooh.f(tejVar, "searchContext");
        this.i = j;
        this.a = str;
        this.b = djiVar;
        this.c = djiVar2;
        this.d = z;
        this.e = z2;
        this.f = abvzVar;
        this.g = str2;
        this.h = tejVar;
        this.j = snl.at(this, j);
    }

    public final java.lang.String a() {
        return this.j;
    }

    public final /* synthetic */ boolean b() {
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kkr) {
            defpackage.kkr kkrVar = (defpackage.kkr) obj;
            if (this.i == kkrVar.i && aooh.n(this.a, kkrVar.a) && aooh.n(this.b, kkrVar.b) && aooh.n(this.c, kkrVar.c) && this.d == kkrVar.d && this.e == kkrVar.e && aooh.n(this.f, kkrVar.f) && aooh.n(this.g, kkrVar.g) && aooh.n(this.h, kkrVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = (((((((((((anty.M(this.i) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + anty.L(this.d)) * 31) + anty.L(this.e)) * 31) + this.f.hashCode();
        java.lang.String str = this.g;
        return (((iM * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.h.hashCode();
    }

    public final java.lang.String toString() {
        return "CallLogSearchUiModel(id=" + this.i + ", number=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", showWifiIcons=" + this.d + ", isRttVisible=" + this.e + ", calledId=" + this.f + ", photoUri=" + this.g + ", searchContext=" + this.h + ')';
    }
}
