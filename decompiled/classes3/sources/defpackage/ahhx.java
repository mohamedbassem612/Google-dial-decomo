package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahhx {
    public final java.lang.String a;
    public final defpackage.xzh b;
    public final defpackage.akwa c;

    public ahhx(java.lang.String str, defpackage.akwa akwaVar, defpackage.xzh xzhVar) {
        this.a = str;
        this.c = akwaVar;
        this.b = xzhVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ahhx) {
            defpackage.ahhx ahhxVar = (defpackage.ahhx) obj;
            if (this.a.equals(ahhxVar.a)) {
                if (this.c.c("").equals(ahhxVar.c.c(""))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.c.c(""), this.b});
    }

    public final java.lang.String toString() {
        return "FifeModel{" + this.a + this.c.c(" ") + ", headers=" + java.lang.String.valueOf(this.b) + '}';
    }

    public ahhx() {
        throw null;
    }
}
