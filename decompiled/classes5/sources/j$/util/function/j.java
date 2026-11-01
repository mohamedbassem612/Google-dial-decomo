package j$.util.function;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class j implements java.util.function.Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.Predicate b;
    public final /* synthetic */ java.util.function.Predicate c;

    public /* synthetic */ j(java.util.function.Predicate predicate, java.util.function.Predicate predicate2, byte b) {
        this.a = b;
        this.b = predicate;
        this.c = predicate2;
    }

    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ java.util.function.Predicate mo2negate() {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[ORIG_RETURN, RETURN] */
    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.a) {
            case 0:
                if (this.b.test(obj) && this.c.test(obj)) {
                    return true;
                }
                return false;
            default:
                if (this.b.test(obj) || this.c.test(obj)) {
                    return true;
                }
                return false;
        }
    }
}
