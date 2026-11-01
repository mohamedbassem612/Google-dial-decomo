package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ehz implements defpackage.eig {
    public static final int[] a = new int[0];
    public static final sun.misc.Unsafe b = defpackage.eit.h();
    private final int[] c;
    private final java.lang.Object[] d;
    private final int e;
    private final int f;
    private final defpackage.ehw g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final defpackage.ein m;

    public ehz(int[] iArr, java.lang.Object[] objArr, int i, int i2, defpackage.ehw ehwVar, int[] iArr2, int i3, int i4, defpackage.ein einVar, defpackage.dzl dzlVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = ehwVar instanceof defpackage.ehg;
        boolean z = false;
        if (dzlVar != null && (ehwVar instanceof defpackage.ehf)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = einVar;
        this.g = ehwVar;
    }

    private final void A(java.lang.Object obj, int i, int i2) {
        defpackage.eit.o(obj, l(i2) & 1048575, i);
    }

    private final void B(java.lang.Object obj, int i, java.lang.Object obj2) {
        b.putObject(obj, n(m(i)), obj2);
        z(obj, i);
    }

    private final void C(java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        b.putObject(obj, n(m(i2)), obj2);
        A(obj, i, i2);
    }

    private final boolean D(java.lang.Object obj, java.lang.Object obj2, int i) {
        return F(obj, i) == F(obj2, i);
    }

    private static boolean E(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean F(java.lang.Object obj, int i) {
        int iL = l(i);
        long j = 1048575 & iL;
        if (j == 1048575) {
            int iM = m(i);
            long jN = n(iM);
            switch ((iM >>> 20) & 255) {
                case 0:
                    if (java.lang.Double.doubleToRawLongBits(defpackage.eit.a(obj, jN)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (java.lang.Float.floatToRawIntBits(defpackage.eit.b(obj, jN)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (defpackage.eit.d(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (defpackage.eit.d(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (defpackage.eit.c(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (defpackage.eit.d(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (defpackage.eit.c(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    return defpackage.eit.s(obj, jN);
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    java.lang.Object objF = defpackage.eit.f(obj, jN);
                    if (objF instanceof java.lang.String) {
                        if (((java.lang.String) objF).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objF instanceof defpackage.egm)) {
                            return L();
                        }
                        if (defpackage.egm.d.equals(objF)) {
                            return false;
                        }
                    }
                case 9:
                    if (defpackage.eit.f(obj, jN) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (defpackage.egm.d.equals(defpackage.eit.f(obj, jN))) {
                        return false;
                    }
                    break;
                case 11:
                    if (defpackage.eit.c(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (defpackage.eit.c(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (defpackage.eit.c(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (defpackage.eit.d(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (defpackage.eit.c(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (defpackage.eit.d(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (defpackage.eit.f(obj, jN) == null) {
                        return false;
                    }
                    break;
                default:
                    return L();
            }
        } else {
            if ((defpackage.eit.c(obj, j) & (1 << (iL >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    private final boolean G(java.lang.Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return F(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean H(java.lang.Object obj, int i, defpackage.eig eigVar) {
        return eigVar.h(defpackage.eit.f(obj, n(i)));
    }

    private static boolean I(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof defpackage.ehg) {
            return ((defpackage.ehg) obj).s();
        }
        return true;
    }

    private final boolean J(java.lang.Object obj, java.lang.Object obj2, int i) {
        long jL = l(i) & 1048575;
        return defpackage.eit.c(obj, jL) == defpackage.eit.c(obj2, jL);
    }

    private final boolean K(java.lang.Object obj, int i, int i2) {
        return defpackage.eit.c(obj, (long) (l(i2) & 1048575)) == i;
    }

    private static final boolean L() {
        throw new java.lang.IllegalArgumentException();
    }

    private static final void M(int i, java.lang.Object obj, defpackage.ipc ipcVar) {
        if (!(obj instanceof java.lang.String)) {
            ipcVar.H(i, (defpackage.egm) obj);
        } else {
            ((defpackage.egv) ipcVar.a).q(i, (java.lang.String) obj);
        }
    }

    private final int j(int i) {
        return this.c[i];
    }

    private static int k(java.lang.Object obj, long j) {
        return ((java.lang.Integer) defpackage.eit.f(obj, j)).intValue();
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
        return ((java.lang.Long) defpackage.eit.f(obj, j)).longValue();
    }

    private final defpackage.ehj p(int i) {
        return (defpackage.ehj) this.d[((i / 3) << 1) + 1];
    }

    private final defpackage.eig q(int i) {
        java.lang.Object[] objArr = this.d;
        int i2 = (i / 3) << 1;
        defpackage.eig eigVar = (defpackage.eig) objArr[i2];
        if (eigVar != null) {
            return eigVar;
        }
        defpackage.eig eigVarB = defpackage.eid.a.b((java.lang.Class) objArr[i2 + 1]);
        objArr[i2] = eigVarB;
        return eigVarB;
    }

    private final java.lang.Object r(java.lang.Object obj, int i, java.lang.Object obj2, defpackage.ein einVar, java.lang.Object obj3) {
        defpackage.ehj ehjVarP;
        int iJ = j(i);
        java.lang.Object objF = defpackage.eit.f(obj, n(m(i)));
        if (objF != null && (ehjVarP = p(i)) != null) {
            defpackage.kgl kglVarP = defpackage.dzl.p(s(i));
            java.util.Iterator it = ((defpackage.eht) objF).entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                ((java.lang.Integer) entry.getValue()).intValue();
                if (!ehjVarP.a()) {
                    if (obj2 == null) {
                        obj2 = einVar.b(obj3);
                    }
                    int iAh = defpackage.ipc.ah(kglVarP, entry.getKey(), entry.getValue());
                    defpackage.egm egmVar = defpackage.egm.d;
                    byte[] bArr = new byte[iAh];
                    egs egsVar = new egs(bArr, iAh);
                    try {
                        defpackage.ipc.ai(egsVar, kglVarP, entry.getKey(), entry.getValue());
                        ((defpackage.eio) obj2).e((iJ << 3) | 2, eav.h(egsVar, bArr));
                        it.remove();
                    } catch (java.io.IOException e) {
                        throw new java.lang.RuntimeException(e);
                    }
                }
            }
        }
        return obj2;
    }

    private final java.lang.Object s(int i) {
        return this.d[(i / 3) << 1];
    }

    private final java.lang.Object t(java.lang.Object obj, int i) {
        defpackage.eig eigVarQ = q(i);
        long jN = n(m(i));
        if (!F(obj, i)) {
            return eigVarQ.c();
        }
        java.lang.Object object = b.getObject(obj, jN);
        if (I(object)) {
            return object;
        }
        java.lang.Object objC = eigVarQ.c();
        if (object != null) {
            eigVarQ.e(objC, object);
        }
        return objC;
    }

    private final java.lang.Object u(java.lang.Object obj, int i, int i2) {
        defpackage.eig eigVarQ = q(i2);
        if (!K(obj, i, i2)) {
            return eigVarQ.c();
        }
        java.lang.Object object = b.getObject(obj, n(m(i2)));
        if (I(object)) {
            return object;
        }
        java.lang.Object objC = eigVarQ.c();
        if (object != null) {
            eigVarQ.e(objC, object);
        }
        return objC;
    }

    private static void v(java.lang.Object obj) {
        if (I(obj)) {
            return;
        }
        java.util.Objects.toString(obj);
        throw new java.lang.IllegalArgumentException("Mutating immutable message: ".concat(java.lang.String.valueOf(obj)));
    }

    private final void w(java.lang.Object obj, java.lang.Object obj2, int i) {
        if (F(obj2, i)) {
            long jN = n(m(i));
            sun.misc.Unsafe unsafe = b;
            java.lang.Object object = unsafe.getObject(obj2, jN);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + j(i) + " is present but null: " + obj2);
            }
            defpackage.eig eigVarQ = q(i);
            if (!F(obj, i)) {
                if (I(object)) {
                    java.lang.Object objC = eigVarQ.c();
                    eigVarQ.e(objC, object);
                    unsafe.putObject(obj, jN, objC);
                } else {
                    unsafe.putObject(obj, jN, object);
                }
                z(obj, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, jN);
            if (!I(object2)) {
                java.lang.Object objC2 = eigVarQ.c();
                eigVarQ.e(objC2, object2);
                unsafe.putObject(obj, jN, objC2);
                object2 = objC2;
            }
            eigVarQ.e(object2, object);
        }
    }

    private final void x(java.lang.Object obj, java.lang.Object obj2, int i) {
        int iJ = j(i);
        if (K(obj2, iJ, i)) {
            long jN = n(m(i));
            sun.misc.Unsafe unsafe = b;
            java.lang.Object object = unsafe.getObject(obj2, jN);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + j(i) + " is present but null: " + obj2);
            }
            defpackage.eig eigVarQ = q(i);
            if (!K(obj, iJ, i)) {
                if (I(object)) {
                    java.lang.Object objC = eigVarQ.c();
                    eigVarQ.e(objC, object);
                    unsafe.putObject(obj, jN, objC);
                } else {
                    unsafe.putObject(obj, jN, object);
                }
                A(obj, iJ, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, jN);
            if (!I(object2)) {
                java.lang.Object objC2 = eigVarQ.c();
                eigVarQ.e(objC2, object2);
                unsafe.putObject(obj, jN, objC2);
                object2 = objC2;
            }
            eigVarQ.e(object2, object);
        }
    }

    private final void y(java.lang.Object obj, int i, defpackage.egr egrVar) {
        if (E(i)) {
            defpackage.eit.q(obj, n(i), egrVar.s());
        } else if (this.i) {
            defpackage.eit.q(obj, n(i), egrVar.r());
        } else {
            defpackage.eit.q(obj, n(i), egrVar.o());
        }
    }

    private final void z(java.lang.Object obj, int i) {
        int iL = l(i);
        long j = 1048575 & iL;
        if (j != 1048575) {
            defpackage.eit.o(obj, j, defpackage.eit.c(obj, j) | (1 << (iL >>> 20)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0459  */
    /* JADX WARN: Code duplicated, block: B:196:0x0546  */
    /* JADX WARN: Code duplicated, block: B:201:0x056b  */
    @Override // defpackage.eig
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
        defpackage.ehz ehzVar = this;
        java.lang.Object obj2 = obj;
        sun.misc.Unsafe unsafe = b;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = ehzVar.c;
            if (i3 >= iArr.length) {
                int iA2 = i5 + ehzVar.m.c(obj2).a();
                if (ehzVar.h) {
                    defpackage.eik eikVar = defpackage.dzl.g(obj2).b;
                    if (eikVar.size() > 0) {
                        eii eiiVarA = eikVar.a(0);
                        aehu aehuVar = eiiVarA.c;
                        java.lang.Object obj3 = eiiVarA.a;
                        throw null;
                    }
                }
                return iA2;
            }
            int iM = ehzVar.m(i3);
            int iJ = ehzVar.j(i3);
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
            if (i9 >= defpackage.ehc.DOUBLE_LIST_PACKED.Z) {
                int i10 = defpackage.ehc.SINT64_LIST_PACKED.Z;
            }
            switch (i9) {
                case 0:
                    if (ehzVar.G(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        i5 += iC;
                    }
                    break;
                case 1:
                    if (ehzVar.G(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + 4;
                        i5 += iNumberOfLeadingZeros4;
                    }
                    ehzVar = this;
                    obj2 = obj;
                    break;
                case 2:
                    if (ehzVar.G(obj2, i3, i6, i4, i)) {
                        iAr = defpackage.a.ar(iJ, unsafe.getLong(obj2, jN));
                        i5 += iAr;
                    }
                    ehzVar = this;
                    break;
                case 3:
                    if (ehzVar.G(obj2, i3, i6, i4, i)) {
                        iAr = defpackage.a.ar(iJ, unsafe.getLong(obj2, jN));
                        i5 += iAr;
                    }
                    ehzVar = this;
                    break;
                case 4:
                    if (ehzVar.G(obj2, i3, i6, i4, i)) {
                        iAr = defpackage.egv.H(iJ, unsafe.getInt(obj2, jN));
                        i5 += iAr;
                    }
                    ehzVar = this;
                    break;
                case 5:
                    if (ehzVar.G(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros3 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros3 * 9)) >>> 6) + 8;
                        i5 += iNumberOfLeadingZeros4;
                    }
                    ehzVar = this;
                    obj2 = obj;
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (ehzVar.G(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + 4;
                        i5 += iNumberOfLeadingZeros4;
                    }
                    ehzVar = this;
                    obj2 = obj;
                    break;
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (ehzVar.G(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros4 = ((352 - (java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) + 1;
                        i5 += iNumberOfLeadingZeros4;
                    }
                    ehzVar = this;
                    obj2 = obj;
                    break;
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    if (ehzVar.G(obj2, i3, i6, i4, i)) {
                        java.lang.Object object = unsafe.getObject(obj2, jN);
                        iAr = object instanceof defpackage.egm ? defpackage.egv.E(iJ, (defpackage.egm) object) : defpackage.egv.J(iJ, (java.lang.String) object);
                        i5 += iAr;
                    }
                    ehzVar = this;
                    break;
                case 9:
                    if (ehzVar.G(obj2, i3, i6, i4, i)) {
                        iC = defpackage.eih.c(iJ, unsafe.getObject(obj2, jN), ehzVar.q(i3));
                        i5 += iC;
                    }
                    break;
                case 10:
                    if (ehzVar.G(obj2, i3, i6, i4, i)) {
                        iAr = defpackage.egv.E(iJ, (defpackage.egm) unsafe.getObject(obj2, jN));
                        i5 += iAr;
                    }
                    ehzVar = this;
                    break;
                case 11:
                    if (ehzVar.G(obj2, i3, i6, i4, i)) {
                        iAr = defpackage.a.au(iJ, unsafe.getInt(obj2, jN));
                        i5 += iAr;
                    }
                    ehzVar = this;
                    break;
                case 12:
                    if (ehzVar.G(obj2, i3, i6, i4, i)) {
                        iAr = defpackage.egv.G(iJ, unsafe.getInt(obj2, jN));
                        i5 += iAr;
                    }
                    ehzVar = this;
                    break;
                case 13:
                    if (ehzVar.G(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + 4;
                        i5 += iNumberOfLeadingZeros4;
                    }
                    ehzVar = this;
                    obj2 = obj;
                    break;
                case 14:
                    if (ehzVar.G(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros3 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros3 * 9)) >>> 6) + 8;
                        i5 += iNumberOfLeadingZeros4;
                    }
                    ehzVar = this;
                    obj2 = obj;
                    break;
                case 15:
                    if (ehzVar.G(obj2, i3, i6, i4, i)) {
                        iAr = defpackage.a.as(iJ, unsafe.getInt(obj2, jN));
                        i5 += iAr;
                    }
                    ehzVar = this;
                    break;
                case 16:
                    if (ehzVar.G(obj2, i3, i6, i4, i)) {
                        iAr = defpackage.a.at(iJ, unsafe.getLong(obj2, jN));
                        i5 += iAr;
                    }
                    ehzVar = this;
                    break;
                case 17:
                    if (ehzVar.G(obj2, i3, i6, i4, i)) {
                        iC = defpackage.eih.a(iJ, (defpackage.ehw) unsafe.getObject(obj2, jN), ehzVar.q(i3));
                        i5 += iC;
                    }
                    break;
                case 18:
                    java.util.List list = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls = defpackage.eih.a;
                    iC = defpackage.a.ap(iJ, list);
                    i5 += iC;
                    break;
                case 19:
                    java.util.List list2 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls2 = defpackage.eih.a;
                    iC = defpackage.a.ao(iJ, list2);
                    i5 += iC;
                    break;
                case 20:
                    java.util.List list3 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls3 = defpackage.eih.a;
                    if (list3.size() == 0) {
                        iNumberOfLeadingZeros8 = 0;
                    } else {
                        iK = defpackage.eih.k(list3);
                        size = list3.size() * ((352 - (java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                    }
                    i5 += iNumberOfLeadingZeros8;
                    break;
                case 21:
                    java.util.List list4 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls4 = defpackage.eih.a;
                    size2 = list4.size();
                    if (size2 == 0) {
                        iC = 0;
                    } else {
                        iK2 = defpackage.eih.k(list4);
                        iNumberOfLeadingZeros5 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    }
                    i5 += iC;
                    break;
                case 22:
                    java.util.List list5 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls5 = defpackage.eih.a;
                    size2 = list5.size();
                    if (size2 != 0) {
                        iK2 = defpackage.eih.j(list5);
                        iNumberOfLeadingZeros5 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i5 += iC;
                    break;
                case 23:
                    java.util.List list6 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls6 = defpackage.eih.a;
                    iC = defpackage.a.ap(iJ, list6);
                    i5 += iC;
                    break;
                case 24:
                    java.util.List list7 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls7 = defpackage.eih.a;
                    iC = defpackage.a.ao(iJ, list7);
                    i5 += iC;
                    break;
                case 25:
                    java.util.List list8 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls8 = defpackage.eih.a;
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
                    java.lang.Class cls9 = defpackage.eih.a;
                    int size4 = list9.size();
                    if (size4 == 0) {
                        iNumberOfLeadingZeros6 = 0;
                    } else {
                        boolean z = list9 instanceof defpackage.ehr;
                        iNumberOfLeadingZeros6 = ((352 - (java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) * size4;
                        if (z) {
                            defpackage.ehr ehrVar = (defpackage.ehr) list9;
                            for (int i11 = 0; i11 < size4; i11++) {
                                java.lang.Object objC = ehrVar.c();
                                iNumberOfLeadingZeros6 += objC instanceof defpackage.egm ? defpackage.egv.F((defpackage.egm) objC) : defpackage.egv.K((java.lang.String) objC);
                            }
                        } else {
                            for (int i12 = 0; i12 < size4; i12++) {
                                java.lang.Object obj4 = list9.get(i12);
                                iNumberOfLeadingZeros6 += obj4 instanceof defpackage.egm ? defpackage.egv.F((defpackage.egm) obj4) : defpackage.egv.K((java.lang.String) obj4);
                            }
                        }
                    }
                    i5 += iNumberOfLeadingZeros6;
                    break;
                case 27:
                    java.util.List list10 = (java.util.List) unsafe.getObject(obj2, jN);
                    defpackage.eig eigVarQ = ehzVar.q(i3);
                    java.lang.Class cls10 = defpackage.eih.a;
                    int size5 = list10.size();
                    if (size5 == 0) {
                        iNumberOfLeadingZeros7 = 0;
                    } else {
                        iNumberOfLeadingZeros7 = ((352 - (java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) * size5;
                        for (int i13 = 0; i13 < size5; i13++) {
                            java.lang.Object obj5 = list10.get(i13);
                            iNumberOfLeadingZeros7 += obj5 instanceof defpackage.ehq ? ((defpackage.ehq) obj5).a() : defpackage.eih.b((defpackage.egb) obj5, eigVarQ);
                        }
                    }
                    i5 += iNumberOfLeadingZeros7;
                    break;
                case 28:
                    java.util.List list11 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls11 = defpackage.eih.a;
                    int size6 = list11.size();
                    if (size6 != 0) {
                        iNumberOfLeadingZeros8 = size6 * ((352 - (java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6);
                        for (int i14 = 0; i14 < list11.size(); i14++) {
                            iNumberOfLeadingZeros8 += defpackage.egv.F((defpackage.egm) list11.get(i14));
                        }
                    } else {
                        iNumberOfLeadingZeros8 = 0;
                    }
                    i5 += iNumberOfLeadingZeros8;
                    break;
                case 29:
                    java.util.List list12 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls12 = defpackage.eih.a;
                    size2 = list12.size();
                    if (size2 != 0) {
                        iK2 = defpackage.eih.f(list12);
                        iNumberOfLeadingZeros5 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i5 += iC;
                    break;
                case 30:
                    java.util.List list13 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls13 = defpackage.eih.a;
                    size2 = list13.size();
                    if (size2 != 0) {
                        iK2 = defpackage.eih.j(list13);
                        iNumberOfLeadingZeros5 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i5 += iC;
                    break;
                case 31:
                    java.util.List list14 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls14 = defpackage.eih.a;
                    iC = defpackage.a.ao(iJ, list14);
                    i5 += iC;
                    break;
                case 32:
                    java.util.List list15 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls15 = defpackage.eih.a;
                    iC = defpackage.a.ap(iJ, list15);
                    i5 += iC;
                    break;
                case 33:
                    java.util.List list16 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls16 = defpackage.eih.a;
                    size2 = list16.size();
                    if (size2 != 0) {
                        iK2 = defpackage.eih.d(list16);
                        iNumberOfLeadingZeros5 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i5 += iC;
                    break;
                case 34:
                    java.util.List list17 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls17 = defpackage.eih.a;
                    size2 = list17.size();
                    if (size2 != 0) {
                        iK2 = defpackage.eih.e(list17);
                        iNumberOfLeadingZeros5 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i5 += iC;
                    break;
                case 35:
                    java.util.List list18 = (java.util.List) unsafe.getObject(obj2, jN);
                    java.lang.Class cls18 = defpackage.eih.a;
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
                    java.lang.Class cls19 = defpackage.eih.a;
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
                    size = defpackage.eih.k((java.util.List) unsafe.getObject(obj2, jN));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 38:
                    size = defpackage.eih.k((java.util.List) unsafe.getObject(obj2, jN));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 39:
                    size = defpackage.eih.j((java.util.List) unsafe.getObject(obj2, jN));
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
                    java.lang.Class cls20 = defpackage.eih.a;
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
                    java.lang.Class cls21 = defpackage.eih.a;
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
                    java.lang.Class cls22 = defpackage.eih.a;
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
                    size = defpackage.eih.f((java.util.List) unsafe.getObject(obj2, jN));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 44:
                    size = defpackage.eih.j((java.util.List) unsafe.getObject(obj2, jN));
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
                    java.lang.Class cls23 = defpackage.eih.a;
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
                    java.lang.Class cls24 = defpackage.eih.a;
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
                    size = defpackage.eih.d((java.util.List) unsafe.getObject(obj2, jN));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 48:
                    size = defpackage.eih.e((java.util.List) unsafe.getObject(obj2, jN));
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
                    defpackage.eig eigVarQ2 = ehzVar.q(i3);
                    java.lang.Class cls25 = defpackage.eih.a;
                    int size7 = list25.size();
                    if (size7 == 0) {
                        iA = 0;
                    } else {
                        iA = 0;
                        for (int i15 = 0; i15 < size7; i15++) {
                            iA += defpackage.eih.a(iJ, (defpackage.ehw) list25.get(i15), eigVarQ2);
                        }
                    }
                    i5 += iA;
                    break;
                case 50:
                    defpackage.eht ehtVar = (defpackage.eht) unsafe.getObject(obj2, jN);
                    defpackage.ipc ipcVar = (defpackage.ipc) ehzVar.s(i3);
                    if (ehtVar.isEmpty()) {
                        iNumberOfLeadingZeros7 = 0;
                    } else {
                        iNumberOfLeadingZeros7 = 0;
                        for (java.util.Map.Entry entry : ehtVar.entrySet()) {
                            java.lang.Object key = entry.getKey();
                            java.lang.Object value = entry.getValue();
                            int iNumberOfLeadingZeros12 = java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9;
                            int iAh = defpackage.ipc.ah((defpackage.kgl) ipcVar.a, key, value);
                            iNumberOfLeadingZeros7 += ((352 - iNumberOfLeadingZeros12) >>> 6) + ((352 - (java.lang.Integer.numberOfLeadingZeros(iAh) * 9)) >>> 6) + iAh;
                        }
                    }
                    i5 += iNumberOfLeadingZeros7;
                    break;
                case 51:
                    if (ehzVar.K(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        i5 += iC;
                    }
                    break;
                case 52:
                    if (ehzVar.K(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros11 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6) + 4;
                        i5 += iC;
                    }
                    break;
                case 53:
                    if (ehzVar.K(obj2, iJ, i3)) {
                        iC = defpackage.a.ar(iJ, o(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 54:
                    if (ehzVar.K(obj2, iJ, i3)) {
                        iC = defpackage.a.ar(iJ, o(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 55:
                    if (ehzVar.K(obj2, iJ, i3)) {
                        iC = defpackage.egv.H(iJ, k(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 56:
                    if (ehzVar.K(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        i5 += iC;
                    }
                    break;
                case 57:
                    if (ehzVar.K(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros11 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6) + 4;
                        i5 += iC;
                    }
                    break;
                case 58:
                    if (ehzVar.K(obj2, iJ, i3)) {
                        iC = ((352 - (java.lang.Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) + 1;
                        i5 += iC;
                    }
                    break;
                case 59:
                    if (ehzVar.K(obj2, iJ, i3)) {
                        java.lang.Object object2 = unsafe.getObject(obj2, jN);
                        iC = object2 instanceof defpackage.egm ? defpackage.egv.E(iJ, (defpackage.egm) object2) : defpackage.egv.J(iJ, (java.lang.String) object2);
                        i5 += iC;
                    }
                    break;
                case 60:
                    if (ehzVar.K(obj2, iJ, i3)) {
                        iC = defpackage.eih.c(iJ, unsafe.getObject(obj2, jN), ehzVar.q(i3));
                        i5 += iC;
                    }
                    break;
                case 61:
                    if (ehzVar.K(obj2, iJ, i3)) {
                        iC = defpackage.egv.E(iJ, (defpackage.egm) unsafe.getObject(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 62:
                    if (ehzVar.K(obj2, iJ, i3)) {
                        iC = defpackage.a.au(iJ, k(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 63:
                    if (ehzVar.K(obj2, iJ, i3)) {
                        iC = defpackage.egv.G(iJ, k(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 64:
                    if (ehzVar.K(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros11 = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6) + 4;
                        i5 += iC;
                    }
                    break;
                case 65:
                    if (ehzVar.K(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        i5 += iC;
                    }
                    break;
                case 66:
                    if (ehzVar.K(obj2, iJ, i3)) {
                        iC = defpackage.a.as(iJ, k(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 67:
                    if (ehzVar.K(obj2, iJ, i3)) {
                        iC = defpackage.a.at(iJ, o(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 68:
                    if (ehzVar.K(obj2, iJ, i3)) {
                        iC = defpackage.eih.a(iJ, (defpackage.ehw) unsafe.getObject(obj2, jN), ehzVar.q(i3));
                        i5 += iC;
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
    }

    @Override // defpackage.eig
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
                        long jDoubleToLongBits = java.lang.Double.doubleToLongBits(defpackage.eit.a(obj, jN));
                        byte[] bArr = defpackage.ehl.a;
                        iM2 = defpackage.anty.M(jDoubleToLongBits);
                        break;
                    case 1:
                        i = iHashCode * 53;
                        iM2 = java.lang.Float.floatToIntBits(defpackage.eit.b(obj, jN));
                        break;
                    case 2:
                        i = iHashCode * 53;
                        long jD = defpackage.eit.d(obj, jN);
                        byte[] bArr2 = defpackage.ehl.a;
                        iM2 = defpackage.anty.M(jD);
                        break;
                    case 3:
                        i = iHashCode * 53;
                        long jD2 = defpackage.eit.d(obj, jN);
                        byte[] bArr3 = defpackage.ehl.a;
                        iM2 = defpackage.anty.M(jD2);
                        break;
                    case 4:
                        i = iHashCode * 53;
                        iM2 = defpackage.eit.c(obj, jN);
                        break;
                    case 5:
                        i = iHashCode * 53;
                        long jD3 = defpackage.eit.d(obj, jN);
                        byte[] bArr4 = defpackage.ehl.a;
                        iM2 = defpackage.anty.M(jD3);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        i = iHashCode * 53;
                        iM2 = defpackage.eit.c(obj, jN);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        i = iHashCode * 53;
                        boolean zS = defpackage.eit.s(obj, jN);
                        byte[] bArr5 = defpackage.ehl.a;
                        iM2 = defpackage.anty.L(zS);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        i = iHashCode * 53;
                        iM2 = ((java.lang.String) defpackage.eit.f(obj, jN)).hashCode();
                        break;
                    case 9:
                        i = iHashCode * 53;
                        java.lang.Object objF = defpackage.eit.f(obj, jN);
                        if (objF != null) {
                            iM2 = objF.hashCode();
                        }
                        break;
                    case 10:
                        i = iHashCode * 53;
                        iM2 = defpackage.eit.f(obj, jN).hashCode();
                        break;
                    case 11:
                        i = iHashCode * 53;
                        iM2 = defpackage.eit.c(obj, jN);
                        break;
                    case 12:
                        i = iHashCode * 53;
                        iM2 = defpackage.eit.c(obj, jN);
                        break;
                    case 13:
                        i = iHashCode * 53;
                        iM2 = defpackage.eit.c(obj, jN);
                        break;
                    case 14:
                        i = iHashCode * 53;
                        long jD4 = defpackage.eit.d(obj, jN);
                        byte[] bArr6 = defpackage.ehl.a;
                        iM2 = defpackage.anty.M(jD4);
                        break;
                    case 15:
                        i = iHashCode * 53;
                        iM2 = defpackage.eit.c(obj, jN);
                        break;
                    case 16:
                        i = iHashCode * 53;
                        long jD5 = defpackage.eit.d(obj, jN);
                        byte[] bArr7 = defpackage.ehl.a;
                        iM2 = defpackage.anty.M(jD5);
                        break;
                    case 17:
                        i = iHashCode * 53;
                        java.lang.Object objF2 = defpackage.eit.f(obj, jN);
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
                        iM2 = defpackage.eit.f(obj, jN).hashCode();
                        break;
                    case 50:
                        i = iHashCode * 53;
                        iM2 = defpackage.eit.f(obj, jN).hashCode();
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
                return this.h ? (iHashCode2 * 53) + defpackage.dzl.g(obj).hashCode() : iHashCode2;
            }
            int i5 = iArr[i4];
            if (!K(obj, 0, i5)) {
                iHashCode = (iHashCode * 53) + defpackage.eit.f(obj, n(m(i5))).hashCode();
            }
            i4++;
        }
    }

    @Override // defpackage.eig
    public final java.lang.Object c() {
        return ((defpackage.ehg) this.g).l();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f A[SYNTHETIC] */
    @Override // defpackage.eig
    public final void d(java.lang.Object obj) {
        if (I(obj)) {
            if (obj instanceof defpackage.ehg) {
                defpackage.ehg ehgVar = (defpackage.ehg) obj;
                ehgVar.q(Integer.MAX_VALUE);
                ehgVar.memoizedHashCode = 0;
                ehgVar.o();
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
                                if (F(obj, i)) {
                                    q(i).d(b.getObject(obj, jN));
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
                                defpackage.dzl.e(obj, jN).b();
                                break;
                            case 50:
                                sun.misc.Unsafe unsafe = b;
                                java.lang.Object object = unsafe.getObject(obj, jN);
                                if (object != null) {
                                    ((defpackage.eht) object).c();
                                    unsafe.putObject(obj, jN, object);
                                }
                                break;
                        }
                    } else if (K(obj, j(i), i)) {
                        q(i).d(b.getObject(obj, jN));
                    }
                } else if (F(obj, i)) {
                    q(i).d(b.getObject(obj, jN));
                }
            }
            this.m.e(obj);
            if (this.h) {
                defpackage.dzl.i(obj);
            }
        }
    }

    @Override // defpackage.eig
    public final void e(java.lang.Object obj, java.lang.Object obj2) {
        v(obj);
        defpackage.ehl.a(obj2);
        for (int i = 0; i < this.c.length; i += 3) {
            int iM = m(i);
            long jN = n(iM);
            int iJ = j(i);
            switch ((iM >>> 20) & 255) {
                case 0:
                    if (F(obj2, i)) {
                        defpackage.eit.m(obj, jN, defpackage.eit.a(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 1:
                    if (F(obj2, i)) {
                        defpackage.eit.n(obj, jN, defpackage.eit.b(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 2:
                    if (F(obj2, i)) {
                        defpackage.eit.p(obj, jN, defpackage.eit.d(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 3:
                    if (F(obj2, i)) {
                        defpackage.eit.p(obj, jN, defpackage.eit.d(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 4:
                    if (F(obj2, i)) {
                        defpackage.eit.o(obj, jN, defpackage.eit.c(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 5:
                    if (F(obj2, i)) {
                        defpackage.eit.p(obj, jN, defpackage.eit.d(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (F(obj2, i)) {
                        defpackage.eit.o(obj, jN, defpackage.eit.c(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (F(obj2, i)) {
                        defpackage.eit.j(obj, jN, defpackage.eit.s(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    if (F(obj2, i)) {
                        defpackage.eit.q(obj, jN, defpackage.eit.f(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 9:
                    w(obj, obj2, i);
                    break;
                case 10:
                    if (F(obj2, i)) {
                        defpackage.eit.q(obj, jN, defpackage.eit.f(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 11:
                    if (F(obj2, i)) {
                        defpackage.eit.o(obj, jN, defpackage.eit.c(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 12:
                    if (F(obj2, i)) {
                        defpackage.eit.o(obj, jN, defpackage.eit.c(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 13:
                    if (F(obj2, i)) {
                        defpackage.eit.o(obj, jN, defpackage.eit.c(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 14:
                    if (F(obj2, i)) {
                        defpackage.eit.p(obj, jN, defpackage.eit.d(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 15:
                    if (F(obj2, i)) {
                        defpackage.eit.o(obj, jN, defpackage.eit.c(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 16:
                    if (F(obj2, i)) {
                        defpackage.eit.p(obj, jN, defpackage.eit.d(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 17:
                    w(obj, obj2, i);
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
                    defpackage.ehk ehkVarE = defpackage.dzl.e(obj, jN);
                    defpackage.ehk ehkVarE2 = defpackage.dzl.e(obj2, jN);
                    int size = ehkVarE.size();
                    int size2 = ehkVarE2.size();
                    if (size > 0 && size2 > 0) {
                        if (!ehkVarE.c()) {
                            ehkVarE = ehkVarE.d(size2 + size);
                        }
                        ehkVarE.addAll(ehkVarE2);
                    }
                    if (size > 0) {
                        ehkVarE2 = ehkVarE;
                    }
                    defpackage.eit.q(obj, jN, ehkVarE2);
                    break;
                case 50:
                    java.lang.Class cls = defpackage.eih.a;
                    defpackage.eit.q(obj, jN, defpackage.dzl.c(defpackage.eit.f(obj, jN), defpackage.eit.f(obj2, jN)));
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
                    if (K(obj2, iJ, i)) {
                        defpackage.eit.q(obj, jN, defpackage.eit.f(obj2, jN));
                        A(obj, iJ, i);
                    }
                    break;
                case 60:
                    x(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (K(obj2, iJ, i)) {
                        defpackage.eit.q(obj, jN, defpackage.eit.f(obj2, jN));
                        A(obj, iJ, i);
                    }
                    break;
                case 68:
                    x(obj, obj2, i);
                    break;
            }
        }
        defpackage.eih.i(this.m, obj, obj2);
        if (this.h) {
            defpackage.eih.l(obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:221:0x06ad A[LOOP:3: B:219:0x06a9->B:221:0x06ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:223:0x06be  */
    /* JADX WARN: Code duplicated, block: B:234:0x06d4 A[LOOP:4: B:232:0x06d0->B:234:0x06d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:237:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:240:0x069a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x06a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [ehz] */
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
    /* JADX WARN: Type inference failed for: r1v0, types: [ehz] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ehz] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [ehz] */
    /* JADX WARN: Type inference failed for: r1v28, types: [ehz] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ehz] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [ehz] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v73, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v10, types: [ein] */
    /* JADX WARN: Type inference failed for: r5v20, types: [ein] */
    /* JADX WARN: Type inference failed for: r5v22, types: [ein] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ein] */
    /* JADX WARN: Type inference failed for: r5v5, types: [ein] */
    /* JADX WARN: Type inference failed for: r5v6, types: [ein] */
    /* JADX WARN: Type inference failed for: r6v0, types: [ein] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [ein] */
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
    @Override // defpackage.eig
    public final void f(java.lang.Object obj, defpackage.egr egrVar, defpackage.egz egzVar) throws java.lang.Throwable {
        ?? r2;
        int i;
        java.lang.Object objR;
        ?? r6;
        ?? r1;
        ?? r5;
        ?? r13;
        java.lang.Object objR2;
        ?? r7;
        int i2;
        ?? r3 = this;
        defpackage.ehl.a(egzVar);
        v(obj);
        ?? r8 = r3.m;
        java.lang.Object objB = null;
        while (true) {
            try {
                int iC = egrVar.c();
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
                                defpackage.eit.m(obj, n(iM), egrVar.a());
                                r13.z(obj, i3);
                                r3 = r13;
                                break;
                            case 1:
                                defpackage.eit.n(obj, n(iM), egrVar.b());
                                r13.z(obj, i3);
                                r3 = r13;
                                break;
                            case 2:
                                defpackage.eit.p(obj, n(iM), egrVar.k());
                                r13.z(obj, i3);
                                r3 = r13;
                                break;
                            case 3:
                                defpackage.eit.p(obj, n(iM), egrVar.n());
                                r13.z(obj, i3);
                                r3 = r13;
                                break;
                            case 4:
                                defpackage.eit.o(obj, n(iM), egrVar.f());
                                r13.z(obj, i3);
                                r3 = r13;
                                break;
                            case 5:
                                defpackage.eit.p(obj, n(iM), egrVar.j());
                                r13.z(obj, i3);
                                r3 = r13;
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                defpackage.eit.o(obj, n(iM), egrVar.e());
                                r13.z(obj, i3);
                                r3 = r13;
                                break;
                            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                                defpackage.eit.j(obj, n(iM), egrVar.M());
                                r13.z(obj, i3);
                                r3 = r13;
                                break;
                            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                                r13.y(obj, iM, egrVar);
                                r13.z(obj, i3);
                                r3 = r13;
                                break;
                            case 9:
                                defpackage.ehw ehwVar = (defpackage.ehw) r13.t(obj, i3);
                                egrVar.v(ehwVar, r13.q(i3), egzVar);
                                r13.B(obj, i3, ehwVar);
                                r3 = r13;
                                break;
                            case 10:
                                defpackage.eit.q(obj, n(iM), egrVar.o());
                                r13.z(obj, i3);
                                r3 = r13;
                                break;
                            case 11:
                                defpackage.eit.o(obj, n(iM), egrVar.i());
                                r13.z(obj, i3);
                                r3 = r13;
                                break;
                            case 12:
                                int iD = egrVar.d();
                                defpackage.ehj ehjVarP = r13.p(i3);
                                if (ehjVarP == null || ehjVarP.a()) {
                                    defpackage.eit.o(obj, n(iM), iD);
                                    r13.z(obj, i3);
                                } else {
                                    objB = defpackage.eih.h(obj, iC, iD, objB, r8);
                                }
                                r3 = r13;
                                break;
                            case 13:
                                defpackage.eit.o(obj, n(iM), egrVar.g());
                                r13.z(obj, i3);
                                r3 = r13;
                                break;
                            case 14:
                                defpackage.eit.p(obj, n(iM), egrVar.l());
                                r13.z(obj, i3);
                                r3 = r13;
                                break;
                            case 15:
                                defpackage.eit.o(obj, n(iM), egrVar.h());
                                r13.z(obj, i3);
                                r3 = r13;
                                break;
                            case 16:
                                defpackage.eit.p(obj, n(iM), egrVar.m());
                                r13.z(obj, i3);
                                r3 = r13;
                                break;
                            case 17:
                                defpackage.ehw ehwVar2 = (defpackage.ehw) r13.t(obj, i3);
                                egrVar.t(ehwVar2, r13.q(i3), egzVar);
                                r13.B(obj, i3, ehwVar2);
                                r3 = r13;
                                break;
                            case 18:
                                egrVar.x(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 19:
                                egrVar.B(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 20:
                                egrVar.D(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 21:
                                egrVar.K(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 22:
                                egrVar.C(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 23:
                                egrVar.A(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 24:
                                egrVar.z(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 25:
                                egrVar.w(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 26:
                                if (E(iM)) {
                                    egrVar.I(defpackage.dzl.f(obj, n(iM)), true);
                                } else {
                                    egrVar.I(defpackage.dzl.f(obj, n(iM)), false);
                                }
                                r3 = r13;
                                break;
                            case 27:
                                defpackage.eig eigVarQ = r13.q(i3);
                                java.util.List listF = defpackage.dzl.f(obj, n(iM));
                                int i7 = egrVar.b;
                                if ((i7 & 7) != 2) {
                                    throw new defpackage.ehn();
                                }
                                while (true) {
                                    listF.add(egrVar.q(eigVarQ, egzVar));
                                    defpackage.egq egqVar = egrVar.a;
                                    if (!egqVar.A() && egrVar.c == 0) {
                                        int iM2 = egqVar.m();
                                        if (iM2 != i7) {
                                            egrVar.c = iM2;
                                        }
                                    }
                                }
                                r3 = r13;
                                break;
                                break;
                            case 28:
                                java.util.List listF2 = defpackage.dzl.f(obj, n(iM));
                                if ((egrVar.b & 7) != 2) {
                                    throw new defpackage.ehn();
                                }
                                while (true) {
                                    listF2.add(egrVar.o());
                                    defpackage.egq egqVar2 = egrVar.a;
                                    if (!egqVar2.A()) {
                                        int iM3 = egqVar2.m();
                                        if (iM3 != egrVar.b) {
                                            egrVar.c = iM3;
                                        }
                                    }
                                }
                                r3 = r13;
                                break;
                                break;
                            case 29:
                                egrVar.J(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 30:
                                java.util.List listF3 = defpackage.dzl.f(obj, n(iM));
                                egrVar.y(listF3);
                                objB = defpackage.eih.g(obj, iC, listF3, r13.p(i3), objB, r8);
                                r3 = r13;
                                break;
                            case 31:
                                egrVar.E(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 32:
                                egrVar.F(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 33:
                                egrVar.G(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 34:
                                egrVar.H(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 35:
                                egrVar.x(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 36:
                                egrVar.B(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 37:
                                egrVar.D(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 38:
                                egrVar.K(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 39:
                                egrVar.C(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 40:
                                egrVar.A(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 41:
                                egrVar.z(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 42:
                                egrVar.w(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 43:
                                egrVar.J(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 44:
                                java.util.List listF4 = defpackage.dzl.f(obj, n(iM));
                                egrVar.y(listF4);
                                objB = defpackage.eih.g(obj, iC, listF4, r13.p(i3), objB, r8);
                                r3 = r13;
                                break;
                            case 45:
                                egrVar.E(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 46:
                                egrVar.F(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 47:
                                egrVar.G(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 48:
                                egrVar.H(defpackage.dzl.f(obj, n(iM)));
                                r3 = r13;
                                break;
                            case 49:
                                long jN = n(iM);
                                defpackage.eig eigVarQ2 = r13.q(i3);
                                java.util.List listF5 = defpackage.dzl.f(obj, jN);
                                int i8 = egrVar.b;
                                if ((i8 & 7) != 3) {
                                    throw new defpackage.ehn();
                                }
                                while (true) {
                                    java.lang.Object objC = eigVarQ2.c();
                                    egrVar.u(objC, eigVarQ2, egzVar);
                                    eigVarQ2.d(objC);
                                    listF5.add(objC);
                                    defpackage.egq egqVar3 = egrVar.a;
                                    if (!egqVar3.A() && egrVar.c == 0) {
                                        int iM4 = egqVar3.m();
                                        if (iM4 != i8) {
                                            egrVar.c = iM4;
                                        }
                                    }
                                }
                                r3 = r13;
                                break;
                                break;
                            case 50:
                                java.lang.Object objS = r13.s(i3);
                                long jN2 = n(r13.m(i3));
                                java.lang.Object objF = defpackage.eit.f(obj, jN2);
                                if (objF == null) {
                                    objF = defpackage.dzl.d();
                                    defpackage.eit.q(obj, jN2, objF);
                                } else if (!((defpackage.eht) objF).b) {
                                    java.lang.Object objD = defpackage.dzl.d();
                                    defpackage.dzl.c(objD, objF);
                                    defpackage.eit.q(obj, jN2, objD);
                                    objF = objD;
                                }
                                defpackage.eht ehtVar = (defpackage.eht) objF;
                                defpackage.kgl kglVarP = defpackage.dzl.p(objS);
                                egrVar.L(2);
                                defpackage.egq egqVar4 = egrVar.a;
                                int iE = egqVar4.e(egqVar4.n());
                                java.lang.Object obj2 = kglVarP.d;
                                java.lang.Object obj3 = kglVarP.b;
                                java.lang.Object objP = obj2;
                                java.lang.Object objP2 = obj3;
                                while (true) {
                                    try {
                                        int iC2 = egrVar.c();
                                        if (iC2 != i6 && !egqVar4.A()) {
                                            if (iC2 == 1) {
                                                objP = egrVar.p((defpackage.eja) kglVarP.a, null, null);
                                            } else if (iC2 != 2) {
                                                try {
                                                    if (!egrVar.N()) {
                                                        throw new defpackage.eho("Unable to parse map entry.");
                                                    }
                                                    continue;
                                                } catch (defpackage.ehn e) {
                                                    if (!egrVar.N()) {
                                                        throw new defpackage.eho(e, null);
                                                    }
                                                }
                                            } else {
                                                objP2 = egrVar.p((defpackage.eja) kglVarP.c, obj3.getClass(), egzVar);
                                            }
                                            i6 = Integer.MAX_VALUE;
                                        }
                                    } catch (java.lang.Throwable th) {
                                        egrVar.a.y(iE);
                                        throw th;
                                    }
                                }
                                ehtVar.put(objP, objP2);
                                egrVar.a.y(iE);
                                r3 = r13;
                                break;
                            case 51:
                                defpackage.eit.q(obj, n(iM), java.lang.Double.valueOf(egrVar.a()));
                                r13.A(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 52:
                                defpackage.eit.q(obj, n(iM), java.lang.Float.valueOf(egrVar.b()));
                                r13.A(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 53:
                                defpackage.eit.q(obj, n(iM), java.lang.Long.valueOf(egrVar.k()));
                                r13.A(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 54:
                                defpackage.eit.q(obj, n(iM), java.lang.Long.valueOf(egrVar.n()));
                                r13.A(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 55:
                                defpackage.eit.q(obj, n(iM), java.lang.Integer.valueOf(egrVar.f()));
                                r13.A(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 56:
                                defpackage.eit.q(obj, n(iM), java.lang.Long.valueOf(egrVar.j()));
                                r13.A(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 57:
                                defpackage.eit.q(obj, n(iM), java.lang.Integer.valueOf(egrVar.e()));
                                r13.A(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 58:
                                defpackage.eit.q(obj, n(iM), java.lang.Boolean.valueOf(egrVar.M()));
                                r13.A(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 59:
                                r13.y(obj, iM, egrVar);
                                r13.A(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 60:
                                defpackage.ehw ehwVar3 = (defpackage.ehw) r13.u(obj, iC, i3);
                                egrVar.v(ehwVar3, r13.q(i3), egzVar);
                                r13.C(obj, iC, i3, ehwVar3);
                                r3 = r13;
                                break;
                            case 61:
                                defpackage.eit.q(obj, n(iM), egrVar.o());
                                r13.A(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 62:
                                defpackage.eit.q(obj, n(iM), java.lang.Integer.valueOf(egrVar.i()));
                                r13.A(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 63:
                                int iD2 = egrVar.d();
                                defpackage.ehj ehjVarP2 = r13.p(i3);
                                if (ehjVarP2 == null || ehjVarP2.a()) {
                                    defpackage.eit.q(obj, n(iM), java.lang.Integer.valueOf(iD2));
                                    r13.A(obj, iC, i3);
                                } else {
                                    objB = defpackage.eih.h(obj, iC, iD2, objB, r8);
                                }
                                r3 = r13;
                                break;
                            case 64:
                                defpackage.eit.q(obj, n(iM), java.lang.Integer.valueOf(egrVar.g()));
                                r13.A(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 65:
                                defpackage.eit.q(obj, n(iM), java.lang.Long.valueOf(egrVar.l()));
                                r13.A(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 66:
                                defpackage.eit.q(obj, n(iM), java.lang.Integer.valueOf(egrVar.h()));
                                r13.A(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 67:
                                defpackage.eit.q(obj, n(iM), java.lang.Long.valueOf(egrVar.m()));
                                r13.A(obj, iC, i3);
                                r3 = r13;
                                break;
                            case 68:
                                try {
                                    defpackage.ehw ehwVar4 = (defpackage.ehw) r13.u(obj, iC, i3);
                                    egrVar.t(ehwVar4, r13.q(i3), egzVar);
                                    r13.C(obj, iC, i3, ehwVar4);
                                    r3 = r13;
                                } catch (defpackage.ehn unused) {
                                    r2 = obj;
                                    r3 = r13;
                                    if (objB == null) {
                                        try {
                                            objB = r8.b(r2);
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                    if (!r8.a(objB, egrVar, 0)) {
                                        objR2 = objB;
                                        r7 = r8;
                                        for (i2 = r3.k; i2 < r3.l; i2++) {
                                            ?? r9 = r7;
                                            objR2 = r3.r(r2, r3.j[i2], objR2, r9, obj);
                                            r7 = r9;
                                        }
                                        if (objR2 != null) {
                                            r7.f(r2, (defpackage.eio) objR2);
                                        }
                                    }
                                }
                                break;
                            default:
                                r2 = obj;
                                if (objB == null) {
                                    try {
                                        objB = r8.b(r2);
                                    } catch (defpackage.ehn unused2) {
                                        r3 = r13;
                                        if (objB == null) {
                                            objB = r8.b(r2);
                                        }
                                        if (!r8.a(objB, egrVar, 0)) {
                                            objR2 = objB;
                                            r7 = r8;
                                            while (i2 < r3.l) {
                                                ?? r10 = r7;
                                                objR2 = r3.r(r2, r3.j[i2], objR2, r10, obj);
                                                r7 = r10;
                                            }
                                            if (objR2 != null) {
                                                r7.f(r2, (defpackage.eio) objR2);
                                            }
                                        }
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        r3 = r13;
                                        i = r3.k;
                                        objR = objB;
                                        r1 = r3;
                                        r6 = r8;
                                        while (i < r1.l) {
                                            ?? r11 = r6;
                                            objR = r1.r(r2, r1.j[i], objR, r11, obj);
                                            i++;
                                            r1 = this;
                                            r6 = r11;
                                        }
                                        r5 = r6;
                                        if (objR != null) {
                                            r5.f(r2, (defpackage.eio) objR);
                                        }
                                        throw th;
                                    }
                                    break;
                                }
                                if (!r8.a(objB, egrVar, 0)) {
                                    objR2 = objB;
                                    r7 = r8;
                                    for (int i9 = r13.k; i9 < r13.l; i9++) {
                                        ?? r12 = r7;
                                        objR2 = r13.r(r2, r13.j[i9], objR2, r12, obj);
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
                        objR = objB;
                        r1 = r3;
                        r6 = r8;
                        while (i < r1.l) {
                            ?? r14 = r6;
                            objR = r1.r(r2, r1.j[i], objR, r14, obj);
                            i++;
                            r1 = this;
                            r6 = r14;
                        }
                        r5 = r6;
                        if (objR != null) {
                            r5.f(r2, (defpackage.eio) objR);
                        }
                        throw th;
                    }
                } else if (iC == Integer.MAX_VALUE) {
                    objR2 = objB;
                    r7 = r8;
                    for (int i10 = r3.k; i10 < r3.l; i10++) {
                        ?? r15 = r7;
                        objR2 = r3.r(obj, r3.j[i10], objR2, r15, obj);
                        r7 = r15;
                    }
                    r2 = obj;
                } else {
                    java.lang.Object obj4 = obj;
                    try {
                        if ((!r3.h ? null : egzVar.b(r3.g, iC)) != null) {
                            defpackage.dzl.h(obj4);
                            throw null;
                        }
                        if (objB == null) {
                            try {
                                objB = r8.b(obj4);
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                r2 = obj4;
                            }
                        }
                        if (r8.a(objB, egrVar, 0)) {
                            r13 = r3;
                            r3 = r13;
                        } else {
                            int i11 = r3.k;
                            objR2 = objB;
                            r7 = r8;
                            for (?? r4 = r3; i11 < r4.l; r4 = r4) {
                                ?? r16 = r7;
                                java.lang.Object obj5 = obj4;
                                objR2 = r4.r(obj5, r4.j[i11], objR2, r16, obj);
                                r7 = r16;
                                i11++;
                                obj4 = obj5;
                            }
                            r2 = obj4;
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        r13 = r3;
                        r3 = obj4;
                        r2 = r3;
                        r3 = r13;
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                r2 = obj;
            }
            i = r3.k;
            objR = objB;
            r1 = r3;
            r6 = r8;
            while (i < r1.l) {
                ?? r17 = r6;
                objR = r1.r(r2, r1.j[i], objR, r17, obj);
                i++;
                r1 = this;
                r6 = r17;
            }
            r5 = r6;
            if (objR != null) {
                r5.f(r2, (defpackage.eio) objR);
            }
            throw th;
        }
        if (objR2 != null) {
            r7.f(r2, (defpackage.eio) objR2);
        }
    }

    @Override // defpackage.eig
    public final boolean g(java.lang.Object obj, java.lang.Object obj2) {
        boolean zH;
        for (int i = 0; i < this.c.length; i += 3) {
            int iM = m(i);
            int i2 = (iM >>> 20) & 255;
            if (i2 <= 50 || i2 >= 69) {
                long jN = n(iM);
                switch (i2) {
                    case 0:
                        if (!D(obj, obj2, i) || java.lang.Double.doubleToLongBits(defpackage.eit.a(obj, jN)) != java.lang.Double.doubleToLongBits(defpackage.eit.a(obj2, jN))) {
                            return false;
                        }
                        continue;
                        break;
                    case 1:
                        if (!D(obj, obj2, i) || java.lang.Float.floatToIntBits(defpackage.eit.b(obj, jN)) != java.lang.Float.floatToIntBits(defpackage.eit.b(obj2, jN))) {
                            return false;
                        }
                        continue;
                        break;
                    case 2:
                        if (!D(obj, obj2, i) || defpackage.eit.d(obj, jN) != defpackage.eit.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 3:
                        if (!D(obj, obj2, i) || defpackage.eit.d(obj, jN) != defpackage.eit.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 4:
                        if (!D(obj, obj2, i) || defpackage.eit.c(obj, jN) != defpackage.eit.c(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 5:
                        if (!D(obj, obj2, i) || defpackage.eit.d(obj, jN) != defpackage.eit.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (!D(obj, obj2, i) || defpackage.eit.c(obj, jN) != defpackage.eit.c(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (!D(obj, obj2, i) || defpackage.eit.s(obj, jN) != defpackage.eit.s(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        if (!D(obj, obj2, i)) {
                            return false;
                        }
                        java.lang.Object objF = defpackage.eit.f(obj, jN);
                        java.lang.Object objF2 = defpackage.eit.f(obj2, jN);
                        java.lang.Class cls = defpackage.eih.a;
                        if (!defpackage.anty.H(objF, objF2)) {
                            return false;
                        }
                        continue;
                        break;
                    case 9:
                        if (!D(obj, obj2, i)) {
                            return false;
                        }
                        java.lang.Object objF3 = defpackage.eit.f(obj, jN);
                        java.lang.Object objF4 = defpackage.eit.f(obj2, jN);
                        java.lang.Class cls2 = defpackage.eih.a;
                        if (!defpackage.anty.H(objF3, objF4)) {
                            return false;
                        }
                        continue;
                        break;
                    case 10:
                        if (!D(obj, obj2, i)) {
                            return false;
                        }
                        java.lang.Object objF5 = defpackage.eit.f(obj, jN);
                        java.lang.Object objF6 = defpackage.eit.f(obj2, jN);
                        java.lang.Class cls3 = defpackage.eih.a;
                        if (!defpackage.anty.H(objF5, objF6)) {
                            return false;
                        }
                        continue;
                        break;
                    case 11:
                        if (!D(obj, obj2, i) || defpackage.eit.c(obj, jN) != defpackage.eit.c(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 12:
                        if (!D(obj, obj2, i) || defpackage.eit.c(obj, jN) != defpackage.eit.c(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 13:
                        if (!D(obj, obj2, i) || defpackage.eit.c(obj, jN) != defpackage.eit.c(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 14:
                        if (!D(obj, obj2, i) || defpackage.eit.d(obj, jN) != defpackage.eit.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 15:
                        if (!D(obj, obj2, i) || defpackage.eit.c(obj, jN) != defpackage.eit.c(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 16:
                        if (!D(obj, obj2, i) || defpackage.eit.d(obj, jN) != defpackage.eit.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 17:
                        if (!D(obj, obj2, i)) {
                            return false;
                        }
                        java.lang.Object objF7 = defpackage.eit.f(obj, jN);
                        java.lang.Object objF8 = defpackage.eit.f(obj2, jN);
                        java.lang.Class cls4 = defpackage.eih.a;
                        if (!defpackage.anty.H(objF7, objF8)) {
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
                        java.lang.Object objF9 = defpackage.eit.f(obj, jN);
                        java.lang.Object objF10 = defpackage.eit.f(obj2, jN);
                        java.lang.Class cls5 = defpackage.eih.a;
                        zH = defpackage.anty.H(objF9, objF10);
                        break;
                    case 50:
                        java.lang.Object objF11 = defpackage.eit.f(obj, jN);
                        java.lang.Object objF12 = defpackage.eit.f(obj2, jN);
                        java.lang.Class cls6 = defpackage.eih.a;
                        zH = defpackage.anty.H(objF11, objF12);
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
                        if (!J(obj, obj2, i)) {
                            return false;
                        }
                        java.lang.Object objF13 = defpackage.eit.f(obj, jN);
                        java.lang.Object objF14 = defpackage.eit.f(obj2, jN);
                        java.lang.Class cls7 = defpackage.eih.a;
                        if (!defpackage.anty.H(objF13, objF14)) {
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
                defpackage.ein einVar = this.m;
                if (!einVar.c(obj).equals(einVar.c(obj2))) {
                    return false;
                }
                if (this.h) {
                    return defpackage.dzl.g(obj).equals(defpackage.dzl.g(obj2));
                }
                return true;
            }
            int i4 = iArr[i3];
            if (!J(obj, obj2, i4)) {
                return false;
            }
            if (!K(obj, 0, i4)) {
                long jN2 = n(m(i4));
                java.lang.Object objF15 = defpackage.eit.f(obj, jN2);
                java.lang.Object objF16 = defpackage.eit.f(obj2, jN2);
                java.lang.Class cls8 = defpackage.eih.a;
                if (!defpackage.anty.H(objF15, objF16)) {
                    return false;
                }
            }
            i3++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2 A[LOOP:2: B:50:0x00d2->B:54:0x00e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f5 A[SYNTHETIC] */
    @Override // defpackage.eig
    public final boolean h(java.lang.Object obj) {
        int i;
        int i2;
        java.util.List list;
        defpackage.eig eigVarQ;
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
            defpackage.ehz ehzVar = this;
            java.lang.Object obj2 = obj;
            if ((268435456 & iM) != 0 && !ehzVar.G(obj2, i7, i, i2, i10)) {
                return false;
            }
            int i11 = (iM >>> 20) & 255;
            if (i11 == 9 || i11 == 17) {
                if (ehzVar.G(obj2, i7, i, i2, i10) && !H(obj2, iM, ehzVar.q(i7))) {
                    return false;
                }
            } else if (i11 == 27) {
                list = (java.util.List) defpackage.eit.f(obj2, n(iM));
                if (list.isEmpty()) {
                    continue;
                } else {
                    eigVarQ = ehzVar.q(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (eigVarQ.h(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (i11 == 60 || i11 == 68) {
                if (ehzVar.K(obj2, ehzVar.j(i7), i7) && !H(obj2, iM, ehzVar.q(i7))) {
                    return false;
                }
            } else if (i11 == 49) {
                list = (java.util.List) defpackage.eit.f(obj2, n(iM));
                if (list.isEmpty()) {
                    eigVarQ = ehzVar.q(i7);
                    while (i3 < list.size()) {
                        if (eigVarQ.h(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i11 == 50) {
                defpackage.eht ehtVar = (defpackage.eht) defpackage.eit.f(obj2, n(iM));
                if (ehtVar.isEmpty()) {
                    continue;
                } else {
                    if (((defpackage.eja) defpackage.dzl.p(ehzVar.s(i7)).c).s == defpackage.ejb.i) {
                        defpackage.eig eigVarB = null;
                        for (java.lang.Object obj3 : ehtVar.values()) {
                            if (eigVarB == null) {
                                eigVarB = defpackage.eid.a.b(((defpackage.ehg) obj3).getClass());
                            }
                            if (!eigVarB.h(obj3)) {
                                return false;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                continue;
            }
            i4++;
            this = ehzVar;
            obj = obj2;
            i6 = i;
            i5 = i2;
        }
        java.lang.Object obj4 = obj;
        if (this.h) {
            defpackage.dzl.g(obj4).f();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    @Override // defpackage.eig
    public final void i(java.lang.Object obj, defpackage.ipc ipcVar) {
        java.util.Map.Entry entry;
        int i;
        int i2;
        defpackage.ehz ehzVar = this;
        if (ehzVar.h) {
            defpackage.ehb ehbVarG = defpackage.dzl.g(obj);
            if (ehbVarG.e()) {
                entry = null;
            } else {
                entry = (java.util.Map.Entry) ehbVarG.b().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = ehzVar.c;
        sun.misc.Unsafe unsafe = b;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < iArr.length) {
            int iM = ehzVar.m(i5);
            int iJ = ehzVar.j(i5);
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
                    if (ehzVar.G(obj, i5, i4, i6, i)) {
                        ipcVar.I(iJ, defpackage.eit.a(obj, jN));
                    }
                    break;
                case 1:
                    if (ehzVar.G(obj, i5, i4, i6, i)) {
                        ipcVar.M(iJ, defpackage.eit.b(obj, jN));
                    }
                    ehzVar = this;
                    break;
                case 2:
                    if (ehzVar.G(obj, i5, i4, i6, i)) {
                        ipcVar.P(iJ, unsafe.getLong(obj, jN));
                    }
                    ehzVar = this;
                    break;
                case 3:
                    if (ehzVar.G(obj, i5, i4, i6, i)) {
                        ipcVar.W(iJ, unsafe.getLong(obj, jN));
                    }
                    ehzVar = this;
                    break;
                case 4:
                    if (ehzVar.G(obj, i5, i4, i6, i)) {
                        ipcVar.O(iJ, unsafe.getInt(obj, jN));
                    }
                    ehzVar = this;
                    break;
                case 5:
                    if (ehzVar.G(obj, i5, i4, i6, i)) {
                        ipcVar.L(iJ, unsafe.getLong(obj, jN));
                    }
                    ehzVar = this;
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (ehzVar.G(obj, i5, i4, i6, i)) {
                        ipcVar.K(iJ, unsafe.getInt(obj, jN));
                    }
                    ehzVar = this;
                    break;
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (ehzVar.G(obj, i5, i4, i6, i)) {
                        ipcVar.G(iJ, defpackage.eit.s(obj, jN));
                    }
                    ehzVar = this;
                    break;
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    if (ehzVar.G(obj, i5, i4, i6, i)) {
                        M(iJ, unsafe.getObject(obj, jN), ipcVar);
                    }
                    ehzVar = this;
                    break;
                case 9:
                    if (ehzVar.G(obj, i5, i4, i6, i)) {
                        ipcVar.Q(iJ, unsafe.getObject(obj, jN), ehzVar.q(i5));
                    }
                    break;
                case 10:
                    if (ehzVar.G(obj, i5, i4, i6, i)) {
                        ipcVar.H(iJ, (defpackage.egm) unsafe.getObject(obj, jN));
                    }
                    ehzVar = this;
                    break;
                case 11:
                    if (ehzVar.G(obj, i5, i4, i6, i)) {
                        ipcVar.V(iJ, unsafe.getInt(obj, jN));
                    }
                    ehzVar = this;
                    break;
                case 12:
                    if (ehzVar.G(obj, i5, i4, i6, i)) {
                        ipcVar.J(iJ, unsafe.getInt(obj, jN));
                    }
                    ehzVar = this;
                    break;
                case 13:
                    if (ehzVar.G(obj, i5, i4, i6, i)) {
                        ipcVar.R(iJ, unsafe.getInt(obj, jN));
                    }
                    ehzVar = this;
                    break;
                case 14:
                    if (ehzVar.G(obj, i5, i4, i6, i)) {
                        ipcVar.S(iJ, unsafe.getLong(obj, jN));
                    }
                    ehzVar = this;
                    break;
                case 15:
                    if (ehzVar.G(obj, i5, i4, i6, i)) {
                        ipcVar.T(iJ, unsafe.getInt(obj, jN));
                    }
                    ehzVar = this;
                    break;
                case 16:
                    if (ehzVar.G(obj, i5, i4, i6, i)) {
                        ipcVar.U(iJ, unsafe.getLong(obj, jN));
                    }
                    ehzVar = this;
                    break;
                case 17:
                    if (ehzVar.G(obj, i5, i4, i6, i)) {
                        ipcVar.N(iJ, unsafe.getObject(obj, jN), ehzVar.q(i5));
                    }
                    break;
                case 18:
                    i2 = i4;
                    defpackage.eih.n(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, false);
                    i4 = i2;
                    break;
                case 19:
                    i2 = i4;
                    defpackage.eih.o(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, false);
                    i4 = i2;
                    break;
                case 20:
                    i2 = i4;
                    defpackage.eih.v(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, false);
                    i4 = i2;
                    break;
                case 21:
                    i2 = i4;
                    defpackage.eih.v(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, false);
                    i4 = i2;
                    break;
                case 22:
                    i2 = i4;
                    defpackage.eih.s(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, false);
                    i4 = i2;
                    break;
                case 23:
                    i2 = i4;
                    defpackage.eih.u(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, false);
                    i4 = i2;
                    break;
                case 24:
                    i2 = i4;
                    defpackage.eih.t(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, false);
                    i4 = i2;
                    break;
                case 25:
                    i2 = i4;
                    defpackage.eih.m(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, false);
                    i4 = i2;
                    break;
                case 26:
                    i2 = i4;
                    int iJ2 = ehzVar.j(i5);
                    java.util.List list = (java.util.List) unsafe.getObject(obj, jN);
                    java.lang.Class cls = defpackage.eih.a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof defpackage.ehr) {
                            defpackage.ehr ehrVar = (defpackage.ehr) list;
                            for (int i10 = 0; i10 < list.size(); i10++) {
                                java.lang.Object objC = ehrVar.c();
                                if (objC instanceof java.lang.String) {
                                    ((defpackage.egv) ipcVar.a).q(iJ2, (java.lang.String) objC);
                                } else {
                                    ((defpackage.egv) ipcVar.a).f(iJ2, (defpackage.egm) objC);
                                }
                            }
                        } else {
                            for (int i11 = 0; i11 < list.size(); i11++) {
                                ((defpackage.egv) ipcVar.a).q(iJ2, (java.lang.String) list.get(i11));
                            }
                        }
                    }
                    i4 = i2;
                    break;
                case 27:
                    i2 = i4;
                    int iJ3 = ehzVar.j(i5);
                    java.util.List list2 = (java.util.List) unsafe.getObject(obj, jN);
                    defpackage.eig eigVarQ = ehzVar.q(i5);
                    java.lang.Class cls2 = defpackage.eih.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i12 = 0; i12 < list2.size(); i12++) {
                            ipcVar.Q(iJ3, list2.get(i12), eigVarQ);
                        }
                    }
                    i4 = i2;
                    break;
                case 28:
                    i2 = i4;
                    int iJ4 = ehzVar.j(i5);
                    java.util.List list3 = (java.util.List) unsafe.getObject(obj, jN);
                    java.lang.Class cls3 = defpackage.eih.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i13 = 0; i13 < list3.size(); i13++) {
                            ((defpackage.egv) ipcVar.a).f(iJ4, (defpackage.egm) list3.get(i13));
                        }
                    }
                    i4 = i2;
                    break;
                case 29:
                    i2 = i4;
                    defpackage.eih.r(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, false);
                    i4 = i2;
                    break;
                case 30:
                    i2 = i4;
                    defpackage.eih.s(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, false);
                    i4 = i2;
                    break;
                case 31:
                    i2 = i4;
                    defpackage.eih.t(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, false);
                    i4 = i2;
                    break;
                case 32:
                    i2 = i4;
                    defpackage.eih.u(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, false);
                    i4 = i2;
                    break;
                case 33:
                    i2 = i4;
                    defpackage.eih.p(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, false);
                    i4 = i2;
                    break;
                case 34:
                    i2 = i4;
                    defpackage.eih.q(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, false);
                    i4 = i2;
                    break;
                case 35:
                    i2 = i4;
                    defpackage.eih.n(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, true);
                    i4 = i2;
                    break;
                case 36:
                    i2 = i4;
                    defpackage.eih.o(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, true);
                    i4 = i2;
                    break;
                case 37:
                    i2 = i4;
                    defpackage.eih.v(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, true);
                    i4 = i2;
                    break;
                case 38:
                    i2 = i4;
                    defpackage.eih.v(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, true);
                    i4 = i2;
                    break;
                case 39:
                    i2 = i4;
                    defpackage.eih.s(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, true);
                    i4 = i2;
                    break;
                case 40:
                    i2 = i4;
                    defpackage.eih.u(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, true);
                    i4 = i2;
                    break;
                case 41:
                    i2 = i4;
                    defpackage.eih.t(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, true);
                    i4 = i2;
                    break;
                case 42:
                    i2 = i4;
                    defpackage.eih.m(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, true);
                    i4 = i2;
                    break;
                case 43:
                    i2 = i4;
                    defpackage.eih.r(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, true);
                    i4 = i2;
                    break;
                case 44:
                    i2 = i4;
                    defpackage.eih.s(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, true);
                    i4 = i2;
                    break;
                case 45:
                    i2 = i4;
                    defpackage.eih.t(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, true);
                    i4 = i2;
                    break;
                case 46:
                    i2 = i4;
                    defpackage.eih.u(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, true);
                    i4 = i2;
                    break;
                case 47:
                    i2 = i4;
                    defpackage.eih.p(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, true);
                    i4 = i2;
                    break;
                case 48:
                    i2 = i4;
                    defpackage.eih.q(ehzVar.j(i5), (java.util.List) unsafe.getObject(obj, jN), ipcVar, true);
                    i4 = i2;
                    break;
                case 49:
                    i2 = i4;
                    int iJ5 = ehzVar.j(i5);
                    java.util.List list4 = (java.util.List) unsafe.getObject(obj, jN);
                    defpackage.eig eigVarQ2 = ehzVar.q(i5);
                    java.lang.Class cls4 = defpackage.eih.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i14 = 0; i14 < list4.size(); i14++) {
                            ipcVar.N(iJ5, list4.get(i14), eigVarQ2);
                        }
                    }
                    i4 = i2;
                    break;
                case 50:
                    java.lang.Object object = unsafe.getObject(obj, jN);
                    if (object != null) {
                        defpackage.kgl kglVarP = defpackage.dzl.p(ehzVar.s(i5));
                        java.lang.Object obj2 = ipcVar.a;
                        java.util.Iterator it = ((defpackage.eht) object).entrySet().iterator();
                        while (it.hasNext()) {
                            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
                            defpackage.egv egvVar = (defpackage.egv) obj2;
                            egvVar.s(iJ, 2);
                            egvVar.u(defpackage.ipc.ah(kglVarP, entry2.getKey(), entry2.getValue()));
                            defpackage.ipc.ai(egvVar, kglVarP, entry2.getKey(), entry2.getValue());
                            i4 = i4;
                        }
                    }
                    break;
                case 51:
                    if (ehzVar.K(obj, iJ, i5)) {
                        ipcVar.I(iJ, ((java.lang.Double) defpackage.eit.f(obj, jN)).doubleValue());
                    }
                    break;
                case 52:
                    if (ehzVar.K(obj, iJ, i5)) {
                        ipcVar.M(iJ, ((java.lang.Float) defpackage.eit.f(obj, jN)).floatValue());
                    }
                    break;
                case 53:
                    if (ehzVar.K(obj, iJ, i5)) {
                        ipcVar.P(iJ, o(obj, jN));
                    }
                    break;
                case 54:
                    if (ehzVar.K(obj, iJ, i5)) {
                        ipcVar.W(iJ, o(obj, jN));
                    }
                    break;
                case 55:
                    if (ehzVar.K(obj, iJ, i5)) {
                        ipcVar.O(iJ, k(obj, jN));
                    }
                    break;
                case 56:
                    if (ehzVar.K(obj, iJ, i5)) {
                        ipcVar.L(iJ, o(obj, jN));
                    }
                    break;
                case 57:
                    if (ehzVar.K(obj, iJ, i5)) {
                        ipcVar.K(iJ, k(obj, jN));
                    }
                    break;
                case 58:
                    if (ehzVar.K(obj, iJ, i5)) {
                        ipcVar.G(iJ, ((java.lang.Boolean) defpackage.eit.f(obj, jN)).booleanValue());
                    }
                    break;
                case 59:
                    if (ehzVar.K(obj, iJ, i5)) {
                        M(iJ, unsafe.getObject(obj, jN), ipcVar);
                    }
                    break;
                case 60:
                    if (ehzVar.K(obj, iJ, i5)) {
                        ipcVar.Q(iJ, unsafe.getObject(obj, jN), ehzVar.q(i5));
                    }
                    break;
                case 61:
                    if (ehzVar.K(obj, iJ, i5)) {
                        ipcVar.H(iJ, (defpackage.egm) unsafe.getObject(obj, jN));
                    }
                    break;
                case 62:
                    if (ehzVar.K(obj, iJ, i5)) {
                        ipcVar.V(iJ, k(obj, jN));
                    }
                    break;
                case 63:
                    if (ehzVar.K(obj, iJ, i5)) {
                        ipcVar.J(iJ, k(obj, jN));
                    }
                    break;
                case 64:
                    if (ehzVar.K(obj, iJ, i5)) {
                        ipcVar.R(iJ, k(obj, jN));
                    }
                    break;
                case 65:
                    if (ehzVar.K(obj, iJ, i5)) {
                        ipcVar.S(iJ, o(obj, jN));
                    }
                    break;
                case 66:
                    if (ehzVar.K(obj, iJ, i5)) {
                        ipcVar.T(iJ, k(obj, jN));
                    }
                    break;
                case 67:
                    if (ehzVar.K(obj, iJ, i5)) {
                        ipcVar.U(iJ, o(obj, jN));
                    }
                    break;
                case 68:
                    if (ehzVar.K(obj, iJ, i5)) {
                        ipcVar.N(iJ, unsafe.getObject(obj, jN), ehzVar.q(i5));
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        if (entry != null) {
            throw null;
        }
        ehzVar.m.c(obj).f(ipcVar);
    }
}
