package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class izl implements agtk {
    final /* synthetic */ defpackage.izm a;

    public izl(defpackage.izm izmVar) {
        this.a = izmVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        defpackage.izm.a.c().k(th).m(aioa.b).l("com/android/dialer/beesly/impl/settings/greeting/ui/RecordGreetingFragmentPeer$saveCustomGreetingCallback$<anonymous>", "onFailure", 77, "RecordGreetingFragmentPeer.kt").v("Failed to save the recording as a custom greeting");
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.izm.a.b().l("com/android/dialer/beesly/impl/settings/greeting/ui/RecordGreetingFragmentPeer$saveCustomGreetingCallback$<anonymous>", "onSuccess", 64, "RecordGreetingFragmentPeer.kt").v("Succeeded in saving the recording as a custom greeting.");
        az azVarH = this.a.b.H();
        android.content.Intent intentPutExtra = new android.content.Intent().putExtra("greeting_id", (java.lang.String) obj2);
        aooh.e(intentPutExtra, "putExtra(...)");
        azVarH.setResult(-1, intentPutExtra);
        azVarH.finish();
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
