package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class eeg extends defpackage.aomh implements defpackage.aonj {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.aoor c;
    final /* synthetic */ defpackage.eei d;
    final /* synthetic */ java.lang.Object e;
    final /* synthetic */ boolean f;
    final /* synthetic */ defpackage.eem g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeg(defpackage.aoor aoorVar, defpackage.eei eeiVar, defpackage.eem eemVar, java.lang.Object obj, boolean z, defpackage.aoln aolnVar) {
        super(1, aolnVar);
        this.c = aoorVar;
        this.d = eeiVar;
        this.g = eemVar;
        this.e = obj;
        this.f = z;
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.eeg(this.c, this.d, this.g, this.e, this.f, (defpackage.aoln) obj).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX WARN: Code duplicated, block: B:18:0x006a  */
    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.io.IOException {
        java.lang.Object obj2;
        java.lang.Object obj3;
        int iHashCode;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                defpackage.aooc.af(obj);
            } else {
                obj2 = this.a;
                defpackage.aooc.af(obj);
            }
            if (this.f) {
                defpackage.eei eeiVar = this.d;
                obj3 = this.e;
                if (obj3 != null) {
                    iHashCode = obj3.hashCode();
                } else {
                    iHashCode = 0;
                }
                eeiVar.h.Y(new defpackage.ecr(obj3, iHashCode, this.c.a));
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        obj2 = this.c;
        defpackage.aogc aogcVarO = this.d.o();
        this.a = obj2;
        this.b = 1;
        java.lang.Integer num = new java.lang.Integer(((java.util.concurrent.atomic.AtomicInteger) ((defpackage.kaw) aogcVarO.a).a).incrementAndGet());
        if (num == aoluVar) {
            return aoluVar;
        }
        obj = num;
        ((defpackage.aoor) obj2).a = ((java.lang.Number) obj).intValue();
        defpackage.eem eemVar = this.g;
        java.lang.Object obj4 = this.e;
        this.a = null;
        this.b = 2;
        eemVar.b();
        java.lang.Object objN = defpackage.dpy.n(eemVar.a, new defpackage.eet(eemVar, obj4, null), this);
        if (objN != aoluVar) {
            objN = defpackage.aojh.a;
        }
        if (objN == aoluVar) {
            return aoluVar;
        }
        if (this.f) {
            defpackage.eei eeiVar2 = this.d;
            obj3 = this.e;
            if (obj3 != null) {
                iHashCode = obj3.hashCode();
            } else {
                iHashCode = 0;
            }
            eeiVar2.h.Y(new defpackage.ecr(obj3, iHashCode, this.c.a));
        }
        return defpackage.aojh.a;
    }
}
