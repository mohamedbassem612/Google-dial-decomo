package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ick extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ int c;
    final /* synthetic */ akzc d;
    final /* synthetic */ defpackage.icm e;
    final /* synthetic */ defpackage.icc f;
    final /* synthetic */ defpackage.hzb g;
    private /* synthetic */ java.lang.Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ick(int i, akzc akzcVar, defpackage.icm icmVar, defpackage.icc iccVar, defpackage.hzb hzbVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = i;
        this.d = akzcVar;
        this.e = icmVar;
        this.f = iccVar;
        this.g = hzbVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        aoss aossVar;
        akzc akzcVarR;
        java.lang.Object obj2;
        defpackage.inw inwVar;
        aolu aoluVar = aolu.a;
        int i = this.b;
        if (i == 0) {
            aooc.af(obj);
            aossVar = (aoss) this.h;
            akzcVarR = akzc.u(new byte[this.c]).r(this.d);
            defpackage.icm icmVar = this.e;
            defpackage.icc iccVar = this.f;
            akzcVarR.c();
            this.h = aossVar;
            this.a = akzcVarR;
            this.b = 1;
            obj = icmVar.h(iccVar, this);
            if (obj != aoluVar) {
            }
            obj2 = akzcVarR;
            return aoluVar;
        }
        if (i != 1) {
            aooc.af(obj);
            return obj;
        }
        java.lang.Object obj3 = this.a;
        aossVar = (aoss) this.h;
        aooc.af(obj);
        obj2 = obj3;
        obj2 = akzcVarR;
        defpackage.icm icmVar2 = this.e;
        defpackage.icc iccVar2 = this.f;
        akzc akzcVar = (akzc) obj;
        int iOrdinal = iccVar2.ordinal();
        if (iOrdinal == 0) {
            inwVar = icmVar2.i;
        } else {
            if (iOrdinal != 1) {
                throw new aois();
            }
            inwVar = icmVar2.j;
        }
        aooh.c(obj2);
        akzc akzcVarA = inwVar.a((akzc) obj2, this.g.b.getSampleRate(), 16000);
        akzc akzcVarU = akzc.u(new byte[akzcVarA.c()]);
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = icmVar2.f;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            if (!defpackage.hgu.e((defpackage.icv) entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(aoov.am(aossVar, 0, new defpackage.icj(icmVar2, iccVar2, (defpackage.icu) entry2.getKey(), (defpackage.icv) entry2.getValue(), akzcVarA, akzcVar, akzcVarU, null), 3));
        }
        this.h = null;
        this.a = null;
        this.b = 2;
        java.lang.Object objV = aooh.v(arrayList, this);
        if (objV != aoluVar) {
            return objV;
        }
        obj2 = akzcVarR;
        return aoluVar;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.ick ickVar = new defpackage.ick(this.c, this.d, this.e, this.f, this.g, aolnVar);
        ickVar.h = obj;
        return ickVar;
    }
}
