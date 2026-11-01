package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aetv implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ aetv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0374  */
    /* JADX WARN: Code duplicated, block: B:98:0x03b3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [aepj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        defpackage.aify aifyVar;
        afma afmaVar;
        int i2 = 8;
        int i3 = 9;
        int i4 = 2;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                aetw aetwVar = (aetw) this.a;
                aett aettVar = (aett) aetwVar.c.a();
                aljf aljfVar = aetwVar.j;
                ((defpackage.aazc) aljfVar.a.a()).getClass();
                defpackage.ajcu ajcuVar = (defpackage.ajcu) aljfVar.d.a();
                ajcuVar.getClass();
                aeok aeokVar = (aeok) aljfVar.b.a();
                aeokVar.getClass();
                aettVar.getClass();
                aetwVar.i = new aetx(ajcuVar, aeokVar, (defpackage.aoin) aljfVar.c, aettVar, aetwVar.e, aetwVar.d);
                if (aetwVar.g) {
                    aetwVar.i.b();
                    return;
                }
                return;
            case 1:
                final defpackage.aerx aerxVar = (defpackage.aerx) this.a;
                defpackage.aiql.E(new defpackage.ajas() { // from class: aerw
                    /* JADX WARN: Code duplicated, block: B:217:0x05d8 A[Catch: all -> 0x07c2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x07c2, blocks: (B:188:0x0535, B:191:0x0544, B:199:0x0572, B:202:0x058b, B:205:0x05ac, B:217:0x05d8), top: B:369:0x0535 }] */
                    /* JADX WARN: Code duplicated, block: B:219:0x05e7  */
                    /* JADX WARN: Code duplicated, block: B:221:0x05ea A[Catch: all -> 0x06bf, TRY_ENTER, TryCatch #23 {all -> 0x06bf, blocks: (B:175:0x04cc, B:177:0x04de, B:178:0x04f4, B:193:0x054a, B:195:0x0564, B:196:0x056a, B:201:0x0585, B:204:0x0598, B:207:0x05b8, B:213:0x05cb, B:215:0x05cf, B:221:0x05ea, B:225:0x05f3, B:234:0x06a9, B:227:0x0619, B:229:0x0647, B:231:0x0672, B:232:0x0678, B:233:0x06a8, B:210:0x05c3), top: B:415:0x04cc }] */
                    /* JADX WARN: Code duplicated, block: B:223:0x05f0  */
                    /* JADX WARN: Code duplicated, block: B:225:0x05f3 A[Catch: all -> 0x06bf, LOOP:6: B:224:0x05f1->B:225:0x05f3, LOOP_END, TryCatch #23 {all -> 0x06bf, blocks: (B:175:0x04cc, B:177:0x04de, B:178:0x04f4, B:193:0x054a, B:195:0x0564, B:196:0x056a, B:201:0x0585, B:204:0x0598, B:207:0x05b8, B:213:0x05cb, B:215:0x05cf, B:221:0x05ea, B:225:0x05f3, B:234:0x06a9, B:227:0x0619, B:229:0x0647, B:231:0x0672, B:232:0x0678, B:233:0x06a8, B:210:0x05c3), top: B:415:0x04cc }] */
                    /* JADX WARN: Code duplicated, block: B:227:0x0619 A[Catch: all -> 0x06bf, TryCatch #23 {all -> 0x06bf, blocks: (B:175:0x04cc, B:177:0x04de, B:178:0x04f4, B:193:0x054a, B:195:0x0564, B:196:0x056a, B:201:0x0585, B:204:0x0598, B:207:0x05b8, B:213:0x05cb, B:215:0x05cf, B:221:0x05ea, B:225:0x05f3, B:234:0x06a9, B:227:0x0619, B:229:0x0647, B:231:0x0672, B:232:0x0678, B:233:0x06a8, B:210:0x05c3), top: B:415:0x04cc }] */
                    /* JADX WARN: Code duplicated, block: B:229:0x0647 A[Catch: all -> 0x06bf, TryCatch #23 {all -> 0x06bf, blocks: (B:175:0x04cc, B:177:0x04de, B:178:0x04f4, B:193:0x054a, B:195:0x0564, B:196:0x056a, B:201:0x0585, B:204:0x0598, B:207:0x05b8, B:213:0x05cb, B:215:0x05cf, B:221:0x05ea, B:225:0x05f3, B:234:0x06a9, B:227:0x0619, B:229:0x0647, B:231:0x0672, B:232:0x0678, B:233:0x06a8, B:210:0x05c3), top: B:415:0x04cc }] */
                    /* JADX WARN: Code duplicated, block: B:231:0x0672 A[Catch: all -> 0x06bf, LOOP:7: B:228:0x0645->B:231:0x0672, LOOP_END, TryCatch #23 {all -> 0x06bf, blocks: (B:175:0x04cc, B:177:0x04de, B:178:0x04f4, B:193:0x054a, B:195:0x0564, B:196:0x056a, B:201:0x0585, B:204:0x0598, B:207:0x05b8, B:213:0x05cb, B:215:0x05cf, B:221:0x05ea, B:225:0x05f3, B:234:0x06a9, B:227:0x0619, B:229:0x0647, B:231:0x0672, B:232:0x0678, B:233:0x06a8, B:210:0x05c3), top: B:415:0x04cc }] */
                    /* JADX WARN: Code duplicated, block: B:238:0x06c2  */
                    /* JADX WARN: Code duplicated, block: B:240:0x06db A[Catch: all -> 0x07bc, TryCatch #19 {all -> 0x07bc, blocks: (B:258:0x07a6, B:241:0x06e1, B:242:0x06e9, B:244:0x06ef, B:246:0x0701, B:248:0x0724, B:249:0x073a, B:251:0x076d, B:252:0x0773, B:254:0x0790, B:255:0x0796, B:256:0x079d, B:239:0x06c6, B:240:0x06db), top: B:407:0x07a6 }] */
                    /* JADX WARN: Code duplicated, block: B:296:0x0819  */
                    /* JADX WARN: Code duplicated, block: B:298:0x081d  */
                    /* JADX WARN: Code duplicated, block: B:300:0x0821  */
                    /* JADX WARN: Code duplicated, block: B:302:0x0825  */
                    /* JADX WARN: Code duplicated, block: B:304:0x0829  */
                    /* JADX WARN: Code duplicated, block: B:306:0x082d  */
                    /* JADX WARN: Code duplicated, block: B:308:0x0831  */
                    /* JADX WARN: Code duplicated, block: B:310:0x0835  */
                    /* JADX WARN: Code duplicated, block: B:312:0x0839  */
                    /* JADX WARN: Code duplicated, block: B:313:0x0859  */
                    /* JADX WARN: Code duplicated, block: B:314:0x085c  */
                    /* JADX WARN: Code duplicated, block: B:315:0x085f  */
                    /* JADX WARN: Code duplicated, block: B:316:0x0862  */
                    /* JADX WARN: Code duplicated, block: B:317:0x0865  */
                    /* JADX WARN: Code duplicated, block: B:318:0x0868  */
                    /* JADX WARN: Code duplicated, block: B:319:0x086b  */
                    /* JADX WARN: Code duplicated, block: B:320:0x086e  */
                    /* JADX WARN: Code duplicated, block: B:322:0x0872  */
                    /* JADX WARN: Code duplicated, block: B:325:0x089f  */
                    /* JADX WARN: Code duplicated, block: B:326:0x08a7  */
                    /* JADX WARN: Code duplicated, block: B:328:0x08cd  */
                    /* JADX WARN: Code duplicated, block: B:329:0x08ea  */
                    /* JADX WARN: Code duplicated, block: B:331:0x08f5  */
                    /* JADX WARN: Code duplicated, block: B:332:0x0912  */
                    /* JADX WARN: Code duplicated, block: B:335:0x0919  */
                    /* JADX WARN: Code duplicated, block: B:337:0x0930  */
                    /* JADX WARN: Code duplicated, block: B:338:0x094c  */
                    /* JADX WARN: Code duplicated, block: B:352:0x09a2  */
                    /* JADX WARN: Code duplicated, block: B:383:0x07e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:399:0x09be A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:453:0x0678 A[SYNTHETIC] */
                    /* JADX WARN: Type inference failed for: r5v3, types: [aoin, java.lang.Object] */
                    @Override // defpackage.ajas
                    public final defpackage.ajcq a() throws java.lang.Throwable {
                        int i5;
                        java.lang.String str;
                        java.util.Iterator it;
                        android.app.ApplicationExitInfo applicationExitInfo;
                        int i6;
                        int iM$3;
                        defpackage.aevd aevdVar;
                        int iM;
                        defpackage.alcf alcfVarE;
                        java.io.File file;
                        java.io.File[] fileArrListFiles;
                        int i7;
                        java.io.File file2;
                        java.io.File file3;
                        defpackage.ajcq ajcqVarZ;
                        java.io.FileInputStream fileInputStream;
                        java.io.File file4;
                        java.util.List listJ;
                        java.io.File file5;
                        long j;
                        long j2;
                        java.lang.String str2;
                        java.io.InputStream inputStream;
                        java.lang.Throwable th;
                        int i8;
                        boolean zEquals;
                        java.util.Map.Entry[] entryArr;
                        int length;
                        aihl aihlVarA;
                        java.lang.Object[] objArr;
                        java.lang.Object[] objArr2;
                        java.lang.Object[] objArr3;
                        java.lang.Object[] objArr4;
                        java.lang.Object key;
                        int i9;
                        java.util.Map.Entry entry;
                        java.util.Map.Entry entry2;
                        java.util.Map.Entry[] entryArr2;
                        java.lang.Object key2;
                        int i10;
                        int i11;
                        alfl alflVarR;
                        java.lang.Throwable th2;
                        java.io.InputStream inputStream2;
                        defpackage.akzx akzxVarM;
                        akzb akzbVar;
                        java.util.zip.GZIPOutputStream gZIPOutputStream;
                        android.app.ApplicationExitInfo.AnrInfo anrInfoM;
                        defpackage.aerx aerxVar2 = aerxVar;
                        defpackage.amwu amwuVar = aerxVar2.e;
                        if (!((defpackage.aert) amwuVar.a()).b()) {
                            return defpackage.ajcm.a;
                        }
                        if (!ft$.ExternalSyntheticApiModelOutline0.m().equals(java.lang.String.valueOf(aerxVar2.b.getPackageName()).concat(java.lang.String.valueOf(((defpackage.aert) amwuVar.a()).a)))) {
                            return defpackage.ajcm.a;
                        }
                        if (!((java.lang.Boolean) aerxVar2.f.a()).booleanValue()) {
                            return defpackage.ajcm.a;
                        }
                        defpackage.aerv aervVar = aerxVar2.i;
                        defpackage.aoin aoinVar = aerxVar2.d;
                        java.lang.String string = ((android.content.SharedPreferences) aoinVar.a()).getString("lastExitProcessName", null);
                        long j3 = ((android.content.SharedPreferences) aoinVar.a()).getLong("lastExitTimestamp", -1L);
                        android.content.Context context = aervVar.a;
                        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
                        defpackage.ahvr.ci(activityManager);
                        java.util.List listM = baa$.ExternalSyntheticApiModelOutline1.m(activityManager, context.getPackageName(), 0, 0);
                        int i12 = 4;
                        defpackage.aift aiftVar = new defpackage.aift(4);
                        java.util.Iterator it2 = listM.iterator();
                        while (it2.hasNext()) {
                            android.app.ApplicationExitInfo applicationExitInfoM = baa$.ExternalSyntheticApiModelOutline1.m(it2.next());
                            if (baa$.ExternalSyntheticApiModelOutline1.m(applicationExitInfoM).equals(string) && baa$.ExternalSyntheticApiModelOutline1.m(applicationExitInfoM) == j3) {
                                defpackage.aerx aerxVar3 = aerxVar2;
                                defpackage.ajcq ajcqVarV = defpackage.aiql.v(aiftVar.g());
                                defpackage.aeqw aeqwVar = new defpackage.aeqw(2);
                                defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                                return defpackage.ajan.g(defpackage.ajan.f(ajcqVarV, aeqwVar, ajbmVar), new defpackage.adfd(aerxVar3, 12), ajbmVar);
                            }
                            defpackage.akzx akzxVarM2 = defpackage.apef.a.m();
                            java.lang.String strM = baa$.ExternalSyntheticApiModelOutline1.m(applicationExitInfoM);
                            akzxVarM2.u();
                            defpackage.apef apefVar = (defpackage.apef) akzxVarM2.b;
                            j$.util.Objects.requireNonNull(strM);
                            apefVar.b |= 1;
                            apefVar.c = strM;
                            int iM$1 = baa$.ExternalSyntheticApiModelOutline1.m$1(applicationExitInfoM);
                            akzxVarM2.u();
                            defpackage.apef apefVar2 = (defpackage.apef) akzxVarM2.b;
                            apefVar2.b |= i12;
                            apefVar2.e = iM$1;
                            long jM = baa$.ExternalSyntheticApiModelOutline1.m(applicationExitInfoM);
                            akzxVarM2.u();
                            defpackage.apef apefVar3 = (defpackage.apef) akzxVarM2.b;
                            apefVar3.b |= 16;
                            apefVar3.g = jM;
                            long jM$1 = baa$.ExternalSyntheticApiModelOutline1.m$1(applicationExitInfoM);
                            akzxVarM2.u();
                            defpackage.apef apefVar4 = (defpackage.apef) akzxVarM2.b;
                            apefVar4.b |= 64;
                            apefVar4.i = jM$1;
                            long jM$2 = baa$.ExternalSyntheticApiModelOutline1.m$2(applicationExitInfoM);
                            akzxVarM2.u();
                            defpackage.apef apefVar5 = (defpackage.apef) akzxVarM2.b;
                            apefVar5.b |= 128;
                            apefVar5.j = jM$2;
                            boolean zM = baa$.ExternalSyntheticApiModelOutline1.m();
                            akzxVarM2.u();
                            defpackage.apef apefVar6 = (defpackage.apef) akzxVarM2.b;
                            apefVar6.b |= 256;
                            apefVar6.k = zM;
                            int iM$2 = baa$.ExternalSyntheticApiModelOutline1.m$2(applicationExitInfoM);
                            java.lang.String strM$1 = baa$.ExternalSyntheticApiModelOutline1.m$1(applicationExitInfoM);
                            int i13 = 9;
                            long j4 = j3;
                            switch (iM$2) {
                                case 0:
                                    i5 = 15;
                                    break;
                                case 1:
                                    i5 = 2;
                                    break;
                                case 2:
                                    i5 = 3;
                                    break;
                                case 3:
                                    i5 = 4;
                                    break;
                                case 4:
                                    i5 = 5;
                                    break;
                                case 5:
                                    i5 = 6;
                                    break;
                                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                    i5 = 7;
                                    break;
                                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                                    i5 = 8;
                                    break;
                                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                                    i5 = 9;
                                    break;
                                case 9:
                                    i5 = 10;
                                    break;
                                case 10:
                                    i5 = 11;
                                    j4 = j3;
                                    break;
                                case 11:
                                    i5 = 12;
                                    break;
                                case 12:
                                    i5 = 13;
                                    j4 = j3;
                                    break;
                                case 13:
                                    i5 = (strM$1 == null || !strM$1.contains("MemoryLimiter:AnonSwap")) ? 14 : 18;
                                    j4 = j3;
                                    break;
                                case 14:
                                    i5 = 100;
                                    j4 = j3;
                                    break;
                                case 15:
                                    i5 = 16;
                                    break;
                                case 16:
                                    i5 = 17;
                                    j4 = j3;
                                    break;
                                default:
                                    j4 = j3;
                                    ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "toReasonEnum", 489, "ApplicationExitInfoCaptureImpl.java")).y("Unknown ApplicationExitInfo Reason: %s", new aepb(iM$2));
                                    i5 = 0;
                                    break;
                            }
                            if (i5 != 0) {
                                akzxVarM2.u();
                                defpackage.apef apefVar7 = (defpackage.apef) akzxVarM2.b;
                                int i14 = i5 - 1;
                                apefVar7.d = i14;
                                apefVar7.b |= 2;
                                if (i14 != 5) {
                                    if (i14 == 6 && android.os.Build.VERSION.SDK_INT >= 33) {
                                        try {
                                            java.io.InputStream inputStreamM = baa$.ExternalSyntheticApiModelOutline1.m(applicationExitInfoM);
                                            try {
                                                java.lang.String strM$2 = baa$.ExternalSyntheticApiModelOutline1.m$1(applicationExitInfoM);
                                                if (inputStreamM != null) {
                                                    if (defpackage.ahvr.cp(strM$2)) {
                                                        inputStreamM.close();
                                                    } else {
                                                        defpackage.akzc akzcVarF = defpackage.akzc.F(inputStreamM);
                                                        defpackage.aoin aoinVar2 = aervVar.f;
                                                        try {
                                                            if (((java.lang.Long) aoinVar2.a()).longValue() >= 0) {
                                                                inputStream2 = inputStreamM;
                                                                try {
                                                                    if (akzcVarF.c() > ((java.lang.Long) aoinVar2.a()).longValue()) {
                                                                    }
                                                                    inputStream2.close();
                                                                } catch (java.lang.Throwable th3) {
                                                                    th = th3;
                                                                    java.lang.Throwable th4 = th;
                                                                    if (inputStream2 != null) {
                                                                        try {
                                                                            inputStream2.close();
                                                                        } catch (java.lang.Throwable th5) {
                                                                            th4.addSuppressed(th5);
                                                                        }
                                                                    }
                                                                    throw th4;
                                                                }
                                                            } else {
                                                                inputStream2 = inputStreamM;
                                                            }
                                                            akzcVarF.m(gZIPOutputStream);
                                                            gZIPOutputStream.close();
                                                            defpackage.akzc akzcVarB = akzbVar.b();
                                                            defpackage.aoin aoinVar3 = aervVar.g;
                                                            if (((java.lang.Long) aoinVar3.a()).longValue() < 0 || akzcVarB.c() <= ((java.lang.Long) aoinVar3.a()).longValue()) {
                                                                akzxVarM.u();
                                                                aped apedVar = akzxVarM.b;
                                                                j$.util.Objects.requireNonNull(akzcVarB);
                                                                apedVar.c = 5;
                                                                apedVar.d = akzcVarB;
                                                                aped apedVarR = akzxVarM.r();
                                                                akzxVarM2.u();
                                                                defpackage.apef apefVar8 = (defpackage.apef) akzxVarM2.b;
                                                                j$.util.Objects.requireNonNull(apedVarR);
                                                                apefVar8.l = apedVarR;
                                                                apefVar8.b |= 512;
                                                            }
                                                            inputStream2.close();
                                                        } catch (java.lang.Throwable th6) {
                                                            try {
                                                                gZIPOutputStream.close();
                                                            } catch (java.lang.Throwable th7) {
                                                                th6.addSuppressed(th7);
                                                            }
                                                            throw th6;
                                                        }
                                                        akzxVarM = aped.a.m();
                                                        akzxVarM.u();
                                                        aped apedVar2 = akzxVarM.b;
                                                        j$.util.Objects.requireNonNull(strM$2);
                                                        apedVar2.b |= 1;
                                                        apedVar2.e = strM$2;
                                                        if (android.os.Build.VERSION.SDK_INT >= 37 && ((java.lang.Boolean) aervVar.e.a()).booleanValue() && (anrInfoM = deh$.ExternalSyntheticApiModelOutline0.m(applicationExitInfoM)) != null) {
                                                            boolean zM2 = deh$.ExternalSyntheticApiModelOutline0.m(anrInfoM);
                                                            akzxVarM.u();
                                                            aped apedVar3 = akzxVarM.b;
                                                            apedVar3.b |= 8;
                                                            apedVar3.f = zM2;
                                                        }
                                                        akzbVar = new akzb(128);
                                                        gZIPOutputStream = new java.util.zip.GZIPOutputStream(akzbVar);
                                                    }
                                                }
                                            } catch (java.lang.Throwable th8) {
                                                th = th8;
                                                inputStream2 = inputStreamM;
                                            }
                                        } catch (java.io.IOException e) {
                                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(e)).l("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "maybeSetAnrDiagnostic", (char) 416, "ApplicationExitInfoCaptureImpl.java")).v("Failed to read ANR trace");
                                        }
                                    }
                                } else if (android.os.Build.VERSION.SDK_INT >= 31 && ((java.lang.Boolean) aervVar.m.a()).booleanValue()) {
                                    try {
                                        java.io.InputStream inputStreamM2 = baa$.ExternalSyntheticApiModelOutline1.m(applicationExitInfoM);
                                        if (inputStreamM2 == null) {
                                            try {
                                                ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "maybeSetNativeCrashInfo", 354, "ApplicationExitInfoCaptureImpl.java")).v("Native crash tombstone input stream is null");
                                            } catch (java.lang.Throwable th9) {
                                                th = th9;
                                                str = string;
                                                str2 = "ApplicationExitInfoCaptureImpl.java";
                                                inputStream = inputStreamM2;
                                                it = it2;
                                                applicationExitInfo = applicationExitInfoM;
                                                i6 = 0;
                                                th = th;
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (java.lang.Throwable th10) {
                                                        th.addSuppressed(th10);
                                                    }
                                                }
                                                throw th;
                                            }
                                        } else {
                                            ammk ammkVarA = defpackage.alad.A(ammk.a, inputStreamM2, defpackage.akzq.a());
                                            long jLongValue = ((java.lang.Long) aervVar.n.a()).longValue();
                                            int i15 = ammkVarA.c;
                                            str = string;
                                            try {
                                                ammj ammjVar = (ammj) j$.util.DesugarCollections.unmodifiableMap(ammkVarA.f).get(java.lang.Integer.valueOf(i15));
                                                if (ammjVar == null) {
                                                    ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "toNativeCrashInfo", 563, "ApplicationExitInfoCaptureImpl.java")).w("Tombstone missing crashed thread %d", i15);
                                                    aerxVar2 = aerxVar2;
                                                    str2 = "ApplicationExitInfoCaptureImpl.java";
                                                    inputStream = inputStreamM2;
                                                    it = it2;
                                                    applicationExitInfo = applicationExitInfoM;
                                                    alflVarR = null;
                                                    i6 = 0;
                                                } else {
                                                    defpackage.akzx akzxVarM3 = alfl.a.m();
                                                    str2 = "ApplicationExitInfoCaptureImpl.java";
                                                    try {
                                                        ammi ammiVar = ammkVarA.d;
                                                        if (ammiVar == null) {
                                                            ammiVar = ammi.a;
                                                        }
                                                        int i16 = ammiVar.b;
                                                        akzxVarM3.u();
                                                        inputStream = inputStreamM2;
                                                        try {
                                                            alfl alflVar = akzxVarM3.b;
                                                            it = it2;
                                                            try {
                                                                alflVar.b |= 1;
                                                                alflVar.c = i16;
                                                                ammi ammiVar2 = ammkVarA.d;
                                                                if (ammiVar2 == null) {
                                                                    ammiVar2 = ammi.a;
                                                                }
                                                                int i17 = ammiVar2.c;
                                                                akzxVarM3.u();
                                                                alfl alflVar2 = akzxVarM3.b;
                                                                alflVar2.b |= 2;
                                                                alflVar2.d = i17;
                                                                int iAa = defpackage.a.aa(ammkVarA.b);
                                                                if (iAa == 0) {
                                                                    iAa = 1;
                                                                }
                                                                int i18 = iAa - 2;
                                                                if (i18 == 0) {
                                                                    i8 = 2;
                                                                } else if (i18 == 1) {
                                                                    i8 = 3;
                                                                } else if (i18 == 2) {
                                                                    i8 = 4;
                                                                } else if (i18 != 3) {
                                                                    i8 = i18 != 4 ? 1 : 6;
                                                                } else {
                                                                    i8 = 5;
                                                                }
                                                                akzxVarM3.u();
                                                                alfl alflVar3 = akzxVarM3.b;
                                                                alflVar3.f = i8 - 1;
                                                                alflVar3.b |= 8;
                                                                ammi ammiVar3 = ammkVarA.d;
                                                                if ((ammiVar3 == null ? ammi.a : ammiVar3).d) {
                                                                    if (ammiVar3 == null) {
                                                                        ammiVar3 = ammi.a;
                                                                    }
                                                                    long j5 = ammiVar3.e;
                                                                    akzxVarM3.u();
                                                                    alfl alflVar4 = akzxVarM3.b;
                                                                    alflVar4.b |= 4;
                                                                    alflVar4.e = j5;
                                                                }
                                                                alfi alfiVar = alfi.a;
                                                                defpackage.akzx akzxVarM4 = alfiVar.m();
                                                                akzxVarM4.u();
                                                                alfi alfiVar2 = akzxVarM4.b;
                                                                alfiVar2.b |= 2;
                                                                alfiVar2.d = i15;
                                                                if (!ammjVar.b.isEmpty()) {
                                                                    java.lang.String str3 = ammjVar.b;
                                                                    akzxVarM4.u();
                                                                    alfi alfiVar3 = akzxVarM4.b;
                                                                    j$.util.Objects.requireNonNull(str3);
                                                                    alfiVar3.b |= 1;
                                                                    alfiVar3.c = str3;
                                                                }
                                                                alfi alfiVarR = akzxVarM4.r();
                                                                akzxVarM3.u();
                                                                alfl alflVar5 = akzxVarM3.b;
                                                                j$.util.Objects.requireNonNull(alfiVarR);
                                                                alflVar5.j = alfiVarR;
                                                                alflVar5.b |= 128;
                                                                java.util.Collection collectionValues = j$.util.DesugarCollections.unmodifiableMap(ammkVarA.f).values();
                                                                defpackage.aigb aigbVar = new defpackage.aigb(4);
                                                                java.util.HashSet hashSet = new java.util.HashSet();
                                                                java.util.Iterator it3 = collectionValues.iterator();
                                                                while (it3.hasNext()) {
                                                                    try {
                                                                        java.util.Iterator it4 = ((ammj) it3.next()).c.iterator();
                                                                        while (it4.hasNext()) {
                                                                            alfiVar = alfiVar;
                                                                            ammh ammhVar = (ammh) it4.next();
                                                                            it3 = it3;
                                                                            if (!ammhVar.e.isEmpty()) {
                                                                                int size = hashSet.size();
                                                                                java.util.Iterator it5 = it4;
                                                                                if (hashSet.add(ammhVar.e)) {
                                                                                    defpackage.akzx akzxVarM5 = alfj.a.m();
                                                                                    java.util.HashSet hashSet2 = hashSet;
                                                                                    java.lang.String str4 = ammhVar.e;
                                                                                    akzxVarM5.u();
                                                                                    applicationExitInfo = applicationExitInfoM;
                                                                                    try {
                                                                                        alfj alfjVar = akzxVarM5.b;
                                                                                        j$.util.Objects.requireNonNull(str4);
                                                                                        aerxVar2 = aerxVar2;
                                                                                        try {
                                                                                            alfjVar.b |= 2;
                                                                                            alfjVar.d = str4;
                                                                                            if (!ammhVar.d.isEmpty()) {
                                                                                                java.lang.String str5 = ammhVar.d;
                                                                                                akzxVarM5.u();
                                                                                                alfj alfjVar2 = akzxVarM5.b;
                                                                                                j$.util.Objects.requireNonNull(str5);
                                                                                                alfjVar2.b |= 1;
                                                                                                alfjVar2.c = str5;
                                                                                            }
                                                                                            aigbVar.i(ammhVar.e, new amwp(akzxVarM5.r(), size));
                                                                                            it4 = it5;
                                                                                            hashSet = hashSet2;
                                                                                            applicationExitInfoM = applicationExitInfo;
                                                                                            aerxVar2 = aerxVar2;
                                                                                        } catch (java.lang.Throwable th11) {
                                                                                            th2 = th11;
                                                                                            th = th2;
                                                                                            i6 = 0;
                                                                                            if (inputStream != null) {
                                                                                                inputStream.close();
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (java.lang.Throwable th12) {
                                                                                        th2 = th12;
                                                                                        aerxVar2 = aerxVar2;
                                                                                        th = th2;
                                                                                        i6 = 0;
                                                                                        if (inputStream != null) {
                                                                                            inputStream.close();
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                } else {
                                                                                    it4 = it5;
                                                                                }
                                                                            }
                                                                        }
                                                                    } catch (java.lang.Throwable th13) {
                                                                        th2 = th13;
                                                                        aerxVar2 = aerxVar2;
                                                                        applicationExitInfo = applicationExitInfoM;
                                                                    }
                                                                }
                                                                aerxVar2 = aerxVar2;
                                                                alfi alfiVar4 = alfiVar;
                                                                applicationExitInfo = applicationExitInfoM;
                                                                try {
                                                                    defpackage.aigf aigfVarE = aigbVar.e(true);
                                                                    try {
                                                                        defpackage.ailk ailkVarListIterator = ((defpackage.aify) aigfVarE.values()).listIterator(0);
                                                                        while (ailkVarListIterator.hasNext()) {
                                                                            java.lang.Object obj = ((amwp) ailkVarListIterator.next()).b;
                                                                            akzxVarM3.u();
                                                                            alfl alflVar6 = akzxVarM3.b;
                                                                            j$.util.Objects.requireNonNull(obj);
                                                                            defpackage.alat alatVar = alflVar6.h;
                                                                            if (!alatVar.c()) {
                                                                                alflVar6.h = defpackage.alad.J(alatVar);
                                                                            }
                                                                            alflVar6.h.add(obj);
                                                                        }
                                                                        defpackage.aify aifyVarA = defpackage.aerv.a(ammjVar, aigfVarE, jLongValue);
                                                                        akzxVarM3.u();
                                                                        alfl alflVar7 = akzxVarM3.b;
                                                                        defpackage.alat alatVar2 = alflVar7.g;
                                                                        if (!alatVar2.c()) {
                                                                            alflVar7.g = defpackage.alad.J(alatVar2);
                                                                        }
                                                                        defpackage.akyl.i(aifyVarA, alflVar7.g);
                                                                        if (!ammkVarA.e.isEmpty()) {
                                                                            java.lang.String str6 = ammkVarA.e;
                                                                            akzxVarM3.u();
                                                                            alfl alflVar8 = akzxVarM3.b;
                                                                            j$.util.Objects.requireNonNull(str6);
                                                                            alflVar8.b |= 64;
                                                                            alflVar8.i = str6;
                                                                        }
                                                                        aihl aihlVarUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(ammkVarA.f);
                                                                        java.util.Comparator comparator = aihl.b;
                                                                        if (aihlVarUnmodifiableMap instanceof java.util.SortedMap) {
                                                                            java.util.Comparator comparator2 = ((java.util.SortedMap) aihlVarUnmodifiableMap).comparator();
                                                                            zEquals = comparator2 == null ? true : comparator.equals(comparator2);
                                                                        } else {
                                                                            zEquals = false;
                                                                        }
                                                                        if (zEquals && (aihlVarUnmodifiableMap instanceof aihl)) {
                                                                            aihlVarA = aihlVarUnmodifiableMap;
                                                                            if (aihlVarA.fr()) {
                                                                                entryArr = (java.util.Map.Entry[]) defpackage.ahvr.bt(aihlVarUnmodifiableMap.entrySet(), aihl.a);
                                                                                length = entryArr.length;
                                                                                if (length != 0) {
                                                                                    i6 = 0;
                                                                                    aihlVarA = aihl.a(comparator);
                                                                                } else if (length != 1) {
                                                                                    objArr = new java.lang.Object[length];
                                                                                    objArr2 = new java.lang.Object[length];
                                                                                    if (zEquals) {
                                                                                        i11 = 0;
                                                                                        while (i11 < length) {
                                                                                            java.util.Map.Entry entry3 = (java.util.Map.Entry) j$.util.Objects.requireNonNull(entryArr[i11]);
                                                                                            int i19 = i11;
                                                                                            java.lang.Object key3 = entry3.getKey();
                                                                                            java.lang.Object[] objArr5 = objArr2;
                                                                                            java.lang.Object value = entry3.getValue();
                                                                                            defpackage.ahvr.bB(key3, value);
                                                                                            objArr[i19] = key3;
                                                                                            objArr5[i19] = value;
                                                                                            i11 = i19 + 1;
                                                                                            objArr2 = objArr5;
                                                                                        }
                                                                                        objArr3 = objArr2;
                                                                                        objArr4 = objArr;
                                                                                    } else {
                                                                                        objArr3 = objArr2;
                                                                                        objArr4 = objArr;
                                                                                        java.util.Arrays.sort(entryArr, 0, length, new bdt(comparator, 15, (byte[]) null));
                                                                                        java.util.Map.Entry entry4 = (java.util.Map.Entry) j$.util.Objects.requireNonNull(entryArr[0]);
                                                                                        key = entry4.getKey();
                                                                                        objArr4[0] = key;
                                                                                        java.lang.Object value2 = entry4.getValue();
                                                                                        objArr3[0] = value2;
                                                                                        defpackage.ahvr.bB(objArr4[0], value2);
                                                                                        i9 = 1;
                                                                                        while (i9 < length) {
                                                                                            entry = (java.util.Map.Entry) j$.util.Objects.requireNonNull(entryArr[i9 - 1]);
                                                                                            entry2 = (java.util.Map.Entry) j$.util.Objects.requireNonNull(entryArr[i9]);
                                                                                            entryArr2 = entryArr;
                                                                                            key2 = entry2.getKey();
                                                                                            i10 = i9;
                                                                                            java.lang.Object value3 = entry2.getValue();
                                                                                            defpackage.ahvr.bB(key2, value3);
                                                                                            objArr4[i10] = key2;
                                                                                            objArr3[i10] = value3;
                                                                                            if (comparator.compare(key, key2) != 0) {
                                                                                                throw new java.lang.IllegalArgumentException("Multiple entries with same key: " + java.lang.String.valueOf(entry) + " and " + java.lang.String.valueOf(entry2));
                                                                                            }
                                                                                            i9 = i10 + 1;
                                                                                            key = key2;
                                                                                            entryArr = entryArr2;
                                                                                        }
                                                                                    }
                                                                                    aihlVarA = new aihl(new defpackage.aiko(defpackage.aify.h(objArr4), comparator), defpackage.aify.h(objArr3), (aihl) null);
                                                                                    i6 = 0;
                                                                                } else {
                                                                                    i6 = 0;
                                                                                    java.util.Map.Entry entry5 = (java.util.Map.Entry) j$.util.Objects.requireNonNull(entryArr[0]);
                                                                                    aihlVarA = aihl.t(comparator, entry5.getKey(), entry5.getValue());
                                                                                }
                                                                            } else {
                                                                                i6 = 0;
                                                                            }
                                                                        } else {
                                                                            entryArr = (java.util.Map.Entry[]) defpackage.ahvr.bt(aihlVarUnmodifiableMap.entrySet(), aihl.a);
                                                                            length = entryArr.length;
                                                                            if (length != 0) {
                                                                                i6 = 0;
                                                                                aihlVarA = aihl.a(comparator);
                                                                            } else if (length != 1) {
                                                                                objArr = new java.lang.Object[length];
                                                                                objArr2 = new java.lang.Object[length];
                                                                                if (zEquals) {
                                                                                    i11 = 0;
                                                                                    while (i11 < length) {
                                                                                        java.util.Map.Entry entry6 = (java.util.Map.Entry) j$.util.Objects.requireNonNull(entryArr[i11]);
                                                                                        int i110 = i11;
                                                                                        java.lang.Object key4 = entry6.getKey();
                                                                                        java.lang.Object[] objArr6 = objArr2;
                                                                                        java.lang.Object value4 = entry6.getValue();
                                                                                        defpackage.ahvr.bB(key4, value4);
                                                                                        objArr[i110] = key4;
                                                                                        objArr6[i110] = value4;
                                                                                        i11 = i110 + 1;
                                                                                        objArr2 = objArr6;
                                                                                    }
                                                                                    objArr3 = objArr2;
                                                                                    objArr4 = objArr;
                                                                                } else {
                                                                                    objArr3 = objArr2;
                                                                                    objArr4 = objArr;
                                                                                    java.util.Arrays.sort(entryArr, 0, length, new bdt(comparator, 15, (byte[]) null));
                                                                                    java.util.Map.Entry entry7 = (java.util.Map.Entry) j$.util.Objects.requireNonNull(entryArr[0]);
                                                                                    key = entry7.getKey();
                                                                                    objArr4[0] = key;
                                                                                    java.lang.Object value5 = entry7.getValue();
                                                                                    objArr3[0] = value5;
                                                                                    defpackage.ahvr.bB(objArr4[0], value5);
                                                                                    i9 = 1;
                                                                                    while (i9 < length) {
                                                                                        entry = (java.util.Map.Entry) j$.util.Objects.requireNonNull(entryArr[i9 - 1]);
                                                                                        entry2 = (java.util.Map.Entry) j$.util.Objects.requireNonNull(entryArr[i9]);
                                                                                        entryArr2 = entryArr;
                                                                                        key2 = entry2.getKey();
                                                                                        i10 = i9;
                                                                                        java.lang.Object value6 = entry2.getValue();
                                                                                        defpackage.ahvr.bB(key2, value6);
                                                                                        objArr4[i10] = key2;
                                                                                        objArr3[i10] = value6;
                                                                                        if (comparator.compare(key, key2) != 0) {
                                                                                            throw new java.lang.IllegalArgumentException("Multiple entries with same key: " + java.lang.String.valueOf(entry) + " and " + java.lang.String.valueOf(entry2));
                                                                                        }
                                                                                        i9 = i10 + 1;
                                                                                        key = key2;
                                                                                        entryArr = entryArr2;
                                                                                    }
                                                                                }
                                                                                aihlVarA = new aihl(new defpackage.aiko(defpackage.aify.h(objArr4), comparator), defpackage.aify.h(objArr3), (aihl) null);
                                                                                i6 = 0;
                                                                            } else {
                                                                                i6 = 0;
                                                                                java.util.Map.Entry entry8 = (java.util.Map.Entry) j$.util.Objects.requireNonNull(entryArr[0]);
                                                                                aihlVarA = aihl.t(comparator, entry8.getKey(), entry8.getValue());
                                                                            }
                                                                        }
                                                                        defpackage.ailj it6 = aihlVarA.e().iterator();
                                                                        while (it6.hasNext()) {
                                                                            java.util.Map.Entry entry9 = (java.util.Map.Entry) it6.next();
                                                                            int iIntValue = ((java.lang.Integer) entry9.getKey()).intValue();
                                                                            if (iIntValue != i15) {
                                                                                defpackage.akzx akzxVarM6 = alfiVar4.m();
                                                                                akzxVarM6.u();
                                                                                alfi alfiVar5 = akzxVarM6.b;
                                                                                alfiVar5.b |= 2;
                                                                                alfiVar5.d = iIntValue;
                                                                                ammj ammjVar2 = (ammj) entry9.getValue();
                                                                                if (!ammjVar2.b.isEmpty()) {
                                                                                    java.lang.String str7 = ammjVar2.b;
                                                                                    akzxVarM6.u();
                                                                                    alfi alfiVar6 = akzxVarM6.b;
                                                                                    j$.util.Objects.requireNonNull(str7);
                                                                                    alfiVar6.b |= 1;
                                                                                    alfiVar6.c = str7;
                                                                                }
                                                                                defpackage.akzx akzxVarM7 = alfh.a.m();
                                                                                alfi alfiVarR2 = akzxVarM6.r();
                                                                                akzxVarM7.u();
                                                                                alfh alfhVar = akzxVarM7.b;
                                                                                j$.util.Objects.requireNonNull(alfiVarR2);
                                                                                alfhVar.c = alfiVarR2;
                                                                                alfhVar.b |= 1;
                                                                                defpackage.aify aifyVarA2 = defpackage.aerv.a(ammjVar2, aigfVarE, jLongValue);
                                                                                akzxVarM7.u();
                                                                                alfh alfhVar2 = akzxVarM7.b;
                                                                                defpackage.alat alatVar3 = alfhVar2.d;
                                                                                if (!alatVar3.c()) {
                                                                                    alfhVar2.d = defpackage.alad.J(alatVar3);
                                                                                }
                                                                                defpackage.akyl.i(aifyVarA2, alfhVar2.d);
                                                                                alfh alfhVarR = akzxVarM7.r();
                                                                                akzxVarM3.u();
                                                                                alfl alflVar9 = akzxVarM3.b;
                                                                                j$.util.Objects.requireNonNull(alfhVarR);
                                                                                defpackage.alat alatVar4 = alflVar9.k;
                                                                                if (!alatVar4.c()) {
                                                                                    alflVar9.k = defpackage.alad.J(alatVar4);
                                                                                }
                                                                                alflVar9.k.add(alfhVarR);
                                                                            }
                                                                        }
                                                                        alflVarR = akzxVarM3.r();
                                                                    } catch (java.lang.Throwable th14) {
                                                                        th = th14;
                                                                        i6 = 0;
                                                                    }
                                                                } catch (java.lang.Throwable th15) {
                                                                    th = th15;
                                                                    i6 = 0;
                                                                }
                                                            } catch (java.lang.Throwable th16) {
                                                                th = th16;
                                                                aerxVar2 = aerxVar2;
                                                                applicationExitInfo = applicationExitInfoM;
                                                            }
                                                        } catch (java.lang.Throwable th17) {
                                                            th = th17;
                                                            aerxVar2 = aerxVar2;
                                                            it = it2;
                                                        }
                                                    } catch (java.lang.Throwable th18) {
                                                        th = th18;
                                                        aerxVar2 = aerxVar2;
                                                        inputStream = inputStreamM2;
                                                    }
                                                }
                                                if (alflVarR != null) {
                                                    try {
                                                        akzxVarM2.u();
                                                        defpackage.apef apefVar9 = (defpackage.apef) akzxVarM2.b;
                                                        j$.util.Objects.requireNonNull(alflVarR);
                                                        apefVar9.p = alflVarR;
                                                        apefVar9.b |= 8192;
                                                    } catch (java.lang.Throwable th19) {
                                                        th = th19;
                                                        th = th;
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                try {
                                                    inputStream.close();
                                                } catch (java.io.IOException e2) {
                                                    e = e2;
                                                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(e)).l("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "maybeSetNativeCrashInfo", (char) 365, str2)).v("Failed to read native crash tombstone");
                                                    iM$3 = baa$.ExternalSyntheticApiModelOutline1.m$3(applicationExitInfo);
                                                    if (iM$3 != 100) {
                                                        i13 = 2;
                                                    } else if (iM$3 != 125) {
                                                        i13 = 3;
                                                    } else if (iM$3 != 200) {
                                                        i13 = 5;
                                                    } else if (iM$3 != 230) {
                                                        i13 = 6;
                                                    } else if (iM$3 != 300) {
                                                        i13 = 8;
                                                    } else if (iM$3 != 325) {
                                                        i13 = 4;
                                                    } else if (iM$3 != 350) {
                                                        i13 = 7;
                                                    } else if (iM$3 != 400) {
                                                        if (iM$3 != 1000) {
                                                            ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "toImportanceEnum", 519, "ApplicationExitInfoCaptureImpl.java")).y("Unknown ApplicationExitInfo Importance: %s", new aepb(iM$3));
                                                            i13 = i6;
                                                        } else {
                                                            i13 = 10;
                                                        }
                                                    }
                                                    if (i13 != 0) {
                                                        akzxVarM2.u();
                                                        defpackage.apef apefVar10 = (defpackage.apef) akzxVarM2.b;
                                                        apefVar10.f = i13 - 1;
                                                        apefVar10.b |= 8;
                                                    }
                                                    aevdVar = aervVar.p;
                                                    iM = baa$.ExternalSyntheticApiModelOutline1.m(applicationExitInfo);
                                                    alcfVarE = defpackage.aldi.e(baa$.ExternalSyntheticApiModelOutline1.m(applicationExitInfo));
                                                    if (((java.lang.Boolean) aevdVar.b.a()).booleanValue()) {
                                                        file = new java.io.File(((android.content.Context) aevdVar.a).getFilesDir(), "flight_records");
                                                        defpackage.aevd.a(file, j$.time.Instant.now().getEpochSecond());
                                                        if (file.exists()) {
                                                            fileArrListFiles = file.listFiles((java.io.FilenameFilter) new aeoa(iM));
                                                            if (fileArrListFiles == null) {
                                                                ((defpackage.aimw) ((defpackage.aimw) aenr.a.b()).l("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 61, "FlightRecordReaderImpl.java")).w("Failed to find any valid flight records for process id %d", iM);
                                                                ajcqVarZ = defpackage.aiql.z(defpackage.ahwt.a);
                                                            } else {
                                                                java.lang.Long lValueOf = null;
                                                                file2 = null;
                                                                for (i7 = i6; i7 < fileArrListFiles.length; i7++) {
                                                                    file4 = fileArrListFiles[i7];
                                                                    listJ = defpackage.ahzf.b('_').j(file4.getName());
                                                                    if (listJ.size() != 2) {
                                                                        ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 70, "FlightRecordReaderImpl.java")).y("Invalid flight record file name: %s", file4.getName());
                                                                        file5 = file2;
                                                                    } else {
                                                                        try {
                                                                            j = java.lang.Long.parseLong((java.lang.String) listJ.get(1));
                                                                            file5 = file2;
                                                                            j2 = alcfVarE.b;
                                                                            if (j > j2) {
                                                                            }
                                                                        } catch (java.lang.NumberFormatException e3) {
                                                                            file5 = file2;
                                                                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(e3)).l("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 77, "FlightRecordReaderImpl.java")).y("Invalid timestamp in flight record file name: %s", file4.getName());
                                                                        }
                                                                    }
                                                                    file2 = file5;
                                                                }
                                                                file3 = file2;
                                                                if (file3 == null) {
                                                                    ((defpackage.aimw) ((defpackage.aimw) aenr.a.b()).l("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 94, "FlightRecordReaderImpl.java")).w("Failed to find any valid flight records for process id %d", iM);
                                                                    ajcqVarZ = defpackage.aiql.z(defpackage.ahwt.a);
                                                                } else {
                                                                    try {
                                                                        fileInputStream = new java.io.FileInputStream(file3);
                                                                        try {
                                                                            ajcqVarZ = defpackage.aiql.z(defpackage.ahyn.h(defpackage.alad.A(aenz.a, fileInputStream, defpackage.akzq.a())));
                                                                            fileInputStream.close();
                                                                        } catch (java.lang.Throwable th20) {
                                                                            try {
                                                                                fileInputStream.close();
                                                                            } catch (java.lang.Throwable th21) {
                                                                                th20.addSuppressed(th21);
                                                                            }
                                                                            throw th20;
                                                                        }
                                                                    } catch (java.io.IOException e4) {
                                                                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(e4)).l("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 'g', "FlightRecordReaderImpl.java")).v("Failed to read FlightRecord from file");
                                                                        ajcqVarZ = defpackage.aiql.z(defpackage.ahwt.a);
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            ((defpackage.aimw) ((defpackage.aimw) aenr.a.b()).l("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 53, "FlightRecordReaderImpl.java")).v("Flight records directory does not exist");
                                                            ajcqVarZ = defpackage.aiql.z(defpackage.ahwt.a);
                                                        }
                                                    } else {
                                                        ajcqVarZ = defpackage.aiql.z(defpackage.ahwt.a);
                                                    }
                                                    aiftVar.i(defpackage.ajan.f(ajcqVarZ, new aeru(aervVar, akzxVarM2), defpackage.ajbm.INSTANCE));
                                                    j3 = j4;
                                                    string = str;
                                                    it2 = it;
                                                    aerxVar2 = aerxVar2;
                                                    i12 = 4;
                                                }
                                            } catch (java.lang.Throwable th22) {
                                                th = th22;
                                                str2 = "ApplicationExitInfoCaptureImpl.java";
                                            }
                                        }
                                        str2 = "ApplicationExitInfoCaptureImpl.java";
                                        inputStream = inputStreamM2;
                                        it = it2;
                                        applicationExitInfo = applicationExitInfoM;
                                        i6 = 0;
                                        th = th;
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        throw th;
                                    } catch (java.io.IOException e5) {
                                        e = e5;
                                        aerxVar2 = aerxVar2;
                                        str = string;
                                        str2 = "ApplicationExitInfoCaptureImpl.java";
                                        it = it2;
                                        applicationExitInfo = applicationExitInfoM;
                                        i6 = 0;
                                    }
                                }
                                aerxVar2 = aerxVar2;
                                str = string;
                                it = it2;
                                applicationExitInfo = applicationExitInfoM;
                                i6 = 0;
                            } else {
                                aerxVar2 = aerxVar2;
                                str = string;
                                it = it2;
                                applicationExitInfo = applicationExitInfoM;
                                i6 = 0;
                            }
                            iM$3 = baa$.ExternalSyntheticApiModelOutline1.m$3(applicationExitInfo);
                            if (iM$3 != 100) {
                                i13 = 2;
                            } else if (iM$3 != 125) {
                                i13 = 3;
                            } else if (iM$3 != 200) {
                                i13 = 5;
                            } else if (iM$3 != 230) {
                                i13 = 6;
                            } else if (iM$3 != 300) {
                                i13 = 8;
                            } else if (iM$3 != 325) {
                                i13 = 4;
                            } else if (iM$3 != 350) {
                                i13 = 7;
                            } else if (iM$3 != 400) {
                                if (iM$3 != 1000) {
                                    ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "toImportanceEnum", 519, "ApplicationExitInfoCaptureImpl.java")).y("Unknown ApplicationExitInfo Importance: %s", new aepb(iM$3));
                                    i13 = i6;
                                } else {
                                    i13 = 10;
                                }
                            }
                            if (i13 != 0) {
                                akzxVarM2.u();
                                defpackage.apef apefVar11 = (defpackage.apef) akzxVarM2.b;
                                apefVar11.f = i13 - 1;
                                apefVar11.b |= 8;
                            }
                            aevdVar = aervVar.p;
                            iM = baa$.ExternalSyntheticApiModelOutline1.m(applicationExitInfo);
                            alcfVarE = defpackage.aldi.e(baa$.ExternalSyntheticApiModelOutline1.m(applicationExitInfo));
                            if (((java.lang.Boolean) aevdVar.b.a()).booleanValue()) {
                                ajcqVarZ = defpackage.aiql.z(defpackage.ahwt.a);
                            } else {
                                file = new java.io.File(((android.content.Context) aevdVar.a).getFilesDir(), "flight_records");
                                defpackage.aevd.a(file, j$.time.Instant.now().getEpochSecond());
                                if (file.exists()) {
                                    ((defpackage.aimw) ((defpackage.aimw) aenr.a.b()).l("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 53, "FlightRecordReaderImpl.java")).v("Flight records directory does not exist");
                                    ajcqVarZ = defpackage.aiql.z(defpackage.ahwt.a);
                                } else {
                                    fileArrListFiles = file.listFiles((java.io.FilenameFilter) new aeoa(iM));
                                    if (fileArrListFiles == null) {
                                        ((defpackage.aimw) ((defpackage.aimw) aenr.a.b()).l("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 61, "FlightRecordReaderImpl.java")).w("Failed to find any valid flight records for process id %d", iM);
                                        ajcqVarZ = defpackage.aiql.z(defpackage.ahwt.a);
                                    } else {
                                        java.lang.Long lValueOf2 = null;
                                        file2 = null;
                                        while (i7 < fileArrListFiles.length) {
                                            file4 = fileArrListFiles[i7];
                                            listJ = defpackage.ahzf.b('_').j(file4.getName());
                                            if (listJ.size() != 2) {
                                                ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 70, "FlightRecordReaderImpl.java")).y("Invalid flight record file name: %s", file4.getName());
                                                file5 = file2;
                                            } else {
                                                j = java.lang.Long.parseLong((java.lang.String) listJ.get(1));
                                                file5 = file2;
                                                j2 = alcfVarE.b;
                                                if (j > j2 && (lValueOf2 == null || j2 - j < lValueOf2.longValue())) {
                                                    lValueOf2 = java.lang.Long.valueOf(alcfVarE.b - j);
                                                    file2 = file4;
                                                }
                                            }
                                            file2 = file5;
                                        }
                                        file3 = file2;
                                        if (file3 == null) {
                                            ((defpackage.aimw) ((defpackage.aimw) aenr.a.b()).l("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 94, "FlightRecordReaderImpl.java")).w("Failed to find any valid flight records for process id %d", iM);
                                            ajcqVarZ = defpackage.aiql.z(defpackage.ahwt.a);
                                        } else {
                                            fileInputStream = new java.io.FileInputStream(file3);
                                            ajcqVarZ = defpackage.aiql.z(defpackage.ahyn.h(defpackage.alad.A(aenz.a, fileInputStream, defpackage.akzq.a())));
                                            fileInputStream.close();
                                        }
                                    }
                                }
                            }
                            aiftVar.i(defpackage.ajan.f(ajcqVarZ, new aeru(aervVar, akzxVarM2), defpackage.ajbm.INSTANCE));
                            j3 = j4;
                            string = str;
                            it2 = it;
                            aerxVar2 = aerxVar2;
                            i12 = 4;
                        }
                        defpackage.aerx aerxVar4 = aerxVar2;
                        defpackage.ajcq ajcqVarV2 = defpackage.aiql.v(aiftVar.g());
                        defpackage.aeqw aeqwVar2 = new defpackage.aeqw(2);
                        defpackage.ajbm ajbmVar2 = defpackage.ajbm.INSTANCE;
                        return defpackage.ajan.g(defpackage.ajan.f(ajcqVarV2, aeqwVar2, ajbmVar2), new defpackage.adfd(aerxVar4, 12), ajbmVar2);
                    }
                }, aerxVar.c);
                return;
            case 2:
                java.lang.Object obj = this.a;
                defpackage.aiql.C(new defpackage.aetv(obj, 4), ((aetw) obj).b);
                return;
            case 3:
                java.lang.Object obj2 = this.a;
                aetw aetwVar2 = (aetw) obj2;
                android.content.Context context = aetwVar2.a;
                if (defpackage.abyl.i(context)) {
                    aetwVar2.a();
                    return;
                } else {
                    defpackage.abyl.d(context, new defpackage.aetv(obj2, i4));
                    return;
                }
            case 4:
                ((aetw) this.a).a();
                return;
            case 5:
                ?? r0 = this.a;
                aetw aetwVar3 = (aetw) r0;
                if (aetwVar3.e.b(null)) {
                    defpackage.ahvr.ci(aetwVar3.i);
                    aetwVar3.i.b();
                    return;
                } else {
                    synchronized (aetwVar3.h) {
                        ((aetw) r0).f.b(r0);
                        break;
                    }
                    return;
                }
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                aetw aetwVar4 = (aetw) this.a;
                defpackage.ahvr.ci(aetwVar4.i);
                aetx aetxVar = aetwVar4.i;
                if (aetxVar.h) {
                    java.util.concurrent.atomic.AtomicReference atomicReference = aetxVar.i;
                    if (atomicReference.get() != null) {
                        aetxVar.h = false;
                        ((java.util.concurrent.Future) atomicReference.get()).cancel(false);
                        return;
                    }
                    return;
                }
                return;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                long millis = defpackage.aazc.c().toMillis();
                java.lang.Object obj3 = this.a;
                aetx aetxVar2 = (aetx) obj3;
                aetxVar2.f = millis;
                aetxVar2.c.post(new defpackage.aetv(obj3, i3));
                aetxVar2.a(new defpackage.aetv(obj3, i2), aetxVar2.b.b);
                return;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                long millis2 = defpackage.aazc.c().toMillis();
                java.lang.Object obj4 = this.a;
                aetx aetxVar3 = (aetx) obj4;
                long j = aetxVar3.g;
                long j2 = aetxVar3.f;
                long j3 = j - j2;
                if (j3 >= 0) {
                    aetxVar3.j.a = false;
                    aett aettVar2 = aetxVar3.b;
                    if (j3 > ((java.lang.Integer) aettVar2.e.get(0)).intValue()) {
                        defpackage.aequ aequVar = aetxVar3.d;
                        defpackage.aeqq aeqqVarA = defpackage.aeqr.a();
                        defpackage.akzx akzxVarM = defpackage.apgu.a.m();
                        defpackage.akzx akzxVarM2 = apgt.a.m();
                        akzxVarM2.u();
                        apgt apgtVar = akzxVarM2.b;
                        apgtVar.b = 2;
                        apgtVar.c = java.lang.Long.valueOf(j3);
                        apgt apgtVarR = akzxVarM2.r();
                        akzxVarM.u();
                        defpackage.apgu apguVar = (defpackage.apgu) akzxVarM.b;
                        j$.util.Objects.requireNonNull(apgtVarR);
                        apguVar.p = apgtVarR;
                        apguVar.b |= 131072;
                        aeqqVarA.f((defpackage.apgu) akzxVarM.r());
                        aequVar.a(aeqqVarA.a());
                        aetxVar3.e = 0;
                    }
                    aetxVar3.a(new defpackage.aetv(obj4, 7), aettVar2.d);
                    return;
                }
                long j4 = millis2 - j2;
                aeok aeokVar2 = aetxVar3.j;
                if (((java.lang.Boolean) aeokVar2.b.a()).booleanValue() && !aeokVar2.a && j4 >= ((java.lang.Long) aeokVar2.c.a()).longValue()) {
                    aeokVar2.a = true;
                    ((defpackage.ahbz) aeokVar2.d).m(3);
                }
                if (((java.lang.Boolean) aetxVar3.a.a()).booleanValue()) {
                    aett aettVar3 = aetxVar3.b;
                    i = aetxVar3.e;
                    aifyVar = aettVar3.e;
                    if (i != aifyVar.size()) {
                        while (aetxVar3.e != aifyVar.size()) {
                            aetxVar3.e++;
                            z = true;
                        }
                        if (z) {
                            defpackage.aequ aequVar2 = aetxVar3.d;
                            defpackage.aeqq aeqqVarA2 = defpackage.aeqr.a();
                            defpackage.akzx akzxVarM3 = defpackage.apgu.a.m();
                            defpackage.akzx akzxVarM4 = apgt.a.m();
                            akzxVarM4.u();
                            apgt apgtVar2 = akzxVarM4.b;
                            apgtVar2.b = 1;
                            apgtVar2.c = java.lang.Long.valueOf(j4);
                            apgt apgtVarR2 = akzxVarM4.r();
                            akzxVarM3.u();
                            defpackage.apgu apguVar2 = (defpackage.apgu) akzxVarM3.b;
                            j$.util.Objects.requireNonNull(apgtVarR2);
                            apguVar2.p = apgtVarR2;
                            apguVar2.b |= 131072;
                            aeqqVarA2.f((defpackage.apgu) akzxVarM3.r());
                            aequVar2.a(aeqqVarA2.a());
                        }
                    }
                } else {
                    if (j4 > ((java.lang.Integer) aetxVar3.b.e.get(aetxVar3.e)).intValue()) {
                        aett aettVar4 = aetxVar3.b;
                        i = aetxVar3.e;
                        aifyVar = aettVar4.e;
                        if (i != aifyVar.size() && j4 > ((java.lang.Integer) aifyVar.get(aetxVar3.e)).intValue()) {
                            while (aetxVar3.e != aifyVar.size() && j4 > ((java.lang.Integer) aifyVar.get(aetxVar3.e)).intValue()) {
                                aetxVar3.e++;
                                z = true;
                            }
                            if (z) {
                                defpackage.aequ aequVar3 = aetxVar3.d;
                                defpackage.aeqq aeqqVarA3 = defpackage.aeqr.a();
                                defpackage.akzx akzxVarM5 = defpackage.apgu.a.m();
                                defpackage.akzx akzxVarM6 = apgt.a.m();
                                akzxVarM6.u();
                                apgt apgtVar3 = akzxVarM6.b;
                                apgtVar3.b = 1;
                                apgtVar3.c = java.lang.Long.valueOf(j4);
                                apgt apgtVarR3 = akzxVarM6.r();
                                akzxVarM5.u();
                                defpackage.apgu apguVar3 = (defpackage.apgu) akzxVarM5.b;
                                j$.util.Objects.requireNonNull(apgtVarR3);
                                apguVar3.p = apgtVarR3;
                                apguVar3.b |= 131072;
                                aeqqVarA3.f((defpackage.apgu) akzxVarM5.r());
                                aequVar3.a(aeqqVarA3.a());
                            }
                        }
                    }
                }
                aetxVar3.a(new defpackage.aetv(obj4, i2), aetxVar3.b.c);
                return;
            case 9:
                ((aetx) this.a).g = defpackage.aazc.c().toMillis();
                return;
            case 10:
                ((android.content.BroadcastReceiver.PendingResult) this.a).finish();
                return;
            case 11:
                ((defpackage.aeyy) this.a).b();
                return;
            case 12:
                java.lang.Object obj5 = this.a;
                defpackage.aeyy aeyyVar = (defpackage.aeyy) obj5;
                defpackage.aewq aewqVar = aeyyVar.c;
                defpackage.ajcq ajcqVarA = aezf.b(aewqVar).a(new defpackage.wym(aeyyVar.d, 20), aewqVar.c());
                ajcqVarA.c(new aekf(obj5, ajcqVarA, 9), aewqVar.c());
                return;
            case 13:
                aeyu aeyvVar = new aeyv(0);
                java.lang.Object obj6 = this.a;
                java.util.Iterator it = ((defpackage.aeyx) obj6).b.values().iterator();
                while (it.hasNext()) {
                    ((defpackage.zzx) it.next()).J(aeyvVar);
                }
                synchronized (obj6) {
                    ((defpackage.aeyx) obj6).a = null;
                    break;
                }
                return;
            case 14:
                throw new java.lang.RuntimeException(((java.util.concurrent.ExecutionException) this.a).getCause());
            case 15:
                if (((java.lang.Boolean) ((aezj) this.a).a.eZ()).booleanValue()) {
                    android.util.Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    android.os.Process.killProcess(android.os.Process.myPid());
                    java.lang.System.exit(0);
                    return;
                }
                return;
            case 16:
                android.os.StrictMode.setThreadPolicy((android.os.StrictMode.ThreadPolicy) this.a);
                return;
            case 17:
                defpackage.apdh apdhVar = new defpackage.apdh();
                java.lang.Object obj7 = this.a;
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = afjh.b;
                ajxi ajxiVar = (ajxi) obj7;
                java.lang.Object obj8 = ajxiVar.b;
                java.lang.Object obj9 = ajxiVar.c;
                java.lang.Object obj10 = ajxiVar.a;
                synchronized (atomicBoolean) {
                    ?? r6 = ((ahex) obj9).b;
                    if (android.text.TextUtils.isEmpty(r6)) {
                        android.util.Log.w("SurveyController", "No trigger ID set, ignoring show request.");
                        ((oqf) ((ahex) obj9).c).a((java.lang.String) r6, afjd.d);
                        return;
                    }
                    ((afjh) obj10).g = j$.time.Instant.now().toEpochMilli();
                    ((afjh) obj10).c.c.put(r6, java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli()));
                    defpackage.akzx akzxVarM7 = amji.a.m();
                    akzxVarM7.u();
                    amji amjiVar = akzxVarM7.b;
                    j$.util.Objects.requireNonNull((java.lang.Object) r6);
                    amjiVar.b = (java.lang.String) r6;
                    defpackage.aehj aehjVar = afjy.c;
                    afjy.c(anll.a.b().c(afjy.b));
                    java.lang.String language = java.util.Locale.getDefault().getLanguage();
                    defpackage.aehj aehjVar2 = afjy.c;
                    if (afjy.b(anlc.c(afjy.b))) {
                        language = java.util.Locale.getDefault().toLanguageTag();
                    }
                    defpackage.aify aifyVarP = defpackage.aify.p(language);
                    akzxVarM7.u();
                    amji amjiVar2 = akzxVarM7.b;
                    defpackage.alat alatVar = amjiVar2.c;
                    if (!alatVar.c()) {
                        amjiVar2.c = defpackage.alad.J(alatVar);
                    }
                    defpackage.akyl.i(aifyVarP, amjiVar2.c);
                    boolean z2 = ((ahex) obj9).a;
                    akzxVarM7.u();
                    akzxVarM7.b.d = z2;
                    amji amjiVarR = akzxVarM7.r();
                    java.lang.Object obj11 = ((ahex) obj9).e;
                    amhu amhuVarD = afjz.d((android.content.Context) obj11);
                    defpackage.akzx akzxVarM8 = amhk.a.m();
                    akzxVarM8.u();
                    amhk amhkVar = akzxVarM8.b;
                    j$.util.Objects.requireNonNull(amjiVarR);
                    amhkVar.c = amjiVarR;
                    amhkVar.b |= 1;
                    akzxVarM8.u();
                    amhk amhkVar2 = akzxVarM8.b;
                    j$.util.Objects.requireNonNull(amhuVarD);
                    amhkVar2.d = amhuVarD;
                    amhkVar2.b |= 2;
                    amhk amhkVarR = akzxVarM8.r();
                    defpackage.apdh apdhVar2 = new defpackage.apdh();
                    if (amhkVarR == null) {
                        android.util.Log.e("NetworkCallerGrpc", "Survey trigger request was null");
                    } else {
                        afjm.a().execute(new acxq(obj8, amhkVarR, apdhVar2, 8, (char[]) null));
                    }
                    defpackage.akzx akzxVarM9 = algx.a.m();
                    akzxVarM9.u();
                    algx algxVar = akzxVarM9.b;
                    j$.util.Objects.requireNonNull((java.lang.Object) r6);
                    algxVar.b = (java.lang.String) r6;
                    akzxVarM9.u();
                    akzxVarM9.b.c = z2;
                    akzxVarM9.u();
                    akzxVarM9.b.d = false;
                    algx algxVarR = akzxVarM9.r();
                    defpackage.aehj aehjVar3 = afjy.c;
                    if (afjy.c(anjv.c(afjy.b))) {
                        amac amacVarT = amac.t();
                        defpackage.akzx akzxVarM10 = algy.a.m();
                        akzxVarM10.u();
                        algy algyVar = akzxVarM10.b;
                        j$.util.Objects.requireNonNull(algxVarR);
                        algyVar.c = algxVarR;
                        algyVar.b = 3;
                        amacVarT.q(akzxVarM10.r(), apdhVar.b(), apdhVar.a(), (android.content.Context) obj11, (java.lang.String) null);
                    }
                    return;
                }
            case 18:
                com.google.android.libraries.surveys.internal.view.EmbeddedSurveyFragment embeddedSurveyFragment = (com.google.android.libraries.surveys.internal.view.EmbeddedSurveyFragment) this.a;
                embeddedSurveyFragment.d = false;
                aprf aprfVar = defpackage.aehj.b;
                if (aprfVar == null || (afmaVar = embeddedSurveyFragment.c) == null) {
                    return;
                }
                aliq aliqVar = new aliq((byte[]) null);
                aliqVar.i(afmaVar.f.b);
                aliqVar.k(embeddedSurveyFragment.c.e);
                aliqVar.j(embeddedSurveyFragment.c.l);
                aprfVar.o(aliqVar.h());
                return;
            case 19:
                android.widget.EditText editText = (android.widget.EditText) this.a;
                editText.setFocusable(true);
                editText.setFocusableInTouchMode(true);
                return;
            default:
                aflh aflhVar = (aflh) this.a;
                aflg aflgVar = aflhVar.a;
                if (aflgVar != null) {
                    aflgVar.a(1);
                    aflhVar.a = null;
                    return;
                }
                return;
        }
    }
}
