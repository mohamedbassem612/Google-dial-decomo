package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kpc {
    public final java.lang.String a;
    public final defpackage.kqy b;
    private final int c;
    private final int d;
    private final defpackage.kov e;
    private final int f;

    public kpc(java.lang.String str, int i, defpackage.kqy kqyVar, int i2, int i3, defpackage.kov kovVar) {
        aooh.f(str, "summaryText");
        aooh.f(kovVar, "fermatDuplexLogs");
        this.a = str;
        this.f = i;
        this.b = kqyVar;
        this.c = i2;
        this.d = i3;
        this.e = kovVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kpc) {
            defpackage.kpc kpcVar = (defpackage.kpc) obj;
            if (aooh.n(this.a, kpcVar.a) && this.f == kpcVar.f && aooh.n(this.b, kpcVar.b) && this.c == kpcVar.c && this.d == kpcVar.d && aooh.n(this.e, kpcVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.kqy kqyVar = this.b;
        return ((((((((iHashCode + this.f) * 31) + (kqyVar == null ? 0 : kqyVar.hashCode())) * 31) + this.c) * 31) + this.d) * 31) + this.e.hashCode();
    }

    public final java.lang.String toString() {
        return "Summary(summaryText=" + this.a + ", asrConfidence=" + ((java.lang.Object) java.lang.Integer.toString(this.f - 1)) + ", callActions=" + this.b + ", summaryTokenCount=" + this.c + ", transcriptionTokenCount=" + this.d + ", fermatDuplexLogs=" + this.e + ')';
    }
}
