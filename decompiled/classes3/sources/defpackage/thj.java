package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class thj {
    public static final aimz a = aimz.i("com/android/dialer/search/viewmodel/SearchViewModel");
    public final android.content.Context b;
    public final defpackage.tgq c;
    public final aoss d;
    public final aolr e;
    public final defpackage.tez f;
    public final java.util.Map g;
    public final java.util.Map h;
    public final aoir i;
    public final aonj j;
    public final aozh k;
    public final aozj l;
    public final aozj m;
    public final aozj n;
    public final aozj o;
    public final zjm p;
    private final ruc q;
    private final zrw r;
    private final java.util.Map s;
    private final aoxh t;
    private final aoxh u;
    private final aoxh v;
    private final aozj w;

    public thj(android.content.Context context, zzx zzxVar, defpackage.tgq tgqVar, zjm zjmVar, aazc aazcVar, aoss aossVar, aolr aolrVar, defpackage.tez tezVar, ruc rucVar, zrw zrwVar) {
        aooh.f(context, "appContext");
        aooh.f(aazcVar, "clock");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(tezVar, "defaultSearchRowClickEventListener");
        aooh.f(rucVar, "metrics");
        this.b = context;
        this.c = tgqVar;
        this.p = zjmVar;
        this.d = aossVar;
        this.e = aolrVar;
        this.f = tezVar;
        this.q = rucVar;
        this.r = zrwVar;
        aihd aihdVarE = zzxVar.e();
        aooh.e(aihdVarE, "get(...)");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(aihdVarE, 10)), 16));
        for (java.lang.Object obj : aihdVarE) {
            linkedHashMap.put(((defpackage.teu) obj).b().b, obj);
        }
        this.s = linkedHashMap;
        aihd aihdVarE2 = zzxVar.e();
        aooh.e(aihdVarE2, "get(...)");
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(aihdVarE2, 10)), 16));
        for (java.lang.Object obj2 : aihdVarE2) {
            linkedHashMap2.put(((defpackage.teu) obj2).b().c, obj2);
        }
        this.g = linkedHashMap2;
        aihd aihdVarE3 = zzxVar.e();
        aooh.e(aihdVarE3, "get(...)");
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(aihdVarE3, 10)), 16));
        for (java.lang.Object obj3 : aihdVarE3) {
            linkedHashMap3.put(((defpackage.teu) obj3).b(), obj3);
        }
        this.h = linkedHashMap3;
        this.i = aooc.ag(new defpackage.qza(zzxVar, this, 19));
        aozj aozjVarA = aozk.a((java.lang.Object) null);
        this.l = aozjVarA;
        aozj aozjVarA2 = aozk.a(new defpackage.tei("", 1, ""));
        this.m = aozjVarA2;
        aozj aozjVarA3 = aozk.a(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        this.n = aozjVarA3;
        mkc mkcVar = new mkc((aoln) null, this, 6);
        int i = aoyc.a;
        hlh hlhVar = new hlh(new apaa(mkcVar, aozjVarA2), new defpackage.ufg(null, 1, null), 17);
        this.t = hlhVar;
        aoyp aoypVar = new aoyp(hlhVar, aozjVarA3, new defpackage.thh(this, null));
        this.u = aoypVar;
        aozj aozjVarA4 = aozk.a((java.lang.Object) null);
        this.o = aozjVarA4;
        aozj aozjVarA5 = aozk.a(java.lang.Boolean.FALSE);
        this.w = aozjVarA5;
        gdc gdcVar = new gdc(new defpackage.tkx(this, (aoln) null, 1), aozjVarA5, 7);
        this.v = gdcVar;
        this.j = new aiuo(new defpackage.sbm(this, (aoln) null, 2));
        aoxh aoxhVarAC = aoov.aC(aoov.aq(aozjVarA2, aoypVar, aozjVarA, aozjVarA4, gdcVar, new defpackage.thi(this, null)), this.e);
        aoss aossVar2 = this.d;
        aozg aozgVar = new aozg(5000L, Long.MAX_VALUE);
        defpackage.tei teiVar = new defpackage.tei("", 1, "");
        aokc aokcVar = aokc.a;
        this.k = aoov.as(aoxhVarAC, aossVar2, aozgVar, new defpackage.tha(teiVar, null, aokcVar, aokcVar, 0L, 0));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6 A[Catch: Exception -> 0x01a1, TRY_LEAVE, TryCatch #4 {Exception -> 0x01a1, blocks: (B:64:0x0136, B:65:0x0149, B:67:0x014f, B:70:0x015d, B:73:0x016b, B:72:0x0163, B:74:0x0172, B:76:0x0178, B:79:0x0186, B:81:0x0195, B:78:0x017e, B:35:0x00b0, B:37:0x00b6), top: B:104:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r13v0, types: [long] */
    /* JADX WARN: Type inference failed for: r13v1, types: [teu] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object, teu] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18, types: [teu] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00da -> B:102:0x00de). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.tgh r12, long r13, aoln r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.thj.a(tgh, long, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005d -> B:19:0x005f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.List r7, long r8, aoln r10) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.thf
            if (r0 == 0) goto L13
            r0 = r10
            thf r0 = (defpackage.thf) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            thf r0 = new thf
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.d
            aolu r1 = aolu.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r7 = r0.a
            java.lang.Object r9 = r0.c
            java.lang.Object r2 = r0.b
            aooc.af(r10)
            r4 = r7
            r7 = r9
            r8 = r4
            goto L5f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            aooc.af(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r7 = r7.iterator()
            r2 = r10
        L45:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L67
            java.lang.Object r10 = r7.next()
            tgh r10 = (defpackage.tgh) r10
            r0.b = r2
            r0.c = r7
            r0.a = r8
            r0.f = r3
            java.lang.Object r10 = r6.a(r10, r8, r0)
            if (r10 == r1) goto L68
        L5f:
            thb r10 = (defpackage.thb) r10
            if (r10 == 0) goto L45
            r2.add(r10)
            goto L45
        L67:
            r1 = r2
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.thj.b(java.util.List, long, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.thg thgVar;
        if (aolnVar instanceof defpackage.thg) {
            thgVar = (defpackage.thg) aolnVar;
            int i = thgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                thgVar.c = i - Integer.MIN_VALUE;
            } else {
                thgVar = new defpackage.thg(this, aolnVar);
            }
        } else {
            thgVar = new defpackage.thg(this, aolnVar);
        }
        java.lang.Object objL = thgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = thgVar.c;
        boolean z = false;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objL);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objL);
            }
            if (((java.lang.Boolean) objL).booleanValue()) {
                z = true;
            }
            return java.lang.Boolean.valueOf(z);
        }
        aooc.af(objL);
        zrw zrwVar = this.r;
        thgVar.c = 1;
        objL = zrwVar.l(thgVar);
        if (objL == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objL).booleanValue()) {
            zrw zrwVar2 = this.r;
            thgVar.c = 2;
            objL = zrwVar2.m(thgVar);
            if (objL == aoluVar) {
                return aoluVar;
            }
            if (((java.lang.Boolean) objL).booleanValue()) {
                z = true;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }

    public final void d() {
        this.w.e(java.lang.Boolean.TRUE);
    }

    public final void e() {
        this.n.e(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
    }
}
