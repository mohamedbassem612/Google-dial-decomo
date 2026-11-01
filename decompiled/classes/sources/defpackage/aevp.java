package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aevp {
    public final boolean a;
    public final defpackage.apga b;

    public aevp(boolean z, defpackage.apga apgaVar) {
        this.a = z;
        this.b = apgaVar;
    }

    public defpackage.aevn a(java.lang.String str) {
        return d(str);
    }

    public abstract defpackage.apga b(defpackage.aevn aevnVar);

    public defpackage.aevn d(java.lang.String str) {
        return a(str);
    }

    final defpackage.apga e() {
        defpackage.akzx akzxVarL = f(null).L();
        int i = defpackage.aevn.b.c;
        akzxVarL.u();
        defpackage.apga apgaVar = (defpackage.apga) akzxVarL.b;
        apgaVar.c = 2;
        apgaVar.d = java.lang.Integer.valueOf(i);
        return (defpackage.apga) akzxVarL.r();
    }

    public defpackage.apga f(defpackage.aevn aevnVar) {
        if (aevnVar != null) {
            defpackage.apga apgaVar = this.b;
            if (!aevnVar.equals(defpackage.aevn.c(apgaVar))) {
                defpackage.akzx akzxVarM = defpackage.apga.a.m();
                int iAM = defpackage.a.aM(apgaVar.e);
                if (iAM == 0) {
                    iAM = 1;
                }
                akzxVarM.u();
                defpackage.apga apgaVar2 = (defpackage.apga) akzxVarM.b;
                apgaVar2.e = iAM - 1;
                apgaVar2.b |= 2;
                aevnVar.h(akzxVarM);
                return (defpackage.apga) akzxVarM.r();
            }
        }
        return this.b;
    }
}
