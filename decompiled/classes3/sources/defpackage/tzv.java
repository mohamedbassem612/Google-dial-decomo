package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tzv {
    public static final aimz a = aimz.i("com/android/dialer/sonic/impl/service/SonicAudioPlayer");
    public final ajct b;
    public final hxv c;
    public final mba d;
    public final agsm e;
    public final defpackage.tzl f;
    public final zdl g;
    public final defpackage.taq j;
    public final defpackage.afpl k;
    private final ajcu l;
    private final zpz m;
    private final ahda n = new ahda();
    public defpackage.tzt h = defpackage.tzt.a;
    public j$.util.Optional i = j$.util.Optional.empty();

    public tzv(ajct ajctVar, ajcu ajcuVar, hxv hxvVar, mba mbaVar, zpz zpzVar, defpackage.taq taqVar, agsm agsmVar, defpackage.tzl tzlVar, zdl zdlVar, defpackage.afpl afplVar) {
        fn$.ExternalSyntheticApiModelOutline0.m(new android.media.AudioAttributes.Builder().setContentType(1).setUsage(2), true).build();
        this.b = ajctVar;
        this.l = ajcuVar;
        this.c = hxvVar;
        this.d = mbaVar;
        this.m = zpzVar;
        this.j = taqVar;
        this.e = agsmVar;
        this.f = tzlVar;
        this.g = zdlVar;
        this.k = afplVar;
    }

    public final ajcq a(hxf hxfVar) {
        ahrv ahrvVarG = ahrv.g(hxfVar.c());
        defpackage.tzs tzsVar = new defpackage.tzs(this, hxfVar, 0);
        ajct ajctVar = this.b;
        return ahrv.g(ahrvVarG.h(tzsVar, ajctVar)).i(new defpackage.qgk(6), ajctVar).f(java.lang.Exception.class, new defpackage.tct(this, 14), ajctVar).h(new defpackage.tcy(this, 9), ajctVar);
    }

    public final ajcq b(defpackage.uab uabVar, boolean z) {
        return this.n.h(new iet(this, uabVar, z, 4), this.b);
    }

    public final ajcq c(hxf hxfVar, j$.util.Optional optional) {
        return ahvr.H(hxfVar.c(), new defpackage.tzs(this, optional, 1, null), this.b);
    }

    public final ajcs d(aify aifyVar) {
        for (int i = 0; i < ((aike) aifyVar).d; i++) {
            aiql.H((ajcq) aifyVar.get(i));
        }
        a.b().l("com/android/dialer/sonic/impl/service/SonicAudioPlayer", "checkPlaybackAndUpdatePlayerState", 282, "SonicAudioPlayer.java").v("state change to blocking");
        f(defpackage.tzt.c);
        return this.l.c(new defpackage.tvg(this, 3), 1L, java.util.concurrent.TimeUnit.SECONDS);
    }

    public final void e(defpackage.uab uabVar) {
        this.e.g(b(uabVar, true), 1L, java.util.concurrent.TimeUnit.MINUTES);
    }

    public final void f(defpackage.tzt tztVar) {
        this.h = tztVar;
        if (tztVar == defpackage.tzt.a) {
            this.i = j$.util.Optional.empty();
        }
        if (this.h != defpackage.tzt.c) {
            this.m.a(ajcm.a);
        }
    }

    public final boolean g() {
        defpackage.tzt tztVar = this.h;
        return tztVar == defpackage.tzt.b || tztVar == defpackage.tzt.c;
    }
}
