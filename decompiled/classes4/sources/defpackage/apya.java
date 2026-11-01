package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apya {
    public static final defpackage.apya a = new defpackage.apya(null);
    public final defpackage.apzj b = new defpackage.apzj();
    private boolean c;

    private apya(byte[] bArr) {
        c();
        c();
    }

    public static int a(defpackage.apzv apzvVar, int i, java.lang.Object obj) {
        int iNumberOfLeadingZeros;
        int iG;
        int iNumberOfLeadingZeros2;
        int iNumberOfLeadingZeros3;
        int i2;
        int iNumberOfLeadingZeros4 = (352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
        if (apzvVar == defpackage.apzv.GROUP) {
            iNumberOfLeadingZeros4 <<= 1;
        }
        defpackage.apzw apzwVar = defpackage.apzw.a;
        int iE = 4;
        switch (apzvVar.ordinal()) {
            case 0:
                ((java.lang.Double) obj).doubleValue();
                iE = 8;
                return iNumberOfLeadingZeros4 + iE;
            case 1:
                ((java.lang.Float) obj).floatValue();
                return iNumberOfLeadingZeros4 + iE;
            case 2:
                iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(((java.lang.Long) obj).longValue());
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                iE = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iE;
            case 3:
                iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(((java.lang.Long) obj).longValue());
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                iE = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iE;
            case 4:
                iE = defpackage.apxj.e(((java.lang.Integer) obj).intValue());
                return iNumberOfLeadingZeros4 + iE;
            case 5:
                ((java.lang.Long) obj).longValue();
                iE = 8;
                return iNumberOfLeadingZeros4 + iE;
            case 6:
                ((java.lang.Integer) obj).intValue();
                return iNumberOfLeadingZeros4 + iE;
            case 7:
                ((java.lang.Boolean) obj).booleanValue();
                iE = 1;
                return iNumberOfLeadingZeros4 + iE;
            case 8:
                iE = obj instanceof defpackage.apxo ? defpackage.apxj.b((defpackage.apxo) obj) : defpackage.apxj.g((java.lang.String) obj);
                return iNumberOfLeadingZeros4 + iE;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                iE = ((defpackage.apyv) obj).g();
                return iNumberOfLeadingZeros4 + iE;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                if (obj instanceof defpackage.apyk) {
                    throw null;
                }
                iG = ((defpackage.apyv) obj).g();
                iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iG);
                iE = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + iG;
                return iNumberOfLeadingZeros4 + iE;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                if (obj instanceof defpackage.apxo) {
                    iE = defpackage.apxj.b((defpackage.apxo) obj);
                } else {
                    iG = ((byte[]) obj).length;
                    iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iG);
                    iE = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + iG;
                }
                return iNumberOfLeadingZeros4 + iE;
            case 12:
                iNumberOfLeadingZeros3 = java.lang.Integer.numberOfLeadingZeros(((java.lang.Integer) obj).intValue());
                i2 = 352 - (iNumberOfLeadingZeros3 * 9);
                iE = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iE;
            case 13:
                iE = obj instanceof defpackage.apyh ? defpackage.apxj.e(((defpackage.apyh) obj).a()) : defpackage.apxj.e(((java.lang.Integer) obj).intValue());
                return iNumberOfLeadingZeros4 + iE;
            case 14:
                ((java.lang.Integer) obj).intValue();
                return iNumberOfLeadingZeros4 + iE;
            case 15:
                ((java.lang.Long) obj).longValue();
                iE = 8;
                return iNumberOfLeadingZeros4 + iE;
            case 16:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                iNumberOfLeadingZeros3 = java.lang.Integer.numberOfLeadingZeros((iIntValue << 1) ^ (iIntValue >> 31));
                i2 = 352 - (iNumberOfLeadingZeros3 * 9);
                iE = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iE;
            case 17:
                long jLongValue = ((java.lang.Long) obj).longValue();
                iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros((jLongValue << 1) ^ (jLongValue >> 63));
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                iE = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iE;
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void e(defpackage.apxj apxjVar, defpackage.apzv apzvVar, int i, java.lang.Object obj) throws defpackage.apxu {
        int i2 = i << 3;
        if (apzvVar == defpackage.apzv.GROUP) {
            apxjVar.B(i2 | 3);
            ((defpackage.apyv) obj).r(apxjVar);
            apxjVar.B(i2 | 4);
            return;
        }
        apxjVar.B(i2 | apzvVar.t);
        defpackage.apzw apzwVar = defpackage.apzw.a;
        switch (apzvVar.ordinal()) {
            case 0:
                apxjVar.i(((java.lang.Double) obj).doubleValue());
                break;
            case 1:
                apxjVar.k(((java.lang.Float) obj).floatValue());
                break;
            case 2:
                apxjVar.D(((java.lang.Long) obj).longValue());
                break;
            case 3:
                apxjVar.D(((java.lang.Long) obj).longValue());
                break;
            case 4:
                apxjVar.w(((java.lang.Integer) obj).intValue());
                break;
            case 5:
                apxjVar.u(((java.lang.Long) obj).longValue());
                break;
            case 6:
                apxjVar.s(((java.lang.Integer) obj).intValue());
                break;
            case 7:
                apxjVar.m(((java.lang.Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof defpackage.apxo)) {
                    apxjVar.z((java.lang.String) obj);
                } else {
                    apxjVar.q((defpackage.apxo) obj);
                }
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                ((defpackage.apyv) obj).r(apxjVar);
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                apxjVar.x((defpackage.apyv) obj);
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                if (!(obj instanceof defpackage.apxo)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    apxjVar.B(length);
                    apxjVar.n(bArr, 0, length);
                } else {
                    apxjVar.q((defpackage.apxo) obj);
                }
                break;
            case 12:
                apxjVar.B(((java.lang.Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof defpackage.apyh)) {
                    apxjVar.w(((java.lang.Integer) obj).intValue());
                } else {
                    apxjVar.w(((defpackage.apyh) obj).a());
                }
                break;
            case 14:
                apxjVar.s(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                apxjVar.u(((java.lang.Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                apxjVar.B((iIntValue << 1) ^ (iIntValue >> 31));
                break;
            case 17:
                long jLongValue = ((java.lang.Long) obj).longValue();
                apxjVar.D((jLongValue << 1) ^ (jLongValue >> 63));
                break;
        }
    }

    public final java.util.Iterator b() {
        return d() ? java.util.Collections.emptyIterator() : this.b.entrySet().iterator();
    }

    public final void c() {
        if (this.c) {
            return;
        }
        defpackage.apzj apzjVar = this.b;
        int size = apzjVar.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = ((defpackage.apzg) apzjVar.a(i)).a;
            if (obj instanceof defpackage.apyf) {
                ((defpackage.apyf) obj).m();
            }
        }
        if (!apzjVar.c) {
            apzjVar.c();
            java.lang.Object[] objArr = apzjVar.a;
            if (objArr != null && apzjVar.b > 0) {
                aehu aehuVar = ((defpackage.apzg) objArr[0]).c;
                throw null;
            }
            apzjVar.c = true;
        }
        this.c = true;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
        defpackage.apya apyaVar = new defpackage.apya();
        defpackage.apzj apzjVar = this.b;
        if (apzjVar.size() <= 0) {
            return apyaVar;
        }
        defpackage.apzg apzgVar = (defpackage.apzg) apzjVar.a(0);
        aehu aehuVar = apzgVar.c;
        java.lang.Object obj = apzgVar.a;
        throw null;
    }

    final boolean d() {
        return this.b.isEmpty();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.apya) {
            defpackage.apzj apzjVar = this.b;
            defpackage.apzj apzjVar2 = ((defpackage.apya) obj).b;
            if (apzjVar.size() == apzjVar2.size() && apzjVar.keySet().equals(apzjVar2.keySet())) {
                for (java.util.Map.Entry entry : apzjVar.entrySet()) {
                    java.lang.Object key = entry.getKey();
                    java.lang.Object value = entry.getValue();
                    apzjVar2.get(key);
                    if (value != null) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        defpackage.apzj apzjVar = this.b;
        if (apzjVar.size() <= 0) {
            return;
        }
        aehu aehuVar = ((defpackage.apzg) apzjVar.a(0)).c;
        throw null;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    private apya() {
    }
}
