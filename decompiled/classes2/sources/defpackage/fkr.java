package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fkr {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code duplicated, block: B:140:0x0207  */
    /* JADX WARN: Code duplicated, block: B:142:0x020d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0224  */
    /* JADX WARN: Code duplicated, block: B:150:0x0238 A[LOOP:2: B:149:0x0236->B:150:0x0238, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:152:0x0247  */
    /* JADX WARN: Code duplicated, block: B:155:0x0250  */
    /* JADX WARN: Code duplicated, block: B:157:0x025a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0261  */
    /* JADX WARN: Code duplicated, block: B:163:0x026f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0274  */
    /* JADX WARN: Code duplicated, block: B:171:0x028a  */
    /* JADX WARN: Code duplicated, block: B:173:0x0295  */
    /* JADX WARN: Code duplicated, block: B:174:0x0297  */
    /* JADX WARN: Code duplicated, block: B:175:0x029a  */
    /* JADX WARN: Code duplicated, block: B:176:0x029d  */
    /* JADX WARN: Code duplicated, block: B:177:0x029f  */
    /* JADX WARN: Code duplicated, block: B:178:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:179:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:180:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:181:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:182:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:183:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:184:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:187:0x02b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:192:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:195:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:197:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:198:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:199:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:201:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:203:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:206:0x02de  */
    /* JADX WARN: Code duplicated, block: B:207:0x02e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:210:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:212:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:214:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:215:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:216:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:217:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:218:0x02ff A[PHI: r7
      0x02ff: PHI (r7v6 int) = (r7v4 int), (r7v7 int) binds: [B:209:0x02e3, B:190:0x02b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:219:0x0301  */
    /* JADX WARN: Code duplicated, block: B:221:0x0304  */
    /* JADX WARN: Code duplicated, block: B:223:0x034b  */
    public static defpackage.eqg a(defpackage.etx etxVar, java.lang.String str, java.lang.String str2, androidx.media3.common.DrmInitData drmInitData) throws defpackage.era {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        int i9;
        boolean zP;
        int iD;
        int iD2;
        int iA;
        int iD3;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13;
        int iA2;
        int iD4;
        int i14;
        defpackage.etv etvVar = new defpackage.etv();
        etvVar.i(etxVar);
        int iA3 = etvVar.a();
        int iD5 = etvVar.d(3);
        if (iD5 > 1) {
            throw new defpackage.era(a.bj(iD5, "Unsupported AC-4 DSI version: "), null, false, 1);
        }
        int iD6 = etvVar.d(7);
        int i15 = true != etvVar.p() ? 44100 : 48000;
        etvVar.n(4);
        int iD7 = etvVar.d(9);
        if (iD6 > 1) {
            if (iD5 == 0) {
                throw new defpackage.era("Invalid AC-4 DSI version: 0", null, false, 1);
            }
            if (etvVar.p()) {
                etvVar.n(16);
                if (etvVar.p()) {
                    etvVar.n(128);
                }
            }
        }
        if (iD5 == 1) {
            if (!g(etvVar)) {
                throw new defpackage.era("Invalid AC-4 DSI bitrate.", null, false, 1);
            }
            etvVar.h();
        }
        defpackage.fkq fkqVar = new defpackage.fkq();
        int i16 = 0;
        while (true) {
            if (i16 < iD7) {
                if (iD5 == 0) {
                    zP = etvVar.p();
                    iD = etvVar.d(5);
                    iD2 = etvVar.d(5);
                    iA = 0;
                    iD3 = 0;
                    z2 = false;
                } else {
                    int iD8 = etvVar.d(8);
                    iD3 = etvVar.d(8);
                    if (iD3 == 255) {
                        iD3 = etvVar.d(16) + 255;
                    }
                    if (iD8 > 2) {
                        etvVar.n(iD3 << 3);
                        i16++;
                    } else {
                        iA = (iA3 - etvVar.a()) / 8;
                        int iD9 = etvVar.d(5);
                        z2 = iD9 == 31;
                        iD2 = iD8;
                        iD = iD9;
                        zP = false;
                    }
                }
                fkqVar.f = iD2;
                if (zP || z2 || iD != 6) {
                    fkqVar.g = etvVar.d(3);
                    if (etvVar.p()) {
                        etvVar.n(5);
                    }
                    etvVar.n(2);
                    if (iD5 == 1) {
                        if (iD2 != 1) {
                            if (iD2 == 2) {
                                iD2 = 2;
                                etvVar.n(2);
                            }
                            if (i11 <= 0) {
                                i2 = 8;
                                i = 5;
                            } else {
                                if (!etvVar.p() && !g(etvVar)) {
                                    throw new defpackage.era("Can't parse bitrate DSI.", null, false, 1);
                                }
                                if (etvVar.p()) {
                                    etvVar.h();
                                    etvVar.o(etvVar.d(16));
                                    i = 5;
                                    iD4 = etvVar.d(5);
                                    for (i14 = 0; i14 < iD4; i14++) {
                                        etvVar.n(3);
                                        etvVar.n(8);
                                    }
                                    i2 = 8;
                                } else {
                                    i2 = 8;
                                    i = 5;
                                }
                            }
                            etvVar.h();
                            if (iD5 == 1) {
                                iA2 = ((i10 - etvVar.a()) / i2) - iA;
                                if (iD3 < iA2) {
                                    throw new defpackage.era("pres_bytes is smaller than presentation bytes read.", null, false, 1);
                                }
                                etvVar.o(iD3 - iA2);
                            }
                            if (fkqVar.a) {
                                i4 = -1;
                                if (fkqVar.b == -1) {
                                    throw new defpackage.era(a.bj(i16, "Can't determine channel mode of presentation "), null, false, 1);
                                }
                            }
                            if (fkqVar.a) {
                                i8 = fkqVar.b;
                                z = fkqVar.d;
                                i9 = fkqVar.e;
                                switch (i8) {
                                    case 0:
                                        i2 = 1;
                                        break;
                                    case 1:
                                        i2 = 2;
                                        break;
                                    case 2:
                                        i2 = 3;
                                        break;
                                    case 3:
                                        i2 = i;
                                        break;
                                    case 4:
                                        i2 = 6;
                                        break;
                                    case 5:
                                    case 7:
                                    case 9:
                                        i2 = i3;
                                        break;
                                    case 6:
                                    case 8:
                                    case 10:
                                        break;
                                    case 11:
                                        i2 = 11;
                                        break;
                                    case 12:
                                        i2 = 12;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                                        i2 = 13;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                                        i2 = 14;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                                        i2 = 24;
                                        break;
                                    default:
                                        i2 = i4;
                                        break;
                                }
                                if (i8 != 11 || i8 == 12 || i8 == 13 || i8 == 14) {
                                    if (!z) {
                                        i2 -= 2;
                                    }
                                    i7 = i2;
                                    if (i9 != 0) {
                                        i7 -= 4;
                                    } else if (i9 == 1) {
                                        i7 -= 2;
                                    }
                                } else {
                                    i7 = i2;
                                }
                            } else {
                                i5 = fkqVar.c;
                                i6 = fkqVar.g;
                                if (i5 > 0) {
                                    i7 = i5 + 1;
                                    if (i6 == 4 && i7 == 17) {
                                        i7 = 21;
                                    }
                                } else if (i6 == 0) {
                                    i7 = 2;
                                } else if (i6 != 1) {
                                    i7 = 6;
                                } else if (i6 != 2) {
                                    i7 = i2;
                                } else if (i6 != 3) {
                                    i7 = 10;
                                } else if (i6 != 4) {
                                    defpackage.etr.f("Ac4Util", a.bs(i6, "AC-4 level ", " has not been defined."));
                                    i7 = 2;
                                } else {
                                    i7 = 12;
                                }
                            }
                            if (i7 > 0) {
                                throw new defpackage.era("Cannot determine channel count of presentation.", null, false, 1);
                            }
                            java.lang.String strG = eum.G("ac-4.%02d.%02d.%02d", new java.lang.Object[]{java.lang.Integer.valueOf(iD6), java.lang.Integer.valueOf(fkqVar.f), java.lang.Integer.valueOf(fkqVar.g)});
                            defpackage.eqf eqfVar = new defpackage.eqf();
                            eqfVar.a = str;
                            eqfVar.c("audio/ac4");
                            eqfVar.F = i7;
                            eqfVar.H = i15;
                            eqfVar.r = drmInitData;
                            eqfVar.d = str2;
                            eqfVar.j = strG;
                            return new defpackage.eqg(eqfVar);
                        }
                        etvVar.n(2);
                    }
                    etvVar.n(5);
                    etvVar.n(10);
                    if (iD5 == 1) {
                        if (iD2 > 0) {
                            fkqVar.a = etvVar.p();
                        }
                        if (fkqVar.a) {
                            if (iD2 != 1) {
                                i12 = 2;
                                if (iD2 == 2) {
                                    i11 = 2;
                                } else {
                                    i10 = iA3;
                                    i11 = iD2;
                                }
                                etvVar.n(24);
                                i13 = 1;
                            } else {
                                i11 = 1;
                            }
                            i10 = iA3;
                            int iD10 = etvVar.d(5);
                            if (iD10 >= 0 && iD10 <= 15) {
                                fkqVar.b = iD10;
                            }
                            if (iD10 < 11 || iD10 > 14) {
                                i12 = 2;
                            } else {
                                fkqVar.d = etvVar.p();
                                i12 = 2;
                                fkqVar.e = etvVar.d(2);
                            }
                            etvVar.n(24);
                            i13 = 1;
                        } else {
                            i10 = iA3;
                            i12 = 2;
                            i13 = 1;
                            i11 = iD2;
                        }
                        if (iD2 == i13 || iD2 == i12) {
                            if (etvVar.p() && etvVar.p()) {
                                etvVar.n(i12);
                            }
                            if (etvVar.p()) {
                                etvVar.m();
                                int i17 = 8;
                                int iD11 = etvVar.d(8);
                                int i18 = 0;
                                while (i18 < iD11) {
                                    etvVar.n(i17);
                                    i18++;
                                    i17 = 8;
                                }
                            }
                        }
                    } else {
                        i10 = iA3;
                        i11 = iD2;
                    }
                    if (!zP && !z2) {
                        etvVar.m();
                        if (iD == 0 || iD == 1 || iD == 2) {
                            int i19 = 0;
                            if (i11 == 0) {
                                while (i19 < 2) {
                                    d(etvVar, fkqVar);
                                    i19++;
                                }
                                i11 = 0;
                            } else {
                                for (int i20 = 2; i19 < i20; i20 = 2) {
                                    e(etvVar, fkqVar);
                                    i19++;
                                }
                            }
                        } else if (iD == 3 || iD == 4) {
                            int i21 = 0;
                            if (i11 == 0) {
                                while (i21 < 3) {
                                    d(etvVar, fkqVar);
                                    i21++;
                                }
                                i11 = 0;
                            } else {
                                for (int i22 = 3; i21 < i22; i22 = 3) {
                                    e(etvVar, fkqVar);
                                    i21++;
                                }
                            }
                        } else if (iD != 5) {
                            int iD12 = etvVar.d(7);
                            for (int i23 = 0; i23 < iD12; i23++) {
                                etvVar.n(8);
                            }
                        } else if (i11 == 0) {
                            d(etvVar, fkqVar);
                            i11 = 0;
                        } else {
                            int iD13 = etvVar.d(3);
                            for (int i24 = 0; i24 < iD13 + 2; i24++) {
                                e(etvVar, fkqVar);
                            }
                        }
                    } else if (i11 == 0) {
                        d(etvVar, fkqVar);
                        i11 = 0;
                    } else {
                        e(etvVar, fkqVar);
                    }
                    etvVar.m();
                    if (etvVar.p()) {
                        iD2 = i11;
                    } else {
                        i3 = 7;
                    }
                    if (i11 <= 0) {
                        i2 = 8;
                        i = 5;
                    } else {
                        if (!etvVar.p()) {
                        }
                        if (etvVar.p()) {
                            etvVar.h();
                            etvVar.o(etvVar.d(16));
                            i = 5;
                            iD4 = etvVar.d(5);
                            while (i14 < iD4) {
                                etvVar.n(3);
                                etvVar.n(8);
                            }
                            i2 = 8;
                        } else {
                            i2 = 8;
                            i = 5;
                        }
                    }
                    etvVar.h();
                    if (iD5 == 1) {
                        iA2 = ((i10 - etvVar.a()) / i2) - iA;
                        if (iD3 < iA2) {
                            throw new defpackage.era("pres_bytes is smaller than presentation bytes read.", null, false, 1);
                        }
                        etvVar.o(iD3 - iA2);
                    }
                    if (fkqVar.a) {
                        i4 = -1;
                        if (fkqVar.b == -1) {
                            throw new defpackage.era(a.bj(i16, "Can't determine channel mode of presentation "), null, false, 1);
                        }
                    }
                    if (fkqVar.a) {
                        i8 = fkqVar.b;
                        z = fkqVar.d;
                        i9 = fkqVar.e;
                        switch (i8) {
                            case 0:
                                i2 = 1;
                                break;
                            case 1:
                                i2 = 2;
                                break;
                            case 2:
                                i2 = 3;
                                break;
                            case 3:
                                i2 = i;
                                break;
                            case 4:
                                i2 = 6;
                                break;
                            case 5:
                            case 7:
                            case 9:
                                i2 = i3;
                                break;
                            case 6:
                            case 8:
                            case 10:
                                break;
                            case 11:
                                i2 = 11;
                                break;
                            case 12:
                                i2 = 12;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                                i2 = 13;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                                i2 = 14;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                                i2 = 24;
                                break;
                            default:
                                i2 = i4;
                                break;
                        }
                        if (i8 != 11) {
                        }
                        if (!z) {
                            i2 -= 2;
                        }
                        i7 = i2;
                        if (i9 != 0) {
                            i7 -= 4;
                        } else if (i9 == 1) {
                            i7 -= 2;
                        }
                    } else {
                        i5 = fkqVar.c;
                        i6 = fkqVar.g;
                        if (i5 > 0) {
                            i7 = i5 + 1;
                            if (i6 == 4) {
                                i7 = 21;
                            }
                        } else if (i6 == 0) {
                            i7 = 2;
                        } else if (i6 != 1) {
                            i7 = 6;
                        } else if (i6 != 2) {
                            i7 = i2;
                        } else if (i6 != 3) {
                            i7 = 10;
                        } else if (i6 != 4) {
                            defpackage.etr.f("Ac4Util", a.bs(i6, "AC-4 level ", " has not been defined."));
                            i7 = 2;
                        } else {
                            i7 = 12;
                        }
                    }
                    if (i7 > 0) {
                        throw new defpackage.era("Cannot determine channel count of presentation.", null, false, 1);
                    }
                    java.lang.String strG2 = eum.G("ac-4.%02d.%02d.%02d", new java.lang.Object[]{java.lang.Integer.valueOf(iD6), java.lang.Integer.valueOf(fkqVar.f), java.lang.Integer.valueOf(fkqVar.g)});
                    defpackage.eqf eqfVar2 = new defpackage.eqf();
                    eqfVar2.a = str;
                    eqfVar2.c("audio/ac4");
                    eqfVar2.F = i7;
                    eqfVar2.H = i15;
                    eqfVar2.r = drmInitData;
                    eqfVar2.d = str2;
                    eqfVar2.j = strG2;
                    return new defpackage.eqg(eqfVar2);
                }
                i10 = iA3;
                i3 = 7;
                int iD14 = etvVar.d(7);
                for (int i25 = 0; i25 < iD14; i25++) {
                    etvVar.n(15);
                }
                i11 = iD2;
                if (i11 <= 0) {
                    i2 = 8;
                    i = 5;
                } else {
                    if (!etvVar.p()) {
                    }
                    if (etvVar.p()) {
                        etvVar.h();
                        etvVar.o(etvVar.d(16));
                        i = 5;
                        iD4 = etvVar.d(5);
                        while (i14 < iD4) {
                            etvVar.n(3);
                            etvVar.n(8);
                        }
                        i2 = 8;
                    } else {
                        i2 = 8;
                        i = 5;
                    }
                }
                etvVar.h();
                if (iD5 == 1) {
                    iA2 = ((i10 - etvVar.a()) / i2) - iA;
                    if (iD3 < iA2) {
                        throw new defpackage.era("pres_bytes is smaller than presentation bytes read.", null, false, 1);
                    }
                    etvVar.o(iD3 - iA2);
                }
                if (fkqVar.a) {
                    i4 = -1;
                    if (fkqVar.b == -1) {
                        throw new defpackage.era(a.bj(i16, "Can't determine channel mode of presentation "), null, false, 1);
                    }
                }
                if (fkqVar.a) {
                    i8 = fkqVar.b;
                    z = fkqVar.d;
                    i9 = fkqVar.e;
                    switch (i8) {
                        case 0:
                            i2 = 1;
                            break;
                        case 1:
                            i2 = 2;
                            break;
                        case 2:
                            i2 = 3;
                            break;
                        case 3:
                            i2 = i;
                            break;
                        case 4:
                            i2 = 6;
                            break;
                        case 5:
                        case 7:
                        case 9:
                            i2 = i3;
                            break;
                        case 6:
                        case 8:
                        case 10:
                            break;
                        case 11:
                            i2 = 11;
                            break;
                        case 12:
                            i2 = 12;
                            break;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                            i2 = 13;
                            break;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                            i2 = 14;
                            break;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                            i2 = 24;
                            break;
                        default:
                            i2 = i4;
                            break;
                    }
                    if (i8 != 11) {
                    }
                    if (!z) {
                        i2 -= 2;
                    }
                    i7 = i2;
                    if (i9 != 0) {
                        i7 -= 4;
                    } else if (i9 == 1) {
                        i7 -= 2;
                    }
                } else {
                    i5 = fkqVar.c;
                    i6 = fkqVar.g;
                    if (i5 > 0) {
                        i7 = i5 + 1;
                        if (i6 == 4) {
                            i7 = 21;
                        }
                    } else if (i6 == 0) {
                        i7 = 2;
                    } else if (i6 != 1) {
                        i7 = 6;
                    } else if (i6 != 2) {
                        i7 = i2;
                    } else if (i6 != 3) {
                        i7 = 10;
                    } else if (i6 != 4) {
                        defpackage.etr.f("Ac4Util", a.bs(i6, "AC-4 level ", " has not been defined."));
                        i7 = 2;
                    } else {
                        i7 = 12;
                    }
                }
                if (i7 > 0) {
                    throw new defpackage.era("Cannot determine channel count of presentation.", null, false, 1);
                }
                java.lang.String strG3 = eum.G("ac-4.%02d.%02d.%02d", new java.lang.Object[]{java.lang.Integer.valueOf(iD6), java.lang.Integer.valueOf(fkqVar.f), java.lang.Integer.valueOf(fkqVar.g)});
                defpackage.eqf eqfVar3 = new defpackage.eqf();
                eqfVar3.a = str;
                eqfVar3.c("audio/ac4");
                eqfVar3.F = i7;
                eqfVar3.H = i15;
                eqfVar3.r = drmInitData;
                eqfVar3.d = str2;
                eqfVar3.j = strG3;
                return new defpackage.eqg(eqfVar3);
            }
            i = 5;
            i2 = 8;
            i3 = 7;
            i4 = -1;
            if (fkqVar.a) {
                i8 = fkqVar.b;
                z = fkqVar.d;
                i9 = fkqVar.e;
                switch (i8) {
                    case 0:
                        i2 = 1;
                        break;
                    case 1:
                        i2 = 2;
                        break;
                    case 2:
                        i2 = 3;
                        break;
                    case 3:
                        i2 = i;
                        break;
                    case 4:
                        i2 = 6;
                        break;
                    case 5:
                    case 7:
                    case 9:
                        i2 = i3;
                        break;
                    case 6:
                    case 8:
                    case 10:
                        break;
                    case 11:
                        i2 = 11;
                        break;
                    case 12:
                        i2 = 12;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        i2 = 13;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        i2 = 14;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                        i2 = 24;
                        break;
                    default:
                        i2 = i4;
                        break;
                }
                if (i8 != 11) {
                }
                if (!z) {
                    i2 -= 2;
                }
                i7 = i2;
                if (i9 != 0) {
                    i7 -= 4;
                } else if (i9 == 1) {
                    i7 -= 2;
                }
            } else {
                i5 = fkqVar.c;
                i6 = fkqVar.g;
                if (i5 > 0) {
                    i7 = i5 + 1;
                    if (i6 == 4) {
                        i7 = 21;
                    }
                } else if (i6 == 0) {
                    i7 = 2;
                } else if (i6 != 1) {
                    i7 = 6;
                } else if (i6 != 2) {
                    i7 = i2;
                } else if (i6 != 3) {
                    i7 = 10;
                } else if (i6 != 4) {
                    defpackage.etr.f("Ac4Util", a.bs(i6, "AC-4 level ", " has not been defined."));
                    i7 = 2;
                } else {
                    i7 = 12;
                }
            }
            if (i7 > 0) {
                throw new defpackage.era("Cannot determine channel count of presentation.", null, false, 1);
            }
            java.lang.String strG4 = eum.G("ac-4.%02d.%02d.%02d", new java.lang.Object[]{java.lang.Integer.valueOf(iD6), java.lang.Integer.valueOf(fkqVar.f), java.lang.Integer.valueOf(fkqVar.g)});
            defpackage.eqf eqfVar4 = new defpackage.eqf();
            eqfVar4.a = str;
            eqfVar4.c("audio/ac4");
            eqfVar4.F = i7;
            eqfVar4.H = i15;
            eqfVar4.r = drmInitData;
            eqfVar4.d = str2;
            eqfVar4.j = strG4;
            return new defpackage.eqg(eqfVar4);
        }
    }

    public static void b(int i, defpackage.etx etxVar) {
        etxVar.M(7);
        byte[] bArr = etxVar.b;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092 A[PHI: r6
      0x0092: PHI (r6v2 int) = (r6v1 int), (r6v1 int), (r6v4 int), (r6v4 int), (r6v4 int), (r6v4 int) binds: [B:28:0x0067, B:30:0x006b, B:45:0x008d, B:42:0x0088, B:36:0x007d, B:39:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    public static defpackage.ahoz c(defpackage.etv etvVar) {
        int i;
        int i2;
        int iD = etvVar.d(16);
        int iD2 = etvVar.d(16);
        if (iD2 == 65535) {
            iD2 = etvVar.d(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iD2 + i;
        if (iD == 44097) {
            i3 += 2;
        }
        if (etvVar.d(2) == 3) {
            do {
                etvVar.d(2);
            } while (etvVar.p());
        }
        int iD3 = etvVar.d(10);
        if (etvVar.p() && etvVar.d(3) > 0) {
            etvVar.n(2);
        }
        int i4 = true != etvVar.p() ? 44100 : 48000;
        int iD4 = etvVar.d(4);
        if (i4 == 44100 && iD4 == 13) {
            i2 = b[13];
        } else {
            int i5 = 0;
            if (i4 != 48000 || iD4 >= 14) {
                i2 = i5;
            } else {
                i5 = b[iD4];
                int i6 = iD3 % 5;
                if (i6 == 1) {
                    if (iD4 != 3 || iD4 == 8) {
                        i2 = i5 + 1;
                    } else {
                        i2 = i5;
                    }
                } else if (i6 != 2) {
                    if (i6 == 3) {
                        if (iD4 != 3) {
                        }
                        i2 = i5 + 1;
                    } else if (i6 == 4 && (iD4 == 3 || iD4 == 8 || iD4 == 11)) {
                        i2 = i5 + 1;
                    } else {
                        i2 = i5;
                    }
                } else if (iD4 == 8 || iD4 == 11) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            }
        }
        return new defpackage.ahoz(i4, i3, i2, (char[]) null);
    }

    private static void d(defpackage.etv etvVar, defpackage.fkq fkqVar) throws defpackage.era {
        int iD = etvVar.d(5);
        etvVar.n(2);
        if (etvVar.p()) {
            etvVar.n(5);
        }
        if (iD >= 7 && iD <= 10) {
            etvVar.m();
        }
        if (etvVar.p()) {
            int iD2 = etvVar.d(3);
            if (fkqVar.b == -1 && iD >= 0 && iD <= 15 && (iD2 == 0 || iD2 == 1)) {
                fkqVar.b = iD;
            }
            if (etvVar.p()) {
                f(etvVar);
            }
        }
    }

    private static void e(defpackage.etv etvVar, defpackage.fkq fkqVar) throws defpackage.era {
        etvVar.n(2);
        boolean zP = etvVar.p();
        int iD = etvVar.d(8);
        for (int i = 0; i < iD; i++) {
            etvVar.n(2);
            if (etvVar.p()) {
                etvVar.n(5);
            }
            if (zP) {
                etvVar.n(24);
            } else {
                if (etvVar.p()) {
                    if (!etvVar.p()) {
                        etvVar.n(4);
                    }
                    fkqVar.c = etvVar.d(6) + 1;
                }
                etvVar.n(4);
            }
        }
        if (etvVar.p()) {
            etvVar.n(3);
            if (etvVar.p()) {
                f(etvVar);
            }
        }
    }

    private static void f(defpackage.etv etvVar) throws defpackage.era {
        int iD = etvVar.d(6);
        if (iD < 2 || iD > 42) {
            throw new defpackage.era(java.lang.String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", java.lang.Integer.valueOf(iD)), null, false, 1);
        }
        etvVar.n(iD << 3);
    }

    private static boolean g(defpackage.etv etvVar) {
        if (etvVar.a() < 66) {
            return false;
        }
        etvVar.n(66);
        return true;
    }
}
