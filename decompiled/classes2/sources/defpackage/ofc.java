package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ofc {
    public final aoss a;
    public final java.util.ArrayList b;
    public boolean c;
    public amql d;
    public final ahda e;

    public ofc(aoss aossVar) {
        aooh.f(aossVar, "lightweightScope");
        this.a = aossVar;
        this.e = new ahda((byte[]) null);
        this.b = new java.util.ArrayList();
        this.d = amql.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.lang.String str, aoln aolnVar) {
        defpackage.ofb ofbVar;
        if (aolnVar instanceof defpackage.ofb) {
            ofbVar = (defpackage.ofb) aolnVar;
            int i = ofbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ofbVar.c = i - Integer.MIN_VALUE;
            } else {
                ofbVar = new defpackage.ofb(this, aolnVar);
            }
        } else {
            ofbVar = new defpackage.ofb(this, aolnVar);
        }
        java.lang.Object obj = ofbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ofbVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aosy aosyVarAg = ahvr.ag(this.a, this.e, new defpackage.ofa(this, str, (aoln) null, 2));
            ofbVar.c = 1;
            if (aosyVarAg.a(ofbVar) == aoluVar) {
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
