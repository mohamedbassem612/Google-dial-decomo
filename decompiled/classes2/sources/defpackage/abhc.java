package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class abhc implements crd {
    private final boolean a;
    private final aomy b;

    public abhc(boolean z, aomy aomyVar) {
        aooh.f(aomyVar, "maxWidth");
        this.a = z;
        this.b = aomyVar;
    }

    public final cqx a(long j, dpq dpqVar, dpf dpfVar) {
        aooh.f(dpqVar, "layoutDirection");
        aooh.f(dpfVar, "density");
        int i = (int) (j >> 32);
        long jBk = mni.bk(aooc.s(((java.lang.Number) this.b.a()).floatValue(), 0.0f, java.lang.Float.intBitsToFloat(i)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        return new cqv(cdh.x(this.a ? 0L : ((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i) - java.lang.Float.intBitsToFloat((int) (jBk >> 32)))) << 32, jBk));
    }
}
