package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum aldh implements java.util.Comparator, java.io.Serializable {
    INSTANCE;

    public static final int a(alcf alcfVar, alcf alcfVar2) {
        aldi.g(alcfVar);
        aldi.g(alcfVar2);
        int iCompare = java.lang.Long.compare(alcfVar.b, alcfVar2.b);
        return iCompare == 0 ? java.lang.Integer.compare(alcfVar.c, alcfVar2.c) : iCompare;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        return a((alcf) obj, (alcf) obj2);
    }
}
