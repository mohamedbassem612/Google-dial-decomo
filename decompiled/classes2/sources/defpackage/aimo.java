package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aimo {
    private static final ahxn d = ahxn.m(" \t\n\r\f\u000b\u0085\u2028\u2029\u200d\uffef�\ufffe\uffff").k();
    private static final ahxn e = new defpackage.ahxi(new ahxl(new ahxl(new ahxc(0, 31), new ahxd(127)), ahxn.m(" @,:<>"))).o();
    private static final ahxn f = new defpackage.ahxi(new ahxl(new ahxl(new ahxc(0, 31), new ahxd(127)), ahxn.m(" @,:<>+%"))).o();
    public final java.lang.String a;
    public final java.lang.String b;
    public final boolean c;

    /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
    public aimo(java.lang.String str) {
        int iLastIndexOf;
        int iIndexOf;
        boolean z = true;
        if (str == null || (iLastIndexOf = str.lastIndexOf(64)) <= 0 || iLastIndexOf == str.length() - 1) {
            this.a = null;
            this.b = null;
        } else {
            this.a = str.substring(0, iLastIndexOf);
            this.b = str.substring(iLastIndexOf + 1);
        }
        java.lang.String str2 = this.a;
        java.lang.String str3 = this.b;
        if (str2 != null && str3 != null && str2.length() != 0 && str3.length() != 0) {
            ahxn ahxnVar = d;
            if (ahxnVar.d(str3) < 0 && str3.length() >= 4 && (iIndexOf = str3.indexOf(46)) != -1 && !str3.contains("..") && str3.charAt(0) != '.') {
                int iIndexOf2 = str3.indexOf(".", iIndexOf + 1);
                if ((str3.charAt(str3.length() - 1) == '.' && iIndexOf2 == -1) || !f.h(str3)) {
                    z = false;
                    break;
                }
                ahxn ahxnVar2 = ahwz.a;
                if (!ahxnVar2.h(str3)) {
                    z = false;
                    break;
                }
                if (!str2.startsWith("\"")) {
                    if (ahxnVar.d(str2) >= 0 || str2.contains("..") || !e.h(str2) || !ahxnVar2.h(str2)) {
                        z = false;
                        break;
                    }
                } else {
                    int length = str2.length() - 1;
                    if (length <= 0 || !str2.endsWith("\"")) {
                        z = false;
                        break;
                    }
                    int i = 1;
                    while (i < length) {
                        char cCharAt = str2.charAt(i);
                        if (cCharAt == '\"' || cCharAt == 127 || ((cCharAt < ' ' && !ahxnVar.c(cCharAt)) || cCharAt >= 128 || (cCharAt == '\\' && (i = i + 1) >= length))) {
                            z = false;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = false;
                break;
            }
        } else {
            z = false;
            break;
        }
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aimo) {
            defpackage.aimo aimoVar = (defpackage.aimo) obj;
            if (j$.util.Objects.equals(this.a, aimoVar.a) && j$.util.Objects.equals(this.b, aimoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final java.lang.String toString() {
        return this.a + '@' + this.b;
    }
}
