package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aeai extends aomh implements aonn {
    long a;
    java.lang.Object b;
    int c;
    final /* synthetic */ aeam d;
    final /* synthetic */ java.util.List e;
    final /* synthetic */ java.util.Map f;
    final /* synthetic */ defpackage.aeaa g;
    final /* synthetic */ aduw h;
    final /* synthetic */ akti i;
    final /* synthetic */ int j;
    final /* synthetic */ adzy k;
    final /* synthetic */ java.lang.String l;
    final /* synthetic */ java.lang.String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeai(aeam aeamVar, java.util.List list, java.util.Map map, defpackage.aeaa aeaaVar, aduw aduwVar, akti aktiVar, int i, adzy adzyVar, java.lang.String str, java.lang.String str2, aoln aolnVar) {
        super(2, aolnVar);
        this.d = aeamVar;
        this.e = list;
        this.f = map;
        this.g = aeaaVar;
        this.h = aduwVar;
        this.i = aktiVar;
        this.j = i;
        this.k = adzyVar;
        this.l = str;
        this.m = str2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        long epochMilli;
        java.lang.Object objD;
        int i;
        adao adaoVarG;
        java.lang.String str;
        adzy adzyVar;
        java.lang.String str2;
        java.lang.String str3;
        boolean z;
        aolu aoluVar = aolu.a;
        int i2 = this.c;
        if (i2 == 0) {
            aooc.af(obj);
            aeam aeamVar = this.d;
            epochMilli = j$.time.Instant.now().toEpochMilli();
            java.util.List list = this.e;
            java.util.Map map = this.f;
            defpackage.aeaa aeaaVar = this.g;
            aduw aduwVar = this.h;
            akti aktiVar = this.i;
            this.a = epochMilli;
            this.c = 1;
            objD = aeamVar.d(list, map, aeaaVar, aduwVar, epochMilli, aktiVar, this);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                java.lang.Object obj2 = this.b;
                aooc.af(obj);
                return obj2;
            }
            long j = this.a;
            aooc.af(obj);
            epochMilli = j;
            objD = obj;
        }
        adub adubVar = (adtz) objD;
        if (adubVar instanceof adub) {
            java.util.Map map2 = (java.util.Map) adubVar.a;
            if (map2.isEmpty()) {
                aeam aeamVar2 = this.d;
                aduw aduwVar2 = this.h;
                i = this.j;
                aoin aoinVar = aeamVar2.b;
                adaoVarG = aeamVar2.g(aduwVar2);
                java.lang.Object objA = aoinVar.a();
                aooh.e(objA, "get(...)");
                str = (java.lang.String) objA;
                adzyVar = this.k;
                str2 = this.l;
                str3 = this.m;
                if (aduwVar2.a()) {
                }
                this.b = adubVar;
                this.c = 2;
                if (adaoVarG.l(i, str, adzyVar, str2, epochMilli, str3, z, this) == aoluVar) {
                    return aoluVar;
                }
            } else {
                java.util.Iterator it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    if (!((adtz) ((java.util.Map.Entry) it.next()).getValue()).i()) {
                    }
                }
                aeam aeamVar3 = this.d;
                aduw aduwVar3 = this.h;
                i = this.j;
                aoin aoinVar2 = aeamVar3.b;
                adaoVarG = aeamVar3.g(aduwVar3);
                java.lang.Object objA2 = aoinVar2.a();
                aooh.e(objA2, "get(...)");
                str = (java.lang.String) objA2;
                adzyVar = this.k;
                str2 = this.l;
                str3 = this.m;
                z = !aduwVar3.a() && aduwVar3.b();
                this.b = adubVar;
                this.c = 2;
                if (adaoVarG.l(i, str, adzyVar, str2, epochMilli, str3, z, this) == aoluVar) {
                    return aoluVar;
                }
            }
        }
        return adubVar;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.aeai(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, aolnVar);
    }
}
