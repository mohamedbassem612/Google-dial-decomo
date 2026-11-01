package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jdc implements defpackage.mab {
    private final android.content.Context a;
    private final defpackage.jdb b;
    private final j$.util.Optional c;
    private final rlv d;
    private final iqm e;
    private final aoin f;

    public jdc(android.content.Context context, defpackage.jdb jdbVar, j$.util.Optional optional, rlv rlvVar, iqm iqmVar, aoin aoinVar) {
        aooh.f(context, "context");
        aooh.f(jdbVar, "beeslyCallDetailsDataIntegration");
        aooh.f(optional, "transcriptAudioFeedback");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "enableBeeslySurveyEligibility");
        this.a = context;
        this.b = jdbVar;
        this.c = optional;
        this.d = rlvVar;
        this.e = iqmVar;
        this.f = aoinVar;
    }

    @Override // defpackage.mab
    public final defpackage.mac a(defpackage.maf mafVar) {
        isq isqVar;
        defpackage.kip kipVar = mafVar.a;
        defpackage.mmw mmwVar = kipVar.t;
        if (mmwVar == null) {
            mmwVar = defpackage.mmw.a;
        }
        defpackage.mae maeVar = null;
        if (mmwVar.e || (isqVar = (isq) mni.by(kipVar, this.b)) == null) {
            return null;
        }
        if (!this.e.d() && (isqVar.b & 8) != 0 && (!((java.lang.Boolean) this.f.a()).booleanValue() || isqVar.k)) {
            java.lang.String string = this.a.getString(2132020595);
            aooh.e(string, "getString(...)");
            maeVar = new defpackage.mae(string, 2132083185);
        }
        android.content.Context context = this.a;
        java.lang.String string2 = context.getString(2132017561);
        aooh.e(string2, "getString(...)");
        return new defpackage.mac(new defpackage.mae(string2, 2132083184), maeVar, new defpackage.maa(2131231357, java.lang.Integer.valueOf(urg.c(context, 2130968958))), maeVar != null);
    }

    @Override // defpackage.mab
    public final void b(android.view.View view, defpackage.maf mafVar) {
        rlv rlvVar = this.d;
        rlvVar.o(rmx.wN);
        abwd abwdVar = mafVar.c;
        if (abwdVar == null || ((wsc) aooh.q(this.c)) == null) {
            return;
        }
        vqf vqfVarBy = wsc.by(utu.a.m());
        defpackage.kip kipVar = mafVar.a;
        vqfVarBy.z(kipVar.d);
        vqfVarBy.C(5);
        java.lang.String strC = defpackage.kon.c(kipVar);
        aooh.e(strC, "getUniqueCallId(...)");
        vqfVarBy.B(strC);
        vqfVarBy.A(abwdVar);
        vqfVarBy.y(kipVar.c);
        rlvVar.o(rmx.wP);
        wsc.bf(view.getContext(), vqfVarBy.x());
    }

    @Override // defpackage.mab
    public final void c() {
        this.d.o(rmx.wM);
    }
}
