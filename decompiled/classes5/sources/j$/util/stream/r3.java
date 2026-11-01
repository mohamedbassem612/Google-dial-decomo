package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class r3 extends j$.util.stream.q3 implements j$.util.stream.k2 {
    @Override // j$.util.stream.f6
    public final void accept(int i) {
        int i2 = this.b;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            j$.time.g.e("Accept exceeded fixed size of %d", new java.lang.Object[]{java.lang.Integer.valueOf(iArr.length)});
        } else {
            this.b = i2 + 1;
            iArr[i2] = i;
        }
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.k2, j$.util.stream.m2
    public final j$.util.stream.q2 build() {
        int i = this.b;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            return this;
        }
        j$.time.g.e("Current size %d is less than fixed size %d", new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(iArr.length)});
        return null;
    }

    @Override // j$.util.stream.f6
    public final void end() {
        int i = this.b;
        int[] iArr = this.a;
        if (i < iArr.length) {
            j$.time.g.e("End size %d is less than fixed size %d", new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(iArr.length)});
        }
    }

    @Override // j$.util.stream.f6
    public final void p(long j) {
        int[] iArr = this.a;
        if (j == iArr.length) {
            this.b = 0;
        } else {
            j$.time.g.e("Begin size %d is not equal to fixed size %d", new java.lang.Object[]{java.lang.Long.valueOf(j), java.lang.Integer.valueOf(iArr.length)});
        }
    }

    @Override // j$.util.stream.d6
    public final /* synthetic */ void r(java.lang.Integer num) {
        j$.util.stream.n4.g(this, num);
    }

    @Override // j$.util.stream.f6
    public final boolean t() {
        return false;
    }

    @Override // j$.util.stream.q3
    public final java.lang.String toString() {
        int[] iArr = this.a;
        return java.lang.String.format("IntFixedNodeBuilder[%d][%s]", java.lang.Integer.valueOf(iArr.length - this.b), java.util.Arrays.toString(iArr));
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.f6, j$.util.stream.e6, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        j$.util.stream.n4.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(java.lang.Object obj) {
        r((java.lang.Integer) obj);
    }

    @Override // j$.util.stream.m2
    public final /* bridge */ /* synthetic */ j$.util.stream.u2 build() {
        build();
        return this;
    }

    @Override // j$.util.stream.f6
    public final /* synthetic */ void accept(double d) {
        j$.util.stream.n4.d();
        throw null;
    }
}
