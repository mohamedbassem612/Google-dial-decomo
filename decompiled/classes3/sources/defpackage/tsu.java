package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tsu implements defpackage.ttd {
    private defpackage.ttg a = wsc.cs(defpackage.ttg.a.m()).Z();

    @Override // defpackage.ttd
    public final defpackage.ttc a(defpackage.ttb ttbVar) {
        aooh.f(ttbVar, "event");
        int i = ttbVar.b;
        int iCm = wsc.cm(i);
        if (iCm == 0) {
            throw null;
        }
        int i2 = iCm - 1;
        if (i2 == 0) {
            defpackage.tth tthVarB = defpackage.tth.b((i == 1 ? (defpackage.tsv) ttbVar.c : defpackage.tsv.a).b);
            if (tthVarB == null) {
                tthVarB = defpackage.tth.UNRECOGNIZED;
            }
            if (tthVarB != defpackage.tth.SCAM_DETECTION_RUNNING) {
                return defpackage.ttc.a;
            }
            defpackage.vqu vquVarCs = wsc.cs(this.a.p());
            akzx akzxVar = (akzx) vquVarCs.a;
            akzxVar.u();
            ((defpackage.ttg) akzxVar.b).b = true;
            this.a = vquVarCs.Z();
            return defpackage.ttc.c;
        }
        if (i2 == 1) {
            defpackage.vqu vquVarCs2 = wsc.cs(this.a.p());
            akzx akzxVar2 = (akzx) vquVarCs2.a;
            akzxVar2.u();
            ((defpackage.ttg) akzxVar2.b).c = true;
            vquVarCs2.aa(5);
            this.a = vquVarCs2.Z();
            return defpackage.ttc.c;
        }
        if (i2 == 2) {
            defpackage.vqu vquVarCs3 = wsc.cs(this.a.p());
            vquVarCs3.aa(3);
            this.a = vquVarCs3.Z();
            return defpackage.ttc.c;
        }
        if (i2 != 3) {
            return defpackage.ttc.a;
        }
        defpackage.vqu vquVarCs4 = wsc.cs(this.a.p());
        vquVarCs4.aa(4);
        this.a = vquVarCs4.Z();
        return defpackage.ttc.c;
    }

    @Override // defpackage.ttd
    public final defpackage.tti b(defpackage.tti ttiVar) {
        aooh.f(ttiVar, "model");
        defpackage.vqu vquVarCu = wsc.cu(ttiVar.p());
        defpackage.ttg ttgVar = this.a;
        aooh.f(ttgVar, "value");
        akzx akzxVar = (akzx) vquVarCu.a;
        akzxVar.u();
        defpackage.tti ttiVar2 = (defpackage.tti) akzxVar.b;
        j$.util.Objects.requireNonNull(ttgVar);
        ttiVar2.e = ttgVar;
        ttiVar2.b |= 1;
        return vquVarCu.ad();
    }
}
