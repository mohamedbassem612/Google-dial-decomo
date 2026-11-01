package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acaw implements defpackage.acal {
    public static final /* synthetic */ int a = 0;
    private static final java.util.Set b = defpackage.ajsz.cW(new defpackage.akht[]{defpackage.akht.PROMO_TRIGGERED, defpackage.akht.PROMO_DISABLED_BY_PHENOTYPE, defpackage.akht.PROMO_EXPIRED, defpackage.akht.PROMO_TARGETING_EVALUATED, defpackage.akht.PROMO_CONDITIONS_EVALUATED, defpackage.akht.PROMO_NOT_SHOWN_DEVICE_CAPPED, defpackage.akht.PROMO_NOT_SHOWN, defpackage.akht.PROMO_COUNTERFACTUAL_DROPPED_ON_RECEIVE, defpackage.akht.PROMO_SENT_FOR_RENDERING, defpackage.akht.PROMO_SENT_TO_COLLABORATOR_CALLBACK, defpackage.akht.PROMO_SHOWN, defpackage.akht.PROMO_USER_ACTION, defpackage.akht.PROMO_USER_DISMISSED, defpackage.akht.PROMO_SYSTEM_DISMISSED, defpackage.akht.PROMO_DISMISSED_BY_API, defpackage.akht.PROMO_DELAYED_TRIGGERING_EVENT_RETRIGGERED, defpackage.akht.PROMO_DELAYED_TRIGGERING_EVENT_EXPIRED});
    private static final defpackage.aiof c = defpackage.aiof.i("GnpSdk");
    private static final java.security.SecureRandom d = new java.security.SecureRandom();
    private final java.lang.String e;
    private final android.content.Context f;
    private final defpackage.amwu g;
    private final defpackage.aduu h;
    private final defpackage.ahyn i;
    private final defpackage.aoin j;
    private final defpackage.amwu k;
    private final defpackage.amwu l;
    private final defpackage.adao m;
    private final defpackage.adao n;

    public acaw(defpackage.adao adaoVar, java.lang.String str, android.content.Context context, defpackage.amwu amwuVar, defpackage.aduu aduuVar, defpackage.ahyn ahynVar, defpackage.aoin aoinVar, defpackage.amwu amwuVar2, defpackage.amwu amwuVar3, defpackage.adao adaoVar2, defpackage.aazc aazcVar) {
        if (adaoVar == null) {
            defpackage.aooh.i("clearcutLoggerProvider");
        }
        if (str == null) {
            defpackage.aooh.i("appPackageName");
        }
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (amwuVar == null) {
            defpackage.aooh.i("clientStreamz");
        }
        if (aduuVar == null) {
            defpackage.aooh.i("gnpConfig");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("gnpEnvironment");
        }
        if (amwuVar2 == null) {
            defpackage.aooh.i("gnpFetchOnlyAccountStorage");
        }
        if (amwuVar3 == null) {
            defpackage.aooh.i("gnpFcmAccountStorage");
        }
        if (adaoVar2 == null) {
            defpackage.aooh.i("gnpFcmRegistrationDataHelper");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        this.n = adaoVar;
        this.e = str;
        this.f = context;
        this.g = amwuVar;
        this.h = aduuVar;
        this.i = ahynVar;
        this.j = aoinVar;
        this.k = amwuVar2;
        this.l = amwuVar3;
        this.m = adaoVar2;
    }

    private final void A(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, defpackage.akht akhtVar, akhu akhuVar) {
        B(promoContext.e(), akhtVar, akhuVar);
    }

    private final void B(java.lang.String str, defpackage.akht akhtVar, akhu akhuVar) {
        android.content.Context context = this.f;
        java.lang.String strA = acax.a(context);
        if (strA == null) {
            strA = "";
        }
        ajyi ajyiVarI = akky.i(akhuVar.L());
        java.lang.String str2 = this.e;
        defpackage.aooh.f(str2, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) ajyiVarI.a;
        akzxVar.u();
        akhu akhuVar2 = akzxVar.b;
        j$.util.Objects.requireNonNull(str2);
        akhuVar2.b |= 1;
        akhuVar2.d = str2;
        akzxVar.u();
        akhu akhuVar3 = akzxVar.b;
        akhuVar3.b |= 4;
        akhuVar3.e = 1001915728;
        akzxVar.u();
        akhu akhuVar4 = akzxVar.b;
        j$.util.Objects.requireNonNull(strA);
        akhuVar4.b |= 8;
        akhuVar4.f = strA;
        java.lang.String strValueOf = java.lang.String.valueOf(d.nextInt(1000000000));
        defpackage.aooh.f(strValueOf, "value");
        akzxVar.u();
        akhu akhuVar5 = akzxVar.b;
        j$.util.Objects.requireNonNull(strValueOf);
        akhuVar5.b |= 64;
        akhuVar5.g = strValueOf;
        defpackage.albh albhVarC = ajyiVarI.c();
        int i = 0;
        if (b.contains(akhtVar)) {
            ((defpackage.afip) ((defpackage.aeey) this.g.a()).i.eZ()).b(1L, str2, akhtVar.name());
        }
        defpackage.zzc zzcVarH = ((defpackage.zzd) this.n.o(str)).h(albhVarC, defpackage.abtl.b(context, new akih()));
        zzcVarH.m(akhtVar.cT);
        zzcVarH.d();
        defpackage.aooh.f(c, "<this>");
        if (albhVarC != null) {
            java.lang.String strX = defpackage.aesg.x(albhVarC);
            int iCeil = (int) java.lang.Math.ceil(((double) strX.length()) / 3500.0d);
            while (i < iCeil) {
                int i2 = i * 3500;
                i++;
                defpackage.aooh.e(strX.substring(i2, java.lang.Math.min(i * 3500, strX.length())), "substring(...)");
            }
        }
    }

    private final int C() {
        int iOrdinal = ((defpackage.adxz) this.j.a()).ordinal();
        if (iOrdinal == 0) {
            return 4;
        }
        int i = 2;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return 5;
            }
            i = 3;
            if (iOrdinal != 3) {
                if (iOrdinal == 4) {
                    return 6;
                }
                if (iOrdinal == 5) {
                    return 7;
                }
                throw new defpackage.aois();
            }
        }
        return i;
    }

    private final akig x(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext) {
        ajyi ajyiVarH = akky.H(akig.c.m());
        akhq akhqVar = promoContext.c().c;
        if (akhqVar == null) {
            akhqVar = akhq.a;
        }
        defpackage.aooh.e(akhqVar, "getPromoId(...)");
        java.lang.Object obj = ajyiVarH.a;
        int i = akhqVar.b;
        defpackage.akzx akzxVar = (defpackage.akzx) obj;
        akzxVar.u();
        akig akigVar = akzxVar.b;
        akigVar.d |= 1;
        akigVar.f = i;
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(akigVar.e);
        defpackage.aooh.e(listUnmodifiableList, "getMendelIdsList(...)");
        new defpackage.alct(listUnmodifiableList);
        defpackage.alak alakVar = akhqVar.c;
        defpackage.aooh.e(alakVar, "getMendelIdList(...)");
        defpackage.aooh.f(alakVar, "values");
        akzxVar.u();
        akig akigVar2 = akzxVar.b;
        defpackage.alak alakVar2 = akigVar2.e;
        if (!alakVar2.c()) {
            akigVar2.e = defpackage.alad.H(alakVar2);
        }
        defpackage.akyl.i(alakVar, akigVar2.e);
        aksc akscVarD = promoContext.d();
        if (akscVarD != null && akscVarD.e != 0) {
            java.lang.String str = akscVarD.c;
            defpackage.aooh.e(str, "getIdentifier(...)");
            defpackage.aooh.f(str, "value");
            akzxVar.u();
            akig akigVar3 = akzxVar.b;
            j$.util.Objects.requireNonNull(str);
            akigVar3.d |= 16;
            akigVar3.h = str;
            long j = akscVarD.e;
            akzxVar.u();
            akig akigVar4 = akzxVar.b;
            akigVar4.d |= 32;
            akigVar4.i = j;
            ajyiVarH.ap(C());
            defpackage.akzc akzcVar = akscVarD.f;
            defpackage.aooh.e(akzcVar, "getOpaqueBackendData(...)");
            defpackage.aooh.f(akzcVar, "value");
            akzxVar.u();
            akig akigVar5 = akzxVar.b;
            j$.util.Objects.requireNonNull(akzcVar);
            akigVar5.d |= 4;
            akigVar5.g = akzcVar;
        }
        java.lang.String str2 = this.h.a;
        if (str2 != null && str2.length() != 0) {
            ajyiVarH.ai(str2);
        }
        promoContext.g();
        if (promoContext.a() != 0) {
            j$.time.Duration durationBetween = j$.time.Duration.between(j$.time.Instant.ofEpochMilli(promoContext.a()), j$.time.Instant.now());
            defpackage.aooh.e(durationBetween, "between(...)");
            defpackage.akzm akzmVarAt = defpackage.aooc.at(durationBetween);
            defpackage.aooh.f(akzmVarAt, "value");
            akzxVar.u();
            akig akigVar6 = akzxVar.b;
            j$.util.Objects.requireNonNull(akzmVarAt);
            akigVar6.u = akzmVarAt;
            akigVar6.d |= 262144;
        }
        akqp akqpVarY = y(promoContext);
        if (akqpVarY != null) {
            ajyiVarH.am(akqpVarY);
        }
        return ajyiVarH.ah();
    }

    private final akqp y(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext) {
        return z(promoContext.e(), promoContext.f());
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [adzw, java.lang.Object] */
    private final akqp z(java.lang.String str, java.lang.String str2) {
        boolean z = false;
        if (str != null && str.length() != 0 && (angv.a.b().a() || str2 == null || str2.length() == 0)) {
            z = true;
        }
        defpackage.xtq xtqVarB = akmr.B(akqp.a.m());
        xtqVarB.aw();
        defpackage.adtz adtzVarA = ((defpackage.ahys) this.i).a.a(z);
        if (adtzVarA instanceof defpackage.adtv) {
            ((defpackage.aiob) ((defpackage.aiob) c.d()).k(((defpackage.adtv) adtzVarA).b())).v("Failed creating the delivery address log for this event, leaving it empty");
        }
        if (adtzVarA instanceof defpackage.adub) {
            xtqVarB.au((akpz) ((defpackage.adub) adtzVarA).a);
        }
        if (str2 != null) {
            xtqVarB.av(str2);
        }
        return xtqVarB.at();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.acal
    public final java.lang.Object a(java.lang.String str, akic akicVar, boolean z, java.lang.String str2, java.lang.String str3, java.util.List list, defpackage.aoln aolnVar) {
        acav acavVar;
        ajyi ajyiVarI;
        java.lang.Object obj;
        java.lang.String str4;
        java.lang.String str5;
        boolean z2;
        ajyi ajyiVar;
        if (aolnVar instanceof acav) {
            acavVar = (acav) aolnVar;
            int i = acavVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                acavVar.d = i - Integer.MIN_VALUE;
            } else {
                acavVar = new acav(this, aolnVar);
            }
        } else {
            acavVar = new acav(this, aolnVar);
        }
        java.lang.Object obj2 = acavVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = acavVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            ajyiVarI = akky.i(akhu.a.m());
            acavVar.e = str;
            acavVar.f = akicVar;
            acavVar.g = str2;
            acavVar.h = str3;
            acavVar.i = ajyiVarI;
            acavVar.j = ajyiVarI;
            acavVar.a = z;
            acavVar.d = 1;
            java.lang.Object objV = v(str, list, acavVar);
            if (objV == aoluVar) {
                return aoluVar;
            }
            obj = objV;
            str4 = str3;
            str5 = str2;
            z2 = z;
            ajyiVar = ajyiVarI;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = acavVar.a;
            ajyi ajyiVar2 = acavVar.j;
            ajyi ajyiVar3 = acavVar.i;
            java.lang.String str6 = acavVar.h;
            java.lang.String str7 = acavVar.g;
            akic akicVar2 = acavVar.f;
            java.lang.String str8 = acavVar.e;
            defpackage.aooc.af(obj2);
            ajyiVarI = ajyiVar2;
            str = str8;
            obj = obj2;
            ajyiVar = ajyiVar3;
            akicVar = akicVar2;
            str4 = str6;
            str5 = str7;
            z2 = z3;
        }
        ajyi ajyiVarH = akky.H(((akig) obj).L());
        defpackage.aooh.f(akicVar, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) ajyiVarH.a;
        akzxVar.u();
        akig akigVar = akzxVar.b;
        akigVar.s = akicVar.k;
        akigVar.d |= 65536;
        if (!z2 && str5 != null) {
            akzxVar.u();
            akig akigVar2 = akzxVar.b;
            j$.util.Objects.requireNonNull(str5);
            akigVar2.d |= 4194304;
            akigVar2.x = str5;
            if (str4 != null) {
                akzxVar.u();
                akig akigVar3 = akzxVar.b;
                j$.util.Objects.requireNonNull(str4);
                akigVar3.d |= 8388608;
                akigVar3.y = str4;
            }
        }
        ajyiVarI.d(ajyiVarH.ah());
        B(str, z2 ? defpackage.akht.PROMO_SYNC_SUCCESS : defpackage.akht.PROMO_SYNC_ERROR, ajyiVar.c());
        return defpackage.aojh.a;
    }

    @Override // defpackage.acal
    public final void b(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, boolean z, defpackage.akgw akgwVar) {
        defpackage.aooh.f(akgwVar, "permission");
        ajyi ajyiVarI = akky.i(akhu.a.m());
        defpackage.akzx akzxVarM = akhv.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        int iC = C();
        akzxVarM.u();
        akhv akhvVar = akzxVarM.b;
        akhvVar.e = iC - 1;
        akhvVar.b |= 8;
        ajyi ajyiVarI2 = akky.I(akhw.a.m());
        ajyiVarI2.ar(z ? akgv.b : akgv.c);
        ajyiVarI2.as(akgwVar);
        akhw akhwVarAq = ajyiVarI2.aq();
        defpackage.aooh.f(akhwVarAq, "value");
        akzxVarM.u();
        akhv akhvVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(akhwVarAq);
        akhvVar2.c = akhwVarAq;
        akhvVar2.b |= 2;
        aksc akscVarD = promoContext.d();
        if (akscVarD != null) {
            java.lang.String str = akscVarD.c;
            defpackage.aooh.e(str, "getIdentifier(...)");
            defpackage.aooh.f(str, "value");
            akzxVarM.u();
            akhv akhvVar3 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            akhvVar3.b |= 64;
            akhvVar3.h = str;
            long j = akscVarD.e;
            akzxVarM.u();
            akhv akhvVar4 = akzxVarM.b;
            akhvVar4.b |= 4;
            akhvVar4.d = j;
            defpackage.akzc akzcVar = akscVarD.f;
            defpackage.aooh.e(akzcVar, "getOpaqueBackendData(...)");
            defpackage.aooh.f(akzcVar, "value");
            akzxVarM.u();
            akhv akhvVar5 = akzxVarM.b;
            j$.util.Objects.requireNonNull(akzcVar);
            akhvVar5.b |= 128;
            akhvVar5.i = akzcVar;
        }
        java.lang.String str2 = this.h.a;
        if (str2 != null && str2.length() != 0) {
            akzxVarM.u();
            akhv akhvVar6 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            akhvVar6.b |= 32;
            akhvVar6.g = str2;
        }
        akqp akqpVarY = y(promoContext);
        if (akqpVarY != null) {
            akzxVarM.u();
            akhv akhvVar7 = akzxVarM.b;
            j$.util.Objects.requireNonNull(akqpVarY);
            akhvVar7.f = akqpVarY;
            akhvVar7.b |= 16;
        }
        akhv akhvVarR = akzxVarM.r();
        defpackage.aooh.e(akhvVarR, "build(...)");
        akhv akhvVar8 = akhvVarR;
        defpackage.aooh.f(akhvVar8, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) ajyiVarI.a;
        akzxVar.u();
        akhu akhuVar = akzxVar.b;
        j$.util.Objects.requireNonNull(akhvVar8);
        akhuVar.i = akhvVar8;
        akhuVar.b |= Integer.MIN_VALUE;
        A(promoContext, z ? defpackage.akht.USER_AUTHORIZED_PERMISSION : defpackage.akht.USER_DENIED_PERMISSION, ajyiVarI.c());
    }

    @Override // defpackage.acal
    public final void c(java.util.Map map, java.util.List list, boolean z, java.lang.String str) {
        defpackage.aooh.f(map, "userPermissionsMap");
        defpackage.aooh.f(str, "clientId");
        ajyi ajyiVarI = akky.i(akhu.a.m());
        defpackage.akzx akzxVarM = akhs.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(akzxVarM.b.c);
        defpackage.aooh.e(listUnmodifiableList, "getPermissionStateList(...)");
        new defpackage.alct(listUnmodifiableList);
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            ajyi ajyiVarI2 = akky.I(akhw.a.m());
            ajyiVarI2.as((defpackage.akgw) entry.getKey());
            ajyiVarI2.ar((akgv) entry.getValue());
            arrayList.add(ajyiVarI2.aq());
        }
        akzxVarM.u();
        akhs akhsVar = akzxVarM.b;
        defpackage.alat alatVar = akhsVar.c;
        if (!alatVar.c()) {
            akhsVar.c = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(arrayList, akhsVar.c);
        if (str.length() > 0) {
            defpackage.aooh.f(str, "value");
            akzxVarM.u();
            akhs akhsVar2 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            akhsVar2.b |= 16;
            akhsVar2.d = str;
        }
        akhs akhsVarR = akzxVarM.r();
        defpackage.aooh.e(akhsVarR, "build(...)");
        akhs akhsVar3 = akhsVarR;
        defpackage.aooh.f(akhsVar3, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) ajyiVarI.a;
        akzxVar.u();
        akhu akhuVar = akzxVar.b;
        j$.util.Objects.requireNonNull(akhsVar3);
        akhuVar.h = akhsVar3;
        akhuVar.b |= 1024;
        akhu akhuVarC = ajyiVarI.c();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            B((java.lang.String) it.next(), defpackage.akht.PERIODIC_APPLICATION_STATE, akhuVarC);
        }
        if (z) {
            B(null, defpackage.akht.PERIODIC_APPLICATION_STATE, akhuVarC);
        }
    }

    @Override // defpackage.acal
    public final void d(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, java.util.List list) {
        akhx akhxVar;
        defpackage.aooh.f(promoContext, "promoContext");
        ajyi ajyiVarI = akky.i(akhu.a.m());
        ajyi ajyiVarH = akky.H(x(promoContext).L());
        defpackage.akzx akzxVar = (defpackage.akzx) ajyiVarH.a;
        new defpackage.alct(new defpackage.alam(akzxVar.b.n, akig.b));
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.accq accqVar = (defpackage.accq) it.next();
            defpackage.aooh.f(accqVar, "condition");
            switch (accqVar.ordinal()) {
                case 0:
                    akhxVar = akhx.a;
                    break;
                case 1:
                    akhxVar = akhx.f;
                    break;
                case 2:
                    akhxVar = akhx.g;
                    break;
                case 3:
                    akhxVar = akhx.b;
                    break;
                case 4:
                    akhxVar = akhx.d;
                    break;
                case 5:
                    akhxVar = akhx.j;
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    akhxVar = akhx.k;
                    break;
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    akhxVar = akhx.l;
                    break;
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    akhxVar = akhx.m;
                    break;
                case 9:
                    akhxVar = akhx.n;
                    break;
                case 10:
                    akhxVar = akhx.o;
                    break;
                default:
                    throw new defpackage.aois();
            }
            arrayList.add(akhxVar);
        }
        akzxVar.u();
        akig akigVar = akzxVar.b;
        defpackage.alak alakVar = akigVar.n;
        if (!alakVar.c()) {
            akigVar.n = defpackage.alad.H(alakVar);
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            akigVar.n.g(((akhx) it2.next()).r);
        }
        ajyiVarI.d(ajyiVarH.ah());
        A(promoContext, defpackage.akht.PROMO_CONDITIONS_EVALUATED, ajyiVarI.c());
    }

    @Override // defpackage.acal
    public final void e(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext) {
        defpackage.aooh.f(promoContext, "promoContext");
        ajyi ajyiVarI = akky.i(akhu.a.m());
        ajyiVarI.d(x(promoContext));
        A(promoContext, defpackage.akht.PROMO_DISABLED_BY_PHENOTYPE, ajyiVarI.c());
    }

    @Override // defpackage.acal
    public final void f(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext) {
        defpackage.aooh.f(promoContext, "promoContext");
        ajyi ajyiVarI = akky.i(akhu.a.m());
        ajyiVarI.d(x(promoContext));
        A(promoContext, defpackage.akht.PROMO_EXPIRED, ajyiVarI.c());
    }

    @Override // defpackage.acal
    public final void g(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, akvk akvkVar) {
        defpackage.aooh.f(promoContext, "promoContext");
        ajyi ajyiVarI = akky.i(akhu.a.m());
        ajyi ajyiVarH = akky.H(x(promoContext).L());
        java.lang.Object objD = acan.b.d(akvkVar);
        if (objD == null) {
            throw new java.lang.IllegalStateException("PromoNotShownReason is null");
        }
        ajyiVarH.al((akib) objD);
        ajyiVarI.d(ajyiVarH.ah());
        A(promoContext, defpackage.akht.PROMO_NOT_SHOWN, ajyiVarI.c());
    }

    @Override // defpackage.acal
    public final void h(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, acaz acazVar) {
        defpackage.aooh.f(promoContext, "promoContext");
        ajyi ajyiVarI = akky.i(akhu.a.m());
        ajyi ajyiVarH = akky.H(x(promoContext).L());
        acam acamVar = acan.a;
        akvg akvgVarA = acazVar.a();
        if (akvgVarA == null) {
            throw new java.lang.IllegalStateException("DisplayProperties is null");
        }
        java.lang.Object objD = acamVar.d(akvgVarA);
        if (objD == null) {
            throw new java.lang.IllegalStateException("DisplayProperties is null");
        }
        ajyiVarH.ak((akia) objD);
        ajyiVarH.al(akib.d);
        ajyiVarI.d(ajyiVarH.ah());
        A(promoContext, defpackage.akht.PROMO_NOT_SHOWN, ajyiVarI.c());
    }

    @Override // defpackage.acal
    public final void i(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext) {
        defpackage.aooh.f(promoContext, "promoContext");
        ajyi ajyiVarI = akky.i(akhu.a.m());
        ajyiVarI.d(x(promoContext));
        A(promoContext, defpackage.akht.PROMO_NOT_SHOWN_DEVICE_CAPPED, ajyiVarI.c());
    }

    @Override // defpackage.acal
    public final void j(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, acir acirVar) {
        akib akibVar;
        defpackage.aooh.f(promoContext, "promoContext");
        if (acir.a != acirVar) {
            ajyi ajyiVarI = akky.i(akhu.a.m());
            ajyi ajyiVarH = akky.H(x(promoContext).L());
            switch (acirVar.ordinal()) {
                case 1:
                    akibVar = akib.q;
                    break;
                case 2:
                    akibVar = akib.b;
                    break;
                case 3:
                    akibVar = akib.o;
                    break;
                case 4:
                    akibVar = akib.D;
                    break;
                case 5:
                    akibVar = akib.n;
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    akibVar = akib.t;
                    break;
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    akibVar = akib.e;
                    break;
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    akibVar = akib.p;
                    break;
                case 9:
                    akibVar = akib.F;
                    break;
                case 10:
                    akibVar = akib.r;
                    break;
                case 11:
                    akibVar = akib.E;
                    break;
                case 12:
                    akibVar = akib.s;
                    break;
                default:
                    akibVar = akib.q;
                    break;
            }
            ajyiVarH.al(akibVar);
            ajyiVarI.d(ajyiVarH.ah());
            A(promoContext, defpackage.akht.PROMO_NOT_SHOWN, ajyiVarI.c());
        }
    }

    @Override // defpackage.acal
    public final void k(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext) {
        defpackage.aooh.f(promoContext, "promoContext");
        ajyi ajyiVarI = akky.i(akhu.a.m());
        ajyiVarI.d(x(promoContext));
        A(promoContext, defpackage.akht.PROMO_SENT_FOR_RENDERING, ajyiVarI.c());
    }

    @Override // defpackage.acal
    public final void l(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext) {
        defpackage.aooh.f(promoContext, "promoContext");
        ajyi ajyiVarI = akky.i(akhu.a.m());
        ajyiVarI.d(x(promoContext));
        A(promoContext, defpackage.akht.PROMO_SENT_TO_COLLABORATOR_CALLBACK, ajyiVarI.c());
    }

    @Override // defpackage.acal
    public final void m(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, acaz acazVar) {
        defpackage.aooh.f(promoContext, "promoContext");
        ajyi ajyiVarI = akky.i(akhu.a.m());
        ajyi ajyiVarH = akky.H(x(promoContext).L());
        acam acamVar = acan.a;
        akvg akvgVarA = acazVar.a();
        if (akvgVarA == null) {
            throw new java.lang.IllegalStateException("DisplayProperties is null");
        }
        java.lang.Object objD = acamVar.d(akvgVarA);
        if (objD == null) {
            throw new java.lang.IllegalStateException("DisplayProperties is null");
        }
        ajyiVarH.ak((akia) objD);
        ajyiVarI.d(ajyiVarH.ah());
        A(promoContext, defpackage.akht.PROMO_SHOWN, ajyiVarI.c());
    }

    @Override // defpackage.acal
    public final void n(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, boolean z, java.util.Set set) {
        defpackage.aooh.f(promoContext, "promoContext");
        defpackage.aooh.f(set, "targetingFailedReasons");
        ajyi ajyiVarI = akky.i(akhu.a.m());
        ajyi ajyiVarH = akky.H(x(promoContext).L());
        defpackage.akzx akzxVar = (defpackage.akzx) ajyiVarH.a;
        akzxVar.u();
        akig akigVar = akzxVar.b;
        akigVar.d |= 256;
        akigVar.l = z;
        if (z && !set.isEmpty()) {
            new defpackage.alct(new defpackage.alam(akzxVar.b.m, akig.a));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                akie akieVar = (akie) acan.d.d((akvm) it.next());
                if (akieVar != null) {
                    arrayList.add(akieVar);
                }
            }
            akzxVar.u();
            akig akigVar2 = akzxVar.b;
            defpackage.alak alakVar = akigVar2.m;
            if (!alakVar.c()) {
                akigVar2.m = defpackage.alad.H(alakVar);
            }
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                akigVar2.m.g(((akie) it2.next()).o);
            }
        }
        ajyiVarI.d(ajyiVarH.ah());
        A(promoContext, defpackage.akht.PROMO_TARGETING_EVALUATED, ajyiVarI.c());
    }

    @Override // defpackage.acal
    public final void o(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, int i) {
        defpackage.aooh.f(promoContext, "promoContext");
        ajyi ajyiVarI = akky.i(akhu.a.m());
        ajyi ajyiVarH = akky.H(x(promoContext).L());
        defpackage.akzx akzxVar = (defpackage.akzx) ajyiVarH.a;
        akzxVar.u();
        akig akigVar = akzxVar.b;
        akigVar.d |= 128;
        akigVar.k = i;
        ajyiVarI.d(ajyiVarH.ah());
        A(promoContext, defpackage.akht.PROMO_TRIGGERED, ajyiVarI.c());
    }

    @Override // defpackage.acal
    public final void p(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, akvn akvnVar, defpackage.alcf alcfVar) {
        defpackage.aooh.f(promoContext, "promoContext");
        defpackage.aooh.f(alcfVar, "interactionTime");
        java.lang.Object objD = acan.c.d(akvnVar);
        if (objD == null) {
            throw new java.lang.IllegalStateException("UserAction is null");
        }
        ajyi ajyiVarI = akky.i(akhu.a.m());
        ajyi ajyiVarH = akky.H(x(promoContext).L());
        ajyiVarH.an((akif) objD);
        ajyiVarH.ao(defpackage.aldi.a(alcfVar));
        ajyiVarI.d(ajyiVarH.ah());
        A(promoContext, defpackage.akht.PROMO_USER_ACTION, ajyiVarI.c());
    }

    @Override // defpackage.acal
    public final void q(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, defpackage.alcf alcfVar) {
        defpackage.aooh.f(promoContext, "promoContext");
        defpackage.aooh.f(alcfVar, "interactionTime");
        ajyi ajyiVarI = akky.i(akhu.a.m());
        ajyi ajyiVarH = akky.H(x(promoContext).L());
        ajyiVarH.an(akif.d);
        ajyiVarH.ao(defpackage.aldi.a(alcfVar));
        ajyiVarI.d(ajyiVarH.ah());
        A(promoContext, defpackage.akht.PROMO_USER_DISMISSED, ajyiVarI.c());
    }

    @Override // defpackage.acal
    public final java.lang.Object r(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) it.next();
            ajyi ajyiVarI = akky.i(akhu.a.m());
            ajyiVarI.d(x(promoContext));
            A(promoContext, defpackage.akht.PROMO_COUNTERFACTUAL_DROPPED_ON_RECEIVE, ajyiVarI.c());
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.acal
    public final void s(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, int i) {
        defpackage.aooh.f(promoContext, "promoContext");
        ajyi ajyiVarI = akky.i(akhu.a.m());
        ajyi ajyiVarH = akky.H(x(promoContext).L());
        ajyiVarH.al(akib.c);
        int i2 = i + (-1) == 1 ? 2 : 1;
        defpackage.akzx akzxVar = (defpackage.akzx) ajyiVarH.a;
        akzxVar.u();
        akig akigVar = akzxVar.b;
        akigVar.p = i2 - 1;
        akigVar.d |= 1024;
        ajyiVarI.d(ajyiVarH.ah());
        A(promoContext, defpackage.akht.PROMO_NOT_SHOWN, ajyiVarI.c());
    }

    @Override // defpackage.acal
    public final void t(long j) {
        ajyi ajyiVarI = akky.i(akhu.a.m());
        ajyi ajyiVarH = akky.H(akig.c.m());
        ajyiVarH.ap(C());
        java.lang.String str = this.h.a;
        if (str != null && str.length() != 0) {
            ajyiVarH.ai(str);
        }
        j$.time.Duration durationOfMillis = j$.time.Duration.ofMillis(j);
        defpackage.aooh.e(durationOfMillis, "ofMillis(...)");
        ajyiVarH.aj(defpackage.aooc.at(durationOfMillis));
        akqp akqpVarZ = z(null, null);
        if (akqpVarZ != null) {
            ajyiVarH.am(akqpVarZ);
        }
        ajyiVarI.d(ajyiVarH.ah());
        B(null, defpackage.akht.PROMO_DELAYED_TRIGGERING_EVENT_EXPIRED, ajyiVarI.c());
    }

    @Override // defpackage.acal
    public final void u(long j) {
        ajyi ajyiVarI = akky.i(akhu.a.m());
        ajyi ajyiVarH = akky.H(akig.c.m());
        ajyiVarH.ap(C());
        java.lang.String str = this.h.a;
        if (str != null && str.length() != 0) {
            ajyiVarH.ai(str);
        }
        j$.time.Duration durationOfMillis = j$.time.Duration.ofMillis(j);
        defpackage.aooh.e(durationOfMillis, "ofMillis(...)");
        ajyiVarH.aj(defpackage.aooc.at(durationOfMillis));
        akqp akqpVarZ = z(null, null);
        if (akqpVarZ != null) {
            ajyiVarH.am(akqpVarZ);
        }
        ajyiVarI.d(ajyiVarH.ah());
        B(null, defpackage.akht.PROMO_DELAYED_TRIGGERING_EVENT_RETRIGGERED, ajyiVarI.c());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object v(java.lang.String str, java.util.List list, defpackage.aoln aolnVar) {
        acat acatVar;
        java.lang.String str2;
        ajyi ajyiVar;
        ajyi ajyiVar2;
        if (aolnVar instanceof acat) {
            acatVar = (acat) aolnVar;
            int i = acatVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acatVar.c = i - Integer.MIN_VALUE;
            } else {
                acatVar = new acat(this, aolnVar);
            }
        } else {
            acatVar = new acat(this, aolnVar);
        }
        java.lang.Object obj = acatVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = acatVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ajyi ajyiVarH = akky.H(akig.c.m());
            defpackage.akzx akzxVar = (defpackage.akzx) ajyiVarH.a;
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(akzxVar.b.z);
            defpackage.aooh.e(listUnmodifiableList, "getPromotionIdsList(...)");
            new defpackage.alct(listUnmodifiableList);
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                defpackage.akzx akzxVarM = akid.a.m();
                defpackage.aooh.f(akzxVarM, "builder");
                defpackage.aooh.f(str3, "value");
                akzxVarM.u();
                akid akidVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(str3);
                akidVar.b |= 1;
                akidVar.c = str3;
                akid akidVarR = akzxVarM.r();
                defpackage.aooh.e(akidVarR, "build(...)");
                arrayList.add(akidVarR);
            }
            akzxVar.u();
            akig akigVar = akzxVar.b;
            defpackage.alat alatVar = akigVar.z;
            if (!alatVar.c()) {
                akigVar.z = defpackage.alad.J(alatVar);
            }
            defpackage.akyl.i(arrayList, akigVar.z);
            com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentationBx = defpackage.agab.bx(str);
            acatVar.d = str;
            acatVar.e = ajyiVarH;
            acatVar.f = ajyiVarH;
            acatVar.c = 1;
            java.lang.Object objW = w(accountRepresentationBx, acatVar);
            if (objW == aoluVar) {
                return aoluVar;
            }
            str2 = str;
            ajyiVar = ajyiVarH;
            obj = objW;
            ajyiVar2 = ajyiVar;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ajyiVar = acatVar.f;
            ajyiVar2 = acatVar.e;
            str2 = acatVar.d;
            defpackage.aooc.af(obj);
        }
        defpackage.adtz adtzVar = (defpackage.adtz) obj;
        if (adtzVar instanceof defpackage.adtv) {
            ((defpackage.aiob) ((defpackage.aiob) c.d()).k(((defpackage.adtv) adtzVar).b())).v("Couldn't fetch GnpAccount, not setting RTID.");
        }
        java.lang.String str4 = (java.lang.String) defpackage.agab.bX(adtzVar, new abiy(15)).d();
        java.lang.String str5 = this.h.a;
        if (str5 != null && str5.length() != 0) {
            ajyiVar.ai(str5);
        }
        akqp akqpVarZ = z(str2, str4);
        if (akqpVarZ != null) {
            ajyiVar.am(akqpVarZ);
        }
        return ajyiVar2.ah();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v4, types: [aeee, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.android.libraries.notifications.platform.registration.AccountRepresentation] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final java.lang.Object w(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, defpackage.aoln aolnVar) {
        acau acauVar;
        ?? r6;
        defpackage.adtz adtzVar;
        int iR;
        if (aolnVar instanceof acau) {
            acauVar = (acau) aolnVar;
            int i = acauVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                acauVar.d = i - Integer.MIN_VALUE;
            } else {
                acauVar = new acau(this, aolnVar);
            }
        } else {
            acauVar = new acau(this, aolnVar);
        }
        java.lang.Object objK = acauVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = acauVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj = acauVar.a;
                defpackage.aooc.af(objK);
                r6 = obj;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objK);
            }
            adtzVar = (defpackage.adtz) objK;
            iR = defpackage.anty.R(adtzVar);
            if (iR != 0) {
                defpackage.aduy aduyVar = (defpackage.aduy) ((defpackage.adub) adtzVar).a;
                return aduyVar == null ? new adtw("Account not in storage", defpackage.adty.X) : new defpackage.adub(aduyVar);
            }
            if (iR == 1) {
                return (defpackage.adtv) adtzVar;
            }
            throw new defpackage.aois();
        }
        defpackage.aooc.af(objK);
        defpackage.adao adaoVar = this.m;
        acauVar.a = accountRepresentation;
        acauVar.d = 1;
        objK = adaoVar.k(acauVar);
        if (objK == aoluVar) {
            r6 = accountRepresentation;
            return aoluVar;
        }
        r6 = accountRepresentation;
        ?? r5 = ((java.lang.Boolean) objK).booleanValue() ? (defpackage.aeee) this.l.a() : (defpackage.aeee) this.k.a();
        defpackage.aooh.c(r5);
        acauVar.a = null;
        acauVar.d = 2;
        objK = r5.b(r6, acauVar);
        if (objK == aoluVar) {
            return aoluVar;
        }
        adtzVar = (defpackage.adtz) objK;
        iR = defpackage.anty.R(adtzVar);
        if (iR != 0) {
            defpackage.aduy aduyVar2 = (defpackage.aduy) ((defpackage.adub) adtzVar).a;
            if (aduyVar2 == null) {
            }
        }
        if (iR == 1) {
            return (defpackage.adtv) adtzVar;
        }
        throw new defpackage.aois();
    }
}
