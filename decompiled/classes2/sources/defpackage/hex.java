package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hex {
    private static final defpackage.kvt a = defpackage.kvt.p("ty", "d");

    /* JADX WARN: Code duplicated, block: B:219:0x0393  */
    /* JADX WARN: Code duplicated, block: B:420:0x0751 A[PHI: r16
      0x0751: PHI (r16v6 hdo) = 
      (r16v0 hdo)
      (r16v8 hdo)
      (r16v9 hdo)
      (r16v10 hdo)
      (r16v11 hdo)
      (r16v15 hdo)
      (r16v16 hdo)
      (r16v26 hdo)
      (r16v28 hdo)
      (r16v29 hdo)
      (r16v30 hdo)
      (r16v31 hdo)
      (r16v32 hdo)
      (r16v33 hdo)
      (r16v17 hdo)
     binds: [B:397:0x06fc, B:371:0x0672, B:337:0x05ce, B:313:0x0577, B:294:0x052a, B:278:0x04d3, B:244:0x0439, B:185:0x030c, B:159:0x02a7, B:156:0x0299, B:135:0x0249, B:77:0x010b, B:59:0x00bf, B:42:0x007e, B:44:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    public static defpackage.hdo a(defpackage.hfz hfzVar, defpackage.gzh gzhVar) {
        java.lang.String strF;
        defpackage.hdo hdoVar;
        defpackage.hdo hdnVar;
        defpackage.hdo hdqVar;
        defpackage.hdo hdzVar;
        defpackage.hdo hebVar;
        hfzVar.h();
        int iB = 2;
        while (true) {
            if (!hfzVar.n()) {
                strF = null;
                break;
            }
            int iQ = hfzVar.q(a);
            if (iQ == 0) {
                strF = hfzVar.f();
                break;
            }
            if (iQ != 1) {
                hfzVar.l();
                hfzVar.m();
            } else {
                iB = hfzVar.b();
            }
        }
        if (strF == null) {
            return null;
        }
        int iHashCode = strF.hashCode();
        int i = 0;
        boolean zO = false;
        boolean zO2 = false;
        if (iHashCode != 3239) {
            int i2 = 100;
            if (iHashCode == 3270) {
                hdoVar = null;
                if (strF.equals("fl")) {
                    defpackage.kvt kvtVar = defpackage.hfr.a;
                    int iB2 = 1;
                    boolean zO3 = false;
                    boolean zO4 = false;
                    defpackage.hdd hddVar = null;
                    java.lang.String strF2 = null;
                    defpackage.hda hdaVar = null;
                    while (hfzVar.n()) {
                        int iQ2 = hfzVar.q(defpackage.hfr.a);
                        if (iQ2 == 0) {
                            strF2 = hfzVar.f();
                        } else if (iQ2 == 1) {
                            hdaVar = new defpackage.hda(defpackage.hfi.a(hfzVar, gzhVar, 1.0f, defpackage.hfa.b, false));
                        } else if (iQ2 == 2) {
                            hddVar = new defpackage.hdd(defpackage.hfi.a(hfzVar, gzhVar, 1.0f, defpackage.hfa.c, false));
                        } else if (iQ2 == 3) {
                            zO3 = hfzVar.o();
                        } else if (iQ2 == 4) {
                            iB2 = hfzVar.b();
                        } else if (iQ2 != 5) {
                            hfzVar.l();
                            hfzVar.m();
                        } else {
                            zO4 = hfzVar.o();
                        }
                    }
                    if (hddVar == null) {
                        hddVar = new defpackage.hdd(java.util.Collections.singletonList(new defpackage.hgn(100)));
                    }
                    hdzVar = new defpackage.hdz(strF2, zO3, iB2 == 1 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD, hdaVar, hddVar, zO4);
                    hdqVar = hdzVar;
                }
                defpackage.hge.a("Unknown shape type ".concat(strF));
                hdqVar = hdoVar;
            } else if (iHashCode == 3295) {
                hdoVar = null;
                if (strF.equals("gf")) {
                    defpackage.kvt kvtVar2 = defpackage.hfe.a;
                    android.graphics.Path.FillType fillType = android.graphics.Path.FillType.WINDING;
                    int i3 = 0;
                    boolean zO5 = false;
                    defpackage.hdd hddVar2 = null;
                    java.lang.String strF3 = null;
                    defpackage.hdc hdcVarD = null;
                    defpackage.hdf hdfVarF = null;
                    defpackage.hdf hdfVarF2 = null;
                    while (hfzVar.n()) {
                        switch (hfzVar.q(defpackage.hfe.a)) {
                            case 0:
                                strF3 = hfzVar.f();
                                break;
                            case 1:
                                hfzVar.h();
                                int iB3 = -1;
                                while (hfzVar.n()) {
                                    int iQ3 = hfzVar.q(defpackage.hfe.b);
                                    if (iQ3 == 0) {
                                        iB3 = hfzVar.b();
                                    } else if (iQ3 != 1) {
                                        hfzVar.l();
                                        hfzVar.m();
                                    } else {
                                        hdcVarD = defpackage.hgt.d(hfzVar, gzhVar, iB3);
                                    }
                                }
                                hfzVar.j();
                                break;
                            case 2:
                                hddVar2 = defpackage.hgt.e(hfzVar, gzhVar);
                                break;
                            case 3:
                                i3 = hfzVar.b() != 1 ? 2 : 1;
                                break;
                            case 4:
                                hdfVarF = defpackage.hgt.f(hfzVar, gzhVar);
                                break;
                            case 5:
                                hdfVarF2 = defpackage.hgt.f(hfzVar, gzhVar);
                                break;
                            case 6:
                                fillType = hfzVar.b() != 1 ? android.graphics.Path.FillType.EVEN_ODD : android.graphics.Path.FillType.WINDING;
                                break;
                            case 7:
                                zO5 = hfzVar.o();
                                break;
                            default:
                                hfzVar.l();
                                hfzVar.m();
                                break;
                        }
                    }
                    if (hddVar2 == null) {
                        hddVar2 = new defpackage.hdd(java.util.Collections.singletonList(new defpackage.hgn(100)));
                    }
                    hdqVar = new defpackage.hdq(strF3, i3, fillType, hdcVarD, hddVar2, hdfVarF, hdfVarF2, zO5);
                } else {
                    defpackage.hge.a("Unknown shape type ".concat(strF));
                    hdqVar = hdoVar;
                }
            } else if (iHashCode != 3488) {
                if (iHashCode == 3646) {
                    hdoVar = null;
                    defpackage.hdk hdkVarA = null;
                    if (strF.equals("rp")) {
                        defpackage.kvt kvtVar3 = defpackage.hfo.a;
                        boolean zO6 = false;
                        java.lang.String strF4 = null;
                        defpackage.hdb hdbVarC = null;
                        defpackage.hdb hdbVarC2 = null;
                        while (hfzVar.n()) {
                            int iQ4 = hfzVar.q(defpackage.hfo.a);
                            if (iQ4 == 0) {
                                strF4 = hfzVar.f();
                            } else if (iQ4 == 1) {
                                hdbVarC = defpackage.hgt.c(hfzVar, gzhVar, false);
                            } else if (iQ4 == 2) {
                                hdbVarC2 = defpackage.hgt.c(hfzVar, gzhVar, false);
                            } else if (iQ4 == 3) {
                                hdkVarA = defpackage.heu.a(hfzVar, gzhVar);
                            } else if (iQ4 != 4) {
                                hfzVar.m();
                            } else {
                                zO6 = hfzVar.o();
                            }
                        }
                        hdnVar = new defpackage.hdw(strF4, hdbVarC, hdbVarC2, hdkVarA, zO6);
                        hdqVar = hdnVar;
                    }
                } else if (iHashCode == 3669) {
                    hdoVar = null;
                    if (strF.equals("sh")) {
                        int i4 = defpackage.hft.b;
                        int iB4 = 0;
                        boolean zO7 = false;
                        defpackage.hdh hdhVar = null;
                        java.lang.String strF5 = null;
                        while (hfzVar.n()) {
                            int iQ5 = hfzVar.q(defpackage.hft.a);
                            if (iQ5 == 0) {
                                strF5 = hfzVar.f();
                            } else if (iQ5 == 1) {
                                iB4 = hfzVar.b();
                            } else if (iQ5 == 2) {
                                java.lang.ThreadLocal threadLocal = defpackage.hgm.a;
                                hdhVar = new defpackage.hdh(defpackage.hfi.a(hfzVar, gzhVar, android.content.res.Resources.getSystem().getDisplayMetrics().density, defpackage.hfq.a, false));
                            } else if (iQ5 != 3) {
                                hfzVar.m();
                            } else {
                                zO7 = hfzVar.o();
                            }
                        }
                        hebVar = new defpackage.heb(strF5, iB4, hdhVar, zO7);
                        hdqVar = hebVar;
                    }
                } else if (iHashCode != 3679) {
                    hdoVar = null;
                    hdoVar = null;
                    hdoVar = null;
                    hdoVar = null;
                    hdoVar = null;
                    hdoVar = null;
                    hdoVar = null;
                    hdoVar = null;
                    defpackage.hdb hdbVarC3 = null;
                    hdoVar = null;
                    if (iHashCode != 3681) {
                        if (iHashCode != 3705) {
                            if (iHashCode != 3710) {
                                if (iHashCode != 3307) {
                                    if (iHashCode != 3308) {
                                        if (iHashCode != 3633) {
                                            if (iHashCode == 3634 && strF.equals("rd")) {
                                                defpackage.kvt kvtVar4 = defpackage.hfp.a;
                                                defpackage.hdb hdbVarC4 = null;
                                                while (hfzVar.n()) {
                                                    int iQ6 = hfzVar.q(defpackage.hfp.a);
                                                    if (iQ6 == 0) {
                                                        hfzVar.f();
                                                    } else if (iQ6 == 1) {
                                                        hdbVarC4 = defpackage.hgt.c(hfzVar, gzhVar, true);
                                                    } else if (iQ6 != 2) {
                                                        hfzVar.m();
                                                    } else {
                                                        zO = hfzVar.o();
                                                    }
                                                }
                                                if (!zO) {
                                                    hdqVar = new defpackage.hdx(hdbVarC4);
                                                }
                                            }
                                            hdqVar = hdoVar;
                                        } else if (strF.equals("rc")) {
                                            defpackage.kvt kvtVar5 = defpackage.hfn.a;
                                            java.lang.String strF6 = null;
                                            defpackage.hdl hdlVarB = null;
                                            defpackage.hdf hdfVarF3 = null;
                                            defpackage.hdb hdbVarC5 = null;
                                            boolean zO8 = false;
                                            while (hfzVar.n()) {
                                                int iQ7 = hfzVar.q(defpackage.hfn.a);
                                                if (iQ7 == 0) {
                                                    strF6 = hfzVar.f();
                                                } else if (iQ7 == 1) {
                                                    hdlVarB = defpackage.hes.b(hfzVar, gzhVar);
                                                } else if (iQ7 == 2) {
                                                    hdfVarF3 = defpackage.hgt.f(hfzVar, gzhVar);
                                                } else if (iQ7 == 3) {
                                                    hdbVarC5 = defpackage.hgt.c(hfzVar, gzhVar, true);
                                                } else if (iQ7 != 4) {
                                                    hfzVar.m();
                                                } else {
                                                    zO8 = hfzVar.o();
                                                }
                                            }
                                            hdqVar = new defpackage.hdv(strF6, hdlVarB, hdfVarF3, hdbVarC5, zO8);
                                        }
                                    } else if (strF.equals("gs")) {
                                        defpackage.kvt kvtVar6 = defpackage.hff.a;
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        int i5 = 0;
                                        int i6 = 0;
                                        int i7 = 0;
                                        boolean zO9 = false;
                                        defpackage.hdd hddVar3 = null;
                                        java.lang.String strF7 = null;
                                        defpackage.hdc hdcVarD2 = null;
                                        defpackage.hdf hdfVarF4 = null;
                                        defpackage.hdf hdfVarF5 = null;
                                        defpackage.hdb hdbVarC6 = null;
                                        defpackage.hdb hdbVar = null;
                                        float fA = 0.0f;
                                        while (hfzVar.n()) {
                                            switch (hfzVar.q(defpackage.hff.a)) {
                                                case 0:
                                                    strF7 = hfzVar.f();
                                                    break;
                                                case 1:
                                                    hfzVar.h();
                                                    int iB5 = -1;
                                                    while (hfzVar.n()) {
                                                        int iQ8 = hfzVar.q(defpackage.hff.b);
                                                        if (iQ8 == 0) {
                                                            iB5 = hfzVar.b();
                                                        } else if (iQ8 != 1) {
                                                            hfzVar.l();
                                                            hfzVar.m();
                                                        } else {
                                                            hdcVarD2 = defpackage.hgt.d(hfzVar, gzhVar, iB5);
                                                        }
                                                    }
                                                    hfzVar.j();
                                                    break;
                                                case 2:
                                                    hddVar3 = defpackage.hgt.e(hfzVar, gzhVar);
                                                    break;
                                                case 3:
                                                    i5 = hfzVar.b() != 1 ? 2 : 1;
                                                    break;
                                                case 4:
                                                    hdfVarF4 = defpackage.hgt.f(hfzVar, gzhVar);
                                                    break;
                                                case 5:
                                                    hdfVarF5 = defpackage.hgt.f(hfzVar, gzhVar);
                                                    break;
                                                case 6:
                                                    hdbVarC6 = defpackage.hgt.c(hfzVar, gzhVar, true);
                                                    break;
                                                case 7:
                                                    i6 = a.M()[hfzVar.b() - 1];
                                                    break;
                                                case 8:
                                                    i7 = a.M()[hfzVar.b() - 1];
                                                    break;
                                                case 9:
                                                    fA = (float) hfzVar.a();
                                                    break;
                                                case 10:
                                                    zO9 = hfzVar.o();
                                                    break;
                                                case 11:
                                                    hfzVar.g();
                                                    while (hfzVar.n()) {
                                                        hfzVar.h();
                                                        java.lang.String strF8 = null;
                                                        defpackage.hdb hdbVarC7 = null;
                                                        while (hfzVar.n()) {
                                                            int iQ9 = hfzVar.q(defpackage.hff.c);
                                                            if (iQ9 == 0) {
                                                                strF8 = hfzVar.f();
                                                            } else if (iQ9 != 1) {
                                                                hfzVar.l();
                                                                hfzVar.m();
                                                            } else {
                                                                hdbVarC7 = defpackage.hgt.c(hfzVar, gzhVar, true);
                                                            }
                                                        }
                                                        hfzVar.j();
                                                        if (strF8.equals("o")) {
                                                            hdbVar = hdbVarC7;
                                                        } else if (strF8.equals("d") || strF8.equals("g")) {
                                                            arrayList.add(hdbVarC7);
                                                        }
                                                    }
                                                    hfzVar.i();
                                                    if (arrayList.size() == 1) {
                                                        arrayList.add((defpackage.hdb) arrayList.get(0));
                                                    }
                                                    break;
                                                default:
                                                    hfzVar.l();
                                                    hfzVar.m();
                                                    break;
                                            }
                                        }
                                        if (hddVar3 == null) {
                                            hddVar3 = new defpackage.hdd(java.util.Collections.singletonList(new defpackage.hgn(100)));
                                        }
                                        hdzVar = new defpackage.hdr(strF7, i5, hdcVarD2, hddVar3, hdfVarF4, hdfVarF5, hdbVarC6, i6, i7, fA, arrayList, hdbVar, zO9);
                                        hdqVar = hdzVar;
                                    }
                                } else if (strF.equals("gr")) {
                                    defpackage.kvt kvtVar7 = defpackage.hfs.a;
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    java.lang.String strF9 = null;
                                    while (hfzVar.n()) {
                                        int iQ10 = hfzVar.q(defpackage.hfs.a);
                                        if (iQ10 == 0) {
                                            strF9 = hfzVar.f();
                                        } else if (iQ10 == 1) {
                                            zO2 = hfzVar.o();
                                        } else if (iQ10 != 2) {
                                            hfzVar.m();
                                        } else {
                                            hfzVar.g();
                                            while (hfzVar.n()) {
                                                defpackage.hdo hdoVarA = a(hfzVar, gzhVar);
                                                if (hdoVarA != null) {
                                                    arrayList2.add(hdoVarA);
                                                }
                                            }
                                            hfzVar.i();
                                        }
                                    }
                                    hebVar = new defpackage.hea(strF9, arrayList2, zO2);
                                    hdqVar = hebVar;
                                }
                            } else if (strF.equals("tr")) {
                                hdqVar = defpackage.heu.a(hfzVar, gzhVar);
                            }
                        } else if (strF.equals("tm")) {
                            defpackage.kvt kvtVar8 = defpackage.hfv.a;
                            int i8 = 0;
                            boolean zO10 = false;
                            defpackage.hdb hdbVarC8 = null;
                            defpackage.hdb hdbVarC9 = null;
                            while (hfzVar.n()) {
                                int iQ11 = hfzVar.q(defpackage.hfv.a);
                                if (iQ11 == 0) {
                                    hdbVarC3 = defpackage.hgt.c(hfzVar, gzhVar, false);
                                } else if (iQ11 == 1) {
                                    hdbVarC8 = defpackage.hgt.c(hfzVar, gzhVar, false);
                                } else if (iQ11 == 2) {
                                    hdbVarC9 = defpackage.hgt.c(hfzVar, gzhVar, false);
                                } else if (iQ11 == 3) {
                                    hfzVar.f();
                                } else if (iQ11 == 4) {
                                    int iB6 = hfzVar.b();
                                    if (iB6 == 1) {
                                        i8 = 1;
                                    } else {
                                        if (iB6 != 2) {
                                            throw new java.lang.IllegalArgumentException(a.bj(iB6, "Unknown trim path type "));
                                        }
                                        i8 = 2;
                                    }
                                } else if (iQ11 != 5) {
                                    hfzVar.m();
                                } else {
                                    zO10 = hfzVar.o();
                                }
                            }
                            hdqVar = new defpackage.hed(i8, hdbVarC3, hdbVarC8, hdbVarC9, zO10);
                        }
                    } else if (strF.equals("st")) {
                        defpackage.kvt kvtVar9 = defpackage.hfu.a;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        int i9 = 0;
                        int i10 = 0;
                        boolean zO11 = false;
                        defpackage.hdd hddVar4 = null;
                        java.lang.String strF10 = null;
                        defpackage.hdb hdbVar2 = null;
                        defpackage.hda hdaVar2 = null;
                        defpackage.hdb hdbVarC10 = null;
                        float fA2 = 0.0f;
                        while (hfzVar.n()) {
                            switch (hfzVar.q(defpackage.hfu.a)) {
                                case 0:
                                    strF10 = hfzVar.f();
                                    break;
                                case 1:
                                    hdaVar2 = new defpackage.hda(defpackage.hfi.a(hfzVar, gzhVar, 1.0f, defpackage.hfa.b, false));
                                    break;
                                case 2:
                                    hdbVarC10 = defpackage.hgt.c(hfzVar, gzhVar, true);
                                    break;
                                case 3:
                                    hddVar4 = new defpackage.hdd(defpackage.hfi.a(hfzVar, gzhVar, 1.0f, defpackage.hfa.c, false));
                                    break;
                                case 4:
                                    i9 = a.M()[hfzVar.b() - 1];
                                    break;
                                case 5:
                                    i10 = a.M()[hfzVar.b() - 1];
                                    break;
                                case 6:
                                    fA2 = (float) hfzVar.a();
                                    break;
                                case 7:
                                    zO11 = hfzVar.o();
                                    break;
                                case 8:
                                    hfzVar.g();
                                    while (hfzVar.n()) {
                                        hfzVar.h();
                                        java.lang.String strF11 = null;
                                        defpackage.hdb hdbVarC11 = null;
                                        while (hfzVar.n()) {
                                            int iQ12 = hfzVar.q(defpackage.hfu.b);
                                            if (iQ12 == 0) {
                                                strF11 = hfzVar.f();
                                            } else if (iQ12 != 1) {
                                                hfzVar.l();
                                                hfzVar.m();
                                            } else {
                                                hdbVarC11 = defpackage.hgt.c(hfzVar, gzhVar, true);
                                            }
                                        }
                                        hfzVar.j();
                                        int iHashCode2 = strF11.hashCode();
                                        int i11 = i2;
                                        if (iHashCode2 != i2) {
                                            if (iHashCode2 != 103) {
                                                if (iHashCode2 == 111 && strF11.equals("o")) {
                                                    hdbVar2 = hdbVarC11;
                                                }
                                            } else if (strF11.equals("g")) {
                                                arrayList3.add(hdbVarC11);
                                            }
                                        } else if (strF11.equals("d")) {
                                            arrayList3.add(hdbVarC11);
                                        }
                                        i2 = i11;
                                    }
                                    int i12 = i2;
                                    hfzVar.i();
                                    if (arrayList3.size() == 1) {
                                        arrayList3.add((defpackage.hdb) arrayList3.get(0));
                                    }
                                    i2 = i12;
                                    break;
                                default:
                                    hfzVar.m();
                                    break;
                            }
                        }
                        int i13 = i2;
                        if (hddVar4 == null) {
                            hddVar4 = new defpackage.hdd(java.util.Collections.singletonList(new defpackage.hgn(java.lang.Integer.valueOf(i13))));
                        }
                        hdzVar = new defpackage.hec(strF10, hdbVar2, arrayList3, hdaVar2, hddVar4, hdbVarC10, i9 == 0 ? 1 : i9, i10 == 0 ? 1 : i10, fA2, zO11);
                        hdqVar = hdzVar;
                    }
                } else {
                    hdoVar = null;
                    if (strF.equals("sr")) {
                        boolean z = iB == 3;
                        defpackage.kvt kvtVar10 = defpackage.hfm.a;
                        boolean z2 = z;
                        int i14 = 0;
                        boolean zO12 = false;
                        java.lang.String strF12 = null;
                        defpackage.hdb hdbVarC12 = null;
                        defpackage.hdl hdlVarB2 = null;
                        defpackage.hdb hdbVarC13 = null;
                        defpackage.hdb hdbVarC14 = null;
                        defpackage.hdb hdbVarC15 = null;
                        defpackage.hdb hdbVarC16 = null;
                        defpackage.hdb hdbVarC17 = null;
                        while (hfzVar.n()) {
                            switch (hfzVar.q(defpackage.hfm.a)) {
                                case 0:
                                    strF12 = hfzVar.f();
                                    break;
                                case 1:
                                    int iB7 = hfzVar.b();
                                    int[] iArr = {1, 2};
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 >= 2) {
                                            i14 = 0;
                                        }
                                        int i16 = iArr[i15];
                                        if (i16 == 0) {
                                            throw null;
                                        }
                                        if (i16 == iB7) {
                                            i14 = i16;
                                        }
                                        i15++;
                                        break;
                                        break;
                                    }
                                    break;
                                case 2:
                                    hdbVarC12 = defpackage.hgt.c(hfzVar, gzhVar, false);
                                    break;
                                case 3:
                                    hdlVarB2 = defpackage.hes.b(hfzVar, gzhVar);
                                    break;
                                case 4:
                                    hdbVarC13 = defpackage.hgt.c(hfzVar, gzhVar, false);
                                    break;
                                case 5:
                                    hdbVarC15 = defpackage.hgt.c(hfzVar, gzhVar, true);
                                    break;
                                case 6:
                                    hdbVarC17 = defpackage.hgt.c(hfzVar, gzhVar, false);
                                    break;
                                case 7:
                                    hdbVarC14 = defpackage.hgt.c(hfzVar, gzhVar, true);
                                    break;
                                case 8:
                                    hdbVarC16 = defpackage.hgt.c(hfzVar, gzhVar, false);
                                    break;
                                case 9:
                                    zO12 = hfzVar.o();
                                    break;
                                case 10:
                                    z2 = hfzVar.b() == 3;
                                    break;
                                default:
                                    hfzVar.l();
                                    hfzVar.m();
                                    break;
                            }
                        }
                        hdqVar = new defpackage.hdu(strF12, i14, hdbVarC12, hdlVarB2, hdbVarC13, hdbVarC14, hdbVarC15, hdbVarC16, hdbVarC17, zO12, z2);
                    }
                }
                defpackage.hge.a("Unknown shape type ".concat(strF));
                hdqVar = hdoVar;
            } else {
                hdoVar = null;
                if (strF.equals("mm")) {
                    defpackage.kvt kvtVar11 = defpackage.hfl.a;
                    boolean zO13 = false;
                    while (hfzVar.n()) {
                        int iQ13 = hfzVar.q(defpackage.hfl.a);
                        if (iQ13 == 0) {
                            hfzVar.f();
                        } else if (iQ13 == 1) {
                            int iB8 = hfzVar.b();
                            if (iB8 != 1) {
                                if (iB8 == 2) {
                                    i = 2;
                                } else if (iB8 == 3) {
                                    i = 3;
                                } else if (iB8 == 4) {
                                    i = 4;
                                } else if (iB8 == 5) {
                                    i = 5;
                                }
                            }
                            i = 1;
                        } else if (iQ13 != 2) {
                            hfzVar.l();
                            hfzVar.m();
                        } else {
                            zO13 = hfzVar.o();
                        }
                    }
                    hdqVar = new defpackage.hdt(i, zO13);
                    gzhVar.e("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                } else {
                    defpackage.hge.a("Unknown shape type ".concat(strF));
                    hdqVar = hdoVar;
                }
            }
        } else {
            hdoVar = null;
            if (strF.equals("el")) {
                boolean z3 = iB == 3;
                defpackage.kvt kvtVar12 = defpackage.hew.a;
                boolean zO14 = false;
                java.lang.String strF13 = null;
                defpackage.hdl hdlVarB3 = null;
                defpackage.hdf hdfVarF6 = null;
                boolean z4 = z3;
                while (hfzVar.n()) {
                    int iQ14 = hfzVar.q(defpackage.hew.a);
                    if (iQ14 == 0) {
                        strF13 = hfzVar.f();
                    } else if (iQ14 == 1) {
                        hdlVarB3 = defpackage.hes.b(hfzVar, gzhVar);
                    } else if (iQ14 == 2) {
                        hdfVarF6 = defpackage.hgt.f(hfzVar, gzhVar);
                    } else if (iQ14 == 3) {
                        zO14 = hfzVar.o();
                    } else if (iQ14 != 4) {
                        hfzVar.l();
                        hfzVar.m();
                    } else {
                        z4 = hfzVar.b() == 3;
                    }
                }
                hdnVar = new defpackage.hdn(strF13, hdlVarB3, hdfVarF6, z4, zO14);
                hdqVar = hdnVar;
            }
            defpackage.hge.a("Unknown shape type ".concat(strF));
            hdqVar = hdoVar;
        }
        while (hfzVar.n()) {
            hfzVar.m();
        }
        hfzVar.j();
        return hdqVar;
    }
}
