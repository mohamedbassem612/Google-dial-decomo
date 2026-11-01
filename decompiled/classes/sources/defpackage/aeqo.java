package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeqo {
    public final defpackage.aper a;
    public final java.lang.Long b;
    public final java.lang.Long c;
    public final java.lang.Long d;
    public final java.lang.Long e;
    public final java.lang.String f;
    public final defpackage.apev g;
    public final java.lang.Integer h;
    public final int i;

    public aeqo(defpackage.aper aperVar, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, int i, java.lang.String str, defpackage.apev apevVar, java.lang.Integer num) {
        this.a = aperVar;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.i = i;
        this.f = str;
        this.g = apevVar;
        this.h = num;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.f);
    }
}
