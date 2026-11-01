package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class uvs implements agye {
    final /* synthetic */ defpackage.uvt a;
    private final android.view.View b;

    public uvs(defpackage.uvt uvtVar, android.view.View view) {
        j$.util.Objects.requireNonNull(uvtVar);
        this.a = uvtVar;
        this.b = view;
    }

    public final void a(java.lang.Throwable th) {
        a.bq(defpackage.uvt.a.c(), "failed loading audio recording data", "com/android/dialer/transcriptaudiofeedback/impl/FeedbackRecordingFragmentPeer$RecordingPlayerSubscriptionCallbacks", "onError", (char) 159, "FeedbackRecordingFragmentPeer.java", th, zct.b);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        if (!optional.isPresent()) {
            defpackage.uvt.a.b().l("com/android/dialer/transcriptaudiofeedback/impl/FeedbackRecordingFragmentPeer$RecordingPlayerSubscriptionCallbacks", "onNewData", 124, "FeedbackRecordingFragmentPeer.java").v("no new audio file provided");
            hgz.e(this.b, false);
            return;
        }
        defpackage.uvt.a.b().l("com/android/dialer/transcriptaudiofeedback/impl/FeedbackRecordingFragmentPeer$RecordingPlayerSubscriptionCallbacks", "onNewData", 128, "FeedbackRecordingFragmentPeer.java").v("received new audio path data");
        android.net.Uri uriV = this.a.i.v((java.lang.String) optional.orElseThrow());
        android.view.View view = this.b;
        akzx akzxVarM = iek.a.m();
        akzx akzxVarM2 = ied.a.m();
        java.lang.String string = uriV.toString();
        akzxVarM2.u();
        ied iedVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(string);
        iedVar.c = string;
        iec iecVar = iec.c;
        akzxVarM2.u();
        akzxVarM2.b.e = iecVar.a();
        akzxVarM.u();
        iek iekVar = akzxVarM.b;
        ied iedVarP = akzxVarM2.p();
        j$.util.Objects.requireNonNull(iedVarP);
        iekVar.c = iedVarP;
        iekVar.b |= 1;
        akzxVarM.u();
        akzxVarM.b.d = false;
        akzxVarM.u();
        akzxVarM.b.e = true;
        akzxVarM.u();
        akzxVarM.b.h = true;
        hgz.c(view, akzxVarM.p());
        hgz.e(view, true);
        hgz.d(view, new defpackage.uvr(this));
    }

    public final /* synthetic */ void c() {
    }
}
