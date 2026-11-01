package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class f2 extends j$.util.stream.g2 implements j$.util.stream.c6 {
    @Override // j$.util.stream.c6
    public final /* synthetic */ void L(java.lang.Double d) {
        j$.util.stream.n4.e(this, d);
    }

    @Override // j$.util.stream.g2, j$.util.stream.f6
    public final void accept(double d) {
        if (this.a) {
            return;
        }
        java.util.function.DoublePredicate doublePredicate = null;
        doublePredicate.test(d);
        throw null;
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object obj) {
        L((java.lang.Double) obj);
    }
}
