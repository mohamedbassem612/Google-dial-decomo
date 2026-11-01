package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nxz {
    public static final /* synthetic */ int a = 0;
    private static final aimz b = aimz.i("com/android/dialer/duo/data/synclet/PhoneNumberCollector");
    private static final android.net.Uri c;
    private static final java.lang.String[] d;
    private static final android.net.Uri e;
    private static final java.lang.String[] f;
    private final ojo g;
    private final ajct h;
    private final ahbv i;

    static {
        android.net.Uri uriBuild = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI.buildUpon().appendQueryParameter("remove_duplicate_entries", "true").build();
        aooh.e(uriBuild, "build(...)");
        c = uriBuild;
        d = new java.lang.String[]{"_id", "data1", "data4"};
        e = android.provider.CallLog.Calls.CONTENT_URI.buildUpon().appendQueryParameter("limit", "999").build();
        f = new java.lang.String[]{"number", "countryiso"};
    }

    public nxz(ojo ojoVar, ajct ajctVar, ahbv ahbvVar) {
        aooh.f(ojoVar, "dialerContentResolver");
        aooh.f(ajctVar, "lightweightExecutor");
        aooh.f(ahbvVar, "dialerPhoneNumbers");
        this.g = ojoVar;
        this.h = ajctVar;
        this.i = ahbvVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00df  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Set] */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.nxv nxvVar;
        defpackage.nxz nxzVar;
        java.lang.Object obj;
        defpackage.nxz nxzVar2;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        ?? r1;
        ?? r0;
        ?? r11;
        if (aolnVar instanceof defpackage.nxv) {
            nxvVar = (defpackage.nxv) aolnVar;
            int i = nxvVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                nxvVar.f = i - Integer.MIN_VALUE;
            } else {
                nxvVar = new defpackage.nxv(this, aolnVar);
            }
        } else {
            nxvVar = new defpackage.nxv(this, aolnVar);
        }
        defpackage.nxv nxvVar2 = nxvVar;
        java.lang.Object objB = nxvVar2.d;
        aolu aoluVar = aolu.a;
        int i2 = nxvVar2.f;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    defpackage.nxz nxzVar3 = nxvVar2.g;
                    java.lang.Object obj6 = nxvVar2.c;
                    java.lang.Object obj7 = nxvVar2.b;
                    java.lang.Object obj8 = nxvVar2.a;
                    aooc.af(objB);
                    nxzVar = this;
                    nxzVar2 = nxzVar3;
                    obj3 = obj6;
                    obj2 = obj7;
                    obj = obj8;
                } else if (i2 == 2) {
                    java.lang.Object obj9 = nxvVar2.c;
                    java.lang.Object obj10 = nxvVar2.b;
                    java.lang.Object obj11 = nxvVar2.a;
                    aooc.af(objB);
                    nxzVar = this;
                    obj4 = obj10;
                    r1 = obj9;
                    obj5 = obj11;
                    r1.addAll((java.util.Collection) objB);
                    android.net.Uri uri = c;
                    rsr rsrVar = new rsr();
                    rsrVar.aC(new kaw("data4").aH("IS NOT NULL"));
                    rsr rsrVarAB = rsrVar.aB();
                    java.lang.String[] strArr = d;
                    nxvVar2.a = obj5;
                    nxvVar2.b = obj4;
                    nxvVar2.c = null;
                    nxvVar2.f = 3;
                    objB = nxzVar.d(uri, rsrVarAB, strArr, nxvVar2);
                    if (objB != aoluVar) {
                        return aoluVar;
                    }
                    r0 = obj5;
                    r11 = obj4;
                } else {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Object obj12 = nxvVar2.b;
                    java.lang.Object obj13 = nxvVar2.a;
                    aooc.af(objB);
                    r0 = obj13;
                    r11 = obj12;
                }
                r11.addAll((java.util.Collection) objB);
                return ajsz.bZ((java.lang.Iterable) r0);
            }
            aooc.af(objB);
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            android.net.Uri uri2 = e;
            aooh.e(uri2, "CALL_LOG_CONTENT_URI");
            rsr rsrVar2 = new rsr();
            rsrVar2.aC(new kaw("number").aJ());
            rsr rsrVarAB2 = rsrVar2.aB();
            java.lang.String[] strArr2 = f;
            nxvVar2.a = linkedHashSet;
            nxvVar2.b = linkedHashSet;
            nxvVar2.c = linkedHashSet;
            nxvVar2.g = this;
            nxvVar2.f = 1;
            nxzVar = this;
            java.lang.Object objC = nxzVar.c(uri2, rsrVarAB2, strArr2, "date DESC", nxvVar2);
            if (objC == aoluVar) {
                return aoluVar;
            }
            java.util.LinkedHashSet linkedHashSet2 = linkedHashSet;
            java.util.LinkedHashSet linkedHashSet3 = linkedHashSet2;
            obj = linkedHashSet3;
            objB = objC;
            nxzVar2 = nxzVar;
            obj3 = linkedHashSet2;
            obj2 = linkedHashSet3;
            nxvVar2.a = obj;
            nxvVar2.b = obj2;
            nxvVar2.c = obj3;
            nxvVar2.g = null;
            nxvVar2.f = 2;
            objB = nxzVar2.b((java.util.Map) objB, nxvVar2);
            if (objB == aoluVar) {
                return aoluVar;
            }
            obj4 = obj2;
            obj5 = obj;
            r1 = obj3;
            r1.addAll((java.util.Collection) objB);
            android.net.Uri uri3 = c;
            rsr rsrVar3 = new rsr();
            rsrVar3.aC(new kaw("data4").aH("IS NOT NULL"));
            rsr rsrVarAB3 = rsrVar3.aB();
            java.lang.String[] strArr3 = d;
            nxvVar2.a = obj5;
            nxvVar2.b = obj4;
            nxvVar2.c = null;
            nxvVar2.f = 3;
            objB = nxzVar.d(uri3, rsrVarAB3, strArr3, nxvVar2);
            if (objB != aoluVar) {
                return aoluVar;
            }
            r0 = obj5;
            r11 = obj4;
            r11.addAll((java.util.Collection) objB);
            return ajsz.bZ((java.lang.Iterable) r0);
        } catch (aguh e2) {
            b.b().k(e2).l("com/android/dialer/duo/data/synclet/PhoneNumberCollector", "collectPhoneNumbers", 53, "PhoneNumberCollector.kt").v("Failed to collect phone numbers from contacts or call log.");
            return aokc.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0073 -> B:20:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.Map r7, aoln r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.nxw
            if (r0 == 0) goto L13
            r0 = r8
            nxw r0 = (defpackage.nxw) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            nxw r0 = new nxw
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            aolu r1 = aolu.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.c
            java.lang.Object r2 = r0.b
            java.lang.Object r4 = r0.a
            aooc.af(r8)
            goto L74
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            aooc.af(r8)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
            r7 = r8
        L47:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L82
            java.lang.Object r8 = r2.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            ahbv r4 = r6.i
            java.lang.Object r5 = r8.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            ajcq r8 = r4.v(r5, r8)
            r0.a = r7
            r0.b = r2
            r0.c = r7
            r0.f = r3
            java.lang.Object r8 = aosv.D(r8, r0)
            if (r8 == r1) goto L83
            r4 = r7
        L74:
            hkd r8 = (defpackage.hkd) r8
            java.lang.String r8 = r8.c
            java.lang.String r5 = "getNormalizedNumber(...)"
            aooh.e(r8, r5)
            r7.add(r8)
            r7 = r4
            goto L47
        L82:
            r1 = r7
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxz.b(java.util.Map, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(android.net.Uri uri, rsr rsrVar, java.lang.String[] strArr, java.lang.String str, aoln aolnVar) {
        defpackage.nxx nxxVar;
        if (aolnVar instanceof defpackage.nxx) {
            nxxVar = (defpackage.nxx) aolnVar;
            int i = nxxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nxxVar.c = i - Integer.MIN_VALUE;
            } else {
                nxxVar = new defpackage.nxx(this, aolnVar);
            }
        } else {
            nxxVar = new defpackage.nxx(this, aolnVar);
        }
        java.lang.Object objD = nxxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nxxVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajck ajckVarH = this.g.d(uri, strArr, (java.lang.String) rsrVar.b, (java.lang.String[]) rsrVar.a, str).c(ahqx.e(new kwb(4)), this.h).h();
            aooh.e(ajckVarH, "finishToFuture(...)");
            nxxVar.c = 1;
            objD = aosv.D(ajckVarH, nxxVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        aooh.e(objD, "await(...)");
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(android.net.Uri uri, rsr rsrVar, java.lang.String[] strArr, aoln aolnVar) {
        defpackage.nxy nxyVar;
        if (aolnVar instanceof defpackage.nxy) {
            nxyVar = (defpackage.nxy) aolnVar;
            int i = nxyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nxyVar.c = i - Integer.MIN_VALUE;
            } else {
                nxyVar = new defpackage.nxy(this, aolnVar);
            }
        } else {
            nxyVar = new defpackage.nxy(this, aolnVar);
        }
        java.lang.Object objD = nxyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nxyVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajck ajckVarH = this.g.d(uri, strArr, (java.lang.String) rsrVar.b, (java.lang.String[]) rsrVar.a, (java.lang.String) null).c(ahqx.e(new kwb(3)), this.h).h();
            aooh.e(ajckVarH, "finishToFuture(...)");
            nxyVar.c = 1;
            objD = aosv.D(ajckVarH, nxyVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        aooh.e(objD, "await(...)");
        return objD;
    }
}
