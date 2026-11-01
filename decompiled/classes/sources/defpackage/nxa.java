package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class nxa extends defpackage.aomh implements defpackage.aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.nxg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxa(defpackage.nxg nxgVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.d = nxgVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.nxa) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d A[Catch: all -> 0x0082, LOOP:0: B:15:0x0057->B:17:0x005d, LOOP_END, TryCatch #0 {all -> 0x0082, blocks: (B:6:0x000b, B:14:0x0040, B:15:0x0057, B:17:0x005d, B:18:0x0073), top: B:27:0x000b }] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.nxg nxgVar;
        defpackage.apdp apdpVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Throwable th;
        java.lang.Object obj4;
        java.util.LinkedHashMap linkedHashMap;
        java.lang.Object objI = defpackage.aolu.a;
        int i = this.c;
        try {
            if (i == 0) {
                defpackage.aooc.af(obj);
                nxgVar = this.d;
                apdpVar = nxgVar.e;
                this.a = apdpVar;
                this.b = nxgVar;
                this.c = 1;
                if (apdpVar.b(this) != objI) {
                }
                obj3 = nxgVar;
                obj2 = apdpVar;
                return objI;
            }
            if (i != 1) {
                obj4 = this.a;
                try {
                    defpackage.aooc.af(obj);
                    obj4 = obj4;
                    java.util.Map map = (java.util.Map) obj;
                    linkedHashMap = new java.util.LinkedHashMap(defpackage.ajsz.aL(map.size()));
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), ((defpackage.nxp) entry.getValue()).b);
                    }
                    objI = defpackage.aigf.i(linkedHashMap);
                    defpackage.aooh.e(objI, "copyOf(...)");
                    ((defpackage.apdp) obj4).d();
                    obj3 = nxgVar;
                    obj2 = apdpVar;
                    return objI;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    ((defpackage.apdp) obj4).d();
                    throw th;
                }
            }
            java.lang.Object obj5 = this.b;
            java.lang.Object obj6 = this.a;
            defpackage.aooc.af(obj);
            obj2 = obj6;
            obj3 = obj5;
            obj3 = nxgVar;
            obj2 = apdpVar;
            defpackage.abwo abwoVar = ((defpackage.nxg) obj3).d;
            this.a = obj2;
            this.b = null;
            this.c = 2;
            java.lang.Object objD = abwoVar.d(this);
            if (objD != objI) {
                java.lang.Object obj7 = obj2;
                obj = objD;
                obj4 = obj7;
                java.util.Map map2 = (java.util.Map) obj;
                linkedHashMap = new java.util.LinkedHashMap(defpackage.ajsz.aL(map2.size()));
                while (r5.hasNext()) {
                    linkedHashMap.put(entry.getKey(), ((defpackage.nxp) entry.getValue()).b);
                }
                objI = defpackage.aigf.i(linkedHashMap);
                defpackage.aooh.e(objI, "copyOf(...)");
                ((defpackage.apdp) obj4).d();
            }
            obj3 = nxgVar;
            obj2 = apdpVar;
            return objI;
        } catch (java.lang.Throwable th3) {
            java.lang.Object obj8 = obj2;
            th = th3;
            obj4 = obj8;
            ((defpackage.apdp) obj4).d();
            throw th;
        }
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return new defpackage.nxa(this.d, aolnVar);
    }
}
