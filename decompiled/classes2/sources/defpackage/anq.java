package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class anq extends cmv implements ddb, ddj {
    public kaw a;
    private avh b;

    public anq(kaw kawVar) {
        this.a = kawVar;
    }

    public final /* synthetic */ boolean C() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.ano anoVar;
        avh avhVar;
        if (aolnVar instanceof defpackage.ano) {
            anoVar = (defpackage.ano) aolnVar;
            int i = anoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                anoVar.c = i - Integer.MIN_VALUE;
            } else {
                anoVar = new defpackage.ano(this, aolnVar);
            }
        } else {
            anoVar = new defpackage.ano(this, aolnVar);
        }
        java.lang.Object obj = anoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = anoVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (this.b == null) {
                avh avhVar2 = new avh();
                kaw kawVar = this.a;
                anoVar.d = avhVar2;
                anoVar.c = 1;
                if (kawVar.av(avhVar2, anoVar) == aoluVar) {
                    return aoluVar;
                }
                avhVar = avhVar2;
            }
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        avhVar = anoVar.d;
        aooc.af(obj);
        this.b = avhVar;
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.anp anpVar;
        if (aolnVar instanceof defpackage.anp) {
            anpVar = (defpackage.anp) aolnVar;
            int i = anpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                anpVar.c = i - Integer.MIN_VALUE;
            } else {
                anpVar = new defpackage.anp(this, aolnVar);
            }
        } else {
            anpVar = new defpackage.anp(this, aolnVar);
        }
        java.lang.Object obj = anpVar.a;
        aolu aoluVar = aolu.a;
        int i2 = anpVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            avh avhVar = this.b;
            if (avhVar != null) {
                defpackage.avi aviVar = new defpackage.avi(avhVar);
                kaw kawVar = this.a;
                anpVar.c = 1;
                if (kawVar.av(aviVar, anpVar) == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(obj);
        this.b = null;
        return aojh.a;
    }

    public final void d() {
        q();
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void q() {
        avh avhVar = this.b;
        if (avhVar != null) {
            this.a.aw(new defpackage.avi(avhVar));
            this.b = null;
        }
    }

    public final void n() {
        q();
    }

    public final void p(cvf cvfVar, defpackage.cvg cvgVar, long j) {
        if (cvgVar == defpackage.cvg.b) {
            int i = cvfVar.e;
            if (i == 4) {
                aoov.an(M(), (aolr) null, 0, new defpackage.ahb(this, (aoln) null, 11), 3);
            } else if (i == 5) {
                aoov.an(M(), (aolr) null, 0, new defpackage.ahb(this, (aoln) null, 12, (byte[]) null), 3);
            }
        }
    }

    public final void u() {
        q();
    }

    public final /* synthetic */ void D() {
    }
}
