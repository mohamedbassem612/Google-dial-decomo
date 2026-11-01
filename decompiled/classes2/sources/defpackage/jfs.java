package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jfs implements abwm {
    private static final aimz a = aimz.i("com/android/dialer/beesly/impl/v2/service/businessname/TranscriptBusinessNameListener");
    private final zjx b;
    private final zjm c;
    private final rsr d;

    public jfs(zjx zjxVar, rsr rsrVar, zjm zjmVar) {
        aooh.f(zjxVar, "workManager");
        this.b = zjxVar;
        this.d = rsrVar;
        this.c = zjmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.Set] */
    public final java.lang.Object a(ahbq ahbqVar, aoln aolnVar) {
        defpackage.jfp jfpVar;
        java.util.Set setAI;
        java.lang.Object obj;
        ?? r9;
        ?? r10;
        java.lang.String str;
        if (aolnVar instanceof defpackage.jfp) {
            jfpVar = (defpackage.jfp) aolnVar;
            int i = jfpVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                jfpVar.e = i - Integer.MIN_VALUE;
            } else {
                jfpVar = new defpackage.jfp(this, aolnVar);
            }
        } else {
            jfpVar = new defpackage.jfp(this, aolnVar);
        }
        java.lang.Object obj2 = jfpVar.c;
        aolu aoluVar = aolu.a;
        int i2 = jfpVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj3 = jfpVar.b;
                ahbq ahbqVar2 = (ahbq) jfpVar.a;
                aooc.af(obj2);
                obj = obj3;
                ahbqVar = ahbqVar2;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj4 = jfpVar.b;
                java.util.Set set = (java.util.Set) jfpVar.a;
                aooc.af(obj2);
                r9 = obj4;
                r10 = set;
            }
            if (r10.isEmpty() && r9.isEmpty()) {
                a.b().l("com/android/dialer/beesly/impl/v2/service/businessname/TranscriptBusinessNameListener", "onKeyValueChange", 52, "TranscriptBusinessNameListener.kt").v("No new transcripts needing business name extraction or deletion in this change batch.");
            }
            return aojh.a;
        }
        aooc.af(obj2);
        ?? r11 = ahbqVar.b;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : r11.entrySet()) {
            java.lang.String str2 = ((defpackage.itc) ((abwj) entry.getValue()).a).d;
            if (str2 != null && !aoov.H(str2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ?? r12 = ahbqVar.a;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry2 : r12.entrySet()) {
            abwk abwkVar = (abwk) entry2.getValue();
            java.lang.String str3 = ((defpackage.itc) abwkVar.a).d;
            if (str3 == null || aoov.H(str3)) {
                java.lang.String str4 = ((defpackage.itc) abwkVar.b).d;
                if (str4 != null && !aoov.H(str4)) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
        }
        setAI = ajsz.aI(linkedHashMap.keySet(), linkedHashMap2.keySet());
        boolean zIsEmpty = setAI.isEmpty();
        obj = setAI;
        if (!zIsEmpty) {
            jfpVar.a = ahbqVar;
            jfpVar.b = setAI;
            jfpVar.e = 1;
            if (c(setAI, jfpVar) == aoluVar) {
                obj = setAI;
                return aoluVar;
            }
        }
        obj = setAI;
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry3 : ahbqVar.d.entrySet()) {
            java.lang.String str5 = ((defpackage.itc) ((abwi) entry3.getValue()).a).d;
            if (str5 != null && !aoov.H(str5)) {
                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
            }
        }
        ?? r13 = ahbqVar.a;
        java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry4 : r13.entrySet()) {
            abwk abwkVar2 = (abwk) entry4.getValue();
            java.lang.String str6 = ((defpackage.itc) abwkVar2.a).d;
            if (str6 != null && !aoov.H(str6) && ((str = ((defpackage.itc) abwkVar2.b).d) == null || aoov.H(str))) {
                linkedHashMap4.put(entry4.getKey(), entry4.getValue());
            }
        }
        java.util.Set setAI2 = ajsz.aI(linkedHashMap3.keySet(), linkedHashMap4.keySet());
        if (!setAI2.isEmpty()) {
            jfpVar.a = obj;
            jfpVar.b = setAI2;
            jfpVar.e = 2;
            if (b(setAI2, jfpVar) == aoluVar) {
                return aoluVar;
            }
        }
        r9 = setAI2;
        r10 = obj;
        if (r10.isEmpty()) {
            a.b().l("com/android/dialer/beesly/impl/v2/service/businessname/TranscriptBusinessNameListener", "onKeyValueChange", 52, "TranscriptBusinessNameListener.kt").v("No new transcripts needing business name extraction or deletion in this change batch.");
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3 A[EDGE_INSN: B:44:0x00e3->B:39:0x00e3 BREAK  A[LOOP:0: B:26:0x0097->B:45:0x0097], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [sse] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    public final java.lang.Object b(java.util.Set set, aoln aolnVar) {
        defpackage.jfq jfqVar;
        ?? r13;
        ?? r14;
        java.util.Map map;
        java.util.LinkedHashSet linkedHashSet;
        java.util.Iterator it;
        java.lang.String str;
        long j;
        defpackage.kdy kdyVar;
        defpackage.hkd hkdVarB;
        java.lang.String str2;
        if (aolnVar instanceof defpackage.jfq) {
            jfqVar = (defpackage.jfq) aolnVar;
            int i = jfqVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                jfqVar.e = i - Integer.MIN_VALUE;
            } else {
                jfqVar = new defpackage.jfq(this, aolnVar);
            }
        } else {
            jfqVar = new defpackage.jfq(this, aolnVar);
        }
        java.lang.Object obj = jfqVar.c;
        aolu aoluVar = aolu.a;
        int i2 = jfqVar.e;
        if (i2 == 0) {
            aooc.af(obj);
            j$.util.Optional optionalG = this.c.g();
            aooh.e(optionalG, "getFeature(...)");
            defpackage.sse sseVar = (defpackage.sse) aooh.q(optionalG);
            if (sseVar != null) {
                rsr rsrVar = this.d;
                java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(set, 10));
                java.util.Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new java.lang.Long(((defpackage.ity) it2.next()).a));
                }
                java.util.Set setCf = ajsz.cf(arrayList);
                jfqVar.a = set;
                jfqVar.b = sseVar;
                jfqVar.e = 1;
                java.lang.Object objAh = rsrVar.ah(setCf, jfqVar);
                if (objAh == aoluVar) {
                    return aoluVar;
                }
                obj = objAh;
                r13 = sseVar;
                r14 = set;
                map = (java.util.Map) obj;
                linkedHashSet = new java.util.LinkedHashSet();
                it = r14.iterator();
                while (true) {
                    str = null;
                    if (it.hasNext()) {
                        break;
                        break;
                    }
                    j = ((defpackage.ity) it.next()).a;
                    kdyVar = (defpackage.kdy) map.get(new java.lang.Long(j));
                    if (kdyVar != null) {
                        str = str2;
                    }
                    if (str != null) {
                        a.b().l("com/android/dialer/beesly/impl/v2/service/businessname/TranscriptBusinessNameListener", "purgeExtractedBusinessNames", 79, "TranscriptBusinessNameListener.kt").x("Purging extracted business name for call timestamp %d", j);
                        linkedHashSet.add(str);
                    }
                }
                jfqVar.a = null;
                jfqVar.b = null;
                jfqVar.e = 2;
                if (r13.a() == aoluVar) {
                    return aoluVar;
                }
            }
        } else if (i2 == 1) {
            java.lang.Object obj2 = jfqVar.b;
            java.lang.Object obj3 = jfqVar.a;
            aooc.af(obj);
            r13 = obj2;
            r14 = obj3;
            map = (java.util.Map) obj;
            linkedHashSet = new java.util.LinkedHashSet();
            it = r14.iterator();
            while (true) {
                str = null;
                if (it.hasNext()) {
                    break;
                }
                j = ((defpackage.ity) it.next()).a;
                kdyVar = (defpackage.kdy) map.get(new java.lang.Long(j));
                if (kdyVar != null && (hkdVarB = kdyVar.b()) != null && (str2 = hkdVarB.c) != null && !aoov.H(str2)) {
                    str = str2;
                }
                if (str != null) {
                    a.b().l("com/android/dialer/beesly/impl/v2/service/businessname/TranscriptBusinessNameListener", "purgeExtractedBusinessNames", 79, "TranscriptBusinessNameListener.kt").x("Purging extracted business name for call timestamp %d", j);
                    linkedHashSet.add(str);
                }
            }
            jfqVar.a = null;
            jfqVar.b = null;
            jfqVar.e = 2;
            if (r13.a() == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(java.util.Set set, aoln aolnVar) {
        defpackage.jfr jfrVar;
        if (aolnVar instanceof defpackage.jfr) {
            jfrVar = (defpackage.jfr) aolnVar;
            int i = jfrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jfrVar.c = i - Integer.MIN_VALUE;
            } else {
                jfrVar = new defpackage.jfr(this, aolnVar);
            }
        } else {
            jfrVar = new defpackage.jfr(this, aolnVar);
        }
        java.lang.Object obj = jfrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jfrVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            a.b().l("com/android/dialer/beesly/impl/v2/service/businessname/TranscriptBusinessNameListener", "scheduleBusinessNameExtraction", 61, "TranscriptBusinessNameListener.kt").w("Scheduling transcript business name extraction for %d calls", set.size());
            aooh.f(set, "timestamps");
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(set, 10));
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((defpackage.ity) it.next()).a));
            }
            long[] jArrCn = ajsz.cn(arrayList);
            ipc ipcVar = new ipc((char[]) null);
            ipcVar.t(jArrCn);
            grp grpVarQ = ipcVar.q();
            aguv aguvVarA = aguz.a(jfu.class);
            aguvVarA.f = grpVarQ;
            java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
            java.util.Objects.toString(uuidRandomUUID);
            aguvVarA.f(new aguy("com.android.dialer.beesly.impl.v2.service.businessname.TranscriptBusinessNameWorker".concat(java.lang.String.valueOf(uuidRandomUUID)), 2));
            aguvVarA.e(new aile("com.android.dialer.beesly.impl.v2.service.businessname.TranscriptBusinessNameWorker"));
            grl grlVar = new grl();
            grlVar.e = true;
            aguvVarA.b(grlVar.a());
            ajcq ajcqVarB = this.b.b(aguvVarA.a());
            jfrVar.c = 1;
            if (aosv.D(ajcqVarB, jfrVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }
}
