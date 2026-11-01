package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class aopr implements java.lang.Iterable, aoow {
    public final long a;
    public final long b;
    private final long c = 1;

    public aopr(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public boolean d() {
        return this.a > this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aopr)) {
            return false;
        }
        if (!d() || !((defpackage.aopr) obj).d()) {
            defpackage.aopr aoprVar = (defpackage.aopr) obj;
            if (this.a != aoprVar.a || this.b != aoprVar.b) {
                return false;
            }
            long j = aoprVar.c;
        }
        return true;
    }

    public int hashCode() {
        if (d()) {
            return -1;
        }
        return (((anty.M(this.a) * 31) + anty.M(this.b)) * 31) + anty.M(1L);
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return new defpackage.aokk(this.a, this.b);
    }

    public java.lang.String toString() {
        return this.a + ".." + this.b + " step 1";
    }
}
