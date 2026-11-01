package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ehb {
    public static final defpackage.ehb a = new defpackage.ehb(null);
    public final defpackage.eik b = new defpackage.eik();
    private boolean c;

    private ehb(byte[] bArr) {
        c();
        c();
    }

    public static int a(defpackage.eja ejaVar, int i, java.lang.Object obj) {
        int iNumberOfLeadingZeros;
        int iH;
        int iNumberOfLeadingZeros2;
        int iNumberOfLeadingZeros3;
        int i2;
        int iNumberOfLeadingZeros4 = (352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
        if (ejaVar == defpackage.eja.GROUP) {
            iNumberOfLeadingZeros4 <<= 1;
        }
        defpackage.ejb ejbVar = defpackage.ejb.a;
        int I = 4;
        switch (ejaVar.ordinal()) {
            case 0:
                ((java.lang.Double) obj).doubleValue();
                I = 8;
                return iNumberOfLeadingZeros4 + I;
            case 1:
                ((java.lang.Float) obj).floatValue();
                return iNumberOfLeadingZeros4 + I;
            case 2:
                iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(((java.lang.Long) obj).longValue());
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                I = i2 >>> 6;
                return iNumberOfLeadingZeros4 + I;
            case 3:
                iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(((java.lang.Long) obj).longValue());
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                I = i2 >>> 6;
                return iNumberOfLeadingZeros4 + I;
            case 4:
                I = defpackage.egv.I(((java.lang.Integer) obj).intValue());
                return iNumberOfLeadingZeros4 + I;
            case 5:
                ((java.lang.Long) obj).longValue();
                I = 8;
                return iNumberOfLeadingZeros4 + I;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ((java.lang.Integer) obj).intValue();
                return iNumberOfLeadingZeros4 + I;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((java.lang.Boolean) obj).booleanValue();
                I = 1;
                return iNumberOfLeadingZeros4 + I;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                I = obj instanceof defpackage.egm ? defpackage.egv.F((defpackage.egm) obj) : defpackage.egv.K((java.lang.String) obj);
                return iNumberOfLeadingZeros4 + I;
            case 9:
                I = ((defpackage.ehw) obj).h();
                return iNumberOfLeadingZeros4 + I;
            case 10:
                if (obj instanceof defpackage.ehm) {
                    throw null;
                }
                iH = ((defpackage.ehw) obj).h();
                iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iH);
                I = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + iH;
                return iNumberOfLeadingZeros4 + I;
            case 11:
                if (obj instanceof defpackage.egm) {
                    I = defpackage.egv.F((defpackage.egm) obj);
                } else {
                    iH = ((byte[]) obj).length;
                    iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iH);
                    I = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + iH;
                }
                return iNumberOfLeadingZeros4 + I;
            case 12:
                iNumberOfLeadingZeros3 = java.lang.Integer.numberOfLeadingZeros(((java.lang.Integer) obj).intValue());
                i2 = 352 - (iNumberOfLeadingZeros3 * 9);
                I = i2 >>> 6;
                return iNumberOfLeadingZeros4 + I;
            case 13:
                I = obj instanceof ehi ? defpackage.egv.I(((ehi) obj).a()) : defpackage.egv.I(((java.lang.Integer) obj).intValue());
                return iNumberOfLeadingZeros4 + I;
            case 14:
                ((java.lang.Integer) obj).intValue();
                return iNumberOfLeadingZeros4 + I;
            case 15:
                ((java.lang.Long) obj).longValue();
                I = 8;
                return iNumberOfLeadingZeros4 + I;
            case 16:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                iNumberOfLeadingZeros3 = java.lang.Integer.numberOfLeadingZeros((iIntValue << 1) ^ (iIntValue >> 31));
                i2 = 352 - (iNumberOfLeadingZeros3 * 9);
                I = i2 >>> 6;
                return iNumberOfLeadingZeros4 + I;
            case 17:
                long jLongValue = ((java.lang.Long) obj).longValue();
                iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros((jLongValue << 1) ^ (jLongValue >> 63));
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                I = i2 >>> 6;
                return iNumberOfLeadingZeros4 + I;
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void d(defpackage.egv egvVar, defpackage.eja ejaVar, int i, java.lang.Object obj) {
        if (ejaVar == defpackage.eja.GROUP) {
            egvVar.s(i, 3);
            ((defpackage.ehw) obj).r(egvVar);
            egvVar.s(i, 4);
            return;
        }
        egvVar.s(i, ejaVar.t);
        defpackage.ejb ejbVar = defpackage.ejb.a;
        switch (ejaVar.ordinal()) {
            case 0:
                egvVar.M(((java.lang.Double) obj).doubleValue());
                break;
            case 1:
                egvVar.O(((java.lang.Float) obj).floatValue());
                break;
            case 2:
                egvVar.w(((java.lang.Long) obj).longValue());
                break;
            case 3:
                egvVar.w(((java.lang.Long) obj).longValue());
                break;
            case 4:
                egvVar.m(((java.lang.Integer) obj).intValue());
                break;
            case 5:
                egvVar.k(((java.lang.Long) obj).longValue());
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                egvVar.i(((java.lang.Integer) obj).intValue());
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                egvVar.c(((java.lang.Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof defpackage.egm)) {
                    egvVar.r((java.lang.String) obj);
                } else {
                    egvVar.g((defpackage.egm) obj);
                }
                break;
            case 9:
                ((defpackage.ehw) obj).r(egvVar);
                break;
            case 10:
                egvVar.n((defpackage.ehw) obj);
                break;
            case 11:
                if (!(obj instanceof defpackage.egm)) {
                    byte[] bArr = (byte[]) obj;
                    egvVar.x(bArr, bArr.length);
                } else {
                    egvVar.g((defpackage.egm) obj);
                }
                break;
            case 12:
                egvVar.u(((java.lang.Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof ehi)) {
                    egvVar.m(((java.lang.Integer) obj).intValue());
                } else {
                    egvVar.m(((ehi) obj).a());
                }
                break;
            case 14:
                egvVar.i(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                egvVar.k(((java.lang.Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                egvVar.u((iIntValue << 1) ^ (iIntValue >> 31));
                break;
            case 17:
                long jLongValue = ((java.lang.Long) obj).longValue();
                egvVar.w((jLongValue << 1) ^ (jLongValue >> 63));
                break;
        }
    }

    public final java.util.Iterator b() {
        return e() ? java.util.Collections.emptyIterator() : this.b.entrySet().iterator();
    }

    public final void c() {
        if (this.c) {
            return;
        }
        defpackage.eik eikVar = this.b;
        int size = eikVar.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = eikVar.a(i).a;
            if (obj instanceof defpackage.ehg) {
                ((defpackage.ehg) obj).n();
            }
        }
        if (!eikVar.c) {
            eikVar.c();
            java.lang.Object[] objArr = eikVar.a;
            if (objArr != null && eikVar.b > 0) {
                aehu aehuVar = ((eii) objArr[0]).c;
                throw null;
            }
            eikVar.c = true;
        }
        this.c = true;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
        defpackage.ehb ehbVar = new defpackage.ehb();
        defpackage.eik eikVar = this.b;
        if (eikVar.size() <= 0) {
            return ehbVar;
        }
        eii eiiVarA = eikVar.a(0);
        aehu aehuVar = eiiVarA.c;
        java.lang.Object obj = eiiVarA.a;
        throw null;
    }

    final boolean e() {
        return this.b.isEmpty();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ehb) {
            defpackage.eik eikVar = this.b;
            defpackage.eik eikVar2 = ((defpackage.ehb) obj).b;
            if (eikVar.size() == eikVar2.size() && eikVar.keySet().equals(eikVar2.keySet())) {
                for (java.util.Map.Entry entry : eikVar.entrySet()) {
                    java.lang.Object key = entry.getKey();
                    java.lang.Object value = entry.getValue();
                    eikVar2.get(key);
                    if (value != null) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        defpackage.eik eikVar = this.b;
        if (eikVar.size() <= 0) {
            return;
        }
        aehu aehuVar = eikVar.a(0).c;
        throw null;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    private ehb() {
    }
}
