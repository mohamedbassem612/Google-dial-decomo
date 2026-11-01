package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jhj implements abwm {
    private static final aimz a = aimz.i("com/android/dialer/beesly/impl/v2/service/verdict/BeeslyAiCoreVerdictListener");
    private final zjx b;

    public jhj(zjx zjxVar) {
        aooh.f(zjxVar, "workManager");
        this.b = zjxVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object a(ahbq ahbqVar, aoln aolnVar) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : ahbqVar.b.entrySet()) {
            defpackage.itc itcVar = (defpackage.itc) ((abwj) entry.getValue()).a;
            if (itcVar.d != null && itcVar.l == null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ?? r6 = ahbqVar.a;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry2 : r6.entrySet()) {
            abwk abwkVar = (abwk) entry2.getValue();
            if (((defpackage.itc) abwkVar.a).d == null) {
                defpackage.itc itcVar2 = (defpackage.itc) abwkVar.b;
                if (itcVar2.d != null && itcVar2.l == null) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
        }
        java.util.Set setAI = ajsz.aI(linkedHashMap.keySet(), linkedHashMap2.keySet());
        if (setAI.isEmpty()) {
            a.b().l("com/android/dialer/beesly/impl/v2/service/verdict/BeeslyAiCoreVerdictListener", "onKeyValueChange", 33, "BeeslyAiCoreVerdictListener.kt").v("No new transcripts needing verdict in this change batch.");
            return aojh.a;
        }
        java.lang.Object objB = b(setAI, aolnVar);
        return objB != aolu.a ? aojh.a : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.util.Set set, aoln aolnVar) {
        defpackage.jhi jhiVar;
        if (aolnVar instanceof defpackage.jhi) {
            jhiVar = (defpackage.jhi) aolnVar;
            int i = jhiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jhiVar.c = i - Integer.MIN_VALUE;
            } else {
                jhiVar = new defpackage.jhi(this, aolnVar);
            }
        } else {
            jhiVar = new defpackage.jhi(this, aolnVar);
        }
        java.lang.Object obj = jhiVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jhiVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            a.b().l("com/android/dialer/beesly/impl/v2/service/verdict/BeeslyAiCoreVerdictListener", "scheduleVerdictGeneration", 38, "BeeslyAiCoreVerdictListener.kt").w("Scheduling Beesly AiCore verdict generation for %d calls", set.size());
            aimz aimzVar = jhh.a;
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
            aguv aguvVarA = aguz.a(jhh.class);
            aguvVarA.f = grpVarQ;
            java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
            java.util.Objects.toString(uuidRandomUUID);
            aguvVarA.f(new aguy("com.android.dialer.beesly.impl.v2.service.verdict.BeeslyAiCoreContentVerdictWorker".concat(java.lang.String.valueOf(uuidRandomUUID)), 2));
            aguvVarA.e(new aile("com.android.dialer.beesly.impl.v2.service.verdict.BeeslyAiCoreContentVerdictWorker"));
            grl grlVar = new grl();
            grlVar.e = true;
            aguvVarA.b(grlVar.a());
            ajcq ajcqVarB = this.b.b(aguvVarA.a());
            jhiVar.c = 1;
            if (aosv.D(ajcqVarB, jhiVar) == aoluVar) {
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
