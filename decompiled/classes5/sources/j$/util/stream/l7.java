package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class l7 extends j$.util.stream.p7 implements java.util.function.IntConsumer {
    @Override // java.lang.Iterable, j$.lang.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public j$.util.Spliterator.OfInt spliterator() {
        return new j$.util.stream.k7(this, 0, this.c, 0, this.b);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        A();
        int[] iArr = (int[]) this.e;
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.IntConsumer) {
            d((java.util.function.IntConsumer) consumer);
        } else {
            if (j$.util.stream.l9.a) {
                j$.util.stream.l9.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            j$.com.android.tools.r8.a.f((j$.util.stream.k7) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        j$.util.Spliterator.OfInt ofIntSpliterator = spliterator();
        j$.util.Objects.requireNonNull(ofIntSpliterator);
        return new j$.util.a1(ofIntSpliterator);
    }

    @Override // j$.util.stream.p7
    public final java.lang.Object newArray(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.p7
    public final void s(java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        int[] iArr = (int[]) obj;
        java.util.function.IntConsumer intConsumer = (java.util.function.IntConsumer) obj2;
        while (i < i2) {
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    public final java.lang.String toString() {
        int[] iArr = (int[]) b();
        if (iArr.length < 200) {
            return java.lang.String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), java.lang.Integer.valueOf(iArr.length), java.lang.Integer.valueOf(this.c), java.util.Arrays.toString(iArr));
        }
        return java.lang.String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), java.lang.Integer.valueOf(iArr.length), java.lang.Integer.valueOf(this.c), java.util.Arrays.toString(java.util.Arrays.copyOf(iArr, 200)));
    }

    @Override // j$.util.stream.p7
    public final int u(java.lang.Object obj) {
        return ((int[]) obj).length;
    }

    @Override // j$.util.stream.p7
    public final java.lang.Object[] y() {
        return new int[8][];
    }
}
