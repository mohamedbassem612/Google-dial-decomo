package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class aiem implements java.lang.Comparable, java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.lang.Comparable b = "";

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(defpackage.aiem aiemVar) {
        if (aiemVar == defpackage.aiel.a) {
            return 1;
        }
        if (aiemVar == defpackage.aiej.a) {
            return -1;
        }
        java.lang.Comparable comparable = aiemVar.b;
        defpackage.aikb aikbVar = defpackage.aikb.a;
        int iCompareTo = "".compareTo("");
        return iCompareTo != 0 ? iCompareTo : java.lang.Boolean.compare(this instanceof defpackage.aiek, aiemVar instanceof defpackage.aiek);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aiem)) {
            return false;
        }
        try {
            return compareTo((defpackage.aiem) obj) == 0;
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }
}
