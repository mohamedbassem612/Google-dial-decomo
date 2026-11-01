package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class n6 extends j$.util.stream.b0 {
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(j$.util.stream.b0 b0Var, int i, long j, long j2) {
        super(b0Var, i, (byte) 0);
        this.n = j;
        this.o = j2;
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.u2 H(j$.util.stream.a aVar, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        long jQ = aVar.q(spliterator);
        if (jQ > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.stream.a aVar2 = aVar;
            while (aVar2.e > 0) {
                aVar2 = aVar2.b;
            }
            return j$.util.stream.n4.z(aVar, j$.util.stream.q6.h(aVar2.E(), spliterator, this.n, this.o), true);
        }
        if (j$.util.stream.v7.ORDERED.p(aVar.f)) {
            return (j$.util.stream.u2) new j$.util.stream.p6(this, aVar, spliterator, intFunction, this.n, this.o).invoke();
        }
        j$.util.p0 p0Var = (j$.util.p0) aVar.Q(spliterator);
        long j = this.n;
        long jMin = this.o;
        if (j <= jQ) {
            long j2 = jQ - j;
            jMin = jMin >= 0 ? java.lang.Math.min(jMin, j2) : j2;
            j = 0;
        }
        return j$.util.stream.n4.z(this, new j$.util.stream.w8(p0Var, j, jMin), true);
    }

    @Override // j$.util.stream.a
    public final j$.util.Spliterator I(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        long j;
        long jQ = aVar.q(spliterator);
        long jMin = this.o;
        if (jQ > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.p0 p0Var = (j$.util.p0) aVar.Q(spliterator);
            long j2 = this.n;
            return new j$.util.stream.q8(p0Var, j2, j$.util.stream.q6.b(j2, jMin));
        }
        if (j$.util.stream.v7.ORDERED.p(aVar.f)) {
            return ((j$.util.stream.u2) new j$.util.stream.p6(this, aVar, spliterator, new j$.util.stream.z2((byte) 9), this.n, this.o).invoke()).spliterator();
        }
        j$.util.p0 p0Var2 = (j$.util.p0) aVar.Q(spliterator);
        long j3 = this.n;
        if (j3 <= jQ) {
            long j4 = jQ - j3;
            jMin = jMin >= 0 ? java.lang.Math.min(jMin, j4) : j4;
            j = 0;
        } else {
            j = j3;
        }
        return new j$.util.stream.w8(p0Var2, j, jMin);
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.f6 K(int i, j$.util.stream.f6 f6Var) {
        return new j$.util.stream.m6(f6Var, this.n, this.o);
    }
}
