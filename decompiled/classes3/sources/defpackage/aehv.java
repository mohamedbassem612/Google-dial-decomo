package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aehv implements java.lang.Comparable {
    public final ahyn a;
    private final ahyn b;

    public aehv(ahyn ahynVar, ahyn ahynVar2) {
        this.b = ahynVar;
        this.a = ahynVar2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        aijz aijzVarB = aiju.a.b();
        ahyn ahynVar = ((defpackage.aehv) obj).b;
        return aijzVarB.compare((java.lang.Object) null, (java.lang.Object) null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aehv) {
            defpackage.aehv aehvVar = (defpackage.aehv) obj;
            if (this.b.equals(aehvVar.b) && this.a.equals(aehvVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 2097800333;
    }

    public final java.lang.String toString() {
        ahyn ahynVar = this.a;
        return "DecorationContent{badgeContent=" + java.lang.String.valueOf(this.b) + ", ringContent=" + java.lang.String.valueOf(ahynVar) + '}';
    }

    public aehv() {
        throw null;
    }
}
