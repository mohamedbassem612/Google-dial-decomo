package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class s9 extends j$.util.stream.a6 {
    public boolean b;

    @Override // j$.util.stream.e6, java.util.function.LongConsumer
    public final void accept(long j) {
        if (this.b) {
            java.util.function.LongPredicate longPredicate = null;
            longPredicate.test(j);
            throw null;
        }
    }

    @Override // j$.util.stream.a6, j$.util.stream.f6
    public final void p(long j) {
        this.a.p(-1L);
    }

    @Override // j$.util.stream.a6, j$.util.stream.f6
    public final boolean t() {
        return !this.b || this.a.t();
    }
}
