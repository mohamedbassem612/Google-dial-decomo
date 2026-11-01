package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pyu {
    public static final aimz a = aimz.i("com/android/dialer/incall/dialpad/ui/TidePodsDialpadFragmentPeer");
    public static final java.util.Map b;
    public final defpackage.pyk c;
    public final defpackage.pyn d;
    public final defpackage.agzc e;
    public final odo f;
    public defpackage.miq g;
    public defpackage.pyc h;
    final odm i = new iyh(this, 19);
    public final ajwr j;
    public final defpackage.afpl k;
    private final zpm l;

    static {
        aca acaVar = new aca();
        b = acaVar;
        acaVar.put(2131428622, '1');
        acaVar.put(2131429326, '2');
        acaVar.put(2131429260, '3');
        acaVar.put(2131428298, '4');
        acaVar.put(2131428279, '5');
        acaVar.put(2131428958, '6');
        acaVar.put(2131428934, '7');
        acaVar.put(2131428083, '8');
        acaVar.put(2131428583, '9');
        acaVar.put(2131429546, '0');
        acaVar.put(2131428713, '#');
        acaVar.put(2131429014, '*');
    }

    public pyu(defpackage.pyk pykVar, defpackage.pyn pynVar, ajwr ajwrVar, defpackage.afpl afplVar, zpm zpmVar, defpackage.agzc agzcVar, odo odoVar) {
        a.b().l("com/android/dialer/incall/dialpad/ui/TidePodsDialpadFragmentPeer", "<init>", 160, "TidePodsDialpadFragmentPeer.java").v("enter");
        this.c = pykVar;
        this.d = pynVar;
        this.j = ajwrVar;
        this.k = afplVar;
        this.l = zpmVar;
        this.e = agzcVar;
        this.f = odoVar;
    }

    private final boolean d() {
        return this.d.dX().getConfiguration().getLayoutDirection() == 1;
    }

    public final dwn a(dwn dwnVar, j$.util.OptionalInt optionalInt, j$.util.OptionalInt optionalInt2, j$.util.OptionalInt optionalInt3, j$.util.OptionalInt optionalInt4) {
        j$.util.OptionalInt optionalInt5 = true != d() ? optionalInt : optionalInt2;
        if (true != d()) {
            optionalInt = optionalInt2;
        }
        return dwn.d(optionalInt5.orElse(dwnVar.b), optionalInt3.orElse(dwnVar.c), optionalInt.orElse(dwnVar.d), optionalInt4.orElse(dwnVar.e));
    }

    public final j$.util.Optional b() {
        defpackage.pyc pycVar = this.h;
        if (pycVar == null) {
            a.bI(a.d(), "Cannot get DialpadController because DialpadUiModel is null, which means there are no calls.", "com/android/dialer/incall/dialpad/ui/TidePodsDialpadFragmentPeer", "getDialpadController", (char) 279, "TidePodsDialpadFragmentPeer.java", zct.b);
            return j$.util.Optional.empty();
        }
        j$.util.Optional optionalE = this.l.e(pycVar.c);
        return true == optionalE.isPresent() ? j$.util.Optional.ofNullable(((defpackage.pyq) ((defpackage.apqr) optionalE.get()).a(defpackage.pyq.class)).jS()) : optionalE;
    }

    public final void c(qbc qbcVar) {
        j$.util.Optional optionalH = this.l.h();
        defpackage.puo puoVar = new defpackage.puo(qbcVar, 9);
        if (true == optionalH.isPresent()) {
            ((defpackage.pyq) ((defpackage.apqr) optionalH.get()).a(defpackage.pyq.class)).cp().a((qbc) puoVar.a);
        }
    }
}
