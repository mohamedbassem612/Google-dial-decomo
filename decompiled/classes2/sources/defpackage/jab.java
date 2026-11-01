package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jab extends defpackage.hhe {
    public final java.lang.String a;
    public final java.lang.String b;
    public final long c;
    public final boolean d;
    public final defpackage.ixc e;
    public final aomy f;
    public final aomy g;
    public final aomy h;
    public final defpackage.izp i;
    public final boolean j;
    private final java.lang.String k;

    public jab(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, boolean z, defpackage.ixc ixcVar, aomy aomyVar, aomy aomyVar2, aomy aomyVar3, defpackage.izp izpVar, boolean z2) {
        aooh.f(str, "id");
        aooh.f(str2, "displayName");
        aooh.f(str3, "localAudioUri");
        aooh.f(aomyVar, "onSetAsDefault");
        this.k = str;
        this.a = str2;
        this.b = str3;
        this.c = j;
        this.d = z;
        this.e = ixcVar;
        this.f = aomyVar;
        this.g = aomyVar2;
        this.h = aomyVar3;
        this.i = izpVar;
        this.j = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.jab) {
            defpackage.jab jabVar = (defpackage.jab) obj;
            if (aooh.n(this.k, jabVar.k) && aooh.n(this.a, jabVar.a) && aooh.n(this.b, jabVar.b) && this.c == jabVar.c && this.d == jabVar.d && this.e == jabVar.e && aooh.n(this.f, jabVar.f) && aooh.n(this.g, jabVar.g) && aooh.n(this.h, jabVar.h) && aooh.n(this.i, jabVar.i) && this.j == jabVar.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.k.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
        defpackage.ixc ixcVar = this.e;
        return (((((((((((((((iHashCode * 31) + anty.M(this.c)) * 31) + anty.L(this.d)) * 31) + ixcVar.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + anty.L(this.j);
    }

    @Override // defpackage.hhe
    public final java.lang.String r() {
        return this.k;
    }

    public final java.lang.String toString() {
        return "GreetingUiRow(id=" + this.k + ", displayName=" + this.a + ", localAudioUri=" + this.b + ", durationSeconds=" + this.c + ", isSelected=" + this.d + ", type=" + this.e + ", onSetAsDefault=" + this.f + ", onRenameAttempt=" + this.g + ", onDeleteAttempt=" + this.h + ", audioPlayerUiState=" + this.i + ", animate=" + this.j + ')';
    }
}
