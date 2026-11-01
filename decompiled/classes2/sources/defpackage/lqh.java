package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lqh implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ lqh(java.lang.Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        wyg wygVar;
        switch (this.$cid) {
            case 0:
                defpackage.jyn jynVar = (defpackage.jyn) this.b;
                java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) jynVar.a;
                if (j$.util.concurrent.atomic.DesugarAtomicInteger.updateAndGet(atomicInteger, new amej(this.a, 1)) == atomicInteger.get()) {
                    return null;
                }
                ((zpz) jynVar.c).a(aiql.z((java.lang.Object) null));
                return null;
            case 1:
                com.airbnb.lottie.LottieAnimationView lottieAnimationView = (com.airbnb.lottie.LottieAnimationView) this.b;
                boolean z = lottieAnimationView.d;
                int i = this.a;
                android.content.Context context = lottieAnimationView.getContext();
                return z ? defpackage.gzl.b(context, i, defpackage.gzl.g(context, i)) : defpackage.gzl.b(context, i, null);
            case 2:
                int i2 = this.a;
                defpackage.nwb nwbVar = (defpackage.nwb) this.b;
                aigf aigfVar = nwbVar.j;
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
                android.telephony.ims.ImsMmTelManager imsMmTelManagerM = baa$.ExternalSyntheticApiModelOutline1.m(aigfVar.get(numValueOf));
                if (imsMmTelManagerM != null) {
                    return imsMmTelManagerM;
                }
                defpackage.nwb.a.b().l("com/android/dialer/dualsim/dualsimdualactive/impl/DualSimDualActiveImpl", "getImsMmTelManager", 403, "DualSimDualActiveImpl.java").v("No ImsMmTelManager found in cache, creating new instance");
                android.telephony.ims.ImsMmTelManager imsMmTelManagerM2 = baa$.ExternalSyntheticApiModelOutline1.m(baa$.ExternalSyntheticApiModelOutline1.m(nwbVar.b.getSystemService(baa$.ExternalSyntheticApiModelOutline1.m$1())), i2);
                aigb aigbVar = new aigb(4);
                aigbVar.l(nwbVar.j);
                aigbVar.i(numValueOf, imsMmTelManagerM2);
                nwbVar.j = aigbVar.e(false);
                return imsMmTelManagerM2;
            case 3:
                android.widget.Toast.makeText(((qgn) this.b).b, this.a, 1).show();
                return null;
            case 4:
                android.provider.Settings.Secure.putInt(((android.content.Context) ((taq) this.b).b).getContentResolver(), "hearing_aid", this.a);
                return null;
            case 5:
                android.provider.Settings.Secure.putInt(((android.content.Context) ((sgi) this.b).a).getContentResolver(), "preferred_tty_mode", this.a);
                return null;
            case 6:
                if (this.a != 2) {
                    return null;
                }
                uar uarVar = (uar) this.b;
                uarVar.i = 3;
                ahvr.J(uarVar.c.b(new defpackage.fvl(9), 1L, java.util.concurrent.TimeUnit.SECONDS), new pgr(uarVar, 6), uarVar.b);
                return null;
            case 7:
                akzx akzxVarM = amsq.a.m();
                akzxVarM.u();
                amsq amsqVar = akzxVarM.b;
                amsqVar.m = this.a - 1;
                amsqVar.b |= 256;
                amsq amsqVarP = akzxVarM.p();
                vdq vdqVar = (vdq) this.b;
                akzx akzxVarP = vdqVar.b.p();
                akzxVarP.z(amsqVarP);
                vdqVar.b = akzxVarP.p();
                return null;
            case 8:
                wyf wyfVar = (wyf) this.b;
                java.util.Locale localeAe = gus.ae(wyfVar.b);
                try {
                    wygVar = (wyg) java.lang.Enum.valueOf(wyg.class, localeAe.getISO3Language().toUpperCase(java.util.Locale.US));
                    break;
                } catch (java.lang.IllegalArgumentException e) {
                    hgb.g(wyf.a.d(), "unsupported language: %s; fallback to English", localeAe.getISO3Language(), "com/android/incallui/atlas/ui/impl/audioassets/local/HoldForMeLocalAudioAssetFetcher", "getLangKey", (char) 142, "HoldForMeLocalAudioAssetFetcher.java", e, zct.b);
                    wygVar = wyg.a;
                }
                int i3 = this.a;
                j$.util.Optional optionalA = wyfVar.a(i3, wygVar);
                if (optionalA.isPresent()) {
                    return optionalA;
                }
                a.bI(wyf.a.d(), "fallback to English", "com/android/incallui/atlas/ui/impl/audioassets/local/HoldForMeLocalAudioAssetFetcher", "fetchAudioFile", 'K', "HoldForMeLocalAudioAssetFetcher.java", zct.b);
                return wyfVar.a(i3, wyg.a);
            case 9:
                xcn xcnVar = (xcn) this.b;
                android.net.Uri uri = android.net.Uri.parse("android.resource://" + xcnVar.d.getPackageName() + '/' + this.a);
                return (defpackage.ogj) xcnVar.k.c(uri).orElseThrow(new pxs(uri, 16));
            case 10:
                return java.lang.Boolean.valueOf(((com.google.android.libraries.dialer.blocking.messagebased.MessageBasedBlockingService) this.b).c.c(this.a));
            case 11:
                int i4 = this.a;
                apdi apdiVar = (apdi) this.b;
                ahtx.a.f((android.content.Context) apdiVar.a, java.lang.Integer.valueOf(i4), (ahua) apdiVar.d);
                return null;
            default:
                return ((anrx) this.b).b.a(this.a);
        }
    }
}
