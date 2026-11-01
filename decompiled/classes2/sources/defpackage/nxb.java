package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nxb extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    long d;
    int e;
    final /* synthetic */ nxg f;
    final /* synthetic */ int g;
    final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxb(nxg nxgVar, int i, long j, aoln aolnVar) {
        super(2, aolnVar);
        this.f = nxgVar;
        this.g = i;
        this.h = j;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006b A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:7:0x0011, B:15:0x0056, B:16:0x0065, B:18:0x006b, B:20:0x008c, B:21:0x0090, B:22:0x00ae, B:24:0x00b4, B:25:0x00cf, B:26:0x00d9, B:28:0x00df, B:29:0x00f7), top: B:38:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00b4 A[Catch: all -> 0x0101, LOOP:1: B:22:0x00ae->B:24:0x00b4, LOOP_END, TryCatch #0 {all -> 0x0101, blocks: (B:7:0x0011, B:15:0x0056, B:16:0x0065, B:18:0x006b, B:20:0x008c, B:21:0x0090, B:22:0x00ae, B:24:0x00b4, B:25:0x00cf, B:26:0x00d9, B:28:0x00df, B:29:0x00f7), top: B:38:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00df A[Catch: all -> 0x0101, LOOP:2: B:26:0x00d9->B:28:0x00df, LOOP_END, TryCatch #0 {all -> 0x0101, blocks: (B:7:0x0011, B:15:0x0056, B:16:0x0065, B:18:0x006b, B:20:0x008c, B:21:0x0090, B:22:0x00ae, B:24:0x00b4, B:25:0x00cf, B:26:0x00d9, B:28:0x00df, B:29:0x00f7), top: B:38:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0065 A[SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        nxg nxgVar;
        int i;
        long j;
        apdp apdpVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Throwable th;
        java.lang.Object obj4;
        int i2;
        java.lang.Object obj5;
        java.util.ArrayList arrayList;
        java.util.ArrayList<aoiu> arrayList2;
        aigb aigbVar;
        long j2;
        aigf aigfVarE = aolu.a;
        int i3 = this.e;
        try {
            if (i3 == 0) {
                aooc.af(obj);
                nxgVar = this.f;
                i = this.g;
                j = this.h;
                apdpVar = nxgVar.e;
                this.a = apdpVar;
                this.b = nxgVar;
                this.c = i;
                this.d = j;
                this.e = 1;
                if (apdpVar.b(this) != aigfVarE) {
                }
                obj3 = apdpVar;
                obj2 = nxgVar;
                return aigfVarE;
            }
            j = this.d;
            if (i3 != 1) {
                i2 = this.c;
                java.lang.Object obj6 = this.b;
                obj4 = this.a;
                try {
                    aooc.af(obj);
                    obj5 = obj6;
                    obj4 = obj4;
                    java.util.Set setEntrySet = ((java.util.Map) obj).entrySet();
                    arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj7 : setEntrySet) {
                        j2 = ((nxp) ((java.util.Map.Entry) obj7).getValue()).c;
                        aazc aazcVar = ((nxg) obj5).f;
                        if (j2 <= j$.time.Instant.now().toEpochMilli() - j) {
                            arrayList.add(obj7);
                        }
                    }
                    java.util.List<java.util.Map.Entry> listBY = ajsz.bY(ajsz.bX(arrayList, new defpackage.hte(19)), i2);
                    arrayList2 = new java.util.ArrayList(ajsz.bl(listBY, 10));
                    for (java.util.Map.Entry entry : listBY) {
                        arrayList2.add(new aoiu(entry.getKey(), ((nxp) entry.getValue()).b));
                    }
                    aigbVar = new aigb(4);
                    for (aoiu aoiuVar : arrayList2) {
                        java.lang.Object obj8 = aoiuVar.a;
                        java.lang.Object obj9 = aoiuVar.b;
                        aooh.f(obj8, "key");
                        aooh.f(obj9, "value");
                        aigbVar.i(obj8, obj9);
                    }
                    aigfVarE = aigbVar.e(true);
                    ((apdp) obj4).d();
                    obj3 = apdpVar;
                    obj2 = nxgVar;
                    return aigfVarE;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    ((apdp) obj4).d();
                    throw th;
                }
            }
            i = this.c;
            java.lang.Object obj10 = this.b;
            java.lang.Object obj11 = this.a;
            aooc.af(obj);
            obj2 = obj10;
            obj3 = obj11;
            obj3 = apdpVar;
            obj2 = nxgVar;
            abwo abwoVar = ((nxg) obj2).d;
            this.a = obj3;
            this.b = obj2;
            this.c = i;
            this.d = j;
            this.e = 2;
            java.lang.Object objD = abwoVar.d(this);
            if (objD != aigfVarE) {
                i2 = i;
                obj5 = obj2;
                obj = objD;
                obj4 = obj3;
                java.util.Set setEntrySet2 = ((java.util.Map) obj).entrySet();
                arrayList = new java.util.ArrayList();
                while (r12.hasNext()) {
                    j2 = ((nxp) ((java.util.Map.Entry) obj7).getValue()).c;
                    aazc aazcVar2 = ((nxg) obj5).f;
                    if (j2 <= j$.time.Instant.now().toEpochMilli() - j) {
                        arrayList.add(obj7);
                    }
                }
                java.util.List<java.util.Map.Entry> listBY2 = ajsz.bY(ajsz.bX(arrayList, new defpackage.hte(19)), i2);
                arrayList2 = new java.util.ArrayList(ajsz.bl(listBY2, 10));
                while (r12.hasNext()) {
                    arrayList2.add(new aoiu(entry.getKey(), ((nxp) entry.getValue()).b));
                }
                aigbVar = new aigb(4);
                while (r0.hasNext()) {
                    java.lang.Object obj12 = aoiuVar.a;
                    java.lang.Object obj13 = aoiuVar.b;
                    aooh.f(obj12, "key");
                    aooh.f(obj13, "value");
                    aigbVar.i(obj12, obj13);
                }
                aigfVarE = aigbVar.e(true);
                ((apdp) obj4).d();
            }
            obj3 = apdpVar;
            obj2 = nxgVar;
            return aigfVarE;
        } catch (java.lang.Throwable th3) {
            th = th3;
            obj4 = obj3;
            ((apdp) obj4).d();
            throw th;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.nxb(this.f, this.g, this.h, aolnVar);
    }
}
