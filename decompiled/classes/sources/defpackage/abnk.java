package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abnk {
    public final defpackage.abni a;
    public final defpackage.abnj b;
    private final defpackage.ajl c;
    private final defpackage.ajl d;
    private final defpackage.ajl e;
    private final defpackage.ajl f;
    private final defpackage.ajr g;
    private final defpackage.aonj h;
    private final defpackage.ajr i;
    private final defpackage.ajl j;
    private final defpackage.ajl k;
    private final defpackage.ajl l;
    private final defpackage.ajl m;
    private final defpackage.ajl n;
    private final defpackage.ajg o;
    private final defpackage.ajg p;
    private final defpackage.agf q;
    private final defpackage.agg r;
    private final defpackage.ajg s;

    public abnk(defpackage.ajl ajlVar, defpackage.ajl ajlVar2, defpackage.ajl ajlVar3, defpackage.ajl ajlVar4, defpackage.ajr ajrVar, defpackage.aonj aonjVar, defpackage.ajr ajrVar2, defpackage.ajl ajlVar5, defpackage.ajl ajlVar6, defpackage.ajl ajlVar7, defpackage.ajl ajlVar8, defpackage.ajl ajlVar9, defpackage.ajg ajgVar, defpackage.ajg ajgVar2, defpackage.agf agfVar, defpackage.agg aggVar, defpackage.ajg ajgVar3, defpackage.abni abniVar, defpackage.abnj abnjVar) {
        if (agfVar == null) {
            defpackage.aooh.i("animatedLinkPreviewEnterTransitionSpec");
        }
        if (aggVar == null) {
            defpackage.aooh.i("animatedLinkPreviewExitTransitionSpec");
        }
        this.c = ajlVar;
        this.d = ajlVar2;
        this.e = ajlVar3;
        this.f = ajlVar4;
        this.g = ajrVar;
        this.h = aonjVar;
        this.i = ajrVar2;
        this.j = ajlVar5;
        this.k = ajlVar6;
        this.l = ajlVar7;
        this.m = ajlVar8;
        this.n = ajlVar9;
        this.o = ajgVar;
        this.p = ajgVar2;
        this.q = agfVar;
        this.r = aggVar;
        this.s = ajgVar3;
        this.a = abniVar;
        this.b = abnjVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abnk) {
            defpackage.abnk abnkVar = (defpackage.abnk) obj;
            if (defpackage.aooh.n(this.c, abnkVar.c) && defpackage.aooh.n(this.d, abnkVar.d) && defpackage.aooh.n(this.e, abnkVar.e) && defpackage.aooh.n(this.f, abnkVar.f) && defpackage.aooh.n(this.g, abnkVar.g) && defpackage.aooh.n(this.h, abnkVar.h) && defpackage.aooh.n(this.i, abnkVar.i) && defpackage.aooh.n(this.j, abnkVar.j) && defpackage.aooh.n(this.k, abnkVar.k) && defpackage.aooh.n(this.l, abnkVar.l) && defpackage.aooh.n(this.m, abnkVar.m) && defpackage.aooh.n(this.n, abnkVar.n) && defpackage.aooh.n(this.o, abnkVar.o) && defpackage.aooh.n(this.p, abnkVar.p) && defpackage.aooh.n(this.q, abnkVar.q) && defpackage.aooh.n(this.r, abnkVar.r) && defpackage.aooh.n(this.s, abnkVar.s) && defpackage.aooh.n(this.a, abnkVar.a) && defpackage.aooh.n(this.b, abnkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31) - 566205836) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "AbcMotionScheme(composeAiIconScaleInSpec=" + this.c + ", composeAiIconScaleOutSpec=" + this.d + ", textResultsBarSlideInAnimationSpec=" + this.e + ", reactionsBarFadeOutAnimationSpec=" + this.f + ", timerDotAnimationSpec=" + this.g + ", recordingDotAnimationSpec=" + this.h + ", recordingDotIndicatorAnimationSpec=" + this.i + ", swipeUpToLockPillZIndexAnimationSpec=" + this.j + ", topAppBarFadeInAnimationSpec=" + this.k + ", topAppBarFadeOutAnimationSpec=" + this.l + ", conversationBackgroundFadeInAnimationSpec=" + this.m + ", conversationBackgroundFadeOutAnimationSpec=" + this.n + ", topAppBarHighlightAnimationSpec=" + this.o + ", aiButtonBackgroundAnimationSpec=" + this.p + ", animatedLinkPreviewEnterTransitionSpec=" + this.q + ", animatedLinkPreviewExitTransitionSpec=" + this.r + ", swipeButtonSnapAnimationSpec=" + this.s + ", duration=" + this.a + ", easing=" + this.b + ')';
    }
}
