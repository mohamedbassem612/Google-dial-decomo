package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class s implements java.util.function.Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.Collection b;

    public /* synthetic */ s(java.util.Collection collection, byte b) {
        this.a = b;
        this.b = collection;
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

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        byte b = this.a;
        java.util.Collection collection = this.b;
        switch (b) {
            case 0:
                j$.com.android.tools.r8.b bVar = j$.util.concurrent.ConcurrentLinkedQueue.a;
                return !collection.contains(obj);
            default:
                j$.com.android.tools.r8.b bVar2 = j$.util.concurrent.ConcurrentLinkedQueue.a;
                return collection.contains(obj);
        }
    }
}
