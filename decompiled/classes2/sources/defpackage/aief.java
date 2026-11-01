package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aief extends defpackage.aieh {
    static final defpackage.aieh g(int i) {
        if (i < 0) {
            return defpackage.aieh.c;
        }
        return i > 0 ? defpackage.aieh.d : defpackage.aieh.b;
    }

    @Override // defpackage.aieh
    public final int a() {
        return 0;
    }

    @Override // defpackage.aieh
    public final defpackage.aieh b(int i, int i2) {
        return g(java.lang.Integer.compare(i, i2));
    }

    @Override // defpackage.aieh
    public final defpackage.aieh c(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        return g(comparable.compareTo(comparable2));
    }

    @Override // defpackage.aieh
    public final defpackage.aieh d(java.lang.Object obj, java.lang.Object obj2, java.util.Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override // defpackage.aieh
    public final defpackage.aieh e(boolean z, boolean z2) {
        return g(java.lang.Boolean.compare(z, z2));
    }

    @Override // defpackage.aieh
    public final defpackage.aieh f(boolean z, boolean z2) {
        return g(java.lang.Boolean.compare(z2, z));
    }
}
