package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class vxk implements agtk {
    final /* synthetic */ defpackage.vxq a;

    public vxk(defpackage.vxq vxqVar) {
        j$.util.Objects.requireNonNull(vxqVar);
        this.a = vxqVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        long jLongValue = ((java.lang.Long) obj).longValue();
        defpackage.vxq vxqVar = this.a;
        if (!vxqVar.x(jLongValue)) {
            defpackage.vxq.a.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer$5", "onFailure", 289, "VisualVoicemailFragmentPeer.java").v("expanded row has changed");
        } else {
            vxqVar.i(2132020930);
            a.bq(defpackage.vxq.a.d(), "failed to fetch voicemail", "com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer$5", "onFailure", (char) 293, "VisualVoicemailFragmentPeer.java", th, zct.b);
        }
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        long jLongValue = ((java.lang.Long) obj).longValue();
        defpackage.vxq vxqVar = this.a;
        if (!vxqVar.x(jLongValue)) {
            defpackage.vxq.a.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer$5", "onSuccess", 277, "VisualVoicemailFragmentPeer.java").v("expanded row has changed");
            return;
        }
        defpackage.vxq.a.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer$5", "onSuccess", 280, "VisualVoicemailFragmentPeer.java").v("fetched voicemail, now starting player");
        vxqVar.l(mce.dR);
        vxqVar.j();
        vxqVar.m();
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
