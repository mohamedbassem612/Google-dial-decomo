package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class bkq implements defpackage.bjy {
    private final /* synthetic */ int $cid;
    public static final defpackage.bkq b = new defpackage.bkq(1);
    public static final defpackage.bkq a = new defpackage.bkq(0);

    public bkq(int i) {
        this.$cid = i;
    }

    @Override // defpackage.bjy
    public final long a(defpackage.bkl bklVar, int i) {
        if (this.$cid == 0) {
            return bklVar.f.i(i);
        }
        java.lang.String strD = bklVar.d();
        int i2 = i;
        while (true) {
            if (i2 <= 0) {
                i2 = 0;
                break;
            }
            int i3 = i2 - 1;
            if (strD.charAt(i3) == '\n') {
                break;
            }
            i2 = i3;
        }
        int length = strD.length();
        while (i < length) {
            if (strD.charAt(i) == '\n') {
                long jE = dfd.e(i2, i);
                long j = dky.a;
                return jE;
            }
            i++;
        }
        i = strD.length();
        long jE2 = dfd.e(i2, i);
        long j2 = dky.a;
        return jE2;
    }
}
