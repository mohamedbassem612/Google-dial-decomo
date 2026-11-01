package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hfh {
    public static final /* synthetic */ int c = 0;
    private static final android.view.animation.Interpolator d = new android.view.animation.LinearInterpolator();
    static final defpackage.kvt a = defpackage.kvt.p("t", "s", "e", "o", "i", "h", "to", "ti");
    static final defpackage.kvt b = defpackage.kvt.p("x", "y");

    /* JADX WARN: Code duplicated, block: B:98:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f1  */
    static defpackage.hgn a(defpackage.hfz hfzVar, defpackage.gzh gzhVar, float f, defpackage.hfw hfwVar, boolean z, boolean z2) {
        android.view.animation.Interpolator interpolatorB;
        java.lang.Object obj;
        android.view.animation.Interpolator interpolatorB2;
        android.view.animation.Interpolator interpolatorB3;
        android.view.animation.Interpolator interpolatorB4;
        java.lang.Object obj2;
        android.view.animation.Interpolator interpolator;
        defpackage.hgn hgnVar;
        boolean z3;
        java.lang.Object obj3;
        android.graphics.PointF pointF;
        java.lang.Object obj4;
        android.graphics.PointF pointF2;
        if (!z) {
            return new defpackage.hgn(hfwVar.a(hfzVar, f));
        }
        if (!z2) {
            hfzVar.h();
            android.graphics.PointF pointFC = null;
            android.graphics.PointF pointFC2 = null;
            android.graphics.PointF pointFC3 = null;
            boolean z4 = false;
            java.lang.Object objA = null;
            float fA = 0.0f;
            android.graphics.PointF pointFC4 = null;
            java.lang.Object objA2 = null;
            while (hfzVar.n()) {
                switch (hfzVar.q(a)) {
                    case 0:
                        fA = (float) hfzVar.a();
                        break;
                    case 1:
                        objA = hfwVar.a(hfzVar, f);
                        break;
                    case 2:
                        objA2 = hfwVar.a(hfzVar, f);
                        break;
                    case 3:
                        pointFC = defpackage.hfg.c(hfzVar, 1.0f);
                        break;
                    case 4:
                        pointFC2 = defpackage.hfg.c(hfzVar, 1.0f);
                        break;
                    case 5:
                        z4 = hfzVar.b() == 1;
                        break;
                    case 6:
                        pointFC3 = defpackage.hfg.c(hfzVar, f);
                        break;
                    case 7:
                        pointFC4 = defpackage.hfg.c(hfzVar, f);
                        break;
                    default:
                        hfzVar.m();
                        break;
                }
            }
            hfzVar.j();
            if (z4) {
                interpolatorB = d;
                obj = objA;
            } else {
                interpolatorB = (pointFC == null || pointFC2 == null) ? d : b(pointFC, pointFC2);
                obj = objA2;
            }
            defpackage.hgn hgnVar2 = new defpackage.hgn(gzhVar, objA, obj, interpolatorB, fA, (java.lang.Float) null);
            hgnVar2.l = pointFC3;
            hgnVar2.m = pointFC4;
            return hgnVar2;
        }
        hfzVar.h();
        android.graphics.PointF pointFC5 = null;
        android.graphics.PointF pointFC6 = null;
        boolean z5 = false;
        android.graphics.PointF pointFC7 = null;
        android.graphics.PointF pointFC8 = null;
        android.graphics.PointF pointF3 = null;
        java.lang.Object objA3 = null;
        android.graphics.PointF pointF4 = null;
        android.graphics.PointF pointF5 = null;
        android.graphics.PointF pointF6 = null;
        float fA2 = 0.0f;
        java.lang.Object objA4 = null;
        while (hfzVar.n()) {
            switch (hfzVar.q(a)) {
                case 0:
                    fA2 = (float) hfzVar.a();
                    pointFC7 = pointFC7;
                    pointFC8 = pointFC8;
                    z5 = z5;
                    break;
                case 1:
                    objA3 = hfwVar.a(hfzVar, f);
                    z5 = z5;
                    break;
                case 2:
                    objA4 = hfwVar.a(hfzVar, f);
                    z5 = z5;
                    break;
                case 3:
                    z3 = z5;
                    android.graphics.PointF pointF7 = pointFC8;
                    obj3 = objA3;
                    android.graphics.PointF pointF8 = pointFC7;
                    if (hfzVar.p() == 3) {
                        hfzVar.h();
                        float fA3 = 0.0f;
                        float fA4 = 0.0f;
                        float fA5 = 0.0f;
                        float fA6 = 0.0f;
                        while (hfzVar.n()) {
                            int iQ = hfzVar.q(b);
                            if (iQ == 0) {
                                pointF = pointF8;
                                if (hfzVar.p() == 7) {
                                    fA5 = (float) hfzVar.a();
                                    pointF8 = pointF;
                                    fA3 = fA5;
                                } else {
                                    hfzVar.g();
                                    fA3 = (float) hfzVar.a();
                                    fA5 = hfzVar.p() == 7 ? (float) hfzVar.a() : fA3;
                                    hfzVar.i();
                                    pointF8 = pointF;
                                }
                            } else if (iQ != 1) {
                                hfzVar.m();
                            } else {
                                pointF = pointF8;
                                if (hfzVar.p() == 7) {
                                    fA6 = (float) hfzVar.a();
                                    pointF8 = pointF;
                                    fA4 = fA6;
                                } else {
                                    hfzVar.g();
                                    fA4 = (float) hfzVar.a();
                                    fA6 = hfzVar.p() == 7 ? (float) hfzVar.a() : fA4;
                                    hfzVar.i();
                                    pointF8 = pointF;
                                }
                            }
                        }
                        pointF3 = new android.graphics.PointF(fA3, fA4);
                        pointF4 = new android.graphics.PointF(fA5, fA6);
                        hfzVar.j();
                        pointFC7 = pointF8;
                    } else {
                        pointFC7 = defpackage.hfg.c(hfzVar, f);
                    }
                    pointFC8 = pointF7;
                    z5 = z3;
                    objA3 = obj3;
                    break;
                case 4:
                    if (hfzVar.p() == 3) {
                        hfzVar.h();
                        float fA7 = 0.0f;
                        float fA8 = 0.0f;
                        float fA9 = 0.0f;
                        float fA10 = 0.0f;
                        while (hfzVar.n()) {
                            boolean z6 = z5;
                            int iQ2 = hfzVar.q(b);
                            if (iQ2 != 0) {
                                obj4 = objA3;
                                if (iQ2 != 1) {
                                    hfzVar.m();
                                } else {
                                    pointF2 = pointFC7;
                                    if (hfzVar.p() == 7) {
                                        fA10 = (float) hfzVar.a();
                                        pointFC7 = pointF2;
                                        fA8 = fA10;
                                    } else {
                                        hfzVar.g();
                                        fA8 = (float) hfzVar.a();
                                        fA10 = hfzVar.p() == 7 ? (float) hfzVar.a() : fA8;
                                        hfzVar.i();
                                        pointFC8 = pointFC8;
                                        pointFC7 = pointF2;
                                    }
                                }
                            } else {
                                pointFC8 = pointFC8;
                                obj4 = objA3;
                                pointF2 = pointFC7;
                                if (hfzVar.p() == 7) {
                                    fA9 = (float) hfzVar.a();
                                    pointFC8 = pointFC8;
                                    pointFC7 = pointF2;
                                    fA7 = fA9;
                                } else {
                                    hfzVar.g();
                                    fA7 = (float) hfzVar.a();
                                    fA9 = hfzVar.p() == 7 ? (float) hfzVar.a() : fA7;
                                    hfzVar.i();
                                    pointFC8 = pointFC8;
                                    pointFC7 = pointF2;
                                }
                            }
                            z5 = z6;
                            objA3 = obj4;
                        }
                        z3 = z5;
                        obj3 = objA3;
                        android.graphics.PointF pointF9 = pointFC7;
                        android.graphics.PointF pointF10 = new android.graphics.PointF(fA7, fA8);
                        android.graphics.PointF pointF11 = new android.graphics.PointF(fA9, fA10);
                        hfzVar.j();
                        pointF6 = pointF11;
                        pointF5 = pointF10;
                        pointFC7 = pointF9;
                        z5 = z3;
                    } else {
                        obj3 = objA3;
                        pointFC8 = defpackage.hfg.c(hfzVar, f);
                    }
                    objA3 = obj3;
                    break;
                case 5:
                    z5 = hfzVar.b() == 1;
                    break;
                case 6:
                    pointFC5 = defpackage.hfg.c(hfzVar, f);
                    break;
                case 7:
                    pointFC6 = defpackage.hfg.c(hfzVar, f);
                    break;
                default:
                    hfzVar.m();
                    z5 = z5;
                    break;
            }
        }
        boolean z7 = z5;
        android.graphics.PointF pointF12 = pointFC7;
        android.graphics.PointF pointF13 = pointFC8;
        java.lang.Object obj5 = objA3;
        hfzVar.j();
        if (z7) {
            interpolator = d;
            obj2 = obj5;
        } else {
            if (pointF12 == null || pointF13 == null) {
                if (pointF3 == null || pointF4 == null || pointF5 == null || pointF6 == null) {
                    interpolatorB2 = d;
                } else {
                    interpolatorB3 = b(pointF3, pointF5);
                    interpolatorB4 = b(pointF4, pointF6);
                    obj2 = objA4;
                    interpolator = null;
                }
                if (interpolatorB3 != null) {
                    hgnVar = new defpackage.hgn(gzhVar, obj5, obj2, interpolatorB3, interpolatorB4, fA2);
                } else {
                    hgnVar = new defpackage.hgn(gzhVar, obj5, obj2, interpolator, fA2, (java.lang.Float) null);
                }
                hgnVar.l = pointFC5;
                hgnVar.m = pointFC6;
                return hgnVar;
            }
            interpolatorB2 = b(pointF12, pointF13);
            interpolator = interpolatorB2;
            obj2 = objA4;
        }
        interpolatorB3 = null;
        interpolatorB4 = null;
        if (interpolatorB3 != null) {
            hgnVar = new defpackage.hgn(gzhVar, obj5, obj2, interpolatorB3, interpolatorB4, fA2);
        } else {
            hgnVar = new defpackage.hgn(gzhVar, obj5, obj2, interpolator, fA2, (java.lang.Float) null);
        }
        hgnVar.l = pointFC5;
        hgnVar.m = pointFC6;
        return hgnVar;
    }

    private static android.view.animation.Interpolator b(android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        float f = pointF.x;
        int i = defpackage.hgh.a;
        pointF.x = java.lang.Math.max(-1.0f, java.lang.Math.min(1.0f, f));
        pointF.y = java.lang.Math.max(-100.0f, java.lang.Math.min(100.0f, pointF.y));
        pointF2.x = java.lang.Math.max(-1.0f, java.lang.Math.min(1.0f, pointF2.x));
        pointF2.y = java.lang.Math.max(-100.0f, java.lang.Math.min(100.0f, pointF2.y));
        float f2 = pointF.x;
        float f3 = pointF.y;
        float f4 = pointF2.x;
        float f5 = pointF2.y;
        java.lang.ThreadLocal threadLocal = defpackage.hgm.a;
        try {
            return new android.view.animation.PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (java.lang.IllegalArgumentException e) {
            return "The Path cannot loop back on itself.".equals(e.getMessage()) ? new android.view.animation.PathInterpolator(java.lang.Math.min(pointF.x, 1.0f), pointF.y, java.lang.Math.max(pointF2.x, 0.0f), pointF2.y) : new android.view.animation.LinearInterpolator();
        }
    }
}
