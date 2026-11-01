package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apyo {
    protected volatile defpackage.apyv a;
    private volatile defpackage.apxo b;
    private volatile boolean c;

    public final int a() {
        int iG;
        if (this.b != null) {
            iG = this.b.b();
        } else {
            iG = this.a != null ? this.a.g() : 0;
        }
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(iG) * 9)) >>> 6) + iG;
    }

    public final defpackage.apxo b() {
        defpackage.apxo apxoVar;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                apxoVar = this.b;
            } else {
                if (this.a == null) {
                    this.b = defpackage.apxo.d;
                } else {
                    this.b = this.a.c();
                }
                apxoVar = this.b;
            }
        }
        return apxoVar;
    }

    @java.lang.Deprecated
    public final defpackage.apyv c(defpackage.apyv apyvVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = apyvVar;
                        this.b = defpackage.apxo.d;
                    } catch (defpackage.apym unused) {
                        this.c = true;
                        this.a = apyvVar;
                        this.b = defpackage.apxo.d;
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
        if (!(obj instanceof defpackage.apyo)) {
            return false;
        }
        defpackage.apyo apyoVar = (defpackage.apyo) obj;
        defpackage.apyv apyvVar = this.a;
        defpackage.apyv apyvVar2 = apyoVar.a;
        if (apyvVar == null) {
            return apyvVar2 != null ? c(apyvVar2.e()).equals(apyvVar2) : b().equals(apyoVar.b());
        }
        return apyvVar2 == null ? apyvVar.equals(apyoVar.c(apyvVar.e())) : apyvVar.equals(apyvVar2);
    }

    public final int hashCode() {
        return 1;
    }
}
