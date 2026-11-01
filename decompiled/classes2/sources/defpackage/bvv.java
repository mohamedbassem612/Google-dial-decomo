package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bvv implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ float a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ bvv(defpackage.auo auoVar, float f, aonj aonjVar, int i) {
        this.$cid = i;
        this.c = auoVar;
        this.a = f;
        this.b = aonjVar;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [aonj, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        if (this.$cid == 0) {
            czb czbVar = (czb) obj;
            aii aiiVar = ((defpackage.bvx) this.c).d;
            czbVar.u((czc) this.b, (int) (aiiVar != null ? ((java.lang.Number) aiiVar.d()).floatValue() : this.a), 0, 0.0f);
            return aojh.a;
        }
        long jLongValue = ((java.lang.Long) obj).longValue();
        defpackage.auo auoVar = (defpackage.auo) this.c;
        long j = auoVar.c;
        if (j == Long.MIN_VALUE) {
            auoVar.c = jLongValue;
            j = jLongValue;
        }
        float f = this.a;
        float f2 = auoVar.e;
        aiw aisVar = new ais(f2);
        long jA = f == 0.0f ? auoVar.b.a(new ais(f2), defpackage.auo.a, auoVar.d) : aopc.j((jLongValue - j) / f);
        ?? r12 = this.b;
        defpackage.alp alpVar = auoVar.b;
        ais aisVar2 = defpackage.auo.a;
        float f3 = alpVar.c(jA, aisVar, aisVar2, auoVar.d).a;
        auoVar.d = alpVar.d(jA, aisVar, aisVar2, auoVar.d);
        auoVar.c = jLongValue;
        float f4 = auoVar.e - f3;
        auoVar.e = f3;
        r12.a(java.lang.Float.valueOf(f4));
        return aojh.a;
    }

    public /* synthetic */ bvv(czc czcVar, defpackage.bvx bvxVar, float f, int i) {
        this.$cid = i;
        this.b = czcVar;
        this.c = bvxVar;
        this.a = f;
    }
}
