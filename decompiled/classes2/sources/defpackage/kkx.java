package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kkx {
    public final defpackage.kkw a;
    public final defpackage.kkw b;
    public final defpackage.kkw c;
    public final defpackage.kkw d;
    public final defpackage.kkw e;
    public final defpackage.kkw f;

    public kkx(defpackage.kkw kkwVar, defpackage.kkw kkwVar2, defpackage.kkw kkwVar3, defpackage.kkw kkwVar4, defpackage.kkw kkwVar5, defpackage.kkw kkwVar6) {
        this.a = kkwVar;
        this.b = kkwVar2;
        this.c = kkwVar3;
        this.d = kkwVar4;
        this.e = kkwVar5;
        this.f = kkwVar6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kkx) {
            defpackage.kkx kkxVar = (defpackage.kkx) obj;
            if (aooh.n(this.a, kkxVar.a) && aooh.n(this.b, kkxVar.b) && aooh.n(this.c, kkxVar.c) && aooh.n(this.d, kkxVar.d) && aooh.n(this.e, kkxVar.e) && aooh.n(this.f, kkxVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.kkw kkwVar = this.b;
        int iHashCode2 = (iHashCode + (kkwVar == null ? 0 : kkwVar.hashCode())) * 31;
        defpackage.kkw kkwVar2 = this.c;
        return ((((((iHashCode2 + (kkwVar2 != null ? kkwVar2.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final java.lang.String toString() {
        return "AnimatedItems(secondaryText=" + this.a + ", snippet=" + this.b + ", phoneAccount=" + this.c + ", chipsContainer=" + this.d + ", dropdownMenuContainer=" + this.e + ", actionButtonsContainer=" + this.f + ')';
    }
}
