package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aikp extends aijz implements java.io.Serializable {
    static final defpackage.aikp a = new defpackage.aikp();
    private static final long serialVersionUID = 0;

    private aikp() {
    }

    private java.lang.Object readResolve() {
        return a;
    }

    public final aijz a() {
        return aiju.a;
    }

    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        java.lang.Comparable comparable2 = (java.lang.Comparable) obj2;
        ahvr.ci(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final java.lang.String toString() {
        return "Ordering.natural().reverse()";
    }
}
