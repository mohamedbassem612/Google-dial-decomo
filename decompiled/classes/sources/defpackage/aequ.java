package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aequ {
    public final defpackage.aeqs a;
    public final defpackage.aoin b;
    public final defpackage.aevm c;
    public final defpackage.aoin d;
    public final defpackage.amwu e;
    private final defpackage.aent f;
    private final java.util.concurrent.Executor g;

    /* JADX WARN: Type inference failed for: r10v14, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [aoin, java.lang.Object] */
    public aequ(defpackage.aeqs aeqsVar, defpackage.aoin aoinVar, defpackage.aent aentVar, defpackage.ahbz ahbzVar, defpackage.aoin aoinVar2, java.util.concurrent.Executor executor, defpackage.amwu amwuVar, defpackage.aoin aoinVar3) {
        this.a = aeqsVar;
        this.f = aentVar;
        this.b = aoinVar;
        this.g = executor;
        this.d = new defpackage.vfy(aoinVar2, 20);
        android.content.Context context = (android.content.Context) ahbzVar.c.a();
        context.getClass();
        java.util.concurrent.Executor executor2 = (java.util.concurrent.Executor) ahbzVar.b.a();
        executor2.getClass();
        defpackage.aevo aevoVar = (defpackage.aevo) ahbzVar.d.a();
        aevoVar.getClass();
        java.lang.Boolean bool = (java.lang.Boolean) ahbzVar.a.a();
        bool.getClass();
        boolean zBooleanValue = bool.booleanValue();
        defpackage.ahyn ahynVar = (defpackage.ahyn) ((defpackage.amyw) ahbzVar.e).b;
        ahynVar.getClass();
        defpackage.ahbm ahbmVar = (defpackage.ahbm) ahbzVar.f.a();
        ahbmVar.getClass();
        this.c = new defpackage.aevm(context, executor2, aevoVar, amwuVar, zBooleanValue, ahynVar, aoinVar3, ahbmVar);
        this.e = amwuVar;
    }

    public final defpackage.ajcq a(final defpackage.aeqr aeqrVar) {
        if (this.f.a) {
            defpackage.ajcl ajclVar = defpackage.ajcl.a;
            return ajclVar == null ? new defpackage.ajcl() : ajclVar;
        }
        defpackage.ajas ajasVar = new defpackage.ajas() { // from class: aeqt
            /* JADX WARN: Code duplicated, block: B:188:0x06c1 A[Catch: RuntimeException -> 0x07ce, TRY_ENTER, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x07ce, blocks: (B:179:0x0694, B:188:0x06c1), top: B:262:0x0694 }] */
            /* JADX WARN: Code duplicated, block: B:193:0x06d5 A[Catch: RuntimeException -> 0x0792, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0792, blocks: (B:191:0x06c7, B:193:0x06d5, B:199:0x06e7, B:202:0x06f3, B:203:0x06fe, B:205:0x0704, B:207:0x070c), top: B:260:0x06c7 }] */
            /* JADX WARN: Code duplicated, block: B:195:0x06dd A[Catch: RuntimeException -> 0x06e0, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x06e0, blocks: (B:181:0x0698, B:183:0x069c, B:184:0x069e, B:186:0x06a6, B:195:0x06dd), top: B:266:0x0698 }] */
            /* JADX WARN: Code duplicated, block: B:201:0x06ef  */
            /* JADX WARN: Code duplicated, block: B:202:0x06f3 A[Catch: RuntimeException -> 0x0792, TryCatch #0 {RuntimeException -> 0x0792, blocks: (B:191:0x06c7, B:193:0x06d5, B:199:0x06e7, B:202:0x06f3, B:203:0x06fe, B:205:0x0704, B:207:0x070c), top: B:260:0x06c7 }] */
            /* JADX WARN: Code duplicated, block: B:205:0x0704 A[Catch: RuntimeException -> 0x0792, TryCatch #0 {RuntimeException -> 0x0792, blocks: (B:191:0x06c7, B:193:0x06d5, B:199:0x06e7, B:202:0x06f3, B:203:0x06fe, B:205:0x0704, B:207:0x070c), top: B:260:0x06c7 }] */
            /* JADX WARN: Code duplicated, block: B:207:0x070c A[Catch: RuntimeException -> 0x0792, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0792, blocks: (B:191:0x06c7, B:193:0x06d5, B:199:0x06e7, B:202:0x06f3, B:203:0x06fe, B:205:0x0704, B:207:0x070c), top: B:260:0x06c7 }] */
            /* JADX WARN: Code duplicated, block: B:211:0x0718 A[Catch: RuntimeException -> 0x0790, TryCatch #2 {RuntimeException -> 0x0790, blocks: (B:220:0x0777, B:209:0x0714, B:211:0x0718, B:213:0x0722, B:216:0x0734, B:218:0x073a, B:219:0x0747), top: B:264:0x0777 }] */
            /* JADX WARN: Code duplicated, block: B:212:0x0720  */
            /* JADX WARN: Code duplicated, block: B:228:0x079a  */
            /* JADX WARN: Code duplicated, block: B:233:0x07bb A[Catch: RuntimeException -> 0x07ca, TryCatch #5 {RuntimeException -> 0x07ca, blocks: (B:235:0x07c6, B:231:0x07b5, B:233:0x07bb), top: B:270:0x07c6 }] */
            /* JADX WARN: Code duplicated, block: B:247:0x07ec  */
            /* JADX WARN: Code duplicated, block: B:248:0x07ee  */
            /* JADX WARN: Code duplicated, block: B:260:0x06c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:288:0x0722 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:96:0x0298 A[LOOP:1: B:94:0x0295->B:96:0x0298, LOOP_END] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v19, types: [ahzi, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r10v0, types: [ahzi, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v4, types: [ahzi, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v57, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v12, types: [ahzi, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v51, types: [ahzi, java.lang.Object] */
            @Override // defpackage.ajas
            public final defpackage.ajcq a() {
                defpackage.apga apgaVarA;
                java.lang.Object objC;
                int i;
                boolean z;
                java.util.ArrayList arrayList;
                byte[] bArr;
                int i2;
                java.lang.RuntimeException runtimeException;
                java.lang.RuntimeException runtimeException2;
                defpackage.ajcq ajcqVarF;
                defpackage.apgm apgmVar;
                defpackage.alat<apgl> alatVar;
                defpackage.akzx akzxVarM;
                apgl apglVar;
                byte[] bArr2;
                int i3;
                defpackage.apgu apguVar;
                defpackage.ajbm ajbmVar;
                defpackage.ajcq ajcqVarG;
                int i4;
                java.util.List listSubList;
                int i5;
                long j;
                byte b;
                int i6;
                boolean z2;
                int i7;
                defpackage.aeos[] aeosVarArr;
                int i8;
                defpackage.aeqr aeqrVar2 = aeqrVar;
                boolean z3 = aeqrVar2.g;
                defpackage.aequ aequVar = this.a;
                char c = 2;
                if (z3) {
                    defpackage.akzx akzxVarM2 = defpackage.apga.a.m();
                    akzxVarM2.u();
                    defpackage.apga apgaVar = (defpackage.apga) akzxVarM2.b;
                    apgaVar.e = 2;
                    apgaVar.b |= 2;
                    apgaVarA = (defpackage.apga) akzxVarM2.r();
                } else {
                    apgaVarA = aequVar.c.a(aeqrVar2.f);
                }
                int i9 = aeqrVar2.n;
                byte b2 = -1;
                if (i9 != 0) {
                    defpackage.akzx akzxVarL = apgaVarA.L();
                    akzxVarL.u();
                    defpackage.apga apgaVar2 = (defpackage.apga) akzxVarL.b;
                    apgaVar2.e = i9 - 1;
                    apgaVar2.b |= 2;
                    apgaVarA = (defpackage.apga) akzxVarL.r();
                }
                defpackage.aevn aevnVar = defpackage.aevn.a;
                if (apgaVarA.c != 2 || ((java.lang.Integer) apgaVarA.d).intValue() != -1) {
                    int i10 = 4;
                    if ((apgaVarA.c == 4 ? (defpackage.apfz) apgaVarA.d : defpackage.apfz.a).c != -1) {
                        defpackage.aeqx aeqxVar = (defpackage.aeqx) aequVar.b.a();
                        defpackage.apgu apguVar2 = aeqrVar2.c;
                        defpackage.akzx akzxVarL2 = apguVar2.L();
                        defpackage.akzx akzxVarM3 = defpackage.apgd.a.m();
                        defpackage.apgc apgcVar = (defpackage.apgc) aeqxVar.f.eZ();
                        akzxVarM3.u();
                        defpackage.apgd apgdVar = (defpackage.apgd) akzxVarM3.b;
                        apgdVar.e = apgcVar.h;
                        apgdVar.b |= 4;
                        java.lang.Object obj = aeqxVar.c;
                        boolean z4 = true;
                        if (obj != null) {
                            akzxVarM3.u();
                            defpackage.apgd apgdVar2 = (defpackage.apgd) akzxVarM3.b;
                            j$.util.Objects.requireNonNull(obj);
                            apgdVar2.b |= 1;
                            apgdVar2.c = (java.lang.String) obj;
                        }
                        akzxVarM3.u();
                        defpackage.apgd apgdVar3 = (defpackage.apgd) akzxVarM3.b;
                        apgdVar3.b |= 8;
                        apgdVar3.f = 1001915728L;
                        java.lang.Object obj2 = aeqxVar.e;
                        if (obj2 != null) {
                            akzxVarM3.u();
                            defpackage.apgd apgdVar4 = (defpackage.apgd) akzxVarM3.b;
                            j$.util.Objects.requireNonNull(obj2);
                            apgdVar4.b |= 2;
                            apgdVar4.d = (java.lang.String) obj2;
                        }
                        defpackage.apfa apfaVar = apguVar2.f;
                        if (apfaVar == null) {
                            apfaVar = defpackage.apfa.a;
                        }
                        defpackage.apfy apfyVar = apfaVar.d;
                        if (apfyVar == null) {
                            apfyVar = defpackage.apfy.a;
                        }
                        defpackage.apfx apfxVar = apfyVar.c;
                        if (apfxVar == null) {
                            apfxVar = defpackage.apfx.a;
                        }
                        if ((apfxVar.b & 8) == 0 || !((java.lang.Boolean) aeqxVar.a.a()).booleanValue()) {
                            objC = aeqxVar.d;
                        } else {
                            defpackage.apfa apfaVar2 = apguVar2.f;
                            if (apfaVar2 == null) {
                                apfaVar2 = defpackage.apfa.a;
                            }
                            defpackage.apfy apfyVar2 = apfaVar2.d;
                            if (apfyVar2 == null) {
                                apfyVar2 = defpackage.apfy.a;
                            }
                            defpackage.apfx apfxVar2 = apfyVar2.c;
                            if (apfxVar2 == null) {
                                apfxVar2 = defpackage.apfx.a;
                            }
                            objC = defpackage.aepw.c((java.lang.String) obj, apfxVar2.f);
                        }
                        if (objC != null) {
                            akzxVarM3.u();
                            defpackage.apgd apgdVar5 = (defpackage.apgd) akzxVarM3.b;
                            j$.util.Objects.requireNonNull(objC);
                            apgdVar5.b |= 16;
                            apgdVar5.g = (java.lang.String) objC;
                        }
                        java.lang.Object obj3 = aeqxVar.m;
                        int i11 = apguVar2.b;
                        if ((i11 & 64) != 0 || (i11 & 65536) != 0 || ((java.lang.Boolean) ((defpackage.adao) obj3).a.a()).booleanValue()) {
                            defpackage.ahyn ahynVar = (defpackage.ahyn) ((defpackage.xtq) ((defpackage.adao) obj3).b).a.eZ();
                            if (ahynVar.f()) {
                                java.lang.String str = (java.lang.String) ahynVar.b();
                                if (str.equals("com.android.vending")) {
                                    akzxVarM3.u();
                                    defpackage.apgd apgdVar6 = (defpackage.apgd) akzxVarM3.b;
                                    apgdVar6.b |= 64;
                                    apgdVar6.h = true;
                                } else {
                                    akzxVarM3.u();
                                    defpackage.apgd apgdVar7 = (defpackage.apgd) akzxVarM3.b;
                                    j$.util.Objects.requireNonNull(str);
                                    apgdVar7.b |= 128;
                                    apgdVar7.i = str;
                                }
                            }
                        }
                        akzxVarL2.u();
                        defpackage.apgu apguVar3 = (defpackage.apgu) akzxVarL2.b;
                        defpackage.apgd apgdVar8 = (defpackage.apgd) akzxVarM3.r();
                        j$.util.Objects.requireNonNull(apgdVar8);
                        apguVar3.w = apgdVar8;
                        apguVar3.b |= 8388608;
                        if (defpackage.abyl.i((android.content.Context) aeqxVar.b)) {
                            defpackage.akzx akzxVarM4 = defpackage.apgk.a.m();
                            long freeSpace = ((defpackage.vwb) aeqxVar.g).l().getFreeSpace() / 1024;
                            akzxVarM4.u();
                            defpackage.apgk apgkVar = (defpackage.apgk) akzxVarM4.b;
                            apgkVar.b |= 1;
                            apgkVar.c = freeSpace;
                            long jLongValue = ((java.lang.Long) aeqxVar.h.eZ()).longValue();
                            akzxVarM4.u();
                            defpackage.apgk apgkVar2 = (defpackage.apgk) akzxVarM4.b;
                            apgkVar2.b |= 2;
                            apgkVar2.d = jLongValue;
                            akzxVarL2.u();
                            defpackage.apgu apguVar4 = (defpackage.apgu) akzxVarL2.b;
                            defpackage.apgk apgkVar3 = (defpackage.apgk) akzxVarM4.r();
                            j$.util.Objects.requireNonNull(apgkVar3);
                            apguVar4.y = apgkVar3;
                            apguVar4.b |= 33554432;
                        }
                        java.lang.Object obj4 = aeqxVar.i;
                        aeox aeoxVar = aeqrVar2.l;
                        int i12 = 19;
                        int i13 = 0;
                        if (aeoxVar != null) {
                            java.lang.Object obj5 = aeqxVar.j;
                            int i14 = aeqrVar2.m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            int i15 = 0;
                            while (true) {
                                defpackage.aeoz[] aeozVarArr = aeoxVar.b;
                                char c2 = c;
                                if (i15 >= aeozVarArr.length) {
                                    break;
                                }
                                defpackage.aeoz aeozVar = aeozVarArr[i15];
                                int i16 = aeoxVar.c[i15];
                                if (i14 <= 0) {
                                    aeosVarArr = new defpackage.aeos[i13];
                                    b = b2;
                                    i6 = i10;
                                } else {
                                    b = b2;
                                    int iMax = java.lang.Math.max(i16 - java.lang.Math.min(i14, i12), i13);
                                    i6 = i10;
                                    int i17 = i16 - iMax;
                                    if (i17 <= 0) {
                                        aeosVarArr = new defpackage.aeos[i13];
                                    } else {
                                        defpackage.aeos[] aeosVarArr2 = new defpackage.aeos[i17];
                                        z2 = z4;
                                        int i18 = i13;
                                        while (i18 < i17) {
                                            aeosVarArr2[i18] = (defpackage.aeos) aeozVar.a.get((i18 + iMax) % 20);
                                            i18++;
                                            iMax = iMax;
                                        }
                                        int i19 = aeozVar.c;
                                        if (i19 >= i16) {
                                            i7 = i19 - i16;
                                        } else {
                                            int i20 = aeozVar.d;
                                            i7 = (i19 - 27) + (Integer.MAX_VALUE - i16);
                                        }
                                        int i21 = (i7 - (20 - i17)) + 1;
                                        if (i21 >= i17) {
                                            aeosVarArr = new defpackage.aeos[0];
                                        } else if (i21 > 0) {
                                            int i22 = i17 - i21;
                                            aeosVarArr = new defpackage.aeos[i22];
                                            java.lang.System.arraycopy(aeosVarArr2, i21, aeosVarArr, 0, i22);
                                        } else {
                                            aeosVarArr = aeosVarArr2;
                                        }
                                    }
                                    for (defpackage.aeos aeosVar : aeosVarArr) {
                                        arrayList2.add(new amwp(aeosVar, i15));
                                    }
                                    i15++;
                                    c = c2;
                                    i10 = i6;
                                    b2 = b;
                                    z4 = z2;
                                    i12 = 19;
                                    i13 = 0;
                                }
                                z2 = z4;
                                while (i8 < aeosVarArr.length) {
                                    arrayList2.add(new amwp(aeosVar, i15));
                                }
                                i15++;
                                c = c2;
                                i10 = i6;
                                b2 = b;
                                z4 = z2;
                                i12 = 19;
                                i13 = 0;
                            }
                            i = i10;
                            z = z4;
                            java.util.Collections.sort(arrayList2, new aeov(0));
                            defpackage.akzx akzxVarM5 = defpackage.apgj.a.m();
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            int iMax2 = java.lang.Math.max(arrayList2.size() - i14, 0);
                            long j2 = 0;
                            while (iMax2 < arrayList2.size()) {
                                amwp amwpVar = (amwp) arrayList2.get(iMax2);
                                defpackage.aeos aeosVar2 = (defpackage.aeos) amwpVar.b;
                                defpackage.aeor aeorVar = aeosVar2.g;
                                if (aeorVar != null) {
                                    defpackage.akzx akzxVarM6 = defpackage.apgn.a.m();
                                    int iIntValue = aeorVar.a.intValue();
                                    akzxVarM6.u();
                                    defpackage.apgn apgnVar = (defpackage.apgn) akzxVarM6.b;
                                    i5 = iMax2;
                                    apgnVar.b |= 1;
                                    apgnVar.c = iIntValue;
                                    long j3 = aeosVar2.a;
                                    j = j2;
                                    defpackage.alcf alcfVarF = defpackage.aldi.f(j3 / 1000000000, (int) (j3 % 1000000000));
                                    akzxVarM6.u();
                                    defpackage.apgn apgnVar2 = (defpackage.apgn) akzxVarM6.b;
                                    j$.util.Objects.requireNonNull(alcfVarF);
                                    apgnVar2.d = alcfVarF;
                                    apgnVar2.b |= 2;
                                    int i23 = aeosVar2.d;
                                    akzxVarM6.u();
                                    defpackage.apgn apgnVar3 = (defpackage.apgn) akzxVarM6.b;
                                    apgnVar3.b |= 16;
                                    apgnVar3.g = i23;
                                    akzxVarM6.u();
                                    defpackage.apgn apgnVar4 = (defpackage.apgn) akzxVarM6.b;
                                    apgnVar4.b |= 32;
                                    apgnVar4.h = aeorVar.d;
                                    akzxVarM6.u();
                                    defpackage.apgn apgnVar5 = (defpackage.apgn) akzxVarM6.b;
                                    java.lang.String str2 = aeorVar.b;
                                    j$.util.Objects.requireNonNull(str2);
                                    apgnVar5.b |= 4;
                                    apgnVar5.e = str2;
                                    akzxVarM6.u();
                                    defpackage.apgn apgnVar6 = (defpackage.apgn) akzxVarM6.b;
                                    java.lang.String str3 = aeorVar.c;
                                    j$.util.Objects.requireNonNull(str3);
                                    apgnVar6.b |= 8;
                                    apgnVar6.f = str3;
                                    arrayList3.add((defpackage.apgn) akzxVarM6.r());
                                } else {
                                    i5 = iMax2;
                                    j = j2;
                                    int i24 = amwpVar.a;
                                    java.lang.Long lAg = agmc.ag(aeosVar2.b + '.' + aeosVar2.c + ':' + aeosVar2.d);
                                    if (lAg != null) {
                                        long jLongValue2 = lAg.longValue();
                                        akzxVarM5.u();
                                        defpackage.apgj apgjVar = (defpackage.apgj) akzxVarM5.b;
                                        defpackage.alan alanVar = apgjVar.b;
                                        if (!alanVar.c()) {
                                            apgjVar.b = defpackage.alad.I(alanVar);
                                        }
                                        apgjVar.b.g(jLongValue2);
                                        int size = ((defpackage.apgj) akzxVarM5.b).b.size() - 1;
                                        j2 = aeosVar2.a / 1000000;
                                        long j4 = j2 - j;
                                        akzxVarM5.u();
                                        defpackage.apgj apgjVar2 = (defpackage.apgj) akzxVarM5.b;
                                        defpackage.alan alanVar2 = apgjVar2.c;
                                        if (!alanVar2.c()) {
                                            apgjVar2.c = defpackage.alad.I(alanVar2);
                                        }
                                        apgjVar2.c.g(j4);
                                        akzxVarM5.u();
                                        defpackage.apgj apgjVar3 = (defpackage.apgj) akzxVarM5.b;
                                        defpackage.alak alakVar = apgjVar3.d;
                                        if (!alakVar.c()) {
                                            apgjVar3.d = defpackage.alad.H(alakVar);
                                        }
                                        apgjVar3.d.g(i24);
                                        int i25 = 0;
                                        while (true) {
                                            int[] iArr = aeosVar2.e;
                                            if (i25 < iArr.length) {
                                                int i26 = iArr[i25];
                                                akzxVarM5.u();
                                                defpackage.apgj apgjVar4 = (defpackage.apgj) akzxVarM5.b;
                                                defpackage.alak alakVar2 = apgjVar4.e;
                                                if (!alakVar2.c()) {
                                                    apgjVar4.e = defpackage.alad.H(alakVar2);
                                                }
                                                apgjVar4.e.g(size);
                                                akzxVarM5.u();
                                                defpackage.apgj apgjVar5 = (defpackage.apgj) akzxVarM5.b;
                                                defpackage.alak alakVar3 = apgjVar5.f;
                                                if (!alakVar3.c()) {
                                                    apgjVar5.f = defpackage.alad.H(alakVar3);
                                                }
                                                apgjVar5.f.g(i26);
                                                java.lang.String str4 = aeosVar2.f[i25];
                                                akzxVarM5.u();
                                                defpackage.apgj apgjVar6 = (defpackage.apgj) akzxVarM5.b;
                                                j$.util.Objects.requireNonNull(str4);
                                                defpackage.alat alatVar2 = apgjVar6.g;
                                                if (!alatVar2.c()) {
                                                    apgjVar6.g = defpackage.alad.J(alatVar2);
                                                }
                                                apgjVar6.g.add(str4);
                                                i25++;
                                            }
                                        }
                                    }
                                    iMax2 = i5 + 1;
                                    arrayList3 = arrayList3;
                                }
                                j2 = j;
                                iMax2 = i5 + 1;
                                arrayList3 = arrayList3;
                            }
                            aeow aeowVar = new aeow((defpackage.apgj) akzxVarM5.r(), defpackage.aify.n(arrayList3));
                            defpackage.apgj apgjVar7 = aeowVar.a;
                            akzxVarL2.u();
                            defpackage.apgu apguVar5 = (defpackage.apgu) akzxVarL2.b;
                            j$.util.Objects.requireNonNull(apgjVar7);
                            apguVar5.t = apgjVar7;
                            apguVar5.b |= 4194304;
                            defpackage.aify aifyVar = aeowVar.b;
                            akzxVarL2.u();
                            defpackage.apgu apguVar6 = (defpackage.apgu) akzxVarL2.b;
                            defpackage.alat alatVar3 = apguVar6.u;
                            if (!alatVar3.c()) {
                                apguVar6.u = defpackage.alad.J(alatVar3);
                            }
                            defpackage.akyl.i(aifyVar, apguVar6.u);
                        } else {
                            i = 4;
                            z = true;
                        }
                        java.lang.Object obj6 = aeqxVar.k;
                        if (aeqrVar2.i && (i4 = aeqrVar2.j) > 0) {
                            defpackage.aify aifyVar2 = (defpackage.aify) j$.util.Collection.-EL.stream(((defpackage.ahqm) ((uzx) ((defpackage.ahys) obj6).a).a).d()).filter(aeqrVar2.k).map(new adci(14)).collect(defpackage.aido.a);
                            if (!aifyVar2.isEmpty()) {
                                int i27 = 0;
                                if (aifyVar2.size() > i4) {
                                    listSubList = aifyVar2;
                                    listSubList = aifyVar2.subList(0, i4);
                                }
                                listSubList = aifyVar2;
                                java.util.List listAO = defpackage.ahvr.aO(listSubList, new defpackage.aeqw(i27));
                                akzxVarL2.u();
                                defpackage.apgu apguVar7 = (defpackage.apgu) akzxVarL2.b;
                                defpackage.alat alatVar4 = apguVar7.s;
                                if (!alatVar4.c()) {
                                    apguVar7.s = defpackage.alad.J(alatVar4);
                                }
                                defpackage.akyl.i(listAO, apguVar7.s);
                            }
                        }
                        byte[] bArr3 = null;
                        if (aeqrVar2.h != null) {
                            throw null;
                        }
                        aiep aiepVar = ((acoo) ((aprf) ((defpackage.ahys) aeqxVar.l).a).a).a;
                        synchronized (aiepVar) {
                            arrayList = new java.util.ArrayList((java.util.Collection) aiepVar);
                        }
                        java.util.List listAN = defpackage.ahvr.aN(arrayList);
                        defpackage.aify aifyVarN = defpackage.aify.n(listAN.subList(0, java.lang.Math.min(3, listAN.size())));
                        akzxVarL2.u();
                        defpackage.apgu apguVar8 = (defpackage.apgu) akzxVarL2.b;
                        defpackage.alat alatVar5 = apguVar8.v;
                        if (!alatVar5.c()) {
                            apguVar8.v = defpackage.alad.J(alatVar5);
                        }
                        defpackage.akyl.i(aifyVarN, apguVar8.v);
                        defpackage.akzx akzxVarL3 = ((defpackage.apgu) akzxVarL2.r()).L();
                        akzxVarL3.u();
                        defpackage.apgu apguVar9 = (defpackage.apgu) akzxVarL3.b;
                        j$.util.Objects.requireNonNull(apgaVarA);
                        apguVar9.r = apgaVarA;
                        apguVar9.b |= 2097152;
                        java.lang.String str5 = aeqrVar2.a;
                        if (aeqrVar2.b) {
                            if (str5 != null) {
                                akzxVarL3.u();
                                defpackage.apgu apguVar10 = (defpackage.apgu) akzxVarL3.b;
                                j$.util.Objects.requireNonNull(str5);
                                apguVar10.b |= 4;
                                apguVar10.e = str5;
                            } else {
                                akzxVarL3.u();
                                defpackage.apgu apguVar11 = (defpackage.apgu) akzxVarL3.b;
                                apguVar11.b &= -5;
                                apguVar11.e = defpackage.apgu.a.e;
                            }
                        } else if (str5 != null) {
                            akzxVarL3.u();
                            defpackage.apgu apguVar12 = (defpackage.apgu) akzxVarL3.b;
                            j$.util.Objects.requireNonNull(str5);
                            apguVar12.b |= 2;
                            apguVar12.d = str5;
                        } else {
                            akzxVarL3.u();
                            defpackage.apgu apguVar13 = (defpackage.apgu) akzxVarL3.b;
                            apguVar13.b &= -3;
                            apguVar13.d = defpackage.apgu.a.d;
                        }
                        aequVar.d.a();
                        defpackage.apev apevVar = defpackage.apev.a;
                        defpackage.akzz akzzVar = (defpackage.akzz) apevVar.m();
                        defpackage.apev apevVar2 = aeqrVar2.d;
                        ((defpackage.aepy) aequVar.e.a()).c();
                        if (apevVar2 != null) {
                            akzzVar.z(apevVar2);
                        }
                        defpackage.apev apevVar3 = (defpackage.apev) akzzVar.r();
                        if (z == apevVar3.equals(apevVar)) {
                            apevVar3 = null;
                        }
                        if (apevVar3 != null) {
                            akzxVarL3.u();
                            defpackage.apgu apguVar14 = (defpackage.apgu) akzxVarL3.b;
                            j$.util.Objects.requireNonNull(apevVar3);
                            apguVar14.z = apevVar3;
                            apguVar14.b |= 67108864;
                        }
                        java.lang.String str6 = aeqrVar2.e;
                        if (str6 != null) {
                            defpackage.akzx akzxVarM7 = defpackage.apgb.a.m();
                            akzxVarM7.u();
                            defpackage.apgb apgbVar = (defpackage.apgb) akzxVarM7.b;
                            j$.util.Objects.requireNonNull(str6);
                            apgbVar.b |= 1;
                            apgbVar.c = str6;
                            akzxVarL3.u();
                            defpackage.apgu apguVar15 = (defpackage.apgu) akzxVarL3.b;
                            defpackage.apgb apgbVar2 = (defpackage.apgb) akzxVarM7.r();
                            j$.util.Objects.requireNonNull(apgbVar2);
                            apguVar15.A = apgbVar2;
                            apguVar15.b |= 134217728;
                        }
                        defpackage.aeqs aeqsVar = aequVar.a;
                        defpackage.apgu apguVar16 = (defpackage.apgu) akzxVarL3.r();
                        defpackage.aify aifyVar3 = (defpackage.aify) aeqsVar.a.eZ();
                        defpackage.aift aiftVarD = defpackage.aify.d(aifyVar3.size());
                        int size2 = aifyVar3.size();
                        java.lang.RuntimeException runtimeException3 = null;
                        int i28 = 0;
                        while (i28 < size2) {
                            ahex ahexVar = (ahex) aifyVar3.get(i28);
                            try {
                                if (ahexVar.a) {
                                    try {
                                        defpackage.apgi apgiVar = apguVar16.i;
                                        if (apgiVar == null) {
                                            apgiVar = defpackage.apgi.a;
                                        }
                                        if ((apgiVar.b & 1) != 0) {
                                            ajcqVarF = defpackage.ajan.f(((aevz) ahexVar.c).a(), new defpackage.wym(ahexVar, apguVar16, 19, bArr3), defpackage.ajbm.INSTANCE);
                                            bArr = bArr3;
                                            i2 = i;
                                        } else {
                                            if ((apguVar16.b & 512) == 0) {
                                                try {
                                                    if (((java.lang.Boolean) ahexVar.b.eZ()).booleanValue()) {
                                                        defpackage.akzx akzxVarL4 = apguVar16.L();
                                                        apgmVar = apguVar16.l;
                                                        if (apgmVar == null) {
                                                            apgmVar = defpackage.apgm.a;
                                                        }
                                                        alatVar = apgmVar.k;
                                                        if (alatVar.isEmpty()) {
                                                            bArr = bArr3;
                                                        } else {
                                                            akzxVarM = apgq.a.m();
                                                            apglVar = bArr3;
                                                            for (apgl apglVar2 : alatVar) {
                                                                if (apglVar != 0) {
                                                                    i3 = apglVar.e + 1;
                                                                    bArr2 = bArr3;
                                                                    if (i3 != apglVar2.d) {
                                                                        akzxVarM.bM(0);
                                                                        akzxVarM.bL(i3);
                                                                    }
                                                                } else {
                                                                    bArr2 = bArr3;
                                                                }
                                                                akzxVarM.bM(apglVar2.c);
                                                                akzxVarM.bL(apglVar2.d);
                                                                apglVar = apglVar2;
                                                                bArr3 = bArr2;
                                                            }
                                                            bArr = bArr3;
                                                            if (apglVar != 0 && (apglVar.b & 4) != 0) {
                                                                int i29 = apglVar.e + 1;
                                                                akzxVarM.bM(0);
                                                                akzxVarM.bL(i29);
                                                            }
                                                            defpackage.akzz akzzVar2 = (defpackage.akzz) apgmVar.L();
                                                            akzzVar2.u();
                                                            ((defpackage.apgm) akzzVar2.b).k = defpackage.albq.a;
                                                            akzzVar2.u();
                                                            defpackage.apgm apgmVar2 = (defpackage.apgm) akzzVar2.b;
                                                            apgq apgqVarR = akzxVarM.r();
                                                            j$.util.Objects.requireNonNull(apgqVarR);
                                                            apgmVar2.j = apgqVarR;
                                                            apgmVar2.b |= 128;
                                                            apgmVar = (defpackage.apgm) akzzVar2.r();
                                                        }
                                                        try {
                                                            akzxVarL4.u();
                                                            defpackage.apgu apguVar17 = (defpackage.apgu) akzxVarL4.b;
                                                            j$.util.Objects.requireNonNull(apgmVar);
                                                            apguVar17.l = apgmVar;
                                                            apguVar17.b |= 512;
                                                            apguVar = (defpackage.apgu) akzxVarL4.r();
                                                        } catch (java.lang.RuntimeException e) {
                                                            e = e;
                                                            runtimeException = e;
                                                            i2 = i;
                                                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(runtimeException)).l("com/google/android/libraries/performance/primes/metrics/core/MetricDispatcher", "dispatch", '<', "MetricDispatcher.java")).v("One transmitter failed to send message");
                                                            runtimeException2 = runtimeException;
                                                            if (runtimeException3 == null) {
                                                                runtimeException3 = runtimeException2;
                                                            } else {
                                                                runtimeException3.addSuppressed(runtimeException2);
                                                            }
                                                        }
                                                    } else {
                                                        bArr = bArr3;
                                                        apguVar = apguVar16;
                                                    }
                                                } catch (java.lang.RuntimeException e2) {
                                                    e = e2;
                                                    bArr = bArr3;
                                                }
                                            } else {
                                                bArr = bArr3;
                                                apguVar = apguVar16;
                                            }
                                            try {
                                                defpackage.ajcq ajcqVarA = ((aevz) ahexVar.c).a();
                                                adot adotVar = new adot(ahexVar, apguVar, 5);
                                                ajbmVar = defpackage.ajbm.INSTANCE;
                                                ajcqVarG = defpackage.ajan.g(ajcqVarA, adotVar, ajbmVar);
                                                i2 = i;
                                                if (android.util.Log.isLoggable("ClearcutMetricXmitter", i2)) {
                                                    defpackage.aiql.I(ajcqVarG, new jya(ahexVar, 18), ajbmVar);
                                                }
                                                ajcqVarF = ajcqVarG;
                                            } catch (java.lang.RuntimeException e3) {
                                                e = e3;
                                                i2 = i;
                                                runtimeException = e;
                                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(runtimeException)).l("com/google/android/libraries/performance/primes/metrics/core/MetricDispatcher", "dispatch", '<', "MetricDispatcher.java")).v("One transmitter failed to send message");
                                                runtimeException2 = runtimeException;
                                                if (runtimeException3 == null) {
                                                    runtimeException3 = runtimeException2;
                                                } else {
                                                    runtimeException3.addSuppressed(runtimeException2);
                                                }
                                                i28++;
                                                i = i2;
                                                bArr3 = bArr;
                                            }
                                        }
                                    } catch (java.lang.RuntimeException e4) {
                                        runtimeException = e4;
                                        bArr = bArr3;
                                        i2 = i;
                                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(runtimeException)).l("com/google/android/libraries/performance/primes/metrics/core/MetricDispatcher", "dispatch", '<', "MetricDispatcher.java")).v("One transmitter failed to send message");
                                        runtimeException2 = runtimeException;
                                        if (runtimeException3 == null) {
                                            runtimeException3 = runtimeException2;
                                        } else {
                                            runtimeException3.addSuppressed(runtimeException2);
                                        }
                                        i28++;
                                        i = i2;
                                        bArr3 = bArr;
                                    }
                                } else {
                                    if ((apguVar16.b & 512) == 0) {
                                        bArr = bArr3;
                                        apguVar = apguVar16;
                                    } else if (((java.lang.Boolean) ahexVar.b.eZ()).booleanValue()) {
                                        defpackage.akzx akzxVarL5 = apguVar16.L();
                                        apgmVar = apguVar16.l;
                                        if (apgmVar == null) {
                                            apgmVar = defpackage.apgm.a;
                                        }
                                        alatVar = apgmVar.k;
                                        if (alatVar.isEmpty()) {
                                            bArr = bArr3;
                                        } else {
                                            akzxVarM = apgq.a.m();
                                            apglVar = bArr3;
                                            while (r12.hasNext()) {
                                                if (apglVar != 0) {
                                                    i3 = apglVar.e + 1;
                                                    bArr2 = bArr3;
                                                    if (i3 != apglVar2.d) {
                                                        akzxVarM.bM(0);
                                                        akzxVarM.bL(i3);
                                                    }
                                                } else {
                                                    bArr2 = bArr3;
                                                }
                                                akzxVarM.bM(apglVar2.c);
                                                akzxVarM.bL(apglVar2.d);
                                                apglVar = apglVar2;
                                                bArr3 = bArr2;
                                            }
                                            bArr = bArr3;
                                            if (apglVar != 0) {
                                                int i210 = apglVar.e + 1;
                                                akzxVarM.bM(0);
                                                akzxVarM.bL(i210);
                                            }
                                            defpackage.akzz akzzVar3 = (defpackage.akzz) apgmVar.L();
                                            akzzVar3.u();
                                            ((defpackage.apgm) akzzVar3.b).k = defpackage.albq.a;
                                            akzzVar3.u();
                                            defpackage.apgm apgmVar3 = (defpackage.apgm) akzzVar3.b;
                                            apgq apgqVarR2 = akzxVarM.r();
                                            j$.util.Objects.requireNonNull(apgqVarR2);
                                            apgmVar3.j = apgqVarR2;
                                            apgmVar3.b |= 128;
                                            apgmVar = (defpackage.apgm) akzzVar3.r();
                                        }
                                        akzxVarL5.u();
                                        defpackage.apgu apguVar18 = (defpackage.apgu) akzxVarL5.b;
                                        j$.util.Objects.requireNonNull(apgmVar);
                                        apguVar18.l = apgmVar;
                                        apguVar18.b |= 512;
                                        apguVar = (defpackage.apgu) akzxVarL5.r();
                                    } else {
                                        bArr = bArr3;
                                        apguVar = apguVar16;
                                    }
                                    defpackage.ajcq ajcqVarA2 = ((aevz) ahexVar.c).a();
                                    adot adotVar2 = new adot(ahexVar, apguVar, 5);
                                    ajbmVar = defpackage.ajbm.INSTANCE;
                                    ajcqVarG = defpackage.ajan.g(ajcqVarA2, adotVar2, ajbmVar);
                                    i2 = i;
                                    if (android.util.Log.isLoggable("ClearcutMetricXmitter", i2)) {
                                        defpackage.aiql.I(ajcqVarG, new jya(ahexVar, 18), ajbmVar);
                                    }
                                    ajcqVarF = ajcqVarG;
                                }
                                try {
                                    aiftVarD.i(ajcqVarF);
                                } catch (java.lang.RuntimeException e5) {
                                    e = e5;
                                    runtimeException = e;
                                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(runtimeException)).l("com/google/android/libraries/performance/primes/metrics/core/MetricDispatcher", "dispatch", '<', "MetricDispatcher.java")).v("One transmitter failed to send message");
                                    runtimeException2 = runtimeException;
                                    if (runtimeException3 == null) {
                                        runtimeException3 = runtimeException2;
                                    } else {
                                        runtimeException3.addSuppressed(runtimeException2);
                                    }
                                }
                            } catch (java.lang.RuntimeException e6) {
                                e = e6;
                                bArr = bArr3;
                            }
                            i28++;
                            i = i2;
                            bArr3 = bArr;
                        }
                        if (runtimeException3 != null) {
                            throw runtimeException3;
                        }
                        defpackage.ajcq ajcqVarB = defpackage.aiql.aa(aiftVarD.g()).b(new defpackage.aczf(8), defpackage.ajbm.INSTANCE);
                        aequVar.c.c.a();
                        return ajcqVarB;
                    }
                }
                return defpackage.ajcm.a;
            }
        };
        java.util.concurrent.Executor executor = this.g;
        defpackage.ajdk ajdkVar = new defpackage.ajdk(ajasVar);
        executor.execute(ajdkVar);
        return ajdkVar;
    }

    public final boolean b(java.lang.String str) {
        return !e(str).g();
    }

    public final boolean c() {
        defpackage.aevm aevmVar = this.c;
        return aevmVar.b && aevmVar.a.a;
    }

    public final int d() {
        int iAM = defpackage.a.aM(this.c.a.b.e);
        if (iAM == 0) {
            return 1;
        }
        return iAM;
    }

    public final defpackage.aevn e(java.lang.String str) {
        if (this.f.a) {
            return defpackage.aevn.b;
        }
        defpackage.aevm aevmVar = this.c;
        if (aevmVar.c.b()) {
            return defpackage.aevn.b;
        }
        return aevmVar.b ? aevmVar.a.d(str) : defpackage.aevn.b;
    }
}
