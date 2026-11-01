package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tcn implements mab {
    private final android.content.Context a;
    private final rlv b;

    public tcn(android.content.Context context, rlv rlvVar) {
        aooh.f(context, "context");
        aooh.f(rlvVar, "loggingBindings");
        this.a = context;
        this.b = rlvVar;
    }

    public final mac a(maf mafVar) {
        if (!mafVar.a.n) {
            return null;
        }
        java.lang.String string = this.a.getString(2132019991);
        aooh.e(string, "getString(...)");
        return new mac(new mae(string, 2132083190), (mae) null, (maa) null, true);
    }

    public final void b(android.view.View view, maf mafVar) {
        this.b.o(rmx.lV);
        android.content.Context context = view.getContext();
        aooh.e(context, "getContext(...)");
        android.content.Context context2 = view.getContext();
        java.lang.String str = mafVar.a.l;
        android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.android.dialer.rtt.transcript.RttTranscriptActivity.class);
        intent.putExtra("extra_transcript_id", str);
        intent.putExtra("extra_primary_text", mafVar.b);
        defpackage.abwd abwdVar = mafVar.c;
        ahvr.ci(abwdVar);
        defpackage.sns.u(intent, "extra_photo_info", abwdVar);
        ahqx.l(context, intent);
    }

    public final void c() {
        this.b.o(rmx.lU);
    }
}
