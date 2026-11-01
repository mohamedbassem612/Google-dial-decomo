package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acah implements defpackage.acaa {
    private static final aiof a = aiof.i("GnpSdk");
    private final java.lang.String b;
    private final acbd c;
    private final acal d;
    private final amwu e;
    private final abce f;
    private final defpackage.vqf g;

    public acah(java.lang.String str, aazc aazcVar, acbd acbdVar, acal acalVar, amwu amwuVar, acgr acgrVar, abce abceVar, defpackage.vqf vqfVar) {
        aooh.f(str, "packageName");
        aooh.f(aazcVar, "clock");
        aooh.f(acbdVar, "promoEvalLogger");
        aooh.f(acalVar, "clearcutLogger");
        aooh.f(amwuVar, "clientStreamz");
        aooh.f(acgrVar, "cappedPromotionStore");
        this.b = str;
        this.c = acbdVar;
        this.d = acalVar;
        this.e = amwuVar;
        this.f = abceVar;
        this.g = vqfVar;
    }

    private final void e(long j, boolean z) {
        ((afim) ((aeey) this.e.a()).l.eZ()).b(android.os.SystemClock.elapsedRealtime() - j, new java.lang.Object[]{this.b, java.lang.Boolean.valueOf(z)});
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.acaa
    public final java.lang.Object a(java.util.List list, aoln aolnVar) {
        defpackage.acae acaeVar;
        if (aolnVar instanceof defpackage.acae) {
            acaeVar = (defpackage.acae) aolnVar;
            int i = acaeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acaeVar.c = i - Integer.MIN_VALUE;
            } else {
                acaeVar = new defpackage.acae(this, aolnVar);
            }
        } else {
            acaeVar = new defpackage.acae(this, aolnVar);
        }
        java.lang.Object objC = acaeVar.a;
        aolu aoluVar = aolu.a;
        int i2 = acaeVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            acaeVar.c = 1;
            objC = c(list, true, acaeVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
        }
        return ajsz.bG((java.util.List) objC);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(long j, j$.time.Instant instant, aoln aolnVar) {
        defpackage.acad acadVar;
        java.lang.Exception e;
        long j2;
        if (aolnVar instanceof defpackage.acad) {
            acadVar = (defpackage.acad) aolnVar;
            int i = acadVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                acadVar.d = i - Integer.MIN_VALUE;
            } else {
                acadVar = new defpackage.acad(this, aolnVar);
            }
        } else {
            acadVar = new defpackage.acad(this, aolnVar);
        }
        java.lang.Object objY = acadVar.b;
        aolu aoluVar = aolu.a;
        int i2 = acadVar.d;
        if (i2 == 0) {
            aooc.af(objY);
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            try {
                aaum aaumVarP = this.f.p(j, instant);
                acadVar.a = jElapsedRealtime;
                acadVar.d = 1;
                objY = aooh.Y(aaumVarP, acadVar);
                if (objY == aoluVar) {
                    return aoluVar;
                }
                j2 = jElapsedRealtime;
            } catch (java.lang.Exception e2) {
                e = e2;
                j2 = jElapsedRealtime;
                e(j2, true);
                hgb.b(a.d(), "Failed to get cross-app capping for promotions, API might not be available.", e);
                return new java.lang.Integer(0);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = acadVar.a;
            try {
                aooc.af(objY);
            } catch (java.lang.Exception e3) {
                e = e3;
                e(j2, true);
                hgb.b(a.d(), "Failed to get cross-app capping for promotions, API might not be available.", e);
                return new java.lang.Integer(0);
            }
        }
        int iIntValue = ((java.lang.Number) objY).intValue();
        e(j2, false);
        return new java.lang.Integer(iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX WARN: Code duplicated, block: B:23:0x007f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e6 -> B:36:0x00e8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(java.util.List r11, boolean r12, aoln r13) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acah.c(java.util.List, boolean, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009c A[PHI: r8
      0x009c: PHI (r8v1 ??) = (r8v10 ??), (r8v11 ??) binds: [B:15:0x0039, B:34:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v23 */
    public final java.lang.Object d(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, aoln aolnVar) {
        defpackage.acag acagVar;
        ?? r8;
        boolean z;
        ?? r9;
        boolean z2;
        akhq akhqVar;
        akhq akhqVar2;
        akhp akhpVar;
        if (aolnVar instanceof defpackage.acag) {
            acagVar = (defpackage.acag) aolnVar;
            int i = acagVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                acagVar.d = i - Integer.MIN_VALUE;
            } else {
                acagVar = new defpackage.acag(this, aolnVar);
            }
        } else {
            acagVar = new defpackage.acag(this, aolnVar);
        }
        java.lang.Object num = acagVar.b;
        aolu aoluVar = aolu.a;
        int i2 = acagVar.d;
        if (i2 == 0) {
            aooc.af(num);
            if (anfk.c()) {
                acagVar.a = promoContext;
                acagVar.d = 1;
                akhp akhpVar2 = promoContext.c().j;
                if (akhpVar2 == null) {
                    r8 = promoContext;
                    akhpVar2 = akhp.a;
                }
                r8 = promoContext;
                boolean z3 = akhpVar2.e;
                akhp akhpVar3 = promoContext.c().j;
                if (akhpVar3 == null) {
                    akhpVar3 = akhp.a;
                }
                aooh.e(akhpVar3, "getOnDeviceCapping(...)");
                aooh.f(akhpVar3, "<this>");
                j$.time.Duration durationZ = akhpVar3.e ? defpackage.abxl.z(akhpVar3, 2) : null;
                if (durationZ != null) {
                    akhq akhqVar3 = promoContext.c().c;
                    if (akhqVar3 == null) {
                        akhqVar3 = akhq.a;
                    }
                    long j = akhqVar3.b;
                    j$.time.Instant instantMinus = j$.time.Instant.now().minus(durationZ);
                    aooh.e(instantMinus, "minus(...)");
                    num = b(j, instantMinus, acagVar);
                } else {
                    num = new java.lang.Integer(0);
                }
                if (num == aoluVar) {
                    return aoluVar;
                }
            } else {
                r8 = promoContext;
                z = false;
                r9 = r8;
            }
            if (z) {
                akhpVar = ((com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) r9).c().j;
                if (akhpVar == null) {
                    r9 = promoContext;
                    akhpVar = akhp.a;
                }
                r9 = promoContext;
                if (akhpVar.e) {
                    z2 = true;
                } else {
                    r9 = promoContext;
                    z2 = false;
                }
            } else {
                r9 = promoContext;
                z2 = false;
            }
            if (z2) {
                com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext2 = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) r9;
                this.d.i(promoContext2);
                acbd acbdVar = this.c;
                akhqVar2 = promoContext2.c().c;
                if (akhqVar2 == null) {
                    akhqVar2 = akhq.a;
                }
                acbdVar.b(promoContext2, "Promotion [%s] is cross-app capped and might not be displayed.", new java.lang.Object[]{java.lang.String.valueOf(akhqVar2.b)});
            } else {
                acbd acbdVar2 = this.c;
                com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext3 = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) r9;
                akhqVar = promoContext3.c().c;
                if (akhqVar == null) {
                    akhqVar = akhq.a;
                }
                acbdVar2.b(promoContext3, "Promotion [%s] is not cross-app capped and might be displayed.", new java.lang.Object[]{java.lang.String.valueOf(akhqVar.b)});
            }
            return java.lang.Boolean.valueOf(z2);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        promoContext = acagVar.a;
        aooc.af(num);
        r8 = promoContext;
        if (((java.lang.Number) num).intValue() > 0) {
            z = true;
        } else {
            r8 = promoContext;
            z = false;
            r9 = r8;
        }
        if (z) {
            r9 = promoContext;
            z2 = false;
        } else {
            akhpVar = ((com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) r9).c().j;
            if (akhpVar == null) {
                r9 = promoContext;
                akhpVar = akhp.a;
            }
            r9 = promoContext;
            if (akhpVar.e) {
                z2 = true;
            } else {
                r9 = promoContext;
                z2 = false;
            }
        }
        if (z2) {
            com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext4 = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) r9;
            this.d.i(promoContext4);
            acbd acbdVar3 = this.c;
            akhqVar2 = promoContext4.c().c;
            if (akhqVar2 == null) {
                akhqVar2 = akhq.a;
            }
            acbdVar3.b(promoContext4, "Promotion [%s] is cross-app capped and might not be displayed.", new java.lang.Object[]{java.lang.String.valueOf(akhqVar2.b)});
        } else {
            acbd acbdVar4 = this.c;
            com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext5 = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) r9;
            akhqVar = promoContext5.c().c;
            if (akhqVar == null) {
                akhqVar = akhq.a;
            }
            acbdVar4.b(promoContext5, "Promotion [%s] is not cross-app capped and might be displayed.", new java.lang.Object[]{java.lang.String.valueOf(akhqVar.b)});
        }
        return java.lang.Boolean.valueOf(z2);
    }
}
