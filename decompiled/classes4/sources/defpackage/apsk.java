package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apsk extends defpackage.apry implements defpackage.aprx {
    public static final defpackage.apru b = new defpackage.apsa(10);
    private boolean c;
    private java.util.Date d;

    public apsk(defpackage.aptm aptmVar) {
        super(aptmVar);
        this.c = false;
    }

    public final java.util.Date b() {
        int i;
        int iB;
        int iB2;
        if (!this.c) {
            try {
                defpackage.apsr apsrVar = new defpackage.apsr(new java.io.StringReader(this.a.a()));
                int iA = apsrVar.e;
                if (iA == -1) {
                    iA = apsrVar.a();
                }
                switch (iA) {
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                    case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                        int iA2 = apsrVar.e;
                        if (iA2 == -1) {
                            iA2 = apsrVar.a();
                        }
                        switch (iA2) {
                            case 4:
                                apsrVar.c(4);
                                break;
                            case 5:
                                apsrVar.c(5);
                                break;
                            case 6:
                                apsrVar.c(6);
                                break;
                            case 7:
                                apsrVar.c(7);
                                break;
                            case 8:
                                apsrVar.c(8);
                                break;
                            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                                apsrVar.c(9);
                                break;
                            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                                apsrVar.c(10);
                                break;
                            default:
                                apsrVar.g[2] = apsrVar.f;
                                apsrVar.c(-1);
                                throw new defpackage.apsu();
                        }
                        java.lang.String str = apsrVar.c.d;
                        apsrVar.c(3);
                        break;
                    default:
                        apsrVar.g[1] = apsrVar.f;
                        break;
                }
                int iB3 = defpackage.apsr.b(apsrVar.c(46));
                int iA3 = apsrVar.e;
                if (iA3 == -1) {
                    iA3 = apsrVar.a();
                }
                switch (iA3) {
                    case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                        apsrVar.c(11);
                        i = 1;
                        break;
                    case 12:
                        apsrVar.c(12);
                        i = 2;
                        break;
                    case 13:
                        apsrVar.c(13);
                        i = 3;
                        break;
                    case 14:
                        apsrVar.c(14);
                        i = 4;
                        break;
                    case 15:
                        apsrVar.c(15);
                        i = 5;
                        break;
                    case 16:
                        apsrVar.c(16);
                        i = 6;
                        break;
                    case 17:
                        apsrVar.c(17);
                        i = 7;
                        break;
                    case 18:
                        apsrVar.c(18);
                        i = 8;
                        break;
                    case 19:
                        apsrVar.c(19);
                        i = 9;
                        break;
                    case 20:
                        apsrVar.c(20);
                        i = 10;
                        break;
                    case 21:
                        apsrVar.c(21);
                        i = 11;
                        break;
                    case 22:
                        apsrVar.c(22);
                        i = 12;
                        break;
                    default:
                        apsrVar.g[3] = apsrVar.f;
                        apsrVar.c(-1);
                        throw new defpackage.apsu();
                }
                java.lang.String strConcat = apsrVar.c(46).d;
                if (strConcat.length() == 2) {
                    strConcat = strConcat.charAt(0) > '6' ? "19".concat(java.lang.String.valueOf(strConcat)) : "20".concat(java.lang.String.valueOf(strConcat));
                }
                java.lang.String str2 = strConcat;
                int iB4 = defpackage.apsr.b(apsrVar.c(46));
                apsrVar.c(23);
                int iB5 = defpackage.apsr.b(apsrVar.c(46));
                int iA4 = apsrVar.e;
                if (iA4 == -1) {
                    iA4 = apsrVar.a();
                }
                if (iA4 != 23) {
                    apsrVar.g[4] = apsrVar.f;
                    iB = 0;
                } else {
                    apsrVar.c(23);
                    iB = defpackage.apsr.b(apsrVar.c(46));
                }
                int iA5 = apsrVar.e;
                if (iA5 == -1) {
                    iA5 = apsrVar.a();
                }
                switch (iA5) {
                    case 24:
                        iB2 = defpackage.apsr.b(apsrVar.c(46)) * (true != apsrVar.c(24).d.equals("-") ? 1 : -1);
                        break;
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                        int iA6 = apsrVar.e;
                        if (iA6 == -1) {
                            iA6 = apsrVar.a();
                        }
                        int i2 = -7;
                        switch (iA6) {
                            case 25:
                                apsrVar.c(25);
                                i2 = 0;
                                iB2 = i2 * 100;
                                break;
                            case 26:
                                apsrVar.c(26);
                                i2 = 0;
                                iB2 = i2 * 100;
                                break;
                            case 27:
                                apsrVar.c(27);
                                i2 = -5;
                                iB2 = i2 * 100;
                                break;
                            case 28:
                                apsrVar.c(28);
                                i2 = -4;
                                iB2 = i2 * 100;
                                break;
                            case 29:
                                apsrVar.c(29);
                                i2 = -6;
                                iB2 = i2 * 100;
                                break;
                            case 30:
                                apsrVar.c(30);
                                i2 = -5;
                                iB2 = i2 * 100;
                                break;
                            case 31:
                                apsrVar.c(31);
                                iB2 = i2 * 100;
                                break;
                            case 32:
                                apsrVar.c(32);
                                i2 = -6;
                                iB2 = i2 * 100;
                                break;
                            case 33:
                                apsrVar.c(33);
                                i2 = -8;
                                iB2 = i2 * 100;
                                break;
                            case 34:
                                apsrVar.c(34);
                                iB2 = i2 * 100;
                                break;
                            case 35:
                                apsrVar.c(35).d.charAt(0);
                                i2 = 0;
                                iB2 = i2 * 100;
                                break;
                            default:
                                apsrVar.g[6] = apsrVar.f;
                                apsrVar.c(-1);
                                throw new defpackage.apsu();
                        }
                        break;
                    default:
                        apsrVar.g[5] = apsrVar.f;
                        apsrVar.c(-1);
                        throw new defpackage.apsu();
                }
                defpackage.aprv aprvVar = new defpackage.aprv(str2, i, iB3, iB4, iB5, iB, iB2);
                apsrVar.c(0);
                this.d = aprvVar.a;
            } catch (defpackage.apsu unused) {
            } catch (defpackage.apsx e) {
                new defpackage.apsu(e.getMessage());
            }
            this.c = true;
        }
        return this.d;
    }
}
