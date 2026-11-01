package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akyj extends defpackage.akyi {
    public static final defpackage.akyj a;
    public final java.lang.String b;
    public final j$.util.Optional c;
    public final j$.util.Optional d;
    public final int e;
    private final defpackage.aify f;

    static {
        defpackage.aify aifyVarS = defpackage.aify.s(defpackage.amul.a, defpackage.amul.d, defpackage.amul.b, defpackage.amul.c);
        j$.util.Optional optionalOf = j$.util.Optional.of(defpackage.amul.c);
        j$.util.Optional optionalOf2 = j$.util.Optional.of(120559099);
        if (!optionalOf.isEmpty() && !((defpackage.amul) optionalOf.get()).e.endsWith("_ANDROID_PRIMES")) {
            throw new java.lang.IllegalArgumentException();
        }
        a = new defpackage.akyj(aifyVarS, optionalOf, optionalOf2);
    }

    public akyj(defpackage.aify aifyVar, j$.util.Optional optional, j$.util.Optional optional2) {
        this.b = "phone_android";
        this.e = 1;
        this.f = aifyVar;
        if (optional == null) {
            throw new java.lang.NullPointerException("Null primesLogSource");
        }
        this.c = optional;
        if (optional2 == null) {
            throw new java.lang.NullPointerException("Null productId");
        }
        this.d = optional2;
    }

    @Override // defpackage.akyi
    public final java.lang.String a() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.akyj) {
            defpackage.akyj akyjVar = (defpackage.akyj) obj;
            if (this.b.equals(akyjVar.b)) {
                int i = akyjVar.e;
                if (defpackage.ahvr.aP(this.f, akyjVar.f) && this.c.equals(akyjVar.c) && this.d.equals(akyjVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ 1) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public akyj() {
        throw null;
    }
}
