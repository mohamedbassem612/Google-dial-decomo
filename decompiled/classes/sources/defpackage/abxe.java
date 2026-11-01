package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abxe implements defpackage.abwo {
    final /* synthetic */ defpackage.abwx a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ defpackage.aonj d;
    final /* synthetic */ defpackage.aonj e;
    final /* synthetic */ defpackage.aonj f;
    final /* synthetic */ defpackage.aonn g;

    public abxe(defpackage.abwx abwxVar, java.lang.String str, java.lang.String str2, defpackage.aonj aonjVar, defpackage.aonj aonjVar2, defpackage.aonj aonjVar3, defpackage.aonn aonnVar) {
        this.a = abwxVar;
        this.b = str;
        this.c = str2;
        this.d = aonjVar;
        this.e = aonjVar2;
        this.f = aonjVar3;
        this.g = aonnVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.abwo
    public final java.lang.Object b(java.lang.Object obj, defpackage.aoln aolnVar) {
        abxb abxbVar;
        if (aolnVar instanceof abxb) {
            abxbVar = (abxb) aolnVar;
            int i = abxbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                abxbVar.c = i - Integer.MIN_VALUE;
            } else {
                abxbVar = new abxb(this, aolnVar);
            }
        } else {
            abxbVar = new abxb(this, aolnVar);
        }
        abxb abxbVar2 = abxbVar;
        java.lang.Object objE = abxbVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = abxbVar2.c;
        if (i2 == 0) {
            defpackage.aooc.af(objE);
            defpackage.abwx abwxVar = this.a;
            java.lang.String str = this.b;
            java.lang.String str2 = this.c;
            defpackage.aonj aonjVar = this.d;
            abxbVar2.c = 1;
            objE = abwxVar.e(str, str2, obj, aonjVar, abxbVar2);
            if (objE == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objE);
        }
        if (objE != null) {
            return this.e.a(objE);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [aolu] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.LinkedHashMap, java.util.Map] */
    @Override // defpackage.abwo
    public final java.lang.Object c(java.util.Set set, defpackage.aoln aolnVar) {
        abxc abxcVar;
        if (aolnVar instanceof abxc) {
            abxcVar = (abxc) aolnVar;
            int i = abxcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                abxcVar.c = i - Integer.MIN_VALUE;
            } else {
                abxcVar = new abxc(this, aolnVar);
            }
        } else {
            abxcVar = new abxc(this, aolnVar);
        }
        abxc abxcVar2 = abxcVar;
        java.lang.Object objF = abxcVar2.a;
        java.lang.Object linkedHashMap = defpackage.aolu.a;
        int i2 = abxcVar2.c;
        if (i2 == 0) {
            defpackage.aooc.af(objF);
            defpackage.abwx abwxVar = this.a;
            java.lang.String str = this.b;
            java.lang.String str2 = this.c;
            defpackage.aonj aonjVar = this.d;
            abxcVar2.c = 1;
            objF = abwxVar.f(str, str2, set, aonjVar, abxcVar2);
            if (objF != linkedHashMap) {
            }
            return linkedHashMap;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.aooc.af(objF);
        defpackage.aonj aonjVar2 = this.f;
        defpackage.aonj aonjVar3 = this.e;
        java.lang.Iterable iterable = (java.lang.Iterable) objF;
        linkedHashMap = new java.util.LinkedHashMap(defpackage.aooc.t(defpackage.ajsz.aL(defpackage.ajsz.bl(iterable, 10)), 16));
        for (java.lang.Object obj : iterable) {
            defpackage.aoiu aoiuVar = new defpackage.aoiu(aonjVar2.a(obj), aonjVar3.a(obj));
            linkedHashMap.put(aoiuVar.a, aoiuVar.b);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.abwo
    public final java.lang.Object d(defpackage.aoln aolnVar) {
        defpackage.abxd abxdVar;
        if (aolnVar instanceof defpackage.abxd) {
            abxdVar = (defpackage.abxd) aolnVar;
            int i = abxdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                abxdVar.c = i - Integer.MIN_VALUE;
            } else {
                abxdVar = new defpackage.abxd(this, aolnVar);
            }
        } else {
            abxdVar = new defpackage.abxd(this, aolnVar);
        }
        java.lang.Object objD = abxdVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = abxdVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.abwx abwxVar = this.a;
            java.lang.String str = this.b;
            abxdVar.c = 1;
            objD = abwxVar.d(str, abxdVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        defpackage.aonj aonjVar = this.f;
        defpackage.aonj aonjVar2 = this.e;
        java.lang.Iterable iterable = (java.lang.Iterable) objD;
        int iAL = defpackage.ajsz.aL(defpackage.ajsz.bl(iterable, 10));
        if (iAL < 16) {
            iAL = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iAL);
        for (java.lang.Object obj : iterable) {
            defpackage.aoiu aoiuVar = new defpackage.aoiu(aonjVar.a(obj), aonjVar2.a(obj));
            linkedHashMap.put(aoiuVar.a, aoiuVar.b);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.abwo
    public final java.lang.Object e(defpackage.ahbq ahbqVar, defpackage.aoln aolnVar) {
        defpackage.aonn aonnVar;
        ?? r1 = ahbqVar.b;
        java.util.ArrayList arrayList = new java.util.ArrayList(r1.size());
        java.util.Iterator it = r1.entrySet().iterator();
        while (true) {
            aonnVar = this.g;
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            arrayList.add(aonnVar.a(((abwj) entry.getValue()).a, entry.getKey()));
        }
        ?? r2 = ahbqVar.a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(r2.size());
        for (java.util.Map.Entry entry2 : r2.entrySet()) {
            arrayList2.add(aonnVar.a(((abwk) entry2.getValue()).b, entry2.getKey()));
        }
        ?? r7 = ahbqVar.d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(r7.size());
        for (java.util.Map.Entry entry3 : r7.entrySet()) {
            arrayList3.add(aonnVar.a(((abwi) entry3.getValue()).a, entry3.getKey()));
        }
        java.lang.Object objA = this.a.a(arrayList, arrayList2, arrayList3, aolnVar);
        return objA != defpackage.aolu.a ? defpackage.aojh.a : objA;
    }
}
