package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class baa {
    public static final java.util.WeakHashMap a = new java.util.WeakHashMap();
    public final defpackage.avv b;
    public final defpackage.avv c;
    public final defpackage.avv d;
    public final defpackage.avv e;
    public final defpackage.avv f;
    public final defpackage.avv g;
    public final defpackage.avv h;
    public final defpackage.avv i;
    public final defpackage.azw j;
    public final azz k;
    public final azz l;
    public final azz m;
    public final boolean n;
    private final defpackage.avv o;
    private final ccp p;
    private final defpackage.azw q;
    private final defpackage.azw r;
    private final defpackage.azw s;
    private final defpackage.azw t;
    private final defpackage.azw u;
    private final defpackage.azw v;
    private final defpackage.azw w;
    private int x;
    private final defpackage.aya y;

    public baa(android.view.View view) {
        defpackage.avv avvVar = new defpackage.avv(4, "captionBar");
        this.b = avvVar;
        defpackage.avv avvVar2 = new defpackage.avv(128, "displayCutout");
        this.c = avvVar2;
        defpackage.avv avvVar3 = new defpackage.avv(8, "ime");
        this.d = avvVar3;
        defpackage.avv avvVar4 = new defpackage.avv(32, "mandatorySystemGestures");
        this.e = avvVar4;
        defpackage.avv avvVar5 = new defpackage.avv(2, "navigationBars");
        this.f = avvVar5;
        defpackage.avv avvVar6 = new defpackage.avv(1, "statusBars");
        this.g = avvVar6;
        defpackage.avv avvVar7 = new defpackage.avv(519, "systemBars");
        this.h = avvVar7;
        defpackage.avv avvVar8 = new defpackage.avv(16, "systemGestures");
        this.i = avvVar8;
        defpackage.avv avvVar9 = new defpackage.avv(64, "tappableElement");
        this.o = avvVar9;
        dwn dwnVar = dwn.a;
        defpackage.azw azwVar = new defpackage.azw(uu.e(dwnVar), "waterfall");
        this.j = azwVar;
        this.p = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.c);
        defpackage.azr azrVar = new defpackage.azr(new defpackage.azr(avvVar7, avvVar3), avvVar2);
        this.k = azrVar;
        defpackage.azr azrVar2 = new defpackage.azr(new defpackage.azr(new defpackage.azr(avvVar9, avvVar4), avvVar8), azwVar);
        this.l = azrVar2;
        this.m = new defpackage.azr(azrVar, azrVar2);
        this.q = new defpackage.azw(uu.e(dwnVar), "captionBarIgnoringVisibility");
        this.r = new defpackage.azw(uu.e(dwnVar), "navigationBarsIgnoringVisibility");
        this.s = new defpackage.azw(uu.e(dwnVar), "statusBarsIgnoringVisibility");
        this.t = new defpackage.azw(uu.e(dwnVar), "systemBarsIgnoringVisibility");
        this.u = new defpackage.azw(uu.e(dwnVar), "tappableElementIgnoringVisibility");
        this.v = new defpackage.azw(uu.e(dwnVar), "imeAnimationTarget");
        this.w = new defpackage.azw(uu.e(dwnVar), "imeAnimationSource");
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        java.lang.Object tag = view2 != null ? view2.getTag(2131427805) : null;
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        this.n = bool != null ? bool.booleanValue() : false;
        this.y = new defpackage.aya(this);
        int i = dzs.a;
        eax eaxVarA = dzl.a(view);
        if (eaxVarA != null) {
            avvVar.f(eaxVarA.y(4));
            avvVar2.f(eaxVarA.y(128));
            avvVar3.f(eaxVarA.y(8));
            avvVar4.f(eaxVarA.y(32));
            avvVar5.f(eaxVarA.y(2));
            avvVar6.f(eaxVarA.y(1));
            avvVar7.f(eaxVarA.y(519));
            avvVar8.f(eaxVarA.y(16));
            avvVar9.f(eaxVarA.y(64));
        }
    }

    public final void a(android.view.View view) {
        int i = this.x - 1;
        this.x = i;
        if (i == 0) {
            int i2 = dzs.a;
            dzk.o(view, (dyy) null);
            baa$.ExternalSyntheticApiModelOutline1.m(view, (android.view.WindowInsetsAnimation$Callback) null);
            view.removeOnAttachStateChangeListener(this.y);
        }
    }

    public final void b(android.view.View view) {
        if (this.x == 0) {
            defpackage.aya ayaVar = this.y;
            ayaVar.a = false;
            ayaVar.b = 0;
            ayaVar.c = null;
            int i = dzs.a;
            dzk.o(view, ayaVar);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(ayaVar);
            eae.a(view, ayaVar);
        }
        this.x++;
    }

    public final void c(eax eaxVar) {
        this.w.f(uu.e(eaxVar.f(8)));
    }

    public final void d(eax eaxVar) {
        this.v.f(uu.e(eaxVar.f(8)));
    }

    public final void e(eax eaxVar) {
        this.b.g(eaxVar);
        this.d.g(eaxVar);
        this.c.g(eaxVar);
        this.f.g(eaxVar);
        this.g.g(eaxVar);
        this.h.g(eaxVar);
        this.i.g(eaxVar);
        this.o.g(eaxVar);
        this.e.g(eaxVar);
        this.q.f(uu.e(eaxVar.g(4)));
        this.r.f(uu.e(eaxVar.g(2)));
        this.s.f(uu.e(eaxVar.g(1)));
        this.t.f(uu.e(eaxVar.g(519)));
        this.u.f(uu.e(eaxVar.g(64)));
        dyo dyoVarK = eaxVar.k();
        this.j.f(uu.e(dyoVarK != null ? dyoVarK.a() : dwn.a));
        cpx cpxVar = null;
        if (dyoVarK != null) {
            android.graphics.Path pathM = android.os.Build.VERSION.SDK_INT >= 31 ? ac$.ExternalSyntheticApiModelOutline0.m(dyoVarK.a) : null;
            if (pathM != null) {
                cpxVar = new cpx(pathM);
            }
        }
        this.p.b(cpxVar);
        cfd.j();
    }
}
