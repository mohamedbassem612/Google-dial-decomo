package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hfj {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.kvt b = defpackage.kvt.p("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    private static final defpackage.kvt c = defpackage.kvt.p("d", "a");
    private static final defpackage.kvt d = defpackage.kvt.p("ty", "nm");

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v40, types: [int[]] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v4 */
    public static defpackage.hei a(defpackage.hfz hfzVar, defpackage.gzh gzhVar) {
        java.lang.String str;
        java.lang.String str2;
        boolean z;
        java.lang.Float f;
        long j;
        boolean z2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        hfzVar.h();
        boolean z3 = true;
        boolean z4 = false;
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        java.lang.String strF = "UNSET";
        long jB = 0;
        long jB2 = -1;
        boolean z5 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int color = 0;
        boolean zO = false;
        int i4 = 1;
        ?? r32 = 1;
        float fA = 0.0f;
        float fA2 = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float fA3 = 0.0f;
        java.lang.String strF2 = null;
        java.lang.String strF3 = null;
        defpackage.hdk hdkVarA = null;
        float fA4 = 1.0f;
        defpackage.heq heqVar = null;
        defpackage.hwv hwvVar = null;
        defpackage.hdj hdjVar = null;
        defpackage.jkq jkqVar = null;
        defpackage.hdb hdbVarC = null;
        while (hfzVar.n()) {
            switch (hfzVar.q(b)) {
                case 0:
                    strF = hfzVar.f();
                    z3 = true;
                    break;
                case 1:
                    jB = hfzVar.b();
                    z3 = true;
                    break;
                case 2:
                    strF3 = hfzVar.f();
                    z3 = true;
                    break;
                case 3:
                    z = z4;
                    f = fValueOf;
                    j = jB2;
                    int iB = hfzVar.b();
                    i = iB < 6 ? new int[]{1, 2, 3, 4, 5, 6, 7}[iB] : 7;
                    z4 = z;
                    fValueOf = f;
                    jB2 = j;
                    z3 = true;
                    break;
                case 4:
                    jB2 = hfzVar.b();
                    z3 = true;
                    break;
                case 5:
                    float fB = hfzVar.b();
                    java.lang.ThreadLocal threadLocal = defpackage.hgm.a;
                    i2 = (int) (fB * android.content.res.Resources.getSystem().getDisplayMetrics().density);
                    z4 = z4;
                    z3 = true;
                    break;
                case 6:
                    float fB2 = hfzVar.b();
                    java.lang.ThreadLocal threadLocal2 = defpackage.hgm.a;
                    i3 = (int) (fB2 * android.content.res.Resources.getSystem().getDisplayMetrics().density);
                    z4 = z4;
                    z3 = true;
                    break;
                case 7:
                    color = android.graphics.Color.parseColor(hfzVar.f());
                    z3 = true;
                    break;
                case 8:
                    hdkVarA = defpackage.heu.a(hfzVar, gzhVar);
                    z3 = true;
                    break;
                case 9:
                    z = z4;
                    f = fValueOf;
                    j = jB2;
                    int iB2 = hfzVar.b();
                    defpackage.hgt.g();
                    if (iB2 >= 6) {
                        gzhVar.e(a.bj(iB2, "Unsupported matte type: "));
                        z4 = z;
                        fValueOf = f;
                        jB2 = j;
                        z3 = true;
                    } else {
                        i4 = defpackage.hgt.g()[iB2];
                        int i5 = i4 - 1;
                        if (i4 == 0) {
                            throw null;
                        }
                        if (i5 == 3) {
                            gzhVar.e("Unsupported matte type: Luma");
                        } else if (i5 == 4) {
                            gzhVar.e("Unsupported matte type: Luma Inverted");
                        }
                        gzhVar.f(1);
                        z3 = true;
                        z4 = z;
                        fValueOf = f;
                        jB2 = j;
                    }
                    break;
                case 10:
                    f = fValueOf;
                    j = jB2;
                    hfzVar.g();
                    while (hfzVar.n()) {
                        hfzVar.h();
                        defpackage.hdd hddVarE = null;
                        defpackage.hdh hdhVar = null;
                        boolean zO2 = false;
                        int i6 = 0;
                        while (hfzVar.n()) {
                            java.lang.String strE = hfzVar.e();
                            int iHashCode = strE.hashCode();
                            if (iHashCode != 111) {
                                if (iHashCode != 3588) {
                                    if (iHashCode != 104433) {
                                        if (iHashCode == 3357091 && strE.equals("mode")) {
                                            java.lang.String strF4 = hfzVar.f();
                                            int iHashCode2 = strF4.hashCode();
                                            if (iHashCode2 == 97) {
                                                if (!strF4.equals("a")) {
                                                }
                                                i6 = 1;
                                            } else if (iHashCode2 != 105) {
                                                if (iHashCode2 != 110) {
                                                    if (iHashCode2 == 115 && strF4.equals("s")) {
                                                        i6 = 2;
                                                    }
                                                } else if (strF4.equals("n")) {
                                                    i6 = 4;
                                                }
                                            } else if (strF4.equals("i")) {
                                                gzhVar.e("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                                i6 = 3;
                                            }
                                            defpackage.hge.a(a.bk(strE, "Unknown mask mode ", ". Defaulting to Add."));
                                            i6 = 1;
                                        } else {
                                            hfzVar.m();
                                        }
                                    } else if (strE.equals("inv")) {
                                        zO2 = hfzVar.o();
                                    } else {
                                        hfzVar.m();
                                    }
                                } else if (strE.equals("pt")) {
                                    java.lang.ThreadLocal threadLocal3 = defpackage.hgm.a;
                                    hdhVar = new defpackage.hdh(defpackage.hfi.a(hfzVar, gzhVar, android.content.res.Resources.getSystem().getDisplayMetrics().density, defpackage.hfq.a, false));
                                } else {
                                    hfzVar.m();
                                }
                            } else if (strE.equals("o")) {
                                hddVarE = defpackage.hgt.e(hfzVar, gzhVar);
                            } else {
                                hfzVar.m();
                            }
                        }
                        hfzVar.j();
                        arrayList.add(new defpackage.hds(i6, hdhVar, hddVarE, zO2));
                    }
                    z = false;
                    gzhVar.f(arrayList.size());
                    hfzVar.i();
                    z4 = z;
                    fValueOf = f;
                    jB2 = j;
                    z3 = true;
                    break;
                case 11:
                    f = fValueOf;
                    j = jB2;
                    hfzVar.g();
                    while (hfzVar.n()) {
                        defpackage.hdo hdoVarA = defpackage.hex.a(hfzVar, gzhVar);
                        if (hdoVarA != null) {
                            arrayList2.add(hdoVarA);
                        }
                    }
                    hfzVar.i();
                    z = false;
                    z4 = z;
                    fValueOf = f;
                    jB2 = j;
                    z3 = true;
                    break;
                case 12:
                    java.lang.Float f4 = fValueOf;
                    long j2 = jB2;
                    hfzVar.h();
                    while (hfzVar.n()) {
                        int iQ = hfzVar.q(c);
                        if (iQ == 0) {
                            java.lang.ThreadLocal threadLocal4 = defpackage.hgm.a;
                            hdjVar = new defpackage.hdj(defpackage.hfi.a(hfzVar, gzhVar, android.content.res.Resources.getSystem().getDisplayMetrics().density, defpackage.hey.a, false));
                        } else if (iQ != z3) {
                            hfzVar.l();
                            hfzVar.m();
                        } else {
                            hfzVar.g();
                            if (hfzVar.n()) {
                                defpackage.kvt kvtVar = defpackage.het.a;
                                hfzVar.h();
                                jkqVar = null;
                                while (hfzVar.n()) {
                                    if (hfzVar.q(defpackage.het.a) != 0) {
                                        hfzVar.l();
                                        hfzVar.m();
                                    } else {
                                        hfzVar.h();
                                        defpackage.hda hdaVarB = null;
                                        defpackage.hda hdaVarB2 = null;
                                        defpackage.hdb hdbVarC2 = null;
                                        defpackage.hdb hdbVarC3 = null;
                                        while (hfzVar.n()) {
                                            int iQ2 = hfzVar.q(defpackage.het.b);
                                            if (iQ2 == 0) {
                                                hdaVarB = defpackage.hgt.b(hfzVar, gzhVar);
                                            } else if (iQ2 != z3) {
                                                if (iQ2 == 2) {
                                                    z2 = true;
                                                    hdbVarC2 = defpackage.hgt.c(hfzVar, gzhVar, true);
                                                } else if (iQ2 != 3) {
                                                    hfzVar.l();
                                                    hfzVar.m();
                                                } else {
                                                    z2 = true;
                                                    hdbVarC3 = defpackage.hgt.c(hfzVar, gzhVar, true);
                                                }
                                                z3 = z2;
                                            } else {
                                                hdaVarB2 = defpackage.hgt.b(hfzVar, gzhVar);
                                            }
                                            z3 = true;
                                        }
                                        hfzVar.j();
                                        jkqVar = new defpackage.jkq(hdaVarB, hdaVarB2, hdbVarC2, hdbVarC3);
                                        z3 = true;
                                    }
                                }
                                hfzVar.j();
                                if (jkqVar == null) {
                                    jkqVar = new defpackage.jkq((defpackage.hda) null, (defpackage.hda) null, (defpackage.hdb) null, (defpackage.hdb) null);
                                }
                            }
                            while (hfzVar.n()) {
                                hfzVar.m();
                            }
                            hfzVar.i();
                        }
                        z3 = true;
                    }
                    hfzVar.j();
                    fValueOf = f4;
                    jB2 = j2;
                    z4 = false;
                    z3 = true;
                    break;
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                    hfzVar.g();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    while (hfzVar.n()) {
                        hfzVar.h();
                        while (hfzVar.n()) {
                            int iQ3 = hfzVar.q(d);
                            if (iQ3 == 0) {
                                int iB3 = hfzVar.b();
                                if (iB3 == 29) {
                                    defpackage.kvt kvtVar2 = defpackage.hev.a;
                                    heqVar = null;
                                    while (hfzVar.n()) {
                                        if (hfzVar.q(defpackage.hev.a) != 0) {
                                            hfzVar.l();
                                            hfzVar.m();
                                        } else {
                                            hfzVar.g();
                                            while (hfzVar.n()) {
                                                hfzVar.h();
                                                defpackage.heq heqVar2 = null;
                                                while (true) {
                                                    boolean z6 = false;
                                                    while (true) {
                                                        if (hfzVar.n()) {
                                                            int iQ4 = hfzVar.q(defpackage.hev.b);
                                                            if (iQ4 != 0) {
                                                                if (iQ4 != z3) {
                                                                    hfzVar.l();
                                                                    hfzVar.m();
                                                                } else if (z6) {
                                                                    heqVar2 = new defpackage.heq(defpackage.hgt.c(hfzVar, gzhVar, z3));
                                                                } else {
                                                                    hfzVar.m();
                                                                }
                                                            } else if (hfzVar.b() == 0) {
                                                                z6 = z3;
                                                            }
                                                        } else {
                                                            hfzVar.j();
                                                            if (heqVar2 != null) {
                                                                heqVar = heqVar2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            hfzVar.i();
                                        }
                                    }
                                } else if (iB3 == 25) {
                                    defpackage.kvt kvtVar3 = defpackage.hez.a;
                                    defpackage.hda hdaVarB3 = null;
                                    defpackage.hdb hdbVarC4 = null;
                                    defpackage.hdb hdbVarC5 = null;
                                    defpackage.hdb hdbVarC6 = null;
                                    defpackage.hdb hdbVarC7 = null;
                                    while (hfzVar.n()) {
                                        if (hfzVar.q(defpackage.hez.a) != 0) {
                                            hfzVar.l();
                                            hfzVar.m();
                                        } else {
                                            hfzVar.g();
                                            while (hfzVar.n()) {
                                                hfzVar.h();
                                                java.lang.String strF5 = "";
                                                while (hfzVar.n()) {
                                                    int iQ5 = hfzVar.q(defpackage.hez.b);
                                                    if (iQ5 == 0) {
                                                        strF5 = hfzVar.f();
                                                    } else if (iQ5 == z3) {
                                                        switch (strF5.hashCode()) {
                                                            case 353103893:
                                                                if (!strF5.equals("Distance")) {
                                                                    hfzVar.m();
                                                                } else {
                                                                    hdbVarC6 = defpackage.hgt.c(hfzVar, gzhVar, z3);
                                                                }
                                                                break;
                                                            case 397447147:
                                                                if (!strF5.equals("Opacity")) {
                                                                    hfzVar.m();
                                                                } else {
                                                                    hdbVarC4 = defpackage.hgt.c(hfzVar, gzhVar, false);
                                                                }
                                                                break;
                                                            case 1041377119:
                                                                if (!strF5.equals("Direction")) {
                                                                    hfzVar.m();
                                                                } else {
                                                                    hdbVarC5 = defpackage.hgt.c(hfzVar, gzhVar, false);
                                                                }
                                                                break;
                                                            case 1379387491:
                                                                if (!strF5.equals("Shadow Color")) {
                                                                    hfzVar.m();
                                                                } else {
                                                                    hdaVarB3 = defpackage.hgt.b(hfzVar, gzhVar);
                                                                }
                                                                break;
                                                            case 1383710113:
                                                                if (!strF5.equals("Softness")) {
                                                                    hfzVar.m();
                                                                } else {
                                                                    hdbVarC7 = defpackage.hgt.c(hfzVar, gzhVar, z3);
                                                                }
                                                                break;
                                                            default:
                                                                hfzVar.m();
                                                                break;
                                                        }
                                                    } else {
                                                        hfzVar.l();
                                                        hfzVar.m();
                                                    }
                                                }
                                                hfzVar.j();
                                            }
                                            hfzVar.i();
                                        }
                                    }
                                    hwvVar = (hdaVarB3 == null || hdbVarC4 == null || hdbVarC5 == null || hdbVarC6 == null || hdbVarC7 == null) ? null : new defpackage.hwv(hdaVarB3, hdbVarC4, hdbVarC5, hdbVarC6, hdbVarC7);
                                }
                            } else if (iQ3 != z3) {
                                hfzVar.l();
                                hfzVar.m();
                            } else {
                                arrayList3.add(hfzVar.f());
                            }
                        }
                        hfzVar.j();
                    }
                    hfzVar.i();
                    gzhVar.e("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(arrayList3.toString()));
                    fValueOf = fValueOf;
                    jB2 = jB2;
                    z4 = false;
                    break;
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                    fA4 = (float) hfzVar.a();
                    z4 = false;
                    break;
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                    fA3 = (float) hfzVar.a();
                    z4 = false;
                    break;
                case 16:
                    double dA = hfzVar.a();
                    java.lang.ThreadLocal threadLocal5 = defpackage.hgm.a;
                    f2 = (float) (dA * ((double) android.content.res.Resources.getSystem().getDisplayMetrics().density));
                    fValueOf = fValueOf;
                    jB2 = jB2;
                    z4 = false;
                    break;
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    double dA2 = hfzVar.a();
                    java.lang.ThreadLocal threadLocal6 = defpackage.hgm.a;
                    f3 = (float) (dA2 * ((double) android.content.res.Resources.getSystem().getDisplayMetrics().density));
                    fValueOf = fValueOf;
                    jB2 = jB2;
                    z4 = false;
                    break;
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    fA = (float) hfzVar.a();
                    z4 = false;
                    break;
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    fA2 = (float) hfzVar.a();
                    fValueOf = fValueOf;
                    z4 = false;
                    break;
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                    hdbVarC = defpackage.hgt.c(hfzVar, gzhVar, z4);
                    break;
                case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_LEFT /* 21 */:
                    strF2 = hfzVar.f();
                    break;
                case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_RIGHT /* 22 */:
                    zO = hfzVar.o();
                    break;
                case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_LEFT /* 23 */:
                    z5 = hfzVar.b() == z3 ? z3 : z4;
                    break;
                case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    int iB4 = hfzVar.b();
                    defpackage.hgt.o();
                    if (iB4 >= 18) {
                        gzhVar.e(a.bj(iB4, "Unsupported Blend Mode: "));
                        r32 = z3;
                    } else {
                        r32 = defpackage.hgt.o()[iB4];
                    }
                    break;
                default:
                    z = z4;
                    f = fValueOf;
                    j = jB2;
                    hfzVar.l();
                    hfzVar.m();
                    z4 = z;
                    fValueOf = f;
                    jB2 = j;
                    z3 = true;
                    break;
            }
        }
        java.lang.Float f5 = fValueOf;
        long j3 = jB2;
        hfzVar.j();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        if (fA > 0.0f) {
            str = strF;
            str2 = strF2;
            arrayList4.add(new defpackage.hgn(gzhVar, f5, f5, (android.view.animation.Interpolator) null, 0.0f, java.lang.Float.valueOf(fA)));
        } else {
            str = strF;
            str2 = strF2;
        }
        if (fA2 <= 0.0f) {
            fA2 = gzhVar.k;
        }
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(1.0f);
        arrayList4.add(new defpackage.hgn(gzhVar, fValueOf2, fValueOf2, (android.view.animation.Interpolator) null, fA, java.lang.Float.valueOf(fA2)));
        arrayList4.add(new defpackage.hgn(gzhVar, f5, f5, (android.view.animation.Interpolator) null, fA2, java.lang.Float.valueOf(Float.MAX_VALUE)));
        if (str.endsWith(".ai") || "ai".equals(str2)) {
            gzhVar.e("Convert your Illustrator layers to shape layers.");
        }
        if (z5) {
            defpackage.hdk hdkVar = hdkVarA == null ? new defpackage.hdk(null, null, null, null, null, null, null, null, null) : hdkVarA;
            hdkVar.j = true;
            hdkVarA = hdkVar;
        }
        return new defpackage.hei(arrayList2, gzhVar, str, jB, i, j3, strF3, arrayList, hdkVarA, i2, i3, color, fA4, fA3, f2, f3, hdjVar, jkqVar, arrayList4, i4, hdbVarC, zO, heqVar, hwvVar, r32 == true ? 1 : 0);
    }
}
