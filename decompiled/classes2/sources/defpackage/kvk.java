package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kvk implements defpackage.mab {
    private final android.content.Context a;
    private final rlv b;
    private final aw c;
    private final zjm d;

    public kvk(android.content.Context context, rlv rlvVar, aw awVar, zjm zjmVar) {
        aooh.f(context, "context");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(awVar, "fragment");
        this.a = context;
        this.b = rlvVar;
        this.c = awVar;
        this.d = zjmVar;
    }

    @Override // defpackage.mab
    public final defpackage.mac a(defpackage.maf mafVar) {
        j$.util.Optional optionalG = this.d.g();
        aooh.e(optionalG, "getFeature(...)");
        kva kvaVar = (kva) aooh.q(optionalG);
        if (kvaVar == null) {
            return null;
        }
        kui kuiVar = mafVar.a.p;
        if (kuiVar == null) {
            kuiVar = kui.a;
        }
        java.lang.String str = kuiVar.c;
        aooh.e(str, "getCallRecordingFilePath(...)");
        if (str.length() == 0) {
            return null;
        }
        java.lang.String string = ((android.content.Context) kvaVar.g.a).getString(2132017763);
        aooh.e(string, "getCallRecordingLinkLabel(...)");
        return new defpackage.mac(new defpackage.mae(string, 2132083186), null, new defpackage.maa(2131231972, java.lang.Integer.valueOf(urg.c(this.a, 2130969072))), true);
    }

    @Override // defpackage.mab
    public final void b(android.view.View view, defpackage.maf mafVar) {
        j$.util.Optional optionalG = this.d.g();
        aooh.e(optionalG, "getFeature(...)");
        kva kvaVar = (kva) aooh.q(optionalG);
        if (kvaVar != null) {
            this.b.o(rmx.lZ);
            aw awVar = this.c;
            defpackage.kip kipVar = mafVar.a;
            long j = kipVar.d;
            kui kuiVar = kipVar.p;
            if (kuiVar == null) {
                kuiVar = kui.a;
            }
            java.lang.String str = mafVar.b;
            android.content.Intent intent = new android.content.Intent(kvaVar.e, (java.lang.Class<?>) com.android.dialer.callrecording.impl.history.CallRecordingSessionActivity.class);
            intent.putExtra("extra_call_creation_time", j);
            intent.putExtra("extra_audio_file_path", kuiVar.c);
            intent.putExtra("extra_primary_text", str);
            awVar.aQ(intent, 10);
        }
    }

    @Override // defpackage.mab
    public final void c() {
        this.b.o(rmx.lY);
    }
}
