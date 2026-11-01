package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class b extends j$.util.stream.d {
    public final java.util.concurrent.atomic.AtomicReference h;
    public volatile boolean i;

    public b(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        super(aVar, spliterator);
        this.h = new java.util.concurrent.atomic.AtomicReference(null);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void compute() {
        java.lang.Object objJ;
        j$.util.Spliterator spliteratorTrySplit;
        j$.util.Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.c;
        if (jG == 0) {
            jG = j$.util.stream.d.g(jEstimateSize);
            this.c = jG;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = this.h;
        boolean z = false;
        while (true) {
            objJ = atomicReference.get();
            if (objJ != null) {
                break;
            }
            boolean z2 = this.i;
            if (!z2) {
                java.util.concurrent.CountedCompleter<?> completer = this.getCompleter();
                while (true) {
                    j$.util.stream.b bVar = (j$.util.stream.b) ((j$.util.stream.d) completer);
                    if (z2 || bVar == null) {
                        break;
                    }
                    z2 = bVar.i;
                    completer = bVar.getCompleter();
                }
            }
            if (z2) {
                objJ = this.j();
                break;
            }
            if (jEstimateSize <= jG || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                objJ = this.a();
                break;
            }
            j$.util.stream.b bVar2 = (j$.util.stream.b) this.e(spliteratorTrySplit);
            this.d = bVar2;
            j$.util.stream.b bVar3 = (j$.util.stream.b) this.e(spliterator);
            this.e = bVar3;
            this.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                this = bVar2;
                bVar2 = bVar3;
            } else {
                this = bVar3;
            }
            z = !z;
            bVar2.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        this.f(objJ);
        this.tryComplete();
    }

    @Override // j$.util.stream.d
    public final void f(java.lang.Object obj) {
        if (!d()) {
            this.f = obj;
        } else if (obj != null) {
            j$.com.android.tools.r8.a.H(this.h, null, obj);
        }
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final java.lang.Object getRawResult() {
        return k();
    }

    public void h() {
        this.i = true;
    }

    public final void i() {
        j$.util.stream.d dVarB = b();
        while (true) {
            j$.util.stream.b bVar = (j$.util.stream.b) dVarB;
            j$.util.stream.b bVar2 = this;
            this = bVar;
            if (this == null) {
                return;
            }
            if (this.d == bVar2) {
                j$.util.stream.b bVar3 = (j$.util.stream.b) this.e;
                if (!bVar3.i) {
                    bVar3.h();
                }
            }
            dVarB = this.b();
        }
    }

    public abstract java.lang.Object j();

    public final java.lang.Object k() {
        if (!d()) {
            return this.f;
        }
        java.lang.Object obj = this.h.get();
        return obj == null ? j() : obj;
    }

    public b(j$.util.stream.b bVar, j$.util.Spliterator spliterator) {
        super(bVar, spliterator);
        this.h = bVar.h;
    }
}
