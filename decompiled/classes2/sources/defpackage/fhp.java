package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fhp extends defpackage.ewz implements android.os.Handler.Callback {
    private final defpackage.exy A;
    private final defpackage.hiz B;
    public long k;
    private final defpackage.ewu l;
    private defpackage.fhj m;
    private final defpackage.fho n;
    private boolean o;
    private int p;
    private defpackage.frk q;
    private defpackage.fro r;
    private defpackage.frp s;
    private defpackage.frp t;
    private int u;
    private final android.os.Handler v;
    private boolean w;
    private boolean x;
    private defpackage.eqg y;
    private long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhp(defpackage.exy exyVar, android.os.Looper looper) {
        android.os.Handler handler;
        super(3);
        defpackage.fho fhoVar = defpackage.fho.b;
        ahvr.ci(exyVar);
        this.A = exyVar;
        if (looper == null) {
            handler = null;
        } else {
            java.lang.String str = eum.a;
            handler = new android.os.Handler(looper, this);
        }
        this.v = handler;
        this.n = fhoVar;
        this.l = new defpackage.ewu(1);
        this.B = new defpackage.hiz();
        this.k = -9223372036854775807L;
        this.z = -9223372036854775807L;
    }

    private final long Z() {
        if (this.u != -1) {
            ahvr.ci(this.s);
            if (this.u < this.s.a()) {
                return this.s.c(this.u);
            }
        }
        return Long.MAX_VALUE;
    }

    private final void aa() {
        boolean z = true;
        if (!j$.util.Objects.equals(this.y.p, "application/cea-608") && !j$.util.Objects.equals(this.y.p, "application/x-mp4-cea-608") && !j$.util.Objects.equals(this.y.p, "application/cea-708")) {
            z = false;
        }
        ahvr.ce(z, "Legacy decoding is disabled, can't handle %s samples (expected %s).", this.y.p, "application/x-media3-cues");
    }

    private final void ab() {
        aify aifyVar = aike.a;
        ahvr.bY(this.z != -9223372036854775807L);
        ai(new defpackage.est(aifyVar));
    }

    private final void ac(defpackage.frl frlVar) {
        defpackage.etr.d("TextRenderer", "Subtitle decoding failed. streamFormat=".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.y))), frlVar);
        ab();
        ah();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    private final void ad() {
        defpackage.frq frqVar;
        defpackage.frk friVar;
        this.o = true;
        defpackage.eqg eqgVar = this.y;
        ahvr.ci(eqgVar);
        java.lang.String str = eqgVar.p;
        if (str == null) {
            frqVar = ((defpackage.fhn) this.n).a;
            if (!frqVar.c(eqgVar)) {
                throw new java.lang.IllegalArgumentException("Attempted to create decoder for unsupported MIME type: ".concat(java.lang.String.valueOf(str)));
            }
            defpackage.frt frtVarB = frqVar.b(eqgVar);
            frtVarB.getClass().getSimpleName();
            friVar = new defpackage.fri(frtVarB);
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != 930165504) {
                if (iHashCode != 1566015601) {
                    if (iHashCode == 1566016562 && str.equals("application/cea-708")) {
                        friVar = new defpackage.fsd(eqgVar.N, eqgVar.s);
                    }
                } else if (str.equals("application/cea-608")) {
                    friVar = new defpackage.frz(str, eqgVar.N);
                }
                frqVar = ((defpackage.fhn) this.n).a;
                if (!frqVar.c(eqgVar)) {
                    throw new java.lang.IllegalArgumentException("Attempted to create decoder for unsupported MIME type: ".concat(java.lang.String.valueOf(str)));
                }
                defpackage.frt frtVarB2 = frqVar.b(eqgVar);
                frtVarB2.getClass().getSimpleName();
                friVar = new defpackage.fri(frtVarB2);
            } else if (str.equals("application/x-mp4-cea-608")) {
                friVar = new defpackage.frz(str, eqgVar.N);
            } else {
                frqVar = ((defpackage.fhn) this.n).a;
                if (!frqVar.c(eqgVar)) {
                    throw new java.lang.IllegalArgumentException("Attempted to create decoder for unsupported MIME type: ".concat(java.lang.String.valueOf(str)));
                }
                defpackage.frt frtVarB3 = frqVar.b(eqgVar);
                frtVarB3.getClass().getSimpleName();
                friVar = new defpackage.fri(frtVarB3);
            }
        }
        this.q = friVar;
        friVar.f(this.e);
    }

    private final void ae(defpackage.est estVar) {
        defpackage.exq exqVar = new defpackage.exq(estVar.a, 15);
        defpackage.eto etoVar = this.A.a.h;
        etoVar.e(27, exqVar);
        etoVar.e(27, new defpackage.exq(estVar, 12));
    }

    private final void af() {
        this.r = null;
        this.u = -1;
        defpackage.frp frpVar = this.s;
        if (frpVar != null) {
            frpVar.d();
            this.s = null;
        }
        defpackage.frp frpVar2 = this.t;
        if (frpVar2 != null) {
            frpVar2.d();
            this.t = null;
        }
    }

    private final void ag() {
        af();
        defpackage.frk frkVar = this.q;
        ahvr.ci(frkVar);
        frkVar.e();
        this.q = null;
        this.p = 0;
    }

    private final void ah() {
        ag();
        ad();
    }

    private final void ai(defpackage.est estVar) {
        android.os.Handler handler = this.v;
        if (handler != null) {
            handler.obtainMessage(1, estVar).sendToTarget();
        } else {
            ae(estVar);
        }
    }

    private static boolean aj(defpackage.frj frjVar, long j) {
        return frjVar != null && frjVar.a() > 0 && frjVar.c(frjVar.a() + (-1)) > j;
    }

    private static boolean ak(defpackage.eqg eqgVar) {
        return j$.util.Objects.equals(eqgVar.p, "application/x-media3-cues");
    }

    @Override // defpackage.ezf, defpackage.ezg
    public final java.lang.String U() {
        return "TextRenderer";
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:108:0x0201  */
    /* JADX WARN: Code duplicated, block: B:109:0x0203  */
    /* JADX WARN: Code duplicated, block: B:115:0x021d A[Catch: frl -> 0x02b8, TryCatch #1 {frl -> 0x02b8, blocks: (B:113:0x0219, B:115:0x021d, B:117:0x0221, B:119:0x022e, B:120:0x0230, B:122:0x0234, B:123:0x0243, B:125:0x024b, B:127:0x0252, B:135:0x0268, B:137:0x0272, B:139:0x0278, B:141:0x027e, B:143:0x0284, B:148:0x02a3, B:144:0x028a, B:146:0x028e, B:130:0x0259, B:132:0x025f), top: B:158:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0221 A[Catch: frl -> 0x02b8, TryCatch #1 {frl -> 0x02b8, blocks: (B:113:0x0219, B:115:0x021d, B:117:0x0221, B:119:0x022e, B:120:0x0230, B:122:0x0234, B:123:0x0243, B:125:0x024b, B:127:0x0252, B:135:0x0268, B:137:0x0272, B:139:0x0278, B:141:0x027e, B:143:0x0284, B:148:0x02a3, B:144:0x028a, B:146:0x028e, B:130:0x0259, B:132:0x025f), top: B:158:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x022e A[Catch: frl -> 0x02b8, TryCatch #1 {frl -> 0x02b8, blocks: (B:113:0x0219, B:115:0x021d, B:117:0x0221, B:119:0x022e, B:120:0x0230, B:122:0x0234, B:123:0x0243, B:125:0x024b, B:127:0x0252, B:135:0x0268, B:137:0x0272, B:139:0x0278, B:141:0x027e, B:143:0x0284, B:148:0x02a3, B:144:0x028a, B:146:0x028e, B:130:0x0259, B:132:0x025f), top: B:158:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0243 A[Catch: frl -> 0x02b8, TryCatch #1 {frl -> 0x02b8, blocks: (B:113:0x0219, B:115:0x021d, B:117:0x0221, B:119:0x022e, B:120:0x0230, B:122:0x0234, B:123:0x0243, B:125:0x024b, B:127:0x0252, B:135:0x0268, B:137:0x0272, B:139:0x0278, B:141:0x027e, B:143:0x0284, B:148:0x02a3, B:144:0x028a, B:146:0x028e, B:130:0x0259, B:132:0x025f), top: B:158:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x024b A[Catch: frl -> 0x02b8, LOOP:4: B:124:0x0249->B:125:0x024b, LOOP_END, TryCatch #1 {frl -> 0x02b8, blocks: (B:113:0x0219, B:115:0x021d, B:117:0x0221, B:119:0x022e, B:120:0x0230, B:122:0x0234, B:123:0x0243, B:125:0x024b, B:127:0x0252, B:135:0x0268, B:137:0x0272, B:139:0x0278, B:141:0x027e, B:143:0x0284, B:148:0x02a3, B:144:0x028a, B:146:0x028e, B:130:0x0259, B:132:0x025f), top: B:158:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0252 A[Catch: frl -> 0x02b8, TryCatch #1 {frl -> 0x02b8, blocks: (B:113:0x0219, B:115:0x021d, B:117:0x0221, B:119:0x022e, B:120:0x0230, B:122:0x0234, B:123:0x0243, B:125:0x024b, B:127:0x0252, B:135:0x0268, B:137:0x0272, B:139:0x0278, B:141:0x027e, B:143:0x0284, B:148:0x02a3, B:144:0x028a, B:146:0x028e, B:130:0x0259, B:132:0x025f), top: B:158:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0258  */
    /* JADX WARN: Code duplicated, block: B:130:0x0259 A[Catch: frl -> 0x02b8, TryCatch #1 {frl -> 0x02b8, blocks: (B:113:0x0219, B:115:0x021d, B:117:0x0221, B:119:0x022e, B:120:0x0230, B:122:0x0234, B:123:0x0243, B:125:0x024b, B:127:0x0252, B:135:0x0268, B:137:0x0272, B:139:0x0278, B:141:0x027e, B:143:0x0284, B:148:0x02a3, B:144:0x028a, B:146:0x028e, B:130:0x0259, B:132:0x025f), top: B:158:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x025f A[Catch: frl -> 0x02b8, TryCatch #1 {frl -> 0x02b8, blocks: (B:113:0x0219, B:115:0x021d, B:117:0x0221, B:119:0x022e, B:120:0x0230, B:122:0x0234, B:123:0x0243, B:125:0x024b, B:127:0x0252, B:135:0x0268, B:137:0x0272, B:139:0x0278, B:141:0x027e, B:143:0x0284, B:148:0x02a3, B:144:0x028a, B:146:0x028e, B:130:0x0259, B:132:0x025f), top: B:158:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0272 A[Catch: frl -> 0x02b8, TryCatch #1 {frl -> 0x02b8, blocks: (B:113:0x0219, B:115:0x021d, B:117:0x0221, B:119:0x022e, B:120:0x0230, B:122:0x0234, B:123:0x0243, B:125:0x024b, B:127:0x0252, B:135:0x0268, B:137:0x0272, B:139:0x0278, B:141:0x027e, B:143:0x0284, B:148:0x02a3, B:144:0x028a, B:146:0x028e, B:130:0x0259, B:132:0x025f), top: B:158:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0284 A[Catch: frl -> 0x02b8, TryCatch #1 {frl -> 0x02b8, blocks: (B:113:0x0219, B:115:0x021d, B:117:0x0221, B:119:0x022e, B:120:0x0230, B:122:0x0234, B:123:0x0243, B:125:0x024b, B:127:0x0252, B:135:0x0268, B:137:0x0272, B:139:0x0278, B:141:0x027e, B:143:0x0284, B:148:0x02a3, B:144:0x028a, B:146:0x028e, B:130:0x0259, B:132:0x025f), top: B:158:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x028a A[Catch: frl -> 0x02b8, TryCatch #1 {frl -> 0x02b8, blocks: (B:113:0x0219, B:115:0x021d, B:117:0x0221, B:119:0x022e, B:120:0x0230, B:122:0x0234, B:123:0x0243, B:125:0x024b, B:127:0x0252, B:135:0x0268, B:137:0x0272, B:139:0x0278, B:141:0x027e, B:143:0x0284, B:148:0x02a3, B:144:0x028a, B:146:0x028e, B:130:0x0259, B:132:0x025f), top: B:158:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x028e A[Catch: frl -> 0x02b8, TryCatch #1 {frl -> 0x02b8, blocks: (B:113:0x0219, B:115:0x021d, B:117:0x0221, B:119:0x022e, B:120:0x0230, B:122:0x0234, B:123:0x0243, B:125:0x024b, B:127:0x0252, B:135:0x0268, B:137:0x0272, B:139:0x0278, B:141:0x027e, B:143:0x0284, B:148:0x02a3, B:144:0x028a, B:146:0x028e, B:130:0x0259, B:132:0x025f), top: B:158:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x02a3 A[Catch: frl -> 0x02b8, TRY_LEAVE, TryCatch #1 {frl -> 0x02b8, blocks: (B:113:0x0219, B:115:0x021d, B:117:0x0221, B:119:0x022e, B:120:0x0230, B:122:0x0234, B:123:0x0243, B:125:0x024b, B:127:0x0252, B:135:0x0268, B:137:0x0272, B:139:0x0278, B:141:0x027e, B:143:0x0284, B:148:0x02a3, B:144:0x028a, B:146:0x028e, B:130:0x0259, B:132:0x025f), top: B:158:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:158:0x0219 A[EXC_TOP_SPLITTER, LOOP:3: B:158:0x0219->B:174:0x0219, LOOP_START, PHI: r8 r9
      0x0219: PHI (r8v1 int) = (r8v0 int), (r8v8 int) binds: [B:112:0x0217, B:174:0x0219] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r9v1 int) = (r9v0 int), (r9v3 int) binds: [B:112:0x0217, B:174:0x0219] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x02bc A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4 A[LOOP:1: B:39:0x00ce->B:41:0x00d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0115  */
    /* JADX WARN: Code duplicated, block: B:52:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x012b  */
    @Override // defpackage.ezf
    public final void V(long j, long j2) {
        boolean z;
        long j3;
        int iB;
        long jC;
        boolean z2;
        defpackage.fro froVar;
        defpackage.hiz hizVar;
        int iS;
        int iS2;
        java.lang.Object obj;
        boolean z3;
        long j4;
        long j5;
        java.util.ArrayList parcelableArrayList;
        defpackage.fre freVar;
        aift aiftVar;
        int i;
        boolean zF;
        long j6;
        long jA;
        if (this.f) {
            long j7 = this.k;
            if (j7 != -9223372036854775807L && j >= j7) {
                af();
                this.x = true;
            }
        }
        if (this.x) {
            return;
        }
        defpackage.eqg eqgVar = this.y;
        ahvr.ci(eqgVar);
        int i2 = -5;
        int i3 = -3;
        if (ak(eqgVar)) {
            ahvr.ci(this.m);
            if (this.w) {
                j5 = -9223372036854775807L;
            } else {
                defpackage.hiz hizVar2 = this.B;
                defpackage.ewu ewuVar = this.l;
                j5 = -9223372036854775807L;
                int iS3 = S(hizVar2, ewuVar, 5);
                while (iS3 == -5) {
                    iS3 = S(hizVar2, ewuVar, 5);
                }
                if (iS3 != -3) {
                    if (!ewuVar.dL(4)) {
                        if (j >= ewuVar.f - 1000000) {
                            if (S(hizVar2, ewuVar, 0) != -4) {
                                if (ewuVar.dL(4)) {
                                    this.w = true;
                                } else {
                                    ewuVar.e();
                                    java.nio.ByteBuffer byteBuffer = ewuVar.d;
                                    ahvr.ci(byteBuffer);
                                    long j8 = ewuVar.f;
                                    byte[] bArrArray = byteBuffer.array();
                                    int iArrayOffset = byteBuffer.arrayOffset();
                                    int iLimit = byteBuffer.limit();
                                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                                    parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                                    parcelObtain.setDataPosition(0);
                                    android.os.Bundle bundle = parcelObtain.readBundle(android.os.Bundle.class.getClassLoader());
                                    parcelObtain.recycle();
                                    parcelableArrayList = bundle.getParcelableArrayList("c");
                                    ahvr.ci(parcelableArrayList);
                                    freVar = new defpackage.fre();
                                    aiftVar = new aift(4);
                                    while (i < parcelableArrayList.size()) {
                                        android.os.Bundle bundle2 = (android.os.Bundle) parcelableArrayList.get(i);
                                        ahvr.ci(bundle2);
                                        aiftVar.i(aa$.ExternalSyntheticApiModelOutline1.m(freVar, bundle2));
                                    }
                                    defpackage.frf frfVar = new defpackage.frf(aiftVar.h(), j8, bundle.getLong("d"));
                                    ewuVar.dJ();
                                    zF = this.m.f(frfVar, j);
                                }
                            }
                        }
                        jA = this.m.a(this.z);
                        if (jA == Long.MIN_VALUE) {
                            this.x = true;
                        }
                        if (jA == Long.MIN_VALUE) {
                            aify aifyVarC = this.m.c(j);
                            long jB = this.m.b(j);
                            ahvr.bY(jB != j5);
                            ai(new defpackage.est(aifyVarC));
                            this.m.e(jB);
                        } else {
                            aify aifyVarC2 = this.m.c(j);
                            long jB2 = this.m.b(j);
                            ahvr.bY(jB2 != j5);
                            ai(new defpackage.est(aifyVarC2));
                            this.m.e(jB2);
                        }
                        this.z = j;
                        return;
                    }
                    j6 = this.i;
                    long j9 = j - this.d;
                    if (j6 == -9223372036854775807L) {
                    }
                } else if (ewuVar.dL(4)) {
                    j6 = this.i;
                    long j10 = j - this.d;
                    if (j6 == -9223372036854775807L && j10 >= j6 - 1000000) {
                        if (S(hizVar2, ewuVar, 0) != -4) {
                            if (ewuVar.dL(4)) {
                                this.w = true;
                            } else {
                                ewuVar.e();
                                java.nio.ByteBuffer byteBuffer2 = ewuVar.d;
                                ahvr.ci(byteBuffer2);
                                long j11 = ewuVar.f;
                                byte[] bArrArray2 = byteBuffer2.array();
                                int iArrayOffset2 = byteBuffer2.arrayOffset();
                                int iLimit2 = byteBuffer2.limit();
                                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                                parcelObtain2.unmarshall(bArrArray2, iArrayOffset2, iLimit2);
                                parcelObtain2.setDataPosition(0);
                                android.os.Bundle bundle3 = parcelObtain2.readBundle(android.os.Bundle.class.getClassLoader());
                                parcelObtain2.recycle();
                                parcelableArrayList = bundle3.getParcelableArrayList("c");
                                ahvr.ci(parcelableArrayList);
                                freVar = new defpackage.fre();
                                aiftVar = new aift(4);
                                for (i = 0; i < parcelableArrayList.size(); i++) {
                                    android.os.Bundle bundle4 = (android.os.Bundle) parcelableArrayList.get(i);
                                    ahvr.ci(bundle4);
                                    aiftVar.i(aa$.ExternalSyntheticApiModelOutline1.m(freVar, bundle4));
                                }
                                defpackage.frf frfVar2 = new defpackage.frf(aiftVar.h(), j11, bundle3.getLong("d"));
                                ewuVar.dJ();
                                zF = this.m.f(frfVar2, j);
                            }
                        }
                    }
                    jA = this.m.a(this.z);
                    if (jA == Long.MIN_VALUE && this.w && !zF) {
                        this.x = true;
                    }
                    if ((jA == Long.MIN_VALUE && jA <= j) || zF) {
                        aify aifyVarC3 = this.m.c(j);
                        long jB3 = this.m.b(j);
                        ahvr.bY(jB3 != j5);
                        ai(new defpackage.est(aifyVarC3));
                        this.m.e(jB3);
                    }
                    this.z = j;
                    return;
                }
            }
            zF = false;
            jA = this.m.a(this.z);
            if (jA == Long.MIN_VALUE) {
                this.x = true;
            }
            if (jA == Long.MIN_VALUE) {
                aify aifyVarC4 = this.m.c(j);
                long jB4 = this.m.b(j);
                ahvr.bY(jB4 != j5);
                ai(new defpackage.est(aifyVarC4));
                this.m.e(jB4);
            } else {
                aify aifyVarC5 = this.m.c(j);
                long jB5 = this.m.b(j);
                ahvr.bY(jB5 != j5);
                ai(new defpackage.est(aifyVarC5));
                this.m.e(jB5);
            }
            this.z = j;
            return;
        }
        aa();
        this.z = j;
        if (this.t == null) {
            defpackage.frk frkVar = this.q;
            ahvr.ci(frkVar);
            frkVar.p(j);
            try {
                defpackage.frk frkVar2 = this.q;
                ahvr.ci(frkVar2);
                this.t = (defpackage.frp) frkVar2.b();
            } catch (defpackage.frl e) {
                ac(e);
                return;
            }
        }
        if (this.b == 2) {
            if (this.s != null) {
                long jZ = Z();
                z = false;
                while (jZ <= j) {
                    this.u++;
                    jZ = Z();
                    z = true;
                }
            } else {
                z = false;
            }
            defpackage.frp frpVar = this.t;
            if (frpVar != null) {
                if (frpVar.dL(4)) {
                    if (z) {
                        j3 = -1000000;
                    } else {
                        if (Z() == Long.MAX_VALUE) {
                            if (this.p == 2) {
                                ah();
                            } else {
                                af();
                                this.x = true;
                            }
                        }
                        j3 = -1000000;
                    }
                    if (this.p != 2) {
                        while (!this.w) {
                            try {
                                froVar = this.r;
                                if (froVar == null) {
                                    defpackage.frk frkVar3 = this.q;
                                    ahvr.ci(frkVar3);
                                    froVar = (defpackage.fro) frkVar3.a();
                                    if (froVar == null) {
                                        return;
                                    } else {
                                        this.r = froVar;
                                    }
                                }
                                if (this.p == 1) {
                                    froVar.a = 4;
                                    defpackage.frk frkVar4 = this.q;
                                    ahvr.ci(frkVar4);
                                    frkVar4.d(froVar);
                                    this.r = null;
                                    this.p = 2;
                                    return;
                                }
                                hizVar = this.B;
                                iS = S(hizVar, froVar, 5);
                                while (iS == i2) {
                                    iS = S(hizVar, froVar, 5);
                                }
                                if (iS != i3) {
                                    if (!froVar.dL(4)) {
                                        if (j < froVar.f + j3) {
                                            return;
                                        }
                                    }
                                    iS2 = S(hizVar, froVar, 0);
                                    if (iS2 == -4) {
                                        if (froVar.dL(4)) {
                                            this.w = true;
                                            this.o = false;
                                            z3 = false;
                                        } else {
                                            obj = hizVar.a;
                                            if (obj != null) {
                                                return;
                                            }
                                            froVar.h = ((defpackage.eqg) obj).u;
                                            froVar.e();
                                            z3 = this.o & (!froVar.dL(1));
                                            this.o = z3;
                                        }
                                        if (!z3) {
                                            defpackage.frk frkVar5 = this.q;
                                            ahvr.ci(frkVar5);
                                            frkVar5.d(froVar);
                                            this.r = null;
                                        }
                                        i2 = -5;
                                        i3 = -3;
                                    } else {
                                        if (iS2 != -3) {
                                            return;
                                        }
                                        i3 = -3;
                                        i2 = -5;
                                    }
                                } else if (!froVar.dL(4)) {
                                    return;
                                }
                                j4 = this.i;
                                long j12 = j - this.d;
                                if (j4 != -9223372036854775807L || j12 < j4 + j3) {
                                    return;
                                }
                                iS2 = S(hizVar, froVar, 0);
                                if (iS2 == -4) {
                                    if (froVar.dL(4)) {
                                        this.w = true;
                                        this.o = false;
                                        z3 = false;
                                    } else {
                                        obj = hizVar.a;
                                        if (obj != null) {
                                            return;
                                        }
                                        froVar.h = ((defpackage.eqg) obj).u;
                                        froVar.e();
                                        z3 = this.o & (!froVar.dL(1));
                                        this.o = z3;
                                    }
                                    if (!z3) {
                                        defpackage.frk frkVar6 = this.q;
                                        ahvr.ci(frkVar6);
                                        frkVar6.d(froVar);
                                        this.r = null;
                                    }
                                    i2 = -5;
                                    i3 = -3;
                                } else {
                                    if (iS2 != -3) {
                                        return;
                                    }
                                    i3 = -3;
                                    i2 = -5;
                                }
                            } catch (defpackage.frl e2) {
                                ac(e2);
                                return;
                            }
                        }
                    }
                }
                j3 = -1000000;
                if (frpVar.b <= j) {
                    defpackage.frp frpVar2 = this.s;
                    if (frpVar2 != null) {
                        frpVar2.d();
                    }
                    this.u = frpVar.b(j);
                    this.s = frpVar;
                    this.t = null;
                }
                ahvr.ci(this.s);
                iB = this.s.b(j);
                if (iB != 0 || this.s.a() == 0) {
                    jC = this.s.b;
                } else {
                    defpackage.frp frpVar3 = this.s;
                    jC = iB == -1 ? frpVar3.c(frpVar3.a() - 1) : frpVar3.c(iB - 1);
                }
                if (jC != -9223372036854775807L) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ahvr.bY(z2);
                ai(new defpackage.est(this.s.e(j)));
                if (this.p != 2) {
                    while (!this.w) {
                        froVar = this.r;
                        if (froVar == null) {
                            defpackage.frk frkVar7 = this.q;
                            ahvr.ci(frkVar7);
                            froVar = (defpackage.fro) frkVar7.a();
                            if (froVar == null) {
                                return;
                            } else {
                                this.r = froVar;
                            }
                        }
                        if (this.p == 1) {
                            froVar.a = 4;
                            defpackage.frk frkVar8 = this.q;
                            ahvr.ci(frkVar8);
                            frkVar8.d(froVar);
                            this.r = null;
                            this.p = 2;
                            return;
                        }
                        hizVar = this.B;
                        iS = S(hizVar, froVar, 5);
                        while (iS == i2) {
                            iS = S(hizVar, froVar, 5);
                        }
                        if (iS != i3) {
                            if (!froVar.dL(4)) {
                                if (j < froVar.f + j3) {
                                    return;
                                }
                            }
                            iS2 = S(hizVar, froVar, 0);
                            if (iS2 == -4) {
                                if (froVar.dL(4)) {
                                    this.w = true;
                                    this.o = false;
                                    z3 = false;
                                } else {
                                    obj = hizVar.a;
                                    if (obj != null) {
                                        return;
                                    }
                                    froVar.h = ((defpackage.eqg) obj).u;
                                    froVar.e();
                                    z3 = this.o & (!froVar.dL(1));
                                    this.o = z3;
                                }
                                if (!z3) {
                                    defpackage.frk frkVar9 = this.q;
                                    ahvr.ci(frkVar9);
                                    frkVar9.d(froVar);
                                    this.r = null;
                                }
                                i2 = -5;
                                i3 = -3;
                            } else {
                                if (iS2 != -3) {
                                    return;
                                }
                                i3 = -3;
                                i2 = -5;
                            }
                        } else if (!froVar.dL(4)) {
                            return;
                        }
                        j4 = this.i;
                        long j13 = j - this.d;
                        if (j4 != -9223372036854775807L) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
            }
            j3 = -1000000;
            if (z) {
                ahvr.ci(this.s);
                iB = this.s.b(j);
                if (iB != 0) {
                    jC = this.s.b;
                } else {
                    jC = this.s.b;
                }
                if (jC != -9223372036854775807L) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ahvr.bY(z2);
                ai(new defpackage.est(this.s.e(j)));
            }
            if (this.p != 2) {
                while (!this.w) {
                    froVar = this.r;
                    if (froVar == null) {
                        defpackage.frk frkVar10 = this.q;
                        ahvr.ci(frkVar10);
                        froVar = (defpackage.fro) frkVar10.a();
                        if (froVar == null) {
                            return;
                        } else {
                            this.r = froVar;
                        }
                    }
                    if (this.p == 1) {
                        froVar.a = 4;
                        defpackage.frk frkVar11 = this.q;
                        ahvr.ci(frkVar11);
                        frkVar11.d(froVar);
                        this.r = null;
                        this.p = 2;
                        return;
                    }
                    hizVar = this.B;
                    iS = S(hizVar, froVar, 5);
                    while (iS == i2) {
                        iS = S(hizVar, froVar, 5);
                    }
                    if (iS != i3) {
                        if (!froVar.dL(4)) {
                            if (j < froVar.f + j3) {
                                return;
                            }
                        }
                        iS2 = S(hizVar, froVar, 0);
                        if (iS2 == -4) {
                            if (froVar.dL(4)) {
                                this.w = true;
                                this.o = false;
                                z3 = false;
                            } else {
                                obj = hizVar.a;
                                if (obj != null) {
                                    return;
                                }
                                froVar.h = ((defpackage.eqg) obj).u;
                                froVar.e();
                                z3 = this.o & (!froVar.dL(1));
                                this.o = z3;
                            }
                            if (!z3) {
                                defpackage.frk frkVar12 = this.q;
                                ahvr.ci(frkVar12);
                                frkVar12.d(froVar);
                                this.r = null;
                            }
                            i2 = -5;
                            i3 = -3;
                        } else {
                            if (iS2 != -3) {
                                return;
                            }
                            i3 = -3;
                            i2 = -5;
                        }
                    } else if (!froVar.dL(4)) {
                        return;
                    }
                    j4 = this.i;
                    long j14 = j - this.d;
                    if (j4 != -9223372036854775807L) {
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.ezf
    public final boolean W() {
        return this.x;
    }

    @Override // defpackage.ezf
    public final boolean X() {
        defpackage.eqg eqgVar = this.y;
        if (eqgVar == null) {
            return true;
        }
        if (ak(eqgVar)) {
            defpackage.fhj fhjVar = this.m;
            ahvr.ci(fhjVar);
            if (fhjVar.a(this.z) != Long.MIN_VALUE) {
                return true;
            }
            try {
                r();
                return true;
            } catch (java.io.IOException unused) {
            }
        } else if (!this.x && (!this.w || aj(this.s, this.z) || aj(this.t, this.z) || this.r == null)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ezg
    public final int Y(defpackage.eqg eqgVar) {
        if (!ak(eqgVar)) {
            defpackage.fho fhoVar = this.n;
            java.lang.String str = eqgVar.p;
            if (!((defpackage.fhn) fhoVar).a.c(eqgVar) && !j$.util.Objects.equals(str, "application/cea-608") && !j$.util.Objects.equals(str, "application/x-mp4-cea-608") && !j$.util.Objects.equals(str, "application/cea-708")) {
                return defpackage.eqz.h(str) ? 129 : 128;
            }
        }
        return 128 | (eqgVar.Q == 0 ? 4 : 2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        if (message.what != 1) {
            throw new java.lang.IllegalStateException();
        }
        ae((defpackage.est) message.obj);
        return true;
    }

    @Override // defpackage.ewz
    protected final void s() {
        this.y = null;
        this.k = -9223372036854775807L;
        ab();
        this.z = -9223372036854775807L;
        if (this.q != null) {
            ag();
        }
    }

    @Override // defpackage.ewz
    protected final void u(long j, boolean z, boolean z2) {
        this.z = j;
        defpackage.fhj fhjVar = this.m;
        if (fhjVar != null) {
            fhjVar.d();
        }
        ab();
        this.w = false;
        this.x = false;
        this.k = -9223372036854775807L;
        defpackage.eqg eqgVar = this.y;
        if (eqgVar == null || ak(eqgVar)) {
            return;
        }
        if (this.p != 0) {
            ah();
            return;
        }
        af();
        defpackage.frk frkVar = this.q;
        ahvr.ci(frkVar);
        frkVar.c();
        frkVar.f(this.e);
    }

    @Override // defpackage.ewz
    protected final void z(defpackage.eqg[] eqgVarArr, long j, long j2, defpackage.ffu ffuVar) {
        defpackage.eqg eqgVar = eqgVarArr[0];
        this.y = eqgVar;
        if (ak(eqgVar)) {
            this.m = this.y.O == 1 ? new defpackage.fhl() : new defpackage.fhm();
            return;
        }
        aa();
        if (this.q != null) {
            this.p = 1;
        } else {
            ad();
        }
    }
}
