package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aolh implements java.util.Comparator, j$.util.Comparator {
    public static final defpackage.aolh a = new defpackage.aolh();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        java.lang.Comparable comparable2 = (java.lang.Comparable) obj2;
        if (comparable == null) {
            defpackage.aooh.i("a");
        }
        if (comparable2 == null) {
            defpackage.aooh.i("b");
        }
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public final java.util.Comparator reversed() {
        return aoli.a;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return j$.util.Comparator.-CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
        return j$.util.Comparator.-CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(java.util.function.ToIntFunction toIntFunction) {
        return j$.util.Comparator.-CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(java.util.function.ToLongFunction toLongFunction) {
        return j$.util.Comparator.-CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function) {
        return j$.util.Comparator.-CC.$default$thenComparing(this, function);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function, java.util.Comparator comparator) {
        return j$.util.Comparator.-CC.$default$thenComparing(this, function, comparator);
    }
}
