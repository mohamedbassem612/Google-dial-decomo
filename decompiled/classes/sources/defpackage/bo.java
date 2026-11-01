package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bo {
    public static boolean a = true;
    public final defpackage.nf A;
    private boolean B;
    private java.util.ArrayList C;
    private final defpackage.dxw F;
    private final defpackage.dxw G;
    private final defpackage.dxw H;
    private final defpackage.dxw I;
    private final defpackage.bc J;
    private boolean K;
    private java.util.ArrayList L;
    private java.util.ArrayList M;
    private java.util.ArrayList N;
    private final java.lang.Runnable O;
    private final defpackage.apnt P;
    private final defpackage.den Q;
    public defpackage.nf f;
    final java.util.ArrayList k;
    public final java.util.concurrent.CopyOnWriteArrayList l;
    int m;
    public defpackage.bd n;
    public defpackage.bb o;
    public defpackage.aw p;
    defpackage.aw q;
    public defpackage.ok r;
    public defpackage.ok s;
    public defpackage.ok t;
    java.util.ArrayDeque u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public defpackage.bq z;
    public final java.util.ArrayList b = new java.util.ArrayList();
    public final defpackage.bu c = new defpackage.bu();
    java.util.ArrayList d = new java.util.ArrayList();
    public final defpackage.be e = new defpackage.be(this);
    defpackage.u g = null;
    boolean h = false;
    public final defpackage.na i = new defpackage.bg(this);
    public final java.util.concurrent.atomic.AtomicInteger j = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.Map D = j$.util.DesugarCollections.synchronizedMap(new java.util.HashMap());
    private final java.util.Map E = j$.util.DesugarCollections.synchronizedMap(new java.util.HashMap());

    public bo() {
        j$.util.DesugarCollections.synchronizedMap(new java.util.HashMap());
        this.k = new java.util.ArrayList();
        this.A = new defpackage.nf(this);
        this.l = new java.util.concurrent.CopyOnWriteArrayList();
        this.F = new defpackage.ax(this, 2);
        this.G = new defpackage.ax(this, 3);
        this.H = new defpackage.ax(this, 4);
        this.I = new defpackage.ax(this, 5);
        this.P = new defpackage.apnt(this, (byte[]) null);
        this.m = -1;
        this.J = new defpackage.bh(this);
        this.Q = new defpackage.den((short[]) null);
        this.u = new java.util.ArrayDeque();
        this.O = new defpackage.am(this, 12, null);
    }

    public static boolean Z(int i) {
        return android.util.Log.isLoggable("FragmentManager", i);
    }

    static final java.util.Set ag(defpackage.u uVar) {
        java.util.HashSet hashSet = new java.util.HashSet();
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = uVar.d;
            if (i >= arrayList.size()) {
                return hashSet;
            }
            defpackage.aw awVar = ((defpackage.bv) arrayList.get(i)).b;
            if (awVar != null && uVar.j) {
                hashSet.add(awVar);
            }
            i++;
        }
    }

    public static final boolean ah(defpackage.aw awVar) {
        boolean z = awVar.M;
        boolean zAh = false;
        for (defpackage.aw awVar2 : awVar.D.c.f()) {
            if (awVar2 != null) {
                zAh = ah(awVar2);
            }
            if (zAh) {
                return true;
            }
        }
        return false;
    }

    static final boolean ai(defpackage.aw awVar) {
        if (awVar != null) {
            return awVar.N && (awVar.B == null || ai(awVar.E));
        }
        return true;
    }

    static final void aj(defpackage.aw awVar) {
        if (Z(2)) {
            java.util.Objects.toString(awVar);
            android.util.Log.v("FragmentManager", "show: ".concat(java.lang.String.valueOf(awVar)));
        }
        if (awVar.I) {
            awVar.I = false;
            awVar.W = !awVar.W;
        }
    }

    private final android.view.ViewGroup an(defpackage.aw awVar) {
        android.view.ViewGroup viewGroup = awVar.P;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (awVar.G > 0 && this.o.b()) {
            android.view.View viewA = this.o.a(awVar.G);
            if (viewA instanceof android.view.ViewGroup) {
                return (android.view.ViewGroup) viewA;
            }
        }
        return null;
    }

    private final java.util.Set ao() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            android.view.ViewGroup viewGroup = ((defpackage.bt) it.next()).a.P;
            if (viewGroup != null) {
                hashSet.add(defpackage.den.ce(viewGroup, am()));
            }
        }
        return hashSet;
    }

    private final void ap() {
        if (ac()) {
            throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private final void aq() {
        this.B = false;
        this.M.clear();
        this.L.clear();
    }

    private final void ar() {
        if (this.K) {
            this.K = false;
            ax();
        }
    }

    private final void as(boolean z) {
        if (this.B) {
            throw new java.lang.IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.n == null) {
            if (!this.y) {
                throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new java.lang.IllegalStateException("FragmentManager has been destroyed");
        }
        if (android.os.Looper.myLooper() != this.n.d.getLooper()) {
            throw new java.lang.IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            ap();
        }
        if (this.L == null) {
            this.L = new java.util.ArrayList();
            this.M = new java.util.ArrayList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x021a A[PHI: r14
      0x021a: PHI (r14v14 int) = (r14v13 int), (r14v15 int) binds: [B:98:0x0208, B:103:0x0214] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x016e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0174  */
    private final void at(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        int i7;
        byte[] bArr;
        int i8 = i;
        boolean z3 = ((defpackage.u) arrayList.get(i8)).s;
        java.util.ArrayList arrayList3 = this.N;
        if (arrayList3 == null) {
            this.N = new java.util.ArrayList();
        } else {
            arrayList3.clear();
        }
        java.util.ArrayList arrayList4 = this.N;
        defpackage.bu buVar = this.c;
        arrayList4.addAll(buVar.g());
        defpackage.aw awVar = this.q;
        int i9 = i8;
        boolean z4 = false;
        while (true) {
            int i10 = 1;
            if (i9 >= i2) {
                boolean z5 = z3;
                boolean z6 = z4;
                int i11 = -1;
                this.N.clear();
                if (!z5 && this.m > 0) {
                    for (int i12 = i8; i12 < i2; i12++) {
                        java.util.ArrayList arrayList5 = ((defpackage.u) arrayList.get(i12)).d;
                        int size = arrayList5.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            defpackage.aw awVar2 = ((defpackage.bv) arrayList5.get(i13)).b;
                            if (awVar2 != null && awVar2.B != null) {
                                buVar.j(j(awVar2));
                            }
                        }
                    }
                }
                int i14 = i8;
                while (i14 < i2) {
                    defpackage.u uVar = (defpackage.u) arrayList.get(i14);
                    if (((java.lang.Boolean) arrayList2.get(i14)).booleanValue()) {
                        int i15 = i11;
                        uVar.a(i15);
                        java.util.ArrayList arrayList6 = uVar.d;
                        for (int size2 = arrayList6.size() + i15; size2 >= 0; size2--) {
                            defpackage.bv bvVar = (defpackage.bv) arrayList6.get(size2);
                            defpackage.aw awVar3 = bvVar.b;
                            if (awVar3 != null) {
                                awVar3.u = false;
                                awVar3.aA(true);
                                int i16 = uVar.i;
                                int i17 = 8194;
                                int i18 = 4097;
                                if (i16 != 4097) {
                                    if (i16 != 8194) {
                                        i17 = 4100;
                                        i18 = 8197;
                                        if (i16 != 8197) {
                                            if (i16 == 4099) {
                                                i17 = 4099;
                                            } else if (i16 != 4100) {
                                                i17 = 0;
                                            } else {
                                                i17 = i18;
                                            }
                                        }
                                    } else {
                                        i17 = i18;
                                    }
                                }
                                awVar3.az(i17);
                                awVar3.aB(uVar.r, uVar.q);
                            }
                            switch (bvVar.a) {
                                case 1:
                                    awVar3.at(bvVar.d, bvVar.e, bvVar.f, bvVar.g);
                                    defpackage.bo boVar = uVar.a;
                                    boVar.Q(awVar3, true);
                                    boVar.O(awVar3);
                                    break;
                                case 2:
                                default:
                                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + bvVar.a);
                                case 3:
                                    awVar3.at(bvVar.d, bvVar.e, bvVar.f, bvVar.g);
                                    uVar.a.i(awVar3);
                                    break;
                                case 4:
                                    awVar3.at(bvVar.d, bvVar.e, bvVar.f, bvVar.g);
                                    defpackage.bo boVar2 = uVar.a;
                                    aj(awVar3);
                                    break;
                                case 5:
                                    awVar3.at(bvVar.d, bvVar.e, bvVar.f, bvVar.g);
                                    defpackage.bo boVar3 = uVar.a;
                                    boVar3.Q(awVar3, true);
                                    boVar3.K(awVar3);
                                    break;
                                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                    awVar3.at(bvVar.d, bvVar.e, bvVar.f, bvVar.g);
                                    uVar.a.o(awVar3);
                                    break;
                                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                                    awVar3.at(bvVar.d, bvVar.e, bvVar.f, bvVar.g);
                                    defpackage.bo boVar4 = uVar.a;
                                    boVar4.Q(awVar3, true);
                                    boVar4.q(awVar3);
                                    break;
                                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                                    uVar.a.S(null);
                                    break;
                                case 9:
                                    uVar.a.S(awVar3);
                                    break;
                                case 10:
                                    bvVar.i = awVar3.aa;
                                    uVar.a.R(awVar3, bvVar.h);
                                    break;
                            }
                        }
                    } else {
                        uVar.a(1);
                        java.util.ArrayList arrayList7 = uVar.d;
                        int size3 = arrayList7.size();
                        for (int i19 = 0; i19 < size3; i19++) {
                            defpackage.bv bvVar2 = (defpackage.bv) arrayList7.get(i19);
                            defpackage.aw awVar4 = bvVar2.b;
                            if (awVar4 != null) {
                                awVar4.u = false;
                                awVar4.aA(false);
                                awVar4.az(uVar.i);
                                awVar4.aB(uVar.q, uVar.r);
                            }
                            switch (bvVar2.a) {
                                case 1:
                                    awVar4.at(bvVar2.d, bvVar2.e, bvVar2.f, bvVar2.g);
                                    defpackage.bo boVar5 = uVar.a;
                                    boVar5.Q(awVar4, false);
                                    boVar5.i(awVar4);
                                    break;
                                case 2:
                                default:
                                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + bvVar2.a);
                                case 3:
                                    awVar4.at(bvVar2.d, bvVar2.e, bvVar2.f, bvVar2.g);
                                    uVar.a.O(awVar4);
                                    break;
                                case 4:
                                    awVar4.at(bvVar2.d, bvVar2.e, bvVar2.f, bvVar2.g);
                                    uVar.a.K(awVar4);
                                    break;
                                case 5:
                                    awVar4.at(bvVar2.d, bvVar2.e, bvVar2.f, bvVar2.g);
                                    uVar.a.Q(awVar4, false);
                                    aj(awVar4);
                                    break;
                                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                    awVar4.at(bvVar2.d, bvVar2.e, bvVar2.f, bvVar2.g);
                                    uVar.a.q(awVar4);
                                    break;
                                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                                    awVar4.at(bvVar2.d, bvVar2.e, bvVar2.f, bvVar2.g);
                                    defpackage.bo boVar6 = uVar.a;
                                    boVar6.Q(awVar4, false);
                                    boVar6.o(awVar4);
                                    break;
                                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                                    uVar.a.S(awVar4);
                                    break;
                                case 9:
                                    uVar.a.S(null);
                                    break;
                                case 10:
                                    bvVar2.h = awVar4.aa;
                                    uVar.a.R(awVar4, bvVar2.i);
                                    break;
                            }
                        }
                    }
                    i14++;
                    i11 = -1;
                }
                boolean zBooleanValue = ((java.lang.Boolean) arrayList2.get(i2 - 1)).booleanValue();
                if (z6 && !this.k.isEmpty()) {
                    java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                    int size4 = arrayList.size();
                    for (int i20 = 0; i20 < size4; i20++) {
                        linkedHashSet.addAll(ag((defpackage.u) arrayList.get(i20)));
                    }
                    if (this.g == null) {
                        java.util.ArrayList arrayList8 = this.k;
                        int size5 = arrayList8.size();
                        int i21 = 0;
                        while (i21 < size5) {
                            defpackage.ahpw ahpwVar = (defpackage.ahpw) arrayList8.get(i21);
                            java.util.Iterator it = linkedHashSet.iterator();
                            while (true) {
                                i4 = i21 + 1;
                                if (it.hasNext()) {
                                    ahpwVar.a((defpackage.aw) it.next(), zBooleanValue);
                                }
                            }
                            i21 = i4;
                        }
                        java.util.ArrayList arrayList9 = this.k;
                        int size6 = arrayList9.size();
                        int i22 = 0;
                        while (i22 < size6) {
                            java.util.Iterator it2 = linkedHashSet.iterator();
                            while (true) {
                                i3 = i22 + 1;
                                if (it2.hasNext()) {
                                }
                            }
                            i22 = i3;
                        }
                    }
                }
                for (int i23 = i8; i23 < i2; i23++) {
                    defpackage.u uVar2 = (defpackage.u) arrayList.get(i23);
                    if (zBooleanValue) {
                        java.util.ArrayList arrayList10 = uVar2.d;
                        for (int size7 = arrayList10.size() - 1; size7 >= 0; size7--) {
                            defpackage.aw awVar5 = ((defpackage.bv) arrayList10.get(size7)).b;
                            if (awVar5 != null) {
                                j(awVar5).e();
                            }
                        }
                    } else {
                        java.util.ArrayList arrayList11 = uVar2.d;
                        int size8 = arrayList11.size();
                        for (int i24 = 0; i24 < size8; i24++) {
                            defpackage.aw awVar6 = ((defpackage.bv) arrayList11.get(i24)).b;
                            if (awVar6 != null) {
                                j(awVar6).e();
                            }
                        }
                    }
                }
                L(this.m, true);
                for (defpackage.ck ckVar : l(arrayList, i8, i2)) {
                    ckVar.d = zBooleanValue;
                    ckVar.g();
                    ckVar.e();
                }
                while (i8 < i2) {
                    defpackage.u uVar3 = (defpackage.u) arrayList.get(i8);
                    if (((java.lang.Boolean) arrayList2.get(i8)).booleanValue() && uVar3.c >= 0) {
                        uVar3.c = -1;
                    }
                    if (uVar3.t != null) {
                        for (int i25 = 0; i25 < uVar3.t.size(); i25++) {
                            ((java.lang.Runnable) uVar3.t.get(i25)).run();
                        }
                        uVar3.t = null;
                    }
                    i8++;
                }
                if (z6) {
                    for (int i26 = 0; i26 < this.k.size(); i26++) {
                        defpackage.ahpw ahpwVar2 = (defpackage.ahpw) this.k.get(i26);
                        if (ahpwVar2.b) {
                            ahpwVar2.b = false;
                            defpackage.ahns.l();
                        } else {
                            defpackage.ahok ahokVar = ahpwVar2.a;
                            if (ahokVar != null) {
                                ahokVar.close();
                                ahpwVar2.a = null;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            defpackage.u uVar4 = (defpackage.u) arrayList.get(i9);
            boolean zBooleanValue2 = ((java.lang.Boolean) arrayList2.get(i9)).booleanValue();
            java.util.ArrayList arrayList12 = this.N;
            if (zBooleanValue2) {
                z = z3;
                i5 = i9;
                z2 = z4;
                int i27 = 1;
                java.util.ArrayList arrayList13 = uVar4.d;
                int size9 = arrayList13.size() - 1;
                while (size9 >= 0) {
                    defpackage.bv bvVar3 = (defpackage.bv) arrayList13.get(size9);
                    int i28 = bvVar3.a;
                    if (i28 == i27) {
                        arrayList12.remove(bvVar3.b);
                    } else if (i28 != 3) {
                        switch (i28) {
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                arrayList12.add(bvVar3.b);
                                break;
                            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                                arrayList12.remove(bvVar3.b);
                                break;
                            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                                awVar = null;
                                break;
                            case 9:
                                awVar = bvVar3.b;
                                break;
                            case 10:
                                bvVar3.i = bvVar3.h;
                                break;
                        }
                    } else {
                        arrayList12.add(bvVar3.b);
                    }
                    size9--;
                    i27 = 1;
                }
            } else {
                int i29 = 0;
                while (true) {
                    java.util.ArrayList arrayList14 = uVar4.d;
                    if (i29 < arrayList14.size()) {
                        defpackage.bv bvVar4 = (defpackage.bv) arrayList14.get(i29);
                        boolean z7 = z3;
                        int i30 = bvVar4.a;
                        if (i30 != i10) {
                            i6 = i9;
                            if (i30 != 2) {
                                if (i30 == 3 || i30 == 6) {
                                    arrayList12.remove(bvVar4.b);
                                    defpackage.aw awVar7 = bvVar4.b;
                                    if (awVar7 == awVar) {
                                        arrayList14.add(i29, new defpackage.bv(9, awVar7));
                                        i29++;
                                        awVar = null;
                                    }
                                } else if (i30 == 7) {
                                    i7 = 1;
                                } else if (i30 == 8) {
                                    arrayList14.add(i29, new defpackage.bv(9, awVar, null));
                                    bvVar4.c = true;
                                    awVar = bvVar4.b;
                                    i29++;
                                }
                                i7 = 1;
                            } else {
                                defpackage.aw awVar8 = bvVar4.b;
                                int i31 = awVar8.G;
                                int size10 = arrayList12.size() - 1;
                                boolean z8 = false;
                                while (size10 >= 0) {
                                    int i32 = size10;
                                    defpackage.aw awVar9 = (defpackage.aw) arrayList12.get(size10);
                                    boolean z9 = z4;
                                    if (awVar9.G != i31) {
                                        i31 = i31;
                                    } else if (awVar9 == awVar8) {
                                        i31 = i31;
                                        z8 = true;
                                    } else {
                                        if (awVar9 == awVar) {
                                            bArr = null;
                                            arrayList14.add(i29, new defpackage.bv(9, awVar9, null));
                                            i29++;
                                            awVar = null;
                                        } else {
                                            bArr = null;
                                        }
                                        defpackage.bv bvVar5 = new defpackage.bv(3, awVar9, bArr);
                                        bvVar5.d = bvVar4.d;
                                        bvVar5.f = bvVar4.f;
                                        bvVar5.e = bvVar4.e;
                                        bvVar5.g = bvVar4.g;
                                        arrayList14.add(i29, bvVar5);
                                        arrayList12.remove(awVar9);
                                        i29++;
                                        awVar = awVar;
                                    }
                                    size10 = i32 - 1;
                                    i31 = i31;
                                    z4 = z9;
                                }
                                z4 = z4;
                                i7 = 1;
                                if (z8) {
                                    arrayList14.remove(i29);
                                    i29--;
                                } else {
                                    bvVar4.a = 1;
                                    bvVar4.c = true;
                                    arrayList12.add(awVar8);
                                }
                            }
                            i29 += i7;
                            i10 = i7;
                            z3 = z7;
                            i9 = i6;
                            z4 = z4;
                        } else {
                            i6 = i9;
                            i7 = i10;
                        }
                        z4 = z4;
                        arrayList12.add(bvVar4.b);
                        i29 += i7;
                        i10 = i7;
                        z3 = z7;
                        i9 = i6;
                        z4 = z4;
                    } else {
                        z = z3;
                        i5 = i9;
                        z2 = z4;
                    }
                }
            }
            z4 = z2 || uVar4.j;
            i9 = i5 + 1;
            z3 = z;
        }
    }

    private final void au() {
        for (defpackage.ck ckVar : ao()) {
            if (ckVar.e) {
                if (Z(2)) {
                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                ckVar.e = false;
                ckVar.e();
            }
        }
    }

    private final void av(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new java.lang.IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((defpackage.u) arrayList.get(i)).s) {
                if (i2 != i) {
                    at(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((java.lang.Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((java.lang.Boolean) arrayList2.get(i2)).booleanValue() && !((defpackage.u) arrayList.get(i2)).s) {
                        i2++;
                    }
                }
                at(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            at(arrayList, arrayList2, i2, size);
        }
    }

    private final void aw(defpackage.aw awVar) {
        android.view.ViewGroup viewGroupAn = an(awVar);
        if (viewGroupAn == null || awVar.v() + awVar.w() + awVar.x() + awVar.dZ() <= 0) {
            return;
        }
        if (viewGroupAn.getTag(2131429440) == null) {
            viewGroupAn.setTag(2131429440, awVar);
        }
        ((defpackage.aw) viewGroupAn.getTag(2131429440)).aA(awVar.aF());
    }

    private final void ax() {
        java.util.Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            N((defpackage.bt) it.next());
        }
    }

    public static defpackage.aw f(android.view.View view) {
        while (view != null) {
            defpackage.aw awVarG = g(view);
            if (awVarG != null) {
                return awVarG;
            }
            java.lang.Object parent = view.getParent();
            view = parent instanceof android.view.View ? (android.view.View) parent : null;
        }
        return null;
    }

    public static defpackage.aw g(android.view.View view) {
        java.lang.Object tag = view.getTag(2131428300);
        if (tag instanceof defpackage.aw) {
            return (defpackage.aw) tag;
        }
        return null;
    }

    final void A() {
        if (this.g != null) {
            p();
        }
        E(5);
    }

    final void B(boolean z, boolean z2) {
        if (z2 && (this.n instanceof defpackage.dvt)) {
            T(new java.lang.IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (defpackage.aw awVar : this.c.g()) {
            if (awVar != null && z2) {
                awVar.D.B(z, true);
            }
        }
    }

    final void C() {
        this.w = false;
        this.x = false;
        this.z.g = false;
        E(7);
    }

    final void D() {
        this.w = false;
        this.x = false;
        this.z.g = false;
        E(5);
    }

    public final void E(int i) {
        try {
            this.B = true;
            for (defpackage.bt btVar : this.c.b.values()) {
                if (btVar != null) {
                    btVar.b = i;
                }
            }
            L(i, false);
            java.util.Iterator it = ao().iterator();
            while (it.hasNext()) {
                ((defpackage.ck) it.next()).f();
            }
            this.B = false;
            ak(true);
        } catch (java.lang.Throwable th) {
            this.B = false;
            throw th;
        }
    }

    final void F() {
        this.x = true;
        this.z.g = true;
        E(4);
    }

    public final void G(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        int size;
        defpackage.bu buVar = this.c;
        java.util.HashMap map = buVar.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (defpackage.bt btVar : map.values()) {
                printWriter.print(str);
                if (btVar != null) {
                    java.lang.String strValueOf = java.lang.String.valueOf(str);
                    defpackage.aw awVar = btVar.a;
                    printWriter.println(awVar);
                    awVar.ad(strValueOf.concat("    "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        java.util.ArrayList arrayList = buVar.a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                defpackage.aw awVar2 = (defpackage.aw) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(awVar2.toString());
            }
        }
        java.util.ArrayList arrayList2 = this.C;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                defpackage.aw awVar3 = (defpackage.aw) this.C.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(awVar3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                java.lang.String strValueOf2 = java.lang.String.valueOf(str);
                defpackage.u uVar = (defpackage.u) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(uVar.toString());
                uVar.f(strValueOf2.concat("    "), printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.j.get());
        java.util.ArrayList arrayList3 = this.b;
        synchronized (arrayList3) {
            int size4 = arrayList3.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    java.lang.Object obj = (defpackage.bl) arrayList3.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.o);
        if (this.p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.w);
        printWriter.print(" mStopped=");
        printWriter.print(this.x);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.y);
        if (this.v) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.v);
        }
    }

    public final void H() {
        java.util.Iterator it = ao().iterator();
        while (it.hasNext()) {
            ((defpackage.ck) it.next()).f();
        }
    }

    final void I(defpackage.bl blVar, boolean z) {
        if (!z) {
            if (this.n == null) {
                if (!this.y) {
                    throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new java.lang.IllegalStateException("FragmentManager has been destroyed");
            }
            ap();
        }
        java.util.ArrayList arrayList = this.b;
        synchronized (arrayList) {
            if (this.n == null) {
                if (!z) {
                    throw new java.lang.IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            arrayList.add(blVar);
            synchronized (arrayList) {
                try {
                    if (arrayList.size() == 1) {
                        this.n.d.removeCallbacks(this.O);
                        this.n.d.post(this.O);
                        U();
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    final void J(defpackage.bl blVar, boolean z) {
        if (z && (this.n == null || this.y)) {
            return;
        }
        as(z);
        defpackage.u uVar = this.g;
        if (uVar != null) {
            uVar.b = false;
            uVar.b();
            if (Z(3)) {
                android.util.Log.d("FragmentManager", "Reversing mTransitioningOp " + this.g + " as part of execSingleAction for action " + blVar);
            }
            this.g.i(false, false);
            this.g.g(this.L, this.M);
            java.util.ArrayList arrayList = this.g.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                defpackage.aw awVar = ((defpackage.bv) arrayList.get(i)).b;
                if (awVar != null) {
                    awVar.t = false;
                }
            }
            this.g = null;
        }
        blVar.g(this.L, this.M);
        this.B = true;
        try {
            av(this.L, this.M);
            aq();
            U();
            ar();
            this.c.i();
        } catch (java.lang.Throwable th) {
            aq();
            throw th;
        }
    }

    final void K(defpackage.aw awVar) {
        if (Z(2)) {
            java.util.Objects.toString(awVar);
            android.util.Log.v("FragmentManager", "hide: ".concat(java.lang.String.valueOf(awVar)));
        }
        if (awVar.I) {
            return;
        }
        awVar.I = true;
        awVar.W = !awVar.W;
        aw(awVar);
    }

    final void L(int i, boolean z) {
        defpackage.bd bdVar;
        if (this.n == null && i != -1) {
            throw new java.lang.IllegalStateException("No activity");
        }
        if (z || i != this.m) {
            this.m = i;
            defpackage.bu buVar = this.c;
            java.util.ArrayList arrayList = buVar.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                defpackage.bt btVar = (defpackage.bt) buVar.b.get(((defpackage.aw) arrayList.get(i2)).l);
                if (btVar != null) {
                    btVar.e();
                }
            }
            for (defpackage.bt btVar2 : buVar.b.values()) {
                if (btVar2 != null) {
                    btVar2.e();
                    defpackage.aw awVar = btVar2.a;
                    if (awVar.s && !awVar.aI()) {
                        boolean z2 = awVar.u;
                        buVar.k(btVar2);
                    }
                }
            }
            ax();
            if (this.v && (bdVar = this.n) != null && this.m == 7) {
                ((defpackage.ay) bdVar).a.invalidateOptionsMenu();
                this.v = false;
            }
        }
    }

    public final void M(android.support.v4.app.FragmentContainerView fragmentContainerView) {
        android.view.View view;
        for (defpackage.bt btVar : this.c.e()) {
            defpackage.aw awVar = btVar.a;
            if (awVar.G == fragmentContainerView.getId() && (view = awVar.Q) != null && view.getParent() == null) {
                awVar.P = fragmentContainerView;
                btVar.b();
                btVar.e();
            }
        }
    }

    final void N(defpackage.bt btVar) {
        defpackage.aw awVar = btVar.a;
        if (awVar.R) {
            if (this.B) {
                this.K = true;
            } else {
                awVar.R = false;
                btVar.e();
            }
        }
    }

    final void O(defpackage.aw awVar) {
        if (Z(2)) {
            android.util.Log.v("FragmentManager", "remove: " + awVar + " nesting=" + awVar.A);
        }
        boolean zAI = awVar.aI();
        if (awVar.J && zAI) {
            return;
        }
        this.c.l(awVar);
        if (ah(awVar)) {
            this.v = true;
        }
        awVar.s = true;
        aw(awVar);
    }

    final void P(android.os.Parcelable parcelable) {
        int i;
        defpackage.bt btVar;
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        android.os.Bundle bundle3 = (android.os.Bundle) parcelable;
        for (java.lang.String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.n.c.getClassLoader());
                this.E.put(str.substring(7), bundle2);
            }
        }
        java.util.HashMap map = new java.util.HashMap();
        for (java.lang.String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.n.c.getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        defpackage.bu buVar = this.c;
        java.util.HashMap map2 = buVar.c;
        map2.clear();
        map2.putAll(map);
        android.support.v4.app.FragmentManagerState fragmentManagerState = (android.support.v4.app.FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState != null) {
            buVar.b.clear();
            java.util.ArrayList arrayList = fragmentManagerState.a;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                i = 2;
                if (i2 >= size) {
                    break;
                }
                android.os.Bundle bundleA = buVar.a((java.lang.String) arrayList.get(i2), null);
                if (bundleA != null) {
                    defpackage.aw awVar = (defpackage.aw) this.z.b.get(((android.support.v4.app.FragmentState) bundleA.getParcelable("state")).b);
                    if (awVar != null) {
                        if (Z(2)) {
                            java.util.Objects.toString(awVar);
                            android.util.Log.v("FragmentManager", "restoreSaveState: re-attaching retained ".concat(awVar.toString()));
                        }
                        btVar = new defpackage.bt(this.A, buVar, awVar, bundleA);
                    } else {
                        btVar = new defpackage.bt(this.A, buVar, this.n.c.getClassLoader(), h(), bundleA);
                    }
                    defpackage.aw awVar2 = btVar.a;
                    awVar2.h = bundleA;
                    awVar2.B = this;
                    if (Z(2)) {
                        android.util.Log.v("FragmentManager", "restoreSaveState: active (" + awVar2.l + "): " + awVar2);
                    }
                    btVar.f(this.n.c.getClassLoader());
                    buVar.j(btVar);
                    btVar.b = this.m;
                }
                i2++;
            }
            for (defpackage.aw awVar3 : new java.util.ArrayList(this.z.b.values())) {
                if (!buVar.m(awVar3.l)) {
                    if (Z(2)) {
                        android.util.Log.v("FragmentManager", "Discarding retained Fragment " + awVar3 + " that was not found in the set of active Fragments " + fragmentManagerState.a);
                    }
                    this.z.e(awVar3);
                    awVar3.B = this;
                    defpackage.bt btVar2 = new defpackage.bt(this.A, buVar, awVar3);
                    btVar2.b = 1;
                    btVar2.e();
                    awVar3.s = true;
                    btVar2.e();
                }
            }
            java.util.ArrayList<java.lang.String> arrayList2 = fragmentManagerState.b;
            buVar.a.clear();
            if (arrayList2 != null) {
                for (java.lang.String str3 : arrayList2) {
                    defpackage.aw awVarB = buVar.b(str3);
                    if (awVarB == null) {
                        throw new java.lang.IllegalStateException(defpackage.a.bp((byte) 41, str3, "No instantiated fragment for ("));
                    }
                    if (Z(2)) {
                        android.util.Log.v("FragmentManager", defpackage.a.bo(awVarB, str3, "restoreSaveState: added (", "): "));
                    }
                    buVar.h(awVarB);
                }
            }
            android.support.v4.app.BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.c;
            if (backStackRecordStateArr != null) {
                this.d = new java.util.ArrayList(backStackRecordStateArr.length);
                int i3 = 0;
                while (true) {
                    android.support.v4.app.BackStackRecordState[] backStackRecordStateArr2 = fragmentManagerState.c;
                    if (i3 >= backStackRecordStateArr2.length) {
                        break;
                    }
                    android.support.v4.app.BackStackRecordState backStackRecordState = backStackRecordStateArr2[i3];
                    defpackage.u uVar = new defpackage.u(this);
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        int[] iArr = backStackRecordState.a;
                        if (i4 >= iArr.length) {
                            break;
                        }
                        defpackage.bv bvVar = new defpackage.bv();
                        int i6 = i4 + 1;
                        bvVar.a = iArr[i4];
                        if (Z(i)) {
                            android.util.Log.v("FragmentManager", "Instantiate " + uVar + " op #" + i5 + " base fragment #" + iArr[i6]);
                        }
                        bvVar.h = defpackage.emq.values()[backStackRecordState.c[i5]];
                        bvVar.i = defpackage.emq.values()[backStackRecordState.d[i5]];
                        int i7 = i4 + 2;
                        bvVar.c = iArr[i6] != 0;
                        int i8 = iArr[i7];
                        bvVar.d = i8;
                        int i9 = iArr[i4 + 3];
                        bvVar.e = i9;
                        int i10 = i4 + 5;
                        int i11 = iArr[i4 + 4];
                        bvVar.f = i11;
                        i4 += 6;
                        int i12 = iArr[i10];
                        bvVar.g = i12;
                        uVar.e = i8;
                        uVar.f = i9;
                        uVar.g = i11;
                        uVar.h = i12;
                        uVar.n(bvVar);
                        i5++;
                        i = i;
                    }
                    int i13 = i;
                    uVar.i = backStackRecordState.e;
                    uVar.l = backStackRecordState.f;
                    uVar.j = true;
                    uVar.m = backStackRecordState.h;
                    uVar.n = backStackRecordState.i;
                    uVar.o = backStackRecordState.j;
                    uVar.p = backStackRecordState.k;
                    uVar.q = backStackRecordState.l;
                    uVar.r = backStackRecordState.m;
                    uVar.s = backStackRecordState.n;
                    uVar.c = backStackRecordState.g;
                    int i14 = 0;
                    while (true) {
                        java.util.ArrayList arrayList3 = backStackRecordState.b;
                        if (i14 >= arrayList3.size()) {
                            break;
                        }
                        java.lang.String str4 = (java.lang.String) arrayList3.get(i14);
                        if (str4 != null) {
                            ((defpackage.bv) uVar.d.get(i14)).b = c(str4);
                        }
                        i14++;
                    }
                    uVar.a(1);
                    if (Z(i13)) {
                        android.util.Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + uVar.c + "): " + uVar);
                        java.io.PrintWriter printWriter = new java.io.PrintWriter((java.io.Writer) new cg());
                        uVar.f("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.d.add(uVar);
                    i3++;
                    i = i13;
                }
            } else {
                this.d = new java.util.ArrayList();
            }
            this.j.set(fragmentManagerState.d);
            java.lang.String str5 = fragmentManagerState.e;
            if (str5 != null) {
                defpackage.aw awVarC = c(str5);
                this.q = awVarC;
                z(awVarC);
            }
            java.util.ArrayList arrayList4 = fragmentManagerState.f;
            if (arrayList4 != null) {
                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                    this.D.put((java.lang.String) arrayList4.get(i15), (android.support.v4.app.BackStackState) fragmentManagerState.g.get(i15));
                }
            }
            this.u = new java.util.ArrayDeque(fragmentManagerState.h);
        }
    }

    final void Q(defpackage.aw awVar, boolean z) {
        android.view.ViewGroup viewGroupAn = an(awVar);
        if (viewGroupAn == null || !(viewGroupAn instanceof android.support.v4.app.FragmentContainerView)) {
            return;
        }
        ((android.support.v4.app.FragmentContainerView) viewGroupAn).a = !z;
    }

    final void R(defpackage.aw awVar, defpackage.emq emqVar) {
        if (!awVar.equals(c(awVar.l)) || (awVar.C != null && awVar.B != this)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bi(this, awVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        awVar.aa = emqVar;
    }

    final void S(defpackage.aw awVar) {
        if (awVar != null && (!awVar.equals(c(awVar.l)) || (awVar.C != null && awVar.B != this))) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bi(this, awVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        defpackage.aw awVar2 = this.q;
        this.q = awVar;
        z(awVar2);
        z(this.q);
    }

    public final void T(java.lang.RuntimeException runtimeException) {
        android.util.Log.e("FragmentManager", runtimeException.getMessage());
        android.util.Log.e("FragmentManager", "Activity state:");
        java.io.PrintWriter printWriter = new java.io.PrintWriter((java.io.Writer) new cg());
        defpackage.bd bdVar = this.n;
        if (bdVar == null) {
            try {
                G("  ", null, printWriter, new java.lang.String[0]);
                throw runtimeException;
            } catch (java.lang.Exception e) {
                android.util.Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            ((defpackage.ay) bdVar).a.dump("  ", null, printWriter, new java.lang.String[0]);
            throw runtimeException;
        } catch (java.lang.Exception e2) {
            android.util.Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final void U() {
        java.util.ArrayList arrayList = this.b;
        synchronized (arrayList) {
            if (!arrayList.isEmpty()) {
                this.i.f(true);
                if (Z(3)) {
                    android.util.Log.d("FragmentManager", defpackage.a.bg(this, "FragmentManager ", " enabling OnBackPressedCallback, caused by non-empty pending actions"));
                }
                return;
            }
            boolean z = a() > 0 && ab(this.p);
            if (Z(3)) {
                android.util.Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
            }
            this.i.f(z);
        }
    }

    final boolean V(android.view.MenuItem menuItem) {
        if (this.m <= 0) {
            return false;
        }
        for (defpackage.aw awVar : this.c.g()) {
            if (awVar != null) {
                if (!awVar.I ? awVar.D.V(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean W(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        if (this.m <= 0) {
            return false;
        }
        java.util.ArrayList arrayList = null;
        boolean z = false;
        for (defpackage.aw awVar : this.c.g()) {
            if (awVar != null && ai(awVar) && !awVar.I && awVar.D.W(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(awVar);
                z = true;
            }
        }
        if (this.C != null) {
            for (int i = 0; i < this.C.size(); i++) {
                defpackage.aw awVar2 = (defpackage.aw) this.C.get(i);
                if (arrayList != null) {
                    arrayList.contains(awVar2);
                }
            }
        }
        this.C = arrayList;
        return z;
    }

    public final boolean X(android.view.MenuItem menuItem) {
        if (this.m <= 0) {
            return false;
        }
        for (defpackage.aw awVar : this.c.g()) {
            if (awVar != null) {
                if (!awVar.I ? awVar.D.X(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean Y(android.view.Menu menu) {
        boolean z = false;
        if (this.m > 0) {
            for (defpackage.aw awVar : this.c.g()) {
                if (awVar != null && ai(awVar) && !awVar.I && awVar.D.Y(menu)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final int a() {
        return this.d.size() + (this.g != null ? 1 : 0);
    }

    public final boolean aa() {
        defpackage.aw awVar = this.p;
        if (awVar != null) {
            return awVar.aG() && awVar.J().aa();
        }
        return true;
    }

    final boolean ab(defpackage.aw awVar) {
        if (awVar == null) {
            return true;
        }
        defpackage.bo boVar = awVar.B;
        return awVar.equals(boVar.q) && ab(boVar.p);
    }

    public final boolean ac() {
        return this.w || this.x;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    final boolean ad(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.lang.String str, int i, int i2) {
        int size;
        if (this.d.isEmpty()) {
            size = -1;
        } else if (str != null || i >= 0) {
            int size2 = this.d.size() - 1;
            while (size2 >= 0) {
                defpackage.u uVar = (defpackage.u) this.d.get(size2);
                if ((str != null && str.equals(uVar.l)) || (i >= 0 && i == uVar.c)) {
                    break;
                }
                size2--;
            }
            if (size2 < 0) {
                size = size2;
            } else if (i2 != 0) {
                while (size2 > 0) {
                    int i3 = size2 - 1;
                    defpackage.u uVar2 = (defpackage.u) this.d.get(i3);
                    if ((str == null || !str.equals(uVar2.l)) && (i < 0 || i != uVar2.c)) {
                        break;
                    }
                    size2 = i3;
                }
                size = size2;
            } else if (size2 == this.d.size() - 1) {
                size = -1;
            } else {
                size = size2 + 1;
            }
        } else {
            size = i2 != 0 ? 0 : this.d.size() - 1;
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add((defpackage.u) this.d.remove(size3));
            arrayList2.add(java.lang.Boolean.TRUE);
        }
        return true;
    }

    public final void ae(defpackage.ahpw ahpwVar) {
        this.k.add(ahpwVar);
    }

    public final void af() {
        ak(true);
        au();
    }

    public final void ak(boolean z) {
        defpackage.u uVar;
        as(z);
        if (!this.h && (uVar = this.g) != null) {
            uVar.b = false;
            uVar.b();
            if (Z(3)) {
                android.util.Log.d("FragmentManager", "Reversing mTransitioningOp " + this.g + " as part of execPendingActions for actions " + this.b);
            }
            this.g.i(false, false);
            this.b.add(0, this.g);
            java.util.ArrayList arrayList = this.g.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                defpackage.aw awVar = ((defpackage.bv) arrayList.get(i)).b;
                if (awVar != null) {
                    awVar.t = false;
                }
            }
            this.g = null;
        }
        while (true) {
            java.util.ArrayList arrayList2 = this.L;
            java.util.ArrayList arrayList3 = this.M;
            java.util.ArrayList arrayList4 = this.b;
            synchronized (arrayList4) {
                if (arrayList4.isEmpty()) {
                    break;
                }
                try {
                    int size2 = arrayList4.size();
                    boolean zG = false;
                    for (int i2 = 0; i2 < size2; i2++) {
                        zG |= ((defpackage.bl) arrayList4.get(i2)).g(arrayList2, arrayList3);
                    }
                    arrayList4.clear();
                    this.n.d.removeCallbacks(this.O);
                    if (!zG) {
                        break;
                    }
                    this.B = true;
                    try {
                        av(this.L, this.M);
                        aq();
                    } catch (java.lang.Throwable th) {
                        aq();
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    this.b.clear();
                    this.n.d.removeCallbacks(this.O);
                    throw th2;
                }
            }
        }
        U();
        ar();
        this.c.i();
    }

    public final boolean al(java.lang.String str, int i) {
        ak(false);
        as(true);
        defpackage.aw awVar = this.q;
        if (awVar != null && str == null && awVar.I().al(null, 0)) {
            return true;
        }
        boolean zAd = ad(this.L, this.M, str, -1, i);
        if (zAd) {
            this.B = true;
            try {
                av(this.L, this.M);
                aq();
            } catch (java.lang.Throwable th) {
                aq();
                throw th;
            }
        }
        U();
        ar();
        this.c.i();
        return zAd;
    }

    public final defpackage.den am() {
        defpackage.aw awVar = this.p;
        return awVar != null ? awVar.B.am() : this.Q;
    }

    final android.os.Bundle b() {
        android.support.v4.app.BackStackRecordState[] backStackRecordStateArr;
        java.util.ArrayList arrayList;
        android.os.Bundle bundle = new android.os.Bundle();
        au();
        H();
        ak(true);
        this.w = true;
        this.z.g = true;
        defpackage.bu buVar = this.c;
        java.util.HashMap map = buVar.b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(map.size());
        for (defpackage.bt btVar : map.values()) {
            if (btVar != null) {
                defpackage.aw awVar = btVar.a;
                buVar.a(awVar.l, btVar.a());
                arrayList2.add(awVar.l);
                if (Z(2)) {
                    android.util.Log.v("FragmentManager", "Saved state of " + awVar + ": " + awVar.h);
                }
            }
        }
        java.util.HashMap map2 = buVar.c;
        if (!map2.isEmpty()) {
            java.util.ArrayList<defpackage.aw> arrayList3 = buVar.a;
            synchronized (arrayList3) {
                backStackRecordStateArr = null;
                if (arrayList3.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new java.util.ArrayList(arrayList3.size());
                    for (defpackage.aw awVar2 : arrayList3) {
                        arrayList.add(awVar2.l);
                        if (Z(2)) {
                            android.util.Log.v("FragmentManager", "saveAllState: adding fragment (" + awVar2.l + "): " + awVar2);
                        }
                    }
                }
            }
            int size = this.d.size();
            if (size > 0) {
                backStackRecordStateArr = new android.support.v4.app.BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new android.support.v4.app.BackStackRecordState((defpackage.u) this.d.get(i));
                    if (Z(2)) {
                        android.util.Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.d.get(i));
                    }
                }
            }
            android.support.v4.app.FragmentManagerState fragmentManagerState = new android.support.v4.app.FragmentManagerState();
            fragmentManagerState.a = arrayList2;
            fragmentManagerState.b = arrayList;
            fragmentManagerState.c = backStackRecordStateArr;
            fragmentManagerState.d = this.j.get();
            defpackage.aw awVar3 = this.q;
            if (awVar3 != null) {
                fragmentManagerState.e = awVar3.l;
            }
            java.util.ArrayList arrayList4 = fragmentManagerState.f;
            java.util.Map map3 = this.D;
            arrayList4.addAll(map3.keySet());
            fragmentManagerState.g.addAll(map3.values());
            fragmentManagerState.h = new java.util.ArrayList(this.u);
            bundle.putParcelable("state", fragmentManagerState);
            java.util.Map map4 = this.E;
            for (java.lang.String str : map4.keySet()) {
                bundle.putBundle("result_".concat(java.lang.String.valueOf(str)), (android.os.Bundle) map4.get(str));
            }
            for (java.lang.String str2 : map2.keySet()) {
                bundle.putBundle("fragment_".concat(java.lang.String.valueOf(str2)), (android.os.Bundle) map2.get(str2));
            }
        } else if (Z(2)) {
            android.util.Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    final defpackage.aw c(java.lang.String str) {
        return this.c.b(str);
    }

    public final defpackage.aw d(int i) {
        defpackage.bu buVar = this.c;
        java.util.ArrayList arrayList = buVar.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (defpackage.bt btVar : buVar.b.values()) {
                    if (btVar != null) {
                        defpackage.aw awVar = btVar.a;
                        if (awVar.F == i) {
                            return awVar;
                        }
                    }
                }
                return null;
            }
            defpackage.aw awVar2 = (defpackage.aw) arrayList.get(size);
            if (awVar2 != null && awVar2.F == i) {
                return awVar2;
            }
        }
    }

    public final defpackage.aw e(java.lang.String str) {
        defpackage.bu buVar = this.c;
        if (str != null) {
            java.util.ArrayList arrayList = buVar.a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                defpackage.aw awVar = (defpackage.aw) arrayList.get(size);
                if (awVar != null && str.equals(awVar.H)) {
                    return awVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (defpackage.bt btVar : buVar.b.values()) {
            if (btVar != null) {
                defpackage.aw awVar2 = btVar.a;
                if (str.equals(awVar2.H)) {
                    return awVar2;
                }
            }
        }
        return null;
    }

    public final defpackage.bc h() {
        defpackage.aw awVar = this.p;
        return awVar != null ? awVar.B.h() : this.J;
    }

    final defpackage.bt i(defpackage.aw awVar) {
        java.lang.String str = awVar.Z;
        if (str != null) {
            eku.a(awVar, str);
        }
        if (Z(2)) {
            java.util.Objects.toString(awVar);
            android.util.Log.v("FragmentManager", "add: ".concat(java.lang.String.valueOf(awVar)));
        }
        defpackage.bt btVarJ = j(awVar);
        awVar.B = this;
        defpackage.bu buVar = this.c;
        buVar.j(btVarJ);
        if (!awVar.J) {
            buVar.h(awVar);
            awVar.s = false;
            if (awVar.Q == null) {
                awVar.W = false;
            }
            if (ah(awVar)) {
                this.v = true;
            }
        }
        return btVarJ;
    }

    final defpackage.bt j(defpackage.aw awVar) {
        defpackage.bu buVar = this.c;
        defpackage.bt btVarD = buVar.d(awVar.l);
        if (btVarD != null) {
            return btVarD;
        }
        defpackage.bt btVar = new defpackage.bt(this.A, buVar, awVar);
        btVar.f(this.n.c.getClassLoader());
        btVar.b = this.m;
        return btVar;
    }

    public final java.util.List k() {
        return this.c.g();
    }

    final java.util.Set l(java.util.ArrayList arrayList, int i, int i2) {
        android.view.ViewGroup viewGroup;
        java.util.HashSet hashSet = new java.util.HashSet();
        while (i < i2) {
            java.util.ArrayList arrayList2 = ((defpackage.u) arrayList.get(i)).d;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                defpackage.aw awVar = ((defpackage.bv) arrayList2.get(i3)).b;
                if (awVar != null && (viewGroup = awVar.P) != null) {
                    hashSet.add(defpackage.den.bV(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void m(defpackage.br brVar) {
        this.l.add(brVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [emx] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [bd, br, eoi, nh] */
    /* JADX WARN: Type inference failed for: r4v7, types: [bd, gii] */
    /* JADX WARN: Type inference failed for: r4v8, types: [bd, oo] */
    /* JADX WARN: Type inference failed for: r4v9, types: [bd, dvz] */
    /* JADX WARN: Type inference failed for: r5v20, types: [nf] */
    public final void n(defpackage.bd bdVar, defpackage.bb bbVar, defpackage.aw awVar) {
        defpackage.bq bqVar;
        if (this.n != null) {
            throw new java.lang.IllegalStateException("Already attached");
        }
        this.n = bdVar;
        this.o = bbVar;
        this.p = awVar;
        if (awVar != null) {
            m(new defpackage.bi());
        } else if (bdVar instanceof defpackage.br) {
            m(bdVar);
        }
        if (this.p != null) {
            U();
        }
        if (bdVar instanceof defpackage.nh) {
            ?? Fc = bdVar.fc();
            this.f = Fc;
            Fc.d(awVar != null ? awVar : bdVar, this.i);
        }
        int i = 0;
        if (awVar != null) {
            defpackage.bq bqVar2 = awVar.B.z;
            java.util.HashMap map = bqVar2.c;
            bqVar = (defpackage.bq) map.get(awVar.l);
            if (bqVar == null) {
                bqVar = new defpackage.bq(bqVar2.e);
                map.put(awVar.l, bqVar);
            }
            this.z = bqVar;
        } else {
            if (bdVar instanceof defpackage.eoi) {
                bqVar = (defpackage.bq) new defpackage.eog(bdVar.S(), defpackage.bq.a).a(defpackage.bq.class);
                this.z = bqVar;
            } else {
                bqVar = new defpackage.bq(false);
                this.z = bqVar;
            }
            awVar = null;
        }
        bqVar.g = ac();
        this.c.d = bqVar;
        ?? r4 = this.n;
        if ((r4 instanceof defpackage.gii) && awVar == null) {
            defpackage.aaha aahaVarAT = r4.aT();
            aahaVarAT.e("android:support:fragments", new defpackage.bf(this, i));
            android.os.Bundle bundleC = aahaVarAT.c("android:support:fragments");
            if (bundleC != null) {
                P(bundleC);
            }
        }
        ?? r5 = this.n;
        if (r5 instanceof defpackage.oo) {
            defpackage.on onVarD = r5.d();
            java.lang.String strConcat = awVar != null ? java.lang.String.valueOf(awVar.l).concat(":") : "";
            defpackage.pb pbVar = new defpackage.pb();
            defpackage.bj bjVar = new defpackage.bj(this, 0);
            java.lang.String strConcat2 = "FragmentManager:".concat(strConcat);
            this.r = onVarD.a(strConcat2.concat("StartActivityForResult"), pbVar, bjVar);
            this.s = onVarD.a(strConcat2.concat("StartIntentSenderForResult"), new defpackage.bk(), new defpackage.bj(this, 2));
            this.t = onVarD.a(strConcat2.concat("RequestPermissions"), new defpackage.oz(), new defpackage.bj(this, 1));
        }
        ?? r6 = this.n;
        if (r6 instanceof defpackage.dvz) {
            r6.e(this.F);
        }
        defpackage.bd bdVar2 = this.n;
        if (bdVar2 instanceof defpackage.dwa) {
            defpackage.dxw dxwVar = this.G;
            defpackage.az azVar = ((defpackage.ay) bdVar2).a;
            if (dxwVar == null) {
                defpackage.aooh.i("listener");
            }
            azVar.h.add(dxwVar);
        }
        defpackage.bd bdVar3 = this.n;
        if (bdVar3 instanceof defpackage.dvs) {
            defpackage.dxw dxwVar2 = this.H;
            defpackage.az azVar2 = ((defpackage.ay) bdVar3).a;
            if (dxwVar2 == null) {
                defpackage.aooh.i("listener");
            }
            azVar2.j.add(dxwVar2);
        }
        defpackage.bd bdVar4 = this.n;
        if (bdVar4 instanceof defpackage.dvt) {
            defpackage.dxw dxwVar3 = this.I;
            defpackage.az azVar3 = ((defpackage.ay) bdVar4).a;
            if (dxwVar3 == null) {
                defpackage.aooh.i("listener");
            }
            azVar3.k.add(dxwVar3);
        }
        defpackage.bd bdVar5 = this.n;
        if ((bdVar5 instanceof defpackage.dys) && awVar == null) {
            defpackage.apnt apntVar = this.P;
            defpackage.az azVar4 = ((defpackage.ay) bdVar5).a;
            if (apntVar == null) {
                defpackage.aooh.i("provider");
            }
            defpackage.aogc aogcVar = azVar4.m;
            ((java.util.concurrent.CopyOnWriteArrayList) aogcVar.b).add(apntVar);
            aogcVar.a.run();
        }
    }

    public void noteStateNotSaved() {
        if (this.n != null) {
            this.w = false;
            this.x = false;
            this.z.g = false;
            for (defpackage.aw awVar : this.c.g()) {
                if (awVar != null) {
                    awVar.D.noteStateNotSaved();
                }
            }
        }
    }

    final void o(defpackage.aw awVar) {
        if (Z(2)) {
            java.util.Objects.toString(awVar);
            android.util.Log.v("FragmentManager", "attach: ".concat(java.lang.String.valueOf(awVar)));
        }
        if (awVar.J) {
            awVar.J = false;
            if (awVar.r) {
                return;
            }
            this.c.h(awVar);
            if (Z(2)) {
                java.util.Objects.toString(awVar);
                android.util.Log.v("FragmentManager", "add from attach: ".concat(java.lang.String.valueOf(awVar)));
            }
            if (ah(awVar)) {
                this.v = true;
            }
        }
    }

    final void p() {
        if (Z(3)) {
            defpackage.u uVar = this.g;
            java.util.Objects.toString(uVar);
            android.util.Log.d("FragmentManager", "cancelBackStackTransition for transition ".concat(java.lang.String.valueOf(uVar)));
        }
        defpackage.u uVar2 = this.g;
        if (uVar2 != null) {
            uVar2.b = false;
            uVar2.b();
            defpackage.u uVar3 = this.g;
            defpackage.ae aeVar = new defpackage.ae(this, 16);
            if (uVar3.t == null) {
                uVar3.t = new java.util.ArrayList();
            }
            uVar3.t.add(aeVar);
            this.g.i(false, true);
            this.h = true;
            af();
            this.h = false;
            this.g = null;
        }
    }

    final void q(defpackage.aw awVar) {
        if (Z(2)) {
            java.util.Objects.toString(awVar);
            android.util.Log.v("FragmentManager", "detach: ".concat(java.lang.String.valueOf(awVar)));
        }
        if (awVar.J) {
            return;
        }
        awVar.J = true;
        if (awVar.r) {
            if (Z(2)) {
                java.util.Objects.toString(awVar);
                android.util.Log.v("FragmentManager", "remove from detach: ".concat(java.lang.String.valueOf(awVar)));
            }
            this.c.l(awVar);
            if (ah(awVar)) {
                this.v = true;
            }
            aw(awVar);
        }
    }

    final void r() {
        this.w = false;
        this.x = false;
        this.z.g = false;
        E(4);
    }

    final void s(android.content.res.Configuration configuration, boolean z) {
        if (z && (this.n instanceof defpackage.dvz)) {
            T(new java.lang.IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (defpackage.aw awVar : this.c.g()) {
            if (awVar != null) {
                awVar.onConfigurationChanged(configuration);
                if (z) {
                    awVar.D.s(configuration, true);
                }
            }
        }
    }

    final void t() {
        this.w = false;
        this.x = false;
        this.z.g = false;
        E(1);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" in ");
        defpackage.aw awVar = this.p;
        if (awVar != null) {
            sb.append(awVar.getClass().getSimpleName());
            sb.append('{');
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this.p)));
            sb.append('}');
        } else {
            defpackage.bd bdVar = this.n;
            if (bdVar != null) {
                sb.append(bdVar.getClass().getSimpleName());
                sb.append('{');
                sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this.n)));
                sb.append('}');
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [bd, dvz] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map] */
    final void u() {
        this.y = true;
        ak(true);
        H();
        defpackage.bd bdVar = this.n;
        if (bdVar instanceof defpackage.eoi ? this.c.d.f : true ^ ((android.app.Activity) bdVar.c).isChangingConfigurations()) {
            java.util.Iterator it = this.D.values().iterator();
            while (it.hasNext()) {
                java.util.Iterator it2 = ((android.support.v4.app.BackStackState) it.next()).a.iterator();
                while (it2.hasNext()) {
                    this.c.d.c((java.lang.String) it2.next(), false);
                }
            }
        }
        E(-1);
        defpackage.bd bdVar2 = this.n;
        if (bdVar2 instanceof defpackage.dwa) {
            defpackage.dxw dxwVar = this.G;
            defpackage.az azVar = ((defpackage.ay) bdVar2).a;
            defpackage.aooh.f(dxwVar, "listener");
            azVar.h.remove(dxwVar);
        }
        ?? r0 = this.n;
        if (r0 instanceof defpackage.dvz) {
            r0.fg(this.F);
        }
        defpackage.bd bdVar3 = this.n;
        if (bdVar3 instanceof defpackage.dvs) {
            defpackage.dxw dxwVar2 = this.H;
            defpackage.az azVar2 = ((defpackage.ay) bdVar3).a;
            defpackage.aooh.f(dxwVar2, "listener");
            azVar2.j.remove(dxwVar2);
        }
        defpackage.bd bdVar4 = this.n;
        if (bdVar4 instanceof defpackage.dvt) {
            defpackage.dxw dxwVar3 = this.I;
            defpackage.az azVar3 = ((defpackage.ay) bdVar4).a;
            defpackage.aooh.f(dxwVar3, "listener");
            azVar3.k.remove(dxwVar3);
        }
        defpackage.bd bdVar5 = this.n;
        if ((bdVar5 instanceof defpackage.dys) && this.p == null) {
            defpackage.apnt apntVar = this.P;
            defpackage.az azVar4 = ((defpackage.ay) bdVar5).a;
            defpackage.aooh.f(apntVar, "provider");
            defpackage.aogc aogcVar = azVar4.m;
            ((java.util.concurrent.CopyOnWriteArrayList) aogcVar.b).remove(apntVar);
            if (((yv) aogcVar.c.remove(apntVar)) != null) {
                throw null;
            }
            aogcVar.a.run();
        }
        this.n = null;
        this.o = null;
        this.p = null;
        if (this.f != null) {
            this.i.e();
            this.f = null;
        }
        defpackage.ok okVar = this.r;
        if (okVar != null) {
            okVar.a();
            this.s.a();
            this.t.a();
        }
    }

    final void v(boolean z) {
        if (z && (this.n instanceof defpackage.dwa)) {
            T(new java.lang.IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (defpackage.aw awVar : this.c.g()) {
            if (awVar != null) {
                awVar.onLowMemory();
                if (z) {
                    awVar.D.v(true);
                }
            }
        }
    }

    final void w(boolean z, boolean z2) {
        if (z2 && (this.n instanceof defpackage.dvs)) {
            T(new java.lang.IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (defpackage.aw awVar : this.c.g()) {
            if (awVar != null) {
                awVar.ak(z);
                if (z2) {
                    awVar.D.w(z, true);
                }
            }
        }
    }

    final void x() {
        for (defpackage.aw awVar : this.c.f()) {
            if (awVar != null) {
                awVar.aj(awVar.aH());
                awVar.D.x();
            }
        }
    }

    public final void y(android.view.Menu menu) {
        if (this.m > 0) {
            for (defpackage.aw awVar : this.c.g()) {
                if (awVar != null && !awVar.I) {
                    awVar.D.y(menu);
                }
            }
        }
    }

    public final void z(defpackage.aw awVar) {
        if (awVar == null || !awVar.equals(c(awVar.l))) {
            return;
        }
        boolean zAb = awVar.B.ab(awVar);
        java.lang.Boolean bool = awVar.q;
        if (bool == null || bool.booleanValue() != zAb) {
            awVar.q = java.lang.Boolean.valueOf(zAb);
            defpackage.bo boVar = awVar.D;
            boVar.U();
            boVar.z(boVar.q);
        }
    }
}
