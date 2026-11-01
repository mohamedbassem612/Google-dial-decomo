package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiei extends defpackage.aijz implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.util.Comparator[] a;

    public aiei(java.util.Comparator comparator, java.util.Comparator comparator2) {
        this.a = new java.util.Comparator[]{comparator, comparator2};
    }

    @Override // defpackage.aijz, java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        for (int i = 0; i < 2; i++) {
            int iCompare = this.a[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aiei) {
            return java.util.Arrays.equals(this.a, ((defpackage.aiei) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.a);
    }

    public final java.lang.String toString() {
        return "Ordering.compound(" + java.util.Arrays.toString(this.a) + ')';
    }
}
