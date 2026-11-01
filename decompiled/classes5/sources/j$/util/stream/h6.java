package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class h6 extends j$.util.stream.w5 {
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(j$.util.stream.x5 x5Var, int i, long j, long j2) {
        super(x5Var, i, (byte) 0);
        this.n = j;
        this.o = j2;
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.u2 H(j$.util.stream.a aVar, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        long j;
        long j2;
        long jQ = aVar.q(spliterator);
        if (jQ > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.stream.a aVar2 = aVar;
            while (aVar2.e > 0) {
                aVar2 = aVar2.b;
            }
            return j$.util.stream.n4.y(aVar, j$.util.stream.q6.h(aVar2.E(), spliterator, this.n, this.o), true, intFunction);
        }
        if (j$.util.stream.v7.ORDERED.p(aVar.f)) {
            return (j$.util.stream.u2) new j$.util.stream.p6(this, aVar, spliterator, intFunction, this.n, this.o).invoke();
        }
        j$.util.Spliterator spliteratorQ = aVar.Q(spliterator);
        long j3 = this.n;
        long j4 = this.o;
        if (j3 <= jQ) {
            long jMin = jQ - j3;
            if (j4 >= 0) {
                jMin = java.lang.Math.min(j4, jMin);
            }
            j = jMin;
            j2 = 0;
        } else {
            j = j4;
            j2 = j3;
        }
        return j$.util.stream.n4.y(this, new j$.util.stream.a9(spliteratorQ, j2, j), true, intFunction);
    }

    @Override // j$.util.stream.a
    public final j$.util.Spliterator I(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        long j;
        long jQ = aVar.q(spliterator);
        long jMin = this.o;
        if (jQ > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.Spliterator spliteratorQ = aVar.Q(spliterator);
            long j2 = this.n;
            return new j$.util.stream.u8(spliteratorQ, j2, j$.util.stream.q6.b(j2, jMin));
        }
        if (j$.util.stream.v7.ORDERED.p(aVar.f)) {
            return ((j$.util.stream.u2) new j$.util.stream.p6(this, aVar, spliterator, new j$.util.stream.r0((byte) 28), this.n, this.o).invoke()).spliterator();
        }
        j$.util.Spliterator spliteratorQ2 = aVar.Q(spliterator);
        long j3 = this.n;
        if (j3 <= jQ) {
            long j4 = jQ - j3;
            jMin = jMin >= 0 ? java.lang.Math.min(jMin, j4) : j4;
            j = 0;
        } else {
            j = j3;
        }
        return new j$.util.stream.a9(spliteratorQ2, j, jMin);
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.f6 K(int i, j$.util.stream.f6 f6Var) {
        return new j$.util.stream.g6(f6Var, this.n, this.o);
    }
}
