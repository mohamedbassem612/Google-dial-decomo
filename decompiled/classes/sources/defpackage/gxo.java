package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class gxo implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ gxo(int i) {
        this.$cid = i;
        this.a = "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        boolean z;
        boolean z2;
        java.util.ArrayList arrayList;
        int i;
        long j;
        long jB;
        int i2 = 1;
        int i3 = 0;
        switch (this.$cid) {
            case 0:
                defpackage.gjh gjhVar = (defpackage.gjh) obj;
                if (gjhVar == null) {
                    defpackage.aooh.i("_connection");
                }
                defpackage.gin ginVarA = gjhVar.a((java.lang.String) this.a);
                try {
                    ginVarA.m();
                    return java.lang.Integer.valueOf(defpackage.dez.i(gjhVar));
                } finally {
                    ginVarA.close();
                }
            case 1:
                defpackage.gjh gjhVar2 = (defpackage.gjh) obj;
                if (gjhVar2 == null) {
                    defpackage.aooh.i("_connection");
                }
                defpackage.gin ginVarA2 = gjhVar2.a((java.lang.String) this.a);
                try {
                    if (ginVarA2.m()) {
                        z = false;
                        if (((int) ginVarA2.c(0)) != 0) {
                            z2 = true;
                        }
                        ginVarA2.close();
                        return java.lang.Boolean.valueOf(z2);
                    }
                    z = false;
                    z2 = z;
                    ginVarA2.close();
                    return java.lang.Boolean.valueOf(z2);
                } catch (java.lang.Throwable th) {
                    ginVarA2.close();
                    throw th;
                }
            case 2:
                return defpackage.ils.h((java.lang.String) this.a, (defpackage.gjh) obj);
            case 3:
                return defpackage.ils.h((java.lang.String) this.a, (defpackage.gjh) obj);
            case 4:
                androidx.work.impl.WorkDatabase workDatabase = (androidx.work.impl.WorkDatabase) obj;
                defpackage.aooh.f(workDatabase, "db");
                java.lang.String str = defpackage.gxl.a;
                defpackage.gwv gwvVarZ = workDatabase.z();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SELECT * FROM workspec");
                ?? r0 = ((defpackage.ipc) this.a).a;
                if (!r0.isEmpty()) {
                    sb.append(" WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
                    int size = r0.size();
                    if (size > 0) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(size);
                        for (int i4 = 0; i4 < size; i4++) {
                            arrayList3.add("?");
                        }
                        sb.append(defpackage.ajsz.cr(arrayList3, ",", null, null, null, 62));
                    }
                    sb.append("))");
                    arrayList2.addAll(r0);
                }
                sb.append(';');
                java.util.List listA = gwvVarZ.a(new defpackage.gio(sb.toString(), arrayList2.toArray(new java.lang.Object[0])));
                if (listA != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(defpackage.ajsz.bl(listA, 10));
                    java.util.Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        defpackage.gxk gxkVar = (defpackage.gxk) it.next();
                        java.util.List list = gxkVar.r;
                        defpackage.grp grpVar = !list.isEmpty() ? (defpackage.grp) list.get(i3) : defpackage.grp.a;
                        java.util.UUID uuidFromString = java.util.UUID.fromString(gxkVar.a);
                        defpackage.aooh.e(uuidFromString, "fromString(...)");
                        defpackage.gsw gswVar = gxkVar.b;
                        java.util.HashSet hashSet = new java.util.HashSet(gxkVar.p);
                        defpackage.grp grpVar2 = gxkVar.c;
                        int i5 = gxkVar.h;
                        int i6 = gxkVar.m;
                        defpackage.grn grnVar = gxkVar.g;
                        long j2 = gxkVar.d;
                        int i7 = i2;
                        long j3 = gxkVar.e;
                        int i8 = j3 != 0 ? i3 : i7;
                        defpackage.gsv gsvVar = j3 != 0 ? new defpackage.gsv(j3, gxkVar.f) : null;
                        defpackage.gsw gswVar2 = defpackage.gsw.a;
                        if (gswVar == gswVar2) {
                            j = j2;
                            jB = defpackage.gus.b((gswVar != gswVar2 || i5 <= 0) ? 0 : i7, i5, gxkVar.i, gxkVar.j, gxkVar.k, gxkVar.l, i8 ^ 1, j, gxkVar.f, j3, gxkVar.n);
                            i = i5;
                        } else {
                            i = i5;
                            j = j2;
                            jB = Long.MAX_VALUE;
                        }
                        arrayList4.add(new defpackage.gsx(uuidFromString, gswVar, hashSet, grpVar2, grpVar, i, i6, grnVar, j, gsvVar, jB, gxkVar.o, gxkVar.q));
                        i2 = i7;
                        it = it;
                        i3 = 0;
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                defpackage.aooh.e(arrayList, "apply(...)");
                return arrayList;
            case 5:
                return ((defpackage.kkh) this.a.get(((java.lang.Integer) obj).intValue())).a.b();
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.kkh) this.a.get(((java.lang.Integer) obj).intValue())).a.b();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.diq diqVar = (defpackage.diq) obj;
                if (diqVar == null) {
                    defpackage.aooh.i("$this$clearAndSetSemantics");
                }
                java.lang.Object obj2 = this.a;
                diqVar.a(defpackage.din.A, new defpackage.dib(3));
                diqVar.a(defpackage.din.K, java.lang.Boolean.TRUE);
                defpackage.dji djiVar = new defpackage.dji((java.lang.String) obj2);
                defpackage.dip dipVar = defpackage.din.D;
                java.util.List listSingletonList = java.util.Collections.singletonList(djiVar);
                defpackage.aooh.e(listSingletonList, "singletonList(...)");
                diqVar.a(dipVar, listSingletonList);
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.bar barVar = (defpackage.bar) obj;
                if (barVar == null) {
                    defpackage.aooh.i("$this$LazyRow");
                }
                ?? r1 = this.a;
                barVar.b(r1.size(), new defpackage.deu(new defpackage.een(16), r1, 3), new defpackage.kgg(r1, 0), new defpackage.cja(802480018, true, new defpackage.kgh(r1)));
                return defpackage.aojh.a;
            case 9:
                defpackage.aacy aacyVar = (defpackage.aacy) obj;
                int i9 = defpackage.mcj.a;
                if (aacyVar == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar.b = this.a;
                return defpackage.aojh.a;
            case 10:
                defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                if (aacyVar2 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                java.lang.Object obj3 = this.a;
                aacyVar2.b = defpackage.aais.aI("RingingDuringNotActiveSessionNotificationInitialized", 199799);
                defpackage.adcm adcmVar = (defpackage.adcm) obj3;
                adcmVar.i = defpackage.mce.DOBBY_STARTED_RINGING_DURING_NOT_ACTIVE_SESSION;
                adcmVar.a = defpackage.mce.INCOMING_CALL_NOTIFICATION_REQUESTED;
                java.util.Set setSingleton = java.util.Collections.singleton(defpackage.mce.ON_CALL_REMOVED);
                defpackage.aooh.e(setSingleton, "singleton(...)");
                adcmVar.d(setSingleton);
                return defpackage.aojh.a;
            case 11:
                defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                if (aacyVar3 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                java.lang.Object obj4 = this.a;
                aacyVar3.b = defpackage.aais.aI("CallScreenButtonShownInNotification", 199038);
                defpackage.adcm adcmVar2 = (defpackage.adcm) obj4;
                adcmVar2.i = defpackage.mce.DOBBY_READY_FOR_MANUAL_SCREENING;
                adcmVar2.a = defpackage.mce.DOBBY_MANUAL_SCREENING_BUTTON_ADDED_TO_NOTIFICATION;
                java.util.Set setSingleton2 = java.util.Collections.singleton(defpackage.mce.ON_CALL_REMOVED);
                defpackage.aooh.e(setSingleton2, "singleton(...)");
                adcmVar2.d(setSingleton2);
                return defpackage.aojh.a;
            case 12:
                defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                if (aacyVar4 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar4.b = this.a;
                return defpackage.aojh.a;
            case 13:
                defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                if (aacyVar5 == null) {
                    defpackage.aooh.i("$this$end");
                }
                java.lang.Object obj5 = this.a;
                aacyVar5.b = defpackage.mce.ANSWER_SCREEN_CREATED;
                aacyVar5.a = obj5;
                return defpackage.aojh.a;
            case 14:
                defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                if (aacyVar6 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                java.lang.Object obj6 = this.a;
                aacyVar6.b = defpackage.aais.aI("CallScreenChipShownInAnswerScreen", 198453);
                defpackage.adcm adcmVar3 = (defpackage.adcm) obj6;
                adcmVar3.i = defpackage.mce.ANSWER_SCREEN_CREATED_WITH_MANUAL_SCREENING_CHIP;
                adcmVar3.a = defpackage.mce.DOBBY_MANUAL_SCREENING_CHIP_CREATED;
                adcmVar3.d(defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_REMOVED, defpackage.mce.DOBBY_AUTO_SCREENING_START, defpackage.mce.DOBBY_SESSION_PRECONDITION_CHECK_FAILED}));
                defpackage.mcu mcuVar = new defpackage.mcu(9);
                defpackage.ajni ajniVar = new defpackage.ajni(null);
                mcuVar.a(ajniVar);
                java.util.Set setSingleton3 = java.util.Collections.singleton(ajniVar);
                defpackage.aooh.e(setSingleton3, "singleton(...)");
                adcmVar3.f(setSingleton3);
                return defpackage.aojh.a;
            case 15:
                defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                if (aacyVar7 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar7.b = this.a;
                return defpackage.aojh.a;
            case 16:
                defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                if (aacyVar8 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar8.b = this.a;
                return defpackage.aojh.a;
            case 17:
                defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                if (aacyVar9 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar9.b = this.a;
                return defpackage.aojh.a;
            case 18:
                defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                if (aacyVar10 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar10.b = this.a;
                return defpackage.aojh.a;
            case 19:
                defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                if (aacyVar11 == null) {
                    defpackage.aooh.i("$this$end");
                }
                java.lang.Object obj7 = this.a;
                aacyVar11.b = defpackage.mce.AUDIO_ROUTE_SELECTOR_DATA_LOADED;
                aacyVar11.a = obj7;
                return defpackage.aojh.a;
            default:
                defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                if (aacyVar12 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar12.b = this.a;
                return defpackage.aojh.a;
        }
    }

    public /* synthetic */ gxo(int i, byte[] bArr) {
        this.$cid = i;
        this.a = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1";
    }

    public /* synthetic */ gxo(int i, char[] cArr) {
        this.$cid = i;
        this.a = "SELECT * FROM workspec WHERE state=1";
    }

    public /* synthetic */ gxo(int i, short[] sArr) {
        this.$cid = i;
        this.a = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time";
    }

    public /* synthetic */ gxo(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
