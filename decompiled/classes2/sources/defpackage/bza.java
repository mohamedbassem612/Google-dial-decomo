package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bza implements defpackage.byr {
    private final cmn a;

    public bza(cmn cmnVar) {
        this.a = cmnVar;
    }

    @Override // defpackage.byr
    public final int a(dpo dpoVar, long j, int i) {
        return this.a.a(i, (int) (j & 4294967295L));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.bza) && aooh.n(this.a, ((defpackage.bza) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Vertical(alignment=" + this.a + ')';
    }
}
