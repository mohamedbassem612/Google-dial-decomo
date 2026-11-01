package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aecg {
    public static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    public final defpackage.aduu b;
    public final defpackage.ahyn c;
    public final defpackage.ahyn d;
    public final defpackage.adzw e;
    public final android.content.Context f;
    public final defpackage.aeey g;
    public final defpackage.aoin h;
    private final defpackage.aefe i;
    private final defpackage.aolr j;

    public aecg(defpackage.aduu aduuVar, defpackage.aefe aefeVar, defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2, defpackage.adzw adzwVar, defpackage.aolr aolrVar, defpackage.ahyn ahynVar3, android.content.Context context, defpackage.aeey aeeyVar, defpackage.aoin aoinVar) {
        defpackage.aooh.f(aduuVar, "gnpConfig");
        defpackage.aooh.f(aefeVar, "requestUtil");
        defpackage.aooh.f(adzwVar, "deliveryAddressHelper");
        defpackage.aooh.f(aolrVar, "gnpBackgroundContext");
        defpackage.aooh.f(ahynVar3, "gnpEncryptionManager");
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aeeyVar, "clientStreamz");
        defpackage.aooh.f(aoinVar, "inappPushEnabledFlag");
        this.b = aduuVar;
        this.i = aefeVar;
        this.c = ahynVar;
        this.d = ahynVar2;
        this.e = adzwVar;
        this.j = aolrVar;
        this.f = context;
        this.g = aeeyVar;
        this.h = aoinVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.aduy aduyVar, defpackage.aihd aihdVar, defpackage.aegf aegfVar, defpackage.aduw aduwVar, defpackage.aoln aolnVar) {
        defpackage.aecf aecfVar;
        defpackage.ajyk ajykVarAf;
        defpackage.aduy aduyVar2;
        defpackage.ajyk ajykVar;
        java.lang.Object obj;
        defpackage.aduw aduwVar2;
        defpackage.ajyk ajykVar2;
        defpackage.aduy aduyVar3;
        defpackage.ajyk ajykVar3;
        java.lang.String str;
        if (aolnVar instanceof defpackage.aecf) {
            aecfVar = (defpackage.aecf) aolnVar;
            int i = aecfVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aecfVar.e = i - Integer.MIN_VALUE;
            } else {
                aecfVar = new defpackage.aecf(this, aolnVar);
            }
        } else {
            aecfVar = new defpackage.aecf(this, aolnVar);
        }
        java.lang.Object obj2 = aecfVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aecfVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                ajykVar = aecfVar.h;
                defpackage.ajyk ajykVar4 = aecfVar.g;
                aduwVar = (defpackage.aduw) aecfVar.b;
                defpackage.aihd aihdVar2 = (defpackage.aihd) aecfVar.a;
                aduyVar2 = aecfVar.f;
                defpackage.aooc.af(obj2);
                ajykVarAf = ajykVar4;
                aihdVar = aihdVar2;
                obj = obj2;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ajykVar3 = aecfVar.h;
                ajykVar = aecfVar.g;
                ajykVar2 = (defpackage.ajyk) aecfVar.b;
                aduwVar2 = (defpackage.aduw) aecfVar.a;
                aduyVar3 = aecfVar.f;
                defpackage.aooc.af(obj2);
            }
            defpackage.akrw akrwVar = (defpackage.akrw) obj2;
            defpackage.aooh.f(akrwVar, "value");
            defpackage.akzx akzxVar = (defpackage.akzx) ajykVar3.b;
            akzxVar.u();
            defpackage.akri akriVar = (defpackage.akri) akzxVar.b;
            defpackage.akri akriVar2 = defpackage.akri.a;
            j$.util.Objects.requireNonNull(akrwVar);
            akriVar.f = akrwVar;
            akriVar.b |= 4;
            str = aduyVar3.i;
            if (str != null && str.length() != 0) {
                defpackage.akzx akzxVar2 = (defpackage.akzx) ajykVar.b;
                akzxVar2.u();
                defpackage.akri akriVar3 = (defpackage.akri) akzxVar2.b;
                j$.util.Objects.requireNonNull(str);
                akriVar3.b |= 16;
                akriVar3.g = str;
            }
            aduwVar2.a();
            java.lang.String strValueOf = java.lang.String.valueOf(aduyVar3.a);
            defpackage.aooh.f(strValueOf, "value");
            defpackage.akzx akzxVar3 = (defpackage.akzx) ajykVar.b;
            akzxVar3.u();
            defpackage.akri akriVar4 = (defpackage.akri) akzxVar3.b;
            j$.util.Objects.requireNonNull(strValueOf);
            akriVar4.b |= 32;
            akriVar4.h = strValueOf;
            return ajykVar2.N();
        }
        defpackage.aooc.af(obj2);
        ajykVarAf = defpackage.ajsz.af(defpackage.akri.a.m());
        aduyVar.b();
        aecfVar.f = aduyVar;
        aecfVar.a = aihdVar;
        aecfVar.b = aduwVar;
        aecfVar.g = ajykVarAf;
        aecfVar.h = ajykVarAf;
        aecfVar.e = 1;
        aegfVar.b();
        aduyVar2 = aduyVar;
        ajykVar = ajykVarAf;
        obj = null;
        java.util.List list = (java.util.List) obj;
        java.util.List list2 = (list == null && aduwVar.a()) ? null : list;
        if (list2 != null && !list2.isEmpty()) {
            defpackage.akzx akzxVar4 = (defpackage.akzx) ajykVar.b;
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.akri) akzxVar4.b).e);
            defpackage.aooh.e(listUnmodifiableList, "getSelectionTokenList(...)");
            new defpackage.alct(listUnmodifiableList);
            akzxVar4.u();
            defpackage.akri akriVar5 = (defpackage.akri) akzxVar4.b;
            defpackage.alat alatVar = akriVar5.e;
            if (!alatVar.c()) {
                akriVar5.e = defpackage.alad.J(alatVar);
            }
            defpackage.akyl.i(list2, akriVar5.e);
        }
        defpackage.aefe aefeVar = this.i;
        com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentationB = aduyVar2.b();
        aecfVar.f = aduyVar2;
        aecfVar.a = aduwVar;
        aecfVar.b = ajykVarAf;
        aecfVar.g = ajykVar;
        aecfVar.h = ajykVar;
        aecfVar.e = 2;
        java.lang.Object objA = aefeVar.a(accountRepresentationB, aihdVar, aduwVar, aecfVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        aduwVar2 = aduwVar;
        ajykVar2 = ajykVarAf;
        aduyVar3 = aduyVar2;
        obj2 = objA;
        ajykVar3 = ajykVar;
        defpackage.akrw akrwVar2 = (defpackage.akrw) obj2;
        defpackage.aooh.f(akrwVar2, "value");
        defpackage.akzx akzxVar5 = (defpackage.akzx) ajykVar3.b;
        akzxVar5.u();
        defpackage.akri akriVar6 = (defpackage.akri) akzxVar5.b;
        defpackage.akri akriVar7 = defpackage.akri.a;
        j$.util.Objects.requireNonNull(akrwVar2);
        akriVar6.f = akrwVar2;
        akriVar6.b |= 4;
        str = aduyVar3.i;
        if (str != null) {
            defpackage.akzx akzxVar6 = (defpackage.akzx) ajykVar.b;
            akzxVar6.u();
            defpackage.akri akriVar8 = (defpackage.akri) akzxVar6.b;
            j$.util.Objects.requireNonNull(str);
            akriVar8.b |= 16;
            akriVar8.g = str;
        }
        aduwVar2.a();
        java.lang.String strValueOf2 = java.lang.String.valueOf(aduyVar3.a);
        defpackage.aooh.f(strValueOf2, "value");
        defpackage.akzx akzxVar7 = (defpackage.akzx) ajykVar.b;
        akzxVar7.u();
        defpackage.akri akriVar9 = (defpackage.akri) akzxVar7.b;
        j$.util.Objects.requireNonNull(strValueOf2);
        akriVar9.b |= 32;
        akriVar9.h = strValueOf2;
        return ajykVar2.N();
    }
}
