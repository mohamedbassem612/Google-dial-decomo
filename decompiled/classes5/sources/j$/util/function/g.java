package j$.util.function;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class g implements java.util.function.IntPredicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.IntPredicate b;
    public final /* synthetic */ java.util.function.IntPredicate c;

    public /* synthetic */ g(java.util.function.IntPredicate intPredicate, java.util.function.IntPredicate intPredicate2, byte b) {
        this.a = b;
        this.b = intPredicate;
        this.c = intPredicate2;
    }

    public final /* synthetic */ java.util.function.IntPredicate and(java.util.function.IntPredicate intPredicate) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.IntPredicate$CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ java.util.function.IntPredicate negate() {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.IntPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ java.util.function.IntPredicate or(java.util.function.IntPredicate intPredicate) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.IntPredicate$CC.$default$or(this, intPredicate);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[ORIG_RETURN, RETURN] */
    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        switch (this.a) {
            case 0:
                if (this.b.test(i) || this.c.test(i)) {
                    return true;
                }
                return false;
            default:
                if (this.b.test(i) && this.c.test(i)) {
                    return true;
                }
                return false;
        }
    }
}
