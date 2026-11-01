package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abtl implements defpackage.zzu {
    private final defpackage.absq a;
    private final defpackage.absv b;

    public abtl(android.content.Context context, defpackage.absv absvVar) {
        android.content.Context context2;
        context.getClass();
        android.content.Context applicationContext = context.getApplicationContext();
        defpackage.abto abtoVar = new defpackage.abto();
        defpackage.absp abspVar = new defpackage.absp();
        abspVar.a();
        if (applicationContext == null) {
            throw new java.lang.NullPointerException("Null context");
        }
        abspVar.a = applicationContext;
        abspVar.c = new defpackage.ahys(abtoVar);
        abspVar.a();
        if (abspVar.e == 1 && (context2 = abspVar.a) != null) {
            this.a = new defpackage.absq(context2, abspVar.b, abspVar.c, abspVar.d);
            this.b = absvVar;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (abspVar.a == null) {
            sb.append(" context");
        }
        if (abspVar.e == 0) {
            sb.append(" googlerOverridesCheckbox");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static defpackage.zzu b(android.content.Context context, defpackage.abso absoVar) {
        return new defpackage.abtl(context, new defpackage.absv(absoVar));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:105:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:107:0x02de  */
    /* JADX WARN: Code duplicated, block: B:109:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:112:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:133:0x0338 A[PHI: r7
      0x0338: PHI (r7v14 alcf) = (r7v12 alcf), (r7v26 alcf) binds: [B:131:0x0334, B:124:0x0318] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:135:0x033b A[Catch: all -> 0x03d2, TRY_ENTER, TryCatch #0 {, blocks: (B:115:0x02fb, B:118:0x0306, B:135:0x033b, B:150:0x03c6, B:138:0x0350, B:141:0x035b, B:143:0x036d, B:153:0x03c9, B:149:0x03a4, B:157:0x03cd, B:144:0x036e, B:146:0x037a, B:147:0x037c, B:148:0x03a3, B:119:0x0307, B:121:0x0313, B:122:0x0315, B:126:0x031b, B:129:0x0331), top: B:194:0x02fb, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x034e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0350 A[Catch: all -> 0x03d2, TryCatch #0 {, blocks: (B:115:0x02fb, B:118:0x0306, B:135:0x033b, B:150:0x03c6, B:138:0x0350, B:141:0x035b, B:143:0x036d, B:153:0x03c9, B:149:0x03a4, B:157:0x03cd, B:144:0x036e, B:146:0x037a, B:147:0x037c, B:148:0x03a3, B:119:0x0307, B:121:0x0313, B:122:0x0315, B:126:0x031b, B:129:0x0331), top: B:194:0x02fb, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x035a  */
    /* JADX WARN: Code duplicated, block: B:143:0x036d A[Catch: all -> 0x03d2, TRY_LEAVE, TryCatch #0 {, blocks: (B:115:0x02fb, B:118:0x0306, B:135:0x033b, B:150:0x03c6, B:138:0x0350, B:141:0x035b, B:143:0x036d, B:153:0x03c9, B:149:0x03a4, B:157:0x03cd, B:144:0x036e, B:146:0x037a, B:147:0x037c, B:148:0x03a3, B:119:0x0307, B:121:0x0313, B:122:0x0315, B:126:0x031b, B:129:0x0331), top: B:194:0x02fb, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x037a A[Catch: all -> 0x03ca, TryCatch #3 {, blocks: (B:144:0x036e, B:146:0x037a, B:147:0x037c, B:148:0x03a3), top: B:199:0x036e, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:168:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:173:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:175:0x03fb A[Catch: all -> 0x040f, TryCatch #6 {, blocks: (B:166:0x03d7, B:170:0x03ed, B:175:0x03fb, B:176:0x0402), top: B:204:0x03d7 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x0405  */
    /* JADX WARN: Code duplicated, block: B:187:0x0415  */
    /* JADX WARN: Code duplicated, block: B:199:0x036e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x03d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x02a6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.zzu
    public final boolean a(defpackage.akzc akzcVar) {
        boolean z;
        defpackage.ahyn ahynVarH;
        abta abthVar;
        int iAi;
        abtt abttVar;
        ?? r6;
        ?? r7;
        java.lang.Long l;
        long epochMilli;
        boolean z2;
        defpackage.alcf alcfVar;
        boolean z3;
        long j;
        int iAi2;
        defpackage.alcf alcfVarE;
        ?? r11;
        abtp abtpVar;
        long jB;
        int iA;
        int iA2;
        byte[] bArrD = akzcVar.D();
        absr absrVar = abss.a;
        if (android.os.Looper.getMainLooper().equals(android.os.Looper.myLooper())) {
            throw new android.os.NetworkOnMainThreadException();
        }
        defpackage.absq absqVar = this.a;
        abtj.a(absqVar, abss.b);
        if (anea.c()) {
            if (abst.a == null) {
                synchronized (abst.class) {
                    if (abst.a == null) {
                        abst.a = new abst();
                    }
                }
            }
            defpackage.absv absvVar = this.b;
            abst abstVar = abst.a;
            defpackage.abso absoVar = absvVar.a;
            absr absrVar2 = abss.a;
            defpackage.ahwt ahwtVar = defpackage.ahwt.a;
            java.lang.Integer numA = absoVar.a();
            if (numA != null) {
                numA.intValue();
                int iA3 = aldj.a(2);
                if (iA3 != 0) {
                    defpackage.akzx akzxVarM = aldm.a.m();
                    akzxVarM.u();
                    aldm aldmVar = akzxVarM.b;
                    aldmVar.c = java.lang.Integer.valueOf(iA3 - 1);
                    aldmVar.b = 1;
                    aldm aldmVarR = akzxVarM.r();
                    amdx amdxVar = abst.b;
                    if (abtn.a == null || abtn.c != abtn.a(absqVar, amdxVar)) {
                        synchronized (abtn.b) {
                            boolean zA = abtn.a(absqVar, amdxVar);
                            if (abtn.a == null || abtn.c != zA) {
                                if (zA) {
                                    anea aneaVar = anea.a;
                                    if (aneaVar.b().k() && (aneaVar.b().l() || j$.util.Objects.equals(absqVar.a.getPackageName(), "com.google.android.gms"))) {
                                        android.content.Context context = absqVar.a;
                                        java.util.List list = defpackage.zzd.m;
                                        ahynVarH = defpackage.ahyn.h(new defpackage.zza(context, "COLLECTION_BASIS_VERIFIER_CLIENT_ERROR_LOGGING").b());
                                    } else {
                                        ahynVarH = ahwtVar;
                                    }
                                    android.content.Context context2 = absqVar.a;
                                    java.util.List list2 = defpackage.zzd.m;
                                    abtn.a = new abtk(new defpackage.zza(context2, "COLLECTION_BASIS_VERIFIER").b(), ahynVarH, context2);
                                } else {
                                    abtn.a = new abtu();
                                }
                                abtn.c = zA;
                            }
                        }
                    }
                    abtm abtmVar = abtn.a;
                    ahwtVar.d(abtmVar);
                    abte abteVar = absrVar2.b;
                    int i = aldmVarR.b;
                    if (i == 1) {
                        abtb abtbVar = abteVar.b;
                        if (i != 1 || (iA2 = aldj.a(((java.lang.Integer) aldmVarR.c).intValue())) == 0) {
                            iA2 = 1;
                        }
                        abthVar = abtbVar.a(iA2, absqVar);
                    } else {
                        abthVar = new abth(abteVar.b, aldmVarR, absqVar);
                    }
                    if (abthVar.a()) {
                        z = true;
                    } else {
                        z = false;
                        if (defpackage.abts.m()) {
                            amdx amdxVar2 = abst.b;
                            if (abtr.a == null) {
                                synchronized (abtr.class) {
                                    if (abtr.a == null) {
                                        abtr.a = new abtr(absqVar, new defpackage.aazc(null), defpackage.ahyw.a);
                                    }
                                }
                            }
                            int i2 = absoVar.a;
                            int length = bArrD.length;
                            abtr abtrVar = abtr.a;
                            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
                            defpackage.akzz akzzVar = (defpackage.akzz) alev.a.m();
                            android.content.Context context3 = absqVar.a;
                            java.lang.String packageName = context3.getPackageName();
                            akzzVar.u();
                            alev alevVar = akzzVar.b;
                            j$.util.Objects.requireNonNull(packageName);
                            alevVar.b |= 1;
                            alevVar.c = packageName;
                            int i3 = amdxVar2.i(context3);
                            akzzVar.u();
                            alev alevVar2 = akzzVar.b;
                            alevVar2.b |= 2;
                            alevVar2.d = i3;
                            akzzVar.u();
                            alev alevVar3 = akzzVar.b;
                            alevVar3.b |= 4;
                            alevVar3.e = i2;
                            int i4 = true != anea.c() ? 1 : 2;
                            akzzVar.u();
                            alev alevVar4 = akzzVar.b;
                            alevVar4.b |= 4096;
                            alevVar4.m = i4;
                            akzzVar.u();
                            alev alevVar5 = akzzVar.b;
                            alevVar5.b |= 16;
                            alevVar5.g = length;
                            defpackage.aift aiftVar = new defpackage.aift(4);
                            java.util.Iterator itDescendingIterator = arrayDeque.descendingIterator();
                            while (itDescendingIterator.hasNext()) {
                                int i5 = ((absu) itDescendingIterator.next()).a;
                                aiftVar.i(0L);
                            }
                            defpackage.aify aifyVarG = aiftVar.g();
                            akzzVar.u();
                            alev alevVar6 = akzzVar.b;
                            defpackage.alan alanVar = alevVar6.k;
                            if (!alanVar.c()) {
                                alevVar6.k = defpackage.alad.I(alanVar);
                            }
                            defpackage.akyl.i(aifyVarG, alevVar6.k);
                            akzzVar.u();
                            alev alevVar7 = akzzVar.b;
                            alevVar7.h = akmr.g(3);
                            alevVar7.b |= 64;
                            akzzVar.u();
                            alev alevVar8 = akzzVar.b;
                            j$.util.Objects.requireNonNull(aldmVarR);
                            alevVar8.j = aldmVarR;
                            alevVar8.b |= 512;
                            if ((akzzVar.b.b & 64) == 0) {
                                akzzVar.u();
                                alev alevVar9 = akzzVar.b;
                                alevVar9.h = akmr.g(2);
                                alevVar9.b |= 64;
                            }
                            java.lang.Throwable th = (java.lang.Throwable) absqVar.b.d(new java.lang.Throwable());
                            java.lang.String strA = ahzn.a(th);
                            int length2 = strA.length();
                            aned.b();
                            anea aneaVar2 = anea.a;
                            long jC = aneaVar2.b().c();
                            if (jC < length2 && jC >= 0) {
                                length2 = (int) jC;
                            }
                            java.lang.String strSubstring = strA.substring(0, length2);
                            akzzVar.u();
                            alev alevVar10 = akzzVar.b;
                            j$.util.Objects.requireNonNull(strSubstring);
                            alevVar10.b |= 2048;
                            alevVar10.l = strSubstring;
                            alev alevVarR = akzzVar.r();
                            aned.b();
                            if (aneaVar2.b().i()) {
                                aned.b();
                                if (aneaVar2.b().j() || (iA = aldn.a(alevVarR.i)) == 0 || iA != 4) {
                                    aned.b();
                                    if (aneaVar2.b().g() || ((java.util.Random) abtrVar.d).nextDouble() < aneaVar2.b().a()) {
                                        long j2 = alevVarR.e;
                                        iAi = defpackage.a.ai(alevVarR.h);
                                        if (iAi == 0) {
                                            iAi = 2;
                                        }
                                        abttVar = new abtt(j2, iAi);
                                        long jL = defpackage.abts.l();
                                        r6 = abtrVar.c;
                                        if (r6 != 0 || abtrVar.f == null) {
                                            r7 = abtrVar.b;
                                            synchronized (r7) {
                                                l = (java.lang.Long) r7.get(abttVar);
                                                java.lang.Object obj = abtrVar.e;
                                                epochMilli = j$.time.Instant.now().toEpochMilli();
                                                if (l != null || jL <= 0 || l.longValue() + jL < epochMilli) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (z2) {
                                                    r7.put(abttVar, java.lang.Long.valueOf(epochMilli));
                                                }
                                            }
                                        } else {
                                            synchronized (r6) {
                                                long j3 = alevVarR.e;
                                                int iAi3 = defpackage.a.ai(alevVarR.h);
                                                if (iAi3 == 0) {
                                                    iAi3 = 2;
                                                }
                                                synchronized (r6) {
                                                    try {
                                                        abtp abtpVar2 = (abtp) r6.get(java.lang.Long.valueOf(j3));
                                                        if (abtpVar2 == null) {
                                                            alcfVar = defpackage.aldi.b;
                                                            if (jL <= 0) {
                                                                z3 = true;
                                                            }
                                                        } else {
                                                            long jG = akmr.g(iAi3);
                                                            alcfVar = defpackage.aldi.b;
                                                            defpackage.alcf alcfVar2 = (defpackage.alcf) abtpVar2.b.get(java.lang.Long.valueOf(jG));
                                                            if (alcfVar2 != null) {
                                                                alcfVar = alcfVar2;
                                                            }
                                                            if (jL <= 0) {
                                                                z3 = true;
                                                            }
                                                        }
                                                        if (true != z3) {
                                                            jB = defpackage.aldi.b(alcfVar) + jL;
                                                            java.lang.Object obj2 = abtrVar.e;
                                                            if (jB >= j$.time.Instant.now().toEpochMilli()) {
                                                                z2 = false;
                                                            } else {
                                                                j = alevVarR.e;
                                                                iAi2 = defpackage.a.ai(alevVarR.h);
                                                                if (iAi2 == 0) {
                                                                    iAi2 = 2;
                                                                }
                                                                java.lang.Object obj3 = abtrVar.e;
                                                                alcfVarE = defpackage.aldi.e(j$.time.Instant.now().toEpochMilli());
                                                                r11 = abtrVar.c;
                                                                if (r11 != 0) {
                                                                    synchronized (r11) {
                                                                        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
                                                                        abtpVar = (abtp) r11.get(lValueOf);
                                                                        if (abtpVar == null) {
                                                                            abtpVar = abtp.a;
                                                                        }
                                                                        defpackage.akzx akzxVarL = abtpVar.L();
                                                                        long jG2 = akmr.g(iAi2);
                                                                        j$.util.Objects.requireNonNull(alcfVarE);
                                                                        akzxVarL.u();
                                                                        akzxVarL.b.b().put(java.lang.Long.valueOf(jG2), alcfVarE);
                                                                        r11.put(lValueOf, akzxVarL.r());
                                                                    }
                                                                }
                                                                defpackage.akzx akzxVarM2 = abtq.a.m();
                                                                akzxVarM2.ag(abtrVar.c);
                                                                ((defpackage.afhf) abtrVar.f).a(new zqi(akzxVarM2.r(), 9), defpackage.ajbm.INSTANCE);
                                                                z2 = true;
                                                            }
                                                        } else {
                                                            j = alevVarR.e;
                                                            iAi2 = defpackage.a.ai(alevVarR.h);
                                                            if (iAi2 == 0) {
                                                                iAi2 = 2;
                                                            }
                                                            java.lang.Object obj4 = abtrVar.e;
                                                            alcfVarE = defpackage.aldi.e(j$.time.Instant.now().toEpochMilli());
                                                            r11 = abtrVar.c;
                                                            if (r11 != 0) {
                                                                synchronized (r11) {
                                                                    java.lang.Long lValueOf2 = java.lang.Long.valueOf(j);
                                                                    abtpVar = (abtp) r11.get(lValueOf2);
                                                                    if (abtpVar == null) {
                                                                        abtpVar = abtp.a;
                                                                    }
                                                                    defpackage.akzx akzxVarL2 = abtpVar.L();
                                                                    long jG3 = akmr.g(iAi2);
                                                                    j$.util.Objects.requireNonNull(alcfVarE);
                                                                    akzxVarL2.u();
                                                                    akzxVarL2.b.b().put(java.lang.Long.valueOf(jG3), alcfVarE);
                                                                    r11.put(lValueOf2, akzxVarL2.r());
                                                                }
                                                            }
                                                            defpackage.akzx akzxVarM3 = abtq.a.m();
                                                            akzxVarM3.ag(abtrVar.c);
                                                            ((defpackage.afhf) abtrVar.f).a(new zqi(akzxVarM3.r(), 9), defpackage.ajbm.INSTANCE);
                                                            z2 = true;
                                                        }
                                                    } catch (java.lang.Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                            z3 = false;
                                            if (true != z3) {
                                                jB = defpackage.aldi.b(alcfVar) + jL;
                                                java.lang.Object obj5 = abtrVar.e;
                                                if (jB >= j$.time.Instant.now().toEpochMilli()) {
                                                    z2 = false;
                                                } else {
                                                    j = alevVarR.e;
                                                    iAi2 = defpackage.a.ai(alevVarR.h);
                                                    if (iAi2 == 0) {
                                                        iAi2 = 2;
                                                    }
                                                    java.lang.Object obj6 = abtrVar.e;
                                                    alcfVarE = defpackage.aldi.e(j$.time.Instant.now().toEpochMilli());
                                                    r11 = abtrVar.c;
                                                    if (r11 != 0) {
                                                        synchronized (r11) {
                                                            java.lang.Long lValueOf3 = java.lang.Long.valueOf(j);
                                                            abtpVar = (abtp) r11.get(lValueOf3);
                                                            if (abtpVar == null) {
                                                                abtpVar = abtp.a;
                                                            }
                                                            defpackage.akzx akzxVarL3 = abtpVar.L();
                                                            long jG4 = akmr.g(iAi2);
                                                            j$.util.Objects.requireNonNull(alcfVarE);
                                                            akzxVarL3.u();
                                                            akzxVarL3.b.b().put(java.lang.Long.valueOf(jG4), alcfVarE);
                                                            r11.put(lValueOf3, akzxVarL3.r());
                                                        }
                                                    }
                                                    defpackage.akzx akzxVarM4 = abtq.a.m();
                                                    akzxVarM4.ag(abtrVar.c);
                                                    ((defpackage.afhf) abtrVar.f).a(new zqi(akzxVarM4.r(), 9), defpackage.ajbm.INSTANCE);
                                                    z2 = true;
                                                }
                                            } else {
                                                j = alevVarR.e;
                                                iAi2 = defpackage.a.ai(alevVarR.h);
                                                if (iAi2 == 0) {
                                                    iAi2 = 2;
                                                }
                                                java.lang.Object obj7 = abtrVar.e;
                                                alcfVarE = defpackage.aldi.e(j$.time.Instant.now().toEpochMilli());
                                                r11 = abtrVar.c;
                                                if (r11 != 0) {
                                                    synchronized (r11) {
                                                        java.lang.Long lValueOf4 = java.lang.Long.valueOf(j);
                                                        abtpVar = (abtp) r11.get(lValueOf4);
                                                        if (abtpVar == null) {
                                                            abtpVar = abtp.a;
                                                        }
                                                        defpackage.akzx akzxVarL4 = abtpVar.L();
                                                        long jG5 = akmr.g(iAi2);
                                                        j$.util.Objects.requireNonNull(alcfVarE);
                                                        akzxVarL4.u();
                                                        akzxVarL4.b.b().put(java.lang.Long.valueOf(jG5), alcfVarE);
                                                        r11.put(lValueOf4, akzxVarL4.r());
                                                    }
                                                }
                                                defpackage.akzx akzxVarM5 = abtq.a.m();
                                                akzxVarM5.ag(abtrVar.c);
                                                ((defpackage.afhf) abtrVar.f).a(new zqi(akzxVarM5.r(), 9), defpackage.ajbm.INSTANCE);
                                                z2 = true;
                                            }
                                        }
                                        if (z2) {
                                            abtmVar.a(alevVarR, defpackage.ahyn.h(th));
                                        }
                                    }
                                }
                            } else {
                                int iAi4 = defpackage.a.ai(alevVarR.h);
                                if (iAi4 == 0) {
                                    iAi4 = 2;
                                }
                                if (akmr.g(iAi4) != 6) {
                                    aned.b();
                                    if (aneaVar2.b().j()) {
                                        aned.b();
                                        if (aneaVar2.b().g()) {
                                            long j4 = alevVarR.e;
                                            iAi = defpackage.a.ai(alevVarR.h);
                                            if (iAi == 0) {
                                                iAi = 2;
                                            }
                                            abttVar = new abtt(j4, iAi);
                                            long jL2 = defpackage.abts.l();
                                            r6 = abtrVar.c;
                                            if (r6 != 0) {
                                                r7 = abtrVar.b;
                                                synchronized (r7) {
                                                    l = (java.lang.Long) r7.get(abttVar);
                                                    java.lang.Object obj8 = abtrVar.e;
                                                    epochMilli = j$.time.Instant.now().toEpochMilli();
                                                    if (l != null) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = true;
                                                    }
                                                    if (z2) {
                                                        r7.put(abttVar, java.lang.Long.valueOf(epochMilli));
                                                    }
                                                }
                                            } else {
                                                r7 = abtrVar.b;
                                                synchronized (r7) {
                                                    l = (java.lang.Long) r7.get(abttVar);
                                                    java.lang.Object obj9 = abtrVar.e;
                                                    epochMilli = j$.time.Instant.now().toEpochMilli();
                                                    if (l != null) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = true;
                                                    }
                                                    if (z2) {
                                                        r7.put(abttVar, java.lang.Long.valueOf(epochMilli));
                                                    }
                                                }
                                            }
                                            if (z2) {
                                                abtmVar.a(alevVarR, defpackage.ahyn.h(th));
                                            }
                                        } else {
                                            long j5 = alevVarR.e;
                                            iAi = defpackage.a.ai(alevVarR.h);
                                            if (iAi == 0) {
                                                iAi = 2;
                                            }
                                            abttVar = new abtt(j5, iAi);
                                            long jL3 = defpackage.abts.l();
                                            r6 = abtrVar.c;
                                            if (r6 != 0) {
                                                r7 = abtrVar.b;
                                                synchronized (r7) {
                                                    l = (java.lang.Long) r7.get(abttVar);
                                                    java.lang.Object obj10 = abtrVar.e;
                                                    epochMilli = j$.time.Instant.now().toEpochMilli();
                                                    if (l != null) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = true;
                                                    }
                                                    if (z2) {
                                                        r7.put(abttVar, java.lang.Long.valueOf(epochMilli));
                                                    }
                                                }
                                            } else {
                                                r7 = abtrVar.b;
                                                synchronized (r7) {
                                                    l = (java.lang.Long) r7.get(abttVar);
                                                    java.lang.Object obj11 = abtrVar.e;
                                                    epochMilli = j$.time.Instant.now().toEpochMilli();
                                                    if (l != null) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = true;
                                                    }
                                                    if (z2) {
                                                        r7.put(abttVar, java.lang.Long.valueOf(epochMilli));
                                                    }
                                                }
                                            }
                                            if (z2) {
                                                abtmVar.a(alevVarR, defpackage.ahyn.h(th));
                                            }
                                        }
                                    } else {
                                        aned.b();
                                        if (aneaVar2.b().g()) {
                                            long j6 = alevVarR.e;
                                            iAi = defpackage.a.ai(alevVarR.h);
                                            if (iAi == 0) {
                                                iAi = 2;
                                            }
                                            abttVar = new abtt(j6, iAi);
                                            long jL4 = defpackage.abts.l();
                                            r6 = abtrVar.c;
                                            if (r6 != 0) {
                                                r7 = abtrVar.b;
                                                synchronized (r7) {
                                                    l = (java.lang.Long) r7.get(abttVar);
                                                    java.lang.Object obj12 = abtrVar.e;
                                                    epochMilli = j$.time.Instant.now().toEpochMilli();
                                                    if (l != null) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = true;
                                                    }
                                                    if (z2) {
                                                        r7.put(abttVar, java.lang.Long.valueOf(epochMilli));
                                                    }
                                                }
                                            } else {
                                                r7 = abtrVar.b;
                                                synchronized (r7) {
                                                    l = (java.lang.Long) r7.get(abttVar);
                                                    java.lang.Object obj13 = abtrVar.e;
                                                    epochMilli = j$.time.Instant.now().toEpochMilli();
                                                    if (l != null) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = true;
                                                    }
                                                    if (z2) {
                                                        r7.put(abttVar, java.lang.Long.valueOf(epochMilli));
                                                    }
                                                }
                                            }
                                            if (z2) {
                                                abtmVar.a(alevVarR, defpackage.ahyn.h(th));
                                            }
                                        } else {
                                            long j7 = alevVarR.e;
                                            iAi = defpackage.a.ai(alevVarR.h);
                                            if (iAi == 0) {
                                                iAi = 2;
                                            }
                                            abttVar = new abtt(j7, iAi);
                                            long jL5 = defpackage.abts.l();
                                            r6 = abtrVar.c;
                                            if (r6 != 0) {
                                                r7 = abtrVar.b;
                                                synchronized (r7) {
                                                    l = (java.lang.Long) r7.get(abttVar);
                                                    java.lang.Object obj14 = abtrVar.e;
                                                    epochMilli = j$.time.Instant.now().toEpochMilli();
                                                    if (l != null) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = true;
                                                    }
                                                    if (z2) {
                                                        r7.put(abttVar, java.lang.Long.valueOf(epochMilli));
                                                    }
                                                }
                                            } else {
                                                r7 = abtrVar.b;
                                                synchronized (r7) {
                                                    l = (java.lang.Long) r7.get(abttVar);
                                                    java.lang.Object obj15 = abtrVar.e;
                                                    epochMilli = j$.time.Instant.now().toEpochMilli();
                                                    if (l != null) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = true;
                                                    }
                                                    if (z2) {
                                                        r7.put(abttVar, java.lang.Long.valueOf(epochMilli));
                                                    }
                                                }
                                            }
                                            if (z2) {
                                                abtmVar.a(alevVarR, defpackage.ahyn.h(th));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        aned.b();
        if (anea.a.b().n()) {
            return z;
        }
        return true;
    }

    public final java.lang.String toString() {
        return "CollectionBasisLogVerifier{collectionBasisContext=" + this.a + ", basis=" + this.b + '}';
    }
}
