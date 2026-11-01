package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iyf implements agtk {
    final /* synthetic */ defpackage.iyi a;

    public iyf(defpackage.iyi iyiVar) {
        this.a = iyiVar;
    }

    public final /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        java.lang.String str = (java.lang.String) obj;
        aooh.f(str, "greetingId");
        defpackage.iyi.a.c().k(th).l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyGreetingSettingsFragmentPeer$renameClickedCallback$<anonymous>", "onFailure", 242, "BeeslyGreetingSettingsFragmentPeer.kt").y("renameClickedCallback onFailure: id=%s", str);
        this.a.h.a(th);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        aooh.f(str, "greetingId");
        defpackage.iyi.a.b().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyGreetingSettingsFragmentPeer$renameClickedCallback$<anonymous>", "onSuccess", 238, "BeeslyGreetingSettingsFragmentPeer.kt").y("renameClickedCallback onSuccess: id=%s", str);
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
