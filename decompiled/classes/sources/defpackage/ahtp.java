package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahtp implements defpackage.aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ ahtp(defpackage.ahda ahdaVar, java.lang.String str, defpackage.ahth ahthVar, android.view.View view, int i) {
        this.$cid = i;
        this.a = ahdaVar;
        this.b = str;
        this.c = ahthVar;
        this.d = view;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [ahth, java.lang.Object] */
    @Override // defpackage.aomy
    public final java.lang.Object a() throws java.io.IOException {
        if (this.$cid != 0) {
            ((defpackage.kca) this.a).e.a(new defpackage.kav(((java.lang.Boolean) this.c.a()).booleanValue(), (defpackage.lpv) this.b, defpackage.kcq.a((android.content.Context) this.d)));
            return defpackage.aojh.a;
        }
        defpackage.ahok ahokVarG = ((defpackage.ahpz) ((defpackage.ahda) this.a).a).g(1484, "Clicked ".concat((java.lang.String) this.b));
        try {
            defpackage.ahvr.j(this.c, (android.view.View) this.d);
            defpackage.ajsz.ak(ahokVarG, null);
            return defpackage.aojh.a;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahokVarG, th);
                throw th2;
            }
        }
    }

    public /* synthetic */ ahtp(defpackage.kca kcaVar, defpackage.cer cerVar, defpackage.lpv lpvVar, android.content.Context context, int i) {
        this.$cid = i;
        this.a = kcaVar;
        this.c = cerVar;
        this.b = lpvVar;
        this.d = context;
    }
}
