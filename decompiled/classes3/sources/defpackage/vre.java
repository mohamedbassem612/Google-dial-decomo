package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class vre implements agtk {
    final /* synthetic */ defpackage.vrh a;

    public vre(defpackage.vrh vrhVar) {
        j$.util.Objects.requireNonNull(vrhVar);
        this.a = vrhVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        defpackage.vrh vrhVar = this.a;
        vrhVar.b();
        a.bq(defpackage.vrh.a.c(), "failed to verify old PIN", "com/android/dialer/voicemail/settings/pin/VoicemailChangePinFragmentPeer$3", "onFailure", (char) 189, "VoicemailChangePinFragmentPeer.java", th, zct.b);
        vrhVar.f(vrhVar.a(6));
        vrhVar.i(2);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num = (java.lang.Integer) obj2;
        defpackage.vrh vrhVar = this.a;
        vrhVar.b();
        defpackage.vrh.a.b().l("com/android/dialer/voicemail/settings/pin/VoicemailChangePinFragmentPeer$3", "onSuccess", 173, "VoicemailChangePinFragmentPeer.java").y("Verify old PIN result: %s", num);
        if (num.intValue() == 0) {
            vrhVar.c();
        } else {
            vrhVar.f(vrhVar.a(num.intValue()));
            vrhVar.i(2);
        }
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
