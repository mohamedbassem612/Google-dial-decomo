package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abgx {
    public final defpackage.abja a;
    public final defpackage.abja b;
    public final java.lang.String c;
    public final aomy d;
    public final java.lang.String e;
    public final aomy f;
    public final aonj g;
    public final boolean h;
    public final boolean i;
    public final aonn j;
    public final aonj k;
    public final boolean l;
    private final java.lang.String m;
    private final boolean n;

    public abgx(defpackage.abja abjaVar, defpackage.abja abjaVar2, java.lang.String str, aomy aomyVar, java.lang.String str2, aomy aomyVar2, aonj aonjVar, boolean z, boolean z2, aonn aonnVar, aonj aonjVar2, boolean z3) {
        aooh.f(str, "answerText");
        aooh.f(aomyVar, "onAnswer");
        aooh.f(str2, "declineText");
        aooh.f(aomyVar2, "onDecline");
        aooh.f(aonjVar, "onProgress");
        aooh.f(aonjVar2, "onSwipeMetric");
        this.a = abjaVar;
        this.b = abjaVar2;
        this.m = null;
        this.c = str;
        this.d = aomyVar;
        this.e = str2;
        this.f = aomyVar2;
        this.g = aonjVar;
        this.n = true;
        this.h = z;
        this.i = z2;
        this.j = aonnVar;
        this.k = aonjVar2;
        this.l = z3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abgx) {
            defpackage.abgx abgxVar = (defpackage.abgx) obj;
            if (this.a == abgxVar.a && this.b == abgxVar.b) {
                java.lang.String str = abgxVar.m;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && aooh.n(this.c, abgxVar.c) && aooh.n(this.d, abgxVar.d) && aooh.n(this.e, abgxVar.e) && aooh.n(this.f, abgxVar.f) && aooh.n(this.g, abgxVar.g)) {
                    boolean z = abgxVar.n;
                    if (this.h == abgxVar.h && this.i == abgxVar.i && aooh.n(this.j, abgxVar.j) && aooh.n(this.k, abgxVar.k) && this.l == abgxVar.l) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
        aonn aonnVar = this.j;
        boolean z = this.i;
        return (((((((((((iHashCode * 31) + anty.L(true)) * 31) + anty.L(this.h)) * 31) + anty.L(z)) * 31) + aonnVar.hashCode()) * 31) + this.k.hashCode()) * 31) + anty.L(this.l);
    }

    public final java.lang.String toString() {
        return "AnswerMethodUiData(answerIcon=" + this.a + ", declineIcon=" + this.b + ", puckContentDescription=null, answerText=" + this.c + ", onAnswer=" + this.d + ", declineText=" + this.e + ", onDecline=" + this.f + ", onProgress=" + this.g + ", animateOpen=true, animateRotation=" + this.h + ", useTapOnly=" + this.i + ", onTouchDownOutsideOfPuck=" + this.j + ", onSwipeMetric=" + this.k + ", showOnDarkBackground=" + this.l + ')';
    }
}
