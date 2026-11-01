package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jbv {
    public static final aimz a = aimz.i("com/android/dialer/beesly/impl/settings/service/BeeslySettingsDataService");
    public final aoss b;
    public final aolr c;
    public final jbm d;
    public final defpackage.jcc e;
    public final rlv f;
    public final aolr g;
    public final android.content.Context h;
    public final jdk i;
    public final aonj j;
    public aosy k;
    public final twp l;
    public final aogc m;
    private final defpackage.jcf n;
    private final zjs o;
    private final aoin p;
    private final ivi q;
    private final iqm r;
    private final aonj s;
    private final zjm t;

    public jbv(aoss aossVar, aolr aolrVar, jbm jbmVar, aogc aogcVar, defpackage.jcc jccVar, twp twpVar, defpackage.jcf jcfVar, rlv rlvVar, aolr aolrVar2, zjm zjmVar, zjs zjsVar, android.content.Context context, aoin aoinVar, aoin aoinVar2, ivi iviVar, jdk jdkVar, iqm iqmVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(jbmVar, "settings");
        aooh.f(aogcVar, "resultPropagator");
        aooh.f(jcfVar, "beeslySettingsModelDownloader");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aolrVar2, "blockingContext");
        aooh.f(zjsVar, "dialerTelecom");
        aooh.f(context, "appContext");
        aooh.f(aoinVar, "enableSmartActions");
        aooh.f(aoinVar2, "memoizePrefetchLegacyCustomGreeting");
        this.b = aossVar;
        this.c = aolrVar;
        this.d = jbmVar;
        this.m = aogcVar;
        this.e = jccVar;
        this.l = twpVar;
        this.n = jcfVar;
        this.f = rlvVar;
        this.g = aolrVar2;
        this.t = zjmVar;
        this.o = zjsVar;
        this.h = context;
        this.p = aoinVar2;
        this.q = iviVar;
        this.i = jdkVar;
        this.r = iqmVar;
        this.j = new aiuo(new defpackage.blq(this, (aoln) null, 9));
        this.s = new aiuo(new defpackage.blq(this, (aoln) null, 10, (byte[]) null));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.jbs jbsVar;
        jbp jbpVar;
        defpackage.igp igpVar;
        alat alatVar;
        java.util.Iterator it;
        if (aolnVar instanceof defpackage.jbs) {
            jbsVar = (defpackage.jbs) aolnVar;
            int i = jbsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbsVar.c = i - Integer.MIN_VALUE;
            } else {
                jbsVar = new defpackage.jbs(this, aolnVar);
            }
        } else {
            jbsVar = new defpackage.jbs(this, aolnVar);
        }
        java.lang.Object objB = jbsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jbsVar.c;
        boolean zBooleanValue = false;
        if (i2 == 0) {
            aooc.af(objB);
            if (!this.r.b()) {
                jbm jbmVar = this.d;
                jbsVar.c = 2;
                objB = jbmVar.b(jbsVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                jbpVar = ((jbr) objB).d;
                if (jbpVar == null) {
                    jbpVar = jbp.a;
                }
                igpVar = jbpVar.e;
                if (igpVar == null) {
                    igpVar = defpackage.igp.a;
                }
                alatVar = igpVar.b;
                aooh.e(alatVar, "getIndividualModelAvaila…lityCheckResultsList(...)");
                if (!alatVar.isEmpty()) {
                    if (!(alatVar instanceof java.util.Collection)) {
                        it = alatVar.iterator();
                        do {
                            if (!it.hasNext()) {
                                zBooleanValue = true;
                                break;
                            }
                        } while (((defpackage.igo) it.next()).e);
                    } else {
                        it = alatVar.iterator();
                        do {
                            if (!it.hasNext()) {
                                zBooleanValue = true;
                                break;
                            }
                        } while (((defpackage.igo) it.next()).e);
                    }
                }
            } else {
                ivi iviVar = this.q;
                jbsVar.c = 1;
                objB = iviVar.h((defpackage.orr) null, jbsVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                zBooleanValue = ((java.lang.Boolean) objB).booleanValue();
            }
        } else if (i2 == 1) {
            aooc.af(objB);
            zBooleanValue = ((java.lang.Boolean) objB).booleanValue();
        } else if (i2 == 2) {
            aooc.af(objB);
            jbpVar = ((jbr) objB).d;
            if (jbpVar == null) {
                jbpVar = jbp.a;
            }
            igpVar = jbpVar.e;
            if (igpVar == null) {
                igpVar = defpackage.igp.a;
            }
            alatVar = igpVar.b;
            aooh.e(alatVar, "getIndividualModelAvaila…lityCheckResultsList(...)");
            if (!alatVar.isEmpty()) {
                if (!(alatVar instanceof java.util.Collection) || !alatVar.isEmpty()) {
                    it = alatVar.iterator();
                    do {
                        if (!it.hasNext()) {
                            zBooleanValue = true;
                            break;
                        }
                    } while (((defpackage.igo) it.next()).e);
                } else {
                    zBooleanValue = true;
                    break;
                }
            }
        } else {
            if (i2 == 3) {
                aooc.af(objB);
                ((java.lang.Boolean) objB).booleanValue();
                return java.lang.Boolean.valueOf(!zBooleanValue);
            }
            if (i2 != 4) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objB);
            return java.lang.Boolean.valueOf(!zBooleanValue);
        }
        a.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettingsDataService", "downloadDisclaimerModels", 234, "BeeslySettingsDataService.kt").y("Need to download disclaimer model: %b", java.lang.Boolean.valueOf(!zBooleanValue));
        if (!zBooleanValue) {
            if (this.r.b()) {
                ivi iviVar2 = this.q;
                jbsVar.c = 3;
                objB = iviVar2.b(jbsVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                ((java.lang.Boolean) objB).booleanValue();
            } else {
                defpackage.jcf jcfVar = this.n;
                jbsVar.c = 4;
                objB = aoov.aj(jcfVar.b, new defpackage.jce(jcfVar, null), jbsVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
            }
        }
        return java.lang.Boolean.valueOf(!zBooleanValue);
    }

    public final java.lang.Object b(aoln aolnVar) {
        if (((java.lang.Boolean) this.p.a()).booleanValue()) {
            java.lang.Object objA = this.s.a(aolnVar);
            if (objA == aolu.a) {
                return objA;
            }
        } else {
            java.lang.Object objC = c(aolnVar);
            if (objC == aolu.a) {
                return objC;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:25:0x008f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(aoln r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.jbt
            if (r0 == 0) goto L13
            r0 = r12
            jbt r0 = (defpackage.jbt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jbt r0 = new jbt
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.b
            aolu r1 = aolu.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r2 = r0.a
            aooc.af(r12)
            goto L71
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            android.telecom.PhoneAccountHandle r2 = r0.e
            java.lang.Object r5 = r0.a
            aooc.af(r12)
            r7 = r2
            r2 = r5
            goto L91
        L41:
            aooc.af(r12)
            goto L6b
        L45:
            aooc.af(r12)
            aimz r12 = defpackage.jbv.a
            ainm r12 = r12.b()
            r2 = 176(0xb0, float:2.47E-43)
            java.lang.String r6 = "BeeslySettingsDataService.kt"
            java.lang.String r7 = "com/android/dialer/beesly/impl/settings/service/BeeslySettingsDataService"
            java.lang.String r8 = "prefetchLegacyCustomGreetingInternal"
            ainm r12 = r12.l(r7, r8, r2, r6)
            aimw r12 = (aimw) r12
            java.lang.String r2 = "Prefetching legacy custom greetings"
            r12.v(r2)
            zjs r12 = r11.o
            r0.d = r5
            java.lang.Object r12 = r12.m(r0)
            if (r12 == r1) goto Lbb
        L6b:
            java.util.List r12 = (java.util.List) r12
            java.util.Iterator r2 = r12.iterator()
        L71:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto Lb9
            java.lang.Object r12 = r2.next()
            android.telecom.PhoneAccountHandle r12 = (android.telecom.PhoneAccountHandle) r12
            zjm r5 = r11.t
            ajcq r5 = r5.n(r12)
            r0.a = r2
            r0.e = r12
            r0.d = r4
            java.lang.Object r5 = aosv.D(r5, r0)
            if (r5 == r1) goto Lbb
            r7 = r12
            r12 = r5
        L91:
            voy r12 = (voy) r12
            if (r12 == 0) goto Lb6
            android.net.Uri r8 = r12.d
            if (r8 == 0) goto Lb6
            r0.a = r2
            r12 = 0
            r0.e = r12
            r0.d = r3
            aolr r12 = r11.g
            hyq r5 = new hyq
            r9 = 0
            r10 = 10
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r11 = aoov.aj(r12, r5, r0)
            if (r11 == r1) goto Lb3
            aojh r11 = aojh.a
        Lb3:
            if (r11 == r1) goto Lbb
            goto Lb7
        Lb6:
            r6 = r11
        Lb7:
            r11 = r6
            goto L71
        Lb9:
            aojh r1 = aojh.a
        Lbb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbv.c(aoln):java.lang.Object");
    }

    public final void d() {
        this.m.t(ajcm.a, defpackage.jcc.a);
    }
}
