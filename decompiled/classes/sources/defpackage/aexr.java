package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aexr {
    public static final defpackage.aexr a = new defpackage.aexr(defpackage.aiko.c);
    public final defpackage.aiho b;

    public aexr(defpackage.aiho aihoVar) {
        this.b = aihoVar;
    }

    public static defpackage.aexr a(defpackage.akzf akzfVar) throws java.io.IOException {
        long j;
        java.lang.String strY;
        defpackage.aexq aexqVar;
        byte[] bArrI;
        int iK = akzfVar.k();
        if (iK < 0) {
            throw new defpackage.alaz("Negative number of flags");
        }
        defpackage.aihm aihmVar = new defpackage.aihm(defpackage.aiju.a);
        long j2 = 0;
        for (int i = 0; i < iK; i++) {
            long jT = akzfVar.t();
            int i2 = (int) jT;
            long j3 = jT >>> 3;
            if (j3 == 0) {
                j = 0;
                strY = akzfVar.y();
            } else {
                long j4 = j3 + j2;
                if (j4 > 2305843009213693951L) {
                    throw new defpackage.alaz("Flag name larger than max size");
                }
                j = j4;
                strY = null;
            }
            int i3 = i2 & 7;
            if (i3 == 0 || i3 == 1) {
                aexqVar = new defpackage.aexq(j, strY, i3, 0L, null);
            } else if (i3 == 2) {
                aexqVar = new defpackage.aexq(j, strY, i3, akzfVar.t(), null);
            } else if (i3 == 3) {
                aexqVar = new defpackage.aexq(j, strY, i3, java.lang.Double.doubleToRawLongBits(akzfVar.b()), null);
            } else if (i3 == 4) {
                aexqVar = new defpackage.aexq(j, strY, i3, 0L, akzfVar.y());
            } else {
                if (i3 != 5) {
                    throw new defpackage.alaz(defpackage.a.bj(i3, "Unrecognized flag type "));
                }
                defpackage.akze akzeVar = (defpackage.akze) akzfVar;
                int iK2 = akzeVar.k();
                int i4 = akzeVar.b;
                int i5 = akzeVar.c;
                if (iK2 <= i4 - i5 && iK2 > 0) {
                    bArrI = java.util.Arrays.copyOfRange(akzeVar.a, i5, i5 + iK2);
                    akzeVar.c += iK2;
                } else {
                    if (iK2 < 0) {
                        throw new defpackage.alaz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
                    bArrI = akzeVar.I(iK2);
                }
                aexqVar = new defpackage.aexq(j, strY, i3, 0L, bArrI);
            }
            long j5 = aexqVar.a;
            if (j5 != 0) {
                j2 = j5;
            }
            aihmVar.n(aexqVar);
        }
        return new defpackage.aexr(aihmVar.g());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.aexr) {
            return this.b.equals(((defpackage.aexr) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return defpackage.ahvr.al(this.b);
    }
}
