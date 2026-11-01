package j$.util.function;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class a implements java.util.function.BiPredicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.BiPredicate b;
    public final /* synthetic */ java.util.function.BiPredicate c;

    public /* synthetic */ a(java.util.function.BiPredicate biPredicate, java.util.function.BiPredicate biPredicate2, byte b) {
        this.a = b;
        this.b = biPredicate;
        this.c = biPredicate2;
    }

    public final /* synthetic */ java.util.function.BiPredicate and(java.util.function.BiPredicate biPredicate) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.BiPredicate$CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ java.util.function.BiPredicate negate() {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.BiPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ java.util.function.BiPredicate or(java.util.function.BiPredicate biPredicate) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.BiPredicate$CC.$default$or(this, biPredicate);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[ORIG_RETURN, RETURN] */
    @Override // java.util.function.BiPredicate
    public final boolean test(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.a) {
            case 0:
                if (this.b.test(obj, obj2) || this.c.test(obj, obj2)) {
                    return true;
                }
                return false;
            default:
                if (this.b.test(obj, obj2) && this.c.test(obj, obj2)) {
                    return true;
                }
                return false;
        }
    }
}
