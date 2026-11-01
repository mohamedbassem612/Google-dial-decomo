package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaqm implements defpackage.aacu {
    public final int a;
    private final java.lang.String b = null;

    public aaqm(defpackage.anrn anrnVar) {
        this.a = anrnVar.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aaqm) {
            defpackage.aaqm aaqmVar = (defpackage.aaqm) obj;
            if (this.a == aaqmVar.a) {
                java.lang.String str = aaqmVar.b;
                if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), null});
    }
}
