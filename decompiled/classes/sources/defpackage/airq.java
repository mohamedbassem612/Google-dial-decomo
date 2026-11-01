package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class airq {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final /* synthetic */ int b = 0;

    public abstract int a();

    public abstract int b();

    public abstract boolean c(defpackage.airq airqVar);

    public abstract byte[] d();

    public byte[] e() {
        return d();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.airq)) {
            return false;
        }
        defpackage.airq airqVar = (defpackage.airq) obj;
        return b() == airqVar.b() && c(airqVar);
    }

    public final int hashCode() {
        if (b() >= 32) {
            return a();
        }
        byte[] bArrE = e();
        int i = bArrE[0] & 255;
        for (int i2 = 1; i2 < bArrE.length; i2++) {
            i |= (bArrE[i2] & 255) << (i2 << 3);
        }
        return i;
    }

    public final java.lang.String toString() {
        byte[] bArrE = e();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArrE.length << 1);
        for (byte b2 : bArrE) {
            char[] cArr = a;
            sb.append(cArr[(b2 >> 4) & 15]);
            sb.append(cArr[b2 & 15]);
        }
        return sb.toString();
    }
}
