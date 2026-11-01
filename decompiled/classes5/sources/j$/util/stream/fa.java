package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class fa extends j$.util.stream.ka implements java.util.function.IntConsumer, j$.util.Spliterator.OfInt {
    public final java.util.function.IntPredicate e;
    public int f;

    public fa(j$.util.Spliterator.OfInt ofInt, j$.util.stream.fa faVar) {
        super(ofInt, faVar);
        this.e = faVar.e;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.d = (this.d + 1) & 63;
        this.f = i;
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.w0
    public final void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        while (tryAdvance(intConsumer)) {
        }
    }

    @Override // j$.util.w0
    public final /* bridge */ /* synthetic */ boolean tryAdvance(java.lang.Object obj) {
        return tryAdvance((java.util.function.IntConsumer) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.com.android.tools.r8.a.t(this, consumer);
    }

    public fa(j$.util.Spliterator.OfInt ofInt, java.util.function.IntPredicate intPredicate) {
        super(ofInt);
        this.e = intPredicate;
    }

    @Override // j$.util.stream.ka, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.com.android.tools.r8.a.f(this, consumer);
    }
}
