package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dnb {
    public final java.util.List a;

    public dnb(java.util.List list) {
        this.a = list;
        int i = defpackage.dnc.a;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            java.lang.String strA = ((defpackage.dmy) list.get(i2)).a();
            i2++;
            int size2 = list.size();
            for (int i3 = i2; i3 < size2; i3++) {
                if (defpackage.aooh.n(strA, ((defpackage.dmy) list.get(i3)).a())) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int size3 = list.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        if (defpackage.aooh.n(((defpackage.dmy) list.get(i4)).a(), strA)) {
                            arrayList.add(list.get(i4));
                        }
                    }
                    dnv.b("'" + strA + "' must be unique. Actual [" + arrayList + ']');
                }
            }
        }
        int size4 = this.a.size();
        for (int i5 = 0; i5 < size4; i5++) {
            ((defpackage.dmy) this.a.get(i5)).b();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.dnb) && defpackage.aooh.n(this.a, ((defpackage.dnb) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Settings(settings=" + this.a + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public dnb(defpackage.dmy... dmyVarArr) {
        if (dmyVarArr == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.List listAsList = java.util.Arrays.asList(dmyVarArr);
        defpackage.aooh.e(listAsList, "asList(...)");
        this(listAsList);
    }
}
