package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hey implements defpackage.hfw {
    public static final defpackage.hey a = new defpackage.hey();
    private static final defpackage.kvt b = defpackage.kvt.p("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // defpackage.hfw
    public final /* synthetic */ java.lang.Object a(defpackage.hfz hfzVar, float f) {
        hfzVar.h();
        java.lang.String strF = null;
        java.lang.String strF2 = null;
        android.graphics.PointF pointF = null;
        android.graphics.PointF pointF2 = null;
        boolean zO = true;
        float fA = 0.0f;
        float fA2 = 0.0f;
        float fA3 = 0.0f;
        float fA4 = 0.0f;
        int iB = 0;
        int iB2 = 0;
        int iB3 = 0;
        while (true) {
            int i = 3;
            while (hfzVar.n()) {
                switch (hfzVar.q(b)) {
                    case 0:
                        strF = hfzVar.f();
                        break;
                    case 1:
                        strF2 = hfzVar.f();
                        break;
                    case 2:
                        fA = (float) hfzVar.a();
                        break;
                    case 3:
                        int iB4 = hfzVar.b();
                        if (iB4 <= 2 && iB4 >= 0) {
                            i = a.M()[iB4];
                        }
                        break;
                    case 4:
                        iB = hfzVar.b();
                        break;
                    case 5:
                        fA2 = (float) hfzVar.a();
                        break;
                    case 6:
                        fA3 = (float) hfzVar.a();
                        break;
                    case 7:
                        iB2 = defpackage.hfg.b(hfzVar);
                        break;
                    case 8:
                        iB3 = defpackage.hfg.b(hfzVar);
                        break;
                    case 9:
                        fA4 = (float) hfzVar.a();
                        break;
                    case 10:
                        zO = hfzVar.o();
                        break;
                    case 11:
                        hfzVar.g();
                        android.graphics.PointF pointF3 = new android.graphics.PointF(((float) hfzVar.a()) * f, ((float) hfzVar.a()) * f);
                        hfzVar.i();
                        pointF = pointF3;
                        break;
                    case 12:
                        hfzVar.g();
                        android.graphics.PointF pointF4 = new android.graphics.PointF(((float) hfzVar.a()) * f, ((float) hfzVar.a()) * f);
                        hfzVar.i();
                        pointF2 = pointF4;
                        break;
                    default:
                        hfzVar.l();
                        hfzVar.m();
                        break;
                }
            }
            hfzVar.j();
            return new defpackage.hcu(strF, strF2, fA, i, iB, fA2, fA3, iB2, iB3, fA4, zO, pointF, pointF2);
        }
    }
}
