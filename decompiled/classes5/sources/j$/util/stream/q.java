package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class q extends j$.util.stream.b6 {
    public final /* synthetic */ byte b;
    public java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(j$.util.stream.f6 f6Var, java.lang.Object obj, byte b) {
        super(f6Var);
        this.b = b;
        this.c = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.b) {
            case 0:
                if (!((java.util.HashSet) this.c).contains(obj)) {
                    ((java.util.HashSet) this.c).add(obj);
                    this.a.accept(obj);
                }
                break;
            case 1:
                ((java.util.function.Consumer) this.c).accept(obj);
                this.a.accept(obj);
                break;
            case 2:
                if (((java.util.function.Predicate) this.c).test(obj)) {
                    this.a.accept(obj);
                }
                break;
            case 3:
                this.a.accept(((java.util.function.Function) this.c).apply(obj));
                break;
            case 4:
                this.a.accept(((java.util.function.ToIntFunction) this.c).applyAsInt(obj));
                break;
            case 5:
                this.a.accept(((java.util.function.ToLongFunction) this.c).applyAsLong(obj));
                break;
            default:
                this.a.accept(((java.util.function.ToDoubleFunction) this.c).applyAsDouble(obj));
                break;
        }
    }

    @Override // j$.util.stream.b6, j$.util.stream.f6
    public final void end() {
        switch (this.b) {
            case 0:
                this.c = null;
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
                this.c = new java.util.HashSet();
                this.a.p(-1L);
                break;
            case 1:
            default:
                super.p(j);
                break;
            case 2:
                this.a.p(-1L);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(j$.util.stream.f6 f6Var) {
        super(f6Var);
        this.b = (byte) 0;
    }
}
