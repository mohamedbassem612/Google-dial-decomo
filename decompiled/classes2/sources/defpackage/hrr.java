package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hrr {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final java.lang.Object e;

    private hrr(int i, java.lang.String str, int i2, int i3, int i4) {
        this.a = i;
        this.e = str;
        this.c = i2;
        this.b = i3;
        this.d = i4;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c5 A[Catch: RuntimeException -> 0x0206, TryCatch #0 {RuntimeException -> 0x0206, blocks: (B:3:0x0005, B:6:0x0018, B:8:0x0023, B:14:0x004b, B:17:0x0065, B:19:0x0096, B:20:0x00a3, B:22:0x00ad, B:23:0x00c3, B:25:0x00c9, B:26:0x00db, B:28:0x00e4, B:30:0x00ec, B:31:0x00fe, B:33:0x010b, B:34:0x011d, B:36:0x0123, B:37:0x0135, B:39:0x013b, B:40:0x014d, B:42:0x0155, B:44:0x015e, B:45:0x0161, B:46:0x0164, B:48:0x017a, B:49:0x017d, B:51:0x0187, B:52:0x018a, B:54:0x0190, B:60:0x01a1, B:61:0x01a4, B:64:0x01af, B:66:0x01b5, B:70:0x01bf, B:72:0x01c5, B:73:0x01d1, B:83:0x01f0, B:87:0x01fb, B:82:0x01ec, B:56:0x0196, B:58:0x019c), top: B:93:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01d1 A[Catch: RuntimeException -> 0x0206, TryCatch #0 {RuntimeException -> 0x0206, blocks: (B:3:0x0005, B:6:0x0018, B:8:0x0023, B:14:0x004b, B:17:0x0065, B:19:0x0096, B:20:0x00a3, B:22:0x00ad, B:23:0x00c3, B:25:0x00c9, B:26:0x00db, B:28:0x00e4, B:30:0x00ec, B:31:0x00fe, B:33:0x010b, B:34:0x011d, B:36:0x0123, B:37:0x0135, B:39:0x013b, B:40:0x014d, B:42:0x0155, B:44:0x015e, B:45:0x0161, B:46:0x0164, B:48:0x017a, B:49:0x017d, B:51:0x0187, B:52:0x018a, B:54:0x0190, B:60:0x01a1, B:61:0x01a4, B:64:0x01af, B:66:0x01b5, B:70:0x01bf, B:72:0x01c5, B:73:0x01d1, B:83:0x01f0, B:87:0x01fb, B:82:0x01ec, B:56:0x0196, B:58:0x019c), top: B:93:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f9  */
    public static defpackage.hrr a(byte[] bArr) throws defpackage.era {
        boolean z;
        int iD;
        int iD2;
        int i;
        defpackage.hrr hrrVar;
        try {
            defpackage.etv etvVar = new defpackage.etv(bArr);
            etvVar.m();
            int iD3 = etvVar.d(7);
            if (iD3 != 1) {
                defpackage.etr.f("Av1Config", a.bj(iD3, "Unsupported av1C version: "));
                return null;
            }
            int iD4 = etvVar.d(3);
            int iD5 = etvVar.d(5);
            boolean zP = etvVar.p();
            int i2 = etvVar.p() ? true != etvVar.p() ? 10 : 12 : 8;
            int i3 = 13;
            etvVar.n(13);
            java.lang.String str = "av01." + iD4 + '.' + eum.G("%02d", new java.lang.Object[]{java.lang.Integer.valueOf(iD5)}) + (true != zP ? "M" : "H") + '.' + eum.G("%02d", new java.lang.Object[]{java.lang.Integer.valueOf(i2)});
            if (etvVar.a() <= 0) {
                hrrVar = new defpackage.hrr(i2, str, -1, -1, -1);
            } else {
                etvVar.m();
                int iD6 = etvVar.d(4);
                if (iD6 != 1) {
                    defpackage.etr.e("Av1Config", a.bj(iD6, "Unsupported obu_type: "));
                    hrrVar = new defpackage.hrr(i2, str, -1, -1, -1);
                } else if (etvVar.p()) {
                    defpackage.etr.e("Av1Config", "Unsupported obu_extension_flag");
                    hrrVar = new defpackage.hrr(i2, str, -1, -1, -1);
                } else {
                    boolean zP2 = etvVar.p();
                    etvVar.m();
                    if (!zP2 || etvVar.d(8) <= 127) {
                        int iD7 = etvVar.d(3);
                        etvVar.m();
                        if (etvVar.p()) {
                            defpackage.etr.e("Av1Config", "Unsupported reduced_still_picture_header");
                            hrrVar = new defpackage.hrr(i2, str, -1, -1, -1);
                        } else if (etvVar.p()) {
                            defpackage.etr.e("Av1Config", "Unsupported timing_info_present_flag");
                            hrrVar = new defpackage.hrr(i2, str, -1, -1, -1);
                        } else if (etvVar.p()) {
                            defpackage.etr.e("Av1Config", "Unsupported initial_display_delay_present_flag");
                            hrrVar = new defpackage.hrr(i2, str, -1, -1, -1);
                        } else {
                            int iD8 = etvVar.d(5);
                            for (int i4 = 0; i4 <= iD8; i4++) {
                                etvVar.n(12);
                                if (etvVar.d(5) > 7) {
                                    etvVar.m();
                                }
                            }
                            int iD9 = etvVar.d(4);
                            int iD10 = etvVar.d(4);
                            etvVar.n(iD9 + 1);
                            etvVar.n(iD10 + 1);
                            if (etvVar.p()) {
                                etvVar.n(7);
                            }
                            etvVar.n(7);
                            boolean zP3 = etvVar.p();
                            if (zP3) {
                                etvVar.n(2);
                            }
                            if ((etvVar.p() || etvVar.d(1) > 0) && !etvVar.p()) {
                                etvVar.n(1);
                            }
                            if (zP3) {
                                etvVar.n(3);
                            }
                            etvVar.n(3);
                            boolean zP4 = etvVar.p();
                            if (iD7 != 2) {
                                if (iD7 == 1) {
                                    z = false;
                                }
                                if (etvVar.p()) {
                                    int iD11 = etvVar.d(8);
                                    iD = etvVar.d(8);
                                    int iD12 = etvVar.d(8);
                                    if (!z || iD11 != 1) {
                                        i3 = iD;
                                    } else if (iD == 13) {
                                        iD11 = 1;
                                        if (iD12 == 0) {
                                            iD2 = 1;
                                        }
                                        int iA = defpackage.epy.a(iD11);
                                        if (iD2 == 1) {
                                            i = 1;
                                        } else {
                                            i = 2;
                                        }
                                        hrrVar = new defpackage.hrr(i2, str, iA, i, defpackage.epy.b(i3));
                                    } else {
                                        i3 = iD;
                                        iD11 = 1;
                                    }
                                    iD2 = etvVar.d(1);
                                    int iA2 = defpackage.epy.a(iD11);
                                    if (iD2 == 1) {
                                        i = 1;
                                    } else {
                                        i = 2;
                                    }
                                    hrrVar = new defpackage.hrr(i2, str, iA2, i, defpackage.epy.b(i3));
                                } else {
                                    hrrVar = new defpackage.hrr(i2, str, -1, -1, -1);
                                }
                            } else if (zP4) {
                                etvVar.m();
                            }
                            if (etvVar.p()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (etvVar.p()) {
                                hrrVar = new defpackage.hrr(i2, str, -1, -1, -1);
                            } else {
                                int iD13 = etvVar.d(8);
                                iD = etvVar.d(8);
                                int iD14 = etvVar.d(8);
                                if (!z) {
                                    i3 = iD;
                                    iD2 = etvVar.d(1);
                                } else {
                                    i3 = iD;
                                    iD2 = etvVar.d(1);
                                }
                                int iA3 = defpackage.epy.a(iD13);
                                if (iD2 == 1) {
                                    i = 1;
                                } else {
                                    i = 2;
                                }
                                hrrVar = new defpackage.hrr(i2, str, iA3, i, defpackage.epy.b(i3));
                            }
                        }
                    } else {
                        defpackage.etr.e("Av1Config", "Excessive obu_size");
                        hrrVar = new defpackage.hrr(i2, str, -1, -1, -1);
                    }
                }
            }
            return hrrVar;
        } catch (java.lang.RuntimeException e) {
            throw new defpackage.era("Error parsing AV1 config", e, true, 1);
        }
    }

    public hrr(ld ldVar, int i, int i2, int i3, int i4) {
        this.e = ldVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
