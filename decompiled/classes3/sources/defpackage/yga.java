package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yga {
    private java.lang.Class a;
    private java.lang.Class b;
    private java.lang.Class c;

    public yga(java.lang.Class cls, java.lang.Class cls2, java.lang.Class cls3) {
        a(cls, cls2, cls3);
    }

    public final void a(java.lang.Class cls, java.lang.Class cls2, java.lang.Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.yga ygaVar = (defpackage.yga) obj;
            if (this.a.equals(ygaVar.a) && this.b.equals(ygaVar.b)) {
                java.lang.Class cls = this.c;
                java.lang.Class cls2 = ygaVar.c;
                char[] cArr = defpackage.ygc.a;
                if (a.L(cls, cls2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        java.lang.Class cls = this.c;
        return (iHashCode * 31) + (cls != null ? cls.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "MultiClassKey{first=" + java.lang.String.valueOf(this.a) + ", second=" + java.lang.String.valueOf(this.b) + '}';
    }

    public yga() {
    }
}
