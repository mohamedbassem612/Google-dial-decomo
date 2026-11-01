package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iyg implements agtk {
    final /* synthetic */ defpackage.iyi a;

    public iyg(defpackage.iyi iyiVar) {
        this.a = iyiVar;
    }

    public final /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        java.lang.String str = (java.lang.String) obj;
        aooh.f(str, "greetingId");
        defpackage.iyi.a.c().k(th).l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyGreetingSettingsFragmentPeer$setAsDefaultClickedCallback$<anonymous>", "onFailure", 218, "BeeslyGreetingSettingsFragmentPeer.kt").y("setAsDefaultClickedCallback onFailure: id=%s", str);
        this.a.h.a(th);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        aooh.f(str, "greetingId");
        aooh.f(str2, "result");
        defpackage.iyi.a.b().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyGreetingSettingsFragmentPeer$setAsDefaultClickedCallback$<anonymous>", "onSuccess", 209, "BeeslyGreetingSettingsFragmentPeer.kt").y("setAsDefaultClickedCallback onSuccess: id=%s", str);
        defpackage.iyi iyiVar = this.a;
        defpackage.iyc iycVar = iyiVar.b;
        agby agbyVarQ = agby.q(iycVar.N(), iycVar.A().getString(2132017551, str2), -1);
        agbyVarQ.m(iycVar.N().findViewById(2131429024));
        agbyVarQ.h();
        iyiVar.p = true;
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
