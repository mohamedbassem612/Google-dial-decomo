package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acyq implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ acyq(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v34, types: [acyv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a(java.lang.Object obj) {
        int iY;
        int i = 3;
        int i2 = 15;
        int i3 = 12;
        int i4 = 7;
        int i5 = 9;
        switch (this.$cid) {
            case 0:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (true) {
                    java.lang.Object obj2 = this.a;
                    if (!it.hasNext()) {
                        return abrz.ac(arrayList).D(new defpackage.vnc(15), ((acyu) obj2).f);
                    }
                    defpackage.acwb acwbVar = (defpackage.acwb) it.next();
                    if (!acwbVar.f) {
                        acyu acyuVar = (acyu) obj2;
                        arrayList.add(acyuVar.q(acyuVar.d.g(acwbVar), new defpackage.acyq(obj2, i)));
                    }
                }
                break;
            case 1:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    ((acyu) this.a).b.l(1036);
                }
                return ajcm.a;
            case 2:
                defpackage.adac adacVar = (defpackage.adac) obj;
                defpackage.acwb acwbVar2 = adacVar.a;
                defpackage.acvu acvuVar = adacVar.b;
                boolean z = acwbVar2.f;
                java.lang.Object obj3 = this.a;
                if (z && afsq.at(acvuVar)) {
                    acyu acyuVar2 = (acyu) obj3;
                    return acyuVar2.q((acyuVar2.i.F() && afsq.at(acvuVar)) ? defpackage.adcs.e(acyuVar2.k(acvuVar)).f(new wym(obj3, acvuVar, 8), acyuVar2.f) : aiql.z(java.lang.Boolean.TRUE), new defpackage.acyg(obj3, (alad) acvuVar, 12));
                }
                ((acyu) obj3).b.p(acyu.v(acvuVar), 2);
                return ajcm.a;
            case 3:
                defpackage.acvu acvuVar2 = (defpackage.acvu) obj;
                return (acvuVar2 == null || (iY = afsq.Y(acvuVar2.r)) == 0 || iY == 1) ? aiql.z(java.lang.Boolean.TRUE) : ((defpackage.adez) ((ahzi) ((acyu) this.a).h.b()).eZ()).a();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Object obj4 = this.a;
                acyy acyyVar = (acyy) obj4;
                return ahvr.I(acyyVar.n(acyyVar.a.b()), new defpackage.acyw(obj4, (defpackage.adbw) obj, 4), acyyVar.b);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object obj5 = this.a;
                acyy acyyVar2 = (acyy) obj5;
                return ahvr.I(acyyVar2.n(acyyVar2.a.k()), new defpackage.acyg(obj5, (defpackage.adbw) obj, 17), acyyVar2.b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.Object obj6 = this.a;
                acyy acyyVar3 = (acyy) obj6;
                return ahvr.I(acyyVar3.n(acyyVar3.a.e()), new defpackage.acyg(obj6, (defpackage.adbw) obj, 20), acyyVar3.b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Object obj7 = this.a;
                acza aczaVar = (acza) obj7;
                return ahvr.I(aczaVar.b.c(), new defpackage.acyw(obj7, (java.lang.Boolean) obj, 14), aczaVar.d);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.Object obj8 = this.a;
                acza aczaVar2 = (acza) obj8;
                return ahvr.I(aczaVar2.b(aczaVar2.c.a()), new defpackage.acyw(obj8, (defpackage.adbw) obj, 16), aczaVar2.d);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((aczk) this.a).e.b();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj9 = this.a;
                aczk aczkVar = (aczk) obj9;
                return ahvr.I(aczkVar.f.a(), new defpackage.acyq(obj9, i5), aczkVar.i);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ((aczk) this.a).e.b();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                java.lang.Object obj10 = this.a;
                adbe.h("%s Clearing MDD since FilesMetadata failed or needs migration.", "MDDManager");
                return ((aczk) obj10).a();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                java.lang.Object obj11 = this.a;
                adbe.h("%s Clearing MDD since FileManager failed or needs migration.", "MDDManager");
                return ((aczk) obj11).a();
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (defpackage.adac adacVar2 : (java.util.List) obj) {
                    java.lang.Object obj12 = this.a;
                    defpackage.acwb acwbVar3 = adacVar2.a;
                    defpackage.adcs adcsVarE = defpackage.adcs.e(ajcm.a);
                    defpackage.acze aczeVar = new defpackage.acze(obj12, adacVar2, 2);
                    java.util.concurrent.Executor executor = ((aczk) obj12).i;
                    arrayList2.add(adcsVarE.g(aczeVar, executor).g(new defpackage.acze(obj12, adacVar2, 3), executor));
                }
                return abrz.ac(arrayList2).D(new aczf(2), ajbm.a);
            case 15:
                aczk aczkVar2 = (aczk) this.a;
                aczkVar2.c.l(1053);
                adak adakVar = aczkVar2.n;
                ajcq ajcqVarE = adakVar.g.e();
                defpackage.acwk acwkVar = new defpackage.acwk(adakVar, i5);
                ?? r1 = adakVar.f;
                return ahvr.I(ahvr.I(ajcqVarE, acwkVar, (java.util.concurrent.Executor) r1), new defpackage.acwk(adakVar, i4), (java.util.concurrent.Executor) r1);
            case 16:
                aczk aczkVar3 = (aczk) this.a;
                android.content.SharedPreferences sharedPreferencesD = abrz.D(aczkVar3.b, "gms_icing_mdd_manager_metadata", aczkVar3.h);
                if (sharedPreferencesD.getBoolean("mdd_migrated_to_offroad", false)) {
                    return ajcm.a;
                }
                int i6 = adbe.a;
                return ahvr.H(aczkVar3.a(), new defpackage.acym(sharedPreferencesD, 4), aczkVar3.i);
            case 17:
                java.lang.Object obj13 = this.a;
                aczk aczkVar4 = (aczk) obj13;
                adlt adltVar = aczkVar4.m;
                android.content.Context context = (android.content.Context) adltVar.l;
                android.content.SharedPreferences sharedPreferencesD2 = abrz.D(context, "gms_icing_mdd_shared_file_manager_metadata", (ahyn) adltVar.i);
                if (sharedPreferencesD2.contains("migrated_to_new_file_key")) {
                    if (sharedPreferencesD2.getBoolean("migrated_to_new_file_key", false)) {
                        afsq.aF(context);
                    }
                    sharedPreferencesD2.edit().remove("migrated_to_new_file_key").commit();
                }
                return ahvr.I(aiql.z(java.lang.Boolean.TRUE), new defpackage.acyq(obj13, 13), aczkVar4.i);
            case 18:
                java.lang.Object obj14 = this.a;
                aczk aczkVar5 = (aczk) obj14;
                return ahvr.I(aczkVar5.f.d(), new defpackage.acyq(obj14, i3), aczkVar5.i);
            case 19:
                return ((aczk) this.a).e.f();
            default:
                java.lang.Object obj15 = this.a;
                aczk aczkVar6 = (aczk) obj15;
                acvl acvlVar = aczkVar6.k;
                ajcq ajcqVar = ajcm.a;
                if (!acvlVar.Q()) {
                    return ajcqVar;
                }
                defpackage.adcs adcsVarE2 = defpackage.adcs.e(ajcqVar);
                defpackage.acyq acyqVar = new defpackage.acyq(obj15, i2);
                java.util.concurrent.Executor executor2 = aczkVar6.i;
                return adcsVarE2.g(acyqVar, executor2).d(java.lang.Exception.class, new defpackage.acwn(7), executor2);
        }
    }
}
