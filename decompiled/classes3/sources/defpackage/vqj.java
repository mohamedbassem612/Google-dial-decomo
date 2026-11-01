package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vqj implements agtk {
    final /* synthetic */ defpackage.vqn a;

    public vqj(defpackage.vqn vqnVar) {
        this.a = vqnVar;
    }

    public final /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        defpackage.vqn.a.c().k(th).l("com/android/dialer/voicemail/settings/greeting/single/impl/ui/VoicemailSingleGreetingSettingsFragmentPeer$checkMicrophonePermissionsCallback$<anonymous>", "onFailure", 137, "VoicemailSingleGreetingSettingsFragmentPeer.kt").v("failed to check microphonePermissions");
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        boolean zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
        defpackage.vqn vqnVar = this.a;
        if (zBooleanValue) {
            vqnVar.c();
        } else {
            vqnVar.c.n(rmw.cv);
            vqnVar.l.b("android.permission.RECORD_AUDIO");
        }
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
