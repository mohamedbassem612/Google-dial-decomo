package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class qh implements java.lang.Iterable {
    private final java.util.List a;

    public qh(java.lang.String str) {
        dzk.x(str);
        this.a = new java.util.ArrayList();
        try {
            c(str);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.lang.IllegalArgumentException(e.getMessage() + ": " + str);
        }
    }

    private final void c(java.lang.String str) {
        boolean z;
        java.lang.String strSubstring;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = false;
                i = -1;
                break;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == ']') {
                throw new java.lang.IllegalArgumentException("Malformed path (no starting '[')");
            }
            if (cCharAt == '[' || cCharAt == '.') {
                if (cCharAt != '[') {
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
            }
            i++;
        }
        if (i == 0 || str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Malformed path (blank property name)");
        }
        if (i == -1) {
            this.a.add(new defpackage.qg(str, -1));
            return;
        }
        if (z) {
            dzk.x(str);
            java.lang.String strSubstring2 = str.substring(0, i);
            int iIndexOf = str.indexOf(93, i);
            if (iIndexOf == -1) {
                throw new java.lang.IllegalArgumentException("Malformed path (no ending ']')");
            }
            int i2 = iIndexOf + 1;
            if (i2 < str.length() && str.charAt(i2) != '.') {
                throw new java.lang.IllegalArgumentException("Malformed path (']' not followed by '.'): ".concat(java.lang.String.valueOf(str)));
            }
            java.lang.String strSubstring3 = str.substring(i + 1, iIndexOf);
            try {
                int i3 = java.lang.Integer.parseInt(strSubstring3);
                if (i3 < 0) {
                    throw new java.lang.IllegalArgumentException("Malformed path (path index less than 0)");
                }
                this.a.add(new defpackage.qg(strSubstring2, i3));
                strSubstring = i2 < str.length() ? str.substring(iIndexOf + 2) : null;
                if (strSubstring == null) {
                    return;
                }
            } catch (java.lang.NumberFormatException unused) {
                throw new java.lang.IllegalArgumentException(a.bk(strSubstring3, "Malformed path (\"", "\" as path index)"));
            }
        } else {
            java.lang.String strSubstring4 = str.substring(0, i);
            strSubstring = str.substring(i + 1);
            this.a.add(new defpackage.qg(strSubstring4, -1));
        }
        c(strSubstring);
    }

    public final int a() {
        return this.a.size();
    }

    public final defpackage.qg b(int i) {
        return (defpackage.qg) this.a.get(i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.qh)) {
            return false;
        }
        return j$.util.Objects.equals(this.a, ((defpackage.qh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.a.iterator();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        while (true) {
            java.util.List list = this.a;
            if (i >= list.size()) {
                return sb.toString();
            }
            sb.append(b(i).toString());
            if (i < list.size() - 1) {
                sb.append('.');
            }
            i++;
        }
    }
}
