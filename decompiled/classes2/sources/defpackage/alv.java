package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class alv {
    public final ajn a;
    public aiw b;
    public aiw c;
    public final float d;
    private aiw e;

    public alv(ajn ajnVar) {
        this.a = ajnVar;
        this.d = ajnVar.a();
    }

    public final aiw a(aiw aiwVar, aiw aiwVar2) {
        aiw aiwVar3;
        aiw aiwVarC = this.e;
        if (aiwVarC == null) {
            aiwVarC = aiwVar.c();
            this.e = aiwVarC;
        }
        if (aiwVarC == null) {
            aooh.j("targetVector");
            aiwVarC = null;
        }
        int iB = aiwVarC.b();
        int i = 0;
        while (true) {
            aiwVar3 = this.e;
            if (i >= iB) {
                break;
            }
            if (aiwVar3 == null) {
                aooh.j("targetVector");
                aiwVar3 = null;
            }
            aiwVar3.e(i, this.a.b(aiwVar.a(i), aiwVar2.a(i)));
            i++;
        }
        if (aiwVar3 != null) {
            return aiwVar3;
        }
        aooh.j("targetVector");
        return null;
    }

    public final aiw b(long j, aiw aiwVar, aiw aiwVar2) {
        aiw aiwVar3;
        aiw aiwVarC = this.c;
        if (aiwVarC == null) {
            aiwVarC = aiwVar.c();
            this.c = aiwVarC;
        }
        if (aiwVarC == null) {
            aooh.j("velocityVector");
            aiwVarC = null;
        }
        int iB = aiwVarC.b();
        int i = 0;
        while (true) {
            aiwVar3 = this.c;
            if (i >= iB) {
                break;
            }
            if (aiwVar3 == null) {
                aooh.j("velocityVector");
                aiwVar3 = null;
            }
            ajn ajnVar = this.a;
            aiwVar.a(i);
            aiwVar3.e(i, ajnVar.e(j, aiwVar2.a(i)));
            i++;
        }
        if (aiwVar3 != null) {
            return aiwVar3;
        }
        aooh.j("velocityVector");
        return null;
    }
}
