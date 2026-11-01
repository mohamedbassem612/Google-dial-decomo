package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoyx {
    public static final defpackage.apcm a = new defpackage.apcm("NO_VALUE");

    public static final defpackage.aoxh a(defpackage.aoyt aoytVar, defpackage.aolr aolrVar, int i, int i2) {
        return ((i == 0 || i == -3) && i2 == 1) ? aoytVar : new defpackage.aozx(aoytVar, aolrVar, i, i2);
    }

    public static final defpackage.aoyq b(int i, int i2, int i3) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bj(i2, "extraBufferCapacity cannot be negative, but was "));
        }
        if (i <= 0 && i2 <= 0 && i3 != 1) {
            defpackage.aooh.I(i3);
            throw new java.lang.IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(defpackage.aooh.I(i3)));
        }
        int i4 = i2 + i;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new defpackage.aoyw(i, i4, i3);
    }

    public static /* synthetic */ defpackage.aoyq c(int i, int i2, int i3, int i4) {
        if (1 == (i4 & 1)) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return b(i, i2, i3);
    }
}
