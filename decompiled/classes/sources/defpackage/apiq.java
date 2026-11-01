package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apiq {
    public final java.lang.String a;
    private final int b;

    public apiq(java.lang.String str, int i) {
        if (str == null) {
            defpackage.aooh.i("hostname");
        }
        java.lang.String strA = defpackage.apju.a(str);
        if (strA == null) {
            throw new java.lang.IllegalArgumentException("unexpected hostname: ".concat(java.lang.String.valueOf(str)));
        }
        this.a = strA;
        if (i == -1) {
            i = 443;
        } else if (i <= 0) {
            throw new java.lang.IllegalArgumentException("unexpected port: 0");
        }
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.apiq) {
            defpackage.apiq apiqVar = (defpackage.apiq) obj;
            if (defpackage.aooh.n(apiqVar.a, this.a) && apiqVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        int i = this.b;
        java.lang.String str = this.a;
        if (i == 443) {
            return str;
        }
        return str + ':' + i;
    }
}
