package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wth extends defpackage.afqs {
    final /* synthetic */ defpackage.wtk a;

    public wth(defpackage.wtk wtkVar) {
        j$.util.Objects.requireNonNull(wtkVar);
        this.a = wtkVar;
    }

    @Override // defpackage.afqs
    public final void a(android.view.View view, int i) {
        if (i == 5) {
            defpackage.wtk wtkVar = this.a;
            j$.util.Optional optionalA = wtkVar.a();
            defpackage.wlm wlmVar = new defpackage.wlm(wtkVar, 13);
            if (true == optionalA.isPresent()) {
                java.lang.Object obj = optionalA.get();
                u uVar = new u(((defpackage.wtk) wlmVar.a).e.I());
                uVar.k((aw) obj);
                uVar.c();
            }
            wtkVar.e.N().findViewById(2131427590).setVisibility(4);
            j$.util.Optional optionalB = wtkVar.b();
            if (true == optionalB.isPresent()) {
                defpackage.wkp wkpVar = (defpackage.wkp) optionalB.get();
                defpackage.wkp.a.b().i(zct.a).l("com/android/dialer/xatu/impl/service/XatuAddonCoordinatorController", "abortAllAddonFeatureActivations", 77, "XatuAddonCoordinatorController.kt").v("enter");
                aimz aimzVar = zih.a;
                aoov.al(wkpVar.b, zih.b.plus(aols.a), 1, new defpackage.uke((aoln) null, wkpVar, 10));
            }
        }
    }

    @Override // defpackage.afqs
    public final void b(android.view.View view) {
    }
}
