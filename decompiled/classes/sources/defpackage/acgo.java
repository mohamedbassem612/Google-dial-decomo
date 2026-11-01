package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acgo implements defpackage.adzf {
    private static final java.util.List a;
    private static final java.util.Map b;
    private final defpackage.acal c;
    private final defpackage.amwu d;
    private final android.content.Context e;
    private final defpackage.aduu f;
    private final defpackage.aoin g;
    private final java.lang.String h;
    private final long i;
    private final long j;
    private final defpackage.aogc k;

    static {
        defpackage.aiof.i("GnpSdk");
        a = defpackage.ajsz.bb(defpackage.akgw.ANDROID_CAMERA, defpackage.akgw.ANDROID_ACCESS_FINE_LOCATION);
        b = defpackage.ajsz.aO(new defpackage.aoiu(33, defpackage.ajsz.aY(defpackage.akgw.ANDROID_POST_NOTIFICATIONS)), new defpackage.aoiu(29, defpackage.ajsz.bb(defpackage.akgw.ANDROID_ACCESS_BACKGROUND_LOCATION, defpackage.akgw.ANDROID_ACTIVITY_RECOGNITION)));
    }

    public acgo(defpackage.aogc aogcVar, defpackage.acal acalVar, defpackage.amwu amwuVar, android.content.Context context, defpackage.aduu aduuVar, defpackage.aoin aoinVar) {
        defpackage.aooh.f(aogcVar, "gnpAccountUtil");
        defpackage.aooh.f(acalVar, "clearcutLogger");
        defpackage.aooh.f(amwuVar, "gnpJobSchedulingApi");
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aduuVar, "gnpConfig");
        defpackage.aooh.f(aoinVar, "growthkitEnabled");
        this.k = aogcVar;
        this.c = acalVar;
        this.d = amwuVar;
        this.e = context;
        this.f = aduuVar;
        this.g = aoinVar;
        this.h = "GK_PERMISSIONS_STATE_LOGGING";
        this.i = defpackage.anfw.a.eZ().d();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        this.j = 3600000L;
    }

    @Override // defpackage.adzf
    public final int a() {
        return 14;
    }

    @Override // defpackage.adzf
    public final long b() {
        return this.i;
    }

    @Override // defpackage.adzf
    public final java.lang.Long c() {
        return java.lang.Long.valueOf(this.j);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:43:0x0102  */
    /* JADX WARN: Code duplicated, block: B:45:0x0108  */
    /* JADX WARN: Code duplicated, block: B:47:0x0114  */
    /* JADX WARN: Code duplicated, block: B:50:0x0125  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[LOOP:1: B:54:0x0145->B:56:0x014b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0162  */
    /* JADX WARN: Code duplicated, block: B:64:0x016c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [acal] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.Map] */
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
    @Override // defpackage.adzf
    public final java.lang.Object d(android.os.Bundle bundle, defpackage.aoln aolnVar) {
        acgn acgnVar;
        ?? r11;
        defpackage.adtz adtzVar;
        int iR;
        java.util.List list;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.Iterator it;
        java.util.Iterator it2;
        if (aolnVar instanceof acgn) {
            acgnVar = (acgn) aolnVar;
            int i = acgnVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                acgnVar.d = i - Integer.MIN_VALUE;
            } else {
                acgnVar = new acgn(this, aolnVar);
            }
        } else {
            acgnVar = new acgn(this, aolnVar);
        }
        java.lang.Object obj = acgnVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = acgnVar.d;
        boolean z = true;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (((java.lang.Boolean) this.g.a()).booleanValue()) {
                java.util.List list2 = a;
                java.util.Map map = b;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry : map.entrySet()) {
                    if (android.os.Build.VERSION.SDK_INT >= ((java.lang.Number) entry.getKey()).intValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                java.util.List listBT = defpackage.ajsz.bT(list2, defpackage.ajsz.bm(linkedHashMap.values()));
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(defpackage.aooc.t(defpackage.ajsz.aL(defpackage.ajsz.bl(listBT, 10)), 16));
                for (java.lang.Object obj2 : listBT) {
                    linkedHashMap2.put(obj2, defpackage.agab.bA(this.e, abxl.x((defpackage.akgw) obj2)) ? akgv.b : akgv.c);
                }
                defpackage.aigf aigfVarBw = defpackage.ahvr.bw(linkedHashMap2);
                defpackage.aogc aogcVar = this.k;
                acgnVar.a = aigfVarBw;
                acgnVar.d = 2;
                java.lang.Object objW = aogcVar.W(acgnVar);
                if (objW == aoluVar) {
                    return aoluVar;
                }
                obj = objW;
                r11 = aigfVarBw;
                adtzVar = (defpackage.adtz) obj;
                iR = defpackage.anty.R(adtzVar);
                if (iR != 0) {
                    if (iR == 1) {
                        return (defpackage.adtv) adtzVar;
                    }
                    throw new defpackage.aois();
                }
                list = (java.util.List) ((defpackage.adub) adtzVar).a;
                if (!r11.isEmpty()) {
                    ?? r0 = this.c;
                    arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj3 : list) {
                        if (((defpackage.aduy) obj3).b() instanceof com.google.android.libraries.notifications.platform.registration.Gaia) {
                            arrayList.add(obj3);
                        }
                    }
                    arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((defpackage.aduy) it.next()).b);
                    }
                    if (!(list instanceof java.util.Collection)) {
                        it2 = list.iterator();
                        do {
                            if (!it2.hasNext()) {
                                z = false;
                                break;
                            }
                        } while (!(((defpackage.aduy) it2.next()).b() instanceof com.google.android.libraries.notifications.platform.registration.Zwieback));
                    } else {
                        it2 = list.iterator();
                        do {
                            if (!it2.hasNext()) {
                                z = false;
                                break;
                            }
                        } while (!(((defpackage.aduy) it2.next()).b() instanceof com.google.android.libraries.notifications.platform.registration.Zwieback));
                    }
                    java.lang.String str = this.f.a;
                    defpackage.aooh.e(str, "getClientId(...)");
                    r0.c(r11, arrayList2, z, str);
                }
            } else {
                java.lang.Object objA = this.d.a();
                defpackage.aooh.e(objA, "get(...)");
                acgnVar.d = 1;
                if (((defpackage.adzh) objA).a(14, acgnVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else if (i2 == 1) {
            defpackage.aooc.af(obj);
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj4 = acgnVar.a;
            defpackage.aooc.af(obj);
            r11 = obj4;
            adtzVar = (defpackage.adtz) obj;
            iR = defpackage.anty.R(adtzVar);
            if (iR != 0) {
                if (iR == 1) {
                    return (defpackage.adtv) adtzVar;
                }
                throw new defpackage.aois();
            }
            list = (java.util.List) ((defpackage.adub) adtzVar).a;
            if (!r11.isEmpty()) {
                ?? r1 = this.c;
                arrayList = new java.util.ArrayList();
                while (r3.hasNext()) {
                    if (((defpackage.aduy) obj3).b() instanceof com.google.android.libraries.notifications.platform.registration.Gaia) {
                        arrayList.add(obj3);
                    }
                }
                arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((defpackage.aduy) it.next()).b);
                }
                if (!(list instanceof java.util.Collection) && list.isEmpty()) {
                    z = false;
                    break;
                }
                it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                } while (!(((defpackage.aduy) it2.next()).b() instanceof com.google.android.libraries.notifications.platform.registration.Zwieback));
                java.lang.String str2 = this.f.a;
                defpackage.aooh.e(str2, "getClientId(...)");
                r1.c(r11, arrayList2, z, str2);
            }
        }
        return new defpackage.adub(defpackage.aojh.a);
    }

    @Override // defpackage.adzf
    public final java.lang.String e() {
        return this.h;
    }

    @Override // defpackage.adzf
    public final boolean f() {
        return true;
    }

    @Override // defpackage.adzf
    public final boolean g() {
        return false;
    }

    @Override // defpackage.adzf
    public final int h() {
        return 1;
    }

    @Override // defpackage.adzf
    public final void i() {
    }

    @Override // defpackage.adzf
    public final /* synthetic */ void j() {
    }
}
