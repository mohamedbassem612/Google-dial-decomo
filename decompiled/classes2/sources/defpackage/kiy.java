package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kiy implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ kiy(long j, java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = j;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [aomy, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            android.view.View view = (android.view.View) obj;
            aooh.f(view, "view");
            vqf vqfVarBy = wsc.by(utu.a.m());
            vqfVarBy.z(this.a);
            vqfVarBy.C(4);
            vqfVarBy.B((java.lang.String) this.b);
            vqfVarBy.A((abwd) this.c);
            wsc.bf(view.getContext(), vqfVarBy.x());
            return aojh.a;
        }
        if (i != 1) {
            afpl afplVar = (afpl) obj;
            aooh.f(afplVar, "$this$builder");
            defpackage.mtn mtnVar = (defpackage.mtn) this.c;
            if (mtnVar.b) {
                afplVar.F(new aev(this.a, this.b, 7));
            }
            afplVar.C(mtnVar.a);
            return aojh.a;
        }
        csj csjVar = (csj) obj;
        aooh.f(csjVar, "$this$Canvas");
        ?? r12 = this.b;
        float fFloatValue = 1.0f - ((java.lang.Number) r12.a()).floatValue();
        den.O(csjVar, this.a, (fFloatValue * 360.0f) - 90.0f, ((java.lang.Number) r12.a()).floatValue() * 360.0f, 0L, 0L, (den) this.c, 880);
        return aojh.a;
    }

    public /* synthetic */ kiy(defpackage.mtn mtnVar, long j, java.lang.String str, int i) {
        this.$cid = i;
        this.c = mtnVar;
        this.a = j;
        this.b = str;
    }
}
