package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class lib implements agtk {
    final /* synthetic */ defpackage.lif a;

    public lib(defpackage.lif lifVar) {
        j$.util.Objects.requireNonNull(lifVar);
        this.a = lifVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        a.bq(defpackage.lif.a.c(), "failed to save new voice", "com/android/dialer/callscreen/impl/settings/VoiceSettingsFragmentPeer$1", "onFailure", 'u', "VoiceSettingsFragmentPeer.java", th, zct.b);
        defpackage.lif.b(defpackage.lif.a(this.a.d), true);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.lif.a.b().l("com/android/dialer/callscreen/impl/settings/VoiceSettingsFragmentPeer$1", "onSuccess", 111, "VoiceSettingsFragmentPeer.java").v("successfully set the new voice");
        defpackage.lif.b(defpackage.lif.a(this.a.d), true);
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
