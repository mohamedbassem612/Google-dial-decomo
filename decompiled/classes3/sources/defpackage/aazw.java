package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aazw extends aazc {
    public static final defpackage.aazw a;
    public final defpackage.acvd b;
    public final int c;

    static {
        defpackage.acvd acvdVar = defpackage.acvd.a;
        aooh.e(acvdVar, "getDefaultInstance(...)");
        a = new defpackage.aazw(acvdVar, 2);
    }

    public aazw(defpackage.acvd acvdVar, int i) {
        aooh.f(acvdVar, "manifestConfig");
        this.b = acvdVar;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aazw) {
            defpackage.aazw aazwVar = (defpackage.aazw) obj;
            if (aooh.n(this.b, aazwVar.b) && this.c == aazwVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c;
    }
}
