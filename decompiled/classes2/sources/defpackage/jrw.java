package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jrw implements defpackage.geh {
    public static final aimz a = aimz.i("com/android/dialer/callerid/settings/impl/CallerIdSettingsFragmentPeer");
    public android.content.Context b;
    public com.android.dialer.common.preference.ClickableWhenDisabledSwitchPreference c;
    public com.android.dialer.common.preference.ClickableWhenDisabledSwitchPreference d;
    public androidx.preference.SwitchPreference e;
    public com.android.dialer.widget.FooterPreferenceCompat f;
    public final defpackage.jrr g;
    public final rlv h;
    public final agtj i;
    public final agsm j;
    public final agzc l;
    public final defpackage.odo m;
    public final defpackage.jrn n;
    public final zjm p;
    public final zjm q;
    public final whl r;
    private final uhs s;
    private final zjm t;
    public final agtk k = new defpackage.jru(this);
    public final defpackage.odm o = new defpackage.iyh(this, 2);

    public jrw(defpackage.jrr jrrVar, uhs uhsVar, rlv rlvVar, zjm zjmVar, zjm zjmVar2, whl whlVar, agtj agtjVar, agzc agzcVar, defpackage.odo odoVar, defpackage.jrn jrnVar, agsm agsmVar, zjm zjmVar3) {
        this.g = jrrVar;
        this.s = uhsVar;
        this.h = rlvVar;
        this.t = zjmVar;
        this.q = zjmVar2;
        this.r = whlVar;
        this.i = agtjVar;
        this.l = agzcVar;
        this.m = odoVar;
        this.n = jrnVar;
        this.j = agsmVar;
        this.p = zjmVar3;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [aoss, java.lang.Object] */
    @Override // defpackage.geh
    public final boolean a(androidx.preference.Preference preference, java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        if (preference == this.c) {
            b(bool.booleanValue(), true);
            return true;
        }
        if (preference == this.d) {
            final boolean zBooleanValue = bool.booleanValue();
            rlv rlvVar = this.h;
            if (zBooleanValue) {
                rlvVar.n(rmw.ib);
            } else {
                rlvVar.n(rmw.ic);
            }
            uhs uhsVar = this.s;
            if (uhsVar.e()) {
                this.d.I(false);
                this.c.I(false);
                uhsVar.d(zBooleanValue, new ucs() { // from class: jrt
                    public final void a(boolean z) {
                        defpackage.jrw jrwVar = this.a;
                        if (z) {
                            defpackage.jrn.e(jrwVar.n);
                        } else {
                            boolean z2 = zBooleanValue;
                            jrwVar.h.n(rmw.id);
                            android.widget.Toast.makeText(jrwVar.b, z2 ? jrwVar.b.getString(2132020221) : jrwVar.b.getString(2132020219), 1).show();
                            jrwVar.j.g(jrwVar.n.b(!z2, true), 5L, java.util.concurrent.TimeUnit.SECONDS);
                        }
                        jrwVar.d.I(((androidx.preference.TwoStatePreference) jrwVar.c).a);
                        jrwVar.c.I(true);
                    }
                });
            } else {
                this.j.g(this.n.b(zBooleanValue, true), 5L, java.util.concurrent.TimeUnit.SECONDS);
            }
        } else if (preference == this.e) {
            boolean zBooleanValue2 = bool.booleanValue();
            agtj agtjVar = this.i;
            j$.util.Optional optionalG = this.q.g();
            pqr pqrVar = new pqr(zBooleanValue2, 1);
            if (true == optionalG.isPresent()) {
                java.lang.Object obj2 = optionalG.get();
                izg izgVar = (izg) obj2;
                optionalG = j$.util.Optional.ofNullable(aosv.F((aoss) izgVar.c, 0, new defpackage.jbu(izgVar, pqrVar.a, (aoln) null, 1), 3));
            }
            agtjVar.j(zoe.N((ajcq) optionalG.orElse(ajcm.a)), new zoe(bool), this.k);
        }
        return true;
    }

    public final void b(boolean z, boolean z2) {
        rlv rlvVar = this.h;
        if (z) {
            rlvVar.n(rmw.kf);
        } else {
            rlvVar.n(rmw.kg);
        }
        this.j.g(this.n.a(z, z2), 5L, java.util.concurrent.TimeUnit.SECONDS);
        this.d.I(z);
    }

    public final void c() {
        j$.util.Optional optionalG = this.p.g();
        defpackage.jrs jrsVar = new defpackage.jrs(this, 1);
        if (true == optionalG.isPresent()) {
            ahqx.l(((defpackage.jrw) jrsVar.a).g.G(), ((met) optionalG.get()).a());
        }
    }

    public final boolean d() {
        j$.util.Optional optionalG = this.t.g();
        if (true == optionalG.isPresent()) {
            optionalG = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((mnp) optionalG.get()).e()));
        }
        return ((java.lang.Boolean) optionalG.orElse(java.lang.Boolean.FALSE)).booleanValue();
    }
}
