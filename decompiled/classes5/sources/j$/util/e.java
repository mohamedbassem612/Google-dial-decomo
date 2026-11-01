package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class e implements java.util.Comparator, java.io.Serializable, j$.util.Comparator {
    private static final long serialVersionUID = -7569533591570686392L;
    public final boolean a;
    public final java.util.Comparator b;

    public e(boolean z, java.util.Comparator comparator) {
        this.a = z;
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        boolean z = this.a;
        if (obj == null) {
            if (obj2 != null) {
                if (!z) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (obj2 == null) {
            if (z) {
                return 1;
            }
            return -1;
        }
        java.util.Comparator comparator = this.b;
        if (comparator != null) {
            return comparator.compare(obj, obj2);
        }
        return 0;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final java.util.Comparator reversed() {
        boolean z = !this.a;
        java.util.Comparator comparator = this.b;
        return new j$.util.e(z, comparator == null ? null : j$.util.Comparator.EL.reversed(comparator));
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final java.util.Comparator thenComparing(java.util.Comparator comparator) {
        j$.util.Objects.requireNonNull(comparator);
        java.util.Comparator comparator2 = this.b;
        if (comparator2 != null) {
            comparator = j$.util.Comparator.EL.thenComparing(comparator2, comparator);
        }
        return new j$.util.e(this.a, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
        return j$.util.Comparator.EL.thenComparing(this, j$.util.Comparator.CC.comparingDouble(toDoubleFunction));
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(java.util.function.ToIntFunction toIntFunction) {
        return j$.util.Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(java.util.function.ToLongFunction toLongFunction) {
        return j$.util.Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function, java.util.Comparator comparator) {
        return j$.util.Comparator.EL.thenComparing(this, j$.util.Comparator.CC.comparing(function, comparator));
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function) {
        return j$.util.Comparator.CC.$default$thenComparing(this, function);
    }
}
