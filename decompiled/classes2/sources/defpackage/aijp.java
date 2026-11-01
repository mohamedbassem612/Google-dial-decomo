package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aijp {
    public final java.lang.Object a;
    int b;
    final /* synthetic */ aijx c;

    public aijp(aijx aijxVar, int i) {
        j$.util.Objects.requireNonNull(aijxVar);
        this.c = aijxVar;
        this.a = aijxVar.a[i];
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final int a() {
        int i = this.b;
        if (i != -1) {
            aijx aijxVar = this.c;
            if (i >= aijxVar.c || !j$.util.Objects.equals(this.a, aijxVar.a[i])) {
                this.b = this.c.d(this.a);
            }
        } else {
            this.b = this.c.d(this.a);
        }
        int i2 = this.b;
        if (i2 == -1) {
            return 0;
        }
        return this.c.b[i2];
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aijp)) {
            return false;
        }
        defpackage.aijp aijpVar = (defpackage.aijp) obj;
        return a() == aijpVar.a() && j$.util.Objects.equals(this.a, aijpVar.a);
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        return (obj == null ? 0 : obj.hashCode()) ^ a();
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.a);
        int iA = a();
        if (iA == 1) {
            return strValueOf;
        }
        return strValueOf + " x " + iA;
    }

    public aijp() {
        throw null;
    }
}
