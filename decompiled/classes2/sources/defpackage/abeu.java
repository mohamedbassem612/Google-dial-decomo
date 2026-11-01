package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class abeu implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ abeu(android.content.Context context, android.content.pm.ResolveInfo resolveInfo, java.lang.CharSequence charSequence, long j, int i) {
        this.$cid = i;
        this.b = context;
        this.d = resolveInfo;
        this.c = charSequence;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [dpf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object a(java.lang.Object obj) {
        if (this.$cid != 0) {
            defpackage.bhb.b.a(this.b, this.d, java.lang.Boolean.FALSE, this.c, new dky(this.a));
            ((defpackage.bhi) obj).a();
            return aojh.a;
        }
        csj csjVar = (csj) obj;
        int i = abew.a;
        aooh.f(csjVar, "$this$drawBehind");
        float fDl = this.b.dl(16.0f);
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fDl);
        long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fDl);
        for (defpackage.abfa abfaVar : this.c) {
            java.lang.Object obj2 = this.d;
            abeq abeqVar = abfaVar.a;
            java.lang.String str = (java.lang.String) obj2;
            boolean z = false;
            if (aoov.u(str, " ", abeqVar.b(), false) && aoov.u(str, " ", abeqVar.a() - 1, false)) {
                z = true;
            }
            long j = (jFloatToRawIntBits << 32) | (4294967295L & jFloatToRawIntBits2);
            cpk cpkVar = new cpk(j);
            if (!z || !abfaVar.c) {
                cpkVar = null;
            }
            long j2 = cpkVar != null ? cpkVar.a : 0L;
            cpk cpkVar2 = new cpk(j);
            if (!z || !abfaVar.d) {
                cpkVar2 = null;
            }
            long j3 = cpkVar2 != null ? cpkVar2.a : 0L;
            long j4 = this.a;
            cpx cpxVar = new cpx((byte[]) null);
            cpn cpnVar = abfaVar.b;
            cpxVar.q(new cpo(cpnVar.b, cpnVar.c + csjVar.dl(1.0f), cpnVar.d, cpnVar.e - csjVar.dl(1.0f), j2, j3, j3, j2), 1);
            den.S(csjVar, cpxVar, j4, csl.a, 52);
        }
        return aojh.a;
    }

    public /* synthetic */ abeu(dpf dpfVar, java.util.List list, java.lang.String str, long j, int i) {
        this.$cid = i;
        this.b = dpfVar;
        this.c = list;
        this.d = str;
        this.a = j;
    }
}
