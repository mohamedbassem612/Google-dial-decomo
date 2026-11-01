package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dpa {
    public static final defpackage.dpa a = new defpackage.dpa(0L, 3);
    public final long b;
    public final long c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dpa(long j, int i) {
        long j2;
        if ((i & 1) != 0) {
            defpackage.dpt[] dptVarArr = defpackage.dps.a;
            j2 = 4294967296L;
        } else {
            j2 = 0;
        }
        if ((i & 2) != 0) {
            defpackage.dpt[] dptVarArr2 = defpackage.dps.a;
            j = 4294967296L;
        }
        this(j2, j);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dpa) {
            long j = this.b;
            defpackage.dpa dpaVar = (defpackage.dpa) obj;
            long j2 = dpaVar.b;
            defpackage.dpt[] dptVarArr = defpackage.dps.a;
            if (j == j2 && this.c == dpaVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.dpt[] dptVarArr = defpackage.dps.a;
        long j = this.b;
        long j2 = this.c;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final java.lang.String toString() {
        long j = this.c;
        return "TextIndent(firstLine=" + defpackage.dps.c(this.b) + ", restLine=" + defpackage.dps.c(j) + ')';
    }

    public dpa(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public dpa() {
        this(0L, 3);
    }
}
