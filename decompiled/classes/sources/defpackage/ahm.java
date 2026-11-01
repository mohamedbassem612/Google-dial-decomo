package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahm extends defpackage.cmv implements defpackage.dbd, defpackage.dat, defpackage.dan {
    public defpackage.ahj a;

    public ahm(defpackage.ahj ahjVar) {
        this.a = ahjVar;
    }

    @Override // defpackage.dbd
    public final defpackage.cyf cX(defpackage.cyi cyiVar, defpackage.cyd cydVar, long j) {
        defpackage.czc czcVarV = cydVar.v(j);
        return cyiVar.du(czcVarV.a, czcVarV.b, defpackage.aokd.a, new defpackage.cju(cyiVar, this, czcVarV, 1));
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int e(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return wo.f(this, cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int f(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return wo.g(this, cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int i(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return wo.h(this, cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int j(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return wo.i(this, cxfVar, cxeVar, i);
    }

    @Override // defpackage.dat
    public final void o(defpackage.dbm dbmVar) {
        int i;
        dbmVar.D();
        defpackage.ahj ahjVar = this.a;
        defpackage.apkl apklVar = ((defpackage.deg) defpackage.cfo.C(this)).N;
        int iA = ahjVar.a();
        if (ahjVar.d != iA) {
            defpackage.adq adqVar = ahjVar.e;
            defpackage.agl aglVar = defpackage.agm.a;
            defpackage.aku akuVar = defpackage.ahk.a;
            int i2 = adqVar.b;
            for (int i3 = 1; i3 < i2; i3++) {
                java.lang.Object objC = adqVar.c(i3);
                int i4 = i3 - 1;
                while (true) {
                    i = i4 + 1;
                    if (i4 < 0 || aglVar.compare(adqVar.c(i4), objC) <= 0) {
                        break;
                    }
                    adqVar.i(i, adqVar.c(i4));
                    i4--;
                }
                adqVar.i(i, objC);
            }
            ahjVar.d = iA;
        }
        defpackage.adq adqVar2 = ahjVar.e;
        java.lang.Object[] objArr = adqVar2.a;
        int i5 = adqVar2.b;
        for (int i6 = 0; i6 < i5; i6++) {
            ((defpackage.agm) objArr[i6]).b(dbmVar, apklVar);
        }
    }

    @Override // defpackage.cmv
    public final void dc() {
    }

    @Override // defpackage.dat
    public final /* synthetic */ void m() {
    }

    @Override // defpackage.cmv
    public final void u() {
    }
}
