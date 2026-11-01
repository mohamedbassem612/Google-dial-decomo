package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adr {
    public static final java.lang.Object[] a = new java.lang.Object[0];
    public static final defpackage.adq b = new defpackage.adq(0);

    public static final void a(java.util.List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            defpackage.un.c(defpackage.a.bA(size, i, "Index ", " is out of bounds. The list has ", " elements."));
        }
    }

    public static final void b(java.util.List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            defpackage.un.a(defpackage.a.bA(i2, i, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
        }
        if (i < 0) {
            defpackage.un.c(defpackage.a.bs(i, "fromIndex (", ") is less than 0."));
        }
        if (i2 > size) {
            defpackage.un.c(defpackage.a.bv((byte) 41, size, i2, "toIndex (", ") is more than than the list size ("));
        }
    }

    public static final defpackage.adq c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.adq adqVar = new defpackage.adq(2);
        adqVar.q(obj);
        adqVar.q(obj2);
        return adqVar;
    }
}
