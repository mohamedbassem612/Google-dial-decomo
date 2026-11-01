package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class oxt implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ oxt(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        defpackage.sxx sxxVar;
        oii oiiVar;
        int i = this.$cid;
        if (i == 0) {
            ((android.widget.TextView) obj).setTextColor(this.a);
            return;
        }
        if (i == 1) {
            ((android.widget.TextView) obj).setVisibility(this.a);
            return;
        }
        if (i == 2) {
            ((android.widget.TextView) obj).setTextColor(this.a);
            return;
        }
        if (i == 3) {
            ((android.app.Activity) obj).setVolumeControlStream(this.a);
            return;
        }
        if (i == 4) {
            defpackage.sxs sxsVar = (defpackage.sxs) ((aify) obj).get(this.a);
            if (sxsVar.aG() && (oiiVar = (sxxVar = sxsVar.y().e).d) != null && oiiVar.o()) {
                defpackage.sxx.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/demo/TidepodsRevelioDemoPlayer", "stopPlayingDemoAudio", 92, "TidepodsRevelioDemoPlayer.java").v("stop playing audio");
                sxxVar.d.n();
                sxxVar.d.e();
                sxxVar.d = null;
                return;
            }
            return;
        }
        if (i == 5) {
            com.airbnb.lottie.LottieAnimationView lottieAnimationView = (com.airbnb.lottie.LottieAnimationView) obj;
            lottieAnimationView.h(this.a);
            lottieAnimationView.e();
            return;
        }
        defpackage.wkp wkpVar = (defpackage.wkp) obj;
        akzx akzxVarM = defpackage.wgz.a.m();
        defpackage.wha whaVar = defpackage.wha.ADDON_FEATURE_KEY_HOLD_FOR_ME;
        akzxVarM.u();
        defpackage.wgz wgzVar = (defpackage.wgz) akzxVarM.b;
        wgzVar.c = whaVar.e;
        wgzVar.b |= 1;
        akzxVarM.u();
        defpackage.wgz wgzVar2 = (defpackage.wgz) akzxVarM.b;
        wgzVar2.b |= 2;
        wgzVar2.d = true;
        defpackage.wgz wgzVar3 = (defpackage.wgz) akzxVarM.p();
        defpackage.wha whaVarB = defpackage.wha.b(wgzVar3.c);
        if (whaVarB == null) {
            whaVarB = defpackage.wha.ADDON_FEATURE_KEY_UNSPECIFIED;
        }
        defpackage.wha whaVar2 = whaVarB;
        int i2 = this.a;
        aimz aimzVar = zih.a;
        aoov.al(wkpVar.b, zih.b.plus(aols.a), 1, new defpackage.tgn((aoln) null, wkpVar, whaVar2, 11, (byte[]) null));
        if (i2 == 2) {
            wkpVar.f(wgzVar3);
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i == 1) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i == 2) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i == 3) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i != 4) {
            return i != 5 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
