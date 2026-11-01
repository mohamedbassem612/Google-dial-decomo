package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class txj extends android.content.BroadcastReceiver {
    final /* synthetic */ ahpz a;
    final /* synthetic */ defpackage.twa b;

    public txj(ahpz ahpzVar, defpackage.twa twaVar) {
        this.a = ahpzVar;
        this.b = twaVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        aooh.f(intent, "intent");
        ahok ahokVarF = this.a.f(900, "Broadcast to SodaAndroidSpeechModelDownloader.sodaDownloadCompleteReceiver");
        try {
            int iC = defpackage.afbq.c(intent.getExtras());
            defpackage.twa twaVar = this.b;
            if (iC == 2) {
                defpackage.txk.a.b().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechModelDownloader$sodaDownloadCompleteReceiver$<anonymous>", "onReceive$<anonymous>", 42, "SodaAndroidSpeechModelDownloader.kt").v("SODA language model download completed");
                twaVar.c();
            } else {
                defpackage.txk.a.b().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechModelDownloader$sodaDownloadCompleteReceiver$<anonymous>", "onReceive$<anonymous>", 45, "SodaAndroidSpeechModelDownloader.kt").v("SODA language model download failed");
                twaVar.b();
            }
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }
}
