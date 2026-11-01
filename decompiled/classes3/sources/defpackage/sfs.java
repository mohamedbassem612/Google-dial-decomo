package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sfs implements agtk {
    final /* synthetic */ defpackage.sfz a;

    public sfs(defpackage.sfz sfzVar) {
        this.a = sfzVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        defpackage.sfz.a.c().k(th).l("com/android/dialer/patrick/impl/settings/ui/CallingCardSettingsFragmentPeer$deleteSelfMyCallingCardCallback$<anonymous>", "onFailure", 178, "CallingCardSettingsFragmentPeer.kt").v("Failed to delete self My Calling Card.");
        defpackage.sfz sfzVar = this.a;
        java.lang.String strY = sfzVar.d.Y(2132019741);
        aooh.e(strY, "getString(...)");
        sfzVar.h(strY, -1);
        sfzVar.b().a(mcd.bj);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        if (((java.lang.Boolean) obj2).booleanValue()) {
            defpackage.sfz.a.b().l("com/android/dialer/patrick/impl/settings/ui/CallingCardSettingsFragmentPeer$deleteSelfMyCallingCardCallback$<anonymous>", "onSuccess", 169, "CallingCardSettingsFragmentPeer.kt").v("Successfully deleted self My Calling Card.");
            this.a.b().b(mce.hN);
            return;
        }
        defpackage.sfz sfzVar = this.a;
        java.lang.String strY = sfzVar.d.Y(2132019741);
        aooh.e(strY, "getString(...)");
        sfzVar.h(strY, -1);
        sfzVar.b().a(mcd.bj);
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
