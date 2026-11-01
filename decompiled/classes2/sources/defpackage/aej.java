package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aej extends defpackage.ahn {
    private final ccp a = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.c);
    private defpackage.agu b;

    public aej(defpackage.agu aguVar) {
        this.b = aguVar;
    }

    private final void j(cpn cpnVar) {
        this.a.b(cpnVar);
    }

    @Override // defpackage.ahn
    public final defpackage.ahn a() {
        return defpackage.agq.a;
    }

    @Override // defpackage.ahn
    public final cpn b() {
        return (cpn) this.a.a();
    }

    @Override // defpackage.ahn
    public final cpn c(defpackage.agx agxVar) {
        java.lang.Object obj;
        cpn cpnVarB = b();
        if (cpnVarB != null) {
            return cpnVarB;
        }
        if (b() == null) {
            defpackage.agu aguVar = this.b;
            if (aguVar == null) {
                adq adqVar = agxVar.g;
                java.lang.Object[] objArr = adqVar.a;
                int i = adqVar.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        obj = null;
                        break;
                    }
                    obj = objArr[i2];
                    if (agxVar.b().contains((defpackage.agy) obj)) {
                        break;
                    }
                    i2++;
                }
                defpackage.agy agyVar = (defpackage.agy) obj;
                aguVar = agyVar != null ? agyVar.m : null;
            }
            cpn cpnVarA = wl.a(agxVar, aguVar);
            if (cpnVarA != null) {
                j(cpnVarA);
            }
        }
        return b();
    }

    @Override // defpackage.ahn
    public final void d(cpn cpnVar) {
        j(cpnVar);
    }

    @Override // defpackage.ahn
    public final boolean e() {
        return true;
    }

    @Override // defpackage.ahn
    public final defpackage.ahn f(defpackage.agx agxVar, defpackage.agu aguVar, long j, long j2, long j3) {
        java.lang.Object obj;
        defpackage.bhm bhmVar = new defpackage.bhm(j, mni.aM(j2, j3), j3);
        cpn cpnVarB = b();
        if (cpnVarB == null) {
            defpackage.agu aguVar2 = this.b;
            if (aguVar2 == null) {
                adq adqVar = agxVar.g;
                java.lang.Object[] objArr = adqVar.a;
                int i = adqVar.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        obj = null;
                        break;
                    }
                    obj = objArr[i2];
                    if (agxVar.b().contains((defpackage.agy) obj)) {
                        break;
                    }
                    i2++;
                }
                defpackage.agy agyVar = (defpackage.agy) obj;
                aguVar2 = agyVar != null ? agyVar.m : null;
            }
            cpnVarB = wl.a(agxVar, aguVar2);
            if (cpnVarB == null) {
                cpnVarB = cdh.x(j2, j);
            }
        }
        wl.d(bhmVar, j, j2, j3, true);
        return new defpackage.ago(bhmVar, aguVar, cpnVarB);
    }

    @Override // defpackage.ahn
    public final defpackage.ahn g(defpackage.agu aguVar) {
        if (this.b == null) {
            this.b = aguVar;
        }
        return this;
    }

    @Override // defpackage.ahn
    public final defpackage.bhm h() {
        return null;
    }
}
