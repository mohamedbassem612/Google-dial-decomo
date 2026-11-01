package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahyq implements java.io.Serializable, ahyp {
    private static final long serialVersionUID = 0;
    private final java.util.List a;

    public ahyq(java.util.List list) {
        this.a = list;
    }

    public final boolean a(java.lang.Object obj) {
        int i = 0;
        while (true) {
            java.util.List list = this.a;
            if (i >= list.size()) {
                return true;
            }
            if (!((ahyp) list.get(i)).a(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ahyq) {
            return this.a.equals(((defpackage.ahyq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Predicates.and(");
        boolean z = true;
        for (java.lang.Object obj : this.a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
