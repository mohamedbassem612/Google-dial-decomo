package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class frz extends defpackage.fsg {
    private boolean A;
    private long B;
    private final int l;
    private final int m;
    private final int n;
    private java.util.List r;
    private java.util.List s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private byte x;
    private byte y;
    private static final int[] d = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] e = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] a = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] f = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] g = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] h = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] i = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] j = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final defpackage.etx k = new defpackage.etx();
    private final java.util.ArrayList p = new java.util.ArrayList();
    private defpackage.fry q = new defpackage.fry(0, 4);
    private int z = 0;
    private final long o = 16000000;

    public frz(java.lang.String str, int i2) {
        this.l = true != "application/x-mp4-cea-608".equals(str) ? 3 : 2;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.n = 0;
                } else if (i2 != 4) {
                    defpackage.etr.f("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                    this.n = 0;
                    this.m = 0;
                } else {
                    this.n = 1;
                }
                this.m = 1;
            } else {
                this.n = 1;
            }
            n(0);
            m();
            this.A = true;
            this.B = -9223372036854775807L;
        }
        this.n = 0;
        this.m = 0;
        n(0);
        m();
        this.A = true;
        this.B = -9223372036854775807L;
    }

    private static char k(byte b) {
        return (char) f[b - 32];
    }

    private final java.util.List l() {
        java.util.ArrayList arrayList = this.p;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
        int iMin = 2;
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.ess essVarB = ((defpackage.fry) arrayList.get(i2)).b(Integer.MIN_VALUE);
            arrayList2.add(essVarB);
            if (essVarB != null) {
                iMin = java.lang.Math.min(iMin, essVarB.C);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.ess essVarB2 = (defpackage.ess) arrayList2.get(i3);
            if (essVarB2 != null) {
                if (essVarB2.C != iMin) {
                    essVarB2 = ((defpackage.fry) arrayList.get(i3)).b(iMin);
                    ahvr.ci(essVarB2);
                }
                arrayList3.add(essVarB2);
            }
        }
        return arrayList3;
    }

    private final void m() {
        this.q.e(this.t);
        java.util.ArrayList arrayList = this.p;
        arrayList.clear();
        arrayList.add(this.q);
    }

    private final void n(int i2) {
        int i3 = this.t;
        if (i3 == i2) {
            return;
        }
        this.t = i2;
        if (i2 != 3) {
            m();
            if (i3 == 3 || i2 == 1 || i2 == 0) {
                this.r = java.util.Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i4 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.p;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((defpackage.fry) arrayList.get(i4)).g = 3;
            i4++;
        }
    }

    private final void o(int i2) {
        this.u = i2;
        this.q.h = i2;
    }

    private static boolean q(byte b) {
        return (b & 224) == 0;
    }

    @Override // defpackage.fsg, defpackage.ewr
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        return b();
    }

    @Override // defpackage.fsg, defpackage.ewr
    public final void c() {
        super.c();
        this.r = null;
        this.s = null;
        n(0);
        o(4);
        m();
        this.v = false;
        this.w = false;
        this.x = (byte) 0;
        this.y = (byte) 0;
        this.z = 0;
        this.A = true;
        this.B = -9223372036854775807L;
    }

    @Override // defpackage.fsg
    protected final defpackage.frj g() {
        java.util.List list = this.r;
        this.s = list;
        ahvr.ci(list);
        return new defpackage.fsh(list);
    }

    @Override // defpackage.fsg
    /* JADX INFO: renamed from: h */
    public final defpackage.frp b() {
        defpackage.frp frpVar;
        defpackage.frp frpVarB = super.b();
        if (frpVarB != null) {
            return frpVarB;
        }
        long j2 = this.o;
        long j3 = this.B;
        if (j3 == -9223372036854775807L || this.c - j3 < j2 || (frpVar = (defpackage.frp) this.b.pollFirst()) == null) {
            return null;
        }
        this.r = java.util.Collections.EMPTY_LIST;
        this.B = -9223372036854775807L;
        frpVar.f(this.c, g(), Long.MAX_VALUE);
        return frpVar;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x017d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0183 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0193  */
    /* JADX WARN: Code duplicated, block: B:124:0x0199  */
    /* JADX WARN: Code duplicated, block: B:126:0x019d  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:135:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e8 A[LOOP:1: B:138:0x01e2->B:140:0x01e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:145:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:146:0x0202  */
    /* JADX WARN: Code duplicated, block: B:147:0x020b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0213  */
    /* JADX WARN: Code duplicated, block: B:149:0x021c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0221  */
    /* JADX WARN: Code duplicated, block: B:151:0x0227  */
    /* JADX WARN: Code duplicated, block: B:153:0x0234  */
    /* JADX WARN: Code duplicated, block: B:171:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00de  */
    /* JADX WARN: Code duplicated, block: B:71:0x00df A[PHI: r2
      0x00df: PHI (r2v9 int) = (r2v8 int), (r2v37 int) binds: [B:65:0x00c7, B:70:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:80:0x0104  */
    /* JADX WARN: Code duplicated, block: B:81:0x0105 A[DONT_INVERT, PHI: r13
      0x0105: PHI (r13v7 int) = (r13v6 int), (r13v9 int) binds: [B:72:0x00e3, B:80:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0107  */
    /* JADX WARN: Code duplicated, block: B:89:0x0121  */
    /* JADX WARN: Code duplicated, block: B:91:0x0125  */
    @Override // defpackage.fsg
    protected final void i(defpackage.fro froVar) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        java.util.List list;
        int iMin;
        int i7;
        int i8;
        java.nio.ByteBuffer byteBuffer = froVar.d;
        ahvr.ci(byteBuffer);
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        defpackage.etx etxVar = this.k;
        etxVar.O(bArrArray, iLimit);
        boolean z2 = false;
        while (true) {
            int iD = etxVar.d();
            int i9 = this.l;
            if (iD < i9) {
                if (z2) {
                    int i10 = this.t;
                    if (i10 == 1 || i10 == 3) {
                        this.r = l();
                        this.B = this.c;
                        return;
                    }
                    return;
                }
                return;
            }
            int iN = i9 == 2 ? -4 : etxVar.n();
            int iN2 = etxVar.n();
            int iN3 = etxVar.n();
            if ((iN & 2) == 0 && (iN & 1) == this.m) {
                int i11 = iN2 & 127;
                int i12 = iN3 & 127;
                if (i11 != 0 || i12 != 0) {
                    boolean z3 = this.v;
                    if ((iN & 4) == 4) {
                        boolean[] zArr = j;
                        if (zArr[iN2] && zArr[iN3]) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    byte b = (byte) i11;
                    byte b2 = (byte) i12;
                    this.v = z;
                    if (!z || (iN2 & 112) != 16) {
                        this.w = false;
                        if (!z) {
                            if (i11 <= 0 && i11 <= 15) {
                                this.A = false;
                            } else if ((iN2 & 118) == 20) {
                                if (i12 == 32 && i12 != 47) {
                                    switch (i12) {
                                        default:
                                            switch (i12) {
                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                                    this.A = false;
                                                    break;
                                            }
                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                        case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                            this.A = true;
                                            break;
                                    }
                                } else {
                                    this.A = true;
                                }
                            }
                            if (!this.A) {
                                if (q(b)) {
                                    this.z = (i11 >> 3) & 1;
                                }
                                if (this.z != this.n) {
                                    if (q(b)) {
                                        i3 = iN2 & 119;
                                        if (i3 != 17) {
                                            i4 = iN2 & 118;
                                            if (i4 != 18) {
                                                if (i3 != 17 && (iN3 & 112) == 32) {
                                                    int i13 = i12 >> 1;
                                                    boolean z4 = 1 == (iN3 & 1);
                                                    this.q.c(' ');
                                                    this.q.f(i13 & 7, z4);
                                                } else if ((iN2 & 112) != 16 && (iN3 & 64) == 64) {
                                                    int i14 = i12 >> 1;
                                                    int i15 = iN3 & 1;
                                                    int i16 = d[iN2 & 7];
                                                    if ((iN3 & 32) != 0) {
                                                        i16++;
                                                    }
                                                    defpackage.fry fryVar = this.q;
                                                    if (i16 != fryVar.d) {
                                                        if (this.t != 1 && !fryVar.g()) {
                                                            defpackage.fry fryVar2 = new defpackage.fry(this.t, this.u);
                                                            this.q = fryVar2;
                                                            this.p.add(fryVar2);
                                                        }
                                                        fryVar = this.q;
                                                        fryVar.d = i16;
                                                    }
                                                    int i17 = i14 & 7;
                                                    int i18 = iN3 & 16;
                                                    fryVar.f(i18 == 16 ? 8 : i17, 1 == i15);
                                                    if (i18 == 16) {
                                                        this.q.e = e[i17];
                                                    }
                                                } else if (i3 != 23 && i12 >= 33 && i12 <= 35) {
                                                    this.q.f = i12 - 32;
                                                } else if (i4 == 20 && (iN3 & 112) == 32) {
                                                    if (i12 == 32) {
                                                        n(2);
                                                    } else if (i12 != 41) {
                                                        switch (i12) {
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                n(1);
                                                                o(2);
                                                                break;
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                n(1);
                                                                o(3);
                                                                break;
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                n(1);
                                                                o(4);
                                                                break;
                                                            default:
                                                                i5 = this.t;
                                                                if (i5 != 0) {
                                                                    if (i12 != 33) {
                                                                        switch (i12) {
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.r = java.util.Collections.EMPTY_LIST;
                                                                                i6 = this.t;
                                                                                if (i6 != 1 || i6 == 3) {
                                                                                    m();
                                                                                }
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (i5 == 1 && !this.q.g()) {
                                                                                    defpackage.fry fryVar3 = this.q;
                                                                                    list = fryVar3.b;
                                                                                    list.add(fryVar3.a());
                                                                                    fryVar3.c.setLength(0);
                                                                                    fryVar3.a.clear();
                                                                                    iMin = java.lang.Math.min(fryVar3.h, fryVar3.d);
                                                                                    while (list.size() >= iMin) {
                                                                                        list.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                m();
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.r = l();
                                                                                m();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.q.d();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        n(3);
                                                    }
                                                }
                                            } else if ((iN3 & 96) == 32) {
                                                i7 = iN3 & 31;
                                                this.q.d();
                                                defpackage.fry fryVar4 = this.q;
                                                if ((iN2 & 1) == 0) {
                                                    i8 = h[i7];
                                                } else {
                                                    i8 = i[i7];
                                                }
                                                fryVar4.c((char) i8);
                                            } else {
                                                i4 = 18;
                                                if (i3 != 17) {
                                                    if ((iN2 & 112) != 16) {
                                                        if (i3 != 23) {
                                                            if (i4 == 20) {
                                                                if (i12 == 32) {
                                                                    n(2);
                                                                } else if (i12 != 41) {
                                                                    switch (i12) {
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                            n(1);
                                                                            o(2);
                                                                            break;
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                            n(1);
                                                                            o(3);
                                                                            break;
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                            n(1);
                                                                            o(4);
                                                                            break;
                                                                        default:
                                                                            i5 = this.t;
                                                                            if (i5 != 0) {
                                                                                if (i12 != 33) {
                                                                                    switch (i12) {
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                            this.r = java.util.Collections.EMPTY_LIST;
                                                                                            i6 = this.t;
                                                                                            if (i6 != 1) {
                                                                                                m();
                                                                                            } else {
                                                                                                m();
                                                                                            }
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                            if (i5 == 1) {
                                                                                                defpackage.fry fryVar5 = this.q;
                                                                                                list = fryVar5.b;
                                                                                                list.add(fryVar5.a());
                                                                                                fryVar5.c.setLength(0);
                                                                                                fryVar5.a.clear();
                                                                                                iMin = java.lang.Math.min(fryVar5.h, fryVar5.d);
                                                                                                while (list.size() >= iMin) {
                                                                                                    list.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                            m();
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                            this.r = l();
                                                                                            m();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.q.d();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    n(3);
                                                                }
                                                            }
                                                        } else if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar6 = this.q;
                                                                                            list = fryVar6.b;
                                                                                            list.add(fryVar6.a());
                                                                                            fryVar6.c.setLength(0);
                                                                                            fryVar6.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar6.h, fryVar6.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar7 = this.q;
                                                                                            list = fryVar7.b;
                                                                                            list.add(fryVar7.a());
                                                                                            fryVar7.c.setLength(0);
                                                                                            fryVar7.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar7.h, fryVar7.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar8 = this.q;
                                                                                        list = fryVar8.b;
                                                                                        list.add(fryVar8.a());
                                                                                        fryVar8.c.setLength(0);
                                                                                        fryVar8.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar8.h, fryVar8.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if ((iN2 & 112) != 16) {
                                                    if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar9 = this.q;
                                                                                            list = fryVar9.b;
                                                                                            list.add(fryVar9.a());
                                                                                            fryVar9.c.setLength(0);
                                                                                            fryVar9.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar9.h, fryVar9.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar10 = this.q;
                                                                                        list = fryVar10.b;
                                                                                        list.add(fryVar10.a());
                                                                                        fryVar10.c.setLength(0);
                                                                                        fryVar10.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar10.h, fryVar10.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar11 = this.q;
                                                                                        list = fryVar11.b;
                                                                                        list.add(fryVar11.a());
                                                                                        fryVar11.c.setLength(0);
                                                                                        fryVar11.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar11.h, fryVar11.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (i12 == 32) {
                                                        n(2);
                                                    } else if (i12 != 41) {
                                                        switch (i12) {
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                n(1);
                                                                o(2);
                                                                break;
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                n(1);
                                                                o(3);
                                                                break;
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                n(1);
                                                                o(4);
                                                                break;
                                                            default:
                                                                i5 = this.t;
                                                                if (i5 != 0) {
                                                                    if (i12 != 33) {
                                                                        switch (i12) {
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.r = java.util.Collections.EMPTY_LIST;
                                                                                i6 = this.t;
                                                                                if (i6 != 1) {
                                                                                    m();
                                                                                } else {
                                                                                    m();
                                                                                }
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (i5 == 1) {
                                                                                    defpackage.fry fryVar12 = this.q;
                                                                                    list = fryVar12.b;
                                                                                    list.add(fryVar12.a());
                                                                                    fryVar12.c.setLength(0);
                                                                                    fryVar12.a.clear();
                                                                                    iMin = java.lang.Math.min(fryVar12.h, fryVar12.d);
                                                                                    while (list.size() >= iMin) {
                                                                                        list.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                m();
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.r = l();
                                                                                m();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.q.d();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        n(3);
                                                    }
                                                }
                                            }
                                        } else if ((iN3 & 112) == 48) {
                                            this.q.c((char) g[iN3 & 15]);
                                        } else {
                                            i3 = 17;
                                            i4 = iN2 & 118;
                                            if (i4 != 18) {
                                                if (i3 != 17) {
                                                    if ((iN2 & 112) != 16) {
                                                        if (i3 != 23) {
                                                            if (i4 == 20) {
                                                                if (i12 == 32) {
                                                                    n(2);
                                                                } else if (i12 != 41) {
                                                                    switch (i12) {
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                            n(1);
                                                                            o(2);
                                                                            break;
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                            n(1);
                                                                            o(3);
                                                                            break;
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                            n(1);
                                                                            o(4);
                                                                            break;
                                                                        default:
                                                                            i5 = this.t;
                                                                            if (i5 != 0) {
                                                                                if (i12 != 33) {
                                                                                    switch (i12) {
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                            this.r = java.util.Collections.EMPTY_LIST;
                                                                                            i6 = this.t;
                                                                                            if (i6 != 1) {
                                                                                                m();
                                                                                            } else {
                                                                                                m();
                                                                                            }
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                            if (i5 == 1) {
                                                                                                defpackage.fry fryVar13 = this.q;
                                                                                                list = fryVar13.b;
                                                                                                list.add(fryVar13.a());
                                                                                                fryVar13.c.setLength(0);
                                                                                                fryVar13.a.clear();
                                                                                                iMin = java.lang.Math.min(fryVar13.h, fryVar13.d);
                                                                                                while (list.size() >= iMin) {
                                                                                                    list.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                            m();
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                            this.r = l();
                                                                                            m();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.q.d();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    n(3);
                                                                }
                                                            }
                                                        } else if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar14 = this.q;
                                                                                            list = fryVar14.b;
                                                                                            list.add(fryVar14.a());
                                                                                            fryVar14.c.setLength(0);
                                                                                            fryVar14.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar14.h, fryVar14.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar15 = this.q;
                                                                                            list = fryVar15.b;
                                                                                            list.add(fryVar15.a());
                                                                                            fryVar15.c.setLength(0);
                                                                                            fryVar15.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar15.h, fryVar15.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar16 = this.q;
                                                                                        list = fryVar16.b;
                                                                                        list.add(fryVar16.a());
                                                                                        fryVar16.c.setLength(0);
                                                                                        fryVar16.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar16.h, fryVar16.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if ((iN2 & 112) != 16) {
                                                    if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar17 = this.q;
                                                                                            list = fryVar17.b;
                                                                                            list.add(fryVar17.a());
                                                                                            fryVar17.c.setLength(0);
                                                                                            fryVar17.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar17.h, fryVar17.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar18 = this.q;
                                                                                        list = fryVar18.b;
                                                                                        list.add(fryVar18.a());
                                                                                        fryVar18.c.setLength(0);
                                                                                        fryVar18.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar18.h, fryVar18.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar19 = this.q;
                                                                                        list = fryVar19.b;
                                                                                        list.add(fryVar19.a());
                                                                                        fryVar19.c.setLength(0);
                                                                                        fryVar19.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar19.h, fryVar19.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (i12 == 32) {
                                                        n(2);
                                                    } else if (i12 != 41) {
                                                        switch (i12) {
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                n(1);
                                                                o(2);
                                                                break;
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                n(1);
                                                                o(3);
                                                                break;
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                n(1);
                                                                o(4);
                                                                break;
                                                            default:
                                                                i5 = this.t;
                                                                if (i5 != 0) {
                                                                    if (i12 != 33) {
                                                                        switch (i12) {
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.r = java.util.Collections.EMPTY_LIST;
                                                                                i6 = this.t;
                                                                                if (i6 != 1) {
                                                                                    m();
                                                                                } else {
                                                                                    m();
                                                                                }
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (i5 == 1) {
                                                                                    defpackage.fry fryVar110 = this.q;
                                                                                    list = fryVar110.b;
                                                                                    list.add(fryVar110.a());
                                                                                    fryVar110.c.setLength(0);
                                                                                    fryVar110.a.clear();
                                                                                    iMin = java.lang.Math.min(fryVar110.h, fryVar110.d);
                                                                                    while (list.size() >= iMin) {
                                                                                        list.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                m();
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.r = l();
                                                                                m();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.q.d();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        n(3);
                                                    }
                                                }
                                            } else if ((iN3 & 96) == 32) {
                                                i7 = iN3 & 31;
                                                this.q.d();
                                                defpackage.fry fryVar20 = this.q;
                                                if ((iN2 & 1) == 0) {
                                                    i8 = h[i7];
                                                } else {
                                                    i8 = i[i7];
                                                }
                                                fryVar20.c((char) i8);
                                            } else {
                                                i4 = 18;
                                                if (i3 != 17) {
                                                    if ((iN2 & 112) != 16) {
                                                        if (i3 != 23) {
                                                            if (i4 == 20) {
                                                                if (i12 == 32) {
                                                                    n(2);
                                                                } else if (i12 != 41) {
                                                                    switch (i12) {
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                            n(1);
                                                                            o(2);
                                                                            break;
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                            n(1);
                                                                            o(3);
                                                                            break;
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                            n(1);
                                                                            o(4);
                                                                            break;
                                                                        default:
                                                                            i5 = this.t;
                                                                            if (i5 != 0) {
                                                                                if (i12 != 33) {
                                                                                    switch (i12) {
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                            this.r = java.util.Collections.EMPTY_LIST;
                                                                                            i6 = this.t;
                                                                                            if (i6 != 1) {
                                                                                                m();
                                                                                            } else {
                                                                                                m();
                                                                                            }
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                            if (i5 == 1) {
                                                                                                defpackage.fry fryVar111 = this.q;
                                                                                                list = fryVar111.b;
                                                                                                list.add(fryVar111.a());
                                                                                                fryVar111.c.setLength(0);
                                                                                                fryVar111.a.clear();
                                                                                                iMin = java.lang.Math.min(fryVar111.h, fryVar111.d);
                                                                                                while (list.size() >= iMin) {
                                                                                                    list.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                            m();
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                            this.r = l();
                                                                                            m();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.q.d();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    n(3);
                                                                }
                                                            }
                                                        } else if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar112 = this.q;
                                                                                            list = fryVar112.b;
                                                                                            list.add(fryVar112.a());
                                                                                            fryVar112.c.setLength(0);
                                                                                            fryVar112.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar112.h, fryVar112.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar113 = this.q;
                                                                                            list = fryVar113.b;
                                                                                            list.add(fryVar113.a());
                                                                                            fryVar113.c.setLength(0);
                                                                                            fryVar113.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar113.h, fryVar113.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar114 = this.q;
                                                                                        list = fryVar114.b;
                                                                                        list.add(fryVar114.a());
                                                                                        fryVar114.c.setLength(0);
                                                                                        fryVar114.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar114.h, fryVar114.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if ((iN2 & 112) != 16) {
                                                    if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar115 = this.q;
                                                                                            list = fryVar115.b;
                                                                                            list.add(fryVar115.a());
                                                                                            fryVar115.c.setLength(0);
                                                                                            fryVar115.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar115.h, fryVar115.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar116 = this.q;
                                                                                        list = fryVar116.b;
                                                                                        list.add(fryVar116.a());
                                                                                        fryVar116.c.setLength(0);
                                                                                        fryVar116.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar116.h, fryVar116.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar117 = this.q;
                                                                                        list = fryVar117.b;
                                                                                        list.add(fryVar117.a());
                                                                                        fryVar117.c.setLength(0);
                                                                                        fryVar117.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar117.h, fryVar117.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (i12 == 32) {
                                                        n(2);
                                                    } else if (i12 != 41) {
                                                        switch (i12) {
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                n(1);
                                                                o(2);
                                                                break;
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                n(1);
                                                                o(3);
                                                                break;
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                n(1);
                                                                o(4);
                                                                break;
                                                            default:
                                                                i5 = this.t;
                                                                if (i5 != 0) {
                                                                    if (i12 != 33) {
                                                                        switch (i12) {
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.r = java.util.Collections.EMPTY_LIST;
                                                                                i6 = this.t;
                                                                                if (i6 != 1) {
                                                                                    m();
                                                                                } else {
                                                                                    m();
                                                                                }
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (i5 == 1) {
                                                                                    defpackage.fry fryVar118 = this.q;
                                                                                    list = fryVar118.b;
                                                                                    list.add(fryVar118.a());
                                                                                    fryVar118.c.setLength(0);
                                                                                    fryVar118.a.clear();
                                                                                    iMin = java.lang.Math.min(fryVar118.h, fryVar118.d);
                                                                                    while (list.size() >= iMin) {
                                                                                        list.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                m();
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.r = l();
                                                                                m();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.q.d();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        n(3);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i2 = iN3 & 96;
                                        this.q.c(k(b));
                                        if (i2 != 0) {
                                            this.q.c(k(b2));
                                        }
                                    }
                                    z2 = true;
                                }
                            }
                        } else if (z3) {
                            m();
                            z2 = true;
                        }
                    } else if (this.w && this.x == i11 && this.y == i12) {
                        this.w = false;
                    } else {
                        this.w = true;
                        this.x = b;
                        this.y = b2;
                        if (!z) {
                            if (i11 <= 0) {
                                if ((iN2 & 118) == 20) {
                                    if (i12 == 32) {
                                        this.A = true;
                                    } else {
                                        this.A = true;
                                    }
                                }
                            } else if ((iN2 & 118) == 20) {
                                if (i12 == 32) {
                                    this.A = true;
                                } else {
                                    this.A = true;
                                }
                            }
                            if (!this.A) {
                                if (q(b)) {
                                    this.z = (i11 >> 3) & 1;
                                }
                                if (this.z != this.n) {
                                    if (q(b)) {
                                        i3 = iN2 & 119;
                                        if (i3 != 17) {
                                            i4 = iN2 & 118;
                                            if (i4 != 18) {
                                                if (i3 != 17) {
                                                    if ((iN2 & 112) != 16) {
                                                        if (i3 != 23) {
                                                            if (i4 == 20) {
                                                                if (i12 == 32) {
                                                                    n(2);
                                                                } else if (i12 != 41) {
                                                                    switch (i12) {
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                            n(1);
                                                                            o(2);
                                                                            break;
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                            n(1);
                                                                            o(3);
                                                                            break;
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                            n(1);
                                                                            o(4);
                                                                            break;
                                                                        default:
                                                                            i5 = this.t;
                                                                            if (i5 != 0) {
                                                                                if (i12 != 33) {
                                                                                    switch (i12) {
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                            this.r = java.util.Collections.EMPTY_LIST;
                                                                                            i6 = this.t;
                                                                                            if (i6 != 1) {
                                                                                                m();
                                                                                            } else {
                                                                                                m();
                                                                                            }
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                            if (i5 == 1) {
                                                                                                defpackage.fry fryVar119 = this.q;
                                                                                                list = fryVar119.b;
                                                                                                list.add(fryVar119.a());
                                                                                                fryVar119.c.setLength(0);
                                                                                                fryVar119.a.clear();
                                                                                                iMin = java.lang.Math.min(fryVar119.h, fryVar119.d);
                                                                                                while (list.size() >= iMin) {
                                                                                                    list.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                            m();
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                            this.r = l();
                                                                                            m();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.q.d();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    n(3);
                                                                }
                                                            }
                                                        } else if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar1110 = this.q;
                                                                                            list = fryVar1110.b;
                                                                                            list.add(fryVar1110.a());
                                                                                            fryVar1110.c.setLength(0);
                                                                                            fryVar1110.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar1110.h, fryVar1110.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar1111 = this.q;
                                                                                            list = fryVar1111.b;
                                                                                            list.add(fryVar1111.a());
                                                                                            fryVar1111.c.setLength(0);
                                                                                            fryVar1111.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar1111.h, fryVar1111.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar1112 = this.q;
                                                                                        list = fryVar1112.b;
                                                                                        list.add(fryVar1112.a());
                                                                                        fryVar1112.c.setLength(0);
                                                                                        fryVar1112.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar1112.h, fryVar1112.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if ((iN2 & 112) != 16) {
                                                    if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar1113 = this.q;
                                                                                            list = fryVar1113.b;
                                                                                            list.add(fryVar1113.a());
                                                                                            fryVar1113.c.setLength(0);
                                                                                            fryVar1113.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar1113.h, fryVar1113.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar1114 = this.q;
                                                                                        list = fryVar1114.b;
                                                                                        list.add(fryVar1114.a());
                                                                                        fryVar1114.c.setLength(0);
                                                                                        fryVar1114.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar1114.h, fryVar1114.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar1115 = this.q;
                                                                                        list = fryVar1115.b;
                                                                                        list.add(fryVar1115.a());
                                                                                        fryVar1115.c.setLength(0);
                                                                                        fryVar1115.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar1115.h, fryVar1115.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (i12 == 32) {
                                                        n(2);
                                                    } else if (i12 != 41) {
                                                        switch (i12) {
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                n(1);
                                                                o(2);
                                                                break;
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                n(1);
                                                                o(3);
                                                                break;
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                n(1);
                                                                o(4);
                                                                break;
                                                            default:
                                                                i5 = this.t;
                                                                if (i5 != 0) {
                                                                    if (i12 != 33) {
                                                                        switch (i12) {
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.r = java.util.Collections.EMPTY_LIST;
                                                                                i6 = this.t;
                                                                                if (i6 != 1) {
                                                                                    m();
                                                                                } else {
                                                                                    m();
                                                                                }
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (i5 == 1) {
                                                                                    defpackage.fry fryVar1116 = this.q;
                                                                                    list = fryVar1116.b;
                                                                                    list.add(fryVar1116.a());
                                                                                    fryVar1116.c.setLength(0);
                                                                                    fryVar1116.a.clear();
                                                                                    iMin = java.lang.Math.min(fryVar1116.h, fryVar1116.d);
                                                                                    while (list.size() >= iMin) {
                                                                                        list.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                m();
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.r = l();
                                                                                m();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.q.d();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        n(3);
                                                    }
                                                }
                                            } else if ((iN3 & 96) == 32) {
                                                i7 = iN3 & 31;
                                                this.q.d();
                                                defpackage.fry fryVar21 = this.q;
                                                if ((iN2 & 1) == 0) {
                                                    i8 = h[i7];
                                                } else {
                                                    i8 = i[i7];
                                                }
                                                fryVar21.c((char) i8);
                                            } else {
                                                i4 = 18;
                                                if (i3 != 17) {
                                                    if ((iN2 & 112) != 16) {
                                                        if (i3 != 23) {
                                                            if (i4 == 20) {
                                                                if (i12 == 32) {
                                                                    n(2);
                                                                } else if (i12 != 41) {
                                                                    switch (i12) {
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                            n(1);
                                                                            o(2);
                                                                            break;
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                            n(1);
                                                                            o(3);
                                                                            break;
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                            n(1);
                                                                            o(4);
                                                                            break;
                                                                        default:
                                                                            i5 = this.t;
                                                                            if (i5 != 0) {
                                                                                if (i12 != 33) {
                                                                                    switch (i12) {
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                            this.r = java.util.Collections.EMPTY_LIST;
                                                                                            i6 = this.t;
                                                                                            if (i6 != 1) {
                                                                                                m();
                                                                                            } else {
                                                                                                m();
                                                                                            }
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                            if (i5 == 1) {
                                                                                                defpackage.fry fryVar1117 = this.q;
                                                                                                list = fryVar1117.b;
                                                                                                list.add(fryVar1117.a());
                                                                                                fryVar1117.c.setLength(0);
                                                                                                fryVar1117.a.clear();
                                                                                                iMin = java.lang.Math.min(fryVar1117.h, fryVar1117.d);
                                                                                                while (list.size() >= iMin) {
                                                                                                    list.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                            m();
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                            this.r = l();
                                                                                            m();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.q.d();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    n(3);
                                                                }
                                                            }
                                                        } else if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar1118 = this.q;
                                                                                            list = fryVar1118.b;
                                                                                            list.add(fryVar1118.a());
                                                                                            fryVar1118.c.setLength(0);
                                                                                            fryVar1118.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar1118.h, fryVar1118.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar1119 = this.q;
                                                                                            list = fryVar1119.b;
                                                                                            list.add(fryVar1119.a());
                                                                                            fryVar1119.c.setLength(0);
                                                                                            fryVar1119.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar1119.h, fryVar1119.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar11110 = this.q;
                                                                                        list = fryVar11110.b;
                                                                                        list.add(fryVar11110.a());
                                                                                        fryVar11110.c.setLength(0);
                                                                                        fryVar11110.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar11110.h, fryVar11110.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if ((iN2 & 112) != 16) {
                                                    if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar11111 = this.q;
                                                                                            list = fryVar11111.b;
                                                                                            list.add(fryVar11111.a());
                                                                                            fryVar11111.c.setLength(0);
                                                                                            fryVar11111.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar11111.h, fryVar11111.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar11112 = this.q;
                                                                                        list = fryVar11112.b;
                                                                                        list.add(fryVar11112.a());
                                                                                        fryVar11112.c.setLength(0);
                                                                                        fryVar11112.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar11112.h, fryVar11112.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar11113 = this.q;
                                                                                        list = fryVar11113.b;
                                                                                        list.add(fryVar11113.a());
                                                                                        fryVar11113.c.setLength(0);
                                                                                        fryVar11113.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar11113.h, fryVar11113.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (i12 == 32) {
                                                        n(2);
                                                    } else if (i12 != 41) {
                                                        switch (i12) {
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                n(1);
                                                                o(2);
                                                                break;
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                n(1);
                                                                o(3);
                                                                break;
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                n(1);
                                                                o(4);
                                                                break;
                                                            default:
                                                                i5 = this.t;
                                                                if (i5 != 0) {
                                                                    if (i12 != 33) {
                                                                        switch (i12) {
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.r = java.util.Collections.EMPTY_LIST;
                                                                                i6 = this.t;
                                                                                if (i6 != 1) {
                                                                                    m();
                                                                                } else {
                                                                                    m();
                                                                                }
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (i5 == 1) {
                                                                                    defpackage.fry fryVar11114 = this.q;
                                                                                    list = fryVar11114.b;
                                                                                    list.add(fryVar11114.a());
                                                                                    fryVar11114.c.setLength(0);
                                                                                    fryVar11114.a.clear();
                                                                                    iMin = java.lang.Math.min(fryVar11114.h, fryVar11114.d);
                                                                                    while (list.size() >= iMin) {
                                                                                        list.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                m();
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.r = l();
                                                                                m();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.q.d();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        n(3);
                                                    }
                                                }
                                            }
                                        } else if ((iN3 & 112) == 48) {
                                            this.q.c((char) g[iN3 & 15]);
                                        } else {
                                            i3 = 17;
                                            i4 = iN2 & 118;
                                            if (i4 != 18) {
                                                if (i3 != 17) {
                                                    if ((iN2 & 112) != 16) {
                                                        if (i3 != 23) {
                                                            if (i4 == 20) {
                                                                if (i12 == 32) {
                                                                    n(2);
                                                                } else if (i12 != 41) {
                                                                    switch (i12) {
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                            n(1);
                                                                            o(2);
                                                                            break;
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                            n(1);
                                                                            o(3);
                                                                            break;
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                            n(1);
                                                                            o(4);
                                                                            break;
                                                                        default:
                                                                            i5 = this.t;
                                                                            if (i5 != 0) {
                                                                                if (i12 != 33) {
                                                                                    switch (i12) {
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                            this.r = java.util.Collections.EMPTY_LIST;
                                                                                            i6 = this.t;
                                                                                            if (i6 != 1) {
                                                                                                m();
                                                                                            } else {
                                                                                                m();
                                                                                            }
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                            if (i5 == 1) {
                                                                                                defpackage.fry fryVar11115 = this.q;
                                                                                                list = fryVar11115.b;
                                                                                                list.add(fryVar11115.a());
                                                                                                fryVar11115.c.setLength(0);
                                                                                                fryVar11115.a.clear();
                                                                                                iMin = java.lang.Math.min(fryVar11115.h, fryVar11115.d);
                                                                                                while (list.size() >= iMin) {
                                                                                                    list.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                            m();
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                            this.r = l();
                                                                                            m();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.q.d();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    n(3);
                                                                }
                                                            }
                                                        } else if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar11116 = this.q;
                                                                                            list = fryVar11116.b;
                                                                                            list.add(fryVar11116.a());
                                                                                            fryVar11116.c.setLength(0);
                                                                                            fryVar11116.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar11116.h, fryVar11116.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar11117 = this.q;
                                                                                            list = fryVar11117.b;
                                                                                            list.add(fryVar11117.a());
                                                                                            fryVar11117.c.setLength(0);
                                                                                            fryVar11117.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar11117.h, fryVar11117.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar11118 = this.q;
                                                                                        list = fryVar11118.b;
                                                                                        list.add(fryVar11118.a());
                                                                                        fryVar11118.c.setLength(0);
                                                                                        fryVar11118.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar11118.h, fryVar11118.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if ((iN2 & 112) != 16) {
                                                    if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar11119 = this.q;
                                                                                            list = fryVar11119.b;
                                                                                            list.add(fryVar11119.a());
                                                                                            fryVar11119.c.setLength(0);
                                                                                            fryVar11119.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar11119.h, fryVar11119.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar111110 = this.q;
                                                                                        list = fryVar111110.b;
                                                                                        list.add(fryVar111110.a());
                                                                                        fryVar111110.c.setLength(0);
                                                                                        fryVar111110.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar111110.h, fryVar111110.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar111111 = this.q;
                                                                                        list = fryVar111111.b;
                                                                                        list.add(fryVar111111.a());
                                                                                        fryVar111111.c.setLength(0);
                                                                                        fryVar111111.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar111111.h, fryVar111111.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (i12 == 32) {
                                                        n(2);
                                                    } else if (i12 != 41) {
                                                        switch (i12) {
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                n(1);
                                                                o(2);
                                                                break;
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                n(1);
                                                                o(3);
                                                                break;
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                n(1);
                                                                o(4);
                                                                break;
                                                            default:
                                                                i5 = this.t;
                                                                if (i5 != 0) {
                                                                    if (i12 != 33) {
                                                                        switch (i12) {
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.r = java.util.Collections.EMPTY_LIST;
                                                                                i6 = this.t;
                                                                                if (i6 != 1) {
                                                                                    m();
                                                                                } else {
                                                                                    m();
                                                                                }
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (i5 == 1) {
                                                                                    defpackage.fry fryVar111112 = this.q;
                                                                                    list = fryVar111112.b;
                                                                                    list.add(fryVar111112.a());
                                                                                    fryVar111112.c.setLength(0);
                                                                                    fryVar111112.a.clear();
                                                                                    iMin = java.lang.Math.min(fryVar111112.h, fryVar111112.d);
                                                                                    while (list.size() >= iMin) {
                                                                                        list.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                m();
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.r = l();
                                                                                m();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.q.d();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        n(3);
                                                    }
                                                }
                                            } else if ((iN3 & 96) == 32) {
                                                i7 = iN3 & 31;
                                                this.q.d();
                                                defpackage.fry fryVar22 = this.q;
                                                if ((iN2 & 1) == 0) {
                                                    i8 = h[i7];
                                                } else {
                                                    i8 = i[i7];
                                                }
                                                fryVar22.c((char) i8);
                                            } else {
                                                i4 = 18;
                                                if (i3 != 17) {
                                                    if ((iN2 & 112) != 16) {
                                                        if (i3 != 23) {
                                                            if (i4 == 20) {
                                                                if (i12 == 32) {
                                                                    n(2);
                                                                } else if (i12 != 41) {
                                                                    switch (i12) {
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                            n(1);
                                                                            o(2);
                                                                            break;
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                            n(1);
                                                                            o(3);
                                                                            break;
                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                            n(1);
                                                                            o(4);
                                                                            break;
                                                                        default:
                                                                            i5 = this.t;
                                                                            if (i5 != 0) {
                                                                                if (i12 != 33) {
                                                                                    switch (i12) {
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                            this.r = java.util.Collections.EMPTY_LIST;
                                                                                            i6 = this.t;
                                                                                            if (i6 != 1) {
                                                                                                m();
                                                                                            } else {
                                                                                                m();
                                                                                            }
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                            if (i5 == 1) {
                                                                                                defpackage.fry fryVar111113 = this.q;
                                                                                                list = fryVar111113.b;
                                                                                                list.add(fryVar111113.a());
                                                                                                fryVar111113.c.setLength(0);
                                                                                                fryVar111113.a.clear();
                                                                                                iMin = java.lang.Math.min(fryVar111113.h, fryVar111113.d);
                                                                                                while (list.size() >= iMin) {
                                                                                                    list.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                            m();
                                                                                            break;
                                                                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                            this.r = l();
                                                                                            m();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.q.d();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    n(3);
                                                                }
                                                            }
                                                        } else if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar111114 = this.q;
                                                                                            list = fryVar111114.b;
                                                                                            list.add(fryVar111114.a());
                                                                                            fryVar111114.c.setLength(0);
                                                                                            fryVar111114.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar111114.h, fryVar111114.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar111115 = this.q;
                                                                                            list = fryVar111115.b;
                                                                                            list.add(fryVar111115.a());
                                                                                            fryVar111115.c.setLength(0);
                                                                                            fryVar111115.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar111115.h, fryVar111115.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar111116 = this.q;
                                                                                        list = fryVar111116.b;
                                                                                        list.add(fryVar111116.a());
                                                                                        fryVar111116.c.setLength(0);
                                                                                        fryVar111116.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar111116.h, fryVar111116.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if ((iN2 & 112) != 16) {
                                                    if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                n(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        n(1);
                                                                        o(2);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        n(1);
                                                                        o(3);
                                                                        break;
                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        n(1);
                                                                        o(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.r = java.util.Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i5 == 1) {
                                                                                            defpackage.fry fryVar111117 = this.q;
                                                                                            list = fryVar111117.b;
                                                                                            list.add(fryVar111117.a());
                                                                                            fryVar111117.c.setLength(0);
                                                                                            fryVar111117.a.clear();
                                                                                            iMin = java.lang.Math.min(fryVar111117.h, fryVar111117.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.r = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar111118 = this.q;
                                                                                        list = fryVar111118.b;
                                                                                        list.add(fryVar111118.a());
                                                                                        fryVar111118.c.setLength(0);
                                                                                        fryVar111118.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar111118.h, fryVar111118.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            n(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    n(1);
                                                                    o(2);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    n(1);
                                                                    o(3);
                                                                    break;
                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    n(1);
                                                                    o(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.r = java.util.Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i5 == 1) {
                                                                                        defpackage.fry fryVar111119 = this.q;
                                                                                        list = fryVar111119.b;
                                                                                        list.add(fryVar111119.a());
                                                                                        fryVar111119.c.setLength(0);
                                                                                        fryVar111119.a.clear();
                                                                                        iMin = java.lang.Math.min(fryVar111119.h, fryVar111119.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.r = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (i12 == 32) {
                                                        n(2);
                                                    } else if (i12 != 41) {
                                                        switch (i12) {
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                n(1);
                                                                o(2);
                                                                break;
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                n(1);
                                                                o(3);
                                                                break;
                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                                n(1);
                                                                o(4);
                                                                break;
                                                            default:
                                                                i5 = this.t;
                                                                if (i5 != 0) {
                                                                    if (i12 != 33) {
                                                                        switch (i12) {
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.r = java.util.Collections.EMPTY_LIST;
                                                                                i6 = this.t;
                                                                                if (i6 != 1) {
                                                                                    m();
                                                                                } else {
                                                                                    m();
                                                                                }
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (i5 == 1) {
                                                                                    defpackage.fry fryVar1111110 = this.q;
                                                                                    list = fryVar1111110.b;
                                                                                    list.add(fryVar1111110.a());
                                                                                    fryVar1111110.c.setLength(0);
                                                                                    fryVar1111110.a.clear();
                                                                                    iMin = java.lang.Math.min(fryVar1111110.h, fryVar1111110.d);
                                                                                    while (list.size() >= iMin) {
                                                                                        list.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                m();
                                                                                break;
                                                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.r = l();
                                                                                m();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.q.d();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        n(3);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i2 = iN3 & 96;
                                        this.q.c(k(b));
                                        if (i2 != 0) {
                                            this.q.c(k(b2));
                                        }
                                    }
                                    z2 = true;
                                }
                            }
                        } else if (z3) {
                            m();
                            z2 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.fsg
    protected final boolean j() {
        return this.r != this.s;
    }

    @Override // defpackage.fsg, defpackage.ewr
    public final void e() {
    }
}
