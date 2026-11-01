package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class w3 extends j$.util.stream.y3 implements j$.util.w0 {
    @Override // j$.util.w0
    public final void forEachRemaining(java.lang.Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (tryAdvance(obj)) {
            }
            return;
        }
        j$.util.Spliterator spliterator = this.c;
        if (spliterator != null) {
            ((j$.util.w0) spliterator).forEachRemaining(obj);
            return;
        }
        java.util.ArrayDeque arrayDequeB = b();
        while (true) {
            j$.util.stream.t2 t2Var = (j$.util.stream.t2) j$.util.stream.y3.a(arrayDequeB);
            if (t2Var == null) {
                this.a = null;
                return;
            }
            t2Var.d(obj);
        }
    }

    @Override // j$.util.w0
    public final boolean tryAdvance(java.lang.Object obj) {
        j$.util.stream.t2 t2Var;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((j$.util.w0) this.d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.c == null && (t2Var = (j$.util.stream.t2) j$.util.stream.y3.a(this.e)) != null) {
                j$.util.w0 w0VarSpliterator = t2Var.spliterator();
                this.d = w0VarSpliterator;
                return w0VarSpliterator.tryAdvance(obj);
            }
            this.a = null;
        }
        return zTryAdvance;
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        forEachRemaining((java.lang.Object) intConsumer);
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        forEachRemaining((java.lang.Object) longConsumer);
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer) {
        forEachRemaining((java.lang.Object) doubleConsumer);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        return tryAdvance((java.lang.Object) intConsumer);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        return tryAdvance((java.lang.Object) longConsumer);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.DoubleConsumer doubleConsumer) {
        return tryAdvance((java.lang.Object) doubleConsumer);
    }
}
