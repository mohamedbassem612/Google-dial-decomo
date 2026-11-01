package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cce {
    public final java.lang.Object a = new java.lang.Object();
    public java.util.List b = new java.util.ArrayList();
    public java.util.List c = new java.util.ArrayList();
    public boolean d = true;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        defpackage.ccd ccdVar;
        if (aolnVar instanceof defpackage.ccd) {
            ccdVar = (defpackage.ccd) aolnVar;
            int i = ccdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ccdVar.c = i - Integer.MIN_VALUE;
            } else {
                ccdVar = new defpackage.ccd(this, aolnVar);
            }
        } else {
            ccdVar = new defpackage.ccd(this, aolnVar);
        }
        java.lang.Object obj = ccdVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ccdVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!b()) {
                ccdVar.c = 1;
                defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(ccdVar), 1);
                aoscVar.z();
                synchronized (this.a) {
                    this.b.add(aoscVar);
                }
                aoscVar.d(new dev(this, aoscVar, 1));
                if (aoscVar.k() == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }
}
