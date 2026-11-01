package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vnv implements defpackage.aguq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/sodatranscribe/impl/VvmSodaTranscriptionWorker");
    private final defpackage.ajct b;
    private final vnr c;

    public vnv(defpackage.ajct ajctVar, vnr vnrVar) {
        this.b = ajctVar;
        this.c = vnrVar;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        android.net.Uri uri = android.net.Uri.parse(workerParameters.b.c(java.lang.String.valueOf(android.provider.VoicemailContract.Voicemails.CONTENT_URI)));
        defpackage.aooh.f(uri, "contentUri");
        vnr vnrVar = this.c;
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(defpackage.aosv.C(defpackage.ahvr.ag(vnrVar.a, vnrVar.b, new vjf(vnrVar, uri, (defpackage.aoln) null, 4))));
        defpackage.aooh.e(ahrvVarG, "from(...)");
        return defpackage.ahvr.H(ahrvVarG, new vmj(14), this.b);
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
