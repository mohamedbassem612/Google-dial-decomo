package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class vzb extends agwz {
    final /* synthetic */ aogc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzb(defpackage.vzc vzcVar, ahpz ahpzVar, java.util.concurrent.Executor executor, aogc aogcVar) {
        super(ahpzVar, "VoicemailStatusAsyncContentObserver", executor);
        this.a = aogcVar;
        j$.util.Objects.requireNonNull(vzcVar);
    }

    public final void a(boolean z, android.net.Uri uri) {
        vze.a.b().l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataServiceImpl$RegisteredOwnerLifecycleObserver$1", "traceWrappedOnChange", 473, "VoicemailStatusDataServiceImpl.java").v("enter");
        this.a.t(ajcm.a, new agxj("VoicemailStatus"));
    }
}
