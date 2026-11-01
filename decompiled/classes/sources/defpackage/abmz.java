package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abmz {
    public static final defpackage.cbd a = new defpackage.cbn(defpackage.cdu.c, new defpackage.uoa(3));

    public static final defpackage.abmy a(defpackage.acqy acqyVar, boolean z, boolean z2, boolean z3) {
        long j;
        if (acqyVar == null) {
            defpackage.aooh.i("tonalPalette");
        }
        if (!z) {
            if (acqyVar == null) {
                defpackage.aooh.i("tonalPalette");
            }
            long j2 = acqyVar.e;
            long j3 = acqyVar.q;
            long j4 = acqyVar.ab;
            long j5 = acqyVar.g;
            long jCB = defpackage.agab.cB(acqyVar.U);
            long j6 = acqyVar.V;
            long jCB2 = defpackage.agab.cB(j6);
            long j7 = acqyVar.a;
            long j8 = acqyVar.X;
            defpackage.abmx abmxVar = new defpackage.abmx(j2, j3, j4, j3, j5, j3, jCB, jCB2, j7, j8, acqyVar.P, j8, defpackage.cqg.h(j8, 0.5f));
            defpackage.abng abngVar = z3 ? defpackage.abnh.c : defpackage.abnh.a;
            if (acqyVar == null) {
                defpackage.aooh.i("tonalPalette");
            }
            long j9 = acqyVar.Q;
            if (acqyVar == null) {
                defpackage.aooh.i("<this>");
            }
            long j10 = acqyVar.R;
            float[] fArr = defpackage.crp.a;
            defpackage.csb csbVar = defpackage.crp.e;
            long jF = defpackage.dwm.f((int) (defpackage.cqg.e(j10, csbVar) >>> 32), (int) (defpackage.cqg.e(j9, csbVar) >>> 32), 0.4f);
            float[] fArr2 = new float[3];
            int iE = (int) (defpackage.cqg.e(j9, csbVar) >>> 32);
            defpackage.dwm.i(android.graphics.Color.red(iE), android.graphics.Color.green(iE), android.graphics.Color.blue(iE), fArr2);
            float fMax = java.lang.Math.max(fArr2[2], 0.9f);
            defpackage.abmw abmwVar = new defpackage.abmw(defpackage.agab.cC(j9, fMax), defpackage.agab.cC(jF << 32, (-0.04f) + fMax), defpackage.agab.cC(j10, fMax - 0.06f));
            long jH = defpackage.cqg.h(acqyVar.t, 0.6f);
            long jH2 = defpackage.cqg.h(j6, 0.52f);
            long j11 = acqyVar.b;
            if (z2) {
                j = android.os.Build.VERSION.SDK_INT >= 34 ? acqyVar.c : acqyVar.v;
            } else {
                j = j7;
            }
            return new defpackage.abmy(acqyVar, abmxVar, abngVar, abmwVar, j3, j3, jH, false, -6118554575306752L, -4294967296L, 792352059440496640L, -4294967296L, -45208172922667008L, -863193937215488L, -11286491154087936L, -15792289804713984L, -9883514317045760L, -39604816854384640L, -63297651755450368L, jH2, -63456947797491712L, j7, -31720884691533824L, -4617948836659200L, j7, -10924588619792384L, j7, -1725288362803200L, -32619108382015488L, j11, j);
        }
        if (acqyVar == null) {
            defpackage.aooh.i("tonalPalette");
        }
        long j12 = acqyVar.n;
        long j13 = acqyVar.h;
        long j14 = acqyVar.ad;
        long j15 = acqyVar.q;
        long j16 = acqyVar.o;
        long j17 = acqyVar.W;
        long jD = acqyVar.X;
        float[] fArr3 = defpackage.crp.a;
        defpackage.csb csbVar2 = defpackage.crp.e;
        long jE = defpackage.cqg.e(jD, csbVar2) >>> 32;
        int i = defpackage.dwm.a;
        int i2 = (int) jE;
        float[] fArr4 = {0.0f, 0.0f, f};
        defpackage.dwm.i(android.graphics.Color.red(i2), android.graphics.Color.green(i2), android.graphics.Color.blue(i2), fArr4);
        float f = fArr4[2] + 0.03f;
        if (f <= 1.0f) {
            jD = ((long) defpackage.dwm.d(fArr4)) << 32;
        }
        long j18 = jD;
        long j19 = acqyVar.T;
        float fD = defpackage.cqg.d(j19);
        float fC = defpackage.cqg.c(j19);
        float fB = defpackage.cqg.b(j19);
        defpackage.crn[] crnVarArr = defpackage.crp.y;
        defpackage.abmx abmxVar2 = new defpackage.abmx(j12, j13, j14, j15, j16, j13, j17, j18, j13, j19, j15, j19, defpackage.cfd.N(fD, fC, fB, 0.5f, crnVarArr[(int) (j19 & 63)]));
        defpackage.abng abngVar2 = z3 ? defpackage.abnh.d : defpackage.abnh.b;
        if (acqyVar == null) {
            defpackage.aooh.i("tonalPalette");
        }
        if (acqyVar == null) {
            defpackage.aooh.i("<this>");
        }
        long j20 = acqyVar.Z;
        long jE2 = defpackage.cqg.e(j20, csbVar2) >>> 32;
        long j21 = acqyVar.Y;
        long jF2 = defpackage.dwm.f((int) jE2, (int) (defpackage.cqg.e(j21, csbVar2) >>> 32), 0.4f);
        if (acqyVar == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.abng abngVar3 = abngVar2;
        long jF3 = defpackage.dwm.f((int) (defpackage.cqg.e(j20, csbVar2) >>> 32), (int) (defpackage.cqg.e(j21, csbVar2) >>> 32), 0.7f);
        if (acqyVar == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.abmw abmwVar2 = new defpackage.abmw(jF2 << 32, jF3 << 32, ((long) defpackage.dwm.f((int) (defpackage.cqg.e(j20, csbVar2) >>> 32), (int) (defpackage.cqg.e(j21, csbVar2) >>> 32), 0.8f)) << 32);
        long j22 = acqyVar.t;
        long jN = defpackage.cfd.N(defpackage.cqg.d(j22), defpackage.cqg.c(j22), defpackage.cqg.b(j22), 0.6f, crnVarArr[(int) (j22 & 63)]);
        long j23 = acqyVar.S;
        return new defpackage.abmy(acqyVar, abmxVar2, abngVar3, abmwVar2, j15, j15, jN, true, -4952904746139648L, -63013956280647680L, 1941817476878696448L, -66688592860151808L, -7912210227527680L, -45013937321672704L, -58998840463720448L, -55010890314940416L, -29137156920311808L, -2836774359400448L, -2836774359400448L, defpackage.cfd.N(defpackage.cqg.d(j23), defpackage.cqg.c(j23), defpackage.cqg.b(j23), 0.52f, crnVarArr[(int) (j23 & 63)]), -46239463289913344L, -66688592860151808L, -4617948836659200L, -918092209192960L, -66688592860151808L, -4952904746139648L, -66688592860151808L, -32619108382015488L, -1725288362803200L, acqyVar.r, (!z2 || android.os.Build.VERSION.SDK_INT < 34) ? acqyVar.J : j16);
    }
}
