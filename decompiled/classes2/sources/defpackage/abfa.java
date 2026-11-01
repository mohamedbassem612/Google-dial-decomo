package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abfa {
    public final abeq a;
    public final cpn b;
    public final boolean c;
    public final boolean d;

    public abfa(abeq abeqVar, cpn cpnVar, boolean z, boolean z2) {
        aooh.f(abeqVar, "annotation");
        this.a = abeqVar;
        this.b = cpnVar;
        this.c = z;
        this.d = z2;
    }

    public static /* synthetic */ defpackage.abfa a(defpackage.abfa abfaVar, cpn cpnVar, int i) {
        abeq abeqVar = (i & 1) != 0 ? abfaVar.a : null;
        if ((i & 2) != 0) {
            cpnVar = abfaVar.b;
        }
        boolean z = (i & 4) != 0 ? abfaVar.c : false;
        boolean z2 = (i & 8) != 0 ? abfaVar.d : false;
        aooh.f(abeqVar, "annotation");
        return new defpackage.abfa(abeqVar, cpnVar, z, z2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abfa) {
            defpackage.abfa abfaVar = (defpackage.abfa) obj;
            if (aooh.n(this.a, abfaVar.a) && aooh.n(this.b, abfaVar.b) && this.c == abfaVar.c && this.d == abfaVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + anty.L(this.c)) * 31) + anty.L(this.d);
    }

    public final java.lang.String toString() {
        return "MentionBoundingBox(annotation=" + this.a + ", rect=" + this.b + ", shouldBeRoundedOnTheLeft=" + this.c + ", shouldBeRoundedOnTheRight=" + this.d + ')';
    }
}
