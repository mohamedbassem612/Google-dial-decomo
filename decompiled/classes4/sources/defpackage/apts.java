package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apts {
    public final java.lang.String a;
    public final java.lang.String b;

    public apts(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.apts) {
            defpackage.apts aptsVar = (defpackage.apts) obj;
            if (this.a.equals(aptsVar.a)) {
                java.lang.String str = this.b;
                java.lang.String str2 = aptsVar.b;
                if (str == null) {
                    if (str2 == null) {
                        return true;
                    }
                } else if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return aodc.s(aodc.s(17, this.a), this.b);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.b;
        java.lang.String str2 = this.a;
        if (str == null) {
            return str2;
        }
        return str2 + "=\"" + str + '\"';
    }
}
