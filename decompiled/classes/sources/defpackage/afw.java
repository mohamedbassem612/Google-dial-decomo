package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class afw implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ afw(java.lang.Object obj, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        ob obVar;
        int i = this.$cid;
        boolean z = false;
        boolean z2 = true;
        if (i == 0) {
            defpackage.cra craVar = (defpackage.cra) obj;
            defpackage.aonj aonjVar = defpackage.aga.a;
            if (!this.a && ((java.lang.Boolean) this.b.a()).booleanValue()) {
                z = true;
            }
            craVar.s(z);
            return defpackage.aojh.a;
        }
        if (i == 1) {
            boolean z3 = this.a;
            java.lang.Object obj2 = this.b;
            ((of) obj2).d(z3);
            obVar = new ob(obj2, 0);
        } else {
            if (i != 2) {
                defpackage.csj csjVar = (defpackage.csj) obj;
                defpackage.aooh.f(csjVar, "$this$Canvas");
                for (abhf abhfVar : this.b) {
                    if (abhfVar.a() != 0.0f) {
                        long j = z2 != this.a ? -4294967296L : -72057594037927936L;
                        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(((java.lang.Number) abhfVar.a.a()).floatValue() * java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L)))) & 4294967295L);
                        float fA = defpackage.cpp.a(jFloatToRawIntBits);
                        csjVar = csjVar;
                        csjVar.x(j, defpackage.mni.aM(defpackage.cdh.q(csjVar.o()), defpackage.cdh.q(jFloatToRawIntBits)), jFloatToRawIntBits, (((long) java.lang.Float.floatToRawIntBits(fA)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fA)) & 4294967295L), defpackage.csl.a, abhfVar.a());
                        z2 = true;
                    }
                }
                return defpackage.aojh.a;
            }
            boolean z4 = this.a;
            java.lang.Object obj3 = this.b;
            ((defpackage.fya) obj3).g(z4);
            obVar = new ob(obj3, 2);
        }
        return obVar;
    }

    public /* synthetic */ afw(boolean z, defpackage.aomy aomyVar, int i) {
        this.$cid = i;
        this.a = z;
        this.b = aomyVar;
    }
}
