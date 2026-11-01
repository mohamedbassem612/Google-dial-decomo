package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jck implements agye {
    final /* synthetic */ defpackage.jcp a;

    public jck(defpackage.jcp jcpVar) {
        this.a = jcpVar;
    }

    public final void a(java.lang.Throwable th) {
        defpackage.jcp.a.c().k(th).l("com/android/dialer/beesly/impl/settings/ui/BeeslySettingsFragmentPeer$OnModelLoadedCallbacks", "onError", 164, "BeeslySettingsFragmentPeer.kt").v("onError: Unable to refresh Beesly settings fragment model.");
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
        defpackage.jcd jcdVar = (defpackage.jcd) obj;
        aooh.f(jcdVar, "data");
        aimz aimzVar = defpackage.jcp.a;
        aimzVar.b().l("com/android/dialer/beesly/impl/settings/ui/BeeslySettingsFragmentPeer$OnModelLoadedCallbacks", "onNewData", 106, "BeeslySettingsFragmentPeer.kt").y("fragment model loaded: %s", jcdVar);
        boolean z = jcdVar.f;
        defpackage.jcp jcpVar = this.a;
        jcpVar.n = z;
        defpackage.jci jciVar = jcpVar.e;
        android.view.View viewFindViewById = jciVar.N().findViewById(android.R.id.switch_widget);
        if (jcpVar.n) {
            if (viewFindViewById != null) {
                viewFindViewById.setEnabled(false);
            }
        } else if (viewFindViewById != null) {
            viewFindViewById.setEnabled(true);
        }
        jcpVar.a().k(jcdVar.c);
        com.android.dialer.externals.aicore.ui.DialerAiCorePreference dialerAiCorePreference = (com.android.dialer.externals.aicore.ui.DialerAiCorePreference) jciVar.ee(jciVar.Y(2132017504));
        if (dialerAiCorePreference != null) {
            dialerAiCorePreference.R(jcdVar.e);
        }
        if (jcdVar.c) {
            apni apniVar = jcpVar.w;
            aoss aossVar = jcpVar.c;
            apniVar.i(aoov.am(aossVar, 0, new icp(jcpVar, (aoln) null, 16), 3));
            if (!((java.lang.Boolean) jcpVar.m.a()).booleanValue()) {
                apniVar.i(aoov.am(aossVar, 0, new icp(jcpVar, (aoln) null, 18, (char[]) null), 3));
            } else if (jcpVar.o == null) {
                aosy aosyVarAm = aoov.am(aossVar, 0, new icp(jcpVar, (aoln) null, 17, (byte[]) null), 3);
                apniVar.i(aosyVarAm);
                jcpVar.o = aosyVarAm;
            }
        }
        if (!jcdVar.c || (jcdVar.b & 2) == 0) {
            tyx tyxVarFindViewById = jciVar.N().findViewById(2131427570);
            if (tyxVarFindViewById != null) {
                tyxVarFindViewById.setVisibility(8);
            }
            aimzVar.b().l("com/android/dialer/beesly/impl/settings/ui/BeeslySettingsFragmentPeer$OnModelLoadedCallbacks", "onNewData", 152, "BeeslySettingsFragmentPeer.kt").L("Soda Banner hidden: Beesly enabled: %s, hasSodaBannerModel: %s", jcdVar.c, (jcdVar.b & 2) != 0);
            return;
        }
        tyw tywVar = jcdVar.d;
        if (tywVar == null) {
            tywVar = tyw.a;
        }
        aooh.e(tywVar, "getSodaBannerModel(...)");
        aimw aimwVarL = aimzVar.b().l("com/android/dialer/beesly/impl/settings/ui/BeeslySettingsFragmentPeer", "renderSodaBanner", 436, "BeeslySettingsFragmentPeer.kt");
        tyv tyvVarB = tyv.b(tywVar.d);
        if (tyvVarB == null) {
            tyvVarB = tyv.m;
        }
        aimwVarL.y("SodaBannerMode: %s", tyvVarB.toString());
        tyx tyxVarFindViewById2 = jciVar.N().findViewById(2131427570);
        tyv tyvVarB2 = tyv.b(tywVar.d);
        if (tyvVarB2 == null) {
            tyvVarB2 = tyv.m;
        }
        if ((tyvVarB2 != tyv.e && tyvVarB2 != tyv.j) || tyxVarFindViewById2 != null) {
            if (tyxVarFindViewById2 == null) {
                android.view.View viewB = tys.b(jcpVar.h, tywVar);
                viewB.setId(2131427570);
                ((android.view.ViewGroup) jciVar.N()).addView(viewB, 0);
            } else {
                tyxVarFindViewById2.c().a(tywVar);
            }
        }
        tyw tywVar2 = jcdVar.d;
        if (tywVar2 == null) {
            tywVar2 = tyw.a;
        }
        tyv tyvVarB3 = tyv.b(tywVar2.d);
        if (tyvVarB3 == null) {
            tyvVarB3 = tyv.m;
        }
        int iOrdinal = tyvVarB3.ordinal();
        if (iOrdinal == 3 || iOrdinal == 8) {
            jcpVar.a().I(false);
        } else {
            jcpVar.a().I(true);
        }
    }

    public final /* synthetic */ void c() {
    }
}
