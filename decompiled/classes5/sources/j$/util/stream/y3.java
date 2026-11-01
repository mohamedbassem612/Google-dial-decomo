package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class y3 implements j$.util.Spliterator {
    public j$.util.stream.u2 a;
    public int b;
    public j$.util.Spliterator c;
    public j$.util.Spliterator d;
    public java.util.ArrayDeque e;

    public y3(j$.util.stream.w2 w2Var) {
        this.a = w2Var;
    }

    public static j$.util.stream.u2 a(java.util.ArrayDeque arrayDeque) {
        while (true) {
            j$.util.stream.u2 u2Var = (j$.util.stream.u2) arrayDeque.pollFirst();
            if (u2Var == null) {
                return null;
            }
            if (u2Var.l() != 0) {
                for (int iL = u2Var.l() - 1; iL >= 0; iL--) {
                    arrayDeque.addFirst(u2Var.a(iL));
                }
            } else if (u2Var.count() > 0) {
                return u2Var;
            }
        }
    }

    public final java.util.ArrayDeque b() {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(8);
        int iL = this.a.l();
        while (true) {
            iL--;
            if (iL < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.a(iL));
        }
    }

    public final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (this.d == null) {
            j$.util.Spliterator spliterator = this.c;
            if (spliterator == null) {
                java.util.ArrayDeque arrayDequeB = b();
                this.e = arrayDequeB;
                j$.util.stream.u2 u2VarA = a(arrayDequeB);
                if (u2VarA == null) {
                    this.a = null;
                    return false;
                }
                this.d = u2VarA.spliterator();
            } else {
                this.d = spliterator;
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.a == null) {
            return 0L;
        }
        j$.util.Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.l(); i++) {
            jCount += this.a.a(i).count();
        }
        return jCount;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return j$.util.Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        j$.util.stream.u2 u2Var = this.a;
        if (u2Var == null || this.d != null) {
            return null;
        }
        j$.util.Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        int i = this.b;
        int iL = u2Var.l() - 1;
        j$.util.stream.u2 u2Var2 = this.a;
        int i2 = this.b;
        if (i < iL) {
            this.b = i2 + 1;
            return u2Var2.a(i2).spliterator();
        }
        j$.util.stream.u2 u2VarA = u2Var2.a(i2);
        this.a = u2VarA;
        int iL2 = u2VarA.l();
        j$.util.stream.u2 u2Var3 = this.a;
        if (iL2 != 0) {
            this.b = 1;
            return u2Var3.a(0).spliterator();
        }
        j$.util.Spliterator spliterator2 = u2Var3.spliterator();
        this.c = spliterator2;
        return spliterator2.trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.w0 trySplit() {
        return (j$.util.w0) trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfInt trySplit() {
        return (j$.util.Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfLong trySplit() {
        return (j$.util.Spliterator.OfLong) trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.p0 trySplit() {
        return (j$.util.p0) trySplit();
    }
}
