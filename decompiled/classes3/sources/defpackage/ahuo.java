package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class ahuo {
    public aohy b;
    public int e = 1;
    public final j$.util.concurrent.ConcurrentHashMap c = new j$.util.concurrent.ConcurrentHashMap();
    public final java.lang.Object d = new java.lang.Object();

    protected abstract void a(amac amacVar);

    final void b() {
        synchronized (this.d) {
            this.e = 3;
            this.b = null;
        }
        this.c.clear();
    }

    final int c() {
        int i;
        synchronized (this.d) {
            i = this.e;
        }
        return i;
    }

    public final void d(defpackage.amwp amwpVar) {
        aohy aohyVar;
        synchronized (this.d) {
            int i = this.e;
            if ((i != 2 && i != 1) || (aohyVar = this.b) == null) {
                aohyVar = null;
            }
            this.b = null;
            this.e = 3;
        }
        if (aohyVar != null) {
            akzx akzxVarM = defpackage.ahvm.a.m();
            java.lang.Object obj = amwpVar.b;
            if (obj != null) {
                java.lang.String message = ((defpackage.ahup) obj).getMessage();
                akzxVarM.u();
                defpackage.ahvm ahvmVar = (defpackage.ahvm) akzxVarM.b;
                j$.util.Objects.requireNonNull(message);
                ahvmVar.b = message;
            }
            akzx akzxVarM2 = defpackage.ahvi.a.m();
            int i2 = amwpVar.a - 1;
            if (i2 == 0) {
                akzxVarM.u();
                ((defpackage.ahvm) akzxVarM.b).c = a.R(3);
                akzxVarM2.u();
                defpackage.ahvi ahviVar = (defpackage.ahvi) akzxVarM2.b;
                defpackage.ahvm ahvmVar2 = (defpackage.ahvm) akzxVarM.p();
                j$.util.Objects.requireNonNull(ahvmVar2);
                ahviVar.c = ahvmVar2;
                ahviVar.b |= 16;
            } else if (i2 != 1) {
                akzxVarM.u();
                ((defpackage.ahvm) akzxVarM.b).c = a.R(5);
                akzxVarM2.u();
                defpackage.ahvi ahviVar2 = (defpackage.ahvi) akzxVarM2.b;
                defpackage.ahvm ahvmVar3 = (defpackage.ahvm) akzxVarM.p();
                j$.util.Objects.requireNonNull(ahvmVar3);
                ahviVar2.c = ahvmVar3;
                ahviVar2.b |= 16;
            } else {
                akzxVarM.u();
                ((defpackage.ahvm) akzxVarM.b).c = a.R(4);
                akzxVarM2.u();
                defpackage.ahvi ahviVar3 = (defpackage.ahvi) akzxVarM2.b;
                defpackage.ahvm ahvmVar4 = (defpackage.ahvm) akzxVarM.p();
                j$.util.Objects.requireNonNull(ahvmVar4);
                ahviVar3.c = ahvmVar4;
                ahviVar3.b |= 16;
            }
            synchronized (aohyVar) {
                aohyVar.g((defpackage.ahvi) akzxVarM2.p());
            }
        }
    }
}
