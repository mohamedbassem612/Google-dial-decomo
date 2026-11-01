package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lca implements defpackage.mab {
    public static final aimz a = aimz.i("com/android/dialer/callscreen/impl/conversationhistorycalldetails/CallDetailsFeatureIntegrationCallScreen");
    private final android.content.Context b;
    private final rlv c;
    private final j$.util.Optional d;
    private final az e;

    public lca(android.content.Context context, rlv rlvVar, j$.util.Optional optional, az azVar) {
        aooh.f(context, "context");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(azVar, "fragmentActivity");
        this.b = context;
        this.c = rlvVar;
        this.d = optional;
        this.e = azVar;
    }

    @Override // defpackage.mab
    public final defpackage.mac a(defpackage.maf mafVar) {
        if (!mafVar.a.m) {
            return null;
        }
        java.lang.String string = this.b.getString(2132020240);
        aooh.e(string, "getString(...)");
        return new defpackage.mac(new defpackage.mae(string, 2132083187), null, new defpackage.maa(2131231115, null), true);
    }

    @Override // defpackage.mab
    public final void b(android.view.View view, defpackage.maf mafVar) {
        ajcq ajcqVarH;
        this.c.o(rmx.lX);
        defpackage.lpa lpaVarA = defpackage.lpa.a(this.e.a(), "load call screen session activity intent");
        ldb ldbVar = (ldb) aooh.q(this.d);
        if (ldbVar != null) {
            android.content.Context context = view.getContext();
            defpackage.kip kipVar = mafVar.a;
            java.lang.String str = mafVar.b;
            abwd abwdVar = mafVar.c;
            zjm zjmVar = ldbVar.f;
            java.lang.String str2 = kipVar.l;
            j$.util.Optional optionalG = zjmVar.g();
            ajcqVarH = ahvr.H(!optionalG.isPresent() ? aiql.z(java.lang.Boolean.FALSE) : ((swv) optionalG.orElseThrow()).b(), new defpackage.lda(context, str2, str, abwdVar, 0), ldbVar.b);
        } else {
            ajcqVarH = null;
        }
        lpaVarA.b(view.getContext(), ajcqVarH, new defpackage.kll(view, 2), new defpackage.jox(6));
    }

    @Override // defpackage.mab
    public final void c() {
        this.c.o(rmx.lW);
    }
}
