package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abep implements defpackage.abeq {
    public final java.lang.String a;
    public final boolean b;
    private final int c;
    private final int d;
    private final java.lang.String e;
    private final aonj f;

    public abep(java.lang.String str, int i, int i2, java.lang.String str2, aonj aonjVar) {
        aooh.f(str, "url");
        this.a = str;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.b = true;
        this.f = aonjVar;
    }

    @Override // defpackage.abeq
    public final int a() {
        return this.d;
    }

    @Override // defpackage.abeq
    public final int b() {
        return this.c;
    }

    @Override // defpackage.abeq
    public final /* synthetic */ defpackage.abeq c(int i, int i2) {
        java.lang.String str = this.a;
        aooh.f(str, "url");
        return new defpackage.abep(str, i, i2, this.e, this.f);
    }

    @Override // defpackage.abeq
    public final java.lang.String d() {
        return this.e;
    }

    @Override // defpackage.abeq
    public final aonj e() {
        return this.f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abep) {
            defpackage.abep abepVar = (defpackage.abep) obj;
            if (aooh.n(this.a, abepVar.a) && this.c == abepVar.c && this.d == abepVar.d && aooh.n(this.e, abepVar.e)) {
                boolean z = abepVar.b;
                if (aooh.n(this.f, abepVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.e;
        int iHashCode2 = (((((((iHashCode + this.c) * 31) + this.d) * 31) + (str == null ? 0 : str.hashCode())) * 31) + anty.L(true)) * 31;
        aonj aonjVar = this.f;
        return iHashCode2 + (aonjVar != null ? aonjVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Url(url=" + this.a + ", start=" + this.c + ", end=" + this.d + ", onClickLabel=" + this.e + ", usePrimaryColor=true, onClick=" + this.f + ')';
    }
}
