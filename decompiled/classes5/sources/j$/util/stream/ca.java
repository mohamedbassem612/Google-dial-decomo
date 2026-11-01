package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class ca extends j$.util.stream.ka implements java.util.function.DoubleConsumer, j$.util.p0 {
    public double e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ca(j$.util.Spliterator spliterator, byte b) {
        super(spliterator);
        this.f = b;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.d = (this.d + 1) & 63;
        this.e = d;
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.ka
    public final j$.util.Spliterator b(j$.util.Spliterator spliterator) {
        switch (this.f) {
            case 0:
                return new j$.util.stream.ca((j$.util.p0) spliterator, this, (byte) 0);
            default:
                return new j$.util.stream.ca((j$.util.p0) spliterator, this, (byte) 1);
        }
    }

    @Override // j$.util.w0
    public final void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // j$.util.p0
    public final boolean tryAdvance(java.util.function.DoubleConsumer doubleConsumer) {
        byte b = this.f;
        j$.util.Spliterator spliterator = this.a;
        java.util.function.DoublePredicate doublePredicate = null;
        switch (b) {
            case 0:
                if (!this.c) {
                    return ((j$.util.p0) spliterator).tryAdvance(doubleConsumer);
                }
                this.c = false;
                boolean zTryAdvance = ((j$.util.p0) spliterator).tryAdvance((java.util.function.DoubleConsumer) this);
                if (zTryAdvance) {
                    boolean zA = a();
                    double d = this.e;
                    if (zA) {
                        doublePredicate.test(d);
                        throw null;
                    }
                    doubleConsumer.accept(d);
                }
                return zTryAdvance;
            default:
                if (this.c && a() && ((j$.util.p0) spliterator).tryAdvance((java.util.function.DoubleConsumer) this)) {
                    doublePredicate.test(this.e);
                    throw null;
                }
                this.c = false;
                return false;
        }
    }

    @Override // j$.util.stream.ka, j$.util.Spliterator
    public final j$.util.p0 trySplit() {
        switch (this.f) {
            case 0:
                return (j$.util.p0) trySplit();
            default:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.p0) super.trySplit();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ca(j$.util.Spliterator spliterator, j$.util.stream.ka kaVar, byte b) {
        super(spliterator, kaVar);
        this.f = b;
    }

    @Override // j$.util.stream.ka, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.com.android.tools.r8.a.e(this, consumer);
    }

    @Override // j$.util.stream.ka, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator trySplit() {
        switch (this.f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.ka, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.w0 trySplit() {
        switch (this.f) {
            case 0:
                return (j$.util.w0) trySplit();
            default:
                return trySplit();
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.com.android.tools.r8.a.s(this, consumer);
    }

    @Override // j$.util.w0
    public final /* bridge */ /* synthetic */ boolean tryAdvance(java.lang.Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((java.util.function.DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((java.util.function.DoubleConsumer) obj);
        }
    }
}
