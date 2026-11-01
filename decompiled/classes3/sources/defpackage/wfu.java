package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wfu extends defpackage.wfv {
    public wfu() {
        super("THINKING");
    }

    @Override // defpackage.wfv
    public final void a(defpackage.wgc wgcVar) {
        defpackage.wfv.q(wgcVar);
    }

    @Override // defpackage.wfv
    public final void b(defpackage.wgc wgcVar) {
        defpackage.wgb wgbVar = wgcVar.b;
        wgcVar.d(wgbVar, 0.0f);
        float fE = wgbVar.e();
        defpackage.wgb wgbVar2 = wgcVar.c;
        float fE2 = wgbVar2.e();
        defpackage.wgb wgbVar3 = wgcVar.d;
        float fE3 = wgbVar3.e();
        defpackage.wgb wgbVar4 = wgcVar.e;
        float f = fE2 - fE;
        float f2 = fE3 - fE2;
        float fE4 = wgbVar4.e() - fE3;
        if (f > 1.5707964f) {
            wgcVar.d(wgbVar2, 0.0f);
        } else if (f2 > 1.5707964f) {
            wgcVar.d(wgbVar3, 1.5707964f);
        } else if (fE4 > 1.5707964f) {
            wgcVar.d(wgbVar4, 3.1415927f);
        } else {
            wgcVar.d(wgbVar, 4.712389f);
        }
        wgbVar.f(4.712389f);
        wgbVar2.f(0.0f);
        wgbVar3.f(1.5707964f);
        wgbVar4.f(3.1415927f);
    }

    @Override // defpackage.wfv
    public final boolean c(long j, long j2, defpackage.wgc wgcVar) {
        float f;
        float f2 = defpackage.wfv.f(j, j2, 6000L);
        float f3 = f2 - ((int) f2);
        defpackage.wgb wgbVar = wgcVar.e;
        defpackage.wgb wgbVar2 = wgcVar.d;
        defpackage.wgb wgbVar3 = wgcVar.c;
        defpackage.wgb wgbVar4 = wgcVar.b;
        if (f3 >= 0.16749999f) {
            double d = f3;
            if (d >= 0.25d) {
                if (f3 < 0.4175f) {
                    wgbVar4.f(0.0f);
                    wgbVar3.f(1.5707964f);
                    wgbVar2.f(3.1415927f);
                    wgbVar.f(4.712389f);
                } else if (d < 0.5d) {
                    wgbVar4.f(0.5235988f);
                    wgbVar3.f(1.5707964f);
                    wgbVar2.f(4.712389f);
                    wgbVar.f(5.759587f);
                } else {
                    if (f3 < 0.6675f) {
                        wgbVar4.f(1.5707964f);
                        wgbVar3.f(3.1415927f);
                        wgbVar2.f(4.712389f);
                        wgbVar.f(0.0f);
                    } else if (d < 0.75d) {
                        wgbVar4.f(2.6179938f);
                        wgbVar3.f(3.6651917f);
                        wgbVar2.f(4.712389f);
                        wgbVar.f(1.5707964f);
                    } else if (f3 < 0.9175f) {
                        wgbVar4.f(3.1415927f);
                        wgbVar3.f(4.712389f);
                        wgbVar2.f(0.0f);
                        wgbVar.f(1.5707964f);
                    } else if (f3 < 1.0f) {
                        wgbVar4.f(4.712389f);
                        wgbVar3.f(5.759587f);
                        wgbVar2.f(0.5235988f);
                        wgbVar.f(1.5707964f);
                    }
                    f = 1.0f;
                }
                wgcVar.g(f * 3.0f);
                return true;
            }
            wgbVar4.f(4.712389f);
            wgbVar3.f(1.5707964f);
            wgbVar2.f(2.6179938f);
            wgbVar.f(3.6651917f);
            f = 2.0f;
            wgcVar.g(f * 3.0f);
            return true;
        }
        wgbVar4.f(4.712389f);
        wgbVar3.f(0.0f);
        wgbVar2.f(1.5707964f);
        wgbVar.f(3.1415927f);
        f = 1.0f;
        wgcVar.g(f * 3.0f);
        return true;
    }
}
