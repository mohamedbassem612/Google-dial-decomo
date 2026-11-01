package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class albk implements defpackage.albw {
    public static final int[] a = new int[0];
    public static final sun.misc.Unsafe b = defpackage.alco.h();
    private final int[] c;
    private final java.lang.Object[] d;
    private final int e;
    private final int f;
    private final defpackage.albh g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final defpackage.alci m;

    public albk(int[] iArr, java.lang.Object[] objArr, int i, int i2, defpackage.albh albhVar, int[] iArr2, int i3, int i4, defpackage.alci alciVar, defpackage.ajsz ajszVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = albhVar instanceof defpackage.alad;
        boolean z = false;
        if (ajszVar != null && (albhVar instanceof defpackage.alaa)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = alciVar;
        this.g = albhVar;
    }

    private static void A(java.lang.Object obj) {
        if (!L(obj)) {
            throw new java.lang.IllegalArgumentException("Mutating immutable message: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj))));
        }
    }

    private final void B(java.lang.Object obj, java.lang.Object obj2, int i) {
        if (J(obj2, i)) {
            int iS = s(i) & 1048575;
            sun.misc.Unsafe unsafe = b;
            long j = iS;
            java.lang.Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + n(i) + " is present but null: " + obj2.toString());
            }
            defpackage.albw albwVarW = w(i);
            if (!J(obj, i)) {
                if (L(object)) {
                    java.lang.Object objE = albwVarW.e();
                    albwVarW.h(objE, object);
                    unsafe.putObject(obj, j, objE);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                E(obj, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j);
            if (!L(object2)) {
                java.lang.Object objE2 = albwVarW.e();
                albwVarW.h(objE2, object2);
                unsafe.putObject(obj, j, objE2);
                object2 = objE2;
            }
            albwVarW.h(object2, object);
        }
    }

    private final void C(java.lang.Object obj, java.lang.Object obj2, int i) {
        int iN = n(i);
        if (N(obj2, iN, i)) {
            long jT = t(s(i));
            sun.misc.Unsafe unsafe = b;
            java.lang.Object object = unsafe.getObject(obj2, jT);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + n(i) + " is present but null: " + obj2.toString());
            }
            defpackage.albw albwVarW = w(i);
            if (!N(obj, iN, i)) {
                if (L(object)) {
                    java.lang.Object objE = albwVarW.e();
                    albwVarW.h(objE, object);
                    unsafe.putObject(obj, jT, objE);
                } else {
                    unsafe.putObject(obj, jT, object);
                }
                F(obj, iN, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, jT);
            if (!L(object2)) {
                java.lang.Object objE2 = albwVarW.e();
                albwVarW.h(objE2, object2);
                unsafe.putObject(obj, jT, objE2);
                object2 = objE2;
            }
            albwVarW.h(object2, object);
        }
    }

    private final void D(java.lang.Object obj, int i, defpackage.akzg akzgVar) throws defpackage.alay {
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            defpackage.alco.a.l(obj, j, akzgVar.u());
        } else if (this.i) {
            defpackage.alco.a.l(obj, j, akzgVar.t());
        } else {
            defpackage.alco.a.l(obj, j, akzgVar.o());
        }
    }

    private final void E(java.lang.Object obj, int i) {
        int iQ = q(i);
        long j = 1048575 & iQ;
        if (j != 1048575) {
            defpackage.alcn alcnVar = defpackage.alco.a;
            alcnVar.j(obj, j, alcnVar.g(obj, j) | (1 << (iQ >>> 20)));
        }
    }

    private final void F(java.lang.Object obj, int i, int i2) {
        defpackage.alco.n(obj, q(i2) & 1048575, i);
    }

    private final void G(java.lang.Object obj, int i, java.lang.Object obj2) {
        b.putObject(obj, s(i) & 1048575, obj2);
        E(obj, i);
    }

    private final void H(java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        b.putObject(obj, t(s(i2)), obj2);
        F(obj, i, i2);
    }

    private final boolean I(java.lang.Object obj, java.lang.Object obj2, int i) {
        return J(obj, i) == J(obj2, i);
    }

    private final boolean J(java.lang.Object obj, int i) {
        int iQ = q(i);
        long j = iQ & 1048575;
        if (j == 1048575) {
            int iS = s(i);
            long j2 = 1048575 & iS;
            switch ((iS >>> 20) & 255) {
                case 0:
                    if (java.lang.Double.doubleToRawLongBits(defpackage.alco.b(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (java.lang.Float.floatToRawIntBits(defpackage.alco.c(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (defpackage.alco.a.h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (defpackage.alco.a.h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (defpackage.alco.a.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (defpackage.alco.a.h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (defpackage.alco.a.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    return defpackage.alco.a.f(obj, j2);
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    java.lang.Object objI = defpackage.alco.a.i(obj, j2);
                    if (objI instanceof java.lang.String) {
                        if (((java.lang.String) objI).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objI instanceof defpackage.akzc)) {
                            return O();
                        }
                        if (defpackage.akzc.d.equals(objI)) {
                            return false;
                        }
                    }
                case 9:
                    if (defpackage.alco.a.i(obj, j2) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (defpackage.akzc.d.equals(defpackage.alco.a.i(obj, j2))) {
                        return false;
                    }
                    break;
                case 11:
                    if (defpackage.alco.a.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (defpackage.alco.a.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (defpackage.alco.a.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (defpackage.alco.a.h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (defpackage.alco.a.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (defpackage.alco.a.h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (defpackage.alco.a.i(obj, j2) == null) {
                        return false;
                    }
                    break;
                default:
                    return O();
            }
        } else {
            if ((defpackage.alco.a.g(obj, j) & (1 << (iQ >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    private final boolean K(java.lang.Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return J(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean L(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof defpackage.alad) {
            return ((defpackage.alad) obj).U();
        }
        return true;
    }

    private final boolean M(java.lang.Object obj, java.lang.Object obj2, int i) {
        long jQ = q(i) & 1048575;
        return defpackage.alco.d(obj, jQ) == defpackage.alco.d(obj2, jQ);
    }

    private final boolean N(java.lang.Object obj, int i, int i2) {
        return defpackage.alco.a.g(obj, (long) (q(i2) & 1048575)) == i;
    }

    private boolean O() {
        throw new java.lang.IllegalArgumentException();
    }

    private static final int P(byte[] bArr, int i, int i2, defpackage.alcr alcrVar, java.lang.Class cls, defpackage.akyq akyqVar) {
        int i3;
        defpackage.alcr alcrVar2 = defpackage.alcr.DOUBLE;
        switch (alcrVar.ordinal()) {
            case 0:
                i3 = i + 8;
                akyqVar.c = java.lang.Double.valueOf(defpackage.akyr.a(bArr, i));
                break;
            case 1:
                i3 = i + 4;
                akyqVar.c = java.lang.Float.valueOf(defpackage.akyr.b(bArr, i));
                break;
            case 2:
            case 3:
                int iP = defpackage.akyr.p(bArr, i, akyqVar);
                akyqVar.c = java.lang.Long.valueOf(akyqVar.b);
                return iP;
            case 4:
            case 12:
            case 13:
                int iM = defpackage.akyr.m(bArr, i, akyqVar);
                akyqVar.c = java.lang.Integer.valueOf(akyqVar.a);
                return iM;
            case 5:
            case 15:
                i3 = i + 8;
                akyqVar.c = java.lang.Long.valueOf(defpackage.akyr.t(bArr, i));
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case 14:
                i3 = i + 4;
                akyqVar.c = java.lang.Integer.valueOf(defpackage.akyr.d(bArr, i));
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                int iP2 = defpackage.akyr.p(bArr, i, akyqVar);
                akyqVar.c = java.lang.Boolean.valueOf(akyqVar.b != 0);
                return iP2;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.akyr.k(bArr, i, akyqVar);
            case 9:
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
            case 10:
                return defpackage.akyr.g(defpackage.albp.a.b(cls), bArr, i, i2, akyqVar);
            case 11:
                return defpackage.akyr.c(bArr, i, akyqVar);
            case 16:
                int iM2 = defpackage.akyr.m(bArr, i, akyqVar);
                int i4 = akyqVar.a;
                int i5 = defpackage.akzf.i;
                akyqVar.c = java.lang.Integer.valueOf((i4 >>> 1) ^ (-(i4 & 1)));
                return iM2;
            case 17:
                int iP3 = defpackage.akyr.p(bArr, i, akyqVar);
                long j = akyqVar.b;
                int i6 = defpackage.akzf.i;
                akyqVar.c = java.lang.Long.valueOf((j >>> 1) ^ (-(j & 1)));
                return iP3;
        }
        return i3;
    }

    private final java.lang.Object Q(java.lang.Object obj, int i, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.alai alaiVarV;
        int iN = n(i);
        java.lang.Object objI = defpackage.alco.a.i(obj, s(i) & 1048575);
        if (objI != null && (alaiVarV = v(i)) != null) {
            java.lang.Object obj4 = ((defpackage.ajyk) x(i)).b;
            java.util.Iterator it = ((defpackage.albe) objI).entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (!alaiVarV.a(((java.lang.Integer) entry.getValue()).intValue())) {
                    if (obj2 == null) {
                        obj2 = defpackage.alci.d(obj3);
                    }
                    int iV = defpackage.ajyk.V((defpackage.apdi) obj4, entry.getKey(), entry.getValue());
                    defpackage.akzc akzcVar = defpackage.akzc.d;
                    byte[] bArr = new byte[iV];
                    defpackage.akzh akzhVar = new defpackage.akzh(bArr, 0, iV);
                    try {
                        defpackage.ajyk.W(akzhVar, (defpackage.apdi) obj4, entry.getKey(), entry.getValue());
                        akzhVar.H();
                        ((defpackage.alcj) obj2).e((iN << 3) | 2, new defpackage.akza(bArr));
                        it.remove();
                    } catch (java.io.IOException e) {
                        throw new java.lang.RuntimeException(e);
                    }
                }
            }
        }
        return obj2;
    }

    private static final void R(int i, java.lang.Object obj, defpackage.ajyk ajykVar) {
        if (obj instanceof java.lang.String) {
            ajykVar.F(i, (java.lang.String) obj);
        } else {
            ajykVar.q(i, (defpackage.akzc) obj);
        }
    }

    static defpackage.alcj d(java.lang.Object obj) {
        defpackage.alad aladVar = (defpackage.alad) obj;
        defpackage.alcj alcjVar = aladVar.P;
        if (alcjVar != defpackage.alcj.a) {
            return alcjVar;
        }
        defpackage.alcj alcjVar2 = new defpackage.alcj();
        aladVar.P = alcjVar2;
        return alcjVar2;
    }

    public static java.lang.reflect.Field f(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException e) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new java.lang.RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + java.util.Arrays.toString(declaredFields), e);
        }
    }

    private final int n(int i) {
        return this.c[i];
    }

    private static int o(java.lang.Object obj, long j) {
        return ((java.lang.Integer) defpackage.alco.f(obj, j)).intValue();
    }

    private final int p(int i) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return r(i, 0);
    }

    private final int q(int i) {
        return this.c[i + 2];
    }

    private final int r(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iN = n(i4);
            if (i == iN) {
                return i4;
            }
            if (i < iN) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final int s(int i) {
        return this.c[i + 1];
    }

    private static long t(int i) {
        return i & 1048575;
    }

    private static long u(java.lang.Object obj, long j) {
        return ((java.lang.Long) defpackage.alco.f(obj, j)).longValue();
    }

    private final defpackage.alai v(int i) {
        return (defpackage.alai) this.d[((i / 3) << 1) + 1];
    }

    private final defpackage.albw w(int i) {
        java.lang.Object[] objArr = this.d;
        int i2 = (i / 3) << 1;
        defpackage.albw albwVar = (defpackage.albw) objArr[i2];
        if (albwVar != null) {
            return albwVar;
        }
        defpackage.albw albwVarB = defpackage.albp.a.b((java.lang.Class) objArr[i2 + 1]);
        objArr[i2] = albwVarB;
        return albwVarB;
    }

    private final java.lang.Object x(int i) {
        return this.d[(i / 3) << 1];
    }

    private final java.lang.Object y(java.lang.Object obj, int i) {
        defpackage.albw albwVarW = w(i);
        int iS = s(i) & 1048575;
        if (!J(obj, i)) {
            return albwVarW.e();
        }
        java.lang.Object object = b.getObject(obj, iS);
        if (L(object)) {
            return object;
        }
        java.lang.Object objE = albwVarW.e();
        if (object != null) {
            albwVarW.h(objE, object);
        }
        return objE;
    }

    private final java.lang.Object z(java.lang.Object obj, int i, int i2) {
        defpackage.albw albwVarW = w(i2);
        if (!N(obj, i, i2)) {
            return albwVarW.e();
        }
        java.lang.Object object = b.getObject(obj, t(s(i2)));
        if (L(object)) {
            return object;
        }
        java.lang.Object objE = albwVarW.e();
        if (object != null) {
            albwVarW.h(objE, object);
        }
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:198:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:203:0x0619  */
    @Override // defpackage.albw
    public final int a(java.lang.Object obj) {
        int i;
        int iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2;
        int iNumberOfLeadingZeros3;
        int iNumberOfLeadingZeros4;
        int iNumberOfLeadingZeros5;
        int iNumberOfLeadingZeros6;
        int iNumberOfLeadingZeros7;
        int iNumberOfLeadingZeros8;
        int iO;
        int iNumberOfLeadingZeros9;
        int iNumberOfLeadingZeros10;
        int iH;
        int iA;
        int iH2;
        int size;
        int size2;
        int iNumberOfLeadingZeros11;
        int iNumberOfLeadingZeros12;
        int iO2;
        int iNumberOfLeadingZeros13;
        int iO3;
        int iNumberOfLeadingZeros14;
        int iNumberOfLeadingZeros15;
        int iNumberOfLeadingZeros16;
        int iNumberOfLeadingZeros17;
        int iNumberOfLeadingZeros18;
        int iA2;
        int iNumberOfLeadingZeros19;
        int iNumberOfLeadingZeros20;
        int iNumberOfLeadingZeros21;
        int iNumberOfLeadingZeros22;
        int iNumberOfLeadingZeros23;
        int iNumberOfLeadingZeros24;
        int iNumberOfLeadingZeros25;
        int iO4;
        int iNumberOfLeadingZeros26;
        int iNumberOfLeadingZeros27;
        int i2;
        defpackage.albk albkVar = this;
        sun.misc.Unsafe unsafe = b;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int iNumberOfLeadingZeros28 = 0;
        while (true) {
            int[] iArr = albkVar.c;
            if (i4 >= iArr.length) {
                int iA3 = iNumberOfLeadingZeros28 + ((defpackage.alad) obj).P.a();
                if (!albkVar.h) {
                    return iA3;
                }
                defpackage.alcb alcbVar = ((defpackage.alaa) obj).n.b;
                int size3 = alcbVar.size();
                int i6 = 0;
                for (int i7 = 0; i7 < size3; i7++) {
                    defpackage.alby albyVar = (defpackage.alby) alcbVar.a(i7);
                    i6 += defpackage.akzs.i(albyVar.c, albyVar.a);
                }
                return iA3 + i6;
            }
            int iS = albkVar.s(i4);
            int iN = albkVar.n(i4);
            int i8 = iArr[i4 + 2];
            int i9 = i8 & 1048575;
            int i10 = (iS >>> 20) & 255;
            if (i10 <= 17) {
                if (i9 != i3) {
                    i5 = i9 == 1048575 ? 0 : unsafe.getInt(obj, i9);
                    i3 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            int i11 = iS & 1048575;
            if (i10 >= defpackage.akzt.DOUBLE_LIST_PACKED.Z) {
                int i12 = defpackage.akzt.SINT64_LIST_PACKED.Z;
            }
            long j = i11;
            switch (i10) {
                case 0:
                    if (albkVar.K(obj, i4, i3, i5, i)) {
                        iNumberOfLeadingZeros28 += ((352 - (java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6) + 8;
                    }
                    break;
                case 1:
                    if (albkVar.K(obj, i4, i3, i5, i)) {
                        iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iNumberOfLeadingZeros7 = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros7;
                    }
                    albkVar = this;
                    break;
                case 2:
                    if (albkVar.K(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros3 = java.lang.Long.numberOfLeadingZeros(j2);
                        iNumberOfLeadingZeros7 = ((352 - iNumberOfLeadingZeros2) >>> 6) + ((640 - (iNumberOfLeadingZeros3 * 9)) >>> 6);
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros7;
                    }
                    albkVar = this;
                    break;
                case 3:
                    if (albkVar.K(obj, i4, i3, i5, i)) {
                        long j3 = unsafe.getLong(obj, j);
                        iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros3 = java.lang.Long.numberOfLeadingZeros(j3);
                        iNumberOfLeadingZeros7 = ((352 - iNumberOfLeadingZeros2) >>> 6) + ((640 - (iNumberOfLeadingZeros3 * 9)) >>> 6);
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros7;
                    }
                    albkVar = this;
                    break;
                case 4:
                    if (albkVar.K(obj, i4, i3, i5, i)) {
                        int i13 = unsafe.getInt(obj, j);
                        iNumberOfLeadingZeros4 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros5 = java.lang.Long.numberOfLeadingZeros(i13);
                        iNumberOfLeadingZeros28 += ((352 - iNumberOfLeadingZeros4) >>> 6) + ((640 - (iNumberOfLeadingZeros5 * 9)) >>> 6);
                    }
                    albkVar = this;
                    break;
                case 5:
                    if (albkVar.K(obj, i4, i3, i5, i)) {
                        iNumberOfLeadingZeros6 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iNumberOfLeadingZeros7 = ((352 - (iNumberOfLeadingZeros6 * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros7;
                    }
                    albkVar = this;
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (albkVar.K(obj, i4, i3, i5, i)) {
                        iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iNumberOfLeadingZeros7 = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros7;
                    }
                    albkVar = this;
                    break;
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (albkVar.K(obj, i4, i3, i5, i)) {
                        iNumberOfLeadingZeros7 = ((352 - (java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6) + 1;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros7;
                    }
                    albkVar = this;
                    break;
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    if (albkVar.K(obj, i4, i3, i5, i)) {
                        int i14 = iN << 3;
                        java.lang.Object object = unsafe.getObject(obj, j);
                        if (object instanceof defpackage.akzc) {
                            iNumberOfLeadingZeros8 = java.lang.Integer.numberOfLeadingZeros(i14) * 9;
                            iO = ((defpackage.akzc) object).c();
                            iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iO);
                        } else {
                            iNumberOfLeadingZeros8 = java.lang.Integer.numberOfLeadingZeros(i14) * 9;
                            iO = defpackage.ajsz.O((java.lang.String) object);
                            iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iO);
                        }
                        iNumberOfLeadingZeros7 = ((352 - iNumberOfLeadingZeros8) >>> 6) + ((352 - (iNumberOfLeadingZeros9 * 9)) >>> 6) + iO;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros7;
                    }
                    albkVar = this;
                    break;
                case 9:
                    if (albkVar.K(obj, i4, i3, i5, i)) {
                        java.lang.Object object2 = unsafe.getObject(obj, j);
                        defpackage.albw albwVarW = albkVar.w(i4);
                        defpackage.alci alciVar = defpackage.albx.a;
                        int iNumberOfLeadingZeros29 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        int iE = ((defpackage.akym) object2).e(albwVarW);
                        iNumberOfLeadingZeros10 = ((352 - (java.lang.Integer.numberOfLeadingZeros(iE) * 9)) >>> 6) + iE;
                        iH = (352 - iNumberOfLeadingZeros29) >>> 6;
                        iA = iH + iNumberOfLeadingZeros10;
                        iNumberOfLeadingZeros28 += iA;
                    }
                    break;
                case 10:
                    if (albkVar.K(obj, i4, i3, i5, i)) {
                        defpackage.akzc akzcVar = (defpackage.akzc) unsafe.getObject(obj, j);
                        iNumberOfLeadingZeros8 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iO = akzcVar.c();
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iO);
                        iNumberOfLeadingZeros7 = ((352 - iNumberOfLeadingZeros8) >>> 6) + ((352 - (iNumberOfLeadingZeros9 * 9)) >>> 6) + iO;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros7;
                    }
                    albkVar = this;
                    break;
                case 11:
                    if (albkVar.K(obj, i4, i3, i5, i)) {
                        iNumberOfLeadingZeros7 = defpackage.a.au(iN, unsafe.getInt(obj, j));
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros7;
                    }
                    albkVar = this;
                    break;
                case 12:
                    if (albkVar.K(obj, i4, i3, i5, i)) {
                        int i15 = unsafe.getInt(obj, j);
                        iNumberOfLeadingZeros4 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros5 = java.lang.Long.numberOfLeadingZeros(i15);
                        iNumberOfLeadingZeros28 += ((352 - iNumberOfLeadingZeros4) >>> 6) + ((640 - (iNumberOfLeadingZeros5 * 9)) >>> 6);
                    }
                    albkVar = this;
                    break;
                case 13:
                    if (albkVar.K(obj, i4, i3, i5, i)) {
                        iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iNumberOfLeadingZeros7 = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros7;
                    }
                    albkVar = this;
                    break;
                case 14:
                    if (albkVar.K(obj, i4, i3, i5, i)) {
                        iNumberOfLeadingZeros6 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iNumberOfLeadingZeros7 = ((352 - (iNumberOfLeadingZeros6 * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros7;
                    }
                    albkVar = this;
                    break;
                case 15:
                    if (albkVar.K(obj, i4, i3, i5, i)) {
                        iNumberOfLeadingZeros7 = defpackage.a.as(iN, unsafe.getInt(obj, j));
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros7;
                    }
                    albkVar = this;
                    break;
                case 16:
                    if (albkVar.K(obj, i4, i3, i5, i)) {
                        long j4 = unsafe.getLong(obj, j);
                        iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros3 = java.lang.Long.numberOfLeadingZeros((j4 << 1) ^ (j4 >> 63));
                        iNumberOfLeadingZeros7 = ((352 - iNumberOfLeadingZeros2) >>> 6) + ((640 - (iNumberOfLeadingZeros3 * 9)) >>> 6);
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros7;
                    }
                    albkVar = this;
                    break;
                case 17:
                    if (albkVar.K(obj, i4, i3, i5, i)) {
                        iA = defpackage.albx.a(iN, (defpackage.albh) unsafe.getObject(obj, j), albkVar.w(i4));
                        iNumberOfLeadingZeros28 += iA;
                    }
                    break;
                case 18:
                    java.util.List list = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar2 = defpackage.albx.a;
                    iA = defpackage.a.ap(iN, list);
                    iNumberOfLeadingZeros28 += iA;
                    break;
                case 19:
                    java.util.List list2 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar3 = defpackage.albx.a;
                    iA = defpackage.a.ao(iN, list2);
                    iNumberOfLeadingZeros28 += iA;
                    break;
                case 20:
                    java.util.List list3 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar4 = defpackage.albx.a;
                    if (list3.size() == 0) {
                        iNumberOfLeadingZeros16 = 0;
                    } else {
                        iH2 = defpackage.albx.h(list3);
                        size = list3.size() * ((352 - (java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6);
                        iNumberOfLeadingZeros16 = iH2 + size;
                    }
                    iNumberOfLeadingZeros28 += iNumberOfLeadingZeros16;
                    break;
                case 21:
                    java.util.List list4 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar5 = defpackage.albx.a;
                    size2 = list4.size();
                    if (size2 == 0) {
                        iA = 0;
                    } else {
                        iH = defpackage.albx.h(list4);
                        iNumberOfLeadingZeros11 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iNumberOfLeadingZeros10 = size2 * ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iA = iH + iNumberOfLeadingZeros10;
                    }
                    iNumberOfLeadingZeros28 += iA;
                    break;
                case 22:
                    java.util.List list5 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar6 = defpackage.albx.a;
                    size2 = list5.size();
                    if (size2 != 0) {
                        iH = defpackage.albx.c(list5);
                        iNumberOfLeadingZeros11 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iNumberOfLeadingZeros10 = size2 * ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iA = iH + iNumberOfLeadingZeros10;
                    } else {
                        iA = 0;
                    }
                    iNumberOfLeadingZeros28 += iA;
                    break;
                case 23:
                    java.util.List list6 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar7 = defpackage.albx.a;
                    iA = defpackage.a.ap(iN, list6);
                    iNumberOfLeadingZeros28 += iA;
                    break;
                case 24:
                    java.util.List list7 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar8 = defpackage.albx.a;
                    iA = defpackage.a.ao(iN, list7);
                    iNumberOfLeadingZeros28 += iA;
                    break;
                case 25:
                    java.util.List list8 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar9 = defpackage.albx.a;
                    int size4 = list8.size();
                    if (size4 != 0) {
                        iA = size4 * (((352 - (java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6) + 1);
                    } else {
                        iA = 0;
                    }
                    iNumberOfLeadingZeros28 += iA;
                    break;
                case 26:
                    java.util.List list9 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar10 = defpackage.albx.a;
                    int size5 = list9.size();
                    if (size5 == 0) {
                        iNumberOfLeadingZeros12 = 0;
                    } else {
                        boolean z = list9 instanceof defpackage.albc;
                        iNumberOfLeadingZeros12 = ((352 - (java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6) * size5;
                        if (z) {
                            defpackage.albc albcVar = (defpackage.albc) list9;
                            for (int i16 = 0; i16 < size5; i16++) {
                                java.lang.Object objC = albcVar.c();
                                if (objC instanceof defpackage.akzc) {
                                    iO3 = ((defpackage.akzc) objC).c();
                                    iNumberOfLeadingZeros14 = java.lang.Integer.numberOfLeadingZeros(iO3);
                                } else {
                                    iO3 = defpackage.ajsz.O((java.lang.String) objC);
                                    iNumberOfLeadingZeros14 = java.lang.Integer.numberOfLeadingZeros(iO3);
                                }
                                iNumberOfLeadingZeros12 += ((352 - (iNumberOfLeadingZeros14 * 9)) >>> 6) + iO3;
                            }
                        } else {
                            for (int i17 = 0; i17 < size5; i17++) {
                                java.lang.Object obj2 = list9.get(i17);
                                if (obj2 instanceof defpackage.akzc) {
                                    iO2 = ((defpackage.akzc) obj2).c();
                                    iNumberOfLeadingZeros13 = java.lang.Integer.numberOfLeadingZeros(iO2);
                                } else {
                                    iO2 = defpackage.ajsz.O((java.lang.String) obj2);
                                    iNumberOfLeadingZeros13 = java.lang.Integer.numberOfLeadingZeros(iO2);
                                }
                                iNumberOfLeadingZeros12 += ((352 - (iNumberOfLeadingZeros13 * 9)) >>> 6) + iO2;
                            }
                        }
                    }
                    iNumberOfLeadingZeros28 += iNumberOfLeadingZeros12;
                    break;
                case 27:
                    java.util.List list10 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.albw albwVarW2 = albkVar.w(i4);
                    defpackage.alci alciVar11 = defpackage.albx.a;
                    int size6 = list10.size();
                    if (size6 == 0) {
                        iNumberOfLeadingZeros15 = 0;
                    } else {
                        iNumberOfLeadingZeros15 = ((352 - (java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6) * size6;
                        for (int i18 = 0; i18 < size6; i18++) {
                            int iE2 = ((defpackage.akym) list10.get(i18)).e(albwVarW2);
                            iNumberOfLeadingZeros15 += ((352 - (java.lang.Integer.numberOfLeadingZeros(iE2) * 9)) >>> 6) + iE2;
                        }
                    }
                    iNumberOfLeadingZeros28 += iNumberOfLeadingZeros15;
                    break;
                case 28:
                    java.util.List list11 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar12 = defpackage.albx.a;
                    int size7 = list11.size();
                    if (size7 != 0) {
                        iNumberOfLeadingZeros16 = size7 * ((352 - (java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6);
                        for (int i19 = 0; i19 < list11.size(); i19++) {
                            iNumberOfLeadingZeros16 += defpackage.akzk.E((defpackage.akzc) list11.get(i19));
                        }
                    } else {
                        iNumberOfLeadingZeros16 = 0;
                    }
                    iNumberOfLeadingZeros28 += iNumberOfLeadingZeros16;
                    break;
                case 29:
                    java.util.List list12 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar13 = defpackage.albx.a;
                    size2 = list12.size();
                    if (size2 != 0) {
                        iH = defpackage.albx.f(list12);
                        iNumberOfLeadingZeros11 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iNumberOfLeadingZeros10 = size2 * ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iA = iH + iNumberOfLeadingZeros10;
                    } else {
                        iA = 0;
                    }
                    iNumberOfLeadingZeros28 += iA;
                    break;
                case 30:
                    java.util.List list13 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar14 = defpackage.albx.a;
                    size2 = list13.size();
                    if (size2 != 0) {
                        iH = defpackage.albx.b(list13);
                        iNumberOfLeadingZeros11 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iNumberOfLeadingZeros10 = size2 * ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iA = iH + iNumberOfLeadingZeros10;
                    } else {
                        iA = 0;
                    }
                    iNumberOfLeadingZeros28 += iA;
                    break;
                case 31:
                    java.util.List list14 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar15 = defpackage.albx.a;
                    iA = defpackage.a.ao(iN, list14);
                    iNumberOfLeadingZeros28 += iA;
                    break;
                case 32:
                    java.util.List list15 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar16 = defpackage.albx.a;
                    iA = defpackage.a.ap(iN, list15);
                    iNumberOfLeadingZeros28 += iA;
                    break;
                case 33:
                    java.util.List list16 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar17 = defpackage.albx.a;
                    size2 = list16.size();
                    if (size2 != 0) {
                        iH = defpackage.albx.d(list16);
                        iNumberOfLeadingZeros11 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iNumberOfLeadingZeros10 = size2 * ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iA = iH + iNumberOfLeadingZeros10;
                    } else {
                        iA = 0;
                    }
                    iNumberOfLeadingZeros28 += iA;
                    break;
                case 34:
                    java.util.List list17 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar18 = defpackage.albx.a;
                    size2 = list17.size();
                    if (size2 != 0) {
                        iH = defpackage.albx.e(list17);
                        iNumberOfLeadingZeros11 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iNumberOfLeadingZeros10 = size2 * ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iA = iH + iNumberOfLeadingZeros10;
                    } else {
                        iA = 0;
                    }
                    iNumberOfLeadingZeros28 += iA;
                    break;
                case 35:
                    java.util.List list18 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar19 = defpackage.albx.a;
                    size = list18.size() << 3;
                    if (size > 0) {
                        iNumberOfLeadingZeros17 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros18 = java.lang.Integer.numberOfLeadingZeros(size);
                        iH2 = ((352 - iNumberOfLeadingZeros17) >>> 6) + ((352 - (iNumberOfLeadingZeros18 * 9)) >>> 6);
                        iNumberOfLeadingZeros16 = iH2 + size;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros16;
                    }
                    break;
                case 36:
                    java.util.List list19 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar20 = defpackage.albx.a;
                    size = list19.size() << 2;
                    if (size > 0) {
                        iNumberOfLeadingZeros17 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros18 = java.lang.Integer.numberOfLeadingZeros(size);
                        iH2 = ((352 - iNumberOfLeadingZeros17) >>> 6) + ((352 - (iNumberOfLeadingZeros18 * 9)) >>> 6);
                        iNumberOfLeadingZeros16 = iH2 + size;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros16;
                    }
                    break;
                case 37:
                    size = defpackage.albx.h((java.util.List) unsafe.getObject(obj, j));
                    if (size > 0) {
                        iNumberOfLeadingZeros17 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros18 = java.lang.Integer.numberOfLeadingZeros(size);
                        iH2 = ((352 - iNumberOfLeadingZeros17) >>> 6) + ((352 - (iNumberOfLeadingZeros18 * 9)) >>> 6);
                        iNumberOfLeadingZeros16 = iH2 + size;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros16;
                    }
                    break;
                case 38:
                    size = defpackage.albx.h((java.util.List) unsafe.getObject(obj, j));
                    if (size > 0) {
                        iNumberOfLeadingZeros17 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros18 = java.lang.Integer.numberOfLeadingZeros(size);
                        iH2 = ((352 - iNumberOfLeadingZeros17) >>> 6) + ((352 - (iNumberOfLeadingZeros18 * 9)) >>> 6);
                        iNumberOfLeadingZeros16 = iH2 + size;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros16;
                    }
                    break;
                case 39:
                    size = defpackage.albx.c((java.util.List) unsafe.getObject(obj, j));
                    if (size > 0) {
                        iNumberOfLeadingZeros17 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros18 = java.lang.Integer.numberOfLeadingZeros(size);
                        iH2 = ((352 - iNumberOfLeadingZeros17) >>> 6) + ((352 - (iNumberOfLeadingZeros18 * 9)) >>> 6);
                        iNumberOfLeadingZeros16 = iH2 + size;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros16;
                    }
                    break;
                case 40:
                    java.util.List list20 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar21 = defpackage.albx.a;
                    size = list20.size() << 3;
                    if (size > 0) {
                        iNumberOfLeadingZeros17 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros18 = java.lang.Integer.numberOfLeadingZeros(size);
                        iH2 = ((352 - iNumberOfLeadingZeros17) >>> 6) + ((352 - (iNumberOfLeadingZeros18 * 9)) >>> 6);
                        iNumberOfLeadingZeros16 = iH2 + size;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros16;
                    }
                    break;
                case 41:
                    java.util.List list21 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar22 = defpackage.albx.a;
                    size = list21.size() << 2;
                    if (size > 0) {
                        iNumberOfLeadingZeros17 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros18 = java.lang.Integer.numberOfLeadingZeros(size);
                        iH2 = ((352 - iNumberOfLeadingZeros17) >>> 6) + ((352 - (iNumberOfLeadingZeros18 * 9)) >>> 6);
                        iNumberOfLeadingZeros16 = iH2 + size;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros16;
                    }
                    break;
                case 42:
                    java.util.List list22 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar23 = defpackage.albx.a;
                    size = list22.size();
                    if (size > 0) {
                        iNumberOfLeadingZeros17 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros18 = java.lang.Integer.numberOfLeadingZeros(size);
                        iH2 = ((352 - iNumberOfLeadingZeros17) >>> 6) + ((352 - (iNumberOfLeadingZeros18 * 9)) >>> 6);
                        iNumberOfLeadingZeros16 = iH2 + size;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros16;
                    }
                    break;
                case 43:
                    size = defpackage.albx.f((java.util.List) unsafe.getObject(obj, j));
                    if (size > 0) {
                        iNumberOfLeadingZeros17 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros18 = java.lang.Integer.numberOfLeadingZeros(size);
                        iH2 = ((352 - iNumberOfLeadingZeros17) >>> 6) + ((352 - (iNumberOfLeadingZeros18 * 9)) >>> 6);
                        iNumberOfLeadingZeros16 = iH2 + size;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros16;
                    }
                    break;
                case 44:
                    size = defpackage.albx.b((java.util.List) unsafe.getObject(obj, j));
                    if (size > 0) {
                        iNumberOfLeadingZeros17 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros18 = java.lang.Integer.numberOfLeadingZeros(size);
                        iH2 = ((352 - iNumberOfLeadingZeros17) >>> 6) + ((352 - (iNumberOfLeadingZeros18 * 9)) >>> 6);
                        iNumberOfLeadingZeros16 = iH2 + size;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros16;
                    }
                    break;
                case 45:
                    java.util.List list23 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar24 = defpackage.albx.a;
                    size = list23.size() << 2;
                    if (size > 0) {
                        iNumberOfLeadingZeros17 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros18 = java.lang.Integer.numberOfLeadingZeros(size);
                        iH2 = ((352 - iNumberOfLeadingZeros17) >>> 6) + ((352 - (iNumberOfLeadingZeros18 * 9)) >>> 6);
                        iNumberOfLeadingZeros16 = iH2 + size;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros16;
                    }
                    break;
                case 46:
                    java.util.List list24 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar25 = defpackage.albx.a;
                    size = list24.size() << 3;
                    if (size > 0) {
                        iNumberOfLeadingZeros17 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros18 = java.lang.Integer.numberOfLeadingZeros(size);
                        iH2 = ((352 - iNumberOfLeadingZeros17) >>> 6) + ((352 - (iNumberOfLeadingZeros18 * 9)) >>> 6);
                        iNumberOfLeadingZeros16 = iH2 + size;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros16;
                    }
                    break;
                case 47:
                    size = defpackage.albx.d((java.util.List) unsafe.getObject(obj, j));
                    if (size > 0) {
                        iNumberOfLeadingZeros17 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros18 = java.lang.Integer.numberOfLeadingZeros(size);
                        iH2 = ((352 - iNumberOfLeadingZeros17) >>> 6) + ((352 - (iNumberOfLeadingZeros18 * 9)) >>> 6);
                        iNumberOfLeadingZeros16 = iH2 + size;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros16;
                    }
                    break;
                case 48:
                    size = defpackage.albx.e((java.util.List) unsafe.getObject(obj, j));
                    if (size > 0) {
                        iNumberOfLeadingZeros17 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros18 = java.lang.Integer.numberOfLeadingZeros(size);
                        iH2 = ((352 - iNumberOfLeadingZeros17) >>> 6) + ((352 - (iNumberOfLeadingZeros18 * 9)) >>> 6);
                        iNumberOfLeadingZeros16 = iH2 + size;
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros16;
                    }
                    break;
                case 49:
                    java.util.List list25 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.albw albwVarW3 = albkVar.w(i4);
                    defpackage.alci alciVar26 = defpackage.albx.a;
                    int size8 = list25.size();
                    if (size8 == 0) {
                        iA2 = 0;
                    } else {
                        iA2 = 0;
                        for (int i20 = 0; i20 < size8; i20++) {
                            iA2 += defpackage.albx.a(iN, (defpackage.albh) list25.get(i20), albwVarW3);
                        }
                    }
                    iNumberOfLeadingZeros28 += iA2;
                    break;
                case 50:
                    defpackage.albe albeVar = (defpackage.albe) unsafe.getObject(obj, j);
                    defpackage.ajyk ajykVar = (defpackage.ajyk) albkVar.x(i4);
                    if (albeVar.isEmpty()) {
                        iNumberOfLeadingZeros15 = 0;
                    } else {
                        iNumberOfLeadingZeros15 = 0;
                        for (java.util.Map.Entry entry : albeVar.entrySet()) {
                            java.lang.Object key = entry.getKey();
                            java.lang.Object value = entry.getValue();
                            int iNumberOfLeadingZeros30 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                            int iV = defpackage.ajyk.V((defpackage.apdi) ajykVar.b, key, value);
                            iNumberOfLeadingZeros15 += ((352 - iNumberOfLeadingZeros30) >>> 6) + ((352 - (java.lang.Integer.numberOfLeadingZeros(iV) * 9)) >>> 6) + iV;
                        }
                    }
                    iNumberOfLeadingZeros28 += iNumberOfLeadingZeros15;
                    break;
                case 51:
                    if (albkVar.N(obj, iN, i4)) {
                        iNumberOfLeadingZeros19 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iA = ((352 - (iNumberOfLeadingZeros19 * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros28 += iA;
                    }
                    break;
                case 52:
                    if (albkVar.N(obj, iN, i4)) {
                        iNumberOfLeadingZeros20 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iA = ((352 - (iNumberOfLeadingZeros20 * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros28 += iA;
                    }
                    break;
                case 53:
                    if (albkVar.N(obj, iN, i4)) {
                        long jU = u(obj, j);
                        iNumberOfLeadingZeros21 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros22 = java.lang.Long.numberOfLeadingZeros(jU);
                        i2 = (352 - iNumberOfLeadingZeros21) >>> 6;
                        iNumberOfLeadingZeros27 = (640 - (iNumberOfLeadingZeros22 * 9)) >>> 6;
                        iA = i2 + iNumberOfLeadingZeros27;
                        iNumberOfLeadingZeros28 += iA;
                    }
                    break;
                case 54:
                    if (albkVar.N(obj, iN, i4)) {
                        long jU2 = u(obj, j);
                        iNumberOfLeadingZeros21 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros22 = java.lang.Long.numberOfLeadingZeros(jU2);
                        i2 = (352 - iNumberOfLeadingZeros21) >>> 6;
                        iNumberOfLeadingZeros27 = (640 - (iNumberOfLeadingZeros22 * 9)) >>> 6;
                        iA = i2 + iNumberOfLeadingZeros27;
                        iNumberOfLeadingZeros28 += iA;
                    }
                    break;
                case 55:
                    if (albkVar.N(obj, iN, i4)) {
                        int iO5 = o(obj, j);
                        iNumberOfLeadingZeros23 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros24 = java.lang.Long.numberOfLeadingZeros(iO5);
                        iNumberOfLeadingZeros12 = ((352 - iNumberOfLeadingZeros23) >>> 6) + ((640 - (iNumberOfLeadingZeros24 * 9)) >>> 6);
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros12;
                    }
                    break;
                case 56:
                    if (albkVar.N(obj, iN, i4)) {
                        iNumberOfLeadingZeros19 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iA = ((352 - (iNumberOfLeadingZeros19 * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros28 += iA;
                    }
                    break;
                case 57:
                    if (albkVar.N(obj, iN, i4)) {
                        iNumberOfLeadingZeros20 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iA = ((352 - (iNumberOfLeadingZeros20 * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros28 += iA;
                    }
                    break;
                case 58:
                    if (albkVar.N(obj, iN, i4)) {
                        iA = ((352 - (java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6) + 1;
                        iNumberOfLeadingZeros28 += iA;
                    }
                    break;
                case 59:
                    if (albkVar.N(obj, iN, i4)) {
                        int i21 = iN << 3;
                        java.lang.Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof defpackage.akzc) {
                            iNumberOfLeadingZeros25 = java.lang.Integer.numberOfLeadingZeros(i21) * 9;
                            iO4 = ((defpackage.akzc) object3).c();
                            iNumberOfLeadingZeros26 = java.lang.Integer.numberOfLeadingZeros(iO4);
                        } else {
                            iNumberOfLeadingZeros25 = java.lang.Integer.numberOfLeadingZeros(i21) * 9;
                            iO4 = defpackage.ajsz.O((java.lang.String) object3);
                            iNumberOfLeadingZeros26 = java.lang.Integer.numberOfLeadingZeros(iO4);
                        }
                        iA = ((352 - iNumberOfLeadingZeros25) >>> 6) + ((352 - (iNumberOfLeadingZeros26 * 9)) >>> 6) + iO4;
                        iNumberOfLeadingZeros28 += iA;
                    }
                    break;
                case 60:
                    if (albkVar.N(obj, iN, i4)) {
                        java.lang.Object object4 = unsafe.getObject(obj, j);
                        defpackage.albw albwVarW4 = albkVar.w(i4);
                        defpackage.alci alciVar27 = defpackage.albx.a;
                        int iNumberOfLeadingZeros31 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        int iE3 = ((defpackage.akym) object4).e(albwVarW4);
                        iNumberOfLeadingZeros27 = ((352 - (java.lang.Integer.numberOfLeadingZeros(iE3) * 9)) >>> 6) + iE3;
                        i2 = (352 - iNumberOfLeadingZeros31) >>> 6;
                        iA = i2 + iNumberOfLeadingZeros27;
                        iNumberOfLeadingZeros28 += iA;
                    }
                    break;
                case 61:
                    if (albkVar.N(obj, iN, i4)) {
                        defpackage.akzc akzcVar2 = (defpackage.akzc) unsafe.getObject(obj, j);
                        iNumberOfLeadingZeros25 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iO4 = akzcVar2.c();
                        iNumberOfLeadingZeros26 = java.lang.Integer.numberOfLeadingZeros(iO4);
                        iA = ((352 - iNumberOfLeadingZeros25) >>> 6) + ((352 - (iNumberOfLeadingZeros26 * 9)) >>> 6) + iO4;
                        iNumberOfLeadingZeros28 += iA;
                    }
                    break;
                case 62:
                    if (albkVar.N(obj, iN, i4)) {
                        iA = defpackage.a.au(iN, o(obj, j));
                        iNumberOfLeadingZeros28 += iA;
                    }
                    break;
                case 63:
                    if (albkVar.N(obj, iN, i4)) {
                        int iO6 = o(obj, j);
                        iNumberOfLeadingZeros23 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros24 = java.lang.Long.numberOfLeadingZeros(iO6);
                        iNumberOfLeadingZeros12 = ((352 - iNumberOfLeadingZeros23) >>> 6) + ((640 - (iNumberOfLeadingZeros24 * 9)) >>> 6);
                        iNumberOfLeadingZeros28 += iNumberOfLeadingZeros12;
                    }
                    break;
                case 64:
                    if (albkVar.N(obj, iN, i4)) {
                        iNumberOfLeadingZeros20 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iA = ((352 - (iNumberOfLeadingZeros20 * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros28 += iA;
                    }
                    break;
                case 65:
                    if (albkVar.N(obj, iN, i4)) {
                        iNumberOfLeadingZeros19 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iA = ((352 - (iNumberOfLeadingZeros19 * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros28 += iA;
                    }
                    break;
                case 66:
                    if (albkVar.N(obj, iN, i4)) {
                        iA = defpackage.a.as(iN, o(obj, j));
                        iNumberOfLeadingZeros28 += iA;
                    }
                    break;
                case 67:
                    if (albkVar.N(obj, iN, i4)) {
                        long jU3 = u(obj, j);
                        iNumberOfLeadingZeros21 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros22 = java.lang.Long.numberOfLeadingZeros((jU3 << 1) ^ (jU3 >> 63));
                        i2 = (352 - iNumberOfLeadingZeros21) >>> 6;
                        iNumberOfLeadingZeros27 = (640 - (iNumberOfLeadingZeros22 * 9)) >>> 6;
                        iA = i2 + iNumberOfLeadingZeros27;
                        iNumberOfLeadingZeros28 += iA;
                    }
                    break;
                case 68:
                    if (albkVar.N(obj, iN, i4)) {
                        iA = defpackage.albx.a(iN, (defpackage.albh) unsafe.getObject(obj, j), albkVar.w(i4));
                        iNumberOfLeadingZeros28 += iA;
                    }
                    break;
            }
            i4 += 3;
        }
    }

    @Override // defpackage.albw
    public final int b(java.lang.Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int iHashCode = 0;
        for (int i3 = 0; i3 < this.c.length; i3 += 3) {
            int iS = s(i3);
            int i4 = (iS >>> 20) & 255;
            if (i4 <= 50 || i4 >= 69) {
                long j = iS & 1048575;
                int iHashCode2 = 37;
                switch (i4) {
                    case 0:
                        i = iHashCode * 53;
                        jDoubleToLongBits = java.lang.Double.doubleToLongBits(defpackage.alco.b(obj, j));
                        byte[] bArr = defpackage.alau.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 1:
                        i = iHashCode * 53;
                        iFloatToIntBits = java.lang.Float.floatToIntBits(defpackage.alco.c(obj, j));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        jDoubleToLongBits = defpackage.alco.a.h(obj, j);
                        byte[] bArr2 = defpackage.alau.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 3:
                        i = iHashCode * 53;
                        jDoubleToLongBits = defpackage.alco.a.h(obj, j);
                        byte[] bArr3 = defpackage.alau.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 4:
                        i = iHashCode * 53;
                        iFloatToIntBits = defpackage.alco.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        jDoubleToLongBits = defpackage.alco.a.h(obj, j);
                        byte[] bArr4 = defpackage.alau.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        i = iHashCode * 53;
                        iFloatToIntBits = defpackage.alco.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        i = iHashCode * 53;
                        boolean zF = defpackage.alco.a.f(obj, j);
                        byte[] bArr5 = defpackage.alau.a;
                        iFloatToIntBits = true != zF ? 1237 : 1231;
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        i = iHashCode * 53;
                        iFloatToIntBits = ((java.lang.String) defpackage.alco.a.i(obj, j)).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 9:
                        i2 = iHashCode * 53;
                        java.lang.Object objI = defpackage.alco.a.i(obj, j);
                        if (objI != null) {
                            iHashCode2 = objI.hashCode();
                        }
                        iHashCode = i2 + iHashCode2;
                        break;
                    case 10:
                        i = iHashCode * 53;
                        iFloatToIntBits = defpackage.alco.a.i(obj, j).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 11:
                        i = iHashCode * 53;
                        iFloatToIntBits = defpackage.alco.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 12:
                        i = iHashCode * 53;
                        iFloatToIntBits = defpackage.alco.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 13:
                        i = iHashCode * 53;
                        iFloatToIntBits = defpackage.alco.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = defpackage.alco.a.h(obj, j);
                        byte[] bArr6 = defpackage.alau.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 15:
                        i = iHashCode * 53;
                        iFloatToIntBits = defpackage.alco.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        jDoubleToLongBits = defpackage.alco.a.h(obj, j);
                        byte[] bArr7 = defpackage.alau.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 17:
                        i2 = iHashCode * 53;
                        java.lang.Object objI2 = defpackage.alco.a.i(obj, j);
                        if (objI2 != null) {
                            iHashCode2 = objI2.hashCode();
                        }
                        iHashCode = i2 + iHashCode2;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i = iHashCode * 53;
                        iFloatToIntBits = defpackage.alco.a.i(obj, j).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 50:
                        i = iHashCode * 53;
                        iFloatToIntBits = defpackage.alco.a.i(obj, j).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                }
            }
        }
        int i5 = this.l;
        while (true) {
            int[] iArr = this.j;
            if (i5 >= iArr.length) {
                int iHashCode3 = (iHashCode * 53) + ((defpackage.alad) obj).P.hashCode();
                return this.h ? (iHashCode3 * 53) + ((defpackage.alaa) obj).n.hashCode() : iHashCode3;
            }
            int i6 = iArr[i5];
            if (!N(obj, 0, i6)) {
                iHashCode = (iHashCode * 53) + defpackage.alco.a.i(obj, s(i6) & 1048575).hashCode();
            }
            i5++;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 40481. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int c(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, defpackage.akyq r42) {
        /*
            Method dump skipped, instruction units count: 4048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.albk.c(java.lang.Object, byte[], int, int, int, akyq):int");
    }

    @Override // defpackage.albw
    public final java.lang.Object e() {
        return ((defpackage.alad) this.g).s();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083 A[SYNTHETIC] */
    @Override // defpackage.albw
    public final void g(java.lang.Object obj) {
        if (L(obj)) {
            if (obj instanceof defpackage.alad) {
                defpackage.alad aladVar = (defpackage.alad) obj;
                aladVar.R(Integer.MAX_VALUE);
                aladVar.O = 0;
                aladVar.P();
            }
            int[] iArr = this.c;
            for (int i = 0; i < iArr.length; i += 3) {
                int iS = s(i);
                long jT = t(iS);
                int i2 = (iS >>> 20) & 255;
                if (i2 != 9) {
                    if (i2 != 60 && i2 != 68) {
                        switch (i2) {
                            case 17:
                                if (J(obj, i)) {
                                    w(i).g(b.getObject(obj, jT));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((defpackage.alat) defpackage.alco.a.i(obj, jT)).b();
                                break;
                            case 50:
                                sun.misc.Unsafe unsafe = b;
                                java.lang.Object object = unsafe.getObject(obj, jT);
                                if (object != null) {
                                    ((defpackage.albe) object).c();
                                    unsafe.putObject(obj, jT, object);
                                }
                                break;
                        }
                    } else if (N(obj, n(i), i)) {
                        w(i).g(b.getObject(obj, jT));
                    }
                } else if (J(obj, i)) {
                    w(i).g(b.getObject(obj, jT));
                }
            }
            defpackage.alci.e(obj);
            if (this.h) {
                defpackage.ajsz.W(obj);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.albw
    public final void h(java.lang.Object obj, java.lang.Object obj2) {
        A(obj);
        obj2.getClass();
        int i = 0;
        while (i < this.c.length) {
            int iS = s(i);
            int iN = n(i);
            long j = 1048575 & iS;
            java.lang.Object obj3 = obj;
            switch ((iS >>> 20) & 255) {
                case 0:
                    if (J(obj2, i)) {
                        defpackage.alco.l(obj3, j, defpackage.alco.b(obj2, j));
                        E(obj3, i);
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 1:
                    if (J(obj2, i)) {
                        defpackage.alco.m(obj3, j, defpackage.alco.c(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 2:
                    if (J(obj2, i)) {
                        defpackage.alcn alcnVar = defpackage.alco.a;
                        alcnVar.k(obj3, j, alcnVar.h(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 3:
                    if (J(obj2, i)) {
                        defpackage.alcn alcnVar2 = defpackage.alco.a;
                        alcnVar2.k(obj3, j, alcnVar2.h(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 4:
                    if (J(obj2, i)) {
                        defpackage.alcn alcnVar3 = defpackage.alco.a;
                        alcnVar3.j(obj3, j, alcnVar3.g(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 5:
                    if (J(obj2, i)) {
                        defpackage.alcn alcnVar4 = defpackage.alco.a;
                        alcnVar4.k(obj3, j, alcnVar4.h(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (J(obj2, i)) {
                        defpackage.alcn alcnVar5 = defpackage.alco.a;
                        alcnVar5.j(obj3, j, alcnVar5.g(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (J(obj2, i)) {
                        defpackage.alcn alcnVar6 = defpackage.alco.a;
                        alcnVar6.c(obj3, j, alcnVar6.f(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    if (J(obj2, i)) {
                        defpackage.alcn alcnVar7 = defpackage.alco.a;
                        alcnVar7.l(obj3, j, alcnVar7.i(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 9:
                    B(obj3, obj2, i);
                    continue;
                    i += 3;
                    obj = obj3;
                    break;
                case 10:
                    if (J(obj2, i)) {
                        defpackage.alcn alcnVar8 = defpackage.alco.a;
                        alcnVar8.l(obj3, j, alcnVar8.i(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 11:
                    if (J(obj2, i)) {
                        defpackage.alcn alcnVar9 = defpackage.alco.a;
                        alcnVar9.j(obj3, j, alcnVar9.g(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 12:
                    if (J(obj2, i)) {
                        defpackage.alcn alcnVar10 = defpackage.alco.a;
                        alcnVar10.j(obj3, j, alcnVar10.g(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 13:
                    if (J(obj2, i)) {
                        defpackage.alcn alcnVar11 = defpackage.alco.a;
                        alcnVar11.j(obj3, j, alcnVar11.g(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 14:
                    if (J(obj2, i)) {
                        defpackage.alcn alcnVar12 = defpackage.alco.a;
                        alcnVar12.k(obj3, j, alcnVar12.h(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 15:
                    if (J(obj2, i)) {
                        defpackage.alcn alcnVar13 = defpackage.alco.a;
                        alcnVar13.j(obj3, j, alcnVar13.g(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 16:
                    if (J(obj2, i)) {
                        defpackage.alcn alcnVar14 = defpackage.alco.a;
                        obj3 = obj;
                        alcnVar14.k(obj3, j, alcnVar14.h(obj2, j));
                        E(obj3, i);
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 17:
                    B(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    defpackage.alcn alcnVar15 = defpackage.alco.a;
                    defpackage.alat alatVarD = (defpackage.alat) alcnVar15.i(obj, j);
                    defpackage.alat alatVar = (defpackage.alat) alcnVar15.i(obj2, j);
                    int size = alatVarD.size();
                    int size2 = alatVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!alatVarD.c()) {
                            alatVarD = alatVarD.d(size2 + size);
                        }
                        alatVarD.addAll(alatVar);
                    }
                    if (size > 0) {
                        alatVar = alatVarD;
                    }
                    alcnVar15.l(obj, j, alatVar);
                    break;
                case 50:
                    defpackage.alci alciVar = defpackage.albx.a;
                    defpackage.alcn alcnVar16 = defpackage.alco.a;
                    alcnVar16.l(obj, j, defpackage.ajsz.Q(alcnVar16.i(obj, j), alcnVar16.i(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (N(obj2, iN, i)) {
                        defpackage.alcn alcnVar17 = defpackage.alco.a;
                        alcnVar17.l(obj, j, alcnVar17.i(obj2, j));
                        F(obj, iN, i);
                    }
                    break;
                case 60:
                    C(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (N(obj2, iN, i)) {
                        defpackage.alcn alcnVar18 = defpackage.alco.a;
                        alcnVar18.l(obj, j, alcnVar18.i(obj2, j));
                        F(obj, iN, i);
                    }
                    break;
                case 68:
                    C(obj, obj2, i);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
        java.lang.Object obj4 = obj;
        defpackage.alci alciVar2 = defpackage.albx.a;
        defpackage.alad aladVar = (defpackage.alad) obj4;
        aladVar.P = defpackage.alci.c(aladVar.P, ((defpackage.alad) obj2).P);
        if (this.h) {
            defpackage.albx.i(obj4, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:272:0x0840 A[Catch: all -> 0x0867, TRY_ENTER, TryCatch #2 {all -> 0x0867, blocks: (B:66:0x01a1, B:265:0x0827, B:272:0x0840, B:273:0x0845), top: B:299:0x01a1 }] */
    /* JADX WARN: Code duplicated, block: B:278:0x0852 A[LOOP:1: B:276:0x084e->B:278:0x0852, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:280:0x085f  */
    /* JADX WARN: Code duplicated, block: B:290:0x0873 A[LOOP:3: B:288:0x086f->B:290:0x0873, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:292:0x0880  */
    /* JADX WARN: Code duplicated, block: B:353:0x03ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x084c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x03ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0171  */
    /* JADX WARN: Code duplicated, block: B:58:0x0175 A[Catch: all -> 0x0869, TryCatch #5 {all -> 0x0869, blocks: (B:3:0x0011, B:11:0x0035, B:17:0x0045, B:18:0x0049, B:20:0x0053, B:21:0x005b, B:54:0x0165, B:61:0x0190, B:58:0x0175, B:60:0x017e, B:23:0x0061, B:24:0x006b, B:25:0x0075, B:26:0x007f, B:27:0x0089, B:28:0x0090, B:29:0x0091, B:30:0x009b, B:31:0x00a1, B:33:0x00ac, B:35:0x00bb, B:36:0x00c8, B:37:0x00cd, B:38:0x00d9, B:40:0x00e4, B:42:0x00f3, B:43:0x0100, B:44:0x0105, B:45:0x0119, B:46:0x011e, B:47:0x0127, B:48:0x0130, B:49:0x0139, B:50:0x0142, B:51:0x014b, B:52:0x0154, B:53:0x015d, B:62:0x0197, B:63:0x019a, B:65:0x019d, B:14:0x003b, B:72:0x01b8, B:79:0x01d4, B:80:0x01e6, B:81:0x01fb, B:82:0x0210, B:83:0x0225, B:84:0x023a, B:86:0x0244, B:88:0x024a, B:89:0x0250, B:90:0x0261, B:91:0x0276, B:92:0x0287, B:93:0x0299, B:94:0x02a1, B:95:0x02b6, B:96:0x02cb, B:97:0x02df, B:98:0x02f3, B:99:0x0307, B:100:0x031b, B:101:0x032f, B:104:0x0347, B:106:0x0355, B:108:0x035b, B:115:0x037e, B:146:0x0405, B:154:0x0416, B:155:0x041b, B:110:0x0365, B:112:0x036b, B:159:0x0424, B:161:0x0437, B:163:0x0446, B:165:0x044a, B:167:0x0450, B:168:0x0454, B:169:0x0459, B:170:0x045a, B:171:0x0468, B:172:0x0476, B:173:0x0484, B:174:0x0492, B:180:0x04b3, B:181:0x04bc, B:182:0x04ca, B:183:0x04d8, B:184:0x04e6, B:185:0x04f4, B:186:0x0502, B:187:0x0510, B:188:0x051e, B:189:0x052c, B:190:0x053a, B:191:0x0548, B:192:0x0556, B:193:0x0564), top: B:305:0x0011 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.albw
    public final void i(java.lang.Object obj, defpackage.akzg akzgVar, defpackage.akzq akzqVar) throws java.lang.Throwable {
        java.lang.Object obj2;
        int i;
        defpackage.apdi apdiVarB;
        defpackage.apdi apdiVar;
        java.lang.Object objS;
        int iOrdinal;
        java.lang.Object objJ;
        java.lang.Throwable th;
        defpackage.akzs akzsVar;
        java.lang.Object obj3;
        defpackage.alci alciVar;
        int i2;
        java.lang.Object obj4 = obj;
        akzqVar.getClass();
        A(obj4);
        java.lang.Throwable th2 = null;
        java.lang.Object objQ = null;
        defpackage.akzs akzsVarU = null;
        while (true) {
            try {
                int iC = akzgVar.c();
                int iP = p(iC);
                defpackage.alci alciVar2 = this.m;
                int i3 = Integer.MAX_VALUE;
                if (iP >= 0) {
                    int iS = s(iP);
                    int i4 = 1;
                    switch ((iS >>> 20) & 255) {
                        case 0:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            defpackage.alco.l(obj4, iS & 1048575, akzgVar.a());
                            E(obj4, iP);
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 1:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            defpackage.alco.m(obj4, iS & 1048575, akzgVar.b());
                            E(obj4, iP);
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 2:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            defpackage.alco.a.k(obj4, iS & 1048575, akzgVar.k());
                            E(obj4, iP);
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 3:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            defpackage.alco.a.k(obj4, iS & 1048575, akzgVar.n());
                            E(obj4, iP);
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 4:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            defpackage.alco.a.j(obj4, iS & 1048575, akzgVar.f());
                            E(obj4, iP);
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 5:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            defpackage.alco.a.k(obj4, iS & 1048575, akzgVar.j());
                            E(obj4, iP);
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            defpackage.alco.a.j(obj4, iS & 1048575, akzgVar.e());
                            E(obj4, iP);
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            defpackage.alco.a.c(obj4, iS & 1048575, akzgVar.N());
                            E(obj4, iP);
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            D(obj4, iS, akzgVar);
                            E(obj4, iP);
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 9:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            defpackage.albh albhVar = (defpackage.albh) y(obj4, iP);
                            akzgVar.w(albhVar, w(iP), akzqVar);
                            G(obj4, iP, albhVar);
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 10:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            defpackage.alco.a.l(obj4, iS & 1048575, akzgVar.o());
                            E(obj4, iP);
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 11:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            defpackage.alco.a.j(obj4, iS & 1048575, akzgVar.i());
                            E(obj4, iP);
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 12:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            int iD = akzgVar.d();
                            defpackage.alai alaiVarV = v(iP);
                            if (alaiVarV == null || alaiVarV.a(iD)) {
                                defpackage.alco.a.j(obj4, iS & 1048575, iD);
                                E(obj4, iP);
                                objQ = obj3;
                            } else {
                                objQ = defpackage.albx.j(obj4, iC, iD, obj3);
                            }
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 13:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            defpackage.alco.a.j(obj4, iS & 1048575, akzgVar.g());
                            E(obj4, iP);
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 14:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            defpackage.alco.a.k(obj4, iS & 1048575, akzgVar.l());
                            E(obj4, iP);
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 15:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            defpackage.alco.a.j(obj4, iS & 1048575, akzgVar.h());
                            E(obj4, iP);
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 16:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            defpackage.alco.a.k(obj4, iS & 1048575, akzgVar.m());
                            E(obj4, iP);
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 17:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            defpackage.albh albhVar2 = (defpackage.albh) y(obj4, iP);
                            akzgVar.v(albhVar2, w(iP), akzqVar);
                            G(obj4, iP, albhVar2);
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 18:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            akzgVar.y(defpackage.ajsz.S(obj4, iS & 1048575));
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 19:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            akzgVar.C(defpackage.ajsz.S(obj4, iS & 1048575));
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 20:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            akzgVar.E(defpackage.ajsz.S(obj4, iS & 1048575));
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 21:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            akzgVar.L(defpackage.ajsz.S(obj4, iS & 1048575));
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 22:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            akzgVar.D(defpackage.ajsz.S(obj4, iS & 1048575));
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 23:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            akzgVar.B(defpackage.ajsz.S(obj4, iS & 1048575));
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 24:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            akzgVar.A(defpackage.ajsz.S(obj4, iS & 1048575));
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 25:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            akzgVar.x(defpackage.ajsz.S(obj4, iS & 1048575));
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 26:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            long j = iS & 1048575;
                            if ((536870912 & iS) != 0) {
                                akzgVar.J(defpackage.ajsz.S(obj4, j), true);
                            } else {
                                akzgVar.J(defpackage.ajsz.S(obj4, j), false);
                            }
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 27:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            defpackage.albw albwVarW = w(iP);
                            java.util.List listS = defpackage.ajsz.S(obj4, iS & 1048575);
                            int i5 = akzgVar.b;
                            if ((i5 & 7) != 2) {
                                throw new defpackage.alay();
                            }
                            while (true) {
                                listS.add(akzgVar.r(albwVarW, akzqVar));
                                defpackage.akzf akzfVar = akzgVar.a;
                                if (!akzfVar.D() && akzgVar.c == 0) {
                                    int iN = akzfVar.n();
                                    if (iN != i5) {
                                        akzgVar.c = iN;
                                    }
                                }
                            }
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                            break;
                        case 28:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            java.util.List listS2 = defpackage.ajsz.S(obj4, iS & 1048575);
                            if ((akzgVar.b & 7) != 2) {
                                throw new defpackage.alay();
                            }
                            while (true) {
                                listS2.add(akzgVar.o());
                                defpackage.akzf akzfVar2 = akzgVar.a;
                                if (!akzfVar2.D()) {
                                    int iN2 = akzfVar2.n();
                                    if (iN2 != akzgVar.b) {
                                        akzgVar.c = iN2;
                                    }
                                }
                            }
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                            break;
                        case 29:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            akzgVar.K(defpackage.ajsz.S(obj4, iS & 1048575));
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 30:
                            th = th2;
                            akzsVar = akzsVarU;
                            java.util.List listS3 = defpackage.ajsz.S(obj4, iS & 1048575);
                            akzgVar.z(listS3);
                            java.lang.Object obj5 = obj4;
                            try {
                                objQ = defpackage.albx.g(obj5, iC, listS3, v(iP), objQ, alciVar2);
                                obj4 = obj5;
                            } catch (defpackage.alay unused) {
                                obj2 = objQ;
                                alciVar = alciVar2;
                                obj4 = obj5;
                                objQ = obj2;
                                if (objQ == null) {
                                    objQ = defpackage.alci.d(obj4);
                                }
                                if (!alciVar.a(objQ, akzgVar, 0)) {
                                    for (i2 = this.k; i2 < this.l; i2++) {
                                        objQ = Q(obj4, this.j[i2], objQ, obj4);
                                    }
                                    if (objQ != null) {
                                        ((defpackage.alad) obj4).P = (defpackage.alcj) objQ;
                                    }
                                }
                            }
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 31:
                            th = th2;
                            akzsVar = akzsVarU;
                            akzgVar.F(defpackage.ajsz.S(obj4, iS & 1048575));
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 32:
                            th = th2;
                            akzsVar = akzsVarU;
                            akzgVar.G(defpackage.ajsz.S(obj4, iS & 1048575));
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 33:
                            th = th2;
                            akzsVar = akzsVarU;
                            akzgVar.H(defpackage.ajsz.S(obj4, iS & 1048575));
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 34:
                            th = th2;
                            akzsVar = akzsVarU;
                            akzgVar.I(defpackage.ajsz.S(obj4, iS & 1048575));
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 35:
                            th = th2;
                            akzsVar = akzsVarU;
                            akzgVar.y(defpackage.ajsz.S(obj4, iS & 1048575));
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 36:
                            th = th2;
                            akzsVar = akzsVarU;
                            akzgVar.C(defpackage.ajsz.S(obj4, iS & 1048575));
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 37:
                            th = th2;
                            akzsVar = akzsVarU;
                            akzgVar.E(defpackage.ajsz.S(obj4, iS & 1048575));
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 38:
                            th = th2;
                            akzsVar = akzsVarU;
                            akzgVar.L(defpackage.ajsz.S(obj4, iS & 1048575));
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 39:
                            th = th2;
                            akzsVar = akzsVarU;
                            akzgVar.D(defpackage.ajsz.S(obj4, iS & 1048575));
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 40:
                            th = th2;
                            akzsVar = akzsVarU;
                            akzgVar.B(defpackage.ajsz.S(obj4, iS & 1048575));
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 41:
                            th = th2;
                            akzsVar = akzsVarU;
                            akzgVar.A(defpackage.ajsz.S(obj4, iS & 1048575));
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 42:
                            th = th2;
                            akzsVar = akzsVarU;
                            akzgVar.x(defpackage.ajsz.S(obj4, iS & 1048575));
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 43:
                            th = th2;
                            akzsVar = akzsVarU;
                            akzgVar.K(defpackage.ajsz.S(obj4, iS & 1048575));
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 44:
                            th = th2;
                            akzsVar = akzsVarU;
                            java.util.List listS4 = defpackage.ajsz.S(obj4, iS & 1048575);
                            akzgVar.z(listS4);
                            java.lang.Object obj6 = obj4;
                            try {
                                try {
                                    objQ = defpackage.albx.g(obj6, iC, listS4, v(iP), objQ, alciVar2);
                                    obj4 = obj6;
                                } catch (defpackage.alay unused2) {
                                    obj4 = obj6;
                                    obj2 = objQ;
                                    alciVar = alciVar2;
                                    objQ = obj2;
                                    if (objQ == null) {
                                        objQ = defpackage.alci.d(obj4);
                                    }
                                    if (!alciVar.a(objQ, akzgVar, 0)) {
                                        while (i2 < this.l) {
                                            objQ = Q(obj4, this.j[i2], objQ, obj4);
                                        }
                                        if (objQ != null) {
                                            ((defpackage.alad) obj4).P = (defpackage.alcj) objQ;
                                        }
                                    }
                                }
                                th2 = th;
                                akzsVarU = akzsVar;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                obj4 = obj6;
                                obj2 = objQ;
                                objQ = obj2;
                                for (i = this.k; i < this.l; i++) {
                                    objQ = Q(obj4, this.j[i], objQ, obj4);
                                }
                                if (objQ != null) {
                                    ((defpackage.alad) obj4).P = (defpackage.alcj) objQ;
                                }
                                throw th;
                            }
                            break;
                        case 45:
                            th = th2;
                            akzsVar = akzsVarU;
                            akzgVar.F(defpackage.ajsz.S(obj4, iS & 1048575));
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 46:
                            th = th2;
                            akzsVar = akzsVarU;
                            akzgVar.G(defpackage.ajsz.S(obj4, iS & 1048575));
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 47:
                            th = th2;
                            akzsVar = akzsVarU;
                            akzgVar.H(defpackage.ajsz.S(obj4, iS & 1048575));
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 48:
                            th = th2;
                            akzsVar = akzsVarU;
                            akzgVar.I(defpackage.ajsz.S(obj4, iS & 1048575));
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 49:
                            th = th2;
                            akzsVar = akzsVarU;
                            defpackage.albw albwVarW2 = w(iP);
                            java.util.List listS5 = defpackage.ajsz.S(obj4, iS & 1048575);
                            int i6 = akzgVar.b;
                            if ((i6 & 7) != 3) {
                                throw new defpackage.alay();
                            }
                            while (true) {
                                listS5.add(akzgVar.q(albwVarW2, akzqVar));
                                defpackage.akzf akzfVar3 = akzgVar.a;
                                if (!akzfVar3.D() && akzgVar.c == 0) {
                                    int iN3 = akzfVar3.n();
                                    if (iN3 != i6) {
                                        akzgVar.c = iN3;
                                    }
                                }
                            }
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                            break;
                        case 50:
                            java.lang.Object objX = x(iP);
                            int iS2 = s(iP) & 1048575;
                            defpackage.alcn alcnVar = defpackage.alco.a;
                            akzsVar = akzsVarU;
                            long j2 = iS2;
                            try {
                                java.lang.Object objI = alcnVar.i(obj4, j2);
                                if (objI == null) {
                                    try {
                                        objI = defpackage.albe.a.a();
                                        alcnVar.l(obj4, j2, objI);
                                    } catch (defpackage.alay unused3) {
                                        obj2 = objQ;
                                        alciVar = alciVar2;
                                        th = null;
                                        objQ = obj2;
                                        if (objQ == null) {
                                            objQ = defpackage.alci.d(obj4);
                                        }
                                        if (!alciVar.a(objQ, akzgVar, 0)) {
                                            while (i2 < this.l) {
                                                objQ = Q(obj4, this.j[i2], objQ, obj4);
                                            }
                                            if (objQ != null) {
                                                ((defpackage.alad) obj4).P = (defpackage.alcj) objQ;
                                            }
                                        }
                                    }
                                } else if (defpackage.ajsz.R(objI)) {
                                    defpackage.albe albeVarA = defpackage.albe.a.a();
                                    defpackage.ajsz.Q(albeVarA, objI);
                                    alcnVar.l(obj4, j2, albeVarA);
                                    objI = albeVarA;
                                }
                                defpackage.albe albeVar = (defpackage.albe) objI;
                                java.lang.Object obj7 = ((defpackage.ajyk) objX).b;
                                akzgVar.M(2);
                                defpackage.akzf akzfVar4 = akzgVar.a;
                                int iF = akzfVar4.f(akzfVar4.o());
                                java.lang.Object obj8 = ((defpackage.apdi) obj7).c;
                                java.lang.Object obj9 = ((defpackage.apdi) obj7).b;
                                java.lang.Object objP = obj8;
                                java.lang.Object objP2 = obj9;
                                while (true) {
                                    try {
                                        int iC2 = akzgVar.c();
                                        if (iC2 == i3) {
                                            th = null;
                                        } else if (akzfVar4.D()) {
                                            th = null;
                                        } else {
                                            if (iC2 == i4) {
                                                try {
                                                    objP = akzgVar.p((defpackage.alcr) ((defpackage.apdi) obj7).a, null, null);
                                                } catch (defpackage.alay e) {
                                                    e = e;
                                                    if (akzgVar.O()) {
                                                        throw new defpackage.alaz("Unable to parse map entry.", e);
                                                    }
                                                }
                                            } else if (iC2 != 2) {
                                                try {
                                                    if (!akzgVar.O()) {
                                                        throw new defpackage.alaz("Unable to parse map entry.");
                                                    }
                                                    continue;
                                                } catch (defpackage.alay e2) {
                                                    e = e2;
                                                    if (akzgVar.O()) {
                                                        throw new defpackage.alaz("Unable to parse map entry.", e);
                                                    }
                                                }
                                            } else {
                                                objP2 = akzgVar.p((defpackage.alcr) ((defpackage.apdi) obj7).d, obj9.getClass(), akzqVar);
                                            }
                                            i3 = Integer.MAX_VALUE;
                                            i4 = 1;
                                        }
                                    } catch (java.lang.Throwable th4) {
                                        th = th4;
                                    }
                                }
                                try {
                                    albeVar.put(objP, objP2);
                                    defpackage.akzf akzfVar5 = akzgVar.a;
                                    if (akzfVar5.d() != 0) {
                                        throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                    }
                                    try {
                                        akzfVar5.B(iF);
                                        obj3 = objQ;
                                        objQ = obj3;
                                    } catch (defpackage.alay unused4) {
                                        obj2 = objQ;
                                        alciVar = alciVar2;
                                        objQ = obj2;
                                        if (objQ == null) {
                                            objQ = defpackage.alci.d(obj4);
                                        }
                                        if (!alciVar.a(objQ, akzgVar, 0)) {
                                            while (i2 < this.l) {
                                                objQ = Q(obj4, this.j[i2], objQ, obj4);
                                            }
                                            if (objQ != null) {
                                                ((defpackage.alad) obj4).P = (defpackage.alcj) objQ;
                                            }
                                        }
                                    }
                                    th2 = th;
                                    akzsVarU = akzsVar;
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                    akzgVar.a.B(iF);
                                    throw th;
                                }
                            } catch (defpackage.alay unused5) {
                                th = null;
                            }
                            break;
                        case 51:
                            defpackage.alco.a.l(obj4, iS & 1048575, java.lang.Double.valueOf(akzgVar.a()));
                            F(obj4, iC, iP);
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 52:
                            defpackage.alco.a.l(obj4, iS & 1048575, java.lang.Float.valueOf(akzgVar.b()));
                            F(obj4, iC, iP);
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 53:
                            defpackage.alco.a.l(obj4, iS & 1048575, java.lang.Long.valueOf(akzgVar.k()));
                            F(obj4, iC, iP);
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 54:
                            defpackage.alco.a.l(obj4, iS & 1048575, java.lang.Long.valueOf(akzgVar.n()));
                            F(obj4, iC, iP);
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 55:
                            defpackage.alco.a.l(obj4, iS & 1048575, java.lang.Integer.valueOf(akzgVar.f()));
                            F(obj4, iC, iP);
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 56:
                            defpackage.alco.a.l(obj4, iS & 1048575, java.lang.Long.valueOf(akzgVar.j()));
                            F(obj4, iC, iP);
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 57:
                            defpackage.alco.a.l(obj4, iS & 1048575, java.lang.Integer.valueOf(akzgVar.e()));
                            F(obj4, iC, iP);
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 58:
                            defpackage.alco.a.l(obj4, iS & 1048575, java.lang.Boolean.valueOf(akzgVar.N()));
                            F(obj4, iC, iP);
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 59:
                            D(obj4, iS, akzgVar);
                            F(obj4, iC, iP);
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 60:
                            defpackage.albh albhVar3 = (defpackage.albh) z(obj4, iC, iP);
                            akzgVar.w(albhVar3, w(iP), akzqVar);
                            H(obj4, iC, iP, albhVar3);
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 61:
                            defpackage.alco.a.l(obj4, iS & 1048575, akzgVar.o());
                            F(obj4, iC, iP);
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 62:
                            defpackage.alco.a.l(obj4, iS & 1048575, java.lang.Integer.valueOf(akzgVar.i()));
                            F(obj4, iC, iP);
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 63:
                            int iD2 = akzgVar.d();
                            defpackage.alai alaiVarV2 = v(iP);
                            if (alaiVarV2 == null || alaiVarV2.a(iD2)) {
                                defpackage.alco.a.l(obj4, iS & 1048575, java.lang.Integer.valueOf(iD2));
                                F(obj4, iC, iP);
                                th = th2;
                                akzsVar = akzsVarU;
                                obj3 = objQ;
                                objQ = obj3;
                                th2 = th;
                                akzsVarU = akzsVar;
                            } else {
                                objQ = defpackage.albx.j(obj4, iC, iD2, objQ);
                            }
                            break;
                        case 64:
                            defpackage.alco.a.l(obj4, iS & 1048575, java.lang.Integer.valueOf(akzgVar.g()));
                            F(obj4, iC, iP);
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 65:
                            defpackage.alco.a.l(obj4, iS & 1048575, java.lang.Long.valueOf(akzgVar.l()));
                            F(obj4, iC, iP);
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 66:
                            defpackage.alco.a.l(obj4, iS & 1048575, java.lang.Integer.valueOf(akzgVar.h()));
                            F(obj4, iC, iP);
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 67:
                            defpackage.alco.a.l(obj4, iS & 1048575, java.lang.Long.valueOf(akzgVar.m()));
                            F(obj4, iC, iP);
                            th = th2;
                            akzsVar = akzsVarU;
                            obj3 = objQ;
                            objQ = obj3;
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        case 68:
                            try {
                                defpackage.albh albhVar4 = (defpackage.albh) z(obj4, iC, iP);
                                akzgVar.v(albhVar4, w(iP), akzqVar);
                                H(obj4, iC, iP, albhVar4);
                                th = th2;
                                akzsVar = akzsVarU;
                                obj3 = objQ;
                                objQ = obj3;
                            } catch (defpackage.alay unused6) {
                                th = th2;
                                akzsVar = akzsVarU;
                                obj2 = objQ;
                                alciVar = alciVar2;
                                objQ = obj2;
                                if (objQ == null) {
                                    objQ = defpackage.alci.d(obj4);
                                }
                                if (!alciVar.a(objQ, akzgVar, 0)) {
                                    while (i2 < this.l) {
                                        objQ = Q(obj4, this.j[i2], objQ, obj4);
                                    }
                                    if (objQ != null) {
                                        ((defpackage.alad) obj4).P = (defpackage.alcj) objQ;
                                    }
                                }
                            }
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                        default:
                            th = th2;
                            akzsVar = akzsVarU;
                            obj2 = objQ;
                            alciVar = alciVar2;
                            if (obj2 == null) {
                                try {
                                    objQ = defpackage.alci.d(obj4);
                                } catch (defpackage.alay unused7) {
                                    objQ = obj2;
                                    if (objQ == null) {
                                        objQ = defpackage.alci.d(obj4);
                                    }
                                    if (!alciVar.a(objQ, akzgVar, 0)) {
                                        while (i2 < this.l) {
                                            objQ = Q(obj4, this.j[i2], objQ, obj4);
                                        }
                                        if (objQ != null) {
                                            ((defpackage.alad) obj4).P = (defpackage.alcj) objQ;
                                        }
                                    }
                                    th2 = th;
                                    akzsVarU = akzsVar;
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    objQ = obj2;
                                    while (i < this.l) {
                                        objQ = Q(obj4, this.j[i], objQ, obj4);
                                    }
                                    if (objQ != null) {
                                        ((defpackage.alad) obj4).P = (defpackage.alcj) objQ;
                                    }
                                    throw th;
                                }
                            } else {
                                objQ = obj2;
                            }
                            try {
                                if (!alciVar.a(objQ, akzgVar, 0)) {
                                    for (int i7 = this.k; i7 < this.l; i7++) {
                                        objQ = Q(obj4, this.j[i7], objQ, obj4);
                                    }
                                }
                            } catch (defpackage.alay unused8) {
                                if (objQ == null) {
                                    objQ = defpackage.alci.d(obj4);
                                }
                                if (!alciVar.a(objQ, akzgVar, 0)) {
                                    while (i2 < this.l) {
                                        objQ = Q(obj4, this.j[i2], objQ, obj4);
                                    }
                                    if (objQ != null) {
                                        ((defpackage.alad) obj4).P = (defpackage.alcj) objQ;
                                    }
                                }
                            }
                            th2 = th;
                            akzsVarU = akzsVar;
                            break;
                    }
                } else if (iC == Integer.MAX_VALUE) {
                    for (int i8 = this.k; i8 < this.l; i8++) {
                        objQ = Q(obj4, this.j[i8], objQ, obj4);
                    }
                } else {
                    if (this.h) {
                        apdiVarB = akzqVar.b(this.g, iC);
                    } else {
                        apdiVar = th2;
                    }
                    if (apdiVar != 0) {
                        apdiVar = apdiVarB;
                        if (akzsVarU == null) {
                            akzsVarU = defpackage.ajsz.U(obj4);
                        }
                        java.lang.Object obj10 = apdiVar.a;
                        if (apdiVar.b() == defpackage.alcr.ENUM) {
                            akzgVar.f();
                            throw th2;
                        }
                        switch (apdiVar.b().ordinal()) {
                            case 0:
                                objS = java.lang.Double.valueOf(akzgVar.a());
                                iOrdinal = apdiVar.b().ordinal();
                                if ((iOrdinal != 9 || iOrdinal == 10) && (objJ = akzsVarU.j((defpackage.alac) obj10)) != null) {
                                    byte[] bArr = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                }
                                akzsVarU.k((defpackage.alac) obj10, objS);
                                break;
                            case 1:
                                objS = java.lang.Float.valueOf(akzgVar.b());
                                iOrdinal = apdiVar.b().ordinal();
                                if (iOrdinal != 9) {
                                    byte[] bArr2 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                } else {
                                    byte[] bArr3 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                }
                                akzsVarU.k((defpackage.alac) obj10, objS);
                                break;
                            case 2:
                                objS = java.lang.Long.valueOf(akzgVar.k());
                                iOrdinal = apdiVar.b().ordinal();
                                if (iOrdinal != 9) {
                                    byte[] bArr4 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                } else {
                                    byte[] bArr5 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                }
                                akzsVarU.k((defpackage.alac) obj10, objS);
                                break;
                            case 3:
                                objS = java.lang.Long.valueOf(akzgVar.n());
                                iOrdinal = apdiVar.b().ordinal();
                                if (iOrdinal != 9) {
                                    byte[] bArr6 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                } else {
                                    byte[] bArr7 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                }
                                akzsVarU.k((defpackage.alac) obj10, objS);
                                break;
                            case 4:
                                objS = java.lang.Integer.valueOf(akzgVar.f());
                                iOrdinal = apdiVar.b().ordinal();
                                if (iOrdinal != 9) {
                                    byte[] bArr8 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                } else {
                                    byte[] bArr9 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                }
                                akzsVarU.k((defpackage.alac) obj10, objS);
                                break;
                            case 5:
                                objS = java.lang.Long.valueOf(akzgVar.j());
                                iOrdinal = apdiVar.b().ordinal();
                                if (iOrdinal != 9) {
                                    byte[] bArr10 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                } else {
                                    byte[] bArr11 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                }
                                akzsVarU.k((defpackage.alac) obj10, objS);
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                objS = java.lang.Integer.valueOf(akzgVar.e());
                                iOrdinal = apdiVar.b().ordinal();
                                if (iOrdinal != 9) {
                                    byte[] bArr12 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                } else {
                                    byte[] bArr13 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                }
                                akzsVarU.k((defpackage.alac) obj10, objS);
                                break;
                            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                                objS = java.lang.Boolean.valueOf(akzgVar.N());
                                iOrdinal = apdiVar.b().ordinal();
                                if (iOrdinal != 9) {
                                    byte[] bArr14 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                } else {
                                    byte[] bArr15 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                }
                                akzsVarU.k((defpackage.alac) obj10, objS);
                                break;
                            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                                objS = akzgVar.t();
                                iOrdinal = apdiVar.b().ordinal();
                                if (iOrdinal != 9) {
                                    byte[] bArr16 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                } else {
                                    byte[] bArr17 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                }
                                akzsVarU.k((defpackage.alac) obj10, objS);
                                break;
                            case 9:
                                java.lang.Object objJ2 = akzsVarU.j((defpackage.alac) obj10);
                                if (objJ2 instanceof defpackage.alad) {
                                    defpackage.alad aladVar = (defpackage.alad) objJ2;
                                    defpackage.albw albwVarA = defpackage.albp.a.a(aladVar);
                                    if (!aladVar.U()) {
                                        java.lang.Object objE = albwVarA.e();
                                        albwVarA.h(objE, objJ2);
                                        akzsVarU.k((defpackage.alac) obj10, objE);
                                        objJ2 = objE;
                                    }
                                    akzgVar.v(objJ2, albwVarA, akzqVar);
                                } else {
                                    java.lang.Class<?> cls = apdiVar.c.getClass();
                                    akzgVar.M(3);
                                    objS = akzgVar.q(defpackage.albp.a.b(cls), akzqVar);
                                    iOrdinal = apdiVar.b().ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr18 = defpackage.alau.a;
                                        objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                    } else {
                                        byte[] bArr19 = defpackage.alau.a;
                                        objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                    }
                                    akzsVarU.k((defpackage.alac) obj10, objS);
                                }
                                break;
                            case 10:
                                java.lang.Object objJ3 = akzsVarU.j((defpackage.alac) obj10);
                                if (objJ3 instanceof defpackage.alad) {
                                    defpackage.alad aladVar2 = (defpackage.alad) objJ3;
                                    defpackage.albw albwVarA2 = defpackage.albp.a.a(aladVar2);
                                    if (!aladVar2.U()) {
                                        java.lang.Object objE2 = albwVarA2.e();
                                        albwVarA2.h(objE2, objJ3);
                                        akzsVarU.k((defpackage.alac) obj10, objE2);
                                        objJ3 = objE2;
                                    }
                                    akzgVar.w(objJ3, albwVarA2, akzqVar);
                                } else {
                                    objS = akzgVar.s(apdiVar.c.getClass(), akzqVar);
                                    iOrdinal = apdiVar.b().ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr110 = defpackage.alau.a;
                                        objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                    } else {
                                        byte[] bArr111 = defpackage.alau.a;
                                        objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                    }
                                    akzsVarU.k((defpackage.alac) obj10, objS);
                                }
                                break;
                            case 11:
                                objS = akzgVar.o();
                                iOrdinal = apdiVar.b().ordinal();
                                if (iOrdinal != 9) {
                                    byte[] bArr112 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                } else {
                                    byte[] bArr113 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                }
                                akzsVarU.k((defpackage.alac) obj10, objS);
                                break;
                            case 12:
                                objS = java.lang.Integer.valueOf(akzgVar.i());
                                iOrdinal = apdiVar.b().ordinal();
                                if (iOrdinal != 9) {
                                    byte[] bArr114 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                } else {
                                    byte[] bArr115 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                }
                                akzsVarU.k((defpackage.alac) obj10, objS);
                                break;
                            case 13:
                                throw new java.lang.IllegalStateException("Shouldn't reach here.");
                            case 14:
                                objS = java.lang.Integer.valueOf(akzgVar.g());
                                iOrdinal = apdiVar.b().ordinal();
                                if (iOrdinal != 9) {
                                    byte[] bArr116 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                } else {
                                    byte[] bArr117 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                }
                                akzsVarU.k((defpackage.alac) obj10, objS);
                                break;
                            case 15:
                                objS = java.lang.Long.valueOf(akzgVar.l());
                                iOrdinal = apdiVar.b().ordinal();
                                if (iOrdinal != 9) {
                                    byte[] bArr118 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                } else {
                                    byte[] bArr119 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                }
                                akzsVarU.k((defpackage.alac) obj10, objS);
                                break;
                            case 16:
                                objS = java.lang.Integer.valueOf(akzgVar.h());
                                iOrdinal = apdiVar.b().ordinal();
                                if (iOrdinal != 9) {
                                    byte[] bArr1110 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                } else {
                                    byte[] bArr1111 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                }
                                akzsVarU.k((defpackage.alac) obj10, objS);
                                break;
                            case 17:
                                objS = java.lang.Long.valueOf(akzgVar.m());
                                iOrdinal = apdiVar.b().ordinal();
                                if (iOrdinal != 9) {
                                    byte[] bArr1112 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                } else {
                                    byte[] bArr1113 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                }
                                akzsVarU.k((defpackage.alac) obj10, objS);
                                break;
                            default:
                                objS = th2;
                                iOrdinal = apdiVar.b().ordinal();
                                if (iOrdinal != 9) {
                                    byte[] bArr1114 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                } else {
                                    byte[] bArr1115 = defpackage.alau.a;
                                    objS = ((defpackage.albh) objJ).L().f((defpackage.albh) objS).s();
                                }
                                akzsVarU.k((defpackage.alac) obj10, objS);
                                break;
                        }
                    } else {
                        apdiVar = apdiVarB;
                        if (objQ == null) {
                            objQ = defpackage.alci.d(obj4);
                        }
                        try {
                            if (!alciVar2.a(objQ, akzgVar, 0)) {
                                for (int i9 = this.k; i9 < this.l; i9++) {
                                    objQ = Q(obj4, this.j[i9], objQ, obj4);
                                }
                            }
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            while (i < this.l) {
                                objQ = Q(obj4, this.j[i], objQ, obj4);
                            }
                            if (objQ != null) {
                                ((defpackage.alad) obj4).P = (defpackage.alcj) objQ;
                            }
                            throw th;
                        }
                    }
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
            }
        }
        if (objQ != null) {
            ((defpackage.alad) obj4).P = (defpackage.alcj) objQ;
        }
    }

    @Override // defpackage.albw
    public final void j(java.lang.Object obj, byte[] bArr, int i, int i2, defpackage.akyq akyqVar) {
        c(obj, bArr, i, i2, 0, akyqVar);
    }

    @Override // defpackage.albw
    public final boolean k(java.lang.Object obj, java.lang.Object obj2) {
        boolean zH;
        for (int i = 0; i < this.c.length; i += 3) {
            int iS = s(i);
            int i2 = (iS >>> 20) & 255;
            if (i2 <= 50 || i2 >= 69) {
                long j = iS & 1048575;
                switch (i2) {
                    case 0:
                        if (!I(obj, obj2, i) || java.lang.Double.doubleToLongBits(defpackage.alco.b(obj, j)) != java.lang.Double.doubleToLongBits(defpackage.alco.b(obj2, j))) {
                            return false;
                        }
                        continue;
                        break;
                    case 1:
                        if (!I(obj, obj2, i) || java.lang.Float.floatToIntBits(defpackage.alco.c(obj, j)) != java.lang.Float.floatToIntBits(defpackage.alco.c(obj2, j))) {
                            return false;
                        }
                        continue;
                        break;
                    case 2:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        defpackage.alcn alcnVar = defpackage.alco.a;
                        if (alcnVar.h(obj, j) != alcnVar.h(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 3:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        defpackage.alcn alcnVar2 = defpackage.alco.a;
                        if (alcnVar2.h(obj, j) != alcnVar2.h(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 4:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        defpackage.alcn alcnVar3 = defpackage.alco.a;
                        if (alcnVar3.g(obj, j) != alcnVar3.g(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 5:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        defpackage.alcn alcnVar4 = defpackage.alco.a;
                        if (alcnVar4.h(obj, j) != alcnVar4.h(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        defpackage.alcn alcnVar5 = defpackage.alco.a;
                        if (alcnVar5.g(obj, j) != alcnVar5.g(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        defpackage.alcn alcnVar6 = defpackage.alco.a;
                        if (alcnVar6.f(obj, j) != alcnVar6.f(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        defpackage.alcn alcnVar7 = defpackage.alco.a;
                        java.lang.Object objI = alcnVar7.i(obj, j);
                        java.lang.Object objI2 = alcnVar7.i(obj2, j);
                        defpackage.alci alciVar = defpackage.albx.a;
                        if (!defpackage.anty.H(objI, objI2)) {
                            return false;
                        }
                        continue;
                        break;
                    case 9:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        defpackage.alcn alcnVar8 = defpackage.alco.a;
                        java.lang.Object objI3 = alcnVar8.i(obj, j);
                        java.lang.Object objI4 = alcnVar8.i(obj2, j);
                        defpackage.alci alciVar2 = defpackage.albx.a;
                        if (!defpackage.anty.H(objI3, objI4)) {
                            return false;
                        }
                        continue;
                        break;
                    case 10:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        defpackage.alcn alcnVar9 = defpackage.alco.a;
                        java.lang.Object objI5 = alcnVar9.i(obj, j);
                        java.lang.Object objI6 = alcnVar9.i(obj2, j);
                        defpackage.alci alciVar3 = defpackage.albx.a;
                        if (!defpackage.anty.H(objI5, objI6)) {
                            return false;
                        }
                        continue;
                        break;
                    case 11:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        defpackage.alcn alcnVar10 = defpackage.alco.a;
                        if (alcnVar10.g(obj, j) != alcnVar10.g(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 12:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        defpackage.alcn alcnVar11 = defpackage.alco.a;
                        if (alcnVar11.g(obj, j) != alcnVar11.g(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 13:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        defpackage.alcn alcnVar12 = defpackage.alco.a;
                        if (alcnVar12.g(obj, j) != alcnVar12.g(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 14:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        defpackage.alcn alcnVar13 = defpackage.alco.a;
                        if (alcnVar13.h(obj, j) != alcnVar13.h(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 15:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        defpackage.alcn alcnVar14 = defpackage.alco.a;
                        if (alcnVar14.g(obj, j) != alcnVar14.g(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 16:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        defpackage.alcn alcnVar15 = defpackage.alco.a;
                        if (alcnVar15.h(obj, j) != alcnVar15.h(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 17:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        defpackage.alcn alcnVar16 = defpackage.alco.a;
                        java.lang.Object objI7 = alcnVar16.i(obj, j);
                        java.lang.Object objI8 = alcnVar16.i(obj2, j);
                        defpackage.alci alciVar4 = defpackage.albx.a;
                        if (!defpackage.anty.H(objI7, objI8)) {
                            return false;
                        }
                        continue;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        defpackage.alcn alcnVar17 = defpackage.alco.a;
                        java.lang.Object objI9 = alcnVar17.i(obj, j);
                        java.lang.Object objI10 = alcnVar17.i(obj2, j);
                        defpackage.alci alciVar5 = defpackage.albx.a;
                        zH = defpackage.anty.H(objI9, objI10);
                        break;
                    case 50:
                        defpackage.alcn alcnVar18 = defpackage.alco.a;
                        java.lang.Object objI11 = alcnVar18.i(obj, j);
                        java.lang.Object objI12 = alcnVar18.i(obj2, j);
                        defpackage.alci alciVar6 = defpackage.albx.a;
                        zH = defpackage.anty.H(objI11, objI12);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        if (!M(obj, obj2, i)) {
                            return false;
                        }
                        defpackage.alcn alcnVar19 = defpackage.alco.a;
                        java.lang.Object objI13 = alcnVar19.i(obj, j);
                        java.lang.Object objI14 = alcnVar19.i(obj2, j);
                        defpackage.alci alciVar7 = defpackage.albx.a;
                        if (!defpackage.anty.H(objI13, objI14)) {
                            return false;
                        }
                        continue;
                        break;
                    default:
                        continue;
                }
                if (!zH) {
                    return false;
                }
            }
        }
        int i3 = this.l;
        while (true) {
            int[] iArr = this.j;
            if (i3 >= iArr.length) {
                if (!((defpackage.alad) obj).P.equals(((defpackage.alad) obj2).P)) {
                    return false;
                }
                if (this.h) {
                    return ((defpackage.alaa) obj).n.equals(((defpackage.alaa) obj2).n);
                }
                return true;
            }
            int i4 = iArr[i3];
            if (!M(obj, obj2, i4)) {
                return false;
            }
            if (!N(obj, 0, i4)) {
                int iS2 = s(i4) & 1048575;
                defpackage.alcn alcnVar20 = defpackage.alco.a;
                long j2 = iS2;
                java.lang.Object objI15 = alcnVar20.i(obj, j2);
                java.lang.Object objI16 = alcnVar20.i(obj2, j2);
                defpackage.alci alciVar8 = defpackage.albx.a;
                if (!defpackage.anty.H(objI15, objI16)) {
                    return false;
                }
            }
            i3++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec A[LOOP:2: B:50:0x00dc->B:54:0x00ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0107 A[SYNTHETIC] */
    @Override // defpackage.albw
    public final boolean l(java.lang.Object obj) {
        int i;
        int i2;
        java.util.List list;
        defpackage.albw albwVarW;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.k) {
            int i7 = this.j[i4];
            int iS = this.s(i7);
            int i8 = this.c[i7 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i6) {
                if (i9 != 1048575) {
                    i5 = b.getInt(obj, i9);
                }
                i2 = i5;
                i = i9;
            } else {
                i = i6;
                i2 = i5;
            }
            defpackage.albk albkVar = this;
            java.lang.Object obj2 = obj;
            if ((268435456 & iS) != 0 && !albkVar.K(obj2, i7, i, i2, i10)) {
                return false;
            }
            int i11 = (iS >>> 20) & 255;
            if (i11 == 9 || i11 == 17) {
                if (albkVar.K(obj2, i7, i, i2, i10)) {
                    if (!albkVar.w(i7).l(defpackage.alco.a.i(obj2, iS & 1048575))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (i11 == 27) {
                list = (java.util.List) defpackage.alco.a.i(obj2, iS & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    albwVarW = albkVar.w(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (albwVarW.l(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (i11 == 60 || i11 == 68) {
                if (albkVar.N(obj2, albkVar.n(i7), i7)) {
                    if (!albkVar.w(i7).l(defpackage.alco.a.i(obj2, iS & 1048575))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (i11 == 49) {
                list = (java.util.List) defpackage.alco.a.i(obj2, iS & 1048575);
                if (list.isEmpty()) {
                    albwVarW = albkVar.w(i7);
                    while (i3 < list.size()) {
                        if (albwVarW.l(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i11 == 50) {
                defpackage.albe albeVar = (defpackage.albe) defpackage.alco.a.i(obj2, iS & 1048575);
                if (!albeVar.isEmpty() && ((defpackage.alcr) ((defpackage.apdi) ((defpackage.ajyk) albkVar.x(i7)).b).d).s == defpackage.alcs.i) {
                    defpackage.albw albwVarB = null;
                    for (java.lang.Object obj3 : albeVar.values()) {
                        if (albwVarB == null) {
                            albwVarB = defpackage.albp.a.b(((defpackage.alad) obj3).getClass());
                        }
                        if (!albwVarB.l(obj3)) {
                            return false;
                        }
                    }
                }
            } else {
                continue;
            }
            i4++;
            this = albkVar;
            obj = obj2;
            i6 = i;
            i5 = i2;
        }
        return !this.h || ((defpackage.alaa) obj).n.h();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    @Override // defpackage.albw
    public final void m(java.lang.Object obj, defpackage.ajyk ajykVar) {
        java.util.Map.Entry entry;
        java.util.Iterator it;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        defpackage.albk albkVar = this;
        if (albkVar.h) {
            defpackage.akzs akzsVar = ((defpackage.alaa) obj).n;
            if (akzsVar.g()) {
                entry = null;
                it = null;
            } else {
                java.util.Iterator itD = akzsVar.d();
                entry = (java.util.Map.Entry) itD.next();
                it = itD;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = albkVar.c;
        sun.misc.Unsafe unsafe = b;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (i8 < iArr.length) {
            int iS = albkVar.s(i8);
            int iN = albkVar.n(i8);
            int i10 = (iS >>> 20) & 255;
            if (i10 <= 17) {
                int i11 = iArr[i8 + 2];
                z = true;
                int i12 = i11 & i6;
                if (i12 != i7) {
                    i9 = i12 == i6 ? 0 : unsafe.getInt(obj, i12);
                    i7 = i12;
                }
                i = i7;
                i2 = i9;
                i3 = 1 << (i11 >>> 20);
            } else {
                z = true;
                i = i7;
                i2 = i9;
                i3 = 0;
            }
            while (entry != null && ((defpackage.alac) entry.getKey()).a <= iN) {
                defpackage.ajsz.ac(ajykVar, entry);
                entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
            }
            long j = iS & i6;
            switch (i10) {
                case 0:
                    if (albkVar.K(obj, i8, i, i2, i3)) {
                        ajykVar.r(iN, defpackage.alco.b(obj, j));
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 1:
                    if (albkVar.K(obj, i8, i, i2, i3)) {
                        ajykVar.v(iN, defpackage.alco.c(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 2:
                    if (albkVar.K(obj, i8, i, i2, i3)) {
                        ajykVar.y(iN, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 3:
                    if (albkVar.K(obj, i8, i, i2, i3)) {
                        ajykVar.H(iN, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 4:
                    if (albkVar.K(obj, i8, i, i2, i3)) {
                        ajykVar.x(iN, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 5:
                    if (albkVar.K(obj, i8, i, i2, i3)) {
                        ajykVar.u(iN, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (albkVar.K(obj, i8, i, i2, i3)) {
                        ajykVar.t(iN, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (albkVar.K(obj, i8, i, i2, i3)) {
                        ajykVar.p(iN, defpackage.alco.a.f(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    if (albkVar.K(obj, i8, i, i2, i3)) {
                        R(iN, unsafe.getObject(obj, j), ajykVar);
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 9:
                    if (albkVar.K(obj, i8, i, i2, i3)) {
                        ajykVar.z(iN, unsafe.getObject(obj, j), albkVar.w(i8));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 10:
                    if (albkVar.K(obj, i8, i, i2, i3)) {
                        ajykVar.q(iN, (defpackage.akzc) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 11:
                    if (albkVar.K(obj, i8, i, i2, i3)) {
                        ajykVar.G(iN, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 12:
                    if (albkVar.K(obj, i8, i, i2, i3)) {
                        ajykVar.s(iN, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 13:
                    if (albkVar.K(obj, i8, i, i2, i3)) {
                        ajykVar.B(iN, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 14:
                    if (albkVar.K(obj, i8, i, i2, i3)) {
                        ajykVar.C(iN, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 15:
                    if (albkVar.K(obj, i8, i, i2, i3)) {
                        ajykVar.D(iN, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 16:
                    if (albkVar.K(obj, i8, i, i2, i3)) {
                        ajykVar.E(iN, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 17:
                    if (albkVar.K(obj, i8, i, i2, i3)) {
                        ajykVar.w(iN, unsafe.getObject(obj, j), albkVar.w(i8));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 18:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.l(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, false);
                    break;
                case 19:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.n(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, false);
                    break;
                case 20:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.u(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, false);
                    break;
                case 21:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.u(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, false);
                    break;
                case 22:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.o(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, false);
                    break;
                case 23:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.t(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, false);
                    break;
                case 24:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.s(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, false);
                    break;
                case 25:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.k(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, false);
                    break;
                case 26:
                    i4 = i;
                    i5 = i2;
                    int iN2 = albkVar.n(i8);
                    java.util.List list = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar = defpackage.albx.a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof defpackage.albc) {
                            defpackage.albc albcVar = (defpackage.albc) list;
                            for (int i13 = 0; i13 < list.size(); i13++) {
                                java.lang.Object objC = albcVar.c();
                                if (objC instanceof java.lang.String) {
                                    ((defpackage.akzk) ajykVar.b).r(iN2, (java.lang.String) objC);
                                } else {
                                    ((defpackage.akzk) ajykVar.b).g(iN2, (defpackage.akzc) objC);
                                }
                            }
                        } else {
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                ((defpackage.akzk) ajykVar.b).r(iN2, (java.lang.String) list.get(i14));
                            }
                        }
                    }
                    break;
                case 27:
                    i4 = i;
                    i5 = i2;
                    int iN3 = albkVar.n(i8);
                    java.util.List list2 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.albw albwVarW = albkVar.w(i8);
                    defpackage.alci alciVar2 = defpackage.albx.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            ajykVar.z(iN3, list2.get(i15), albwVarW);
                        }
                    }
                    break;
                case 28:
                    i4 = i;
                    i5 = i2;
                    int iN4 = albkVar.n(i8);
                    java.util.List list3 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.alci alciVar3 = defpackage.albx.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            ((defpackage.akzk) ajykVar.b).g(iN4, (defpackage.akzc) list3.get(i16));
                        }
                    }
                    break;
                case 29:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.r(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, false);
                    break;
                case 30:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.m(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, false);
                    break;
                case 31:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.s(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, false);
                    break;
                case 32:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.t(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, false);
                    break;
                case 33:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.p(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, false);
                    break;
                case 34:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.q(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, false);
                    break;
                case 35:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.l(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, z);
                    break;
                case 36:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.n(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, z);
                    break;
                case 37:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.u(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, z);
                    break;
                case 38:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.u(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, z);
                    break;
                case 39:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.o(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, z);
                    break;
                case 40:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.t(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, z);
                    break;
                case 41:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.s(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, z);
                    break;
                case 42:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.k(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, z);
                    break;
                case 43:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.r(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, z);
                    break;
                case 44:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.m(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, z);
                    break;
                case 45:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.s(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, z);
                    break;
                case 46:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.t(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, z);
                    break;
                case 47:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.p(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, z);
                    break;
                case 48:
                    i4 = i;
                    i5 = i2;
                    defpackage.albx.q(albkVar.n(i8), (java.util.List) unsafe.getObject(obj, j), ajykVar, z);
                    break;
                case 49:
                    i4 = i;
                    i5 = i2;
                    int iN5 = albkVar.n(i8);
                    java.util.List list4 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.albw albwVarW2 = albkVar.w(i8);
                    defpackage.alci alciVar4 = defpackage.albx.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i17 = 0; i17 < list4.size(); i17++) {
                            ajykVar.w(iN5, list4.get(i17), albwVarW2);
                        }
                    }
                    break;
                case 50:
                    java.lang.Object object = unsafe.getObject(obj, j);
                    if (object != null) {
                        java.lang.Object obj2 = ((defpackage.ajyk) albkVar.x(i8)).b;
                        java.lang.Object obj3 = ajykVar.b;
                        java.util.Iterator it2 = ((defpackage.albe) object).entrySet().iterator();
                        while (it2.hasNext()) {
                            java.util.Map.Entry entry2 = (java.util.Map.Entry) it2.next();
                            defpackage.akzk akzkVar = (defpackage.akzk) obj3;
                            akzkVar.t(iN, 2);
                            java.util.Iterator it3 = it2;
                            defpackage.apdi apdiVar = (defpackage.apdi) obj2;
                            akzkVar.v(defpackage.ajyk.V(apdiVar, entry2.getKey(), entry2.getValue()));
                            defpackage.ajyk.W(akzkVar, apdiVar, entry2.getKey(), entry2.getValue());
                            it2 = it3;
                            i = i;
                            i2 = i2;
                        }
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 51:
                    if (albkVar.N(obj, iN, i8)) {
                        ajykVar.r(iN, ((java.lang.Double) defpackage.alco.a.i(obj, j)).doubleValue());
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 52:
                    if (albkVar.N(obj, iN, i8)) {
                        ajykVar.v(iN, ((java.lang.Float) defpackage.alco.a.i(obj, j)).floatValue());
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 53:
                    if (albkVar.N(obj, iN, i8)) {
                        ajykVar.y(iN, u(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 54:
                    if (albkVar.N(obj, iN, i8)) {
                        ajykVar.H(iN, u(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 55:
                    if (albkVar.N(obj, iN, i8)) {
                        ajykVar.x(iN, o(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 56:
                    if (albkVar.N(obj, iN, i8)) {
                        ajykVar.u(iN, u(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 57:
                    if (albkVar.N(obj, iN, i8)) {
                        ajykVar.t(iN, o(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 58:
                    if (albkVar.N(obj, iN, i8)) {
                        ajykVar.p(iN, ((java.lang.Boolean) defpackage.alco.a.i(obj, j)).booleanValue());
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 59:
                    if (albkVar.N(obj, iN, i8)) {
                        R(iN, unsafe.getObject(obj, j), ajykVar);
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 60:
                    if (albkVar.N(obj, iN, i8)) {
                        ajykVar.z(iN, unsafe.getObject(obj, j), albkVar.w(i8));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 61:
                    if (albkVar.N(obj, iN, i8)) {
                        ajykVar.q(iN, (defpackage.akzc) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 62:
                    if (albkVar.N(obj, iN, i8)) {
                        ajykVar.G(iN, o(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 63:
                    if (albkVar.N(obj, iN, i8)) {
                        ajykVar.s(iN, o(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 64:
                    if (albkVar.N(obj, iN, i8)) {
                        ajykVar.B(iN, o(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 65:
                    if (albkVar.N(obj, iN, i8)) {
                        ajykVar.C(iN, u(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 66:
                    if (albkVar.N(obj, iN, i8)) {
                        ajykVar.D(iN, o(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 67:
                    if (albkVar.N(obj, iN, i8)) {
                        ajykVar.E(iN, u(obj, j));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                case 68:
                    if (albkVar.N(obj, iN, i8)) {
                        ajykVar.w(iN, unsafe.getObject(obj, j), albkVar.w(i8));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
                default:
                    continue;
                    i8 += 3;
                    i6 = 1048575;
                    albkVar = this;
                    i9 = i2;
                    i7 = i;
                    entry = entry;
                    break;
            }
            i = i4;
            i2 = i5;
            i8 += 3;
            i6 = 1048575;
            albkVar = this;
            i9 = i2;
            i7 = i;
            entry = entry;
        }
        while (entry != null) {
            defpackage.ajsz.ac(ajykVar, entry);
            entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
        }
        ((defpackage.alad) obj).P.f(ajykVar);
    }
}
