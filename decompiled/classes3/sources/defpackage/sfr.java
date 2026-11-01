package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sfr implements agye, agxf {
    final /* synthetic */ defpackage.sfz a;

    public sfr(defpackage.sfz sfzVar) {
        this.a = sfzVar;
    }

    public final void a(java.lang.Throwable th) {
        aooh.f(th, "t");
        defpackage.sfz sfzVar = this.a;
        ccp ccpVar = sfzVar.j;
        ccpVar.b(defpackage.sgl.a((defpackage.sgl) ccpVar.a(), null, null, false, 31));
        defpackage.sfz.a.c().k(th).l("com/android/dialer/patrick/impl/settings/ui/CallingCardSettingsFragmentPeer$callingCardSettingsUiCallback$<anonymous>", "onError", 142, "CallingCardSettingsFragmentPeer.kt").v("Failed to produce Calling card settings ui data.");
        java.lang.String strY = sfzVar.d.Y(2132019741);
        aooh.e(strY, "getString(...)");
        sfzVar.h(strY, -1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) throws aois {
        defpackage.sfj sfjVar = (defpackage.sfj) obj;
        aooh.f(sfjVar, "callingCardSettingsUiModel");
        snl snlVar = sfjVar.b;
        j$.util.Objects.checkIndex(0, 3);
        defpackage.sgn sgnVarA = null;
        if (snlVar == null) {
            defpackage.sfz.a.b().l("com/android/dialer/patrick/impl/settings/ui/CallingCardSettingsFragmentPeer$callingCardSettingsUiCallback$<anonymous>", "onNewData", 126, "CallingCardSettingsFragmentPeer.kt").v("User's My Calling Card is null");
        } else if (snlVar instanceof defpackage.sfm) {
            defpackage.sfe sfeVar = ((defpackage.sfm) snlVar).a;
            if (sfeVar != null) {
                sgnVarA = this.a.a(sfeVar);
            }
        } else {
            if (!(snlVar instanceof defpackage.sfk)) {
                throw new aois();
            }
            defpackage.sfk sfkVar = (defpackage.sfk) snlVar;
            defpackage.sfz.a.b().k(sfkVar.a).l("com/android/dialer/patrick/impl/settings/ui/CallingCardSettingsFragmentPeer$callingCardSettingsUiCallback$<anonymous>", "onNewData", 121, "CallingCardSettingsFragmentPeer.kt").v("Failed to produce Calling card settings ui data.");
            defpackage.sfl sflVar = sfkVar.b;
            if (sflVar != null) {
                this.a.h(sflVar.a, sflVar.b);
            }
            defpackage.sfe sfeVar2 = sfkVar.c;
            if (sfeVar2 != null) {
                sgnVarA = this.a.a(sfeVar2);
            }
        }
        defpackage.sfz sfzVar = this.a;
        ccp ccpVar = sfzVar.j;
        defpackage.sgl sglVar = (defpackage.sgl) ccpVar.a();
        java.util.List list = sfjVar.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(sfzVar.a((defpackage.sfe) it.next()));
        }
        ccpVar.b(defpackage.sgl.a(sglVar, arrayList, sgnVarA, false, 19));
    }

    public final void c() {
        ccp ccpVar = this.a.j;
        ccpVar.b(defpackage.sgl.a((defpackage.sgl) ccpVar.a(), null, null, true, 31));
    }

    public final void d() {
        ccp ccpVar = this.a.j;
        ccpVar.b(defpackage.sgl.a((defpackage.sgl) ccpVar.a(), null, null, true, 31));
    }

    public final void e(java.lang.Throwable th) {
        defpackage.sfz sfzVar = this.a;
        ccp ccpVar = sfzVar.j;
        ccpVar.b(defpackage.sgl.a((defpackage.sgl) ccpVar.a(), null, null, false, 31));
        defpackage.sfz.a.c().k(th).l("com/android/dialer/patrick/impl/settings/ui/CallingCardSettingsFragmentPeer$callingCardSettingsUiCallback$<anonymous>", "onBackgroundFetchError", 160, "CallingCardSettingsFragmentPeer.kt").v("Failed to refresh Calling card settings ui data.");
        java.lang.String strY = sfzVar.d.Y(2132019741);
        aooh.e(strY, "getString(...)");
        sfzVar.h(strY, -1);
    }

    public final void f() {
        ccp ccpVar = this.a.j;
        ccpVar.b(defpackage.sgl.a((defpackage.sgl) ccpVar.a(), null, null, false, 31));
    }
}
