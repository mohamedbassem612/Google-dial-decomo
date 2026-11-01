package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dir implements java.util.Comparator {
    final /* synthetic */ java.util.Comparator a;
    final /* synthetic */ java.util.Comparator b;

    public dir(java.util.Comparator comparator, java.util.Comparator comparator2) {
        this.a = comparator;
        this.b = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int iCompare = this.a.compare(obj, obj2);
        return iCompare == 0 ? this.b.compare(((dij) obj).a, ((dij) obj2).a) : iCompare;
    }
}
