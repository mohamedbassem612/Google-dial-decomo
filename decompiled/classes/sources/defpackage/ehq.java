package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ehq {
    protected volatile defpackage.ehw a;
    private volatile defpackage.egm b;
    private volatile boolean c;

    public final int a() {
        int iH;
        if (this.b != null) {
            iH = this.b.b();
        } else {
            iH = this.a != null ? this.a.h() : 0;
        }
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(iH) * 9)) >>> 6) + iH;
    }

    public final defpackage.egm b() {
        defpackage.egm egmVar;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                egmVar = this.b;
            } else {
                if (this.a == null) {
                    this.b = defpackage.egm.d;
                } else {
                    this.b = this.a.d();
                }
                egmVar = this.b;
            }
        }
        return egmVar;
    }

    @java.lang.Deprecated
    public final defpackage.ehw c(defpackage.ehw ehwVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = ehwVar;
                        this.b = defpackage.egm.d;
                    } catch (defpackage.eho unused) {
                        this.c = true;
                        this.a = ehwVar;
                        this.b = defpackage.egm.d;
                    }
                }
            }
        }
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ehq)) {
            return false;
        }
        defpackage.ehq ehqVar = (defpackage.ehq) obj;
        defpackage.ehw ehwVar = this.a;
        defpackage.ehw ehwVar2 = ehqVar.a;
        if (ehwVar == null) {
            return ehwVar2 != null ? c(ehwVar2.f()).equals(ehwVar2) : b().equals(ehqVar.b());
        }
        return ehwVar2 == null ? ehwVar.equals(ehqVar.c(ehwVar.f())) : ehwVar.equals(ehwVar2);
    }

    public final int hashCode() {
        return 1;
    }
}
