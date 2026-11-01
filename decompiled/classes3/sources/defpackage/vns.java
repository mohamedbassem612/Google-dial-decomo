package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vns implements ajas {
    public final /* synthetic */ vnu a;
    public final /* synthetic */ ajcq b;
    public final /* synthetic */ ajcq c;
    public final /* synthetic */ android.net.Uri d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ vns(vnu vnuVar, ajcq ajcqVar, ajcq ajcqVar2, android.net.Uri uri, boolean z) {
        this.a = vnuVar;
        this.b = ajcqVar;
        this.c = ajcqVar2;
        this.d = uri;
        this.e = z;
    }

    public final ajcq a() {
        if (((java.lang.Boolean) aiql.H(this.b)).booleanValue()) {
            android.net.Uri uri = this.d;
            ajcq ajcqVar = this.c;
            vnu vnuVar = this.a;
            defpackage.vnt vntVar = (defpackage.vnt) aiql.H(ajcqVar);
            if (vntVar == defpackage.vnt.b) {
                a.bI(vnu.a.d(), "Enqueue failed because language model is unavailable", "com/android/dialer/voicemail/service/sodatranscribe/impl/VvmSodaTranscriptionWorkStarter", "enqueueSodaTranscriptionWithCheck", '~', "VvmSodaTranscriptionWorkStarter.java", zct.b);
                vnuVar.b.o(rmx.lm);
                defpackage.vdm vdmVar = new defpackage.vdm();
                vdmVar.d(j$.util.Optional.of(defpackage.uzm.TRANSCRIPTION_FAILED_LANGUAGE_MODEL_MISSING));
                return vnuVar.c.h(uri, vdmVar.a());
            }
            if (vntVar == defpackage.vnt.c) {
                a.bI(vnu.a.d(), "Enqueue failed because soda app is unavailable", "com/android/dialer/voicemail/service/sodatranscribe/impl/VvmSodaTranscriptionWorkStarter", "enqueueSodaTranscriptionWithCheck", (char) 141, "VvmSodaTranscriptionWorkStarter.java", zct.b);
                vnuVar.b.o(rmx.lm);
                defpackage.vdm vdmVar2 = new defpackage.vdm();
                vdmVar2.d(j$.util.Optional.of(defpackage.uzm.TRANSCRIPTION_FAILED_SODA_APP_MISSING));
                return vnuVar.c.h(uri, vdmVar2.a());
            }
            if (vntVar == defpackage.vnt.d) {
                a.bI(vnu.a.d(), "Enqueue failed because Dialer doesn't have microphone permissions.", "com/android/dialer/voicemail/service/sodatranscribe/impl/VvmSodaTranscriptionWorkStarter", "enqueueSodaTranscriptionWithCheck", (char) 155, "VvmSodaTranscriptionWorkStarter.java", zct.b);
                vnuVar.b.o(rmx.ln);
                defpackage.vdm vdmVar3 = new defpackage.vdm();
                vdmVar3.d(j$.util.Optional.of(defpackage.uzm.TRANSCRIPTION_FAILED_NO_MICROPHONE_PERMISSION));
                return vnuVar.c.h(uri, vdmVar3.a());
            }
            if (vntVar == defpackage.vnt.a) {
                return vnuVar.a(uri, new agux(0L, java.util.concurrent.TimeUnit.MILLISECONDS), true, this.e);
            }
        }
        return aiql.z(0);
    }
}
