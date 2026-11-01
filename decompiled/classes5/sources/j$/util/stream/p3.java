package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class p3 extends j$.util.stream.x2 implements j$.util.stream.m2 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(java.lang.Object obj) {
        int i = this.b;
        java.lang.Object[] objArr = this.a;
        if (i >= objArr.length) {
            j$.time.g.e("Accept exceeded fixed size of %d", new java.lang.Object[]{java.lang.Integer.valueOf(objArr.length)});
        } else {
            this.b = i + 1;
            objArr[i] = obj;
        }
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.m2
    public final j$.util.stream.u2 build() {
        int i = this.b;
        java.lang.Object[] objArr = this.a;
        if (i >= objArr.length) {
            return this;
        }
        j$.time.g.e("Current size %d is less than fixed size %d", new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(objArr.length)});
        return null;
    }

    @Override // j$.util.stream.f6
    public final void end() {
        int i = this.b;
        java.lang.Object[] objArr = this.a;
        if (i < objArr.length) {
            j$.time.g.e("End size %d is less than fixed size %d", new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(objArr.length)});
        }
    }

    @Override // j$.util.stream.f6
    public final void p(long j) {
        java.lang.Object[] objArr = this.a;
        if (j == objArr.length) {
            this.b = 0;
        } else {
            j$.time.g.e("Begin size %d is not equal to fixed size %d", new java.lang.Object[]{java.lang.Long.valueOf(j), java.lang.Integer.valueOf(objArr.length)});
        }
    }

    @Override // j$.util.stream.f6
    public final boolean t() {
        return false;
    }

    @Override // j$.util.stream.x2
    public final java.lang.String toString() {
        java.lang.Object[] objArr = this.a;
        return java.lang.String.format("FixedNodeBuilder[%d][%s]", java.lang.Integer.valueOf(objArr.length - this.b), java.util.Arrays.toString(objArr));
    }

    @Override // j$.util.stream.f6
    public final /* synthetic */ void accept(int i) {
        j$.util.stream.n4.k();
        throw null;
    }

    @Override // j$.util.stream.f6, j$.util.stream.e6, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        j$.util.stream.n4.l();
        throw null;
    }

    @Override // j$.util.stream.f6
    public final /* synthetic */ void accept(double d) {
        j$.util.stream.n4.d();
        throw null;
    }
}
