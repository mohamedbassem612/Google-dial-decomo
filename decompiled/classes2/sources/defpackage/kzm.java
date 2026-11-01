package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class kzm implements agtk {
    final /* synthetic */ defpackage.kzs a;

    public kzm(defpackage.kzs kzsVar) {
        j$.util.Objects.requireNonNull(kzsVar);
        this.a = kzsVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        a.bq(defpackage.kzs.a.c(), "failed to delete all call recordings", "com/android/dialer/callrecording/impl/settings/CrosbySettingsFragmentPeer$2", "onFailure", (char) 267, "CrosbySettingsFragmentPeer.java", th, zct.b);
        defpackage.kzs kzsVar = this.a;
        kzsVar.l.I(true);
        kzsVar.B.s(ajcm.a, defpackage.kzj.a);
        defpackage.kzk kzkVar = kzsVar.e;
        agby agbyVarO = agby.o(kzkVar.N(), 2132018229, 0);
        agbu agbuVar = ((agbv) agbyVarO).j;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) agbuVar.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, da$.ExternalSyntheticApiModelOutline0.m(baa$.ExternalSyntheticApiModelOutline1.m$1(baa$.ExternalSyntheticApiModelOutline1.m(baa$.ExternalSyntheticApiModelOutline1.m(kzsVar.c.getWindowManager())), baa$.ExternalSyntheticApiModelOutline1.m())) + kzkVar.z().getResources().getDimensionPixelSize(2131167414));
        agbuVar.setLayoutParams(marginLayoutParams);
        agbyVarO.h();
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.kzs.a.b().l("com/android/dialer/callrecording/impl/settings/CrosbySettingsFragmentPeer$2", "onSuccess", 255, "CrosbySettingsFragmentPeer.java").v("deleted all call recordings");
        this.a.B.s(ajcm.a, defpackage.kzj.a);
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
