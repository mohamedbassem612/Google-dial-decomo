package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hcw {
    public static final defpackage.hcw a = new defpackage.hcw("COMPOSITION");
    public defpackage.hcx b;
    private final java.util.List c;

    private hcw(defpackage.hcw hcwVar) {
        this.c = new java.util.ArrayList(hcwVar.c);
        this.b = hcwVar.b;
    }

    private final boolean g() {
        java.util.List list = this.c;
        return ((java.lang.String) list.get(list.size() - 1)).equals("**");
    }

    public final int a(java.lang.String str, int i) {
        if ("__container".equals(str)) {
            return 0;
        }
        java.util.List list = this.c;
        if (((java.lang.String) list.get(i)).equals("**")) {
            return (i == list.size() + (-1) || !((java.lang.String) list.get(i + 1)).equals(str)) ? 0 : 2;
        }
        return 1;
    }

    public final defpackage.hcw b(java.lang.String str) {
        defpackage.hcw hcwVar = new defpackage.hcw(this);
        hcwVar.c.add(str);
        return hcwVar;
    }

    public final defpackage.hcw c(defpackage.hcx hcxVar) {
        defpackage.hcw hcwVar = new defpackage.hcw(this);
        hcwVar.b = hcxVar;
        return hcwVar;
    }

    public final boolean d(java.lang.String str, int i) {
        java.util.List list = this.c;
        if (i >= list.size()) {
            return false;
        }
        int size = list.size() - 1;
        java.lang.String str2 = (java.lang.String) list.get(i);
        if (!str2.equals("**")) {
            boolean z = str2.equals(str) || str2.equals("*");
            if ((i != size && (i != list.size() - 2 || !g())) || !z) {
                return false;
            }
        } else if (i != size) {
            int i2 = i + 1;
            if (!((java.lang.String) list.get(i2)).equals(str)) {
                if (i2 >= list.size() - 1) {
                    return ((java.lang.String) list.get(i2)).equals(str);
                }
                return false;
            }
            if (i != list.size() - 2 && (i != list.size() - 3 || !g())) {
                return false;
            }
        }
        return true;
    }

    public final boolean e(java.lang.String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        java.util.List list = this.c;
        return i < list.size() && (((java.lang.String) list.get(i)).equals(str) || ((java.lang.String) list.get(i)).equals("**") || ((java.lang.String) list.get(i)).equals("*"));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.hcw hcwVar = (defpackage.hcw) obj;
            if (this.c.equals(hcwVar.c)) {
                defpackage.hcx hcxVar = this.b;
                if (hcxVar != null) {
                    return hcxVar.equals(hcwVar.b);
                }
                if (hcwVar.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f(java.lang.String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        java.util.List list = this.c;
        return i < list.size() + (-1) || ((java.lang.String) list.get(i)).equals("**");
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        defpackage.hcx hcxVar = this.b;
        return iHashCode + (hcxVar != null ? hcxVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.c);
        defpackage.hcx hcxVar = this.b;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("KeyPath{keys=");
        sb.append(strValueOf);
        sb.append(",resolved=");
        sb.append(hcxVar != null);
        sb.append('}');
        return sb.toString();
    }

    public hcw(java.lang.String... strArr) {
        this.c = java.util.Arrays.asList(strArr);
    }
}
