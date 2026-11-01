package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class advj implements defpackage.advd {
    private static final aiof a = aiof.i("GnpSdk");
    private final android.content.Context b;
    private final aoin c;
    private final aoin d;
    private final aoin e;
    private final aoin f;
    private final aoin g;
    private final aoin h;
    private final aoin i;
    private final aoin j;
    private final aoin k;

    public advj(android.content.Context context, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, aoin aoinVar6, aoin aoinVar7, aoin aoinVar8, aoin aoinVar9, aolr aolrVar) {
        aooh.f(context, "context");
        aooh.f(aoinVar, "gnpAccountStorage");
        aooh.f(aoinVar2, "accountCleanup");
        aooh.f(aoinVar3, "deviceAccountsUtil");
        aooh.f(aoinVar4, "gnpClearcutLogger");
        aooh.f(aoinVar5, "gnpConfig");
        aooh.f(aoinVar6, "clientStreamz");
        aooh.f(aoinVar7, "gnpLogEventFactory");
        aooh.f(aoinVar8, "usernameChangeUpdaters");
        aooh.f(aoinVar9, "fitbitAuthDataProvider");
        aooh.f(aolrVar, "blockingContext");
        this.b = context;
        this.c = aoinVar;
        this.d = aoinVar2;
        this.e = aoinVar3;
        this.f = aoinVar4;
        this.g = aoinVar5;
        this.h = aoinVar6;
        this.i = aoinVar7;
        this.j = aoinVar8;
        this.k = aoinVar9;
    }

    private final void e(boolean z) {
        ((afip) ((aeey) this.h.a()).n.eZ()).b(1L, new java.lang.Object[]{this.b.getPackageName(), ((aduu) this.g.a()).a, java.lang.Boolean.valueOf(z)});
    }

    /* JADX WARN: Code duplicated, block: B:40:0x013d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0156  */
    /* JADX WARN: Code duplicated, block: B:45:0x0163  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [aefe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v0, types: [aedq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0156 -> B:43:0x015b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.advd
    public final java.lang.Object a(android.content.Intent r26, defpackage.aduc r27, long r28, aoln r30) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.advj.a(android.content.Intent, aduc, long, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aduy aduyVar, aoln aolnVar) {
        defpackage.advf advfVar;
        if (aolnVar instanceof defpackage.advf) {
            advfVar = (defpackage.advf) aolnVar;
            int i = advfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                advfVar.c = i - Integer.MIN_VALUE;
            } else {
                advfVar = new defpackage.advf(this, aolnVar);
            }
        } else {
            advfVar = new defpackage.advf(this, aolnVar);
        }
        java.lang.Object objA = advfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = advfVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            defpackage.adue adueVar = (defpackage.adue) this.d.a();
            com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentationB = aduyVar.b();
            advfVar.c = 1;
            objA = adueVar.a(accountRepresentationB, advfVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        aeey aeeyVar = (aeey) this.h.a();
        android.content.Context context = this.b;
        aoin aoinVar = this.g;
        ((afip) aeeyVar.o.eZ()).b(1L, new java.lang.Object[]{context.getPackageName(), ((aduu) aoinVar.a()).a, java.lang.Boolean.valueOf(((adtz) objA).g())});
        return aojh.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aduy aduyVar, java.util.Set set, aoln aolnVar) throws aois {
        defpackage.advg advgVar;
        if (aolnVar instanceof defpackage.advg) {
            advgVar = (defpackage.advg) aolnVar;
            int i = advgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                advgVar.c = i - Integer.MIN_VALUE;
            } else {
                advgVar = new defpackage.advg(this, aolnVar);
            }
        } else {
            advgVar = new defpackage.advg(this, aolnVar);
        }
        java.lang.Object objB = advgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = advgVar.c;
        boolean zContains = true;
        if (i2 == 0) {
            aooc.af(objB);
            int iAe = anty.ae(aduyVar.b());
            if (iAe == 0) {
                zContains = set.contains(aduyVar.b().a);
            } else if (iAe == 1) {
                zContains = ajsz.cj(set, aduyVar.d);
            } else if (iAe == 2) {
                ahyn ahynVar = (ahyn) this.k.b;
                if (ahynVar.f()) {
                    defpackage.aefy aefyVar = (defpackage.aefy) ahynVar.b();
                    advgVar.d = aduyVar;
                    advgVar.c = 1;
                    objB = aefyVar.b();
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                }
            } else if (iAe != 3 && iAe != 4) {
                throw new aois();
            }
            return java.lang.Boolean.valueOf(zContains);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aduyVar = advgVar.d;
        aooc.af(objB);
        zContains = aooh.n(objB, aduyVar.b);
        return java.lang.Boolean.valueOf(zContains);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00c1 -> B:24:0x00c8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x013f -> B:42:0x0141). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(aduy r12, aduy r13, aoln r14) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.advj.d(aduy, aduy, aoln):java.lang.Object");
    }
}
