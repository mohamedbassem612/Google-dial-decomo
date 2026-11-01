package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apyy implements defpackage.apze {
    public static final int[] a = new int[0];
    public static final sun.misc.Unsafe b = defpackage.apzs.g();
    private final int[] c;
    private final java.lang.Object[] d;
    private final int e;
    private final int f;
    private final defpackage.apyv g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final defpackage.apzm m;

    public apyy(int[] iArr, java.lang.Object[] objArr, int i, int i2, defpackage.apyv apyvVar, int[] iArr2, int i3, int i4, defpackage.apzm apzmVar, aoog aoogVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = apyvVar instanceof defpackage.apyf;
        boolean z = false;
        if (aoogVar != null && (apyvVar instanceof defpackage.apye)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = apzmVar;
        this.g = apyvVar;
    }

    private final void A(java.lang.Object obj, int i, java.lang.Object obj2) {
        b.putObject(obj, n(m(i)), obj2);
        y(obj, i);
    }

    private final void B(java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        b.putObject(obj, n(m(i2)), obj2);
        z(obj, i, i2);
    }

    private final boolean C(java.lang.Object obj, java.lang.Object obj2, int i) {
        return E(obj, i) == E(obj2, i);
    }

    private static boolean D(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean E(java.lang.Object obj, int i) {
        int iL = l(i);
        long j = 1048575 & iL;
        if (j == 1048575) {
            int iM = m(i);
            long jN = n(iM);
            switch ((iM >>> 20) & 255) {
                case 0:
                    if (java.lang.Double.doubleToRawLongBits(defpackage.apzs.a(obj, jN)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (java.lang.Float.floatToRawIntBits(defpackage.apzs.b(obj, jN)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (defpackage.apzs.d(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (defpackage.apzs.d(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (defpackage.apzs.c(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (defpackage.apzs.d(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (defpackage.apzs.c(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return defpackage.apzs.q(obj, jN);
                case 8:
                    java.lang.Object objF = defpackage.apzs.f(obj, jN);
                    if (objF instanceof java.lang.String) {
                        if (((java.lang.String) objF).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objF instanceof defpackage.apxo)) {
                            return K();
                        }
                        if (defpackage.apxo.d.equals(objF)) {
                            return false;
                        }
                    }
                case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                    if (defpackage.apzs.f(obj, jN) == null) {
                        return false;
                    }
                    break;
                case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                    if (defpackage.apxo.d.equals(defpackage.apzs.f(obj, jN))) {
                        return false;
                    }
                    break;
                case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                    if (defpackage.apzs.c(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (defpackage.apzs.c(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (defpackage.apzs.c(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (defpackage.apzs.d(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (defpackage.apzs.c(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (defpackage.apzs.d(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (defpackage.apzs.f(obj, jN) == null) {
                        return false;
                    }
                    break;
                default:
                    return K();
            }
        } else {
            if ((defpackage.apzs.c(obj, j) & (1 << (iL >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    private final boolean F(java.lang.Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return E(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean G(java.lang.Object obj, int i, defpackage.apze apzeVar) {
        return apzeVar.h(defpackage.apzs.f(obj, n(i)));
    }

    private static boolean H(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof defpackage.apyf) {
            return ((defpackage.apyf) obj).q();
        }
        return true;
    }

    private final boolean I(java.lang.Object obj, java.lang.Object obj2, int i) {
        long jL = l(i) & 1048575;
        return defpackage.apzs.c(obj, jL) == defpackage.apzs.c(obj2, jL);
    }

    private final boolean J(java.lang.Object obj, int i, int i2) {
        return defpackage.apzs.c(obj, (long) (l(i2) & 1048575)) == i;
    }

    private boolean K() {
        throw new java.lang.IllegalArgumentException();
    }

    private final defpackage.apxc L(int i) {
        return (defpackage.apxc) this.d[((i / 3) << 1) + 1];
    }

    private static final void M(int i, java.lang.Object obj, uzx uzxVar) throws defpackage.apxu {
        if (!(obj instanceof java.lang.String)) {
            uzxVar.bb(i, (defpackage.apxo) obj);
        } else {
            ((defpackage.apxj) uzxVar.a).y(i, (java.lang.String) obj);
        }
    }

    private final int j(int i) {
        return this.c[i];
    }

    private static int k(java.lang.Object obj, long j) {
        return ((java.lang.Integer) defpackage.apzs.f(obj, j)).intValue();
    }

    private final int l(int i) {
        return this.c[i + 2];
    }

    private final int m(int i) {
        return this.c[i + 1];
    }

    private static long n(int i) {
        return i & 1048575;
    }

    private static long o(java.lang.Object obj, long j) {
        return ((java.lang.Long) defpackage.apzs.f(obj, j)).longValue();
    }

    private final java.lang.Object p(java.lang.Object obj, int i, java.lang.Object obj2, defpackage.apzm apzmVar, java.lang.Object obj3) {
        int iJ = j(i);
        java.lang.Object objF = defpackage.apzs.f(obj, n(m(i)));
        if (objF != null && L(i) != null) {
            defpackage.apyr apyrVarJ = aoog.j(q(i));
            java.util.Iterator it = ((defpackage.apys) objF).entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (!defpackage.apxc.a(((java.lang.Integer) entry.getValue()).intValue())) {
                    if (obj2 == null) {
                        obj2 = apzmVar.b(obj3);
                    }
                    int iAY = uzx.aY(apyrVarJ, entry.getKey(), entry.getValue());
                    defpackage.apxo apxoVar = defpackage.apxo.d;
                    byte[] bArr = new byte[iAY];
                    defpackage.apxj apxjVar = new defpackage.apxj(bArr, iAY);
                    try {
                        uzx.aZ(apxjVar, apyrVarJ, entry.getKey(), entry.getValue());
                        ((defpackage.apzn) obj2).e((iJ << 3) | 2, aoog.q(bArr, apxjVar));
                        it.remove();
                    } catch (java.io.IOException e) {
                        throw new java.lang.RuntimeException(e);
                    }
                }
            }
        }
        return obj2;
    }

    private final java.lang.Object q(int i) {
        return this.d[(i / 3) << 1];
    }

    private final java.lang.Object r(java.lang.Object obj, int i) {
        defpackage.apze apzeVarT = t(i);
        long jN = n(m(i));
        if (!E(obj, i)) {
            return apzeVarT.c();
        }
        java.lang.Object object = b.getObject(obj, jN);
        if (H(object)) {
            return object;
        }
        java.lang.Object objC = apzeVarT.c();
        if (object != null) {
            apzeVarT.e(objC, object);
        }
        return objC;
    }

    private final java.lang.Object s(java.lang.Object obj, int i, int i2) {
        defpackage.apze apzeVarT = t(i2);
        if (!J(obj, i, i2)) {
            return apzeVarT.c();
        }
        java.lang.Object object = b.getObject(obj, n(m(i2)));
        if (H(object)) {
            return object;
        }
        java.lang.Object objC = apzeVarT.c();
        if (object != null) {
            apzeVarT.e(objC, object);
        }
        return objC;
    }

    private final defpackage.apze t(int i) {
        java.lang.Object[] objArr = this.d;
        int i2 = (i / 3) << 1;
        defpackage.apze apzeVar = (defpackage.apze) objArr[i2];
        if (apzeVar != null) {
            return apzeVar;
        }
        defpackage.apze apzeVarA = defpackage.apzb.a.a((java.lang.Class) objArr[i2 + 1]);
        objArr[i2] = apzeVarA;
        return apzeVarA;
    }

    private static void u(java.lang.Object obj) {
        if (H(obj)) {
            return;
        }
        java.util.Objects.toString(obj);
        throw new java.lang.IllegalArgumentException("Mutating immutable message: ".concat(java.lang.String.valueOf(obj)));
    }

    private final void v(java.lang.Object obj, java.lang.Object obj2, int i) {
        if (E(obj2, i)) {
            long jN = n(m(i));
            sun.misc.Unsafe unsafe = b;
            java.lang.Object object = unsafe.getObject(obj2, jN);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + j(i) + " is present but null: " + obj2);
            }
            defpackage.apze apzeVarT = t(i);
            if (!E(obj, i)) {
                if (H(object)) {
                    java.lang.Object objC = apzeVarT.c();
                    apzeVarT.e(objC, object);
                    unsafe.putObject(obj, jN, objC);
                } else {
                    unsafe.putObject(obj, jN, object);
                }
                y(obj, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, jN);
            if (!H(object2)) {
                java.lang.Object objC2 = apzeVarT.c();
                apzeVarT.e(objC2, object2);
                unsafe.putObject(obj, jN, objC2);
                object2 = objC2;
            }
            apzeVarT.e(object2, object);
        }
    }

    private final void w(java.lang.Object obj, java.lang.Object obj2, int i) {
        int iJ = j(i);
        if (J(obj2, iJ, i)) {
            long jN = n(m(i));
            sun.misc.Unsafe unsafe = b;
            java.lang.Object object = unsafe.getObject(obj2, jN);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + j(i) + " is present but null: " + obj2);
            }
            defpackage.apze apzeVarT = t(i);
            if (!J(obj, iJ, i)) {
                if (H(object)) {
                    java.lang.Object objC = apzeVarT.c();
                    apzeVarT.e(objC, object);
                    unsafe.putObject(obj, jN, objC);
                } else {
                    unsafe.putObject(obj, jN, object);
                }
                z(obj, iJ, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, jN);
            if (!H(object2)) {
                java.lang.Object objC2 = apzeVarT.c();
                apzeVarT.e(objC2, object2);
                unsafe.putObject(obj, jN, objC2);
                object2 = objC2;
            }
            apzeVarT.e(object2, object);
        }
    }

    private final void x(java.lang.Object obj, int i, defpackage.apxt apxtVar) {
        if (D(i)) {
            defpackage.apzs.o(obj, n(i), apxtVar.r());
        } else if (this.i) {
            defpackage.apzs.o(obj, n(i), apxtVar.q());
        } else {
            defpackage.apzs.o(obj, n(i), apxtVar.s());
        }
    }

    private final void y(java.lang.Object obj, int i) {
        int iL = l(i);
        long j = 1048575 & iL;
        if (j != 1048575) {
            defpackage.apzs.m(obj, j, defpackage.apzs.c(obj, j) | (1 << (iL >>> 20)));
        }
    }

    private final void z(java.lang.Object obj, int i, int i2) {
        defpackage.apzs.m(obj, l(i2) & 1048575, i);
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0459  */
    /* JADX WARN: Code duplicated, block: B:196:0x0546  */
    /* JADX WARN: Code duplicated, block: B:201:0x056b  */
    @Override // defpackage.apze
    public final int a(java.lang.Object obj) {
        int i;
        int iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2;
        int iAr;
        int iNumberOfLeadingZeros3;
        int iNumberOfLeadingZeros4;
        int iC;
        int iK;
        int size;
        int size2;
        int iK2;
        int iNumberOfLeadingZeros5;
        int iNumberOfLeadingZeros6;
        int iNumberOfLeadingZeros7;
        int iNumberOfLeadingZeros8;
        int iNumberOfLeadingZeros9;
        int iNumberOfLeadingZeros10;
        int iA;
        int iNumberOfLeadingZeros11;
        defpackage.apyy apyyVar = this;
        java.lang.Object obj2 = obj;
        sun.misc.Unsafe unsafe = b;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = apyyVar.c;
            if (i3 >= iArr.length) {
                int iA2 = i5 + apyyVar.m.c(obj2).a();
                if (apyyVar.h) {
                    defpackage.apzj apzjVar = aoog.n(obj2).b;
                    if (apzjVar.size() > 0) {
                        defpackage.apzg apzgVar = (defpackage.apzg) apzjVar.a(0);
                        aehu aehuVar = apzgVar.c;
                        java.lang.Object obj3 = apzgVar.a;
                        throw null;
                    }
                }
                return iA2;
            }
            int iM = apyyVar.m(i3);
            int iJ = apyyVar.j(i3);
            int i7 = iArr[i3 + 2];
            int i8 = i7 & i2;
            int i9 = (iM >>> 20) & 255;
            if (i9 <= 17) {
                if (i8 != i6) {
                    i4 = i8 == i2 ? 0 : unsafe.getInt(obj2, i8);
                    i6 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long jN = n(iM);
            if (i9 >= defpackage.apyb.DOUBLE_LIST_PACKED.Z) {
                int i10 = defpackage.apyb.SINT64_LIST_PACKED.Z;
            }
            switch (i9) {
                case 0:
                    if (apyyVar.F(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        i5 += iC;
                    }
                    break;
                case 1:
                    if (apyyVar.F(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + 4;
                        i5 += iNumberOfLeadingZeros4;
                    }
                    apyyVar = this;
                    obj2 = obj;
                    break;
                case 2:
                    if (apyyVar.F(obj2, i3, i6, i4, i)) {
                        iAr = a.ar(iJ, unsafe.getLong(obj2, jN));
                        i5 += iAr;
                    }
                    apyyVar = this;
                    break;
                case 3:
                    if (apyyVar.F(obj2, i3, i6, i4, i)) {
                        iAr = a.ar(iJ, unsafe.getLong(obj2, jN));
                        i5 += iAr;
                    }
                    apyyVar = this;
                    break;
                case 4:
                    if (apyyVar.F(obj2, i3, i6, i4, i)) {
                        iAr = defpackage.apxj.d(iJ, unsafe.getInt(obj2, jN));
                        i5 += iAr;
                    }
                    apyyVar = this;
                    break;
                case 5:
                    if (apyyVar.F(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros3 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros3 * 9)) >>> 6) + 8;
                        i5 += iNumberOfLeadingZeros4;
                    }
                    apyyVar = this;
                    obj2 = obj;
                    break;
                case 6:
                    if (apyyVar.F(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + 4;
                        i5 += iNumberOfLeadingZeros4;
                    }
                    apyyVar = this;
                    obj2 = obj;
                    break;
                case 7:
                    if (apyyVar.F(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros4 = ((352 - (java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) + 1;
                        i5 += iNumberOfLeadingZeros4;
                    }
                    apyyVar = this;
                    obj2 = obj;
                    break;
                case 8:
                    if (apyyVar.F(obj2, i3, i6, i4, i)) {
                        java.lang.Object object = unsafe.getObject(obj2, jN);
                        iAr = object instanceof defpackage.apxo ? defpackage.apxj.a(iJ, (defpackage.apxo) object) : defpackage.apxj.f(iJ, (java.lang.String) object);
                        i5 += iAr;
                    }
                    apyyVar = this;
                    break;
                case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                    if (apyyVar.F(obj2, i3, i6, i4, i)) {
                        iC = defpackage.apzf.c(iJ, unsafe.getObject(obj2, jN), apyyVar.t(i3));
                        i5 += iC;
                    }
                    break;
                case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                    if (apyyVar.F(obj2, i3, i6, i4, i)) {
                        iAr = defpackage.apxj.a(iJ, (defpackage.apxo) unsafe.getObject(obj2, jN));
                        i5 += iAr;
                    }
                    apyyVar = this;
                    break;
                case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                    if (apyyVar.F(obj2, i3, i6, i4, i)) {
                        iAr = a.au(iJ, unsafe.getInt(obj2, jN));
                        i5 += iAr;
                    }
                    apyyVar = this;
                    break;
                case 12:
                    if (apyyVar.F(obj2, i3, i6, i4, i)) {
                        iAr = defpackage.apxj.c(iJ, unsafe.getInt(obj2, jN));
                        i5 += iAr;
                    }
                    apyyVar = this;
                    break;
                case 13:
                    if (apyyVar.F(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + 4;
                        i5 += iNumberOfLeadingZeros4;
                    }
                    apyyVar = this;
                    obj2 = obj;
                    break;
                case 14:
                    if (apyyVar.F(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros3 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros3 * 9)) >>> 6) + 8;
                        i5 += iNumberOfLeadingZeros4;
                    }
                    apyyVar = this;
                    obj2 = obj;
                    break;
                case 15:
                    if (apyyVar.F(obj2, i3, i6, i4, i)) {
                        iAr = a.as(iJ, unsafe.getInt(obj2, jN));
                        i5 += iAr;
                    }
                    apyyVar = this;
                    break;
                case 16:
                    if (apyyVar.F(obj2, i3, i6, i4, i)) {
                        iAr = a.at(iJ, unsafe.getLong(obj2, jN));
                        i5 += iAr;
                    }
                    apyyVar = this;
                    break;
                case 17:
                    if (apyyVar.F(obj2, i3, i6, i4, i)) {
                        iC = defpackage.apzf.a(iJ, (defpackage.apyv) unsafe.getObject(obj2, jN), apyyVar.t(i3));
                        i5 += iC;
                    }
                    break;
                case 18:
                    java.util.List list = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls = defpackage.apzf.a;
                    iC = a.ap(iJ, list);
                    i5 += iC;
                    break;
                case 19:
                    java.util.List list2 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls2 = defpackage.apzf.a;
                    iC = a.ao(iJ, list2);
                    i5 += iC;
                    break;
                case 20:
                    java.util.List list3 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls3 = defpackage.apzf.a;
                    if (list3.size() == 0) {
                        iNumberOfLeadingZeros8 = 0;
                    } else {
                        iK = defpackage.apzf.k(list3);
                        size = list3.size() * ((352 - (java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                    }
                    i5 += iNumberOfLeadingZeros8;
                    break;
                case 21:
                    java.util.List list4 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls4 = defpackage.apzf.a;
                    size2 = list4.size();
                    if (size2 == 0) {
                        iC = 0;
                    } else {
                        iK2 = defpackage.apzf.k(list4);
                        iNumberOfLeadingZeros5 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    }
                    i5 += iC;
                    break;
                case 22:
                    java.util.List list5 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls5 = defpackage.apzf.a;
                    size2 = list5.size();
                    if (size2 != 0) {
                        iK2 = defpackage.apzf.j(list5);
                        iNumberOfLeadingZeros5 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i5 += iC;
                    break;
                case 23:
                    java.util.List list6 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls6 = defpackage.apzf.a;
                    iC = a.ap(iJ, list6);
                    i5 += iC;
                    break;
                case 24:
                    java.util.List list7 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls7 = defpackage.apzf.a;
                    iC = a.ao(iJ, list7);
                    i5 += iC;
                    break;
                case 25:
                    java.util.List list8 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls8 = defpackage.apzf.a;
                    int size3 = list8.size();
                    if (size3 != 0) {
                        iC = size3 * (((352 - (java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) + 1);
                    } else {
                        iC = 0;
                    }
                    i5 += iC;
                    break;
                case 26:
                    java.util.List list9 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls9 = defpackage.apzf.a;
                    int size4 = list9.size();
                    if (size4 == 0) {
                        iNumberOfLeadingZeros6 = 0;
                    } else {
                        boolean z = list9 instanceof defpackage.apyp;
                        iNumberOfLeadingZeros6 = ((352 - (java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) * size4;
                        if (z) {
                            defpackage.apyp apypVar = (defpackage.apyp) list9;
                            for (int i11 = 0; i11 < size4; i11++) {
                                java.lang.Object objB = apypVar.b();
                                iNumberOfLeadingZeros6 += objB instanceof defpackage.apxo ? defpackage.apxj.b((defpackage.apxo) objB) : defpackage.apxj.g((java.lang.String) objB);
                            }
                        } else {
                            for (int i12 = 0; i12 < size4; i12++) {
                                java.lang.Object obj4 = list9.get(i12);
                                iNumberOfLeadingZeros6 += obj4 instanceof defpackage.apxo ? defpackage.apxj.b((defpackage.apxo) obj4) : defpackage.apxj.g((java.lang.String) obj4);
                            }
                        }
                    }
                    i5 += iNumberOfLeadingZeros6;
                    break;
                case 27:
                    java.util.List list10 = (java.util.List) unsafe.getObject(obj2, jN);
                    defpackage.apze apzeVarT = apyyVar.t(i3);
                    java.lang.Class cls10 = defpackage.apzf.a;
                    int size5 = list10.size();
                    if (size5 == 0) {
                        iNumberOfLeadingZeros7 = 0;
                    } else {
                        iNumberOfLeadingZeros7 = ((352 - (java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) * size5;
                        for (int i13 = 0; i13 < size5; i13++) {
                            java.lang.Object obj5 = list10.get(i13);
                            iNumberOfLeadingZeros7 += obj5 instanceof defpackage.apyo ? ((defpackage.apyo) obj5).a() : defpackage.apzf.b((defpackage.apxf) obj5, apzeVarT);
                        }
                    }
                    i5 += iNumberOfLeadingZeros7;
                    break;
                case 28:
                    java.util.List list11 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls11 = defpackage.apzf.a;
                    int size6 = list11.size();
                    if (size6 != 0) {
                        iNumberOfLeadingZeros8 = size6 * ((352 - (java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6);
                        for (int i14 = 0; i14 < list11.size(); i14++) {
                            iNumberOfLeadingZeros8 += defpackage.apxj.b((defpackage.apxo) list11.get(i14));
                        }
                    } else {
                        iNumberOfLeadingZeros8 = 0;
                    }
                    i5 += iNumberOfLeadingZeros8;
                    break;
                case 29:
                    java.util.List list12 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls12 = defpackage.apzf.a;
                    size2 = list12.size();
                    if (size2 != 0) {
                        iK2 = defpackage.apzf.f(list12);
                        iNumberOfLeadingZeros5 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i5 += iC;
                    break;
                case 30:
                    java.util.List list13 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls13 = defpackage.apzf.a;
                    size2 = list13.size();
                    if (size2 != 0) {
                        iK2 = defpackage.apzf.j(list13);
                        iNumberOfLeadingZeros5 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i5 += iC;
                    break;
                case 31:
                    java.util.List list14 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls14 = defpackage.apzf.a;
                    iC = a.ao(iJ, list14);
                    i5 += iC;
                    break;
                case 32:
                    java.util.List list15 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls15 = defpackage.apzf.a;
                    iC = a.ap(iJ, list15);
                    i5 += iC;
                    break;
                case 33:
                    java.util.List list16 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls16 = defpackage.apzf.a;
                    size2 = list16.size();
                    if (size2 != 0) {
                        iK2 = defpackage.apzf.d(list16);
                        iNumberOfLeadingZeros5 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i5 += iC;
                    break;
                case 34:
                    java.util.List list17 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls17 = defpackage.apzf.a;
                    size2 = list17.size();
                    if (size2 != 0) {
                        iK2 = defpackage.apzf.e(list17);
                        iNumberOfLeadingZeros5 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i5 += iC;
                    break;
                case 35:
                    java.util.List list18 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls18 = defpackage.apzf.a;
                    size = list18.size() << 3;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 36:
                    java.util.List list19 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls19 = defpackage.apzf.a;
                    size = list19.size() << 2;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 37:
                    size = defpackage.apzf.k((java.util.List) unsafe.getObject(obj2, jN));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 38:
                    size = defpackage.apzf.k((java.util.List) unsafe.getObject(obj2, jN));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 39:
                    size = defpackage.apzf.j((java.util.List) unsafe.getObject(obj2, jN));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 40:
                    java.util.List list20 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls20 = defpackage.apzf.a;
                    size = list20.size() << 3;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 41:
                    java.util.List list21 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls21 = defpackage.apzf.a;
                    size = list21.size() << 2;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 42:
                    java.util.List list22 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls22 = defpackage.apzf.a;
                    size = list22.size();
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 43:
                    size = defpackage.apzf.f((java.util.List) unsafe.getObject(obj2, jN));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 44:
                    size = defpackage.apzf.j((java.util.List) unsafe.getObject(obj2, jN));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 45:
                    java.util.List list23 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls23 = defpackage.apzf.a;
                    size = list23.size() << 2;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 46:
                    java.util.List list24 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls24 = defpackage.apzf.a;
                    size = list24.size() << 3;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 47:
                    size = defpackage.apzf.d((java.util.List) unsafe.getObject(obj2, jN));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 48:
                    size = defpackage.apzf.e((java.util.List) unsafe.getObject(obj2, jN));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 49:
                    java.util.List list25 = (java.util.List) unsafe.getObject(obj2, jN);
                    defpackage.apze apzeVarT2 = apyyVar.t(i3);
                    java.lang.Class cls25 = defpackage.apzf.a;
                    int size7 = list25.size();
                    if (size7 == 0) {
                        iA = 0;
                    } else {
                        iA = 0;
                        for (int i15 = 0; i15 < size7; i15++) {
                            iA += defpackage.apzf.a(iJ, (defpackage.apyv) list25.get(i15), apzeVarT2);
                        }
                    }
                    i5 += iA;
                    break;
                case 50:
                    defpackage.apys apysVar = (defpackage.apys) unsafe.getObject(obj2, jN);
                    uzx uzxVar = (uzx) apyyVar.q(i3);
                    if (apysVar.isEmpty()) {
                        iNumberOfLeadingZeros7 = 0;
                    } else {
                        iNumberOfLeadingZeros7 = 0;
                        for (java.util.Map.Entry entry : apysVar.entrySet()) {
                            java.lang.Object key = entry.getKey();
                            java.lang.Object value = entry.getValue();
                            int iNumberOfLeadingZeros12 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                            int iAY = uzx.aY((defpackage.apyr) uzxVar.a, key, value);
                            iNumberOfLeadingZeros7 += ((352 - iNumberOfLeadingZeros12) >>> 6) + ((352 - (java.lang.Integer.numberOfLeadingZeros(iAY) * 9)) >>> 6) + iAY;
                        }
                    }
                    i5 += iNumberOfLeadingZeros7;
                    break;
                case 51:
                    if (apyyVar.J(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        i5 += iC;
                    }
                    break;
                case 52:
                    if (apyyVar.J(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros11 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6) + 4;
                        i5 += iC;
                    }
                    break;
                case 53:
                    if (apyyVar.J(obj2, iJ, i3)) {
                        iC = a.ar(iJ, o(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 54:
                    if (apyyVar.J(obj2, iJ, i3)) {
                        iC = a.ar(iJ, o(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 55:
                    if (apyyVar.J(obj2, iJ, i3)) {
                        iC = defpackage.apxj.d(iJ, k(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 56:
                    if (apyyVar.J(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        i5 += iC;
                    }
                    break;
                case 57:
                    if (apyyVar.J(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros11 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6) + 4;
                        i5 += iC;
                    }
                    break;
                case 58:
                    if (apyyVar.J(obj2, iJ, i3)) {
                        iC = ((352 - (java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) + 1;
                        i5 += iC;
                    }
                    break;
                case 59:
                    if (apyyVar.J(obj2, iJ, i3)) {
                        java.lang.Object object2 = unsafe.getObject(obj2, jN);
                        iC = object2 instanceof defpackage.apxo ? defpackage.apxj.a(iJ, (defpackage.apxo) object2) : defpackage.apxj.f(iJ, (java.lang.String) object2);
                        i5 += iC;
                    }
                    break;
                case 60:
                    if (apyyVar.J(obj2, iJ, i3)) {
                        iC = defpackage.apzf.c(iJ, unsafe.getObject(obj2, jN), apyyVar.t(i3));
                        i5 += iC;
                    }
                    break;
                case 61:
                    if (apyyVar.J(obj2, iJ, i3)) {
                        iC = defpackage.apxj.a(iJ, (defpackage.apxo) unsafe.getObject(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 62:
                    if (apyyVar.J(obj2, iJ, i3)) {
                        iC = a.au(iJ, k(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 63:
                    if (apyyVar.J(obj2, iJ, i3)) {
                        iC = defpackage.apxj.c(iJ, k(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 64:
                    if (apyyVar.J(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros11 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6) + 4;
                        i5 += iC;
                    }
                    break;
                case 65:
                    if (apyyVar.J(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        i5 += iC;
                    }
                    break;
                case 66:
                    if (apyyVar.J(obj2, iJ, i3)) {
                        iC = a.as(iJ, k(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 67:
                    if (apyyVar.J(obj2, iJ, i3)) {
                        iC = a.at(iJ, o(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 68:
                    if (apyyVar.J(obj2, iJ, i3)) {
                        iC = defpackage.apzf.a(iJ, (defpackage.apyv) unsafe.getObject(obj2, jN), apyyVar.t(i3));
                        i5 += iC;
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
    }

    @Override // defpackage.apze
    public final int b(java.lang.Object obj) {
        int i;
        int iHashCode = 0;
        for (int i2 = 0; i2 < this.c.length; i2 += 3) {
            int iM = m(i2);
            int i3 = (iM >>> 20) & 255;
            if (i3 <= 50 || i3 >= 69) {
                long jN = n(iM);
                int iM2 = 37;
                switch (i3) {
                    case 0:
                        i = iHashCode * 53;
                        long jDoubleToLongBits = java.lang.Double.doubleToLongBits(defpackage.apzs.a(obj, jN));
                        byte[] bArr = defpackage.apyj.a;
                        iM2 = anty.M(jDoubleToLongBits);
                        break;
                    case 1:
                        i = iHashCode * 53;
                        iM2 = java.lang.Float.floatToIntBits(defpackage.apzs.b(obj, jN));
                        break;
                    case 2:
                        i = iHashCode * 53;
                        long jD = defpackage.apzs.d(obj, jN);
                        byte[] bArr2 = defpackage.apyj.a;
                        iM2 = anty.M(jD);
                        break;
                    case 3:
                        i = iHashCode * 53;
                        long jD2 = defpackage.apzs.d(obj, jN);
                        byte[] bArr3 = defpackage.apyj.a;
                        iM2 = anty.M(jD2);
                        break;
                    case 4:
                        i = iHashCode * 53;
                        iM2 = defpackage.apzs.c(obj, jN);
                        break;
                    case 5:
                        i = iHashCode * 53;
                        long jD3 = defpackage.apzs.d(obj, jN);
                        byte[] bArr4 = defpackage.apyj.a;
                        iM2 = anty.M(jD3);
                        break;
                    case 6:
                        i = iHashCode * 53;
                        iM2 = defpackage.apzs.c(obj, jN);
                        break;
                    case 7:
                        i = iHashCode * 53;
                        boolean zQ = defpackage.apzs.q(obj, jN);
                        byte[] bArr5 = defpackage.apyj.a;
                        iM2 = anty.L(zQ);
                        break;
                    case 8:
                        i = iHashCode * 53;
                        iM2 = ((java.lang.String) defpackage.apzs.f(obj, jN)).hashCode();
                        break;
                    case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                        i = iHashCode * 53;
                        java.lang.Object objF = defpackage.apzs.f(obj, jN);
                        if (objF != null) {
                            iM2 = objF.hashCode();
                        }
                        break;
                    case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                        i = iHashCode * 53;
                        iM2 = defpackage.apzs.f(obj, jN).hashCode();
                        break;
                    case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                        i = iHashCode * 53;
                        iM2 = defpackage.apzs.c(obj, jN);
                        break;
                    case 12:
                        i = iHashCode * 53;
                        iM2 = defpackage.apzs.c(obj, jN);
                        break;
                    case 13:
                        i = iHashCode * 53;
                        iM2 = defpackage.apzs.c(obj, jN);
                        break;
                    case 14:
                        i = iHashCode * 53;
                        long jD4 = defpackage.apzs.d(obj, jN);
                        byte[] bArr6 = defpackage.apyj.a;
                        iM2 = anty.M(jD4);
                        break;
                    case 15:
                        i = iHashCode * 53;
                        iM2 = defpackage.apzs.c(obj, jN);
                        break;
                    case 16:
                        i = iHashCode * 53;
                        long jD5 = defpackage.apzs.d(obj, jN);
                        byte[] bArr7 = defpackage.apyj.a;
                        iM2 = anty.M(jD5);
                        break;
                    case 17:
                        i = iHashCode * 53;
                        java.lang.Object objF2 = defpackage.apzs.f(obj, jN);
                        if (objF2 != null) {
                            iM2 = objF2.hashCode();
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
                        i = iHashCode * 53;
                        iM2 = defpackage.apzs.f(obj, jN).hashCode();
                        break;
                    case 50:
                        i = iHashCode * 53;
                        iM2 = defpackage.apzs.f(obj, jN).hashCode();
                        break;
                    default:
                        continue;
                }
                iHashCode = i + iM2;
            }
        }
        int i4 = this.l;
        while (true) {
            int[] iArr = this.j;
            if (i4 >= iArr.length) {
                int iHashCode2 = (iHashCode * 53) + this.m.c(obj).hashCode();
                return this.h ? (iHashCode2 * 53) + aoog.n(obj).hashCode() : iHashCode2;
            }
            int i5 = iArr[i4];
            if (!J(obj, 0, i5)) {
                iHashCode = (iHashCode * 53) + defpackage.apzs.f(obj, n(m(i5))).hashCode();
            }
            i4++;
        }
    }

    @Override // defpackage.apze
    public final java.lang.Object c() {
        return ((defpackage.apyf) this.g).k();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f A[SYNTHETIC] */
    @Override // defpackage.apze
    public final void d(java.lang.Object obj) {
        if (H(obj)) {
            if (obj instanceof defpackage.apyf) {
                defpackage.apyf apyfVar = (defpackage.apyf) obj;
                apyfVar.p(Integer.MAX_VALUE);
                apyfVar.memoizedHashCode = 0;
                apyfVar.n();
            }
            int[] iArr = this.c;
            for (int i = 0; i < iArr.length; i += 3) {
                int iM = m(i);
                long jN = n(iM);
                int i2 = (iM >>> 20) & 255;
                if (i2 != 9) {
                    if (i2 != 60 && i2 != 68) {
                        switch (i2) {
                            case 17:
                                if (E(obj, i)) {
                                    t(i).d(b.getObject(obj, jN));
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
                                aoog.l(obj, jN).b();
                                break;
                            case 50:
                                sun.misc.Unsafe unsafe = b;
                                java.lang.Object object = unsafe.getObject(obj, jN);
                                if (object != null) {
                                    ((defpackage.apys) object).c();
                                    unsafe.putObject(obj, jN, object);
                                }
                                break;
                        }
                    } else if (J(obj, j(i), i)) {
                        t(i).d(b.getObject(obj, jN));
                    }
                } else if (E(obj, i)) {
                    t(i).d(b.getObject(obj, jN));
                }
            }
            this.m.e(obj);
            if (this.h) {
                aoog.p(obj);
            }
        }
    }

    @Override // defpackage.apze
    public final void e(java.lang.Object obj, java.lang.Object obj2) {
        u(obj);
        defpackage.apyj.a(obj2);
        for (int i = 0; i < this.c.length; i += 3) {
            int iM = m(i);
            long jN = n(iM);
            int iJ = j(i);
            switch ((iM >>> 20) & 255) {
                case 0:
                    if (E(obj2, i)) {
                        defpackage.apzs.k(obj, jN, defpackage.apzs.a(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 1:
                    if (E(obj2, i)) {
                        defpackage.apzs.l(obj, jN, defpackage.apzs.b(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 2:
                    if (E(obj2, i)) {
                        defpackage.apzs.n(obj, jN, defpackage.apzs.d(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 3:
                    if (E(obj2, i)) {
                        defpackage.apzs.n(obj, jN, defpackage.apzs.d(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 4:
                    if (E(obj2, i)) {
                        defpackage.apzs.m(obj, jN, defpackage.apzs.c(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 5:
                    if (E(obj2, i)) {
                        defpackage.apzs.n(obj, jN, defpackage.apzs.d(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 6:
                    if (E(obj2, i)) {
                        defpackage.apzs.m(obj, jN, defpackage.apzs.c(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 7:
                    if (E(obj2, i)) {
                        defpackage.apzs.h(obj, jN, defpackage.apzs.q(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 8:
                    if (E(obj2, i)) {
                        defpackage.apzs.o(obj, jN, defpackage.apzs.f(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                    v(obj, obj2, i);
                    break;
                case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                    if (E(obj2, i)) {
                        defpackage.apzs.o(obj, jN, defpackage.apzs.f(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                    if (E(obj2, i)) {
                        defpackage.apzs.m(obj, jN, defpackage.apzs.c(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 12:
                    if (E(obj2, i)) {
                        defpackage.apzs.m(obj, jN, defpackage.apzs.c(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 13:
                    if (E(obj2, i)) {
                        defpackage.apzs.m(obj, jN, defpackage.apzs.c(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 14:
                    if (E(obj2, i)) {
                        defpackage.apzs.n(obj, jN, defpackage.apzs.d(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 15:
                    if (E(obj2, i)) {
                        defpackage.apzs.m(obj, jN, defpackage.apzs.c(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 16:
                    if (E(obj2, i)) {
                        defpackage.apzs.n(obj, jN, defpackage.apzs.d(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 17:
                    v(obj, obj2, i);
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
                    defpackage.apyi apyiVarL = aoog.l(obj, jN);
                    defpackage.apyi apyiVarL2 = aoog.l(obj2, jN);
                    int size = apyiVarL.size();
                    int size2 = apyiVarL2.size();
                    if (size > 0 && size2 > 0) {
                        if (!apyiVarL.c()) {
                            apyiVarL = apyiVarL.d(size2 + size);
                        }
                        apyiVarL.addAll(apyiVarL2);
                    }
                    if (size > 0) {
                        apyiVarL2 = apyiVarL;
                    }
                    defpackage.apzs.o(obj, jN, apyiVarL2);
                    break;
                case 50:
                    java.lang.Class cls = defpackage.apzf.a;
                    defpackage.apzs.o(obj, jN, aoog.i(defpackage.apzs.f(obj, jN), defpackage.apzs.f(obj2, jN)));
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
                    if (J(obj2, iJ, i)) {
                        defpackage.apzs.o(obj, jN, defpackage.apzs.f(obj2, jN));
                        z(obj, iJ, i);
                    }
                    break;
                case 60:
                    w(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (J(obj2, iJ, i)) {
                        defpackage.apzs.o(obj, jN, defpackage.apzs.f(obj2, jN));
                        z(obj, iJ, i);
                    }
                    break;
                case 68:
                    w(obj, obj2, i);
                    break;
            }
        }
        defpackage.apzf.h(this.m, obj, obj2);
        if (this.h) {
            defpackage.apzf.l(obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:221:0x06c6 A[LOOP:3: B:219:0x06c2->B:221:0x06c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:223:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:234:0x06ed A[LOOP:4: B:232:0x06e9->B:234:0x06ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:237:0x0701  */
    /* JADX WARN: Code duplicated, block: B:248:0x06b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x06bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [apyy] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v13, types: [int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [apyy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [apyy] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [apyy] */
    /* JADX WARN: Type inference failed for: r1v29, types: [apyy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [apyy] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [apyy] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v75, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v10, types: [apzm] */
    /* JADX WARN: Type inference failed for: r5v20, types: [apzm] */
    /* JADX WARN: Type inference failed for: r5v22, types: [apzm] */
    /* JADX WARN: Type inference failed for: r5v4, types: [apzm] */
    /* JADX WARN: Type inference failed for: r5v5, types: [apzm] */
    /* JADX WARN: Type inference failed for: r5v6, types: [apzm] */
    /* JADX WARN: Type inference failed for: r6v0, types: [apzm] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [apzm] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.apze
    public final void f(java.lang.Object obj, defpackage.apxt apxtVar, defpackage.apxy apxyVar) throws java.lang.Throwable {
        ?? r2;
        int i;
        java.lang.Object objP;
        ?? r6;
        ?? r1;
        ?? r5;
        ?? r13;
        java.lang.Object objP2;
        ?? r7;
        int i2;
        ?? r3 = this;
        defpackage.apyj.a(apxyVar);
        u(obj);
        ?? r8 = r3.m;
        java.lang.Object objB = null;
        while (true) {
            try {
                int iC = apxtVar.c();
                int i3 = -1;
                if (iC >= r3.e && iC <= r3.f) {
                    int length = (r3.c.length / 3) - 1;
                    int i4 = 0;
                    while (i4 <= length) {
                        r13 = (length + i4) >>> 1;
                        int i5 = r13 * 3;
                        int iJ = r3.j(i5);
                        if (iC == iJ) {
                            i3 = i5;
                        } else if (iC < iJ) {
                            length = r13 - 1;
                        } else {
                            i4 = r13 + 1;
                        }
                    }
                }
                int i6 = Integer.MAX_VALUE;
                if (i3 >= 0) {
                    try {
                        r13 = r3;
                        int iM = r13.m(i3);
                        switch ((iM >>> 20) & 255) {
                            case 0:
                                defpackage.apzs.k(obj, n(iM), apxtVar.a());
                                r13.y(obj, i3);
                                r3 = r13;
                                break;
                            case 1:
                                defpackage.apzs.l(obj, n(iM), apxtVar.b());
                                r13.y(obj, i3);
                                r3 = r13;
                                break;
                            case 2:
                                defpackage.apzs.n(obj, n(iM), apxtVar.k());
                                r13.y(obj, i3);
                                r3 = r13;
                                break;
                            case 3:
                                defpackage.apzs.n(obj, n(iM), apxtVar.n());
                                r13.y(obj, i3);
                                r3 = r13;
                                break;
                            case 4:
                                defpackage.apzs.m(obj, n(iM), apxtVar.f());
                                r13.y(obj, i3);
                                r3 = r13;
                                break;
                            case 5:
                                defpackage.apzs.n(obj, n(iM), apxtVar.j());
                                r13.y(obj, i3);
                                r3 = r13;
                                break;
                            case 6:
                                defpackage.apzs.m(obj, n(iM), apxtVar.e());
                                r13.y(obj, i3);
                                r3 = r13;
                                break;
                            case 7:
                                defpackage.apzs.h(obj, n(iM), apxtVar.M());
                                r13.y(obj, i3);
                                r3 = r13;
                                break;
                            case 8:
                                r13.x(obj, iM, apxtVar);
                                r13.y(obj, i3);
                                r3 = r13;
                                break;
                            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                                defpackage.apyv apyvVar = (defpackage.apyv) r13.r(obj, i3);
                                apxtVar.v(apyvVar, r13.t(i3), apxyVar);
                                r13.A(obj, i3, apyvVar);
                                r3 = r13;
                                break;
                            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                                defpackage.apzs.o(obj, n(iM), apxtVar.s());
                                r13.y(obj, i3);
                                r3 = r13;
                                break;
                            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                                defpackage.apzs.m(obj, n(iM), apxtVar.i());
                                r13.y(obj, i3);
                                r3 = r13;
                                break;
                            case 12:
                                int iD = apxtVar.d();
                                if (r13.L(i3) == null || defpackage.apxc.a(iD)) {
                                    defpackage.apzs.m(obj, n(iM), iD);
                                    r13.y(obj, i3);
                                } else {
                                    objB = defpackage.apzf.g(obj, iC, iD, objB, r8);
                                }
                                r3 = r13;
                                break;
                            case 13:
                                defpackage.apzs.m(obj, n(iM), apxtVar.g());
                                r13.y(obj, i3);
                                r3 = r13;
                                break;
                            case 14:
                                defpackage.apzs.n(obj, n(iM), apxtVar.l());
                                r13.y(obj, i3);
                                r3 = r13;
                                break;
                            case 15:
                                defpackage.apzs.m(obj, n(iM), apxtVar.h());
                                r13.y(obj, i3);
                                r3 = r13;
                                break;
                            case 16:
                                defpackage.apzs.n(obj, n(iM), apxtVar.m());
                                r13.y(obj, i3);
                                r3 = r13;
                                break;
                            case 17:
                                defpackage.apyv apyvVar2 = (defpackage.apyv) r13.r(obj, i3);
                                apxtVar.t(apyvVar2, r13.t(i3), apxyVar);
                                r13.A(obj, i3, apyvVar2);
                                r3 = r13;
                                break;
                            case 18:
                                apxtVar.x(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 19:
                                apxtVar.B(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 20:
                                apxtVar.D(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 21:
                                apxtVar.K(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 22:
                                apxtVar.C(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 23:
                                apxtVar.A(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 24:
                                apxtVar.z(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 25:
                                apxtVar.w(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 26:
                                if (D(iM)) {
                                    apxtVar.I(aoog.m(obj, n(iM)), true);
                                } else {
                                    apxtVar.I(aoog.m(obj, n(iM)), false);
                                }
                                r3 = r13;
                                break;
                            case 27:
                                defpackage.apze apzeVarT = r13.t(i3);
                                java.util.List listM = aoog.m(obj, n(iM));
                                int i7 = apxtVar.a;
                                if ((i7 & 7) != 2) {
                                    throw new defpackage.apyl();
                                }
                                while (true) {
                                    listM.add(apxtVar.p(apzeVarT, apxyVar));
                                    java.lang.Object obj2 = apxtVar.d;
                                    if (!((defpackage.apxs) obj2).A() && apxtVar.c == 0) {
                                        int iM2 = ((defpackage.apxs) obj2).m();
                                        if (iM2 != i7) {
                                            apxtVar.c = iM2;
                                        }
                                    }
                                }
                                r3 = r13;
                                break;
                                break;
                            case 28:
                                java.util.List listM2 = aoog.m(obj, n(iM));
                                if ((apxtVar.a & 7) != 2) {
                                    throw new defpackage.apyl();
                                }
                                while (true) {
                                    listM2.add(apxtVar.s());
                                    java.lang.Object obj3 = apxtVar.d;
                                    if (!((defpackage.apxs) obj3).A()) {
                                        int iM3 = ((defpackage.apxs) obj3).m();
                                        if (iM3 != apxtVar.a) {
                                            apxtVar.c = iM3;
                                        }
                                    }
                                }
                                r3 = r13;
                                break;
                                break;
                            case 29:
                                apxtVar.J(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 30:
                                java.util.List listM3 = aoog.m(obj, n(iM));
                                apxtVar.y(listM3);
                                objB = defpackage.apzf.i(obj, iC, listM3, r13.L(i3), objB, r8);
                                r3 = r13;
                                break;
                            case 31:
                                apxtVar.E(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 32:
                                apxtVar.F(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 33:
                                apxtVar.G(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 34:
                                apxtVar.H(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 35:
                                apxtVar.x(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 36:
                                apxtVar.B(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 37:
                                apxtVar.D(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 38:
                                apxtVar.K(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 39:
                                apxtVar.C(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 40:
                                apxtVar.A(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 41:
                                apxtVar.z(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 42:
                                apxtVar.w(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 43:
                                apxtVar.J(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 44:
                                java.util.List listM4 = aoog.m(obj, n(iM));
                                apxtVar.y(listM4);
                                objB = defpackage.apzf.i(obj, iC, listM4, r13.L(i3), objB, r8);
                                r3 = r13;
                                break;
                            case 45:
                                apxtVar.E(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 46:
                                apxtVar.F(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 47:
                                apxtVar.G(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 48:
                                apxtVar.H(aoog.m(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 49:
                                long jN = n(iM);
                                defpackage.apze apzeVarT2 = r13.t(i3);
                                java.util.List listM5 = aoog.m(obj, jN);
                                int i8 = apxtVar.a;
                                if ((i8 & 7) != 3) {
                                    throw new defpackage.apyl();
                                }
                                while (true) {
                                    java.lang.Object objC = apzeVarT2.c();
                                    apxtVar.u(objC, apzeVarT2, apxyVar);
                                    apzeVarT2.d(objC);
                                    listM5.add(objC);
                                    java.lang.Object obj4 = apxtVar.d;
                                    if (!((defpackage.apxs) obj4).A() && apxtVar.c == 0) {
                                        int iM4 = ((defpackage.apxs) obj4).m();
                                        if (iM4 != i8) {
                                            apxtVar.c = iM4;
                                        }
                                    }
                                }
                                r3 = r13;
                                break;
                                break;
                            case 50:
                                java.lang.Object objQ = r13.q(i3);
                                long jN2 = n(r13.m(i3));
                                java.lang.Object objF = defpackage.apzs.f(obj, jN2);
                                if (objF == null) {
                                    objF = aoog.k();
                                    defpackage.apzs.o(obj, jN2, objF);
                                } else if (!((defpackage.apys) objF).b) {
                                    java.lang.Object objK = aoog.k();
                                    aoog.i(objK, objF);
                                    defpackage.apzs.o(obj, jN2, objK);
                                    objF = objK;
                                }
                                defpackage.apys apysVar = (defpackage.apys) objF;
                                defpackage.apyr apyrVarJ = aoog.j(objQ);
                                apxtVar.L(2);
                                java.lang.Object obj5 = apxtVar.d;
                                int iE = ((defpackage.apxs) obj5).e(((defpackage.apxs) obj5).n());
                                java.lang.Object obj6 = apyrVarJ.b;
                                java.lang.Object obj7 = apyrVarJ.d;
                                java.lang.Object objO = obj6;
                                java.lang.Object objO2 = obj7;
                                while (true) {
                                    try {
                                        int iC2 = apxtVar.c();
                                        if (iC2 != i6 && !((defpackage.apxs) obj5).A()) {
                                            if (iC2 == 1) {
                                                objO = apxtVar.o(apyrVarJ.a, null, null);
                                            } else if (iC2 != 2) {
                                                try {
                                                    if (!apxtVar.N()) {
                                                        throw new defpackage.apym("Unable to parse map entry.");
                                                    }
                                                    continue;
                                                } catch (defpackage.apyl e) {
                                                    if (!apxtVar.N()) {
                                                        throw new defpackage.apym(e, null);
                                                    }
                                                }
                                            } else {
                                                objO2 = apxtVar.o(apyrVarJ.c, obj7.getClass(), apxyVar);
                                            }
                                            i6 = Integer.MAX_VALUE;
                                        }
                                    } catch (java.lang.Throwable th) {
                                        ((defpackage.apxs) apxtVar.d).y(iE);
                                        throw th;
                                    }
                                }
                                apysVar.put(objO, objO2);
                                ((defpackage.apxs) apxtVar.d).y(iE);
                                r3 = r13;
                                break;
                            case 51:
                                defpackage.apzs.o(obj, n(iM), java.lang.Double.valueOf(apxtVar.a()));
                                r13.z(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 52:
                                defpackage.apzs.o(obj, n(iM), java.lang.Float.valueOf(apxtVar.b()));
                                r13.z(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 53:
                                defpackage.apzs.o(obj, n(iM), java.lang.Long.valueOf(apxtVar.k()));
                                r13.z(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 54:
                                defpackage.apzs.o(obj, n(iM), java.lang.Long.valueOf(apxtVar.n()));
                                r13.z(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 55:
                                defpackage.apzs.o(obj, n(iM), java.lang.Integer.valueOf(apxtVar.f()));
                                r13.z(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 56:
                                defpackage.apzs.o(obj, n(iM), java.lang.Long.valueOf(apxtVar.j()));
                                r13.z(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 57:
                                defpackage.apzs.o(obj, n(iM), java.lang.Integer.valueOf(apxtVar.e()));
                                r13.z(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 58:
                                defpackage.apzs.o(obj, n(iM), java.lang.Boolean.valueOf(apxtVar.M()));
                                r13.z(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 59:
                                r13.x(obj, iM, apxtVar);
                                r13.z(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 60:
                                defpackage.apyv apyvVar3 = (defpackage.apyv) r13.s(obj, iC, i3);
                                apxtVar.v(apyvVar3, r13.t(i3), apxyVar);
                                r13.B(obj, iC, i3, apyvVar3);
                                r3 = r13;
                                break;
                            case 61:
                                defpackage.apzs.o(obj, n(iM), apxtVar.s());
                                r13.z(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 62:
                                defpackage.apzs.o(obj, n(iM), java.lang.Integer.valueOf(apxtVar.i()));
                                r13.z(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 63:
                                int iD2 = apxtVar.d();
                                if (r13.L(i3) == null || defpackage.apxc.a(iD2)) {
                                    defpackage.apzs.o(obj, n(iM), java.lang.Integer.valueOf(iD2));
                                    r13.z(obj, iC, i3);
                                } else {
                                    objB = defpackage.apzf.g(obj, iC, iD2, objB, r8);
                                }
                                r3 = r13;
                                break;
                            case 64:
                                defpackage.apzs.o(obj, n(iM), java.lang.Integer.valueOf(apxtVar.g()));
                                r13.z(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 65:
                                defpackage.apzs.o(obj, n(iM), java.lang.Long.valueOf(apxtVar.l()));
                                r13.z(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 66:
                                defpackage.apzs.o(obj, n(iM), java.lang.Integer.valueOf(apxtVar.h()));
                                r13.z(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 67:
                                defpackage.apzs.o(obj, n(iM), java.lang.Long.valueOf(apxtVar.m()));
                                r13.z(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 68:
                                try {
                                    defpackage.apyv apyvVar4 = (defpackage.apyv) r13.s(obj, iC, i3);
                                    apxtVar.t(apyvVar4, r13.t(i3), apxyVar);
                                    r13.B(obj, iC, i3, apyvVar4);
                                    r3 = r13;
                                } catch (defpackage.apyl unused) {
                                    r2 = obj;
                                    r3 = r13;
                                    if (objB == null) {
                                        try {
                                            objB = r8.b(r2);
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                    if (!r8.a(objB, apxtVar, 0)) {
                                        objP2 = objB;
                                        r7 = r8;
                                        for (i2 = r3.k; i2 < r3.l; i2++) {
                                            ?? r9 = r7;
                                            objP2 = r3.p(r2, r3.j[i2], objP2, r9, obj);
                                            r7 = r9;
                                        }
                                        if (objP2 != null) {
                                            r7.f(r2, (defpackage.apzn) objP2);
                                        }
                                    }
                                }
                                break;
                            default:
                                r2 = obj;
                                if (objB == null) {
                                    try {
                                        objB = r8.b(r2);
                                    } catch (defpackage.apyl unused2) {
                                        r3 = r13;
                                        if (objB == null) {
                                            objB = r8.b(r2);
                                        }
                                        if (!r8.a(objB, apxtVar, 0)) {
                                            objP2 = objB;
                                            r7 = r8;
                                            while (i2 < r3.l) {
                                                ?? r10 = r7;
                                                objP2 = r3.p(r2, r3.j[i2], objP2, r10, obj);
                                                r7 = r10;
                                            }
                                            if (objP2 != null) {
                                                r7.f(r2, (defpackage.apzn) objP2);
                                            }
                                        }
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        r3 = r13;
                                        i = r3.k;
                                        objP = objB;
                                        r1 = r3;
                                        r6 = r8;
                                        while (i < r1.l) {
                                            ?? r11 = r6;
                                            objP = r1.p(r2, r1.j[i], objP, r11, obj);
                                            i++;
                                            r1 = this;
                                            r6 = r11;
                                        }
                                        r5 = r6;
                                        if (objP != null) {
                                            r5.f(r2, (defpackage.apzn) objP);
                                        }
                                        throw th;
                                    }
                                    break;
                                }
                                if (!r8.a(objB, apxtVar, 0)) {
                                    objP2 = objB;
                                    r7 = r8;
                                    for (int i9 = r13.k; i9 < r13.l; i9++) {
                                        ?? r12 = r7;
                                        objP2 = r13.p(r2, r13.j[i9], objP2, r12, obj);
                                        r7 = r12;
                                    }
                                }
                                r3 = r13;
                                break;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        r2 = r3;
                        r3 = r13;
                        i = r3.k;
                        objP = objB;
                        r1 = r3;
                        r6 = r8;
                        while (i < r1.l) {
                            ?? r14 = r6;
                            objP = r1.p(r2, r1.j[i], objP, r14, obj);
                            i++;
                            r1 = this;
                            r6 = r14;
                        }
                        r5 = r6;
                        if (objP != null) {
                            r5.f(r2, (defpackage.apzn) objP);
                        }
                        throw th;
                    }
                } else if (iC == Integer.MAX_VALUE) {
                    objP2 = objB;
                    r7 = r8;
                    for (int i10 = r3.k; i10 < r3.l; i10++) {
                        ?? r15 = r7;
                        objP2 = r3.p(obj, r3.j[i10], objP2, r15, obj);
                        r7 = r15;
                    }
                    r2 = obj;
                } else {
                    java.lang.Object obj8 = obj;
                    try {
                        if ((!r3.h ? null : apxyVar.b(r3.g, iC)) != null) {
                            aoog.o(obj8);
                            throw null;
                        }
                        if (objB == null) {
                            try {
                                objB = r8.b(obj8);
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                r2 = obj8;
                            }
                        }
                        if (r8.a(objB, apxtVar, 0)) {
                            r13 = r3;
                            r3 = r13;
                        } else {
                            int i11 = r3.k;
                            objP2 = objB;
                            r7 = r8;
                            for (?? r4 = r3; i11 < r4.l; r4 = r4) {
                                ?? r16 = r7;
                                java.lang.Object obj9 = obj8;
                                objP2 = r4.p(obj9, r4.j[i11], objP2, r16, obj);
                                r7 = r16;
                                i11++;
                                obj8 = obj9;
                            }
                            r2 = obj8;
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        r13 = r3;
                        r3 = obj8;
                        r2 = r3;
                        r3 = r13;
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                r2 = obj;
            }
            i = r3.k;
            objP = objB;
            r1 = r3;
            r6 = r8;
            while (i < r1.l) {
                ?? r17 = r6;
                objP = r1.p(r2, r1.j[i], objP, r17, obj);
                i++;
                r1 = this;
                r6 = r17;
            }
            r5 = r6;
            if (objP != null) {
                r5.f(r2, (defpackage.apzn) objP);
            }
            throw th;
        }
        if (objP2 != null) {
            r7.f(r2, (defpackage.apzn) objP2);
        }
    }

    @Override // defpackage.apze
    public final boolean g(java.lang.Object obj, java.lang.Object obj2) {
        boolean zH;
        for (int i = 0; i < this.c.length; i += 3) {
            int iM = m(i);
            int i2 = (iM >>> 20) & 255;
            if (i2 <= 50 || i2 >= 69) {
                long jN = n(iM);
                switch (i2) {
                    case 0:
                        if (!C(obj, obj2, i) || java.lang.Double.doubleToLongBits(defpackage.apzs.a(obj, jN)) != java.lang.Double.doubleToLongBits(defpackage.apzs.a(obj2, jN))) {
                            return false;
                        }
                        continue;
                        break;
                    case 1:
                        if (!C(obj, obj2, i) || java.lang.Float.floatToIntBits(defpackage.apzs.b(obj, jN)) != java.lang.Float.floatToIntBits(defpackage.apzs.b(obj2, jN))) {
                            return false;
                        }
                        continue;
                        break;
                    case 2:
                        if (!C(obj, obj2, i) || defpackage.apzs.d(obj, jN) != defpackage.apzs.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 3:
                        if (!C(obj, obj2, i) || defpackage.apzs.d(obj, jN) != defpackage.apzs.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 4:
                        if (!C(obj, obj2, i) || defpackage.apzs.c(obj, jN) != defpackage.apzs.c(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 5:
                        if (!C(obj, obj2, i) || defpackage.apzs.d(obj, jN) != defpackage.apzs.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 6:
                        if (!C(obj, obj2, i) || defpackage.apzs.c(obj, jN) != defpackage.apzs.c(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 7:
                        if (!C(obj, obj2, i) || defpackage.apzs.q(obj, jN) != defpackage.apzs.q(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 8:
                        if (!C(obj, obj2, i)) {
                            return false;
                        }
                        java.lang.Object objF = defpackage.apzs.f(obj, jN);
                        java.lang.Object objF2 = defpackage.apzs.f(obj2, jN);
                        java.lang.Class cls = defpackage.apzf.a;
                        if (!anty.H(objF, objF2)) {
                            return false;
                        }
                        continue;
                        break;
                    case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                        if (!C(obj, obj2, i)) {
                            return false;
                        }
                        java.lang.Object objF3 = defpackage.apzs.f(obj, jN);
                        java.lang.Object objF4 = defpackage.apzs.f(obj2, jN);
                        java.lang.Class cls2 = defpackage.apzf.a;
                        if (!anty.H(objF3, objF4)) {
                            return false;
                        }
                        continue;
                        break;
                    case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                        if (!C(obj, obj2, i)) {
                            return false;
                        }
                        java.lang.Object objF5 = defpackage.apzs.f(obj, jN);
                        java.lang.Object objF6 = defpackage.apzs.f(obj2, jN);
                        java.lang.Class cls3 = defpackage.apzf.a;
                        if (!anty.H(objF5, objF6)) {
                            return false;
                        }
                        continue;
                        break;
                    case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                        if (!C(obj, obj2, i) || defpackage.apzs.c(obj, jN) != defpackage.apzs.c(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 12:
                        if (!C(obj, obj2, i) || defpackage.apzs.c(obj, jN) != defpackage.apzs.c(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 13:
                        if (!C(obj, obj2, i) || defpackage.apzs.c(obj, jN) != defpackage.apzs.c(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 14:
                        if (!C(obj, obj2, i) || defpackage.apzs.d(obj, jN) != defpackage.apzs.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 15:
                        if (!C(obj, obj2, i) || defpackage.apzs.c(obj, jN) != defpackage.apzs.c(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 16:
                        if (!C(obj, obj2, i) || defpackage.apzs.d(obj, jN) != defpackage.apzs.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 17:
                        if (!C(obj, obj2, i)) {
                            return false;
                        }
                        java.lang.Object objF7 = defpackage.apzs.f(obj, jN);
                        java.lang.Object objF8 = defpackage.apzs.f(obj2, jN);
                        java.lang.Class cls4 = defpackage.apzf.a;
                        if (!anty.H(objF7, objF8)) {
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
                        java.lang.Object objF9 = defpackage.apzs.f(obj, jN);
                        java.lang.Object objF10 = defpackage.apzs.f(obj2, jN);
                        java.lang.Class cls5 = defpackage.apzf.a;
                        zH = anty.H(objF9, objF10);
                        break;
                    case 50:
                        java.lang.Object objF11 = defpackage.apzs.f(obj, jN);
                        java.lang.Object objF12 = defpackage.apzs.f(obj2, jN);
                        java.lang.Class cls6 = defpackage.apzf.a;
                        zH = anty.H(objF11, objF12);
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
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        java.lang.Object objF13 = defpackage.apzs.f(obj, jN);
                        java.lang.Object objF14 = defpackage.apzs.f(obj2, jN);
                        java.lang.Class cls7 = defpackage.apzf.a;
                        if (!anty.H(objF13, objF14)) {
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
                defpackage.apzm apzmVar = this.m;
                if (!apzmVar.c(obj).equals(apzmVar.c(obj2))) {
                    return false;
                }
                if (this.h) {
                    return aoog.n(obj).equals(aoog.n(obj2));
                }
                return true;
            }
            int i4 = iArr[i3];
            if (!I(obj, obj2, i4)) {
                return false;
            }
            if (!J(obj, 0, i4)) {
                long jN2 = n(m(i4));
                java.lang.Object objF15 = defpackage.apzs.f(obj, jN2);
                java.lang.Object objF16 = defpackage.apzs.f(obj2, jN2);
                java.lang.Class cls8 = defpackage.apzf.a;
                if (!anty.H(objF15, objF16)) {
                    return false;
                }
            }
            i3++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e0 A[LOOP:2: B:50:0x00d0->B:54:0x00e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f3 A[SYNTHETIC] */
    @Override // defpackage.apze
    public final boolean h(java.lang.Object obj) {
        int i;
        int i2;
        java.util.List list;
        defpackage.apze apzeVarT;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.k) {
            int i7 = this.j[i4];
            int iM = this.m(i7);
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
            defpackage.apyy apyyVar = this;
            java.lang.Object obj2 = obj;
            if ((268435456 & iM) != 0 && !apyyVar.F(obj2, i7, i, i2, i10)) {
                return false;
            }
            int i11 = (iM >>> 20) & 255;
            if (i11 == 9 || i11 == 17) {
                if (apyyVar.F(obj2, i7, i, i2, i10) && !G(obj2, iM, apyyVar.t(i7))) {
                    return false;
                }
            } else if (i11 == 27) {
                list = (java.util.List) defpackage.apzs.f(obj2, n(iM));
                if (list.isEmpty()) {
                    continue;
                } else {
                    apzeVarT = apyyVar.t(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (apzeVarT.h(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (i11 == 60 || i11 == 68) {
                if (apyyVar.J(obj2, apyyVar.j(i7), i7) && !G(obj2, iM, apyyVar.t(i7))) {
                    return false;
                }
            } else if (i11 == 49) {
                list = (java.util.List) defpackage.apzs.f(obj2, n(iM));
                if (list.isEmpty()) {
                    apzeVarT = apyyVar.t(i7);
                    while (i3 < list.size()) {
                        if (apzeVarT.h(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i11 == 50) {
                defpackage.apys apysVar = (defpackage.apys) defpackage.apzs.f(obj2, n(iM));
                if (!apysVar.isEmpty() && aoog.j(apyyVar.q(i7)).c.s == defpackage.apzw.i) {
                    defpackage.apze apzeVarA = null;
                    for (java.lang.Object obj3 : apysVar.values()) {
                        if (apzeVarA == null) {
                            apzeVarA = defpackage.apzb.a.a(((defpackage.apyf) obj3).getClass());
                        }
                        if (!apzeVarA.h(obj3)) {
                            return false;
                        }
                    }
                }
            } else {
                continue;
            }
            i4++;
            this = apyyVar;
            obj = obj2;
            i6 = i;
            i5 = i2;
        }
        java.lang.Object obj4 = obj;
        if (this.h) {
            aoog.n(obj4).f();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    @Override // defpackage.apze
    public final void i(java.lang.Object obj, uzx uzxVar) throws defpackage.apxu {
        java.util.Map.Entry entry;
        int i;
        int i2;
        defpackage.apyy apyyVar = this;
        if (apyyVar.h) {
            defpackage.apya apyaVarN = aoog.n(obj);
            if (apyaVarN.d()) {
                entry = null;
            } else {
                entry = (java.util.Map.Entry) apyaVarN.b().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = apyyVar.c;
        sun.misc.Unsafe unsafe = b;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < iArr.length) {
            int iM = apyyVar.m(i5);
            int iJ = apyyVar.j(i5);
            int i7 = (iM >>> 20) & 255;
            if (i7 <= 17) {
                int i8 = iArr[i5 + 2];
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            if (entry != null) {
                throw null;
            }
            long jN = n(iM);
            switch (i7) {
                case 0:
                    if (apyyVar.F(obj, i5, i4, i6, i)) {
                        uzxVar.bc(iJ, defpackage.apzs.a(obj, jN));
                    }
                    break;
                case 1:
                    if (apyyVar.F(obj, i5, i4, i6, i)) {
                        uzxVar.bg(iJ, defpackage.apzs.b(obj, jN));
                    }
                    apyyVar = this;
                    break;
                case 2:
                    if (apyyVar.F(obj, i5, i4, i6, i)) {
                        uzxVar.bj(iJ, unsafe.getLong(obj, jN));
                    }
                    apyyVar = this;
                    break;
                case 3:
                    if (apyyVar.F(obj, i5, i4, i6, i)) {
                        uzxVar.bq(iJ, unsafe.getLong(obj, jN));
                    }
                    apyyVar = this;
                    break;
                case 4:
                    if (apyyVar.F(obj, i5, i4, i6, i)) {
                        uzxVar.bi(iJ, unsafe.getInt(obj, jN));
                    }
                    apyyVar = this;
                    break;
                case 5:
                    if (apyyVar.F(obj, i5, i4, i6, i)) {
                        uzxVar.bf(iJ, unsafe.getLong(obj, jN));
                    }
                    apyyVar = this;
                    break;
                case 6:
                    if (apyyVar.F(obj, i5, i4, i6, i)) {
                        uzxVar.be(iJ, unsafe.getInt(obj, jN));
                    }
                    apyyVar = this;
                    break;
                case 7:
                    if (apyyVar.F(obj, i5, i4, i6, i)) {
                        uzxVar.ba(iJ, defpackage.apzs.q(obj, jN));
                    }
                    apyyVar = this;
                    break;
                case 8:
                    if (apyyVar.F(obj, i5, i4, i6, i)) {
                        M(iJ, unsafe.getObject(obj, jN), uzxVar);
                    }
                    apyyVar = this;
                    break;
                case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                    if (apyyVar.F(obj, i5, i4, i6, i)) {
                        uzxVar.bk(iJ, unsafe.getObject(obj, jN), apyyVar.t(i5));
                    }
                    break;
                case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                    if (apyyVar.F(obj, i5, i4, i6, i)) {
                        uzxVar.bb(iJ, (defpackage.apxo) unsafe.getObject(obj, jN));
                    }
                    apyyVar = this;
                    break;
                case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                    if (apyyVar.F(obj, i5, i4, i6, i)) {
                        uzxVar.bp(iJ, unsafe.getInt(obj, jN));
                    }
                    apyyVar = this;
                    break;
                case 12:
                    if (apyyVar.F(obj, i5, i4, i6, i)) {
                        uzxVar.bd(iJ, unsafe.getInt(obj, jN));
                    }
                    apyyVar = this;
                    break;
                case 13:
                    if (apyyVar.F(obj, i5, i4, i6, i)) {
                        uzxVar.bl(iJ, unsafe.getInt(obj, jN));
                    }
                    apyyVar = this;
                    break;
                case 14:
                    if (apyyVar.F(obj, i5, i4, i6, i)) {
                        uzxVar.bm(iJ, unsafe.getLong(obj, jN));
                    }
                    apyyVar = this;
                    break;
                case 15:
                    if (apyyVar.F(obj, i5, i4, i6, i)) {
                        uzxVar.bn(iJ, unsafe.getInt(obj, jN));
                    }
                    apyyVar = this;
                    break;
                case 16:
                    if (apyyVar.F(obj, i5, i4, i6, i)) {
                        uzxVar.bo(iJ, unsafe.getLong(obj, jN));
                    }
                    apyyVar = this;
                    break;
                case 17:
                    if (apyyVar.F(obj, i5, i4, i6, i)) {
                        uzxVar.bh(iJ, unsafe.getObject(obj, jN), apyyVar.t(i5));
                    }
                    break;
                case 18:
                    i2 = i4;
                    defpackage.apzf.n(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, false);
                    i4 = i2;
                    break;
                case 19:
                    i2 = i4;
                    defpackage.apzf.o(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, false);
                    i4 = i2;
                    break;
                case 20:
                    i2 = i4;
                    defpackage.apzf.v(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, false);
                    i4 = i2;
                    break;
                case 21:
                    i2 = i4;
                    defpackage.apzf.v(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, false);
                    i4 = i2;
                    break;
                case 22:
                    i2 = i4;
                    defpackage.apzf.s(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, false);
                    i4 = i2;
                    break;
                case 23:
                    i2 = i4;
                    defpackage.apzf.u(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, false);
                    i4 = i2;
                    break;
                case 24:
                    i2 = i4;
                    defpackage.apzf.t(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, false);
                    i4 = i2;
                    break;
                case 25:
                    i2 = i4;
                    defpackage.apzf.m(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, false);
                    i4 = i2;
                    break;
                case 26:
                    i2 = i4;
                    int iJ2 = apyyVar.j(i5);
                    java.util.List list = (java.util.List) unsafe.getObject(obj, jN);
                    java.lang.Class cls = defpackage.apzf.a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof defpackage.apyp) {
                            defpackage.apyp apypVar = (defpackage.apyp) list;
                            for (int i10 = 0; i10 < list.size(); i10++) {
                                java.lang.Object objB = apypVar.b();
                                if (objB instanceof java.lang.String) {
                                    ((defpackage.apxj) uzxVar.a).y(iJ2, (java.lang.String) objB);
                                } else {
                                    ((defpackage.apxj) uzxVar.a).p(iJ2, (defpackage.apxo) objB);
                                }
                            }
                        } else {
                            for (int i11 = 0; i11 < list.size(); i11++) {
                                ((defpackage.apxj) uzxVar.a).y(iJ2, (java.lang.String) list.get(i11));
                            }
                        }
                    }
                    i4 = i2;
                    break;
                case 27:
                    i2 = i4;
                    int iJ3 = apyyVar.j(i5);
                    java.util.List list2 = (java.util.List) unsafe.getObject(obj, jN);
                    defpackage.apze apzeVarT = apyyVar.t(i5);
                    java.lang.Class cls2 = defpackage.apzf.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i12 = 0; i12 < list2.size(); i12++) {
                            uzxVar.bk(iJ3, list2.get(i12), apzeVarT);
                        }
                    }
                    i4 = i2;
                    break;
                case 28:
                    i2 = i4;
                    int iJ4 = apyyVar.j(i5);
                    java.util.List list3 = (java.util.List) unsafe.getObject(obj, jN);
                    java.lang.Class cls3 = defpackage.apzf.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i13 = 0; i13 < list3.size(); i13++) {
                            ((defpackage.apxj) uzxVar.a).p(iJ4, (defpackage.apxo) list3.get(i13));
                        }
                    }
                    i4 = i2;
                    break;
                case 29:
                    i2 = i4;
                    defpackage.apzf.r(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, false);
                    i4 = i2;
                    break;
                case 30:
                    i2 = i4;
                    defpackage.apzf.s(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, false);
                    i4 = i2;
                    break;
                case 31:
                    i2 = i4;
                    defpackage.apzf.t(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, false);
                    i4 = i2;
                    break;
                case 32:
                    i2 = i4;
                    defpackage.apzf.u(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, false);
                    i4 = i2;
                    break;
                case 33:
                    i2 = i4;
                    defpackage.apzf.p(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, false);
                    i4 = i2;
                    break;
                case 34:
                    i2 = i4;
                    defpackage.apzf.q(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, false);
                    i4 = i2;
                    break;
                case 35:
                    i2 = i4;
                    defpackage.apzf.n(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, true);
                    i4 = i2;
                    break;
                case 36:
                    i2 = i4;
                    defpackage.apzf.o(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, true);
                    i4 = i2;
                    break;
                case 37:
                    i2 = i4;
                    defpackage.apzf.v(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, true);
                    i4 = i2;
                    break;
                case 38:
                    i2 = i4;
                    defpackage.apzf.v(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, true);
                    i4 = i2;
                    break;
                case 39:
                    i2 = i4;
                    defpackage.apzf.s(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, true);
                    i4 = i2;
                    break;
                case 40:
                    i2 = i4;
                    defpackage.apzf.u(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, true);
                    i4 = i2;
                    break;
                case 41:
                    i2 = i4;
                    defpackage.apzf.t(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, true);
                    i4 = i2;
                    break;
                case 42:
                    i2 = i4;
                    defpackage.apzf.m(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, true);
                    i4 = i2;
                    break;
                case 43:
                    i2 = i4;
                    defpackage.apzf.r(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, true);
                    i4 = i2;
                    break;
                case 44:
                    i2 = i4;
                    defpackage.apzf.s(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, true);
                    i4 = i2;
                    break;
                case 45:
                    i2 = i4;
                    defpackage.apzf.t(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, true);
                    i4 = i2;
                    break;
                case 46:
                    i2 = i4;
                    defpackage.apzf.u(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, true);
                    i4 = i2;
                    break;
                case 47:
                    i2 = i4;
                    defpackage.apzf.p(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, true);
                    i4 = i2;
                    break;
                case 48:
                    i2 = i4;
                    defpackage.apzf.q(apyyVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), uzxVar, true);
                    i4 = i2;
                    break;
                case 49:
                    i2 = i4;
                    int iJ5 = apyyVar.j(i5);
                    java.util.List list4 = (java.util.List) unsafe.getObject(obj, jN);
                    defpackage.apze apzeVarT2 = apyyVar.t(i5);
                    java.lang.Class cls4 = defpackage.apzf.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i14 = 0; i14 < list4.size(); i14++) {
                            uzxVar.bh(iJ5, list4.get(i14), apzeVarT2);
                        }
                    }
                    i4 = i2;
                    break;
                case 50:
                    java.lang.Object object = unsafe.getObject(obj, jN);
                    if (object != null) {
                        defpackage.apyr apyrVarJ = aoog.j(apyyVar.q(i5));
                        java.lang.Object obj2 = uzxVar.a;
                        java.util.Iterator it = ((defpackage.apys) object).entrySet().iterator();
                        while (it.hasNext()) {
                            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
                            defpackage.apxj apxjVar = (defpackage.apxj) obj2;
                            apxjVar.B((iJ << 3) | 2);
                            apxjVar.B(uzx.aY(apyrVarJ, entry2.getKey(), entry2.getValue()));
                            uzx.aZ(apxjVar, apyrVarJ, entry2.getKey(), entry2.getValue());
                            i4 = i4;
                        }
                    }
                    break;
                case 51:
                    if (apyyVar.J(obj, iJ, i5)) {
                        uzxVar.bc(iJ, ((java.lang.Double) defpackage.apzs.f(obj, jN)).doubleValue());
                    }
                    break;
                case 52:
                    if (apyyVar.J(obj, iJ, i5)) {
                        uzxVar.bg(iJ, ((java.lang.Float) defpackage.apzs.f(obj, jN)).floatValue());
                    }
                    break;
                case 53:
                    if (apyyVar.J(obj, iJ, i5)) {
                        uzxVar.bj(iJ, o(obj, jN));
                    }
                    break;
                case 54:
                    if (apyyVar.J(obj, iJ, i5)) {
                        uzxVar.bq(iJ, o(obj, jN));
                    }
                    break;
                case 55:
                    if (apyyVar.J(obj, iJ, i5)) {
                        uzxVar.bi(iJ, k(obj, jN));
                    }
                    break;
                case 56:
                    if (apyyVar.J(obj, iJ, i5)) {
                        uzxVar.bf(iJ, o(obj, jN));
                    }
                    break;
                case 57:
                    if (apyyVar.J(obj, iJ, i5)) {
                        uzxVar.be(iJ, k(obj, jN));
                    }
                    break;
                case 58:
                    if (apyyVar.J(obj, iJ, i5)) {
                        uzxVar.ba(iJ, ((java.lang.Boolean) defpackage.apzs.f(obj, jN)).booleanValue());
                    }
                    break;
                case 59:
                    if (apyyVar.J(obj, iJ, i5)) {
                        M(iJ, unsafe.getObject(obj, jN), uzxVar);
                    }
                    break;
                case 60:
                    if (apyyVar.J(obj, iJ, i5)) {
                        uzxVar.bk(iJ, unsafe.getObject(obj, jN), apyyVar.t(i5));
                    }
                    break;
                case 61:
                    if (apyyVar.J(obj, iJ, i5)) {
                        uzxVar.bb(iJ, (defpackage.apxo) unsafe.getObject(obj, jN));
                    }
                    break;
                case 62:
                    if (apyyVar.J(obj, iJ, i5)) {
                        uzxVar.bp(iJ, k(obj, jN));
                    }
                    break;
                case 63:
                    if (apyyVar.J(obj, iJ, i5)) {
                        uzxVar.bd(iJ, k(obj, jN));
                    }
                    break;
                case 64:
                    if (apyyVar.J(obj, iJ, i5)) {
                        uzxVar.bl(iJ, k(obj, jN));
                    }
                    break;
                case 65:
                    if (apyyVar.J(obj, iJ, i5)) {
                        uzxVar.bm(iJ, o(obj, jN));
                    }
                    break;
                case 66:
                    if (apyyVar.J(obj, iJ, i5)) {
                        uzxVar.bn(iJ, k(obj, jN));
                    }
                    break;
                case 67:
                    if (apyyVar.J(obj, iJ, i5)) {
                        uzxVar.bo(iJ, o(obj, jN));
                    }
                    break;
                case 68:
                    if (apyyVar.J(obj, iJ, i5)) {
                        uzxVar.bh(iJ, unsafe.getObject(obj, jN), apyyVar.t(i5));
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        if (entry != null) {
            throw null;
        }
        apyyVar.m.c(obj).f(uzxVar);
    }
}
