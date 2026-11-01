package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hfg {
    private static final defpackage.kvt a = defpackage.kvt.p("x", "y");

    static float a(defpackage.hfz hfzVar) {
        int iP = hfzVar.p();
        int i = iP - 1;
        if (i != 0) {
            if (i == 6) {
                return (float) hfzVar.a();
            }
            throw new java.lang.IllegalArgumentException("Unknown value for token of type ".concat(anty.ap(iP)));
        }
        hfzVar.g();
        float fA = (float) hfzVar.a();
        while (hfzVar.n()) {
            hfzVar.m();
        }
        hfzVar.i();
        return fA;
    }

    static int b(defpackage.hfz hfzVar) {
        hfzVar.g();
        double dA = hfzVar.a() * 255.0d;
        double dA2 = hfzVar.a() * 255.0d;
        double dA3 = hfzVar.a() * 255.0d;
        while (hfzVar.n()) {
            hfzVar.m();
        }
        int i = (int) dA2;
        int i2 = (int) dA;
        hfzVar.i();
        return android.graphics.Color.argb(255, i2, i, (int) dA3);
    }

    static android.graphics.PointF c(defpackage.hfz hfzVar, float f) {
        int iP = hfzVar.p() - 1;
        if (iP == 0) {
            hfzVar.g();
            float fA = (float) hfzVar.a();
            float fA2 = (float) hfzVar.a();
            while (hfzVar.p() != 2) {
                hfzVar.m();
            }
            hfzVar.i();
            return new android.graphics.PointF(fA * f, fA2 * f);
        }
        if (iP != 2) {
            if (iP != 6) {
                throw new java.lang.IllegalArgumentException("Unknown point starts with ".concat(anty.ap(hfzVar.p())));
            }
            float fA3 = (float) hfzVar.a();
            float fA4 = (float) hfzVar.a();
            while (hfzVar.n()) {
                hfzVar.m();
            }
            return new android.graphics.PointF(fA3 * f, fA4 * f);
        }
        hfzVar.h();
        float fA5 = 0.0f;
        float fA6 = 0.0f;
        while (hfzVar.n()) {
            int iQ = hfzVar.q(a);
            if (iQ == 0) {
                fA5 = a(hfzVar);
            } else if (iQ != 1) {
                hfzVar.l();
                hfzVar.m();
            } else {
                fA6 = a(hfzVar);
            }
        }
        hfzVar.j();
        return new android.graphics.PointF(fA5 * f, fA6 * f);
    }

    static java.util.List d(defpackage.hfz hfzVar, float f) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        hfzVar.g();
        while (hfzVar.p() == 1) {
            hfzVar.g();
            arrayList.add(c(hfzVar, f));
            hfzVar.i();
        }
        hfzVar.i();
        return arrayList;
    }
}
