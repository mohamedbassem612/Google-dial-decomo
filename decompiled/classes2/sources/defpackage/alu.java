package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class alu implements defpackage.alp {
    private final defpackage.aix a;
    private aiw b;
    private aiw c;
    private aiw d;

    public alu(defpackage.ajm ajmVar) {
        this(new defpackage.alt(ajmVar));
    }

    @Override // defpackage.alp
    public final long a(aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        int iB = aiwVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = java.lang.Math.max(jMax, this.a.a(i).e(aiwVar.a(i), aiwVar2.a(i), aiwVar3.a(i)));
        }
        return jMax;
    }

    @Override // defpackage.alp
    public final aiw b(aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        aiw aiwVar4;
        aiw aiwVarC = this.d;
        if (aiwVarC == null) {
            aiwVarC = aiwVar3.c();
            this.d = aiwVarC;
        }
        if (aiwVarC == null) {
            aooh.j("endVelocityVector");
            aiwVarC = null;
        }
        int iB = aiwVarC.b();
        int i = 0;
        while (true) {
            aiwVar4 = this.d;
            if (i >= iB) {
                break;
            }
            if (aiwVar4 == null) {
                aooh.j("endVelocityVector");
                aiwVar4 = null;
            }
            aiwVar4.e(i, this.a.a(i).b(aiwVar.a(i), aiwVar2.a(i), aiwVar3.a(i)));
            i++;
        }
        if (aiwVar4 != null) {
            return aiwVar4;
        }
        aooh.j("endVelocityVector");
        return null;
    }

    @Override // defpackage.alp
    public final aiw c(long j, aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        aiw aiwVar4;
        aiw aiwVarC = this.b;
        if (aiwVarC == null) {
            aiwVarC = aiwVar.c();
            this.b = aiwVarC;
        }
        if (aiwVarC == null) {
            aooh.j("valueVector");
            aiwVarC = null;
        }
        int iB = aiwVarC.b();
        int i = 0;
        while (true) {
            aiwVar4 = this.b;
            if (i >= iB) {
                break;
            }
            if (aiwVar4 == null) {
                aooh.j("valueVector");
                aiwVar4 = null;
            }
            aiwVar4.e(i, this.a.a(i).c(j, aiwVar.a(i), aiwVar2.a(i), aiwVar3.a(i)));
            i++;
        }
        if (aiwVar4 != null) {
            return aiwVar4;
        }
        aooh.j("valueVector");
        return null;
    }

    @Override // defpackage.alp
    public final aiw d(long j, aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        aiw aiwVar4;
        aiw aiwVarC = this.c;
        if (aiwVarC == null) {
            aiwVarC = aiwVar3.c();
            this.c = aiwVarC;
        }
        if (aiwVarC == null) {
            aooh.j("velocityVector");
            aiwVarC = null;
        }
        int iB = aiwVarC.b();
        int i = 0;
        while (true) {
            aiwVar4 = this.c;
            if (i >= iB) {
                break;
            }
            if (aiwVar4 == null) {
                aooh.j("velocityVector");
                aiwVar4 = null;
            }
            aiwVar4.e(i, this.a.a(i).d(j, aiwVar.a(i), aiwVar2.a(i), aiwVar3.a(i)));
            i++;
        }
        if (aiwVar4 != null) {
            return aiwVar4;
        }
        aooh.j("velocityVector");
        return null;
    }

    @Override // defpackage.alp
    public final /* synthetic */ boolean e() {
        return false;
    }

    public alu(defpackage.aix aixVar) {
        this.a = aixVar;
    }
}
