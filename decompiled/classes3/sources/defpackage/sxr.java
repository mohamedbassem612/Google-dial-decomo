package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sxr implements ols {
    private static final aimz b = aimz.i("com/android/dialer/revelio/impl/tidepods/impl/demo/TidepodsRevelioDemoController");
    public final android.content.Context a;
    private j$.util.Optional c = j$.util.Optional.empty();

    public sxr(android.content.Context context) {
        this.a = context;
    }

    public final olq a(int i) {
        if (i == 0) {
            olp olpVarA = olq.a();
            olpVarA.d(0);
            olpVarA.b(989);
            olpVarA.c(500L);
            return olpVarA.a();
        }
        if (i == 1) {
            olp olpVarA2 = olq.a();
            olpVarA2.d(990);
            olpVarA2.b(1259);
            return olpVarA2.a();
        }
        if (i != 2) {
            throw new java.lang.AssertionError(java.lang.String.format(java.util.Locale.US, "No loop clips for page: %d", java.lang.Integer.valueOf(i)));
        }
        olp olpVarA3 = olq.a();
        olpVarA3.d(1260);
        olpVarA3.b(1354);
        return olpVarA3.a();
    }

    public final aify b() {
        if (!this.c.isPresent()) {
            defpackage.sxo sxoVar = defpackage.sxo.a;
            akzx akzxVarM = sxoVar.m();
            akzxVarM.u();
            defpackage.sxo sxoVar2 = (defpackage.sxo) akzxVarM.b;
            sxoVar2.b |= 1;
            sxoVar2.c = 2132019908;
            akzxVarM.u();
            defpackage.sxo sxoVar3 = (defpackage.sxo) akzxVarM.b;
            sxoVar3.b |= 2;
            sxoVar3.d = 2132019907;
            akzxVarM.u();
            defpackage.sxo sxoVar4 = (defpackage.sxo) akzxVarM.b;
            java.lang.String strP = defpackage.sns.p(1);
            j$.util.Objects.requireNonNull(strP);
            sxoVar4.b |= 8;
            sxoVar4.f = strP;
            akzxVarM.u();
            defpackage.sxo sxoVar5 = (defpackage.sxo) akzxVarM.b;
            sxoVar5.b |= 4;
            sxoVar5.e = true;
            defpackage.sxs sxsVarQ = defpackage.sxs.q((defpackage.sxo) akzxVarM.p());
            akzx akzxVarM2 = sxoVar.m();
            akzxVarM2.u();
            defpackage.sxo sxoVar6 = (defpackage.sxo) akzxVarM2.b;
            sxoVar6.b |= 1;
            sxoVar6.c = 2132019910;
            akzxVarM2.u();
            defpackage.sxo sxoVar7 = (defpackage.sxo) akzxVarM2.b;
            sxoVar7.b |= 2;
            sxoVar7.d = 2132019909;
            defpackage.sxs sxsVarQ2 = defpackage.sxs.q((defpackage.sxo) akzxVarM2.p());
            akzx akzxVarM3 = sxoVar.m();
            akzxVarM3.u();
            defpackage.sxo sxoVar8 = (defpackage.sxo) akzxVarM3.b;
            sxoVar8.b |= 1;
            sxoVar8.c = 2132019912;
            akzxVarM3.u();
            defpackage.sxo sxoVar9 = (defpackage.sxo) akzxVarM3.b;
            sxoVar9.b |= 2;
            sxoVar9.d = 2132019911;
            this.c = j$.util.Optional.of(aify.r(sxsVarQ, sxsVarQ2, defpackage.sxs.q((defpackage.sxo) akzxVarM3.p())));
        }
        return (aify) this.c.orElseThrow();
    }

    public final j$.util.Optional c() {
        defpackage.otm otmVar = new defpackage.otm(null, null);
        otmVar.b = "revelio_demo_animation.json";
        otmVar.h();
        return j$.util.Optional.of(otmVar.g());
    }

    public final j$.util.Optional d() {
        return j$.util.Optional.of(new defpackage.sxq(this, 0));
    }

    public final j$.util.Optional e() {
        return j$.util.Optional.of(this.a.getString(2132019915));
    }

    public final /* synthetic */ j$.util.Optional f() {
        return j$.util.Optional.empty();
    }

    public final j$.util.Optional g(int i) {
        return j$.util.Optional.empty();
    }

    public final /* bridge */ /* synthetic */ java.lang.CharSequence h() {
        return this.a.getString(2132019914);
    }

    public final void i(int i) {
        defpackage.sxx sxxVar;
        oii oiiVar;
        b.b().l("com/android/dialer/revelio/impl/tidepods/impl/demo/TidepodsRevelioDemoController", "endDemo", 80, "TidepodsRevelioDemoController.java").v("endDemo");
        j$.util.Optional optional = this.c;
        defpackage.oxt oxtVar = new defpackage.oxt(i, 4);
        if (true == optional.isPresent()) {
            defpackage.sxs sxsVar = (defpackage.sxs) ((aify) optional.get()).get(oxtVar.a);
            if (sxsVar.aG() && (oiiVar = (sxxVar = sxsVar.y().e).d) != null && oiiVar.o()) {
                defpackage.sxx.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/demo/TidepodsRevelioDemoPlayer", "stopPlayingDemoAudio", 92, "TidepodsRevelioDemoPlayer.java").v("stop playing audio");
                sxxVar.d.n();
                sxxVar.d.e();
                sxxVar.d = null;
            }
        }
    }

    public final boolean j() {
        return true;
    }
}
