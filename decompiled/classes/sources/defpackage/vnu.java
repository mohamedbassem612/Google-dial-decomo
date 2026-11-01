package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vnu {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/sodatranscribe/impl/VvmSodaTranscriptionWorkStarter");
    public final defpackage.rlv b;
    public final defpackage.vdo c;
    public final defpackage.aoin d;
    private final defpackage.ajct e;
    private final defpackage.ajct f;
    private final android.content.Context g;
    private final defpackage.zjx h;
    private final defpackage.zrw i;
    private final defpackage.twp j;
    private final defpackage.ahbv k;
    private final defpackage.gat l;

    public vnu(defpackage.ajct ajctVar, defpackage.ajct ajctVar2, android.content.Context context, defpackage.zjx zjxVar, defpackage.ahbv ahbvVar, defpackage.gat gatVar, defpackage.twp twpVar, defpackage.rlv rlvVar, defpackage.vdo vdoVar, defpackage.zrw zrwVar, defpackage.aoin aoinVar) {
        this.e = ajctVar;
        this.f = ajctVar2;
        this.g = context;
        this.h = zjxVar;
        this.k = ahbvVar;
        this.l = gatVar;
        this.j = twpVar;
        this.b = rlvVar;
        this.c = vdoVar;
        this.i = zrwVar;
        this.d = aoinVar;
    }

    public final defpackage.ajcq a(android.net.Uri uri, defpackage.agux aguxVar, boolean z, boolean z2) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/voicemail/service/sodatranscribe/impl/VvmSodaTranscriptionWorkStarter", "enqueueSodaTranscription", 190, "VvmSodaTranscriptionWorkStarter.java")).v("Attempt to enqueue soda transcription work");
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        defpackage.aguv aguvVarA = defpackage.aguz.a(defpackage.vnv.class);
        defpackage.ipc ipcVar = new defpackage.ipc((char[]) null);
        ipcVar.x(java.lang.String.valueOf(android.provider.VoicemailContract.Voicemails.CONTENT_URI), java.lang.String.valueOf(uri));
        ipcVar.w("enqueue_timestamp", epochMilli);
        ipcVar.v("worker_feature", true != z2 ? 1 : 2);
        aguvVarA.f = ipcVar.q();
        java.lang.CharSequence[] charSequenceArr = {"vvm_soda_transcription", java.lang.String.valueOf(uri)};
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequenceArr[0]);
        sb.append((java.lang.CharSequence) "_");
        sb.append(charSequenceArr[1]);
        aguvVarA.f(new defpackage.aguy(sb.toString(), 4));
        aguvVarA.c(aguxVar);
        defpackage.grj grjVar = defpackage.grj.a;
        aguvVarA.k = defpackage.ahyn.h(new defpackage.agux(5L, java.util.concurrent.TimeUnit.MINUTES));
        aguvVarA.j = defpackage.ahyn.h(grjVar);
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(this.h.b(aguvVarA.a()));
        vfp vfpVar = new vfp(this, uri, 15);
        defpackage.ajct ajctVar = this.f;
        return ahrvVarG.h(vfpVar, ajctVar).f(java.lang.Exception.class, new aczj(this, z, uri, z2, 1), ajctVar);
    }

    public final void b(android.net.Uri uri, android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z) {
        defpackage.ajcq ajcqVarG;
        android.content.Context context = this.g;
        defpackage.akff akffVarA = defpackage.akff.a(defpackage.gus.ae(context).toLanguageTag());
        defpackage.twp twpVar = this.j;
        defpackage.ajcq ajcqVarC = twpVar.c(akffVarA);
        defpackage.ajcq ajcqVarE = twpVar.e();
        vmj vmjVar = new vmj(13);
        defpackage.ajct ajctVar = this.f;
        defpackage.ajcq ajcqVarH = defpackage.ahvr.H(ajcqVarE, vmjVar, ajctVar);
        defpackage.ajcq ajcqVarC2 = this.i.c();
        defpackage.ajcq ajcqVarO = defpackage.ahvr.ak(ajcqVarH, ajcqVarC, ajcqVarC2).o(new defpackage.joq((java.lang.Object) this, ajcqVarH, ajcqVarC, ajcqVarC2, 17), ajctVar);
        if (this.l.y(context, phoneAccountHandle)) {
            defpackage.ahbv ahbvVar = this.k;
            ajcqVarG = ((defpackage.aogc) ahbvVar.d).aM(phoneAccountHandle).g(new vfs(ahbvVar, phoneAccountHandle, 11)).b(defpackage.mgv.VVM_HAS_ACCEPTED_TOS).g();
        } else {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/voicemail/service/sodatranscribe/impl/VvmSodaTranscriptionWorkStarter", "canTranscribeVoicemail", 228, "VvmSodaTranscriptionWorkStarter.java")).v("transcription is not enabled");
            ajcqVarG = defpackage.aiql.z(java.lang.Boolean.FALSE);
        }
        defpackage.ajcq ajcqVar = ajcqVarG;
        defpackage.agsm.i(995, defpackage.ahvr.ak(ajcqVarO, ajcqVar).p(new vns(this, ajcqVar, ajcqVarO, uri, z), this.e), "Failed to enqueue soda transcription work", new java.lang.Object[0]);
    }
}
