package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anqr implements java.util.Comparator {
    final /* synthetic */ defpackage.anqs a;

    public anqr(defpackage.anqs anqsVar) {
        this.a = anqsVar;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.anqs anqsVar = this.a;
        int iA = anqsVar.a(obj) - anqsVar.a(obj2);
        return iA == 0 ? obj.getClass().getName().compareTo(obj2.getClass().getName()) : iA;
    }
}
