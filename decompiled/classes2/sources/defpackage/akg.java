package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class akg implements ajl {
    public final int a;
    public final ajg b;
    public final long c;
    public final int d;

    public akg(int i, ajg ajgVar, int i2, long j) {
        this.a = i;
        this.b = ajgVar;
        this.d = i2;
        this.c = j;
    }

    public final /* bridge */ /* synthetic */ defpackage.alp a(nf nfVar) {
        return new defpackage.alz(this.a, this.b.b(nfVar), this.d, this.c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.akg) {
            defpackage.akg akgVar = (defpackage.akg) obj;
            if (akgVar.a == this.a && aooh.n(akgVar.b, this.b) && akgVar.d == this.d && akgVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a * 31) + this.b.hashCode();
        int i = this.d;
        a.aY(i);
        long j = this.c;
        return (((iHashCode * 31) + i) * 31) + ((int) (j ^ (j >>> 32)));
    }
}
