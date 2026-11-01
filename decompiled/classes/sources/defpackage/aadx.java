package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aadx {
    private final int a;
    private final defpackage.aacu b;
    private final java.lang.String c;
    private final defpackage.acxg d;

    public aadx(defpackage.acxg acxgVar, defpackage.aacu aacuVar, java.lang.String str) {
        this.d = acxgVar;
        this.b = aacuVar;
        this.c = str;
        this.a = j$.util.Objects.hash(new java.lang.Object[]{acxgVar, aacuVar, str, null});
    }

    public final java.lang.String a() {
        return (java.lang.String) this.d.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj != this) {
            if (!(obj instanceof defpackage.aadx)) {
                return false;
            }
            defpackage.aadx aadxVar = (defpackage.aadx) obj;
            if (!j$.util.Objects.equals(this.d, aadxVar.d) || !j$.util.Objects.equals(this.b, aadxVar.b) || !j$.util.Objects.equals(this.c, aadxVar.c) || !j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
