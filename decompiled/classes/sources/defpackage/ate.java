package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ate implements defpackage.cun {
    public boolean a;
    private final defpackage.ato b;

    public ate(defpackage.ato atoVar, boolean z) {
        this.b = atoVar;
        this.a = z;
    }

    @Override // defpackage.cun
    public final long a(long j, long j2, int i) {
        if (!this.a) {
            return 0L;
        }
        defpackage.ato atoVar = this.b;
        if (atoVar.a.h()) {
            return 0L;
        }
        return atoVar.f(atoVar.a(atoVar.a.a(atoVar.a(atoVar.b(j2)))));
    }

    @Override // defpackage.cun
    public final /* synthetic */ long b(long j, int i) {
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.cun
    public final java.lang.Object c(long j, long j2, defpackage.aoln aolnVar) throws java.lang.Throwable {
        atd atdVar;
        long jAM;
        if (aolnVar instanceof atd) {
            atdVar = (atd) aolnVar;
            int i = atdVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                atdVar.d = i - Integer.MIN_VALUE;
            } else {
                atdVar = new atd(this, aolnVar);
            }
        } else {
            atdVar = new atd(this, aolnVar);
        }
        java.lang.Object objG = atdVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = atdVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objG);
            jAM = 0;
            if (this.a) {
                defpackage.ato atoVar = this.b;
                if (!atoVar.g) {
                    atdVar.a = j2;
                    atdVar.d = 1;
                    objG = atoVar.g(j2, atdVar);
                    if (objG == aoluVar) {
                        return aoluVar;
                    }
                }
                jAM = defpackage.mni.aM(j2, jAM);
            }
            return new dpu(jAM);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j3 = atdVar.a;
        defpackage.aooc.af(objG);
        j2 = j3;
        jAM = ((dpu) objG).a;
        jAM = defpackage.mni.aM(j2, jAM);
        return new dpu(jAM);
    }

    @Override // defpackage.cun
    public final /* synthetic */ java.lang.Object d(long j, defpackage.aoln aolnVar) {
        return new dpu(0L);
    }
}
