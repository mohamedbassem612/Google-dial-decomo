package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class n7 extends j$.util.stream.p7 implements java.util.function.LongConsumer {
    @Override // java.lang.Iterable, j$.lang.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public j$.util.Spliterator.OfLong spliterator() {
        return new j$.util.stream.m7(this, 0, this.c, 0, this.b);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        A();
        long[] jArr = (long[]) this.e;
        int i = this.b;
        this.b = i + 1;
        jArr[i] = j;
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.util.function.LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.LongConsumer) {
            d((java.util.function.LongConsumer) consumer);
        } else {
            if (j$.util.stream.l9.a) {
                j$.util.stream.l9.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            j$.com.android.tools.r8.a.g((j$.util.stream.m7) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        j$.util.Spliterator.OfLong ofLongSpliterator = spliterator();
        j$.util.Objects.requireNonNull(ofLongSpliterator);
        return new j$.util.b1(ofLongSpliterator);
    }

    @Override // j$.util.stream.p7
    public final java.lang.Object newArray(int i) {
        return new long[i];
    }

    @Override // j$.util.stream.p7
    public final void s(java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        long[] jArr = (long[]) obj;
        java.util.function.LongConsumer longConsumer = (java.util.function.LongConsumer) obj2;
        while (i < i2) {
            longConsumer.accept(jArr[i]);
            i++;
        }
    }

    public final java.lang.String toString() {
        long[] jArr = (long[]) b();
        if (jArr.length < 200) {
            return java.lang.String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), java.lang.Integer.valueOf(jArr.length), java.lang.Integer.valueOf(this.c), java.util.Arrays.toString(jArr));
        }
        return java.lang.String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), java.lang.Integer.valueOf(jArr.length), java.lang.Integer.valueOf(this.c), java.util.Arrays.toString(java.util.Arrays.copyOf(jArr, 200)));
    }

    @Override // j$.util.stream.p7
    public final int u(java.lang.Object obj) {
        return ((long[]) obj).length;
    }

    @Override // j$.util.stream.p7
    public final java.lang.Object[] y() {
        return new long[8][];
    }
}
