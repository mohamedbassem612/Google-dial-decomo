package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fpz {
    public static final /* synthetic */ int a = 0;
    private static final byte[] b = eum.Z("OpusHead");
    private static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("([+-][0-9.]+)([+-][0-9.]+)(?:([+-][0-9.]+))?(?:CRS[^/]*)?/.*");

    static defpackage.eqy a(defpackage.etx etxVar) {
        try {
            etxVar.R(5);
            int i = etxVar.i();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                long jV = etxVar.v() / 10000;
                if (jV < 0) {
                    jV = -9223372036854775807L;
                }
                arrayList.add(new defpackage.fnn(jV, -9223372036854775807L, false, new defpackage.eqi(null, etxVar.C(etxVar.n()))));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new defpackage.eqy(arrayList);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static defpackage.eqy b(defpackage.eus eusVar) {
        defpackage.euq euqVar;
        defpackage.eut eutVarB = eusVar.b(1751411826);
        defpackage.eut eutVarB2 = eusVar.b(1801812339);
        defpackage.eut eutVarB3 = eusVar.b(1768715124);
        if (eutVarB == null || eutVarB2 == null || eutVarB3 == null || l(eutVarB.a) != 1835299937) {
            return null;
        }
        defpackage.etx etxVar = eutVarB2.a;
        etxVar.Q(12);
        int i = etxVar.i();
        java.lang.String[] strArr = new java.lang.String[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = etxVar.i();
            etxVar.R(4);
            strArr[i2] = etxVar.C(i3 - 8);
        }
        defpackage.etx etxVar2 = eutVarB3.a;
        etxVar2.Q(8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (etxVar2.d() > 8) {
            int i4 = etxVar2.c + etxVar2.i();
            int i5 = etxVar2.i() - 1;
            if (i5 < 0 || i5 >= i) {
                defpackage.etr.f("BoxParsers", a.bj(i5, "Skipped metadata with unknown key index: "));
            } else {
                java.lang.String str = strArr[i5];
                while (true) {
                    int i6 = etxVar2.c;
                    if (i6 < i4) {
                        int i7 = etxVar2.i();
                        if (etxVar2.i() == 1684108385) {
                            int i8 = etxVar2.i();
                            int i9 = etxVar2.i();
                            int i10 = i7 - 16;
                            byte[] bArr = new byte[i10];
                            etxVar2.L(bArr, 0, i10);
                            try {
                                euqVar = new defpackage.euq(str, bArr, i9, i8);
                                break;
                            } catch (java.lang.Exception unused) {
                                defpackage.etr.f("MetadataUtil", "Failed to parse metadata entry with key: ".concat(java.lang.String.valueOf(str)));
                                euqVar = null;
                                break;
                            }
                        }
                        etxVar2.Q(i6 + i7);
                    }
                    euqVar = null;
                    break;
                }
                if (euqVar != null) {
                    arrayList.add(euqVar);
                }
            }
            etxVar2.Q(i4);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new defpackage.eqy(arrayList);
    }

    public static defpackage.euw c(defpackage.etx etxVar) {
        long jV;
        long jV2;
        etxVar.Q(8);
        if (((etxVar.i() >> 24) & 255) == 0) {
            jV = etxVar.w();
            jV2 = etxVar.w();
        } else {
            jV = etxVar.v();
            jV2 = etxVar.v();
        }
        return new defpackage.euw(jV, jV2, etxVar.w());
    }

    static defpackage.eux d(defpackage.eut eutVar) {
        defpackage.etx etxVar = eutVar.a;
        etxVar.Q(8);
        aift aiftVar = new aift(4);
        while (etxVar.d() >= 4) {
            aiftVar.i(java.lang.Integer.valueOf(etxVar.i()));
        }
        aify aifyVarH = aiftVar.h();
        if (aifyVarH.isEmpty()) {
            return null;
        }
        return new defpackage.eux(eutVar.d, aifyVarH);
    }

    public static defpackage.fqn e(defpackage.fqn fqnVar) {
        int iN;
        defpackage.eqg eqgVar = fqnVar.g;
        if (!j$.util.Objects.equals(eqgVar.p, "application/x-mp4-mebx")) {
            return fqnVar;
        }
        java.util.List list = eqgVar.s;
        if (!list.isEmpty()) {
            defpackage.etx etxVar = new defpackage.etx((byte[]) list.get(0));
            int i = -1;
            byte[] bArr = null;
            while (etxVar.d() >= 8) {
                int i2 = etxVar.c;
                int i3 = etxVar.i();
                int i4 = etxVar.i();
                if (i3 < 8 || i3 - 8 > etxVar.d()) {
                    break;
                }
                int i5 = i2 + i3;
                byte[] bArr2 = null;
                boolean z = false;
                while (true) {
                    int i6 = etxVar.c;
                    if (i6 + 8 > i5) {
                        break;
                    }
                    int i7 = etxVar.i();
                    int i8 = etxVar.i();
                    if (i7 < 8 || i7 > i5 - i6) {
                        break;
                    }
                    if (i8 == 1801812324) {
                        if (i7 >= 12 && etxVar.i() == 1835349091 && i7 == 16) {
                            if (etxVar.i() == 1769222965) {
                                z = true;
                            }
                            i7 = 16;
                        }
                    } else if (i8 == 1936028789 && i7 >= 9 && i7 - 9 >= (iN = etxVar.n())) {
                        bArr2 = new byte[iN];
                        etxVar.L(bArr2, 0, iN);
                    }
                    etxVar.Q(i6 + i7);
                }
                if (z && bArr2 != null) {
                    boolean zJ = defpackage.ete.j(bArr2, bArr2.length);
                    if (bArr != null) {
                        if (zJ) {
                            i = i4;
                            bArr = bArr2;
                            break;
                        }
                    } else {
                        if (zJ) {
                            i = i4;
                            bArr = bArr2;
                            break;
                        }
                        i = i4;
                        bArr = bArr2;
                    }
                }
                etxVar.Q(i5);
            }
            if (bArr != null) {
                defpackage.eqf eqfVar = new defpackage.eqf(eqgVar);
                eqfVar.c("application/x-itut-t35");
                eqfVar.q = aify.p(bArr);
                defpackage.eqg eqgVar2 = new defpackage.eqg(eqfVar);
                defpackage.fqm fqmVar = new defpackage.fqm(fqnVar);
                fqmVar.g = eqgVar2;
                fqmVar.h = 2;
                fqmVar.o = i;
                return fqmVar.a();
            }
        }
        return null;
    }

    public static void f(defpackage.etx etxVar) {
        int i = etxVar.c;
        etxVar.R(4);
        if (etxVar.i() != 1751411826) {
            i += 4;
        }
        etxVar.Q(i);
    }

    static boolean g(defpackage.etx etxVar, int i) {
        while (etxVar.d() >= 8) {
            int i2 = etxVar.c;
            int i3 = etxVar.i();
            int i4 = etxVar.i();
            int i5 = i3 - 8;
            if (i5 < 0 || i5 > etxVar.d()) {
                break;
            }
            if (i4 == i) {
                etxVar.P(i2 + i3);
                return true;
            }
            etxVar.R(i5);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:149:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:188:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:189:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:191:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:193:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:195:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:198:0x0401  */
    /* JADX WARN: Code duplicated, block: B:200:0x040f  */
    /* JADX WARN: Code duplicated, block: B:205:0x046c  */
    /* JADX WARN: Code duplicated, block: B:207:0x0495  */
    /* JADX WARN: Code duplicated, block: B:208:0x049d  */
    /* JADX WARN: Code duplicated, block: B:210:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:213:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:214:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:216:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:218:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:223:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:227:0x0510  */
    /* JADX WARN: Code duplicated, block: B:228:0x051c  */
    /* JADX WARN: Code duplicated, block: B:231:0x053a  */
    /* JADX WARN: Code duplicated, block: B:232:0x053d  */
    /* JADX WARN: Code duplicated, block: B:235:0x0547  */
    /* JADX WARN: Code duplicated, block: B:236:0x054a  */
    /* JADX WARN: Code duplicated, block: B:239:0x056d  */
    /* JADX WARN: Code duplicated, block: B:240:0x0575  */
    /* JADX WARN: Code duplicated, block: B:242:0x0578  */
    /* JADX WARN: Code duplicated, block: B:244:0x0581  */
    /* JADX WARN: Code duplicated, block: B:245:0x058b  */
    /* JADX WARN: Code duplicated, block: B:246:0x058f  */
    /* JADX WARN: Code duplicated, block: B:249:0x059c  */
    /* JADX WARN: Code duplicated, block: B:257:0x05ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:259:0x05be  */
    /* JADX WARN: Code duplicated, block: B:261:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:264:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:265:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:267:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:270:0x05dc A[LOOP:1: B:268:0x05d6->B:270:0x05dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:273:0x05f4 A[LOOP:2: B:272:0x05f2->B:273:0x05f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:276:0x0617  */
    /* JADX WARN: Code duplicated, block: B:278:0x062b A[LOOP:4: B:277:0x0629->B:278:0x062b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:282:0x0677  */
    /* JADX WARN: Code duplicated, block: B:284:0x069a  */
    /* JADX WARN: Code duplicated, block: B:286:0x069e  */
    /* JADX WARN: Code duplicated, block: B:288:0x06a6 A[LOOP:13: B:285:0x069c->B:288:0x06a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:294:0x06df  */
    /* JADX WARN: Code duplicated, block: B:296:0x06e3 A[ADDED_TO_REGION, LOOP:14: B:296:0x06e3->B:298:0x06e7, LOOP_START, PHI: r7 r12 r29
      0x06e3: PHI (r7v53 int) = (r7v44 int), (r7v54 int) binds: [B:295:0x06e1, B:298:0x06e7] A[DONT_GENERATE, DONT_INLINE]
      0x06e3: PHI (r12v34 int) = (r12v23 int), (r12v35 int) binds: [B:295:0x06e1, B:298:0x06e7] A[DONT_GENERATE, DONT_INLINE]
      0x06e3: PHI (r29v13 int) = (r29v11 int), (r29v17 int) binds: [B:295:0x06e1, B:298:0x06e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:297:0x06e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:298:0x06e7 A[LOOP:14: B:296:0x06e3->B:298:0x06e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:303:0x0707  */
    /* JADX WARN: Code duplicated, block: B:306:0x0717  */
    /* JADX WARN: Code duplicated, block: B:314:0x073a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:315:0x073c  */
    /* JADX WARN: Code duplicated, block: B:316:0x074a  */
    /* JADX WARN: Code duplicated, block: B:317:0x074d  */
    /* JADX WARN: Code duplicated, block: B:322:0x0777 A[DONT_INVERT, LOOP:15: B:322:0x0777->B:326:0x0781, LOOP_START, PHI: r12
      0x0777: PHI (r12v31 int) = (r12v23 int), (r12v32 int) binds: [B:321:0x0775, B:326:0x0781] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:323:0x0779  */
    /* JADX WARN: Code duplicated, block: B:326:0x0781 A[LOOP:15: B:322:0x0777->B:326:0x0781, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:327:0x0787 A[EDGE_INSN: B:327:0x0787->B:328:0x0788 BREAK  A[LOOP:15: B:322:0x0777->B:326:0x0781]] */
    /* JADX WARN: Code duplicated, block: B:329:0x078a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:330:0x078c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:331:0x078e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:332:0x0790 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:333:0x0792  */
    /* JADX WARN: Code duplicated, block: B:335:0x0796  */
    /* JADX WARN: Code duplicated, block: B:336:0x079f  */
    /* JADX WARN: Code duplicated, block: B:337:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:338:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:339:0x07be  */
    /* JADX WARN: Code duplicated, block: B:340:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:341:0x07db  */
    /* JADX WARN: Code duplicated, block: B:344:0x0823  */
    /* JADX WARN: Code duplicated, block: B:345:0x0826  */
    /* JADX WARN: Code duplicated, block: B:350:0x0849  */
    /* JADX WARN: Code duplicated, block: B:357:0x088a  */
    /* JADX WARN: Code duplicated, block: B:358:0x0898  */
    /* JADX WARN: Code duplicated, block: B:360:0x089d  */
    /* JADX WARN: Code duplicated, block: B:384:0x094a  */
    /* JADX WARN: Code duplicated, block: B:387:0x094e  */
    /* JADX WARN: Code duplicated, block: B:389:0x0952  */
    /* JADX WARN: Code duplicated, block: B:391:0x095d  */
    /* JADX WARN: Code duplicated, block: B:394:0x096a A[LOOP:5: B:392:0x0967->B:394:0x096a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:396:0x0993  */
    /* JADX WARN: Code duplicated, block: B:399:0x09a4  */
    /* JADX WARN: Code duplicated, block: B:400:0x09a6  */
    /* JADX WARN: Code duplicated, block: B:403:0x09b9  */
    /* JADX WARN: Code duplicated, block: B:405:0x09c5  */
    /* JADX WARN: Code duplicated, block: B:408:0x09f1  */
    /* JADX WARN: Code duplicated, block: B:410:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:411:0x09f9  */
    /* JADX WARN: Code duplicated, block: B:433:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:434:0x0a45  */
    /* JADX WARN: Code duplicated, block: B:436:0x0a4b  */
    /* JADX WARN: Code duplicated, block: B:440:0x0a69  */
    /* JADX WARN: Code duplicated, block: B:441:0x0a6b  */
    /* JADX WARN: Code duplicated, block: B:444:0x0a71  */
    /* JADX WARN: Code duplicated, block: B:445:0x0a76  */
    /* JADX WARN: Code duplicated, block: B:448:0x0a7c  */
    /* JADX WARN: Code duplicated, block: B:450:0x0a80  */
    /* JADX WARN: Code duplicated, block: B:451:0x0a88  */
    /* JADX WARN: Code duplicated, block: B:454:0x0a92  */
    /* JADX WARN: Code duplicated, block: B:456:0x0aa0  */
    /* JADX WARN: Code duplicated, block: B:457:0x0ab0  */
    /* JADX WARN: Code duplicated, block: B:460:0x0ab8  */
    /* JADX WARN: Code duplicated, block: B:476:0x0b47  */
    /* JADX WARN: Code duplicated, block: B:482:0x0b3d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x0a04 A[EDGE_INSN: B:495:0x0a04->B:414:0x0a04 BREAK  A[LOOP:7: B:406:0x09ee->B:413:0x0a01], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x0a01 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x0765 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x06bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x06b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x06b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x06f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x0787 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x077f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x013f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0142  */
    /* JADX WARN: Code duplicated, block: B:79:0x0148  */
    /* JADX WARN: Code duplicated, block: B:82:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0155  */
    /* JADX WARN: Code duplicated, block: B:84:0x0158  */
    /* JADX WARN: Code duplicated, block: B:87:0x0162  */
    /* JADX WARN: Code duplicated, block: B:89:0x016f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0178  */
    /* JADX WARN: Code duplicated, block: B:91:0x017c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0189  */
    /* JADX WARN: Code duplicated, block: B:95:0x018b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r31v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r43v0 */
    /* JADX WARN: Type inference failed for: r43v1 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v4 */
    /* JADX WARN: Type inference failed for: r47v0 */
    /* JADX WARN: Type inference failed for: r47v1, types: [int[]] */
    /* JADX WARN: Type inference failed for: r47v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r47v3 */
    /* JADX WARN: Type inference failed for: r47v4 */
    /* JADX WARN: Type inference failed for: r47v5 */
    /* JADX WARN: Type inference failed for: r49v0 */
    /* JADX WARN: Type inference failed for: r49v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r49v2 */
    /* JADX WARN: Type inference failed for: r5v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70 */
    public static java.util.List h(defpackage.eus eusVar, defpackage.fls flsVar, long j, androidx.media3.common.DrmInitData drmInitData, boolean z, boolean z2, java.util.function.Function function) throws defpackage.era {
        int i;
        long jZ;
        long j2;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        long jZ2;
        long j3;
        java.util.ArrayList arrayList;
        java.lang.String str;
        defpackage.eux euxVarD;
        int i8;
        defpackage.eux euxVarD2;
        defpackage.eus eusVar2;
        long j4;
        java.lang.String str2;
        defpackage.aizi aiziVar;
        defpackage.aizi aiziVar2;
        defpackage.eqg eqgVar;
        java.util.ArrayList arrayList2;
        int i9;
        defpackage.fqn fqnVarA;
        defpackage.eqy eqyVar;
        defpackage.eqy eqyVar2;
        android.util.Pair pairCreate;
        int i10;
        boolean z5;
        defpackage.fqn fqnVarA2;
        defpackage.eus eusVarA;
        defpackage.eut eutVarB;
        defpackage.eut eutVarB2;
        defpackage.fpt fpxVar;
        int iB;
        defpackage.eut eutVarB3;
        boolean z6;
        defpackage.eut eutVarB4;
        defpackage.etx etxVar;
        defpackage.eut eutVarB5;
        defpackage.etx etxVar2;
        defpackage.etx etxVar3;
        defpackage.fpr fprVar;
        int iQ;
        int iQ2;
        int iQ3;
        int iQ4;
        int i11;
        int iQ5;
        int iQ6;
        int iA;
        defpackage.etx etxVar4;
        defpackage.eqg eqgVar2;
        boolean z7;
        java.util.ArrayList arrayList3;
        ?? r49;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        defpackage.fpt fptVar;
        int[] iArr2;
        int i12;
        int iQ7;
        long j5;
        long j6;
        long j7;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iQ8;
        ?? r5;
        defpackage.fqn fqnVarA3;
        java.lang.String str3;
        int[] iArrCopyOf;
        long[] jArrCopyOf;
        ?? CopyOf;
        long[] jArr3;
        boolean z8;
        boolean z9;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        long j8;
        long j9;
        ?? r47;
        long[] jArr4;
        java.lang.String str4;
        boolean zA;
        int i26;
        int i27;
        int iC;
        ?? r43;
        int i28;
        int[] iArr3;
        long j10;
        long j11;
        long jZ3;
        int[] iArrW;
        defpackage.aizi aiziVar3;
        int i29;
        long j12;
        long jA;
        long j13;
        long[] jArr5;
        ?? r12;
        int i30;
        boolean z10;
        defpackage.aizi aiziVar4;
        int[] iArr4;
        int[] iArr5;
        int i31;
        int i32;
        int i33;
        boolean z11;
        int[] iArr6;
        long[] jArr6;
        java.util.ArrayList arrayList4;
        boolean z12;
        boolean z13;
        int[] iArr7;
        long[] jArr7;
        ?? r6;
        java.util.ArrayList arrayList5;
        long[] jArr8;
        int i34;
        int i35;
        ?? r7;
        defpackage.fqq fqqVar;
        long jA2;
        int i36;
        int i37;
        boolean z14;
        long[] jArr9;
        int i38;
        ?? r8;
        long jA3;
        int[] iArr8;
        int i39;
        long jZ4;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        boolean z15;
        long jA4;
        int i45;
        int length;
        defpackage.fqq fqqVar2;
        long jA5;
        int i46;
        long[] jArr10;
        int[] iArr9;
        long j14;
        int iMax;
        int i47;
        int i48;
        long[] jArr11;
        int[] iArr10;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        long j15;
        int iMax2;
        int i54;
        int i55;
        int i56;
        java.lang.String str5;
        long j16;
        float f;
        boolean z16;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        int i57 = 0;
        while (true) {
            java.util.List list = eusVar.c;
            if (i57 >= list.size()) {
                return arrayList6;
            }
            defpackage.eus eusVar3 = (defpackage.eus) list.get(i57);
            if (eusVar3.d != 1953653099) {
                arrayList = arrayList6;
                i7 = i57;
            } else {
                defpackage.eut eutVarB6 = eusVar.b(1836476516);
                ahvr.ci(eutVarB6);
                defpackage.eus eusVarA2 = eusVar3.a(1835297121);
                ahvr.ci(eusVarA2);
                defpackage.eut eutVarB7 = eusVarA2.b(1751411826);
                ahvr.ci(eutVarB7);
                int iL = l(eutVarB7.a);
                short s = 1;
                if (iL == 1936684398) {
                    i = 1;
                } else if (iL == 1986618469) {
                    i = 2;
                } else if (iL == 1952807028 || iL == 1935832172 || iL == 1937072756 || iL == 1668047728 || iL == 1937072752) {
                    i = 3;
                } else {
                    i = iL == 1835365473 ? 5 : -1;
                }
                int i58 = 0;
                if (i == -1) {
                    arrayList = arrayList6;
                    i7 = i57;
                } else {
                    defpackage.eut eutVarB8 = eusVar3.b(1953196132);
                    ahvr.ci(eutVarB8);
                    defpackage.etx etxVar5 = eutVarB8.a;
                    etxVar5.Q(8);
                    int i59 = (etxVar5.i() >> 24) & 255;
                    etxVar5.R(i59 == 0 ? 8 : 16);
                    int i60 = etxVar5.i();
                    etxVar5.R(4);
                    int i61 = etxVar5.c;
                    int i62 = 0;
                    while (true) {
                        int i63 = i59 == 0 ? 4 : 8;
                        jZ = -9223372036854775807L;
                        if (i62 >= i63) {
                            etxVar5.R(i63);
                        } else if (etxVar5.b[i61 + i62] != -1) {
                            long jW = i59 == 0 ? etxVar5.w() : etxVar5.x();
                            if (jW != 0) {
                                j2 = jW;
                                break;
                            }
                        } else {
                            i62++;
                        }
                        j2 = -9223372036854775807L;
                        break;
                    }
                    etxVar5.R(10);
                    int iS = etxVar5.s();
                    etxVar5.R(4);
                    int i64 = etxVar5.i();
                    int i65 = etxVar5.i();
                    etxVar5.R(4);
                    int i66 = etxVar5.i();
                    int i67 = etxVar5.i();
                    int i68 = 65536;
                    if (i64 != 0) {
                        if (i64 == 0) {
                            if (i65 == -65536) {
                                if (i66 != 65536) {
                                    if (i67 == 0) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    i6 = i66;
                                    z4 = z3;
                                    i66 = i6;
                                } else if (i66 == -65536) {
                                    if (i67 == 0) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    i66 = -65536;
                                    i6 = -65536;
                                } else {
                                    i3 = -65536;
                                    i65 = -65536;
                                }
                                if (true != z4) {
                                    s = 1;
                                    i66 = i6;
                                    i4 = 270;
                                    i58 = i64;
                                    i68 = i65;
                                } else {
                                    i3 = -65536;
                                    i65 = -65536;
                                    i66 = i6;
                                    i2 = i58;
                                }
                                i5 = 16;
                            } else {
                                i3 = i65;
                            }
                            i2 = i58;
                        } else {
                            i2 = i64;
                            i66 = i66;
                            s = 1;
                            i58 = i2;
                            i3 = i65;
                        }
                        if (i58 != -65536) {
                            if (i58 == 65536) {
                                i58 = 65536;
                            } else {
                                i68 = i65;
                                i58 = i2;
                                i5 = 16;
                                i4 = 0;
                            }
                        }
                        if (i3 != 0 && i66 == 0 && i67 == -65536) {
                            i4 = 180;
                            i68 = i65;
                            i67 = -65536;
                        } else {
                            i68 = i65;
                            i4 = 0;
                        }
                        i5 = 16;
                    } else {
                        if (i65 == 65536) {
                            if (i66 != -65536) {
                                if (i66 == 65536) {
                                    z5 = i67 != 0;
                                    i66 = 65536;
                                }
                                i65 = 65536;
                            } else {
                                z5 = i67 != 0;
                            }
                            if (true != z5) {
                                i4 = 90;
                                s = 1;
                                i58 = 0;
                            } else {
                                i65 = 65536;
                            }
                            i5 = 16;
                        }
                        i64 = 0;
                        if (i64 == 0) {
                            if (i65 == -65536) {
                                if (i66 != 65536) {
                                    if (i67 == 0) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    i6 = i66;
                                    z4 = z3;
                                    i66 = i6;
                                } else if (i66 == -65536) {
                                    if (i67 == 0) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    i66 = -65536;
                                    i6 = -65536;
                                } else {
                                    i3 = -65536;
                                    i65 = -65536;
                                }
                                if (true != z4) {
                                    s = 1;
                                    i66 = i6;
                                    i4 = 270;
                                    i58 = i64;
                                    i68 = i65;
                                } else {
                                    i3 = -65536;
                                    i65 = -65536;
                                    i66 = i6;
                                    i2 = i58;
                                }
                                i5 = 16;
                            } else {
                                i3 = i65;
                            }
                            i2 = i58;
                        } else {
                            i2 = i64;
                            i66 = i66;
                            s = 1;
                            i58 = i2;
                            i3 = i65;
                        }
                        if (i58 != -65536) {
                            if (i58 == 65536) {
                                i58 = 65536;
                            } else {
                                i68 = i65;
                                i58 = i2;
                                i5 = 16;
                                i4 = 0;
                            }
                        }
                        if (i3 != 0) {
                            i68 = i65;
                            i4 = 0;
                        } else {
                            i68 = i65;
                            i4 = 0;
                        }
                        i5 = 16;
                    }
                    etxVar5.R(i5);
                    short sG = etxVar5.G();
                    etxVar5.R(2);
                    i7 = i57;
                    defpackage.fpy fpyVar = new defpackage.fpy(i60, j2, iS, i4, (((((long) i58) * ((long) i67)) - (((long) i68) * ((long) i66))) > 0L ? 1 : (((((long) i58) * ((long) i67)) - (((long) i68) * ((long) i66))) == 0L ? 0 : -1)) >>> 31, sG, etxVar5.G());
                    long j17 = j == -9223372036854775807L ? fpyVar.b : j;
                    long j18 = c(eutVarB6.a).c;
                    if (j17 == -9223372036854775807L) {
                        j3 = j18;
                        jZ2 = -9223372036854775807L;
                    } else {
                        jZ2 = eum.z(j17, 1000000L, j18);
                        j3 = j18;
                    }
                    defpackage.eus eusVarA3 = eusVarA2.a(1835626086);
                    ahvr.ci(eusVarA3);
                    defpackage.eus eusVarA4 = eusVarA3.a(1937007212);
                    ahvr.ci(eusVarA4);
                    defpackage.eut eutVarB9 = eusVarA2.b(1835296868);
                    ahvr.ci(eutVarB9);
                    defpackage.etx etxVar6 = eutVarB9.a;
                    etxVar6.Q(8);
                    int i69 = (etxVar6.i() >> 24) & 255;
                    etxVar6.R(i69 == 0 ? 8 : 16);
                    long jW2 = etxVar6.w();
                    int i70 = etxVar6.c;
                    int i71 = 0;
                    while (true) {
                        int i72 = i69 == 0 ? 4 : 8;
                        if (i71 >= i72) {
                            etxVar6.R(i72);
                            break;
                        }
                        int i73 = i69;
                        if (etxVar6.b[i70 + i71] != -1) {
                            long jW3 = i73 == 0 ? etxVar6.w() : etxVar6.x();
                            jZ = jW3 != 0 ? eum.z(jW3, 1000000L, jW2) : -9223372036854775807L;
                            break;
                        }
                        i71++;
                        i69 = i73;
                        i70 = i70;
                    }
                    long j19 = jZ;
                    int iS2 = etxVar6.s();
                    char c2 = (char) (((iS2 >> 10) & 31) + 96);
                    char c3 = (char) (((iS2 >> 5) & 31) + 96);
                    char c4 = (char) ((iS2 & 31) + 96);
                    int i74 = 3;
                    char[] cArr = new char[3];
                    cArr[0] = c2;
                    cArr[s] = c3;
                    cArr[2] = c4;
                    arrayList = arrayList6;
                    int i75 = 0;
                    while (true) {
                        if (i75 >= i74) {
                            str = new java.lang.String(cArr);
                            break;
                        }
                        char c5 = cArr[i75];
                        int i76 = i75;
                        if (c5 < 'a' || c5 > 'z') {
                            str = null;
                            break;
                        }
                        i75 = i76 + 1;
                        i74 = 3;
                    }
                    defpackage.eut eutVarB10 = eusVarA4.b(1937011556);
                    if (eutVarB10 == null) {
                        defpackage.etr.f("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                    } else {
                        defpackage.fpv fpvVarQ = q(eutVarB10.a, fpyVar, str, drmInitData, z2);
                        defpackage.eus eusVarA5 = eusVar3.a(1953654118);
                        if (eusVarA5 != null) {
                            defpackage.eut eutVarB11 = eusVarA5.b(1667785072);
                            if (eutVarB11 != null) {
                                defpackage.etx etxVar7 = eutVarB11.a;
                                etxVar7.Q(8);
                                if (etxVar7.d() >= 4) {
                                    i10 = etxVar7.i();
                                } else {
                                    i10 = -1;
                                }
                            } else {
                                i10 = -1;
                            }
                            defpackage.eut eutVarB12 = eusVarA5.b(1667527523);
                            euxVarD2 = eutVarB12 != null ? d(eutVarB12) : null;
                            int i77 = i10;
                            defpackage.eut eutVarB13 = eusVarA5.b(1919837298);
                            if (eutVarB13 != null) {
                                euxVarD = d(eutVarB13);
                                i8 = i77;
                            } else {
                                i8 = i77;
                                euxVarD = null;
                            }
                        } else {
                            euxVarD = null;
                            i8 = -1;
                            euxVarD2 = null;
                        }
                        if (z) {
                            j19 = j19;
                            eusVar2 = eusVar3;
                            jZ2 = jZ2;
                            i8 = i8;
                            j4 = j3;
                            str2 = "BoxParsers";
                        } else {
                            str2 = "BoxParsers";
                            defpackage.eus eusVarA6 = eusVar3.a(1701082227);
                            if (eusVarA6 != null) {
                                eusVar2 = eusVar3;
                                defpackage.eut eutVarB14 = eusVarA6.b(1701606260);
                                if (eutVarB14 == null) {
                                    j4 = j3;
                                    pairCreate = null;
                                } else {
                                    defpackage.etx etxVar8 = eutVarB14.a;
                                    etxVar8.Q(8);
                                    int i78 = etxVar8.i() >> 24;
                                    int iQ9 = etxVar8.q();
                                    vm vmVarC = defpackage.aizi.c(iQ9);
                                    vm vmVarC2 = defpackage.aizi.c(iQ9);
                                    int i79 = 0;
                                    while (i79 < iQ9) {
                                        int i80 = i78 & 255;
                                        int i81 = i79;
                                        short s2 = s;
                                        long j20 = j3;
                                        vmVarC.j(i80 == s2 ? etxVar8.x() : etxVar8.w());
                                        vmVarC2.j(i80 == s2 ? etxVar8.v() : etxVar8.i());
                                        if (etxVar8.G() != s2) {
                                            throw new java.lang.IllegalArgumentException("Unsupported media rate.");
                                        }
                                        etxVar8.R(2);
                                        i79 = i81 + 1;
                                        j3 = j20;
                                        s = 1;
                                    }
                                    j4 = j3;
                                    pairCreate = android.util.Pair.create(vmVarC.i(), vmVarC2.i());
                                }
                                if (pairCreate != null) {
                                    aiziVar2 = (defpackage.aizi) pairCreate.first;
                                    aiziVar = (defpackage.aizi) pairCreate.second;
                                }
                                eqgVar = fpvVarQ.b;
                                if (eqgVar == null) {
                                    function = function;
                                    fqnVarA = null;
                                } else {
                                    arrayList2 = new java.util.ArrayList();
                                    i9 = fpyVar.c;
                                    if (i9 != 0) {
                                        arrayList2.add(new defpackage.eur(i9));
                                    }
                                    if (euxVarD2 != null) {
                                        arrayList2.add(euxVarD2);
                                    }
                                    if (euxVarD != null) {
                                        arrayList2.add(euxVarD);
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        eqyVar = new defpackage.eqy(arrayList2);
                                        defpackage.eqf eqfVar = new defpackage.eqf(eqgVar);
                                        eqyVar2 = eqgVar.l;
                                        if (eqyVar2 != null) {
                                            eqyVar = eqyVar2.e(eqyVar);
                                        }
                                        eqfVar.k = eqyVar;
                                        eqgVar = new defpackage.eqg(eqfVar);
                                    }
                                    boolean z17 = !j$.util.Objects.equals(eqgVar.p, "text/x-unknown");
                                    defpackage.fqm fqmVar = new defpackage.fqm();
                                    fqmVar.a = fpyVar.a;
                                    fqmVar.b = i;
                                    fqmVar.c = jW2;
                                    fqmVar.d = j4;
                                    fqmVar.e = jZ2;
                                    fqmVar.f = j19;
                                    fqmVar.g = eqgVar;
                                    fqmVar.h = fpvVarQ.d;
                                    fqmVar.i = (defpackage.fqo[]) fpvVarQ.a.clone();
                                    fqmVar.j = fpvVarQ.c;
                                    fqmVar.k = aiziVar2;
                                    fqmVar.l = aiziVar;
                                    fqmVar.m = z17;
                                    fqmVar.n = i8;
                                    fqnVarA = fqmVar.a();
                                    function = function;
                                }
                            } else {
                                j19 = j19;
                                eusVar2 = eusVar3;
                                jZ2 = jZ2;
                                i8 = i8;
                                j4 = j3;
                            }
                        }
                        aiziVar = null;
                        aiziVar2 = null;
                        eqgVar = fpvVarQ.b;
                        if (eqgVar == null) {
                            function = function;
                            fqnVarA = null;
                        } else {
                            arrayList2 = new java.util.ArrayList();
                            i9 = fpyVar.c;
                            if (i9 != 0) {
                                arrayList2.add(new defpackage.eur(i9));
                            }
                            if (euxVarD2 != null) {
                                arrayList2.add(euxVarD2);
                            }
                            if (euxVarD != null) {
                                arrayList2.add(euxVarD);
                            }
                            if (!arrayList2.isEmpty()) {
                                eqyVar = new defpackage.eqy(arrayList2);
                                defpackage.eqf eqfVar2 = new defpackage.eqf(eqgVar);
                                eqyVar2 = eqgVar.l;
                                if (eqyVar2 != null) {
                                    eqyVar = eqyVar2.e(eqyVar);
                                }
                                eqfVar2.k = eqyVar;
                                eqgVar = new defpackage.eqg(eqfVar2);
                            }
                            boolean z18 = !j$.util.Objects.equals(eqgVar.p, "text/x-unknown");
                            defpackage.fqm fqmVar2 = new defpackage.fqm();
                            fqmVar2.a = fpyVar.a;
                            fqmVar2.b = i;
                            fqmVar2.c = jW2;
                            fqmVar2.d = j4;
                            fqmVar2.e = jZ2;
                            fqmVar2.f = j19;
                            fqmVar2.g = eqgVar;
                            fqmVar2.h = fpvVarQ.d;
                            fqmVar2.i = (defpackage.fqo[]) fpvVarQ.a.clone();
                            fqmVar2.j = fpvVarQ.c;
                            fqmVar2.k = aiziVar2;
                            fqmVar2.l = aiziVar;
                            fqmVar2.m = z18;
                            fqmVar2.n = i8;
                            fqnVarA = fqmVar2.a();
                            function = function;
                        }
                    }
                    fqnVarA2 = (defpackage.fqn) aa$.ExternalSyntheticApiModelOutline1.m(function, fqnVarA);
                    if (fqnVarA2 != null) {
                        defpackage.eus eusVarA7 = eusVar2.a(1835297121);
                        ahvr.ci(eusVarA7);
                        defpackage.eus eusVarA8 = eusVarA7.a(1835626086);
                        ahvr.ci(eusVarA8);
                        eusVarA = eusVarA8.a(1937007212);
                        ahvr.ci(eusVarA);
                        eutVarB = eusVarA.b(1937011578);
                        if (eutVarB != null) {
                            fpxVar = new defpackage.fpw(eutVarB, fqnVarA2.g);
                        } else {
                            eutVarB2 = eusVarA.b(1937013298);
                            if (eutVarB2 != null) {
                                throw new defpackage.era("Track has no sample table size information", null, true, 1);
                            }
                            fpxVar = new defpackage.fpx(eutVarB2);
                        }
                        iB = fpxVar.b();
                        if (iB == 0) {
                            fqqVar2 = new defpackage.fqq(fqnVarA2, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                        } else {
                            if (fqnVarA2.b == 2) {
                                j16 = fqnVarA2.f;
                                if (j16 > 0) {
                                    defpackage.eqf eqfVar3 = new defpackage.eqf(fqnVarA2.g);
                                    f = iB / (j16 / 1000000.0f);
                                    if (f != -1.0f || f > 0.0f) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    ahvr.bM(z16);
                                    eqfVar3.x = f;
                                    defpackage.eqg eqgVar3 = new defpackage.eqg(eqfVar3);
                                    defpackage.fqm fqmVar3 = new defpackage.fqm(fqnVarA2);
                                    fqmVar3.g = eqgVar3;
                                    fqnVarA2 = fqmVar3.a();
                                }
                            }
                            eutVarB3 = eusVarA.b(1937007471);
                            if (eutVarB3 == null) {
                                eutVarB3 = eusVarA.b(1668232756);
                                ahvr.ci(eutVarB3);
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            defpackage.eut eutVarB15 = eusVarA.b(1937011555);
                            ahvr.ci(eutVarB15);
                            defpackage.eut eutVarB16 = eusVarA.b(1937011827);
                            ahvr.ci(eutVarB16);
                            eutVarB4 = eusVarA.b(1937011571);
                            if (eutVarB4 != null) {
                                etxVar = eutVarB4.a;
                            } else {
                                etxVar = null;
                            }
                            eutVarB5 = eusVarA.b(1668576371);
                            if (eutVarB5 != null) {
                                etxVar2 = eutVarB5.a;
                            } else {
                                etxVar2 = null;
                            }
                            etxVar3 = eutVarB16.a;
                            fprVar = new defpackage.fpr(eutVarB15.a, eutVarB3.a, z6);
                            etxVar3.Q(12);
                            iQ = etxVar3.q() - 1;
                            iQ2 = etxVar3.q();
                            iQ3 = etxVar3.q();
                            if (etxVar2 != null) {
                                etxVar2.Q(12);
                                iQ4 = etxVar2.q();
                            } else {
                                iQ4 = 0;
                            }
                            if (etxVar != null) {
                                etxVar.Q(12);
                                iQ6 = etxVar.q();
                                if (iQ6 > 0) {
                                    i11 = -1;
                                    iQ5 = etxVar.q() - 1;
                                } else {
                                    i11 = -1;
                                    iQ5 = -1;
                                    etxVar = null;
                                }
                            } else {
                                i11 = -1;
                                iQ5 = -1;
                                iQ6 = 0;
                            }
                            iA = fpxVar.a();
                            etxVar4 = etxVar2;
                            eqgVar2 = fqnVarA2.g;
                            if (iA != i11) {
                                str5 = eqgVar2.p;
                                if ((!"audio/raw".equals(str5) || "audio/g711-mlaw".equals(str5) || "audio/g711-alaw".equals(str5)) && iQ == 0) {
                                    if (iQ4 == 0 || iQ6 != 0) {
                                        z7 = false;
                                    } else {
                                        z7 = true;
                                    }
                                    iQ = 0;
                                } else {
                                    z7 = false;
                                }
                            } else {
                                z7 = false;
                            }
                            arrayList3 = new java.util.ArrayList();
                            if (etxVar == null) {
                                r49 = 1;
                            } else {
                                r49 = 0;
                            }
                            if (z7) {
                                i46 = fprVar.a;
                                jArr10 = new long[i46];
                                iArr9 = new int[i46];
                                while (fprVar.a()) {
                                    int i82 = fprVar.b;
                                    jArr10[i82] = fprVar.d;
                                    iArr9[i82] = fprVar.c;
                                }
                                j14 = iQ3;
                                iMax = java.lang.Math.max(1, 8192 / iA);
                                i48 = 0;
                                for (i47 = 0; i47 < i46; i47++) {
                                    int i83 = iArr9[i47];
                                    java.lang.String str6 = eum.a;
                                    i48 += ((i83 + iMax) - 1) / iMax;
                                }
                                jArr11 = new long[i48];
                                iArrCopyOf = new int[i48];
                                jArrCopyOf = new long[i48];
                                iArr10 = new int[i48];
                                i49 = 0;
                                i50 = 0;
                                i51 = 0;
                                i52 = 0;
                                i53 = 0;
                                while (i51 < i46) {
                                    int i84 = iArr9[i51];
                                    j15 = jArr10[i51];
                                    int i85 = i53;
                                    int i86 = i46;
                                    iMax2 = i52;
                                    i54 = i85;
                                    i55 = i50;
                                    i56 = i84;
                                    while (i56 > 0) {
                                        int iMin = java.lang.Math.min(iMax, i56);
                                        jArr11[i54] = j15;
                                        int i87 = i56;
                                        int i88 = iA * iMin;
                                        iArrCopyOf[i54] = i88;
                                        i55 += i88;
                                        iMax2 = java.lang.Math.max(iMax2, i88);
                                        long j21 = j14;
                                        jArrCopyOf[i54] = j21 * ((long) i49);
                                        iArr10[i54] = 1;
                                        j15 += (long) iArrCopyOf[i54];
                                        i49 += iMin;
                                        i56 = i87 - iMin;
                                        i54++;
                                        j14 = j21;
                                    }
                                    i51++;
                                    int i89 = i54;
                                    i52 = iMax2;
                                    i46 = i86;
                                    i53 = i89;
                                    i50 = i55;
                                }
                                j9 = i50;
                                fqnVarA3 = fqnVarA2;
                                j8 = j14 * ((long) i49);
                                jArr4 = jArr11;
                                i25 = i48;
                                r47 = iArr10;
                                i24 = i52;
                            } else {
                                jArr = new long[iB];
                                iArr = new int[iB];
                                int i90 = iQ6;
                                jArr2 = new long[iB];
                                fptVar = fpxVar;
                                iArr2 = new int[iB];
                                i12 = iQ;
                                iQ7 = iQ2;
                                j5 = 0;
                                j6 = 0;
                                j7 = 0;
                                i13 = i90;
                                i14 = 0;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                iQ8 = 0;
                                while (true) {
                                    if (i14 < iB) {
                                        r5 = iArr2;
                                        fqnVarA3 = fqnVarA2;
                                        str3 = str2;
                                        iArrCopyOf = iArr;
                                        jArrCopyOf = jArr2;
                                        CopyOf = r5;
                                        jArr3 = jArr;
                                        break;
                                    }
                                    zA = true;
                                    while (true) {
                                        if (i17 == 0) {
                                            r5 = iArr2;
                                            i26 = iB;
                                            i27 = i17;
                                            break;
                                        }
                                        zA = fprVar.a();
                                        i26 = iB;
                                        if (zA) {
                                            r5 = iArr2;
                                            i27 = 0;
                                            break;
                                        }
                                        r5 = iArr2;
                                        j5 = fprVar.d;
                                        i17 = fprVar.c;
                                        fqnVarA2 = fqnVarA2;
                                        iB = i26;
                                    }
                                    fqnVarA3 = fqnVarA2;
                                    if (!zA) {
                                        str3 = str2;
                                        defpackage.etr.f(str3, "Unexpected end of chunk data");
                                        long[] jArrCopyOf2 = java.util.Arrays.copyOf(jArr, i14);
                                        iArrCopyOf = java.util.Arrays.copyOf(iArr, i14);
                                        jArrCopyOf = java.util.Arrays.copyOf(jArr2, i14);
                                        iB = i14;
                                        jArr3 = jArrCopyOf2;
                                        CopyOf = java.util.Arrays.copyOf((int[]) r5, i14);
                                        break;
                                    }
                                    java.lang.String str7 = str2;
                                    if (etxVar4 != null) {
                                        while (iQ8 == 0) {
                                            if (iQ4 > 0) {
                                                iQ8 = 0;
                                                break;
                                            }
                                            iQ4--;
                                            iQ8 = etxVar4.q();
                                            i15 = etxVar4.i();
                                        }
                                        iQ8--;
                                    }
                                    long[] jArr12 = jArr;
                                    iC = fptVar.c();
                                    long[] jArr13 = jArr2;
                                    r43 = r5;
                                    long j22 = iC;
                                    j7 += j22;
                                    if (iC > i16) {
                                        i16 = iC;
                                    }
                                    jArr12[i14] = j5;
                                    iArr[i14] = iC;
                                    int i91 = i27;
                                    jArr13[i14] = j6 + ((long) i15);
                                    r43[i14] = r49;
                                    if (i14 == iQ5) {
                                        r43[i14] = 1;
                                        arrayList3.add(java.lang.Integer.valueOf(i14));
                                    }
                                    if (etxVar != null && i14 == iQ5 && (i13 = i13 - 1) > 0) {
                                        iQ5 = etxVar.q() - 1;
                                    }
                                    j6 += (long) iQ3;
                                    i28 = iQ7 - 1;
                                    if (i28 == 0) {
                                        iQ7 = i28;
                                    } else if (i12 > 0) {
                                        i12--;
                                        iQ7 = etxVar3.q();
                                        iQ3 = etxVar3.i();
                                    } else {
                                        iQ7 = 0;
                                    }
                                    j5 += j22;
                                    i17 = i91 - 1;
                                    i14++;
                                    jArr = jArr12;
                                    jArr2 = jArr13;
                                    iB = i26;
                                    r5 = r43;
                                    str2 = str7;
                                    fqnVarA2 = fqnVarA3;
                                }
                                long j23 = j6 + ((long) i15);
                                if (etxVar4 != null) {
                                    z8 = true;
                                    break;
                                }
                                while (true) {
                                    if (iQ4 > 0) {
                                        z8 = true;
                                        break;
                                    }
                                    if (etxVar4.q() != 0) {
                                        z8 = false;
                                        break;
                                    }
                                    etxVar4.i();
                                    iQ4--;
                                }
                                if (i13 == 0) {
                                    z9 = z8;
                                    i18 = iB;
                                    i19 = i17;
                                    i20 = iQ7;
                                    i21 = i13;
                                    i22 = i12;
                                    i23 = iQ8;
                                } else if (iQ7 == 0) {
                                    z9 = z8;
                                    i18 = iB;
                                    i19 = i17;
                                    i20 = iQ7;
                                    i22 = i12;
                                    i23 = iQ8;
                                    i21 = 0;
                                } else if (i17 == 0) {
                                    z9 = z8;
                                    i18 = iB;
                                    i19 = i17;
                                    i22 = i12;
                                    i23 = iQ8;
                                    i21 = 0;
                                    i20 = 0;
                                } else if (i12 == 0) {
                                    z9 = z8;
                                    i18 = iB;
                                    i22 = i12;
                                    i23 = iQ8;
                                    i21 = 0;
                                    i20 = 0;
                                    i19 = 0;
                                } else if (iQ8 == 0) {
                                    i18 = iB;
                                    if (z8) {
                                        fqnVarA3 = fqnVarA3;
                                    } else {
                                        i21 = 0;
                                        i20 = 0;
                                        i19 = 0;
                                        i22 = 0;
                                        i23 = 0;
                                        z9 = false;
                                    }
                                    i24 = i16;
                                    i25 = i18;
                                    j8 = j23;
                                    j9 = j7;
                                    r47 = CopyOf;
                                    jArr4 = jArr3;
                                } else {
                                    z9 = z8;
                                    i18 = iB;
                                    i23 = iQ8;
                                    i21 = 0;
                                    i20 = 0;
                                    i19 = 0;
                                    i22 = 0;
                                }
                                int i92 = fqnVarA3.a;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Inconsistent stbl box for track ");
                                sb.append(i92);
                                sb.append(": remainingSynchronizationSamples ");
                                sb.append(i21);
                                sb.append(", remainingSamplesAtTimestampDelta ");
                                sb.append(i20);
                                sb.append(", remainingSamplesInChunk ");
                                sb.append(i19);
                                sb.append(", remainingTimestampDeltaChanges ");
                                sb.append(i22);
                                sb.append(", remainingSamplesAtTimestampOffset ");
                                sb.append(i23);
                                if (true != z9) {
                                    str4 = ", ctts invalid";
                                } else {
                                    str4 = "";
                                }
                                sb.append(str4);
                                defpackage.etr.f(str3, sb.toString());
                                i24 = i16;
                                i25 = i18;
                                j8 = j23;
                                j9 = j7;
                                r47 = CopyOf;
                                jArr4 = jArr3;
                            }
                            iArr3 = iArrCopyOf;
                            j10 = fqnVarA3.f;
                            if (j10 > 0) {
                                jA5 = eum.A(j9 << 3, 1000000L, j10, java.math.RoundingMode.HALF_DOWN);
                                if (jA5 > 0 && jA5 < 2147483647L) {
                                    defpackage.eqf eqfVar4 = new defpackage.eqf(eqgVar2);
                                    eqfVar4.h = (int) jA5;
                                    defpackage.eqg eqgVar4 = new defpackage.eqg(eqfVar4);
                                    defpackage.fqm fqmVar4 = new defpackage.fqm(fqnVarA3);
                                    fqmVar4.g = eqgVar4;
                                    fqnVarA3 = fqmVar4.a();
                                }
                            }
                            j11 = fqnVarA3.c;
                            jZ3 = eum.z(j8, 1000000L, j11);
                            iArrW = aiql.W(arrayList3);
                            aiziVar3 = fqnVarA3.i;
                            if (aiziVar3 == null) {
                                eum.ag(jArrCopyOf, j11);
                                fqqVar = new defpackage.fqq(fqnVarA3, jArr4, iArr3, i24, jArrCopyOf, r47, iArrW, r49, jZ3, i25);
                            } else {
                                i29 = aiziVar3.b;
                                if (i29 != 1) {
                                    if (fqnVarA3.b == 1 || (length = jArrCopyOf.length) < 2) {
                                        j12 = j11;
                                    } else {
                                        defpackage.aizi aiziVar5 = fqnVarA3.j;
                                        ahvr.ci(aiziVar5);
                                        long jA6 = aiziVar5.a(0);
                                        long jA7 = aiziVar3.a(0);
                                        long j24 = fqnVarA3.d;
                                        long jZ5 = eum.z(jA7, j11, j24) + jA6;
                                        int i93 = length - 1;
                                        int iC2 = eum.c(4, 0, i93);
                                        int iC3 = eum.c(length - 4, 0, i93);
                                        if (jArrCopyOf[0] > jA6 || jA6 >= jArrCopyOf[iC2] || jArrCopyOf[iC3] >= jZ5 || jZ5 > 2 + j8) {
                                            j12 = j11;
                                        } else {
                                            long jMax = java.lang.Math.max(0L, j8 - jZ5);
                                            long j25 = jA6 - jArrCopyOf[0];
                                            long j26 = fqnVarA3.g.J;
                                            long jZ6 = eum.z(j25, j26, j11);
                                            long jZ7 = eum.z(jMax, j26, j11);
                                            j12 = j11;
                                            if (jZ6 != 0) {
                                                if (jZ6 > 2147483647L && jZ7 <= 2147483647L) {
                                                    flsVar.a = (int) jZ6;
                                                    flsVar.b = (int) jZ7;
                                                    eum.ag(jArrCopyOf, j12);
                                                    fqqVar = new defpackage.fqq(fqnVarA3, jArr4, iArr3, i24, jArrCopyOf, r47, iArrW, r49, eum.z(aiziVar3.a(0), 1000000L, j24), i25);
                                                }
                                            } else if (jZ7 != 0) {
                                                jZ6 = 0;
                                                if (jZ6 > 2147483647L) {
                                                }
                                            }
                                        }
                                    }
                                    i29 = 1;
                                } else {
                                    j12 = j11;
                                }
                                if (i29 == 1) {
                                    jA = 0;
                                    if (aiziVar3.a(0) == 0) {
                                        defpackage.aizi aiziVar6 = fqnVarA3.j;
                                        ahvr.ci(aiziVar6);
                                        jA4 = aiziVar6.a(0);
                                        i45 = 0;
                                        while (i45 < jArrCopyOf.length) {
                                            long j27 = j12;
                                            jArrCopyOf[i45] = eum.z(jArrCopyOf[i45] - jA4, 1000000L, j27);
                                            i45++;
                                            j12 = j27;
                                        }
                                        fqqVar = new defpackage.fqq(fqnVarA3, jArr4, iArr3, i24, jArrCopyOf, r47, iArrW, r49, eum.z(j8 - jA4, 1000000L, j12), i25);
                                    }
                                } else {
                                    jA = 0;
                                }
                                j13 = j12;
                                jArr5 = jArr4;
                                r12 = r47;
                                i30 = i25;
                                if (fqnVarA3.b == 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                aiziVar4 = fqnVarA3.j;
                                iArr4 = new int[i29];
                                iArr5 = new int[i29];
                                ahvr.ci(aiziVar4);
                                i31 = 0;
                                i32 = 0;
                                i33 = 0;
                                z11 = false;
                                while (i32 < i29) {
                                    long[] jArr14 = jArr5;
                                    jA3 = aiziVar4.a(i32);
                                    if (jA3 != -1) {
                                        iArr8 = iArr5;
                                        i39 = i32;
                                        long j28 = j13;
                                        j13 = j28;
                                        jZ4 = eum.z(aiziVar3.a(i32), j28, fqnVarA3.d) + jA3;
                                        iArr4[i39] = eum.ac(jArrCopyOf, jA3, true);
                                        int iAb = eum.ab(jArrCopyOf, jZ4, z10);
                                        i40 = iAb - 1;
                                        i42 = 0;
                                        for (i41 = iAb; i41 < jArrCopyOf.length; i41++) {
                                            if (jArrCopyOf[i41] < jZ4) {
                                                i42++;
                                                if (i42 <= fqnVarA3.g.r) {
                                                    break;
                                                }
                                            } else {
                                                i40 = i41;
                                            }
                                        }
                                        iArr8[i39] = i40 + 1;
                                        i43 = iArr4[i39];
                                        while (true) {
                                            i44 = iArr4[i39];
                                            if (i44 > 0 || (r12[i44] & 1) != 0) {
                                                break;
                                                break;
                                            }
                                            iArr4[i39] = i44 - 1;
                                        }
                                        if (i44 == 0 && (r12[0] & 1) == 0) {
                                            iArr4[i39] = i43;
                                            while (true) {
                                                i44 = iArr4[i39];
                                                if (i44 >= iArr8[i39] || (r12[i44] & 1) != 0) {
                                                    break;
                                                }
                                                iArr4[i39] = i44 + 1;
                                            }
                                        }
                                        int i94 = iArr8[i39];
                                        i33 += i94 - i44;
                                        if (i31 != i44) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        z11 |= z15;
                                        i31 = i94;
                                    } else {
                                        iArr8 = iArr5;
                                        i39 = i32;
                                    }
                                    i32 = i39 + 1;
                                    arrayList3 = arrayList3;
                                    z10 = z10;
                                    iArr5 = iArr8;
                                    jArr5 = jArr14;
                                }
                                iArr6 = iArr5;
                                jArr6 = jArr5;
                                arrayList4 = arrayList3;
                                if (i33 != i30) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                z13 = z11 | z12;
                                if (z13) {
                                    jArr7 = new long[i33];
                                    iArr7 = new int[i33];
                                } else {
                                    iArr7 = iArr3;
                                    jArr7 = jArr6;
                                }
                                if (true == z13) {
                                    i24 = 0;
                                }
                                if (z13) {
                                    arrayList5 = new java.util.ArrayList();
                                    r6 = new int[i33];
                                } else {
                                    r6 = r12;
                                    arrayList5 = arrayList4;
                                }
                                jArr8 = new long[i33];
                                i34 = 0;
                                i35 = 0;
                                r7 = r6;
                                while (i34 < i29) {
                                    jA2 = aiziVar4.a(i34);
                                    i36 = iArr4[i34];
                                    int i95 = i29;
                                    i37 = iArr6[i34];
                                    z14 = z13;
                                    if (z13) {
                                        int i96 = i37 - i36;
                                        jArr9 = jArr6;
                                        java.lang.System.arraycopy(jArr9, i36, jArr7, i35, i96);
                                        java.lang.System.arraycopy(iArr3, i36, iArr7, i35, i96);
                                        java.lang.System.arraycopy(r12, i36, r7, i35, i96);
                                    } else {
                                        jArr9 = jArr6;
                                    }
                                    i38 = i24;
                                    r8 = r7;
                                    while (i36 < i37) {
                                        int[] iArr11 = iArr7;
                                        ?? r48 = r8;
                                        jArr8[i35] = eum.z(jA, 1000000L, fqnVarA3.d) + eum.z(jArrCopyOf[i36] - jA2, 1000000L, j13);
                                        if (z14 && iArr11[i35] > i38) {
                                            i38 = iArr3[i36];
                                        }
                                        if (!z14 && r49 == 0 && (r48[i35] & 1) != 0) {
                                            arrayList5.add(java.lang.Integer.valueOf(i35));
                                        }
                                        i35++;
                                        i36++;
                                        iArr7 = iArr11;
                                        r8 = r48;
                                    }
                                    jA += aiziVar3.a(i34);
                                    i34++;
                                    i24 = i38;
                                    jArr6 = jArr9;
                                    i29 = i95;
                                    z13 = z14;
                                    aiziVar4 = aiziVar4;
                                    iArr7 = iArr7;
                                    r7 = r8;
                                }
                                fqqVar = new defpackage.fqq(fqnVarA3, jArr7, iArr7, i24, jArr8, r7, aiql.W(arrayList5), r49, eum.z(jA, 1000000L, fqnVarA3.d), jArr7.length);
                            }
                            fqqVar2 = fqqVar;
                        }
                        arrayList.add(fqqVar2);
                    } else {
                        arrayList = arrayList;
                    }
                }
                eusVar2 = eusVar3;
                str2 = "BoxParsers";
                fqnVarA = null;
                fqnVarA2 = (defpackage.fqn) aa$.ExternalSyntheticApiModelOutline1.m(function, fqnVarA);
                if (fqnVarA2 != null) {
                    defpackage.eus eusVarA9 = eusVar2.a(1835297121);
                    ahvr.ci(eusVarA9);
                    defpackage.eus eusVarA10 = eusVarA9.a(1835626086);
                    ahvr.ci(eusVarA10);
                    eusVarA = eusVarA10.a(1937007212);
                    ahvr.ci(eusVarA);
                    eutVarB = eusVarA.b(1937011578);
                    if (eutVarB != null) {
                        fpxVar = new defpackage.fpw(eutVarB, fqnVarA2.g);
                    } else {
                        eutVarB2 = eusVarA.b(1937013298);
                        if (eutVarB2 != null) {
                            throw new defpackage.era("Track has no sample table size information", null, true, 1);
                        }
                        fpxVar = new defpackage.fpx(eutVarB2);
                    }
                    iB = fpxVar.b();
                    if (iB == 0) {
                        fqqVar2 = new defpackage.fqq(fqnVarA2, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                    } else {
                        if (fqnVarA2.b == 2) {
                            j16 = fqnVarA2.f;
                            if (j16 > 0) {
                                defpackage.eqf eqfVar5 = new defpackage.eqf(fqnVarA2.g);
                                f = iB / (j16 / 1000000.0f);
                                if (f != -1.0f) {
                                    z16 = true;
                                } else {
                                    z16 = true;
                                }
                                ahvr.bM(z16);
                                eqfVar5.x = f;
                                defpackage.eqg eqgVar5 = new defpackage.eqg(eqfVar5);
                                defpackage.fqm fqmVar5 = new defpackage.fqm(fqnVarA2);
                                fqmVar5.g = eqgVar5;
                                fqnVarA2 = fqmVar5.a();
                            }
                        }
                        eutVarB3 = eusVarA.b(1937007471);
                        if (eutVarB3 == null) {
                            eutVarB3 = eusVarA.b(1668232756);
                            ahvr.ci(eutVarB3);
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        defpackage.eut eutVarB17 = eusVarA.b(1937011555);
                        ahvr.ci(eutVarB17);
                        defpackage.eut eutVarB18 = eusVarA.b(1937011827);
                        ahvr.ci(eutVarB18);
                        eutVarB4 = eusVarA.b(1937011571);
                        if (eutVarB4 != null) {
                            etxVar = eutVarB4.a;
                        } else {
                            etxVar = null;
                        }
                        eutVarB5 = eusVarA.b(1668576371);
                        if (eutVarB5 != null) {
                            etxVar2 = eutVarB5.a;
                        } else {
                            etxVar2 = null;
                        }
                        etxVar3 = eutVarB18.a;
                        fprVar = new defpackage.fpr(eutVarB17.a, eutVarB3.a, z6);
                        etxVar3.Q(12);
                        iQ = etxVar3.q() - 1;
                        iQ2 = etxVar3.q();
                        iQ3 = etxVar3.q();
                        if (etxVar2 != null) {
                            etxVar2.Q(12);
                            iQ4 = etxVar2.q();
                        } else {
                            iQ4 = 0;
                        }
                        if (etxVar != null) {
                            etxVar.Q(12);
                            iQ6 = etxVar.q();
                            if (iQ6 > 0) {
                                i11 = -1;
                                iQ5 = etxVar.q() - 1;
                            } else {
                                i11 = -1;
                                iQ5 = -1;
                                etxVar = null;
                            }
                        } else {
                            i11 = -1;
                            iQ5 = -1;
                            iQ6 = 0;
                        }
                        iA = fpxVar.a();
                        etxVar4 = etxVar2;
                        eqgVar2 = fqnVarA2.g;
                        if (iA != i11) {
                            str5 = eqgVar2.p;
                            if ("audio/raw".equals(str5)) {
                                if (iQ4 == 0) {
                                    z7 = false;
                                } else {
                                    z7 = false;
                                }
                                iQ = 0;
                            } else {
                                if (iQ4 == 0) {
                                    z7 = false;
                                } else {
                                    z7 = false;
                                }
                                iQ = 0;
                            }
                        } else {
                            z7 = false;
                        }
                        arrayList3 = new java.util.ArrayList();
                        if (etxVar == null) {
                            r49 = 1;
                        } else {
                            r49 = 0;
                        }
                        if (z7) {
                            i46 = fprVar.a;
                            jArr10 = new long[i46];
                            iArr9 = new int[i46];
                            while (fprVar.a()) {
                                int i810 = fprVar.b;
                                jArr10[i810] = fprVar.d;
                                iArr9[i810] = fprVar.c;
                            }
                            j14 = iQ3;
                            iMax = java.lang.Math.max(1, 8192 / iA);
                            i48 = 0;
                            while (i47 < i46) {
                                int i811 = iArr9[i47];
                                java.lang.String str8 = eum.a;
                                i48 += ((i811 + iMax) - 1) / iMax;
                            }
                            jArr11 = new long[i48];
                            iArrCopyOf = new int[i48];
                            jArrCopyOf = new long[i48];
                            iArr10 = new int[i48];
                            i49 = 0;
                            i50 = 0;
                            i51 = 0;
                            i52 = 0;
                            i53 = 0;
                            while (i51 < i46) {
                                int i812 = iArr9[i51];
                                j15 = jArr10[i51];
                                int i813 = i53;
                                int i814 = i46;
                                iMax2 = i52;
                                i54 = i813;
                                i55 = i50;
                                i56 = i812;
                                while (i56 > 0) {
                                    int iMin2 = java.lang.Math.min(iMax, i56);
                                    jArr11[i54] = j15;
                                    int i815 = i56;
                                    int i816 = iA * iMin2;
                                    iArrCopyOf[i54] = i816;
                                    i55 += i816;
                                    iMax2 = java.lang.Math.max(iMax2, i816);
                                    long j29 = j14;
                                    jArrCopyOf[i54] = j29 * ((long) i49);
                                    iArr10[i54] = 1;
                                    j15 += (long) iArrCopyOf[i54];
                                    i49 += iMin2;
                                    i56 = i815 - iMin2;
                                    i54++;
                                    j14 = j29;
                                }
                                i51++;
                                int i817 = i54;
                                i52 = iMax2;
                                i46 = i814;
                                i53 = i817;
                                i50 = i55;
                            }
                            j9 = i50;
                            fqnVarA3 = fqnVarA2;
                            j8 = j14 * ((long) i49);
                            jArr4 = jArr11;
                            i25 = i48;
                            r47 = iArr10;
                            i24 = i52;
                        } else {
                            jArr = new long[iB];
                            iArr = new int[iB];
                            int i97 = iQ6;
                            jArr2 = new long[iB];
                            fptVar = fpxVar;
                            iArr2 = new int[iB];
                            i12 = iQ;
                            iQ7 = iQ2;
                            j5 = 0;
                            j6 = 0;
                            j7 = 0;
                            i13 = i97;
                            i14 = 0;
                            i15 = 0;
                            i16 = 0;
                            i17 = 0;
                            iQ8 = 0;
                            while (true) {
                                if (i14 < iB) {
                                    r5 = iArr2;
                                    fqnVarA3 = fqnVarA2;
                                    str3 = str2;
                                    iArrCopyOf = iArr;
                                    jArrCopyOf = jArr2;
                                    CopyOf = r5;
                                    jArr3 = jArr;
                                    break;
                                }
                                zA = true;
                                while (true) {
                                    if (i17 == 0) {
                                        r5 = iArr2;
                                        i26 = iB;
                                        i27 = i17;
                                        break;
                                    }
                                    zA = fprVar.a();
                                    i26 = iB;
                                    if (zA) {
                                        r5 = iArr2;
                                        i27 = 0;
                                        break;
                                    }
                                    r5 = iArr2;
                                    j5 = fprVar.d;
                                    i17 = fprVar.c;
                                    fqnVarA2 = fqnVarA2;
                                    iB = i26;
                                }
                                fqnVarA3 = fqnVarA2;
                                if (!zA) {
                                    str3 = str2;
                                    defpackage.etr.f(str3, "Unexpected end of chunk data");
                                    long[] jArrCopyOf3 = java.util.Arrays.copyOf(jArr, i14);
                                    iArrCopyOf = java.util.Arrays.copyOf(iArr, i14);
                                    jArrCopyOf = java.util.Arrays.copyOf(jArr2, i14);
                                    iB = i14;
                                    jArr3 = jArrCopyOf3;
                                    CopyOf = java.util.Arrays.copyOf((int[]) r5, i14);
                                    break;
                                }
                                java.lang.String str9 = str2;
                                if (etxVar4 != null) {
                                    while (iQ8 == 0) {
                                        if (iQ4 > 0) {
                                            iQ8 = 0;
                                            break;
                                        }
                                        iQ4--;
                                        iQ8 = etxVar4.q();
                                        i15 = etxVar4.i();
                                    }
                                    iQ8--;
                                }
                                long[] jArr15 = jArr;
                                iC = fptVar.c();
                                long[] jArr16 = jArr2;
                                r43 = r5;
                                long j210 = iC;
                                j7 += j210;
                                if (iC > i16) {
                                    i16 = iC;
                                }
                                jArr15[i14] = j5;
                                iArr[i14] = iC;
                                int i98 = i27;
                                jArr16[i14] = j6 + ((long) i15);
                                r43[i14] = r49;
                                if (i14 == iQ5) {
                                    r43[i14] = 1;
                                    arrayList3.add(java.lang.Integer.valueOf(i14));
                                }
                                if (etxVar != null) {
                                    iQ5 = etxVar.q() - 1;
                                }
                                j6 += (long) iQ3;
                                i28 = iQ7 - 1;
                                if (i28 == 0) {
                                    iQ7 = i28;
                                } else if (i12 > 0) {
                                    i12--;
                                    iQ7 = etxVar3.q();
                                    iQ3 = etxVar3.i();
                                } else {
                                    iQ7 = 0;
                                }
                                j5 += j210;
                                i17 = i98 - 1;
                                i14++;
                                jArr = jArr15;
                                jArr2 = jArr16;
                                iB = i26;
                                r5 = r43;
                                str2 = str9;
                                fqnVarA2 = fqnVarA3;
                            }
                            long j211 = j6 + ((long) i15);
                            if (etxVar4 != null) {
                                z8 = true;
                                break;
                            }
                            while (true) {
                                if (iQ4 > 0) {
                                    z8 = true;
                                    break;
                                }
                                if (etxVar4.q() != 0) {
                                    z8 = false;
                                    break;
                                }
                                etxVar4.i();
                                iQ4--;
                            }
                            if (i13 == 0) {
                                z9 = z8;
                                i18 = iB;
                                i19 = i17;
                                i20 = iQ7;
                                i21 = i13;
                                i22 = i12;
                                i23 = iQ8;
                            } else if (iQ7 == 0) {
                                z9 = z8;
                                i18 = iB;
                                i19 = i17;
                                i20 = iQ7;
                                i22 = i12;
                                i23 = iQ8;
                                i21 = 0;
                            } else if (i17 == 0) {
                                z9 = z8;
                                i18 = iB;
                                i19 = i17;
                                i22 = i12;
                                i23 = iQ8;
                                i21 = 0;
                                i20 = 0;
                            } else if (i12 == 0) {
                                z9 = z8;
                                i18 = iB;
                                i22 = i12;
                                i23 = iQ8;
                                i21 = 0;
                                i20 = 0;
                                i19 = 0;
                            } else if (iQ8 == 0) {
                                i18 = iB;
                                if (z8) {
                                    i21 = 0;
                                    i20 = 0;
                                    i19 = 0;
                                    i22 = 0;
                                    i23 = 0;
                                    z9 = false;
                                } else {
                                    fqnVarA3 = fqnVarA3;
                                }
                                i24 = i16;
                                i25 = i18;
                                j8 = j211;
                                j9 = j7;
                                r47 = CopyOf;
                                jArr4 = jArr3;
                            } else {
                                z9 = z8;
                                i18 = iB;
                                i23 = iQ8;
                                i21 = 0;
                                i20 = 0;
                                i19 = 0;
                                i22 = 0;
                            }
                            int i99 = fqnVarA3.a;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Inconsistent stbl box for track ");
                            sb2.append(i99);
                            sb2.append(": remainingSynchronizationSamples ");
                            sb2.append(i21);
                            sb2.append(", remainingSamplesAtTimestampDelta ");
                            sb2.append(i20);
                            sb2.append(", remainingSamplesInChunk ");
                            sb2.append(i19);
                            sb2.append(", remainingTimestampDeltaChanges ");
                            sb2.append(i22);
                            sb2.append(", remainingSamplesAtTimestampOffset ");
                            sb2.append(i23);
                            if (true != z9) {
                                str4 = ", ctts invalid";
                            } else {
                                str4 = "";
                            }
                            sb2.append(str4);
                            defpackage.etr.f(str3, sb2.toString());
                            i24 = i16;
                            i25 = i18;
                            j8 = j211;
                            j9 = j7;
                            r47 = CopyOf;
                            jArr4 = jArr3;
                        }
                        iArr3 = iArrCopyOf;
                        j10 = fqnVarA3.f;
                        if (j10 > 0) {
                            jA5 = eum.A(j9 << 3, 1000000L, j10, java.math.RoundingMode.HALF_DOWN);
                            if (jA5 > 0) {
                                defpackage.eqf eqfVar6 = new defpackage.eqf(eqgVar2);
                                eqfVar6.h = (int) jA5;
                                defpackage.eqg eqgVar6 = new defpackage.eqg(eqfVar6);
                                defpackage.fqm fqmVar6 = new defpackage.fqm(fqnVarA3);
                                fqmVar6.g = eqgVar6;
                                fqnVarA3 = fqmVar6.a();
                            }
                        }
                        j11 = fqnVarA3.c;
                        jZ3 = eum.z(j8, 1000000L, j11);
                        iArrW = aiql.W(arrayList3);
                        aiziVar3 = fqnVarA3.i;
                        if (aiziVar3 == null) {
                            eum.ag(jArrCopyOf, j11);
                            fqqVar = new defpackage.fqq(fqnVarA3, jArr4, iArr3, i24, jArrCopyOf, r47, iArrW, r49, jZ3, i25);
                        } else {
                            i29 = aiziVar3.b;
                            if (i29 != 1) {
                                j12 = j11;
                            } else if (fqnVarA3.b == 1) {
                                j12 = j11;
                                i29 = 1;
                            } else {
                                j12 = j11;
                                i29 = 1;
                            }
                            if (i29 == 1) {
                                jA = 0;
                                if (aiziVar3.a(0) == 0) {
                                    defpackage.aizi aiziVar7 = fqnVarA3.j;
                                    ahvr.ci(aiziVar7);
                                    jA4 = aiziVar7.a(0);
                                    i45 = 0;
                                    while (i45 < jArrCopyOf.length) {
                                        long j212 = j12;
                                        jArrCopyOf[i45] = eum.z(jArrCopyOf[i45] - jA4, 1000000L, j212);
                                        i45++;
                                        j12 = j212;
                                    }
                                    fqqVar = new defpackage.fqq(fqnVarA3, jArr4, iArr3, i24, jArrCopyOf, r47, iArrW, r49, eum.z(j8 - jA4, 1000000L, j12), i25);
                                }
                            } else {
                                jA = 0;
                            }
                            j13 = j12;
                            jArr5 = jArr4;
                            r12 = r47;
                            i30 = i25;
                            if (fqnVarA3.b == 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            aiziVar4 = fqnVarA3.j;
                            iArr4 = new int[i29];
                            iArr5 = new int[i29];
                            ahvr.ci(aiziVar4);
                            i31 = 0;
                            i32 = 0;
                            i33 = 0;
                            z11 = false;
                            while (i32 < i29) {
                                long[] jArr17 = jArr5;
                                jA3 = aiziVar4.a(i32);
                                if (jA3 != -1) {
                                    iArr8 = iArr5;
                                    i39 = i32;
                                    long j213 = j13;
                                    j13 = j213;
                                    jZ4 = eum.z(aiziVar3.a(i32), j213, fqnVarA3.d) + jA3;
                                    iArr4[i39] = eum.ac(jArrCopyOf, jA3, true);
                                    int iAb2 = eum.ab(jArrCopyOf, jZ4, z10);
                                    i40 = iAb2 - 1;
                                    i42 = 0;
                                    while (i41 < jArrCopyOf.length) {
                                        if (jArrCopyOf[i41] < jZ4) {
                                            i42++;
                                            if (i42 <= fqnVarA3.g.r) {
                                                break;
                                                break;
                                            }
                                        } else {
                                            i40 = i41;
                                        }
                                    }
                                    iArr8[i39] = i40 + 1;
                                    i43 = iArr4[i39];
                                    while (true) {
                                        i44 = iArr4[i39];
                                        if (i44 > 0) {
                                            break;
                                        }
                                        iArr4[i39] = i44 - 1;
                                    }
                                    if (i44 == 0) {
                                        iArr4[i39] = i43;
                                        while (true) {
                                            i44 = iArr4[i39];
                                            if (i44 >= iArr8[i39]) {
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr4[i39] = i44 + 1;
                                        }
                                    }
                                    int i910 = iArr8[i39];
                                    i33 += i910 - i44;
                                    if (i31 != i44) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    z11 |= z15;
                                    i31 = i910;
                                } else {
                                    iArr8 = iArr5;
                                    i39 = i32;
                                }
                                i32 = i39 + 1;
                                arrayList3 = arrayList3;
                                z10 = z10;
                                iArr5 = iArr8;
                                jArr5 = jArr17;
                            }
                            iArr6 = iArr5;
                            jArr6 = jArr5;
                            arrayList4 = arrayList3;
                            if (i33 != i30) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            z13 = z11 | z12;
                            if (z13) {
                                jArr7 = new long[i33];
                                iArr7 = new int[i33];
                            } else {
                                iArr7 = iArr3;
                                jArr7 = jArr6;
                            }
                            if (true == z13) {
                                i24 = 0;
                            }
                            if (z13) {
                                arrayList5 = new java.util.ArrayList();
                                r6 = new int[i33];
                            } else {
                                r6 = r12;
                                arrayList5 = arrayList4;
                            }
                            jArr8 = new long[i33];
                            i34 = 0;
                            i35 = 0;
                            r7 = r6;
                            while (i34 < i29) {
                                jA2 = aiziVar4.a(i34);
                                i36 = iArr4[i34];
                                int i911 = i29;
                                i37 = iArr6[i34];
                                z14 = z13;
                                if (z13) {
                                    int i912 = i37 - i36;
                                    jArr9 = jArr6;
                                    java.lang.System.arraycopy(jArr9, i36, jArr7, i35, i912);
                                    java.lang.System.arraycopy(iArr3, i36, iArr7, i35, i912);
                                    java.lang.System.arraycopy(r12, i36, r7, i35, i912);
                                } else {
                                    jArr9 = jArr6;
                                }
                                i38 = i24;
                                r8 = r7;
                                while (i36 < i37) {
                                    int[] iArr12 = iArr7;
                                    ?? r410 = r8;
                                    jArr8[i35] = eum.z(jA, 1000000L, fqnVarA3.d) + eum.z(jArrCopyOf[i36] - jA2, 1000000L, j13);
                                    if (z14) {
                                        i38 = iArr3[i36];
                                    }
                                    if (!z14) {
                                    }
                                    i35++;
                                    i36++;
                                    iArr7 = iArr12;
                                    r8 = r410;
                                }
                                jA += aiziVar3.a(i34);
                                i34++;
                                i24 = i38;
                                jArr6 = jArr9;
                                i29 = i911;
                                z13 = z14;
                                aiziVar4 = aiziVar4;
                                iArr7 = iArr7;
                                r7 = r8;
                            }
                            fqqVar = new defpackage.fqq(fqnVarA3, jArr7, iArr7, i24, jArr8, r7, aiql.W(arrayList5), r49, eum.z(jA, 1000000L, fqnVarA3.d), jArr7.length);
                        }
                        fqqVar2 = fqqVar;
                    }
                    arrayList.add(fqqVar2);
                } else {
                    arrayList = arrayList;
                }
            }
            i57 = i7 + 1;
            arrayList6 = arrayList;
        }
    }

    /* JADX WARN: Code duplicated, block: B:155:0x02fd A[Catch: all -> 0x0337, TRY_LEAVE, TryCatch #1 {all -> 0x0337, blocks: (B:20:0x0073, B:22:0x0079, B:30:0x00ac, B:32:0x00b8, B:33:0x00c3, B:36:0x00cf, B:39:0x00dc, B:42:0x00e9, B:45:0x00f6, B:48:0x0103, B:50:0x010d, B:58:0x0124, B:59:0x012f, B:60:0x0143, B:63:0x014f, B:66:0x015f, B:69:0x016f, B:72:0x017f, B:75:0x018f, B:78:0x019f, B:81:0x01af, B:84:0x01bf, B:87:0x01cf, B:90:0x01df, B:94:0x01f4, B:96:0x01f8, B:98:0x0209, B:99:0x0210, B:101:0x0217, B:106:0x0223, B:111:0x022f, B:155:0x02fd, B:112:0x0245, B:114:0x024c, B:116:0x0256, B:118:0x026b, B:130:0x0294, B:133:0x02a1, B:136:0x02ae, B:139:0x02bb, B:142:0x02c7, B:145:0x02d3, B:148:0x02dd, B:151:0x02e9, B:154:0x02f5, B:157:0x031a, B:158:0x0321), top: B:243:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x032c  */
    /* JADX WARN: Code duplicated, block: B:210:0x03db  */
    /* JADX WARN: Code duplicated, block: B:212:0x03de A[EDGE_INSN: B:212:0x03de->B:216:0x03fe BREAK  A[LOOP:4: B:176:0x036e->B:213:0x03f5]] */
    /* JADX WARN: Code duplicated, block: B:255:0x032f A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x02fd, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v21 */
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
    public static defpackage.eqy i(defpackage.eut eutVar) {
        int i;
        boolean z;
        defpackage.eqy eqyVarE;
        defpackage.eqy eqyVar;
        defpackage.eqy eqyVar2;
        int iO;
        defpackage.eqy eqyVar3;
        java.lang.Object obj;
        java.lang.Object folVar;
        java.lang.Object fofVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        defpackage.etx etxVar = eutVar.a;
        int i2 = 8;
        etxVar.Q(8);
        boolean z2 = false;
        defpackage.eqy eqyVar4 = new defpackage.eqy(-9223372036854775807L, new defpackage.eqx[0]);
        while (etxVar.d() >= i2) {
            int i3 = etxVar.c;
            int i4 = etxVar.i() + i3;
            int i5 = etxVar.i();
            int i6 = 13;
            java.lang.String str4 = null;
            if (i5 == 1835365473) {
                etxVar.Q(i3);
                etxVar.R(i2);
                f(etxVar);
                boolean z3 = z2;
                while (true) {
                    int i7 = etxVar.c;
                    if (i7 < i4) {
                        int i8 = etxVar.i() + i7;
                        if (etxVar.i() == 1768715124) {
                            etxVar.Q(i7);
                            etxVar.R(i2);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            ?? r3 = z3;
                            java.lang.String str5 = str4;
                            while (true) {
                                int i9 = etxVar.c;
                                if (i9 >= i8) {
                                    break;
                                }
                                int i10 = etxVar.i();
                                if (i10 < i2) {
                                    defpackage.etr.f("MetadataUtil", "Skipped empty metadata entry");
                                } else {
                                    int i11 = i9 + i10;
                                    int i12 = etxVar.i();
                                    int i13 = i12 >> 24;
                                    try {
                                        if (i11 - etxVar.c < i2) {
                                            defpackage.etr.f("MetadataUtil", "Skipped empty metadata entry: " + defpackage.euu.e(i12));
                                            etxVar.Q(i11);
                                        } else {
                                            int i14 = i13 & 255;
                                            if (i14 == 169 || i14 == 253) {
                                                int i15 = i12 & 16777215;
                                                if (i15 == 6516084) {
                                                    int i16 = etxVar.i();
                                                    if (etxVar.i() == 1684108385) {
                                                        etxVar.R(8);
                                                        java.lang.String strB = etxVar.B(i16 - 16);
                                                        fofVar = new defpackage.fof("und", strB, strB);
                                                        folVar = fofVar;
                                                    } else {
                                                        defpackage.etr.f("MetadataUtil", "Failed to parse comment attribute: ".concat(defpackage.euu.e(i12)));
                                                        folVar = null;
                                                    }
                                                } else if (i15 == 7233901 || i15 == 7631467) {
                                                    folVar = defpackage.fsu.o(i12, "TIT2", etxVar);
                                                } else if (i15 == 6516589 || i15 == 7828084) {
                                                    folVar = defpackage.fsu.o(i12, "TCOM", etxVar);
                                                } else if (i15 == 6578553) {
                                                    folVar = defpackage.fsu.o(i12, "TDRC", etxVar);
                                                } else if (i15 == 4280916) {
                                                    folVar = defpackage.fsu.o(i12, "TPE1", etxVar);
                                                } else if (i15 == 7630703) {
                                                    folVar = defpackage.fsu.o(i12, "TSSE", etxVar);
                                                } else if (i15 == 6384738) {
                                                    folVar = defpackage.fsu.o(i12, "TALB", etxVar);
                                                } else if (i15 == 7108978) {
                                                    folVar = defpackage.fsu.o(i12, "USLT", etxVar);
                                                } else if (i15 == 6776174) {
                                                    folVar = defpackage.fsu.o(i12, "TCON", etxVar);
                                                } else if (i15 == 6779504) {
                                                    folVar = defpackage.fsu.o(i12, "TIT1", etxVar);
                                                } else if (i15 == 7173742) {
                                                    folVar = defpackage.fsu.o(i12, "MVNM", etxVar);
                                                } else if (i15 == 7173737) {
                                                    folVar = defpackage.fsu.m(i12, "MVIN", etxVar, true, false);
                                                } else {
                                                    defpackage.etr.b("MetadataUtil", "Skipped unknown metadata entry: " + defpackage.euu.e(i12));
                                                    etxVar.Q(i11);
                                                    obj = null;
                                                }
                                                etxVar.Q(i11);
                                                obj = folVar;
                                            } else {
                                                if (i12 == 1735291493) {
                                                    java.lang.String strA = defpackage.fok.a(defpackage.fsu.l(etxVar) - 1);
                                                    if (strA != null) {
                                                        folVar = new defpackage.foo("TCON", str5, aify.p(strA));
                                                    } else {
                                                        defpackage.etr.f("MetadataUtil", "Failed to parse standard genre code");
                                                        fofVar = str5;
                                                        folVar = fofVar;
                                                    }
                                                } else if (i12 == 1684632427) {
                                                    folVar = defpackage.fsu.n(1684632427, "TPOS", etxVar);
                                                } else if (i12 == 1953655662) {
                                                    folVar = defpackage.fsu.n(1953655662, "TRCK", etxVar);
                                                } else if (i12 == 1953329263) {
                                                    folVar = defpackage.fsu.m(1953329263, "TBPM", etxVar, true, r3);
                                                } else if (i12 == 1668311404) {
                                                    folVar = defpackage.fsu.m(1668311404, "TCMP", etxVar, true, true);
                                                } else if (i12 == 1668249202) {
                                                    int i17 = etxVar.i();
                                                    if (etxVar.i() == 1684108385) {
                                                        int i18 = etxVar.i() & 16777215;
                                                        if (i18 == i6) {
                                                            str3 = "image/jpeg";
                                                        } else if (i18 == 14) {
                                                            str2 = "image/png";
                                                            i18 = 14;
                                                        } else {
                                                            str = str5;
                                                        }
                                                        if (str == null) {
                                                            str = str2;
                                                            str = str3;
                                                            defpackage.etr.f("MetadataUtil", a.bj(i18, "Unrecognized cover art flags: "));
                                                            fofVar = str5;
                                                        } else {
                                                            str = str2;
                                                            str = str3;
                                                            etxVar.R(4);
                                                            int i19 = i17 - 16;
                                                            byte[] bArr = new byte[i19];
                                                            etxVar.L(bArr, r3, i19);
                                                            folVar = new defpackage.fob(str, str5, 3, bArr);
                                                        }
                                                    } else {
                                                        defpackage.etr.f("MetadataUtil", "Failed to parse cover art attribute");
                                                        fofVar = str5;
                                                    }
                                                    folVar = fofVar;
                                                } else if (i12 == 1631670868) {
                                                    folVar = defpackage.fsu.o(1631670868, "TPE2", etxVar);
                                                } else if (i12 == 1936682605) {
                                                    folVar = defpackage.fsu.o(1936682605, "TSOT", etxVar);
                                                } else if (i12 == 1936679276) {
                                                    folVar = defpackage.fsu.o(1936679276, "TSOA", etxVar);
                                                } else if (i12 == 1936679282) {
                                                    folVar = defpackage.fsu.o(1936679282, "TSOP", etxVar);
                                                } else if (i12 == 1936679265) {
                                                    folVar = defpackage.fsu.o(1936679265, "TSO2", etxVar);
                                                } else if (i12 == 1936679791) {
                                                    folVar = defpackage.fsu.o(1936679791, "TSOC", etxVar);
                                                } else if (i12 == 1920233063) {
                                                    folVar = defpackage.fsu.m(1920233063, "ITUNESADVISORY", etxVar, r3, r3);
                                                } else if (i12 == 1885823344) {
                                                    folVar = defpackage.fsu.m(1885823344, "ITUNESGAPLESS", etxVar, r3, true);
                                                } else if (i12 == 1936683886) {
                                                    folVar = defpackage.fsu.o(1936683886, "TVSHOWSORT", etxVar);
                                                } else if (i12 == 1953919848) {
                                                    folVar = defpackage.fsu.o(1953919848, "TVSHOW", etxVar);
                                                } else if (i12 == 757935405) {
                                                    java.lang.String strB2 = str5;
                                                    java.lang.String strB3 = strB2;
                                                    int i20 = -1;
                                                    int i21 = -1;
                                                    while (true) {
                                                        int i22 = etxVar.c;
                                                        if (i22 >= i11) {
                                                            break;
                                                        }
                                                        int i23 = etxVar.i();
                                                        int i24 = etxVar.i();
                                                        etxVar.R(4);
                                                        if (i24 == 1835360622) {
                                                            strB2 = etxVar.B(i23 - 12);
                                                        } else {
                                                            int i25 = i23 - 12;
                                                            if (i24 == 1851878757) {
                                                                strB3 = etxVar.B(i25);
                                                            } else {
                                                                if (i24 == 1684108385) {
                                                                    i21 = i23;
                                                                }
                                                                if (i24 == 1684108385) {
                                                                    i20 = i22;
                                                                }
                                                                etxVar.R(i25);
                                                            }
                                                        }
                                                    }
                                                    if (strB2 == null || strB3 == null || i20 == -1) {
                                                        folVar = null;
                                                    } else {
                                                        etxVar.Q(i20);
                                                        etxVar.R(16);
                                                        folVar = new defpackage.fol(strB2, strB3, etxVar.B(i21 - 16));
                                                    }
                                                } else {
                                                    defpackage.etr.b("MetadataUtil", "Skipped unknown metadata entry: " + defpackage.euu.e(i12));
                                                    etxVar.Q(i11);
                                                    obj = null;
                                                }
                                                etxVar.Q(i11);
                                                obj = folVar;
                                            }
                                        }
                                        if (obj != null) {
                                            arrayList.add(obj);
                                        }
                                        i2 = 8;
                                        r3 = 0;
                                        str5 = null;
                                        i6 = 13;
                                    } catch (java.lang.Throwable th) {
                                        etxVar.Q(i11);
                                        throw th;
                                    }
                                }
                                obj = str5;
                                if (obj != null) {
                                    arrayList.add(obj);
                                }
                                i2 = 8;
                                r3 = 0;
                                str5 = null;
                                i6 = 13;
                            }
                            if (!arrayList.isEmpty()) {
                                eqyVar3 = new defpackage.eqy(arrayList);
                                break;
                            }
                        } else {
                            etxVar.Q(i8);
                            i2 = 8;
                            z3 = false;
                            str4 = null;
                            i6 = 13;
                        }
                    }
                    eqyVar3 = null;
                    break;
                }
                eqyVar4 = eqyVar4.e(eqyVar3);
                i = 8;
            } else {
                if (i5 == 1936553057) {
                    etxVar.Q(i3);
                    etxVar.R(12);
                    while (true) {
                        int i26 = etxVar.c;
                        if (i26 < i4) {
                            int i27 = etxVar.i();
                            if (etxVar.i() == 1935766900) {
                                if (i27 < 16) {
                                    eqyVar2 = null;
                                    i = 8;
                                    break;
                                }
                                etxVar.R(4);
                                int i28 = -1;
                                int i29 = 0;
                                for (int i30 = 0; i30 < 2; i30++) {
                                    int iN = etxVar.n();
                                    int iN2 = etxVar.n();
                                    if (iN == 0) {
                                        i28 = iN2;
                                    } else if (iN == 1) {
                                        i29 = iN2;
                                    }
                                }
                                if (i28 == 12) {
                                    iO = 240;
                                } else if (i28 != 13) {
                                    if (i28 != 21) {
                                        iO = -2147483647;
                                    } else {
                                        i = 8;
                                        if (etxVar.d() < 8 || etxVar.c + 8 > i4) {
                                            iO = -2147483647;
                                        } else {
                                            int i31 = etxVar.i();
                                            int i32 = etxVar.i();
                                            if (i31 < 12 || i32 != 1936877170) {
                                                iO = -2147483647;
                                            } else {
                                                iO = etxVar.o();
                                            }
                                        }
                                    }
                                    if (iO != -2147483647) {
                                        eqyVar2 = new defpackage.eqy(-9223372036854775807L, new defpackage.fos(iO, i29));
                                        break;
                                    }
                                } else {
                                    iO = 120;
                                }
                                i = 8;
                                if (iO != -2147483647) {
                                    eqyVar2 = new defpackage.eqy(-9223372036854775807L, new defpackage.fos(iO, i29));
                                    break;
                                }
                            } else {
                                etxVar.Q(i26 + i27);
                            }
                        } else {
                            i = 8;
                        }
                        eqyVar2 = null;
                        break;
                    }
                    eqyVar4 = eqyVar4.e(eqyVar2);
                } else {
                    i = 8;
                    if (i5 == -1451722374) {
                        short sG = etxVar.G();
                        etxVar.R(2);
                        java.util.regex.Matcher matcher = c.matcher(etxVar.C(sG));
                        if (matcher.matches()) {
                            java.lang.String strGroup = matcher.group(1);
                            java.lang.String str6 = eum.a;
                            java.lang.String strGroup2 = matcher.group(2);
                            try {
                                float f = java.lang.Float.parseFloat(strGroup);
                                float f2 = java.lang.Float.parseFloat(strGroup2);
                                java.lang.String strGroup3 = matcher.group(3);
                                if (strGroup3 != null) {
                                    eqyVar = new defpackage.eqy(-9223372036854775807L, new defpackage.euv(f, f2, java.lang.Float.parseFloat(strGroup3)));
                                } else {
                                    defpackage.eqx[] eqxVarArr = new defpackage.eqx[1];
                                    z = false;
                                    try {
                                        eqxVarArr[0] = new defpackage.euv(f, f2, -3.4028235E38f);
                                        eqyVar = new defpackage.eqy(-9223372036854775807L, eqxVarArr);
                                    } catch (java.lang.IllegalArgumentException unused) {
                                        eqyVar = null;
                                    }
                                }
                            } catch (java.lang.IllegalArgumentException unused2) {
                                z = false;
                            }
                            eqyVarE = eqyVar4.e(eqyVar);
                        } else {
                            eqyVar = null;
                        }
                        z = false;
                        eqyVarE = eqyVar4.e(eqyVar);
                    } else {
                        z = false;
                        if (i5 == 1667788908) {
                            eqyVarE = eqyVar4.e(a(etxVar));
                        }
                    }
                    eqyVar4 = eqyVarE;
                }
                etxVar.Q(i4);
                i2 = i;
                z2 = z;
            }
            z = false;
            etxVar.Q(i4);
            i2 = i;
            z2 = z;
        }
        return eqyVar4;
    }

    private static int j(defpackage.etx etxVar, int i, int i2, int i3) throws defpackage.era {
        int i4 = etxVar.c;
        defpackage.hgu.am(i4 >= i2, null);
        while (i4 - i2 < i3) {
            etxVar.Q(i4);
            int i5 = etxVar.i();
            defpackage.hgu.am(i5 > 0, "childAtomSize must be positive");
            if (etxVar.i() == i) {
                return i4;
            }
            i4 += i5;
        }
        return -1;
    }

    private static int k(defpackage.etx etxVar) {
        int iN = etxVar.n();
        int i = iN & 127;
        while ((iN & 128) == 128) {
            iN = etxVar.n();
            i = (i << 7) | (iN & 127);
        }
        return i;
    }

    private static int l(defpackage.etx etxVar) {
        etxVar.Q(16);
        return etxVar.i();
    }

    private static android.util.Pair m(defpackage.etx etxVar, int i, int i2) throws defpackage.era {
        defpackage.fqo fqoVar;
        android.util.Pair pairCreate;
        int i3;
        int i4;
        byte[] bArr;
        int i5 = etxVar.c;
        while (i5 - i < i2) {
            etxVar.Q(i5);
            int i6 = etxVar.i();
            defpackage.hgu.am(i6 > 0, "childAtomSize must be positive");
            if (etxVar.i() == 1936289382) {
                int i7 = i5 + 8;
                int i8 = 0;
                int i9 = -1;
                java.lang.Integer numValueOf = null;
                java.lang.String strC = null;
                while (i7 - i5 < i6) {
                    etxVar.Q(i7);
                    int i10 = etxVar.i();
                    int i11 = etxVar.i();
                    if (i11 == 1718775137) {
                        numValueOf = java.lang.Integer.valueOf(etxVar.i());
                    } else if (i11 == 1935894637) {
                        etxVar.R(4);
                        strC = etxVar.C(4);
                    } else if (i11 == 1935894633) {
                        i9 = i7;
                        i8 = i10;
                    }
                    i7 += i10;
                }
                if ("cenc".equals(strC) || "cbc1".equals(strC) || "cens".equals(strC) || "cbcs".equals(strC)) {
                    defpackage.hgu.am(numValueOf != null, "frma atom is mandatory");
                    defpackage.hgu.am(i9 != -1, "schi atom is mandatory");
                    int i12 = i9 + 8;
                    while (true) {
                        if (i12 - i9 >= i8) {
                            fqoVar = null;
                            break;
                        }
                        etxVar.Q(i12);
                        int i13 = etxVar.i();
                        if (etxVar.i() == 1952804451) {
                            int i14 = etxVar.i() >> 24;
                            etxVar.R(1);
                            if ((i14 & 255) == 0) {
                                etxVar.R(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iN = etxVar.n();
                                i3 = iN & 15;
                                i4 = (iN & 240) >> 4;
                            }
                            boolean z = etxVar.n() == 1;
                            int iN2 = etxVar.n();
                            byte[] bArr2 = new byte[16];
                            etxVar.L(bArr2, 0, 16);
                            if (z && iN2 == 0) {
                                int iN3 = etxVar.n();
                                byte[] bArr3 = new byte[iN3];
                                etxVar.L(bArr3, 0, iN3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            fqoVar = new defpackage.fqo(z, strC, iN2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i12 += i13;
                    }
                    defpackage.hgu.am(fqoVar != null, "tenc atom is mandatory");
                    java.lang.String str = eum.a;
                    pairCreate = android.util.Pair.create(numValueOf, fqoVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += i6;
        }
        return null;
    }

    private static defpackage.epy n(defpackage.etx etxVar) {
        defpackage.etv etvVar = new defpackage.etv(etxVar.b);
        etvVar.l(etxVar.c << 3);
        etvVar.o(1);
        int iD = etvVar.d(8);
        int iA = -1;
        int i = -1;
        int iB = -1;
        int i2 = -1;
        int iD2 = -1;
        for (int i3 = 0; i3 < iD; i3++) {
            etvVar.o(1);
            int iD3 = etvVar.d(8);
            int i4 = 0;
            while (i4 < iD3) {
                etvVar.n(6);
                boolean zP = etvVar.p();
                etvVar.m();
                etvVar.o(11);
                etvVar.n(4);
                iD2 = etvVar.d(4) + 8;
                etvVar.o(1);
                if (zP) {
                    int iD4 = etvVar.d(8);
                    int iD5 = etvVar.d(8);
                    etvVar.o(1);
                    boolean zP2 = etvVar.p();
                    iA = defpackage.epy.a(iD4);
                    int i5 = true != zP2 ? 2 : 1;
                    iB = defpackage.epy.b(iD5);
                    i = i5;
                }
                i4++;
                i2 = iD2;
            }
        }
        return new defpackage.epy(iA, i, iB, null, i2, iD2);
    }

    private static defpackage.fpq o(defpackage.etx etxVar, int i) {
        etxVar.Q(i + 8);
        etxVar.R(4);
        return new defpackage.fpq(etxVar.w(), etxVar.w());
    }

    private static defpackage.fps p(defpackage.etx etxVar, int i) {
        etxVar.Q(i + 12);
        etxVar.R(1);
        k(etxVar);
        etxVar.R(2);
        int iN = etxVar.n();
        if ((iN & 128) != 0) {
            etxVar.R(2);
        }
        if ((iN & 64) != 0) {
            etxVar.R(etxVar.n());
        }
        if ((iN & 32) != 0) {
            etxVar.R(2);
        }
        etxVar.R(1);
        k(etxVar);
        java.lang.String strC = defpackage.eqz.c(etxVar.n());
        if ("audio/mpeg".equals(strC) || "audio/vnd.dts".equals(strC) || "audio/vnd.dts.hd".equals(strC)) {
            return new defpackage.fps(strC, null, -1L, -1L);
        }
        etxVar.R(4);
        long jW = etxVar.w();
        long jW2 = etxVar.w();
        etxVar.R(1);
        int iK = k(etxVar);
        byte[] bArr = new byte[iK];
        etxVar.L(bArr, 0, iK);
        return new defpackage.fps(strC, bArr, jW2 <= 0 ? -1L : jW2, jW > 0 ? jW : -1L);
    }

    /* JADX WARN: Code duplicated, block: B:175:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:264:0x043c  */
    /* JADX WARN: Code duplicated, block: B:302:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:304:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:305:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:310:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:311:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:314:0x0520  */
    /* JADX WARN: Code duplicated, block: B:315:0x0525  */
    /* JADX WARN: Code duplicated, block: B:316:0x0530  */
    /* JADX WARN: Code duplicated, block: B:320:0x0541  */
    /* JADX WARN: Code duplicated, block: B:322:0x0549  */
    /* JADX WARN: Code duplicated, block: B:323:0x054e  */
    /* JADX WARN: Code duplicated, block: B:325:0x055b  */
    /* JADX WARN: Code duplicated, block: B:327:0x0562  */
    /* JADX WARN: Code duplicated, block: B:334:0x057c  */
    /* JADX WARN: Code duplicated, block: B:337:0x0594  */
    /* JADX WARN: Code duplicated, block: B:340:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:343:0x05df  */
    /* JADX WARN: Code duplicated, block: B:346:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:392:0x0726  */
    /* JADX WARN: Code duplicated, block: B:400:0x0758  */
    /* JADX WARN: Code duplicated, block: B:402:0x0760  */
    /* JADX WARN: Code duplicated, block: B:405:0x076c  */
    /* JADX WARN: Code duplicated, block: B:407:0x0774  */
    /* JADX WARN: Code duplicated, block: B:414:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:415:0x07c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:416:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:722:0x05f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:0x0743 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:0x074e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:0x04d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:0x0535 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:0x0747 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:0x0574 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:0x0581 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:0x0599 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:0x05cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:0x05ff A[SYNTHETIC] */
    private static defpackage.fpv q(defpackage.etx etxVar, defpackage.fpy fpyVar, java.lang.String str, androidx.media3.common.DrmInitData drmInitData, boolean z) throws defpackage.era {
        int i;
        int i2;
        int i3;
        int i4;
        androidx.media3.common.DrmInitData drmInitData2;
        java.lang.String str2;
        int i5;
        int i6;
        java.lang.String str3;
        defpackage.fpy fpyVar2;
        java.lang.String str4;
        defpackage.fpv fpvVar;
        int i7;
        java.lang.String str5;
        int i8;
        java.lang.String str6;
        defpackage.jyn jynVar;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        int i13;
        java.lang.String str7;
        boolean z3;
        float f;
        boolean z4;
        float f2;
        boolean z5;
        int iS;
        int iS2;
        int iO;
        int i14;
        int i15;
        int i16;
        int i17;
        androidx.media3.common.DrmInitData drmInitData3;
        java.lang.String str8;
        int i18;
        java.lang.String str9;
        int iN;
        java.util.List listQ;
        defpackage.fps fpsVarP;
        java.lang.Object objH;
        defpackage.fpq fpqVarO;
        defpackage.fps fpsVar;
        int i19;
        defpackage.eqf eqfVar;
        int i20;
        boolean z6;
        int i21;
        int i22;
        int iN2;
        int i23;
        java.lang.String str10;
        byte[] bArr;
        int i24;
        int iN3;
        byte[] bArr2;
        defpackage.fps fpsVar2;
        int iJ;
        int i25;
        byte[] bArr3;
        int i26;
        int iIntValue;
        int iP;
        java.lang.String str11;
        java.util.List listP;
        java.lang.String str12;
        defpackage.fpy fpyVar3 = fpyVar;
        java.lang.String str13 = str;
        etxVar.Q(12);
        int i27 = etxVar.i();
        defpackage.fpv fpvVar2 = new defpackage.fpv(i27);
        int i28 = 0;
        while (i28 < i27) {
            int i29 = etxVar.c;
            int i30 = etxVar.i();
            java.lang.String str14 = "childAtomSize must be positive";
            defpackage.hgu.am(i30 > 0, "childAtomSize must be positive");
            int i31 = etxVar.i();
            int i32 = 1211250227;
            int iIntValue2 = 1701733238;
            int i33 = 3;
            if (i31 == 1635148593 || i31 == 1635148595 || i31 == 1701733238 || i31 == 1831958048 || i31 == 1836070006 || i31 == 1752589105 || i31 == 1751479857 || i31 == 1987470129 || i31 == 1987471665 || i31 == 1932670515 || i31 == 1211250227 || i31 == 1748121139 || i31 == 1987063864 || i31 == 1987063865 || i31 == 1635135537 || i31 == 1685479798 || i31 == 1685479729 || i31 == 1685481573 || i31 == 1685481521 || i31 == 1634760241 || i31 == 1684108849) {
                i = i27;
                i2 = i28;
                java.lang.String str15 = "childAtomSize must be positive";
                etxVar.Q(i29 + 16);
                etxVar.R(16);
                int iS3 = etxVar.s();
                int iS4 = etxVar.s();
                etxVar.R(50);
                int i34 = etxVar.c;
                if (i31 == 1701733238) {
                    i3 = i29;
                    i4 = i30;
                    android.util.Pair pairM = m(etxVar, i3, i4);
                    if (pairM != null) {
                        iIntValue2 = ((java.lang.Integer) pairM.first).intValue();
                        androidx.media3.common.DrmInitData drmInitDataB = drmInitData == null ? null : drmInitData.b(((defpackage.fqo) pairM.second).b);
                        fpvVar2.a[i2] = (defpackage.fqo) pairM.second;
                        drmInitData2 = drmInitDataB;
                    } else {
                        drmInitData2 = drmInitData;
                    }
                    i31 = iIntValue2;
                    etxVar.Q(i34);
                } else {
                    i3 = i29;
                    i4 = i30;
                    drmInitData2 = drmInitData;
                }
                if (i31 == 1831958048) {
                    str2 = "video/mpeg";
                    i32 = i31;
                } else if (i31 == 1211250227) {
                    str2 = "video/3gpp";
                } else {
                    i32 = i31;
                    str2 = null;
                }
                i5 = i3;
                androidx.media3.common.DrmInitData drmInitData4 = drmInitData2;
                float fQ = 1.0f;
                java.util.List listP2 = null;
                defpackage.oq oqVar = null;
                int iB = -1;
                int i35 = -1;
                defpackage.jyn jynVar2 = null;
                int i36 = 8;
                int i37 = -1;
                int i38 = 8;
                int iA = -1;
                java.lang.Object obj = null;
                java.nio.ByteBuffer byteBufferS = null;
                boolean z7 = false;
                byte[] bArrCopyOfRange = null;
                int i39 = -1;
                int i40 = -1;
                defpackage.fpq fpqVarO2 = null;
                defpackage.fps fpsVar3 = null;
                int i41 = -1;
                int i42 = -1;
                while (i34 - i5 < i4) {
                    etxVar.Q(i34);
                    int i43 = etxVar.c;
                    int i44 = etxVar.i();
                    int i45 = i34;
                    if (i44 != 0) {
                        i7 = i44;
                    } else {
                        if (etxVar.c - i5 == i4) {
                            break;
                        }
                        i7 = 0;
                    }
                    java.lang.String str16 = str15;
                    defpackage.oq oqVarL = oqVar;
                    java.lang.String str17 = str16;
                    int i46 = i4;
                    defpackage.hgu.am(i7 > 0, str17);
                    int i47 = etxVar.i();
                    if (i47 == 1635148611) {
                        int i48 = i43 + 8;
                        defpackage.hgu.am(str2 == null, null);
                        etxVar.Q(i48);
                        defpackage.fks fksVarA = defpackage.fks.a(etxVar);
                        java.util.List list = fksVarA.a;
                        fpvVar2.c = fksVarA.b;
                        if (z7) {
                            f2 = fQ;
                            z5 = true;
                        } else {
                            f2 = fksVarA.k;
                            z5 = false;
                        }
                        java.lang.String str18 = fksVarA.l;
                        int i49 = fksVarA.j;
                        int i50 = fksVarA.g;
                        int i51 = fksVarA.h;
                        int i52 = fksVarA.i;
                        int i53 = fksVarA.e;
                        i10 = fksVarA.f;
                        str5 = str17;
                        i9 = i53;
                        fpvVar2 = fpvVar2;
                        i41 = i49;
                        i8 = i51;
                        fQ = f2;
                        listP2 = list;
                        str6 = "video/avc";
                        z7 = z5;
                        obj = str18;
                        iA = i50;
                        iB = i52;
                    } else {
                        if (i47 == 1752589123) {
                            int i54 = i43 + 8;
                            defpackage.hgu.am(str2 == null, null);
                            etxVar.Q(i54);
                            defpackage.flt fltVarA = defpackage.flt.a(etxVar, false, null);
                            java.util.List list2 = fltVarA.a;
                            fpvVar2.c = fltVarA.b;
                            if (z7) {
                                f = fQ;
                                z4 = true;
                            } else {
                                f = fltVarA.l;
                                z4 = false;
                            }
                            int i55 = fltVarA.m;
                            int i56 = fltVarA.c;
                            java.lang.String str19 = fltVarA.n;
                            int i57 = fltVarA.k;
                            if (i57 != -1) {
                                i37 = i57;
                            }
                            int i58 = fltVarA.d;
                            int i59 = fltVarA.e;
                            i12 = fltVarA.h;
                            int i60 = fltVarA.i;
                            int i61 = fltVarA.j;
                            int i62 = fltVarA.f;
                            int i63 = fltVarA.g;
                            jynVar2 = fltVarA.o;
                            listP2 = list2;
                            obj = str19;
                            str5 = str17;
                            i10 = i63;
                            fpvVar2 = fpvVar2;
                            i41 = i55;
                            i42 = i56;
                            i32 = i32;
                            i11 = i33;
                            i8 = i60;
                            i9 = i62;
                            str6 = "video/hevc";
                            z7 = z4;
                            i40 = i58;
                            i39 = i59;
                            iB = i61;
                            fQ = f;
                        } else {
                            if (i47 == 1818785347) {
                                int i64 = i43 + 8;
                                defpackage.hgu.am("video/hevc".equals(str2), "lhvC must follow hvcC atom");
                                if (jynVar2 != null) {
                                    z3 = ((aify) jynVar2.c).size() >= 2;
                                } else {
                                    z3 = false;
                                    jynVar2 = null;
                                }
                                defpackage.hgu.am(z3, "must have at least two layers");
                                etxVar.Q(i64);
                                ahvr.ci(jynVar2);
                                defpackage.flt fltVarA2 = defpackage.flt.a(etxVar, true, jynVar2);
                                defpackage.hgu.am(fpvVar2.c == fltVarA2.b, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                int i65 = fltVarA2.h;
                                if (i65 != -1) {
                                    defpackage.hgu.am(iA == i65, "colorSpace must be the same for both views");
                                }
                                int i66 = fltVarA2.i;
                                if (i66 != -1) {
                                    defpackage.hgu.am(i35 == i66, "colorRange must be the same for both views");
                                }
                                int i67 = fltVarA2.j;
                                if (i67 != -1) {
                                    defpackage.hgu.am(iB == i67, "colorTransfer must be the same for both views");
                                }
                                defpackage.hgu.am(i36 == fltVarA2.f, "bitdepthLuma must be the same for both views");
                                defpackage.hgu.am(i38 == fltVarA2.g, "bitdepthChroma must be the same for both views");
                                if (listP2 != null) {
                                    aift aiftVar = new aift(4);
                                    aiftVar.k(listP2);
                                    aiftVar.k(fltVarA2.a);
                                    listP2 = aiftVar.h();
                                } else {
                                    defpackage.hgu.am(false, "initializationData must be already set from hvcC atom");
                                }
                                str5 = str17;
                                obj = fltVarA2.n;
                                i8 = i35;
                                str6 = "video/mv-hevc";
                            } else {
                                if (i47 == 1987470147) {
                                    int i68 = i43 + 8;
                                    defpackage.hgu.am(str2 == null, null);
                                    etxVar.Q(i68);
                                    defpackage.fmn fmnVarA = defpackage.fmn.a(etxVar);
                                    java.util.List list3 = fmnVarA.a;
                                    fpvVar2.c = fmnVarA.b;
                                    java.lang.String str20 = fmnVarA.c;
                                    i9 = fmnVarA.d;
                                    i10 = i9;
                                    str5 = str17;
                                    listP2 = list3;
                                    fpvVar2 = fpvVar2;
                                    i8 = i35;
                                    obj = str20;
                                    str6 = "video/vvc";
                                    i32 = i32;
                                    i11 = i33;
                                    i41 = 16;
                                } else if (i47 == 1986361461) {
                                    etxVar.Q(i43 + 8);
                                    int i69 = etxVar.c;
                                    i8 = i35;
                                    defpackage.vk vkVar = null;
                                    while (i69 - i43 < i7) {
                                        etxVar.Q(i69);
                                        int i70 = etxVar.i();
                                        int i71 = i69;
                                        defpackage.hgu.am(i70 > 0, str17);
                                        java.lang.String str21 = str2;
                                        if (etxVar.i() == 1702454643) {
                                            etxVar.Q(i71 + 8);
                                            int i72 = etxVar.c;
                                            while (true) {
                                                if (i72 - i71 >= i70) {
                                                    str7 = str17;
                                                    vkVar = null;
                                                    break;
                                                }
                                                etxVar.Q(i72);
                                                int i73 = etxVar.i();
                                                defpackage.hgu.am(i73 > 0, str17);
                                                str7 = str17;
                                                if (etxVar.i() == 1937011305) {
                                                    etxVar.R(4);
                                                    int iN4 = etxVar.n();
                                                    vkVar = new defpackage.vk(new defpackage.fpu(1 == (iN4 & 1), (iN4 & 2) == 2, (iN4 & 8) == 8), (char[]) null);
                                                    break;
                                                }
                                                i72 += i73;
                                                str17 = str7;
                                            }
                                        } else {
                                            str7 = str17;
                                        }
                                        i69 = i71 + i70;
                                        str2 = str21;
                                        str17 = str7;
                                    }
                                    str5 = str17;
                                    str6 = str2;
                                    defpackage.vk vkVar2 = vkVar != null ? new defpackage.vk(vkVar, (char[]) null) : null;
                                    if (vkVar2 != null) {
                                        if (jynVar2 == null) {
                                            jynVar2 = null;
                                        } else if (((aify) jynVar2.c).size() >= 2) {
                                            defpackage.hgu.am(vkVar2.f(), "both eye views must be marked as available");
                                            defpackage.hgu.am(!((defpackage.fpu) ((defpackage.vk) vkVar2.a).a).c, "for MV-HEVC, eye_views_reversed must be set to false");
                                        }
                                        if (i37 == -1) {
                                            if (true != ((defpackage.fpu) ((defpackage.vk) vkVar2.a).a).c) {
                                                fpvVar2 = fpvVar2;
                                                i9 = i36;
                                                i10 = i38;
                                                i32 = i32;
                                                i11 = i33;
                                                i37 = 4;
                                            } else {
                                                i37 = 5;
                                            }
                                        }
                                    }
                                    fpvVar2 = fpvVar2;
                                    jynVar = jynVar2;
                                    i9 = i36;
                                    i10 = i38;
                                    i32 = i32;
                                    i11 = i33;
                                    jynVar2 = jynVar;
                                } else {
                                    str5 = str17;
                                    i8 = i35;
                                    str6 = str2;
                                    if (i47 == 1685480259 || i47 == 1685485123 || i47 == 1685485379) {
                                        fpvVar2 = fpvVar2;
                                        jynVar = jynVar2;
                                        i9 = i36;
                                        i10 = i38;
                                        i32 = i32;
                                        i11 = i33;
                                        oqVarL = defpackage.oq.l(etxVar);
                                    } else if (i47 == 1987076931) {
                                        int i74 = i43 + 12;
                                        defpackage.hgu.am(str6 == null, null);
                                        etxVar.Q(i74);
                                        byte bA = etxVar.a();
                                        byte bA2 = etxVar.a();
                                        int iN5 = etxVar.n();
                                        int i75 = iN5 >> 4;
                                        int i76 = iN5 >> 1;
                                        java.lang.String str22 = i32 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                        if (str22.equals("video/x-vnd.on2.vp9")) {
                                            listP2 = defpackage.ete.d(bA, bA2, (byte) i75, (byte) (i76 & 7));
                                        }
                                        int i77 = iN5 & 1;
                                        int iN6 = etxVar.n();
                                        int iN7 = etxVar.n();
                                        iA = defpackage.epy.a(iN6);
                                        i8 = 1 != i77 ? 2 : 1;
                                        fpvVar2 = fpvVar2;
                                        i9 = i75;
                                        i10 = i9;
                                        str6 = str22;
                                        i32 = i32;
                                        i11 = i33;
                                        iB = defpackage.epy.b(iN7);
                                    } else if (i47 == 1635135811) {
                                        int i78 = i7 - 8;
                                        byte[] bArr4 = new byte[i78];
                                        etxVar.L(bArr4, 0, i78);
                                        listP2 = aify.p(bArr4);
                                        defpackage.hrr hrrVarA = defpackage.hrr.a(bArr4);
                                        if (hrrVarA != null) {
                                            i36 = hrrVarA.a;
                                            iA = hrrVarA.c;
                                            i13 = hrrVarA.b;
                                            iB = hrrVarA.d;
                                            obj = hrrVarA.e;
                                            i38 = i36;
                                        } else {
                                            i13 = i8;
                                        }
                                        str6 = "video/av01";
                                        i8 = i13;
                                    } else if (i47 == 1668050025) {
                                        if (byteBufferS == null) {
                                            byteBufferS = s();
                                        }
                                        java.nio.ByteBuffer byteBuffer = byteBufferS;
                                        byteBuffer.position(21);
                                        byteBuffer.putShort(etxVar.G());
                                        byteBuffer.putShort(etxVar.G());
                                        byteBufferS = byteBuffer;
                                    } else {
                                        if (i47 == 1835295606) {
                                            if (byteBufferS == null) {
                                                byteBufferS = s();
                                            }
                                            java.nio.ByteBuffer byteBuffer2 = byteBufferS;
                                            short sG = etxVar.G();
                                            short sG2 = etxVar.G();
                                            short sG3 = etxVar.G();
                                            short sG4 = etxVar.G();
                                            jynVar = jynVar2;
                                            short sG5 = etxVar.G();
                                            i9 = i36;
                                            short sG6 = etxVar.G();
                                            i10 = i38;
                                            short sG7 = etxVar.G();
                                            i32 = i32;
                                            short sG8 = etxVar.G();
                                            long jW = etxVar.w();
                                            long jW2 = etxVar.w();
                                            fpvVar2 = fpvVar2;
                                            byteBuffer2.position(1);
                                            byteBuffer2.putShort(sG5);
                                            byteBuffer2.putShort(sG6);
                                            byteBuffer2.putShort(sG);
                                            byteBuffer2.putShort(sG2);
                                            byteBuffer2.putShort(sG3);
                                            byteBuffer2.putShort(sG4);
                                            byteBuffer2.putShort(sG7);
                                            byteBuffer2.putShort(sG8);
                                            byteBuffer2.putShort((short) (jW / 10000));
                                            byteBuffer2.putShort((short) (jW2 / 10000));
                                            byteBufferS = byteBuffer2;
                                        } else {
                                            fpvVar2 = fpvVar2;
                                            jynVar = jynVar2;
                                            i9 = i36;
                                            i10 = i38;
                                            i32 = i32;
                                            if (i47 == 1681012275) {
                                                defpackage.hgu.am(str6 == null, null);
                                                str6 = "video/3gpp";
                                            } else if (i47 == 1702061171) {
                                                defpackage.hgu.am(str6 == null, null);
                                                defpackage.fps fpsVarP2 = p(etxVar, i43);
                                                java.lang.String str23 = fpsVarP2.a;
                                                byte[] bArr5 = fpsVarP2.b;
                                                if (bArr5 != null) {
                                                    listP2 = aify.p(bArr5);
                                                }
                                                fpsVar3 = fpsVarP2;
                                                str6 = str23;
                                            } else if (i47 == 1651798644) {
                                                fpqVarO2 = o(etxVar, i43);
                                            } else if (i47 == 1885434736) {
                                                etxVar.Q(i43 + 8);
                                                fQ = etxVar.q() / etxVar.q();
                                                i11 = i33;
                                                jynVar2 = jynVar;
                                                z7 = true;
                                            } else if (i47 == 1937126244) {
                                                int i79 = i43 + 8;
                                                while (true) {
                                                    if (i79 - i43 >= i7) {
                                                        bArrCopyOfRange = null;
                                                        break;
                                                    }
                                                    etxVar.Q(i79);
                                                    int i80 = etxVar.i() + i79;
                                                    if (etxVar.i() == 1886547818) {
                                                        bArrCopyOfRange = java.util.Arrays.copyOfRange(etxVar.b, i79, i80);
                                                        break;
                                                    }
                                                    i79 = i80;
                                                }
                                            } else if (i47 == 1936995172) {
                                                int iN8 = etxVar.n();
                                                i11 = i33;
                                                etxVar.R(i11);
                                                if (iN8 == 0) {
                                                    int iN9 = etxVar.n();
                                                    if (iN9 == 0) {
                                                        jynVar2 = jynVar;
                                                        i37 = 0;
                                                    } else if (iN9 == 1) {
                                                        jynVar2 = jynVar;
                                                        i37 = 1;
                                                    } else if (iN9 == 2) {
                                                        jynVar2 = jynVar;
                                                        i37 = 2;
                                                    } else if (iN9 == i11) {
                                                        i37 = i11;
                                                    }
                                                }
                                            } else {
                                                i11 = i33;
                                                if (i47 == 1634760259) {
                                                    int i81 = i7 - 12;
                                                    byte[] bArr6 = new byte[i81];
                                                    etxVar.Q(i43 + 12);
                                                    etxVar.L(bArr6, 0, i81);
                                                    java.lang.String strE = defpackage.ete.e(bArr6);
                                                    java.util.List listP3 = aify.p(bArr6);
                                                    defpackage.epy epyVarN = n(new defpackage.etx(bArr6));
                                                    int i82 = epyVarN.f;
                                                    int i83 = epyVarN.g;
                                                    i12 = epyVarN.b;
                                                    int i84 = epyVarN.c;
                                                    iB = epyVarN.d;
                                                    obj = strE;
                                                    listP2 = listP3;
                                                    i9 = i82;
                                                    i10 = i83;
                                                    i8 = i84;
                                                    str6 = "video/apv";
                                                    jynVar2 = jynVar;
                                                } else if (i47 == 1668246642 && iA == -1) {
                                                    if (iB == -1) {
                                                        int i85 = etxVar.i();
                                                        if (i85 == 1852009592 || i85 == 1852009571) {
                                                            int iS5 = etxVar.s();
                                                            int iS6 = etxVar.s();
                                                            etxVar.R(2);
                                                            if (i7 != 19) {
                                                                z2 = false;
                                                            } else if ((etxVar.n() & 128) != 0) {
                                                                i7 = 19;
                                                                z2 = true;
                                                            } else {
                                                                i7 = 19;
                                                                z2 = false;
                                                            }
                                                            int iA2 = defpackage.epy.a(iS5);
                                                            int i86 = true != z2 ? 2 : 1;
                                                            iB = defpackage.epy.b(iS6);
                                                            iA = iA2;
                                                            i8 = i86;
                                                        } else {
                                                            defpackage.etr.f("BoxParsers", "Unsupported color type: ".concat(defpackage.euu.e(i85)));
                                                            iB = -1;
                                                            iA = -1;
                                                        }
                                                    } else {
                                                        iA = -1;
                                                    }
                                                }
                                            }
                                        }
                                        i11 = i33;
                                    }
                                    jynVar2 = jynVar;
                                }
                                i34 = i45 + i7;
                                i33 = i11;
                                oqVar = oqVarL;
                                i4 = i46;
                                i35 = i8;
                                str2 = str6;
                                str15 = str5;
                                i36 = i9;
                                i38 = i10;
                                i32 = i32;
                                fpvVar2 = fpvVar2;
                            }
                            i9 = i36;
                            i10 = i38;
                        }
                        iA = i12;
                        i34 = i45 + i7;
                        i33 = i11;
                        oqVar = oqVarL;
                        i4 = i46;
                        i35 = i8;
                        str2 = str6;
                        str15 = str5;
                        i36 = i9;
                        i38 = i10;
                        i32 = i32;
                        fpvVar2 = fpvVar2;
                    }
                    i11 = i33;
                    i34 = i45 + i7;
                    i33 = i11;
                    oqVar = oqVarL;
                    i4 = i46;
                    i35 = i8;
                    str2 = str6;
                    str15 = str5;
                    i36 = i9;
                    i38 = i10;
                    i32 = i32;
                    fpvVar2 = fpvVar2;
                }
                defpackage.oq oqVar2 = oqVar;
                defpackage.fpv fpvVar3 = fpvVar2;
                int i87 = i35;
                i6 = i4;
                java.lang.String str24 = str2;
                int i88 = i36;
                int i89 = i38;
                if (oqVar2 != null) {
                    str3 = "video/dolby-vision";
                    obj = oqVar2.a;
                } else {
                    str3 = str24;
                }
                if (str3 == null) {
                    fpyVar2 = fpyVar;
                    str4 = str;
                    fpvVar = fpvVar3;
                } else {
                    defpackage.eqf eqfVar2 = new defpackage.eqf();
                    fpyVar2 = fpyVar;
                    eqfVar2.b(fpyVar2.a);
                    eqfVar2.c(str3);
                    eqfVar2.j = (java.lang.String) obj;
                    eqfVar2.t = iS3;
                    eqfVar2.u = iS4;
                    eqfVar2.v = i40;
                    eqfVar2.w = i39;
                    eqfVar2.A = fQ;
                    eqfVar2.y = fpyVar2.d;
                    eqfVar2.z = fpyVar2.e;
                    eqfVar2.B = bArrCopyOfRange;
                    eqfVar2.C = i37;
                    eqfVar2.q = listP2;
                    eqfVar2.p = i41;
                    eqfVar2.E = i42;
                    eqfVar2.r = drmInitData4;
                    str4 = str;
                    eqfVar2.d = str4;
                    eqfVar2.D = new defpackage.epy(iA, i87, iB, byteBufferS != null ? byteBufferS.array() : null, i88, i89);
                    defpackage.fpq fpqVar = fpqVarO2;
                    if (fpqVar != null) {
                        eqfVar2.h = aiql.T(fpqVar.a);
                        eqfVar2.i = aiql.T(fpqVar.b);
                    } else {
                        defpackage.fps fpsVar4 = fpsVar3;
                        if (fpsVar4 != null) {
                            eqfVar2.h = aiql.T(fpsVar4.c);
                            eqfVar2.i = aiql.T(fpsVar4.d);
                        }
                    }
                    defpackage.eqg eqgVar = new defpackage.eqg(eqfVar2);
                    fpvVar = fpvVar3;
                    fpvVar.b = eqgVar;
                }
            } else {
                if (i31 == 1836069985 || i31 == 1701733217 || i31 == 1633889587 || i31 == 1700998451 || i31 == 1633889588 || i31 == 1835823201 || i31 == 1685353315 || i31 == 1685353317 || i31 == 1685353320 || i31 == 1685353324 || i31 == 1685353336 || i31 == 1935764850 || i31 == 1935767394 || i31 == 1819304813 || i31 == 1936684916 || i31 == 1953984371 || i31 == 778924082 || i31 == 778924083 || i31 == 1835557169 || i31 == 1835560241 || i31 == 1634492771 || i31 == 1634492791 || i31 == 1970037111 || i31 == 1332770163 || i31 == 1716281667 || i31 == 1767992678 || i31 == 1768973165 || i31 == 1718641517) {
                    int i90 = fpyVar3.a;
                    etxVar.Q(i29 + 16);
                    if (z) {
                        iS = etxVar.s();
                        etxVar.R(6);
                    } else {
                        etxVar.R(8);
                        iS = 0;
                    }
                    if (iS == 0 || iS == 1) {
                        iS2 = etxVar.s();
                        etxVar.R(6);
                        iO = etxVar.o();
                        etxVar.Q(etxVar.c - 4);
                        i14 = etxVar.i();
                        if (iS == 1) {
                            etxVar.R(16);
                        }
                        i15 = -1;
                        i16 = 1767992678;
                    } else if (iS == 2) {
                        etxVar.R(16);
                        int iRound = (int) java.lang.Math.round(etxVar.c());
                        int iQ = etxVar.q();
                        etxVar.R(4);
                        int iQ2 = etxVar.q();
                        int iQ3 = etxVar.q();
                        int i91 = iQ3 & 1;
                        int i92 = iQ3 & 2;
                        if (i91 != 0) {
                            iP = eum.n(iQ2, i92 != 0 ? java.nio.ByteOrder.BIG_ENDIAN : java.nio.ByteOrder.LITTLE_ENDIAN);
                        } else {
                            iP = eum.p(iQ2, i92 != 0 ? java.nio.ByteOrder.BIG_ENDIAN : java.nio.ByteOrder.LITTLE_ENDIAN);
                        }
                        if (iP == 0) {
                            iP = -1;
                        }
                        etxVar.R(8);
                        i16 = 1767992678;
                        i15 = iP;
                        iS2 = iQ;
                        iO = iRound;
                        i14 = 0;
                    }
                    if (i31 == i16) {
                        i17 = -1;
                        iS2 = -1;
                    } else {
                        if (i31 == 1935764850) {
                            i17 = 8000;
                        } else if (i31 == 1935767394) {
                            i17 = 16000;
                            i31 = 1935767394;
                        } else {
                            i17 = iO;
                        }
                        iS2 = 1;
                    }
                    int i93 = etxVar.c;
                    i = i27;
                    if (i31 == 1701733217) {
                        android.util.Pair pairM2 = m(etxVar, i29, i30);
                        if (pairM2 != null) {
                            iIntValue = ((java.lang.Integer) pairM2.first).intValue();
                            androidx.media3.common.DrmInitData drmInitDataB2 = drmInitData == 0 ? null : drmInitData.b(((defpackage.fqo) pairM2.second).b);
                            fpvVar2.a[i28] = (defpackage.fqo) pairM2.second;
                            drmInitData3 = drmInitDataB2;
                        } else {
                            iIntValue = 1701733217;
                            drmInitData3 = drmInitData;
                        }
                        etxVar.Q(i93);
                        i31 = iIntValue;
                    } else {
                        drmInitData3 = drmInitData;
                    }
                    i2 = i28;
                    if (i31 == 1633889587) {
                        str8 = "audio/ac3";
                    } else if (i31 == 1700998451) {
                        str8 = "audio/eac3";
                    } else if (i31 == 1633889588) {
                        str8 = "audio/ac4";
                    } else if (i31 == 1685353315) {
                        str8 = "audio/vnd.dts";
                    } else if (i31 == 1685353320 || i31 == 1685353324) {
                        str8 = "audio/vnd.dts.hd";
                    } else if (i31 == 1685353317) {
                        str8 = "audio/vnd.dts.hd;profile=lbr";
                    } else if (i31 == 1685353336) {
                        str8 = "audio/vnd.dts.uhd;profile=p2";
                    } else if (i31 == 1935764850) {
                        str8 = "audio/3gpp";
                    } else if (i31 == 1935767394) {
                        str8 = "audio/amr-wb";
                    } else {
                        if (i31 == 1936684916) {
                            i18 = i31;
                            str9 = "audio/raw";
                            iN = 2;
                        } else {
                            if (i31 == 1953984371) {
                                i15 = 268435456;
                            } else if (i31 == 1819304813) {
                                if (i15 == -1) {
                                    i18 = i31;
                                    str9 = "audio/raw";
                                    iN = 2;
                                }
                            } else if (i31 == 778924082 || i31 == 778924083) {
                                str8 = "audio/mpeg";
                            } else if (i31 == 1835557169) {
                                str8 = "audio/mha1";
                            } else if (i31 == 1835560241) {
                                str8 = "audio/mhm1";
                            } else if (i31 == 1634492771) {
                                str8 = "audio/alac";
                            } else if (i31 == 1634492791) {
                                str8 = "audio/g711-alaw";
                            } else if (i31 == 1970037111) {
                                str8 = "audio/g711-mlaw";
                            } else if (i31 == 1332770163) {
                                str8 = "audio/opus";
                            } else if (i31 == 1716281667) {
                                str8 = "audio/flac";
                            } else if (i31 == 1835823201) {
                                str8 = "audio/true-hd";
                            } else if (i31 == 1767992678) {
                                str9 = "audio/iamf";
                                iN = i15;
                                i18 = 1767992678;
                            } else {
                                iN = i15;
                                i18 = i31;
                                str9 = null;
                            }
                            iN = i15;
                            i18 = i31;
                            str9 = "audio/raw";
                        }
                        listQ = null;
                        fpsVarP = null;
                        objH = null;
                        fpqVarO = null;
                        while (i93 - i29 < i30) {
                            etxVar.Q(i93);
                            i20 = etxVar.i();
                            i30 = i30;
                            if (i20 > 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            defpackage.hgu.am(z6, str14);
                            i21 = etxVar.i();
                            str14 = str14;
                            if (i21 == 1835557187) {
                                i22 = i20 + i93;
                                etxVar.Q(i93 + 8);
                                etxVar.R(1);
                                iN2 = etxVar.n();
                                etxVar.R(1);
                                if (j$.util.Objects.equals(str9, "audio/mhm1")) {
                                    str10 = java.lang.String.format("mhm1.%02X", java.lang.Integer.valueOf(iN2));
                                    i23 = 0;
                                } else {
                                    i23 = 0;
                                    str10 = java.lang.String.format("mha1.%02X", java.lang.Integer.valueOf(iN2));
                                }
                                objH = str10;
                                int iS7 = etxVar.s();
                                bArr = new byte[iS7];
                                i24 = i23;
                                etxVar.L(bArr, i24, iS7);
                                if (listQ == null) {
                                    listQ = aify.p(bArr);
                                } else {
                                    listQ = aify.q(bArr, (byte[]) listQ.get(i24));
                                }
                            } else if (i21 == 1835557200) {
                                i22 = i20 + i93;
                                etxVar.Q(i93 + 8);
                                iN3 = etxVar.n();
                                if (iN3 > 0) {
                                    bArr2 = new byte[iN3];
                                    etxVar.L(bArr2, 0, iN3);
                                    if (listQ == null) {
                                        listQ = aify.p(bArr2);
                                    } else {
                                        listQ = aify.q((byte[]) listQ.get(0), bArr2);
                                    }
                                }
                            } else {
                                fpsVar2 = fpsVarP;
                                if (i21 == 1702061171) {
                                    iJ = i93;
                                } else if (z || i21 != 2002876005) {
                                    if (i21 == 1651798644) {
                                        i26 = i93 + i20;
                                        fpqVarO = o(etxVar, i93);
                                    } else if (i21 == 1684103987) {
                                        i26 = i93 + i20;
                                        etxVar.Q(i93 + 8);
                                        fpvVar2.b = defpackage.fkp.b(etxVar, java.lang.Integer.toString(i90), str13, drmInitData3);
                                    } else {
                                        if (i21 == 1684366131) {
                                            int i94 = i20 - 8;
                                            int i95 = i20 + i93;
                                            int i96 = i93 + 8;
                                            byte[] bArr7 = new byte[i94];
                                            etxVar.Q(i96);
                                            etxVar.L(bArr7, 0, i94);
                                            etxVar.Q(i96);
                                            defpackage.eqf eqfVar3 = new defpackage.eqf(defpackage.fkp.c(etxVar, java.lang.Integer.toString(i90), str13, drmInitData3));
                                            eqfVar3.q = aify.p(bArr7);
                                            fpvVar2.b = new defpackage.eqg(eqfVar3);
                                            i93 = i95;
                                        } else if (i21 == 1684103988) {
                                            i26 = i93 + i20;
                                            etxVar.Q(i93 + 8);
                                            fpvVar2.b = defpackage.fkr.a(etxVar, java.lang.Integer.toString(i90), str13, drmInitData3);
                                        } else if (i21 == 1684892784) {
                                            i26 = i93 + i20;
                                            if (i21 != 1684305011 || i21 == 1969517683) {
                                                defpackage.eqf eqfVar4 = new defpackage.eqf();
                                                i25 = i90;
                                                eqfVar4.b(i25);
                                                eqfVar4.c(str9);
                                                eqfVar4.F = iS2;
                                                eqfVar4.H = i17;
                                                eqfVar4.r = drmInitData3;
                                                eqfVar4.d = str13;
                                                fpvVar2.b = new defpackage.eqg(eqfVar4);
                                            } else if (i21 == 1682927731) {
                                                int i97 = i93 + 9;
                                                int i98 = i20 - 8;
                                                defpackage.hgu.am(i98 >= 11, a.bj(i98, "dOps box body is too short: "));
                                                byte[] bArr8 = b;
                                                java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(bArr8.length + i98).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                                byteBufferOrder.put(bArr8);
                                                byteBufferOrder.put((byte) 1);
                                                etxVar.Q(i97);
                                                byteBufferOrder.put(etxVar.a());
                                                byteBufferOrder.putShort(etxVar.G());
                                                byteBufferOrder.putInt(etxVar.i());
                                                byteBufferOrder.putShort(etxVar.G());
                                                etxVar.K(byteBufferOrder, i26 - etxVar.c);
                                                listQ = defpackage.hgt.aA(byteBufferOrder.array());
                                            } else if (i21 == 1684425825) {
                                                int i99 = i20 - 12;
                                                byte[] bArr9 = new byte[i20 - 8];
                                                bArr9[0] = 102;
                                                bArr9[1] = 76;
                                                bArr9[2] = 97;
                                                bArr9[3] = 67;
                                                etxVar.Q(i93 + 12);
                                                etxVar.L(bArr9, 4, i99);
                                                listQ = aify.p(bArr9);
                                            } else if (i21 == 1634492771) {
                                                int i100 = i20 - 12;
                                                byte[] bArr10 = new byte[i100];
                                                etxVar.Q(i93 + 12);
                                                etxVar.L(bArr10, 0, i100);
                                                int[] iArrL = defpackage.ete.l(bArr10);
                                                i17 = iArrL[0];
                                                iS2 = iArrL[1];
                                                iN = eum.o(iArrL[2]);
                                                if (iN == 0) {
                                                    iN = -1;
                                                }
                                                listQ = aify.p(bArr10);
                                            } else if (i21 == 1767990114) {
                                                etxVar.Q(i93 + 9);
                                                int iR = etxVar.r();
                                                byte[] bArr11 = new byte[iR];
                                                etxVar.L(bArr11, 0, iR);
                                                objH = defpackage.ete.h(bArr11);
                                                listQ = aify.p(bArr11);
                                            } else if (i21 == 1885564227) {
                                                etxVar.Q(i93 + 12);
                                                java.nio.ByteOrder byteOrder = (etxVar.n() & 1) != 0 ? java.nio.ByteOrder.LITTLE_ENDIAN : java.nio.ByteOrder.BIG_ENDIAN;
                                                int iN10 = etxVar.n();
                                                if (i18 == 1768973165) {
                                                    iN = eum.p(iN10, byteOrder);
                                                } else if (i18 == 1718641517) {
                                                    iN = eum.n(iN10, byteOrder);
                                                }
                                                if (iN == 0) {
                                                    iN = -1;
                                                }
                                                i93 = i26;
                                                if (iN != -1) {
                                                    str9 = "audio/raw";
                                                }
                                            } else {
                                                i25 = i90;
                                            }
                                            i93 = i26;
                                            i90 = i25;
                                        } else {
                                            if (i14 > 0) {
                                                throw new defpackage.era(a.bj(i14, "Invalid sample rate for Dolby TrueHD MLP stream: "), null, true, 1);
                                            }
                                            i93 += i20;
                                            i17 = i14;
                                            fpsVarP = fpsVar2;
                                            iS2 = 2;
                                        }
                                        fpsVarP = fpsVar2;
                                    }
                                    i93 = i26;
                                    fpsVarP = fpsVar2;
                                } else {
                                    iJ = j(etxVar, 1702061171, i93, i20);
                                }
                                i25 = i90;
                                i93 += i20;
                                if (iJ != -1) {
                                    fpsVarP = p(etxVar, iJ);
                                    str9 = fpsVarP.a;
                                    bArr3 = fpsVarP.b;
                                    if (bArr3 != null) {
                                        if ("audio/vorbis".equals(str9)) {
                                            listQ = defpackage.fmm.b(bArr3);
                                        } else {
                                            if ("audio/mp4a-latm".equals(str9)) {
                                                defpackage.fsi fsiVarA = defpackage.fko.a(bArr3);
                                                i17 = fsiVarA.a;
                                                int i101 = fsiVarA.b;
                                                objH = fsiVarA.c;
                                                iS2 = i101;
                                            }
                                            listQ = aify.p(bArr3);
                                        }
                                    }
                                    i90 = i25;
                                } else {
                                    i90 = i25;
                                    fpsVarP = fpsVar2;
                                }
                            }
                            i93 = i22;
                        }
                        fpsVar = fpsVarP;
                        int i102 = i30;
                        i19 = i90;
                        if (fpvVar2.b == null && str9 != null) {
                            eqfVar = new defpackage.eqf();
                            eqfVar.b(i19);
                            eqfVar.c(str9);
                            eqfVar.j = (java.lang.String) objH;
                            eqfVar.F = iS2;
                            eqfVar.H = i17;
                            eqfVar.I = iN;
                            eqfVar.q = listQ;
                            eqfVar.r = drmInitData3;
                            eqfVar.d = str13;
                            if (fpsVar != null) {
                                eqfVar.h = aiql.T(fpsVar.c);
                                eqfVar.i = aiql.T(fpsVar.d);
                            } else if (fpqVarO != null) {
                                defpackage.fpq fpqVar2 = fpqVarO;
                                eqfVar.h = aiql.T(fpqVar2.a);
                                eqfVar.i = aiql.T(fpqVar2.b);
                            }
                            fpvVar2.b = new defpackage.eqg(eqfVar);
                        }
                        str4 = str13;
                        fpvVar = fpvVar2;
                        i5 = i29;
                        i6 = i102;
                        fpyVar2 = fpyVar;
                    }
                    java.lang.String str25 = str8;
                    iN = i15;
                    i18 = i31;
                    str9 = str25;
                    listQ = null;
                    fpsVarP = null;
                    objH = null;
                    fpqVarO = null;
                    while (i93 - i29 < i30) {
                        etxVar.Q(i93);
                        i20 = etxVar.i();
                        i30 = i30;
                        if (i20 > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        defpackage.hgu.am(z6, str14);
                        i21 = etxVar.i();
                        str14 = str14;
                        if (i21 == 1835557187) {
                            i22 = i20 + i93;
                            etxVar.Q(i93 + 8);
                            etxVar.R(1);
                            iN2 = etxVar.n();
                            etxVar.R(1);
                            if (j$.util.Objects.equals(str9, "audio/mhm1")) {
                                str10 = java.lang.String.format("mhm1.%02X", java.lang.Integer.valueOf(iN2));
                                i23 = 0;
                            } else {
                                i23 = 0;
                                str10 = java.lang.String.format("mha1.%02X", java.lang.Integer.valueOf(iN2));
                            }
                            objH = str10;
                            int iS8 = etxVar.s();
                            bArr = new byte[iS8];
                            i24 = i23;
                            etxVar.L(bArr, i24, iS8);
                            if (listQ == null) {
                                listQ = aify.p(bArr);
                            } else {
                                listQ = aify.q(bArr, (byte[]) listQ.get(i24));
                            }
                        } else if (i21 == 1835557200) {
                            i22 = i20 + i93;
                            etxVar.Q(i93 + 8);
                            iN3 = etxVar.n();
                            if (iN3 > 0) {
                                bArr2 = new byte[iN3];
                                etxVar.L(bArr2, 0, iN3);
                                if (listQ == null) {
                                    listQ = aify.p(bArr2);
                                } else {
                                    listQ = aify.q((byte[]) listQ.get(0), bArr2);
                                }
                            }
                        } else {
                            fpsVar2 = fpsVarP;
                            if (i21 == 1702061171) {
                                if (z) {
                                }
                                if (i21 == 1651798644) {
                                    i26 = i93 + i20;
                                    fpqVarO = o(etxVar, i93);
                                } else if (i21 == 1684103987) {
                                    i26 = i93 + i20;
                                    etxVar.Q(i93 + 8);
                                    fpvVar2.b = defpackage.fkp.b(etxVar, java.lang.Integer.toString(i90), str13, drmInitData3);
                                } else {
                                    if (i21 == 1684366131) {
                                        int i910 = i20 - 8;
                                        int i911 = i20 + i93;
                                        int i912 = i93 + 8;
                                        byte[] bArr12 = new byte[i910];
                                        etxVar.Q(i912);
                                        etxVar.L(bArr12, 0, i910);
                                        etxVar.Q(i912);
                                        defpackage.eqf eqfVar5 = new defpackage.eqf(defpackage.fkp.c(etxVar, java.lang.Integer.toString(i90), str13, drmInitData3));
                                        eqfVar5.q = aify.p(bArr12);
                                        fpvVar2.b = new defpackage.eqg(eqfVar5);
                                        i93 = i911;
                                    } else if (i21 == 1684103988) {
                                        i26 = i93 + i20;
                                        etxVar.Q(i93 + 8);
                                        fpvVar2.b = defpackage.fkr.a(etxVar, java.lang.Integer.toString(i90), str13, drmInitData3);
                                    } else if (i21 == 1684892784) {
                                        i26 = i93 + i20;
                                        if (i21 != 1684305011) {
                                            defpackage.eqf eqfVar6 = new defpackage.eqf();
                                            i25 = i90;
                                            eqfVar6.b(i25);
                                            eqfVar6.c(str9);
                                            eqfVar6.F = iS2;
                                            eqfVar6.H = i17;
                                            eqfVar6.r = drmInitData3;
                                            eqfVar6.d = str13;
                                            fpvVar2.b = new defpackage.eqg(eqfVar6);
                                            i93 = i26;
                                            i90 = i25;
                                        } else {
                                            defpackage.eqf eqfVar7 = new defpackage.eqf();
                                            i25 = i90;
                                            eqfVar7.b(i25);
                                            eqfVar7.c(str9);
                                            eqfVar7.F = iS2;
                                            eqfVar7.H = i17;
                                            eqfVar7.r = drmInitData3;
                                            eqfVar7.d = str13;
                                            fpvVar2.b = new defpackage.eqg(eqfVar7);
                                            i93 = i26;
                                            i90 = i25;
                                        }
                                    } else {
                                        if (i14 > 0) {
                                            throw new defpackage.era(a.bj(i14, "Invalid sample rate for Dolby TrueHD MLP stream: "), null, true, 1);
                                        }
                                        i93 += i20;
                                        i17 = i14;
                                        fpsVarP = fpsVar2;
                                        iS2 = 2;
                                    }
                                    fpsVarP = fpsVar2;
                                }
                                i93 = i26;
                                fpsVarP = fpsVar2;
                            } else {
                                iJ = i93;
                            }
                            i25 = i90;
                            i93 += i20;
                            if (iJ != -1) {
                                fpsVarP = p(etxVar, iJ);
                                str9 = fpsVarP.a;
                                bArr3 = fpsVarP.b;
                                if (bArr3 != null) {
                                    if ("audio/vorbis".equals(str9)) {
                                        listQ = defpackage.fmm.b(bArr3);
                                    } else {
                                        if ("audio/mp4a-latm".equals(str9)) {
                                            defpackage.fsi fsiVarA2 = defpackage.fko.a(bArr3);
                                            i17 = fsiVarA2.a;
                                            int i103 = fsiVarA2.b;
                                            objH = fsiVarA2.c;
                                            iS2 = i103;
                                        }
                                        listQ = aify.p(bArr3);
                                    }
                                }
                                i90 = i25;
                            } else {
                                i90 = i25;
                                fpsVarP = fpsVar2;
                            }
                        }
                        i93 = i22;
                    }
                    fpsVar = fpsVarP;
                    int i104 = i30;
                    i19 = i90;
                    if (fpvVar2.b == null) {
                        eqfVar = new defpackage.eqf();
                        eqfVar.b(i19);
                        eqfVar.c(str9);
                        eqfVar.j = (java.lang.String) objH;
                        eqfVar.F = iS2;
                        eqfVar.H = i17;
                        eqfVar.I = iN;
                        eqfVar.q = listQ;
                        eqfVar.r = drmInitData3;
                        eqfVar.d = str13;
                        if (fpsVar != null) {
                            eqfVar.h = aiql.T(fpsVar.c);
                            eqfVar.i = aiql.T(fpsVar.d);
                        } else if (fpqVarO != null) {
                            defpackage.fpq fpqVar3 = fpqVarO;
                            eqfVar.h = aiql.T(fpqVar3.a);
                            eqfVar.i = aiql.T(fpqVar3.b);
                        }
                        fpvVar2.b = new defpackage.eqg(eqfVar);
                    }
                    str4 = str13;
                    fpvVar = fpvVar2;
                    i5 = i29;
                    i6 = i104;
                    fpyVar2 = fpyVar;
                } else if (i31 == 1414810956 || i31 == 1954034535 || i31 == 2004251764 || i31 == 1937010800 || i31 == 1664495672 || i31 == 1836070003 || i31 == 1952807028) {
                    etxVar.Q(i29 + 16);
                    long j = Long.MAX_VALUE;
                    if (i31 == 1414810956) {
                        str11 = "application/ttml+xml";
                    } else {
                        if (i31 == 1954034535) {
                            int i105 = i30 - 16;
                            byte[] bArr13 = new byte[i105];
                            etxVar.L(bArr13, 0, i105);
                            listP = aify.p(bArr13);
                            str11 = "application/x-quicktime-tx3g";
                        } else if (i31 == 2004251764) {
                            str11 = "application/x-mp4-vtt";
                        } else if (i31 == 1937010800) {
                            j = 0;
                            str11 = "application/ttml+xml";
                        } else if (i31 == 1664495672) {
                            fpvVar2.d = 1;
                            str11 = "application/x-mp4-cea-608";
                        } else if (i31 == 1836070003) {
                            int i106 = etxVar.c;
                            etxVar.R(4);
                            if (etxVar.i() == 1702061171) {
                                byte[] bArr14 = p(etxVar, i106).b;
                                if (bArr14 != null && bArr14.length == 64) {
                                    str12 = "application/vobsub";
                                    listP = aify.p(eum.Z(r(bArr14, fpyVar3.f, fpyVar3.g)));
                                }
                            } else {
                                listP = null;
                                str12 = null;
                            }
                            str11 = str12;
                        } else {
                            str11 = "text/x-unknown";
                        }
                        if (str11 != null) {
                            defpackage.eqf eqfVar8 = new defpackage.eqf();
                            eqfVar8.b(fpyVar3.a);
                            eqfVar8.c(str11);
                            eqfVar8.d = str13;
                            eqfVar8.s = j;
                            eqfVar8.q = listP;
                            fpvVar2.b = new defpackage.eqg(eqfVar8);
                        }
                    }
                    listP = null;
                    if (str11 != null) {
                        defpackage.eqf eqfVar9 = new defpackage.eqf();
                        eqfVar9.b(fpyVar3.a);
                        eqfVar9.c(str11);
                        eqfVar9.d = str13;
                        eqfVar9.s = j;
                        eqfVar9.q = listP;
                        fpvVar2.b = new defpackage.eqg(eqfVar9);
                    }
                } else {
                    int i107 = i29 + i30;
                    if (i31 == 1835365492 || i31 == 1769222965 || i31 == 1835360888) {
                        int i108 = fpyVar3.a;
                        etxVar.Q(i29 + 16);
                        if (i31 == 1835365492) {
                            etxVar.T();
                            java.lang.String strT = etxVar.T();
                            if (strT != null) {
                                defpackage.eqf eqfVar10 = new defpackage.eqf();
                                eqfVar10.b(i108);
                                eqfVar10.c(strT);
                                fpvVar2.b = new defpackage.eqg(eqfVar10);
                            }
                        } else if (i31 == 1769222965) {
                            int iN11 = etxVar.n();
                            byte[] bArr15 = new byte[iN11];
                            etxVar.L(bArr15, 0, iN11);
                            defpackage.eqf eqfVar11 = new defpackage.eqf();
                            eqfVar11.b(i108);
                            eqfVar11.c("application/x-itut-t35");
                            eqfVar11.q = aify.p(bArr15);
                            fpvVar2.b = new defpackage.eqg(eqfVar11);
                        } else {
                            int i109 = etxVar.c;
                            int iJ2 = j(etxVar, 1801812339, i29, i30);
                            if (iJ2 != -1) {
                                etxVar.Q(iJ2);
                                int i110 = etxVar.i();
                                int i111 = i110 - 8;
                                defpackage.hgu.am(i111 >= 0 && iJ2 + i110 <= i107, null);
                                etxVar.R(4);
                                if (i111 > 0) {
                                    byte[] bArr16 = new byte[i111];
                                    etxVar.L(bArr16, 0, i111);
                                    defpackage.eqf eqfVar12 = new defpackage.eqf();
                                    eqfVar12.b(i108);
                                    eqfVar12.c("application/x-mp4-mebx");
                                    eqfVar12.q = aify.p(bArr16);
                                    etxVar.Q(i109);
                                    int iJ3 = j(etxVar, 1651798644, i29, i30);
                                    if (iJ3 != -1) {
                                        defpackage.fpq fpqVarO3 = o(etxVar, iJ3);
                                        eqfVar12.h = aiql.T(fpqVarO3.a);
                                        eqfVar12.i = aiql.T(fpqVarO3.b);
                                    }
                                    fpvVar2.b = new defpackage.eqg(eqfVar12);
                                }
                            }
                        }
                    } else if (i31 == 1667329389) {
                        defpackage.eqf eqfVar13 = new defpackage.eqf();
                        eqfVar13.b(fpyVar3.a);
                        eqfVar13.c("application/x-camera-motion");
                        fpvVar2.b = new defpackage.eqg(eqfVar13);
                    }
                }
                defpackage.fpv fpvVar4 = fpvVar2;
                fpyVar2 = fpyVar3;
                str4 = str13;
                fpvVar = fpvVar4;
                i = i27;
                i2 = i28;
                i5 = i29;
                i6 = i30;
            }
            etxVar.Q(i5 + i6);
            i28 = i2 + 1;
            defpackage.fpv fpvVar5 = fpvVar;
            str13 = str4;
            fpyVar3 = fpyVar2;
            fpvVar2 = fpvVar5;
            i27 = i;
        }
        return fpvVar2;
    }

    private static java.lang.String r(byte[] bArr, int i, int i2) {
        ahvr.bY(bArr.length == 64);
        java.util.ArrayList arrayList = new java.util.ArrayList(16);
        for (int i3 = 0; i3 < bArr.length - 3; i3 += 4) {
            int i4 = (bArr[i3] << 24) | ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3 + 2] & 255) << 8) | (bArr[i3 + 3] & 255);
            int i5 = ((i4 >> 8) & 255) - 128;
            int i6 = (i4 >> 16) & 255;
            int i7 = (i4 & 255) - 128;
            arrayList.add(java.lang.String.format("%06x", java.lang.Integer.valueOf((eum.c(((i5 * 14075) / 10000) + i6, 0, 255) << 16) | (eum.c((i6 - ((i7 * 3455) / 10000)) - ((i5 * 7169) / 10000), 0, 255) << 8) | eum.c(i6 + ((i7 * 17790) / 10000), 0, 255))));
        }
        return "size: " + i + 'x' + i2 + "\npalette: " + new ahyj(", ").b(arrayList) + '\n';
    }

    private static java.nio.ByteBuffer s() {
        return java.nio.ByteBuffer.allocate(25).order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }
}
