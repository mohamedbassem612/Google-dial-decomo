package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class p extends j$.util.stream.b6 {
    public final /* synthetic */ byte b = 0;
    public boolean c;
    public java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(j$.util.stream.f6 f6Var, java.util.function.Predicate predicate) {
        super(f6Var);
        this.d = predicate;
        this.c = true;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        byte b = this.b;
        j$.util.stream.f6 f6Var = this.a;
        switch (b) {
            case 0:
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    f6Var.accept((java.lang.Object) null);
                    return;
                }
                java.lang.Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    f6Var.accept(obj);
                    return;
                }
                return;
            case 1:
                j$.util.stream.Stream stream = (j$.util.stream.Stream) ((java.util.function.Function) this.d).apply(obj);
                if (stream != null) {
                    try {
                        if (this.c) {
                            j$.util.Spliterator<T> spliterator = ((j$.util.stream.Stream) stream.sequential()).spliterator();
                            while (!f6Var.t() && spliterator.tryAdvance(f6Var)) {
                            }
                        } else {
                            ((j$.util.stream.Stream) stream.sequential()).forEach(f6Var);
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            stream.close();
                            break;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.c) {
                    boolean zTest = ((java.util.function.Predicate) this.d).test(obj);
                    this.c = zTest;
                    if (zTest) {
                        f6Var.accept(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.b6, j$.util.stream.f6
    public final void end() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // j$.util.stream.b6, j$.util.stream.f6
    public final void p(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.p(-1L);
                break;
            case 1:
                this.a.p(-1L);
                break;
            default:
                this.a.p(-1L);
                break;
        }
    }

    @Override // j$.util.stream.b6, j$.util.stream.f6
    public final boolean t() {
        switch (this.b) {
            case 1:
                this.c = true;
                return this.a.t();
            case 2:
                return !this.c || this.a.t();
            default:
                return super.t();
        }
    }

    public /* synthetic */ p(j$.util.stream.f6 f6Var) {
        super(f6Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(j$.util.stream.f6 f6Var, java.util.function.Function function) {
        super(f6Var);
        this.d = function;
    }
}
