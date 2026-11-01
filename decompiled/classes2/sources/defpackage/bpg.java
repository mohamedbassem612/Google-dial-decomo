package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bpg extends aomh implements aonn {
    int a;
    /* synthetic */ boolean b;
    final /* synthetic */ aoss c;
    final /* synthetic */ defpackage.bpk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpg(aoss aossVar, defpackage.bpk bpkVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = aossVar;
        this.d = bpkVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        bool.booleanValue();
        return c(bool, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.bpk bpkVar;
        java.lang.Float f;
        aiq aiqVar;
        boolean z = this.b;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            if (i == 1) {
                bpkVar = this.d;
                f = new java.lang.Float(0.0f);
                aiqVar = bpkVar.a;
                this.b = z;
                this.a = 2;
                if (aii.l(bpkVar.c, f, aiqVar, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                    return aoluVar;
                }
            }
        } else if (z) {
            aoov.an(this.c, (aolr) null, 0, new defpackage.bgx(this.d, (aoln) null, 10), 3);
        } else {
            defpackage.bll bllVar = new defpackage.bll(this.d, 14);
            this.b = false;
            this.a = 1;
            if (rd.s(bllVar, this) == aoluVar) {
                return aoluVar;
            }
            bpkVar = this.d;
            f = new java.lang.Float(0.0f);
            aiqVar = bpkVar.a;
            this.b = z;
            this.a = 2;
            if (aii.l(bpkVar.c, f, aiqVar, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.bpg bpgVar = new defpackage.bpg(this.c, this.d, aolnVar);
        bpgVar.b = ((java.lang.Boolean) obj).booleanValue();
        return bpgVar;
    }
}
