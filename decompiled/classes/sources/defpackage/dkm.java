package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class dkm implements defpackage.aonn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ dkm(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aonn
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        tuf iujVar;
        itz itzVar;
        iub iubVar;
        int iK;
        iua iuaVar;
        tue tueVar;
        java.lang.Object obj3;
        defpackage.aolm aolmVar;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                defpackage.cjs cjsVar = (defpackage.cjs) obj;
                defpackage.dkd dkdVar = (defpackage.dkd) obj2;
                java.lang.Object objA = defpackage.dkp.a(new defpackage.dot(dkdVar.a), defpackage.dkp.x, cjsVar);
                java.lang.Object objA2 = defpackage.dkp.a(new defpackage.dov(dkdVar.b), defpackage.dkp.y, cjsVar);
                java.lang.Object objA3 = defpackage.dkp.a(new defpackage.dps(dkdVar.c), defpackage.dkp.A, cjsVar);
                defpackage.dpa dpaVar = dkdVar.d;
                defpackage.dpa dpaVar2 = defpackage.dpa.a;
                java.lang.Object objA4 = defpackage.dkp.a(dpaVar, defpackage.dkp.n, cjsVar);
                java.lang.Object objA5 = defpackage.dkp.a(dkdVar.e, dkr.a, cjsVar);
                defpackage.dos dosVar = dkdVar.f;
                defpackage.dos dosVar2 = defpackage.dos.a;
                return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{objA, objA2, objA3, objA4, objA5, defpackage.dkp.a(dosVar, defpackage.dkp.v, cjsVar), defpackage.dkp.a(new defpackage.doo(dkdVar.g), dkr.c, cjsVar), defpackage.dkp.a(new defpackage.don(dkdVar.h), defpackage.dkp.z, cjsVar), defpackage.dkp.a(dkdVar.i, dkr.d, cjsVar)}, true));
            case 1:
                return ((dla) obj2).a;
            case 2:
                defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                defpackage.dks dksVar = (defpackage.dks) obj2;
                defpackage.cqg cqgVar = new defpackage.cqg(dksVar.b());
                defpackage.dko dkoVar = defpackage.dkp.w;
                java.lang.Object objA6 = defpackage.dkp.a(cqgVar, dkoVar, cjsVar2);
                defpackage.dps dpsVar = new defpackage.dps(dksVar.b);
                defpackage.dko dkoVar2 = defpackage.dkp.A;
                java.lang.Object objA7 = defpackage.dkp.a(dpsVar, dkoVar2, cjsVar2);
                defpackage.dnd dndVar = dksVar.c;
                defpackage.dnd dndVar2 = defpackage.dnd.a;
                java.lang.Object objA8 = defpackage.dkp.a(dndVar, defpackage.dkp.o, cjsVar2);
                java.lang.Object objA9 = defpackage.dkp.a(dksVar.d, defpackage.dkp.r, cjsVar2);
                java.lang.Object objA10 = defpackage.dkp.a(dksVar.e, defpackage.dkp.s, cjsVar2);
                java.lang.String str = dksVar.g;
                java.lang.Object objA11 = defpackage.dkp.a(new defpackage.dps(dksVar.h), dkoVar2, cjsVar2);
                java.lang.Object objA12 = defpackage.dkp.a(dksVar.i, defpackage.dkp.p, cjsVar2);
                java.lang.Object objA13 = defpackage.dkp.a(dksVar.j, defpackage.dkp.m, cjsVar2);
                defpackage.dnx dnxVar = dksVar.k;
                defpackage.dnx dnxVar2 = defpackage.dnx.a;
                return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{objA6, objA7, objA8, objA9, objA10, -1, str, objA11, objA12, objA13, defpackage.dkp.a(dnxVar, defpackage.dkp.t, cjsVar2), defpackage.dkp.a(new defpackage.cqg(dksVar.l), dkoVar, cjsVar2), defpackage.dkp.a(dksVar.m, defpackage.dkp.l, cjsVar2), defpackage.dkp.a(dksVar.n, defpackage.dkp.q, cjsVar2)}, true));
            case 3:
                defpackage.gat gatVar = (defpackage.gat) obj;
                java.lang.Throwable cancellationException = (java.lang.Throwable) obj2;
                defpackage.aooh.f(gatVar, "msg");
                java.lang.Object obj4 = gatVar.b;
                if (cancellationException == null) {
                    cancellationException = new java.util.concurrent.CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                ((defpackage.aosi) obj4).c(cancellationException);
                return defpackage.aojh.a;
            case 4:
                itc itcVar = (itc) obj;
                defpackage.aooh.f(itcVar, "$this$create");
                defpackage.aooh.f((ity) obj2, "it");
                defpackage.aooh.f(itcVar, "<this>");
                long j = itcVar.a.a;
                java.util.UUID uuid = itcVar.g;
                java.lang.String str2 = itcVar.h;
                java.lang.Long l = itcVar.i;
                java.lang.String str3 = itcVar.c;
                java.lang.String str4 = itcVar.d;
                java.lang.Long l2 = itcVar.e;
                java.lang.String str5 = itcVar.f;
                java.lang.Integer num = itcVar.j;
                itp itpVar = itcVar.b;
                if (itpVar == null) {
                    itzVar = null;
                } else {
                    int iK2 = hgz.k(itpVar);
                    if (iK2 != 0) {
                        if (iK2 != 1 && iK2 != 2) {
                            throw new defpackage.aois();
                        }
                        itzVar = null;
                    } else {
                        itzVar = new itz(itpVar.a);
                    }
                }
                if (itpVar == null || (iK = hgz.k(itpVar)) == 0) {
                    iubVar = null;
                } else if (iK != 1) {
                    if (iK != 2) {
                        throw new defpackage.aois();
                    }
                    iubVar = null;
                } else {
                    itq itqVar = ((itu) itpVar).a;
                    iua iuaVar2 = iua.a;
                    switch (itqVar.ordinal()) {
                        case 0:
                            iuaVar = iua.a;
                            break;
                        case 1:
                            iuaVar = iua.b;
                            break;
                        case 2:
                            iuaVar = iua.c;
                            break;
                        case 3:
                            iuaVar = iua.d;
                            break;
                        case 4:
                            iuaVar = iua.e;
                            break;
                        case 5:
                            iuaVar = iua.f;
                            break;
                        case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                            iuaVar = iua.g;
                            break;
                        case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                            iuaVar = iua.h;
                            break;
                        case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                            iuaVar = iua.i;
                            break;
                        case 9:
                            iuaVar = iua.j;
                            break;
                        case 10:
                            iuaVar = iua.k;
                            break;
                        case 11:
                            iuaVar = iua.l;
                            break;
                        case 12:
                            iuaVar = iua.m;
                            break;
                        default:
                            throw new defpackage.aois();
                    }
                    iubVar = new iub(iuaVar);
                }
                itt ittVar = itcVar.k;
                iud iudVarJ = ittVar != null ? hgz.j(ittVar) : null;
                itt ittVar2 = itcVar.l;
                iujVar = new iuj(j, uuid, str2, l, str3, str4, l2, str5, num, itzVar, iubVar, iudVarJ, ittVar2 != null ? hgz.j(ittVar2) : null, itcVar.m, itcVar.n);
                return iujVar;
            case 5:
                ztf ztfVar = (ztf) obj;
                long jLongValue = ((java.lang.Long) obj2).longValue();
                defpackage.aooh.f(ztfVar, "$this$createWithLongKey");
                return new defpackage.jrj(jLongValue, ztfVar);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ttk ttkVar = (ttk) obj;
                defpackage.aooh.f(ttkVar, "$this$create");
                defpackage.aooh.f((j$.time.Instant) obj2, "it");
                defpackage.aooh.f(ttkVar, "<this>");
                long epochMilli = ttkVar.a.toEpochMilli();
                java.lang.String str6 = ttkVar.b;
                tud tudVarC = defpackage.ttj.c(ttkVar.c);
                tud tudVarC2 = defpackage.ttj.c(ttkVar.d);
                int i = ttkVar.e;
                tue tueVar2 = tue.a;
                tud tudVar = tud.a;
                int i2 = i - 1;
                if (i2 == 0) {
                    tueVar = tue.a;
                } else if (i2 != 1) {
                    tueVar = i2 != 2 ? tue.d : tue.c;
                } else {
                    tueVar = tue.b;
                }
                iujVar = new tuf(epochMilli, str6, tudVarC, tudVarC2, tueVar);
                return iujVar;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.afsq.cA((defpackage.mce) obj, (java.lang.Boolean) obj2);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.afsq.cA((defpackage.mce) obj, (java.lang.Boolean) obj2);
            case 9:
                defpackage.cav cavVar = (defpackage.cav) obj;
                ((java.lang.Integer) obj2).intValue();
                defpackage.aonn aonnVar = defpackage.abny.a;
                cavVar.u(-2142195933);
                cavVar.o();
                return java.lang.Boolean.TRUE;
            case 10:
                defpackage.cav cavVar2 = (defpackage.cav) obj;
                ((java.lang.Integer) obj2).intValue();
                defpackage.aonn aonnVar2 = defpackage.abny.a;
                cavVar2.u(-933135605);
                defpackage.bti btiVar = new defpackage.bti(bArr);
                cavVar2.o();
                obj3 = btiVar;
                return obj3;
            case 11:
                defpackage.aooh.f(obj, "$this$RoomKeyValueStore");
                return obj;
            case 12:
                android.database.Cursor cursor = (android.database.Cursor) obj2;
                defpackage.ahbq ahbqVar = defpackage.ahew.k;
                defpackage.aooh.f((defpackage.ajyk) obj, "<unused var>");
                defpackage.aokv aokvVar = new defpackage.aokv(10);
                while (cursor.moveToNext()) {
                    java.lang.String string = cursor.getString(cursor.getColumnIndexOrThrow("listener_key"));
                    defpackage.aooh.e(string, "getString(...)");
                    aokvVar.add(string);
                }
                return defpackage.ajsz.aX(aokvVar);
            case 13:
                defpackage.ahbq ahbqVar2 = defpackage.ahew.k;
                defpackage.aooh.f((defpackage.ajyk) obj, "<unused var>");
                return java.lang.Boolean.valueOf(((android.database.Cursor) obj2).getCount() > 0);
            case 14:
                defpackage.aolr aolrVar = (defpackage.aolr) obj;
                defpackage.aolp aolpVar = (defpackage.aolp) obj2;
                if (aolrVar == null) {
                    defpackage.aooh.i("acc");
                }
                if (aolpVar == null) {
                    defpackage.aooh.i("element");
                }
                defpackage.aolr aolrVarMinusKey = aolrVar.minusKey(aolpVar.getKey());
                defpackage.aols aolsVar = defpackage.aols.a;
                obj3 = aolpVar;
                if (aolrVarMinusKey != aolsVar) {
                    defpackage.cch cchVar = defpackage.aolo.k;
                    defpackage.aolo aoloVar = (defpackage.aolo) aolrVarMinusKey.get(cchVar);
                    if (aoloVar == null) {
                        aolmVar = new defpackage.aolm(aolrVarMinusKey, aolpVar);
                    } else {
                        defpackage.aolr aolrVarMinusKey2 = aolrVarMinusKey.minusKey(cchVar);
                        if (aolrVarMinusKey2 == aolsVar) {
                            return new defpackage.aolm(aolpVar, aoloVar);
                        }
                        aolmVar = new defpackage.aolm(new defpackage.aolm(aolrVarMinusKey2, aolpVar), aoloVar);
                    }
                    return aolmVar;
                }
                return obj3;
            case 15:
                defpackage.aolr aolrVar2 = (defpackage.aolr) obj;
                defpackage.aolp aolpVar2 = (defpackage.aolp) obj2;
                if (!(aolpVar2 instanceof defpackage.ahrd)) {
                    return aolrVar2.plus(aolpVar2);
                }
                defpackage.aolp aolpVar3 = aolrVar2.get(aolpVar2.getKey());
                return aolpVar3 == null ? aolrVar2.plus(((defpackage.ahrd) aolpVar2).d()) : aolrVar2.plus(((defpackage.ahrd) aolpVar3).b(aolpVar2));
            case 16:
                return java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue() || (((defpackage.aolp) obj2) instanceof defpackage.ahrd));
            case 17:
                defpackage.aolr aolrVar3 = (defpackage.aolr) obj;
                defpackage.aolp aolpVar4 = (defpackage.aolp) obj2;
                return aolpVar4 instanceof defpackage.ahrd ? aolrVar3.plus(((defpackage.ahrd) aolpVar4).d()) : aolrVar3;
            case 18:
                defpackage.aolr aolrVar4 = (defpackage.aolr) obj;
                defpackage.aolp aolpVar5 = (defpackage.aolp) obj2;
                return !(aolpVar5 instanceof defpackage.ahrd) ? aolrVar4.plus(aolpVar5) : aolrVar4.plus(((defpackage.ahrd) aolpVar5).d());
            case 19:
                return java.lang.Boolean.valueOf(defpackage.aooh.n(obj, obj2));
            default:
                return java.lang.Integer.valueOf(((java.lang.Integer) obj).intValue() + 1);
        }
    }
}
