package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jzj {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/coalescer/ConversationHistoryCoalescer");
    private final defpackage.aoss b;
    private final defpackage.jyy c;
    private final defpackage.ruc d;
    private final defpackage.kfv e;
    private final defpackage.jyz f;
    private final defpackage.aoin g;
    private final defpackage.aoin h;
    private final defpackage.aoin i;
    private final defpackage.aoin j;
    private final defpackage.sso k;
    private final defpackage.aoir l;
    private final defpackage.aoir m;
    private final defpackage.aoir n;
    private final defpackage.rsr o;
    private final defpackage.rsr p;

    public jzj(android.content.Context context, defpackage.aoss aossVar, defpackage.aazc aazcVar, defpackage.jyy jyyVar, defpackage.ruc rucVar, defpackage.rsr rsrVar, defpackage.rsr rsrVar2, defpackage.kfv kfvVar, defpackage.jyz jyzVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.zjm zjmVar, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5) {
        defpackage.aooh.f(context, "appContext");
        defpackage.aooh.f(aossVar, "lightweightScope");
        defpackage.aooh.f(aazcVar, "clock");
        defpackage.aooh.f(jyyVar, "coalescedRowsDao");
        defpackage.aooh.f(rucVar, "metrics");
        defpackage.aooh.f(jyzVar, "coalescedRowsUpdatedNotifier");
        defpackage.aooh.f(aoinVar, "combinerCreationMinChunkSize");
        defpackage.aooh.f(aoinVar2, "rowCombineMinChunkSize");
        defpackage.aooh.f(aoinVar3, "enableHalo");
        defpackage.aooh.f(aoinVar4, "enableSignedDayDifferenceInCoalescer");
        defpackage.aooh.f(aoinVar5, "enableCancelMissedCallNotificationByCreationTime");
        this.b = aossVar;
        this.c = jyyVar;
        this.d = rucVar;
        this.p = rsrVar;
        this.o = rsrVar2;
        this.e = kfvVar;
        this.f = jyzVar;
        this.g = aoinVar;
        this.h = aoinVar2;
        this.i = aoinVar4;
        this.j = aoinVar5;
        this.k = new defpackage.sso(context);
        this.l = defpackage.aooc.ag(new defpackage.gpg(zjmVar, 20));
        this.m = defpackage.aooc.ag(new defpackage.jza(aoinVar3, 1));
        this.n = defpackage.aooc.ag(new defpackage.jza(this, 0));
    }

    private final boolean g() {
        java.lang.Object objA = this.m.a();
        defpackage.aooh.e(objA, "getValue(...)");
        return ((java.lang.Boolean) objA).booleanValue();
    }

    public final defpackage.ajcq a() {
        return defpackage.aosv.F(this.b, 0, new defpackage.dgz(this, (defpackage.aoln) null, 15), 3);
    }

    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object b(defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.jzc jzcVar;
        defpackage.jzj jzjVar;
        defpackage.ajcq ajcqVar;
        if (aolnVar instanceof defpackage.jzc) {
            jzcVar = (defpackage.jzc) aolnVar;
            int i = jzcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jzcVar.c = i - Integer.MIN_VALUE;
            } else {
                jzcVar = new defpackage.jzc(this, aolnVar);
            }
        } else {
            jzcVar = new defpackage.jzc(this, aolnVar);
        }
        java.lang.Object objS = jzcVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = jzcVar.c;
        int i3 = 0;
        int i4 = 2;
        if (i2 != 0) {
            if (i2 == 1) {
                jzjVar = jzcVar.d;
                defpackage.aooc.af(objS);
            } else if (i2 == 2) {
                defpackage.aooc.af(objS);
                defpackage.kiv kivVar = (defpackage.kiv) objS;
                this.d.m(defpackage.jzk.a);
                this.e.a();
                defpackage.kcq.u(kivVar);
                defpackage.jyy jyyVar = this.c;
                ((defpackage.aimw) ((defpackage.aimw) defpackage.jyy.a.b()).l("com/android/dialer/calllog/coalescer/CoalescedRowsDao", "saveToFileForAllCallsInConversationHistory", 92, "CoalescedRowsDao.java")).v("saveToFileForAllCallsInConversationHistory");
                jyyVar.e.set(j$.util.Optional.of(kivVar));
                j$.util.Optional optionalA = jyyVar.d.a();
                defpackage.afhf afhfVar = jyyVar.f;
                defpackage.jyx jyxVar = new defpackage.jyx(kivVar, i3);
                defpackage.ajct ajctVar = jyyVar.c;
                defpackage.ahrv.g(afhfVar.a(jyxVar, ajctVar)).h(new defpackage.jtv(jyyVar, optionalA, 4), ajctVar).e(java.lang.Throwable.class, new defpackage.jtv(jyyVar, optionalA, i4), ajctVar);
                ajcqVar = defpackage.ajcm.a;
                jyyVar.g.s(ajcqVar, defpackage.jyy.b);
                jzcVar.c = 3;
                if (defpackage.aosv.D(ajcqVar, jzcVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objS);
            }
            defpackage.jyz jyzVar = this.f;
            ((defpackage.aimw) defpackage.jyz.a.b().l("com/android/dialer/calllog/coalescer/CoalescedRowsUpdatedNotifier", "notifyForConversationHistory", 49, "CoalescedRowsUpdatedNotifier.kt")).v("notifyForConversationHistory");
            defpackage.aoov.an(jyzVar.c, null, 0, new defpackage.dgz(jyzVar, (defpackage.aoln) null, 14), 3);
            defpackage.epq.a(jyzVar.b).d(new android.content.Intent("coalesced_rows_for_conversation_history_updated"));
            ((defpackage.aimw) a.b().l("com/android/dialer/calllog/coalescer/ConversationHistoryCoalescer", "coalesce", 107, "ConversationHistoryCoalescer.kt")).v("coalesced rows updated");
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objS);
        ((defpackage.aimw) a.b().l("com/android/dialer/calllog/coalescer/ConversationHistoryCoalescer", "coalesce", 96, "ConversationHistoryCoalescer.kt")).v("coalescing conversation history");
        this.d.j(defpackage.jzk.a);
        defpackage.rsr rsrVar = this.p;
        jzcVar.d = this;
        jzcVar.c = 1;
        objS = defpackage.kcq.S(rsrVar, jzcVar);
        if (objS == aoluVar) {
            return aoluVar;
        }
        jzjVar = this;
        java.util.List listBZ = defpackage.ajsz.bZ((java.lang.Iterable) objS);
        jzcVar.d = null;
        jzcVar.c = 2;
        objS = jzjVar.c(listBZ, jzcVar);
        if (objS == aoluVar) {
            return aoluVar;
        }
        defpackage.kiv kivVar2 = (defpackage.kiv) objS;
        this.d.m(defpackage.jzk.a);
        this.e.a();
        defpackage.kcq.u(kivVar2);
        defpackage.jyy jyyVar2 = this.c;
        ((defpackage.aimw) ((defpackage.aimw) defpackage.jyy.a.b()).l("com/android/dialer/calllog/coalescer/CoalescedRowsDao", "saveToFileForAllCallsInConversationHistory", 92, "CoalescedRowsDao.java")).v("saveToFileForAllCallsInConversationHistory");
        jyyVar2.e.set(j$.util.Optional.of(kivVar2));
        j$.util.Optional optionalA2 = jyyVar2.d.a();
        defpackage.afhf afhfVar2 = jyyVar2.f;
        defpackage.jyx jyxVar2 = new defpackage.jyx(kivVar2, i3);
        defpackage.ajct ajctVar2 = jyyVar2.c;
        defpackage.ahrv.g(afhfVar2.a(jyxVar2, ajctVar2)).h(new defpackage.jtv(jyyVar2, optionalA2, 4), ajctVar2).e(java.lang.Throwable.class, new defpackage.jtv(jyyVar2, optionalA2, i4), ajctVar2);
        ajcqVar = defpackage.ajcm.a;
        jyyVar2.g.s(ajcqVar, defpackage.jyy.b);
        jzcVar.c = 3;
        if (defpackage.aosv.D(ajcqVar, jzcVar) == aoluVar) {
            return aoluVar;
        }
        defpackage.jyz jyzVar2 = this.f;
        ((defpackage.aimw) defpackage.jyz.a.b().l("com/android/dialer/calllog/coalescer/CoalescedRowsUpdatedNotifier", "notifyForConversationHistory", 49, "CoalescedRowsUpdatedNotifier.kt")).v("notifyForConversationHistory");
        defpackage.aoov.an(jyzVar2.c, null, 0, new defpackage.dgz(jyzVar2, (defpackage.aoln) null, 14), 3);
        defpackage.epq.a(jyzVar2.b).d(new android.content.Intent("coalesced_rows_for_conversation_history_updated"));
        ((defpackage.aimw) a.b().l("com/android/dialer/calllog/coalescer/ConversationHistoryCoalescer", "coalesce", 107, "ConversationHistoryCoalescer.kt")).v("coalesced rows updated");
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v7, types: [aolr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final java.lang.Object c(java.util.List list, defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.jzd jzdVar;
        ?? Aj;
        ?? r2;
        java.util.List list2;
        defpackage.jzj jzjVar;
        long j;
        java.lang.Object objD;
        if (aolnVar instanceof defpackage.jzd) {
            jzdVar = (defpackage.jzd) aolnVar;
            int i = jzdVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                jzdVar.e = i - Integer.MIN_VALUE;
            } else {
                jzdVar = new defpackage.jzd(this, aolnVar);
            }
        } else {
            jzdVar = new defpackage.jzd(this, aolnVar);
        }
        defpackage.jzd jzdVar2 = jzdVar;
        java.lang.Object objM = jzdVar2.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = jzdVar2.e;
        if (i2 != 0) {
            if (i2 == 1) {
                java.util.List list3 = (java.util.List) jzdVar2.a;
                defpackage.aooc.af(objM);
                r2 = objM;
                list2 = list3;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    defpackage.aooc.af(objM);
                    return objM;
                }
                j = jzdVar2.b;
                jzjVar = (defpackage.jzj) jzdVar2.a;
                defpackage.aooc.af(objM);
            }
            jzdVar2.a = null;
            jzdVar2.e = 3;
            objD = jzjVar.d((java.util.List) objM, j, jzdVar2);
            if (objD != aoluVar) {
                return objD;
            }
            epochMilli = epochMilli;
            return aoluVar;
        }
        defpackage.aooc.af(objM);
        if (list.isEmpty()) {
            defpackage.kiv kivVar = defpackage.kiv.a;
            defpackage.aooh.e(kivVar, "getDefaultInstance(...)");
            return kivVar;
        }
        defpackage.rsr rsrVar = this.o;
        jzdVar2.a = list;
        jzdVar2.e = 1;
        java.util.EnumMap enumMapZ = rsrVar.Z();
        if (enumMapZ.isEmpty()) {
            Aj = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
                Aj.add(defpackage.aokd.a);
            }
        } else {
            defpackage.kaw kawVar = (defpackage.kaw) rsrVar.a;
            Aj = defpackage.aoov.aj(kawVar.a, new lwm(kawVar, enumMapZ, list, (defpackage.aoln) null, 1), jzdVar2);
            if (Aj != aoluVar) {
                Aj = (java.util.List) Aj;
            }
        }
        if (Aj != aoluVar) {
            r2 = Aj;
            list2 = list;
        }
        epochMilli = epochMilli;
        return aoluVar;
        java.util.List list4 = (java.util.List) r2;
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        jzdVar2.a = this;
        jzdVar2.b = epochMilli;
        jzdVar2.e = 2;
        int iLongValue = (int) ((java.lang.Number) this.g.a()).longValue();
        int size = iLongValue > 0 ? list2.size() / iLongValue : 0;
        objM = size >= 2 ? defpackage.aosv.m(new jzf(list2, size, this, list4, epochMilli, (defpackage.aoln) null), jzdVar2) : e(list2, list4, epochMilli, 0, list2.size());
        if (objM != aoluVar) {
            epochMilli = epochMilli;
            jzjVar = this;
            j = epochMilli;
            jzdVar2.a = null;
            jzdVar2.e = 3;
            objD = jzjVar.d((java.util.List) objM, j, jzdVar2);
            if (objD != aoluVar) {
                return objD;
            }
        }
        epochMilli = epochMilli;
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object d(java.util.List list, long j, defpackage.aoln aolnVar) throws java.lang.Throwable {
        jzg jzgVar;
        ni niVar;
        ni niVar2;
        ni niVar3;
        defpackage.alct alctVar;
        if (aolnVar instanceof jzg) {
            jzgVar = (jzg) aolnVar;
            int i = jzgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jzgVar.c = i - Integer.MIN_VALUE;
            } else {
                jzgVar = new jzg(this, aolnVar);
            }
        } else {
            jzgVar = new jzg(this, aolnVar);
        }
        jzg jzgVar2 = jzgVar;
        java.lang.Object objM = jzgVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = jzgVar2.c;
        if (i2 == 0) {
            defpackage.aooc.af(objM);
            defpackage.akzx akzxVarM = defpackage.kiv.a.m();
            defpackage.aooh.f(akzxVarM, "builder");
            niVar = new ni(akzxVarM);
            int iLongValue = (int) ((java.lang.Number) this.h.a()).longValue();
            int i3 = 0;
            if (iLongValue > 0) {
                defpackage.alct alctVarC = niVar.C();
                int size = list.size() / iLongValue;
                if (size < 2) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
                    for (java.lang.Object obj : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            defpackage.ajsz.bh();
                        }
                        arrayList.add(((jzb) obj).a(j, i3));
                        i3 = i4;
                    }
                    objM = arrayList;
                } else {
                    jzi jziVar = new jzi(list, size, (defpackage.aoln) null, j);
                    jzgVar2.e = niVar;
                    jzgVar2.f = niVar;
                    jzgVar2.d = alctVarC;
                    jzgVar2.c = 1;
                    objM = defpackage.aosv.m(jziVar, jzgVar2);
                    if (objM == aoluVar) {
                        return aoluVar;
                    }
                }
                niVar2 = niVar;
                niVar3 = niVar2;
                alctVar = alctVarC;
            } else {
                defpackage.alct alctVarC2 = niVar.C();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
                for (java.lang.Object obj2 : list) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        defpackage.ajsz.bh();
                    }
                    arrayList2.add(((jzb) obj2).a(j, i3));
                    i3 = i5;
                }
                niVar.D(alctVarC2, arrayList2);
            }
            defpackage.alad aladVarR = ((defpackage.akzx) niVar.a).r();
            defpackage.aooh.e(aladVarR, "build(...)");
            return (defpackage.kiv) aladVarR;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        alctVar = jzgVar2.d;
        niVar2 = jzgVar2.f;
        niVar3 = jzgVar2.e;
        defpackage.aooc.af(objM);
        niVar2.D(alctVar, (java.lang.Iterable) objM);
        niVar = niVar3;
        defpackage.alad aladVarR2 = ((defpackage.akzx) niVar.a).r();
        defpackage.aooh.e(aladVarR2, "build(...)");
        return (defpackage.kiv) aladVarR2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b7  */
    public final java.util.List e(java.util.List list, java.util.List list2, long j, int i, int i2) {
        defpackage.aokv aokvVar;
        int i3;
        kiw kiwVarE;
        java.lang.String str;
        int i4 = i2;
        defpackage.aoir aoirVar = this.n;
        defpackage.kgz kgzVarF = f();
        boolean zG = g();
        boolean zBooleanValue = ((java.lang.Boolean) aoirVar.a()).booleanValue();
        java.lang.Boolean bool = (java.lang.Boolean) this.i.a();
        java.lang.Boolean bool2 = (java.lang.Boolean) this.j.a();
        defpackage.aokv aokvVar2 = new defpackage.aokv(i4 - i);
        defpackage.kit kitVar = null;
        int i5 = i;
        while (i5 < i4) {
            kdy kdyVar = (kdy) list.get(i5);
            int i6 = kdyVar.p;
            if (i6 == 4) {
                aokvVar = aokvVar2;
                i3 = i5;
            } else {
                if (g() && kdyVar.B != null && ((str = kdyVar.e) == null || str.length() == 0)) {
                    ((defpackage.aimw) ((defpackage.aimw) a.d()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calllog/coalescer/ConversationHistoryCoalescer", "skipEntry", 225, "ConversationHistoryCoalescer.kt")).v("skipped entry because formattedNumber isn't provided");
                } else if (i6 != 6 || (kiwVarE = kdyVar.e()) == null || !kiwVarE.j) {
                    defpackage.kit kitVar2 = defpackage.kit.OLDER;
                    if (kitVar != kitVar2) {
                        defpackage.aooh.c(bool);
                        boolean zBooleanValue2 = bool.booleanValue();
                        defpackage.aenj aenjVar = defpackage.jzk.a;
                        if (zBooleanValue2) {
                            int iU = hgz.U(j, kdyVar.b);
                            if (iU <= 0) {
                                kitVar = defpackage.kit.TODAY;
                            } else if (iU == 1) {
                                kitVar = defpackage.kit.YESTERDAY;
                            } else {
                                kitVar = kitVar2;
                            }
                        } else {
                            int iP = hgu.p(j, kdyVar.b);
                            if (iP == 0) {
                                kitVar = defpackage.kit.TODAY;
                            } else if (iP != 1) {
                                kitVar = kitVar2;
                            } else {
                                kitVar = defpackage.kit.YESTERDAY;
                            }
                        }
                    }
                    jzb jzbVar = (jzb) defpackage.ajsz.bJ(aokvVar2);
                    java.util.Map map = (java.util.Map) list2.get(i5);
                    if (jzbVar == null || !jzbVar.b(kdyVar, kitVar, map)) {
                        int i7 = i5;
                        defpackage.sso ssoVar = this.k;
                        defpackage.aooh.c(bool);
                        boolean zBooleanValue3 = bool.booleanValue();
                        defpackage.aooh.c(bool2);
                        i3 = i7;
                        aokvVar = aokvVar2;
                        aokvVar.add(new jzb(ssoVar, kitVar, kdyVar, map, kgzVarF, zG, zBooleanValue, zBooleanValue3, bool2.booleanValue(), this.o));
                    } else {
                        defpackage.aooh.f(kdyVar, "entry");
                        jzbVar.d.add(kdyVar);
                    }
                }
                aokvVar = aokvVar2;
                i3 = i5;
            }
            i5 = i3 + 1;
            aokvVar2 = aokvVar;
            i4 = i2;
        }
        return defpackage.ajsz.aX(aokvVar2);
    }

    public final defpackage.kgz f() {
        return (defpackage.kgz) this.l.a();
    }
}
