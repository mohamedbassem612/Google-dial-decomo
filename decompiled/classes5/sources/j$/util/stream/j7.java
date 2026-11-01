package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class j7 extends j$.util.stream.p7 implements java.util.function.DoubleConsumer {
    @Override // java.lang.Iterable, j$.lang.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public j$.util.p0 spliterator() {
        return new j$.util.stream.i7(this, 0, this.c, 0, this.b);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        A();
        double[] dArr = (double[]) this.e;
        int i = this.b;
        this.b = i + 1;
        dArr[i] = d;
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.DoubleConsumer) {
            d((java.util.function.DoubleConsumer) consumer);
        } else {
            if (j$.util.stream.l9.a) {
                j$.util.stream.l9.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            j$.com.android.tools.r8.a.e((j$.util.stream.i7) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        j$.util.p0 p0VarSpliterator = spliterator();
        j$.util.Objects.requireNonNull(p0VarSpliterator);
        return new j$.util.c1(p0VarSpliterator);
    }

    @Override // j$.util.stream.p7
    public final void s(java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        double[] dArr = (double[]) obj;
        java.util.function.DoubleConsumer doubleConsumer = (java.util.function.DoubleConsumer) obj2;
        while (i < i2) {
            doubleConsumer.accept(dArr[i]);
            i++;
        }
    }

    public final java.lang.String toString() {
        double[] dArr = (double[]) b();
        if (dArr.length < 200) {
            return java.lang.String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), java.lang.Integer.valueOf(dArr.length), java.lang.Integer.valueOf(this.c), java.util.Arrays.toString(dArr));
        }
        return java.lang.String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), java.lang.Integer.valueOf(dArr.length), java.lang.Integer.valueOf(this.c), java.util.Arrays.toString(java.util.Arrays.copyOf(dArr, 200)));
    }
}
