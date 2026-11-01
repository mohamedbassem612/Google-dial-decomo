package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abnc {
    private final defpackage.aomy A;
    private final defpackage.aomy B;
    private final defpackage.aomy C;
    private final defpackage.aomy D;
    public final defpackage.aomy a;
    public final defpackage.aomy b;
    public final defpackage.aomy c;
    public final defpackage.aomy d;
    public final defpackage.aomy e;
    public final defpackage.aomy f;
    public final defpackage.aomy g;
    private final boolean h;
    private final defpackage.aomy i;
    private final defpackage.aomy j;
    private final defpackage.aomy k;
    private final defpackage.aomy l;
    private final defpackage.aomy m;
    private final defpackage.aomy n;
    private final defpackage.aomy o;
    private final defpackage.aomy p;
    private final defpackage.aomy q;
    private final defpackage.aomy r;
    private final defpackage.aomy s;
    private final defpackage.aomy t;
    private final defpackage.aomy u;
    private final defpackage.aomy v;
    private final defpackage.aomy w;
    private final defpackage.aomy x;
    private final defpackage.aomy y;
    private final defpackage.aomy z;

    public /* synthetic */ abnc(defpackage.aomy aomyVar, defpackage.aomy aomyVar2, int i) {
        defpackage.uoa uoaVar = (i & 2) != 0 ? new defpackage.uoa(13) : null;
        defpackage.aomy uoqVar = (i & 4) != 0 ? new defpackage.uoq(18) : aomyVar;
        defpackage.uoa uoaVar2 = (i & 8) != 0 ? new defpackage.uoa(16) : null;
        defpackage.uoq uoqVar2 = (i & 16) != 0 ? new defpackage.uoq(19) : null;
        defpackage.uoa uoaVar3 = (i & 32) != 0 ? new defpackage.uoa(17) : null;
        defpackage.uoa uoaVar4 = (i & 64) != 0 ? new defpackage.uoa(18) : null;
        defpackage.uoa uoaVar5 = (i & 128) != 0 ? new defpackage.uoa(19) : null;
        defpackage.uoq uoqVar3 = (i & 256) != 0 ? new defpackage.uoq(20) : null;
        int i2 = 1;
        defpackage.aomy abnaVar = (i & 512) != 0 ? new abna(1) : aomyVar2;
        abna abnaVar2 = new abna(0);
        defpackage.uoa uoaVar6 = new defpackage.uoa(20);
        defpackage.abnb abnbVar = new defpackage.abnb(i2);
        defpackage.abnb abnbVar2 = new defpackage.abnb(0);
        defpackage.abnb abnbVar3 = new defpackage.abnb(2);
        defpackage.abnb abnbVar4 = new defpackage.abnb(3);
        defpackage.abnb abnbVar5 = new defpackage.abnb(4);
        defpackage.abnb abnbVar6 = new defpackage.abnb(5);
        defpackage.abnb abnbVar7 = new defpackage.abnb(6);
        defpackage.uoa uoaVar7 = new defpackage.uoa(4);
        defpackage.uoa uoaVar8 = new defpackage.uoa(5);
        defpackage.uoa uoaVar9 = new defpackage.uoa(6);
        defpackage.uoa uoaVar10 = new defpackage.uoa(7);
        defpackage.uoa uoaVar11 = new defpackage.uoa(8);
        defpackage.uoa uoaVar12 = new defpackage.uoa(9);
        defpackage.uoa uoaVar13 = new defpackage.uoa(10);
        defpackage.uoa uoaVar14 = new defpackage.uoa(11);
        defpackage.uoa uoaVar15 = new defpackage.uoa(12);
        defpackage.uoa uoaVar16 = new defpackage.uoa(14);
        defpackage.uoa uoaVar17 = new defpackage.uoa(15);
        defpackage.aooh.f(uoaVar, "enableAnimatedListExitPruningFix");
        defpackage.aooh.f(uoqVar, "enableAnswerSwipeAccessibilityActions");
        defpackage.aooh.f(uoaVar2, "enableBetterPinsObFixes");
        defpackage.aooh.f(uoqVar2, "enableContactBarAnimations");
        defpackage.aooh.f(uoaVar3, "enableContactBarGroupHint");
        defpackage.aooh.f(uoaVar4, "enableContactListItemAnimations");
        defpackage.aooh.f(uoaVar5, "enableCustomA11yForRbmRichCard");
        defpackage.aooh.f(uoqVar3, "enableDialogScrollingFix");
        defpackage.aooh.f(abnaVar, "enableExpressiveMonograms");
        this.h = false;
        this.a = uoaVar;
        this.b = uoqVar;
        this.i = uoaVar2;
        this.j = uoqVar2;
        this.k = uoaVar3;
        this.c = uoaVar4;
        this.l = uoaVar5;
        this.d = uoqVar3;
        this.e = abnaVar;
        this.m = abnaVar2;
        this.n = uoaVar6;
        this.o = abnbVar;
        this.p = abnbVar2;
        this.f = abnbVar3;
        this.q = abnbVar4;
        this.r = abnbVar5;
        this.s = abnbVar6;
        this.t = abnbVar7;
        this.u = uoaVar7;
        this.v = uoaVar8;
        this.w = uoaVar9;
        this.x = uoaVar10;
        this.y = uoaVar11;
        this.z = uoaVar12;
        this.A = uoaVar13;
        this.g = uoaVar14;
        this.B = uoaVar15;
        this.C = uoaVar16;
        this.D = uoaVar17;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abnc) {
            defpackage.abnc abncVar = (defpackage.abnc) obj;
            boolean z = abncVar.h;
            if (defpackage.aooh.n(this.a, abncVar.a) && defpackage.aooh.n(this.b, abncVar.b) && defpackage.aooh.n(this.i, abncVar.i) && defpackage.aooh.n(this.j, abncVar.j) && defpackage.aooh.n(this.k, abncVar.k) && defpackage.aooh.n(this.c, abncVar.c) && defpackage.aooh.n(this.l, abncVar.l) && defpackage.aooh.n(this.d, abncVar.d) && defpackage.aooh.n(this.e, abncVar.e) && defpackage.aooh.n(this.m, abncVar.m) && defpackage.aooh.n(this.n, abncVar.n) && defpackage.aooh.n(this.o, abncVar.o) && defpackage.aooh.n(this.p, abncVar.p) && defpackage.aooh.n(this.f, abncVar.f) && defpackage.aooh.n(this.q, abncVar.q) && defpackage.aooh.n(this.r, abncVar.r) && defpackage.aooh.n(this.s, abncVar.s) && defpackage.aooh.n(this.t, abncVar.t) && defpackage.aooh.n(this.u, abncVar.u) && defpackage.aooh.n(this.v, abncVar.v) && defpackage.aooh.n(this.w, abncVar.w) && defpackage.aooh.n(this.x, abncVar.x) && defpackage.aooh.n(this.y, abncVar.y) && defpackage.aooh.n(this.z, abncVar.z) && defpackage.aooh.n(this.A, abncVar.A) && defpackage.aooh.n(this.g, abncVar.g) && defpackage.aooh.n(this.B, abncVar.B) && defpackage.aooh.n(this.C, abncVar.C) && defpackage.aooh.n(this.D, abncVar.D)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.a.hashCode() + 38347) * 31) + this.b.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.c.hashCode()) * 31) + this.l.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.f.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31) + this.u.hashCode()) * 31) + this.v.hashCode()) * 31) + this.w.hashCode()) * 31) + this.x.hashCode()) * 31) + this.y.hashCode()) * 31) + this.z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.g.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AbcFlags(defaultFlagValue=false, enableAnimatedListExitPruningFix=");
        sb.append(this.a);
        sb.append(", enableAnswerSwipeAccessibilityActions=");
        sb.append(this.b);
        sb.append(", enableBetterPinsObFixes=");
        sb.append(this.i);
        sb.append(", enableContactBarAnimations=");
        sb.append(this.j);
        sb.append(", enableContactBarGroupHint=");
        sb.append(this.k);
        sb.append(", enableContactListItemAnimations=");
        sb.append(this.c);
        sb.append(", enableCustomA11yForRbmRichCard=");
        sb.append(this.l);
        sb.append(", enableDialogScrollingFix=");
        sb.append(this.d);
        sb.append(", enableExpressiveMonograms=");
        sb.append(this.e);
        sb.append(", enableIsTalkbackRunningFix=");
        sb.append(this.m);
        sb.append(", enableLongPressForSwipeButton=");
        sb.append(this.n);
        sb.append(", enableMentionsUserEducationStackedLayout=");
        sb.append(this.o);
        sb.append(", enableMessageListScrollJankOptimizations=");
        sb.append(this.p);
        sb.append(", enableMonogramColorFix=");
        sb.append(this.f);
        sb.append(", enableMonogramLetterAlignmentFix=");
        sb.append(this.q);
        sb.append(", enableMosaicV2=");
        sb.append(this.r);
        sb.append(", enablePinCardDragA11yFix=");
        sb.append(this.s);
        sb.append(", enableRbmActionButtonRestyle=");
        sb.append(this.t);
        sb.append(", enableReactionsTraversalFix=");
        sb.append(this.u);
        sb.append(", enableRichCardMediaScalingMode=");
        sb.append(this.v);
        sb.append(", enableStatusUxUpdates=");
        sb.append(this.w);
        sb.append(", enableSuggestionV2Animations=");
        sb.append(this.x);
        sb.append(", enableSuggestionV2Dimensions=");
        sb.append(this.y);
        defpackage.aomy aomyVar = this.D;
        defpackage.aomy aomyVar2 = this.C;
        defpackage.aomy aomyVar3 = this.B;
        defpackage.aomy aomyVar4 = this.g;
        defpackage.aomy aomyVar5 = this.A;
        defpackage.aomy aomyVar6 = this.z;
        sb.append(", fixCameraModeSwitchingBug=");
        sb.append(aomyVar6);
        sb.append(", fixListItemSelectableTalkback=");
        sb.append(aomyVar5);
        sb.append(", fixMultilineMentionWrapMargin=");
        sb.append(aomyVar4);
        sb.append(", increaseLandscapeBubbleMaxWidth=");
        sb.append(aomyVar3);
        sb.append(", useMonogramV2=");
        sb.append(aomyVar2);
        sb.append(", useTextAnnotations=");
        sb.append(aomyVar);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public abnc() {
        defpackage.aomy aomyVar = null;
        this(aomyVar, aomyVar, 1073741823);
    }
}
