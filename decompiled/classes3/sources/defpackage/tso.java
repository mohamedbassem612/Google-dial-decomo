package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class tso implements agye, agxf {
    final /* synthetic */ defpackage.tsq a;

    public tso(defpackage.tsq tsqVar) {
        this.a = tsqVar;
    }

    public final void a(java.lang.Throwable th) {
        aooh.f(th, "t");
        defpackage.tsq.a.c().k(th).l("com/android/dialer/sharpie/impl/settings/ui/SharpieSettingsFragmentPeer$OnModelLoadedCallbacks", "onError", 120, "SharpieSettingsFragmentPeer.kt").v("onError: failed to fetch or load sharpie settings fragment model");
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
        android.view.View view;
        android.view.View viewFindViewById;
        defpackage.tsk tskVar = (defpackage.tsk) obj;
        aooh.f(tskVar, "data");
        aimz aimzVar = defpackage.tsq.a;
        aimzVar.b().l("com/android/dialer/sharpie/impl/settings/ui/SharpieSettingsFragmentPeer$OnModelLoadedCallbacks", "onNewData", 91, "SharpieSettingsFragmentPeer.kt").y("fragment model loaded : %s", tskVar);
        defpackage.tsq tsqVar = this.a;
        defpackage.tsn tsnVar = tsqVar.d;
        androidx.preference.SwitchPreference switchPreferenceEe = tsnVar.ee(tsnVar.Y(2132020100));
        if (switchPreferenceEe == null) {
            throw new java.lang.IllegalStateException("preference not available");
        }
        switchPreferenceEe.k(tskVar.c);
        if (tsqVar.k) {
            tsqVar.k = false;
            if (((java.lang.Boolean) tsqVar.j.a()).booleanValue() && (view = ((aw) tsnVar).Q) != null && (viewFindViewById = view.findViewById(android.R.id.switch_widget)) != null) {
                viewFindViewById.jumpDrawablesToCurrentState();
            }
        }
        if ((tskVar.b & 2) != 0) {
            switchPreferenceEe.I(tskVar.e);
        }
        if ((tskVar.b & 1) != 0) {
            defpackage.tyw tywVar = tskVar.d;
            if (tywVar == null) {
                tywVar = defpackage.tyw.a;
            }
            aooh.e(tywVar, "getSodaBannerModel(...)");
            aimw aimwVarL = aimzVar.b().l("com/android/dialer/sharpie/impl/settings/ui/SharpieSettingsFragmentPeer", "renderSodaBanner", 228, "SharpieSettingsFragmentPeer.kt");
            defpackage.tyv tyvVarB = defpackage.tyv.b(tywVar.d);
            if (tyvVarB == null) {
                tyvVarB = defpackage.tyv.UNRECOGNIZED;
            }
            aimwVarL.y("SodaBannerMode: %s", tyvVarB.toString());
            defpackage.tyx tyxVar = (defpackage.tyx) tsnVar.N().findViewById(2131428940);
            defpackage.tyv tyvVarB2 = defpackage.tyv.b(tywVar.d);
            if (tyvVarB2 == null) {
                tyvVarB2 = defpackage.tyv.UNRECOGNIZED;
            }
            if (tyvVarB2 != defpackage.tyv.ALREADY_AVAILABLE || tyxVar != null) {
                if (tyxVar == null) {
                    defpackage.tyx tyxVarB = defpackage.tys.b(tsqVar.g, tywVar);
                    tyxVarB.setId(2131428940);
                    ((android.view.ViewGroup) tsnVar.N()).addView(tyxVarB, 0);
                } else {
                    tyxVar.y().a(tywVar);
                }
            }
        } else {
            aimzVar.b().l("com/android/dialer/sharpie/impl/settings/ui/SharpieSettingsFragmentPeer$OnModelLoadedCallbacks", "onNewData", 109, "SharpieSettingsFragmentPeer.kt").v("soda banner model missing for Sharpie");
        }
        com.android.dialer.externals.aicore.ui.DialerAiCorePreference dialerAiCorePreferenceEe = tsnVar.ee(tsnVar.Y(2132020098));
        if (dialerAiCorePreferenceEe != null) {
            dialerAiCorePreferenceEe.R(tskVar.f);
        }
    }

    public final void e(java.lang.Throwable th) {
        defpackage.tsq.a.c().k(th).l("com/android/dialer/sharpie/impl/settings/ui/SharpieSettingsFragmentPeer$OnModelLoadedCallbacks", "onBackgroundFetchError", 128, "SharpieSettingsFragmentPeer.kt").v("unable to refresh sharpie settings fragment model");
    }

    public final /* synthetic */ void c() {
    }

    public final void d() {
    }

    public final void f() {
    }
}
