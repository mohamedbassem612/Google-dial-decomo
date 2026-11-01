package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class exd {
    public final java.lang.String a;
    public final defpackage.eqg b;
    public final defpackage.eqg c;
    public final int d;
    public final int e;

    public exd(java.lang.String str, defpackage.eqg eqgVar, defpackage.eqg eqgVar2, int i, int i2) {
        boolean z;
        if (i != 0) {
            z = false;
            if (i2 == 0) {
                i2 = 0;
                z = true;
            }
        } else {
            z = true;
        }
        ahvr.bM(z);
        ahvr.bM(!android.text.TextUtils.isEmpty(str));
        this.a = str;
        this.b = eqgVar;
        ahvr.ci(eqgVar2);
        this.c = eqgVar2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.exd exdVar = (defpackage.exd) obj;
            if (this.d == exdVar.d && this.e == exdVar.e && this.a.equals(exdVar.a) && this.b.equals(exdVar.b) && this.c.equals(exdVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d + 527) * 31) + this.e) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
