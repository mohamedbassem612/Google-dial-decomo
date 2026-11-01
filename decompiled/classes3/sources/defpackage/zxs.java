package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@java.lang.Deprecated
public final class zxs implements aacu {
    public static final defpackage.zxs a = new defpackage.zxs(new defpackage.zxr());
    public final java.lang.String b = null;
    public final boolean c;
    public final java.lang.String d;

    public zxs(defpackage.zxr zxrVar) {
        this.c = zxrVar.a.booleanValue();
        this.d = zxrVar.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.zxs) {
            defpackage.zxs zxsVar = (defpackage.zxs) obj;
            java.lang.String str = zxsVar.b;
            if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && this.c == zxsVar.c && j$.util.Objects.equals(this.d, zxsVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{null, java.lang.Boolean.valueOf(this.c), this.d});
    }
}
