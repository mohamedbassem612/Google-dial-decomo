package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class i3 extends j$.util.stream.h3 implements j$.util.stream.j2 {
    @Override // j$.util.stream.c6
    public final /* synthetic */ void L(java.lang.Double d) {
        j$.util.stream.n4.e(this, d);
    }

    @Override // j$.util.stream.f6
    public final void accept(double d) {
        int i = this.b;
        double[] dArr = this.a;
        if (i >= dArr.length) {
            j$.time.g.e("Accept exceeded fixed size of %d", new java.lang.Object[]{java.lang.Integer.valueOf(dArr.length)});
        } else {
            this.b = i + 1;
            dArr[i] = d;
        }
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.j2, j$.util.stream.m2
    public final j$.util.stream.o2 build() {
        int i = this.b;
        double[] dArr = this.a;
        if (i >= dArr.length) {
            return this;
        }
        j$.time.g.e("Current size %d is less than fixed size %d", new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(dArr.length)});
        return null;
    }

    @Override // j$.util.stream.f6
    public final void end() {
        int i = this.b;
        double[] dArr = this.a;
        if (i < dArr.length) {
            j$.time.g.e("End size %d is less than fixed size %d", new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(dArr.length)});
        }
    }

    @Override // j$.util.stream.f6
    public final void p(long j) {
        double[] dArr = this.a;
        if (j == dArr.length) {
            this.b = 0;
        } else {
            j$.time.g.e("Begin size %d is not equal to fixed size %d", new java.lang.Object[]{java.lang.Long.valueOf(j), java.lang.Integer.valueOf(dArr.length)});
        }
    }

    @Override // j$.util.stream.f6
    public final boolean t() {
        return false;
    }

    @Override // j$.util.stream.h3
    public final java.lang.String toString() {
        double[] dArr = this.a;
        return java.lang.String.format("DoubleFixedNodeBuilder[%d][%s]", java.lang.Integer.valueOf(dArr.length - this.b), java.util.Arrays.toString(dArr));
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.f6, j$.util.stream.e6, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        j$.util.stream.n4.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(java.lang.Object obj) {
        L((java.lang.Double) obj);
    }

    @Override // j$.util.stream.m2
    public final /* bridge */ /* synthetic */ j$.util.stream.u2 build() {
        build();
        return this;
    }

    @Override // j$.util.stream.f6
    public final /* synthetic */ void accept(int i) {
        j$.util.stream.n4.k();
        throw null;
    }
}
