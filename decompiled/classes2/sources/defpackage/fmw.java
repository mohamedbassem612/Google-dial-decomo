package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fmw implements defpackage.fmq {
    public final aify a;
    public final int b;

    private fmw(int i, aify aifyVar) {
        this.b = i;
        this.a = aifyVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static defpackage.fmw c(int i, defpackage.etx etxVar) {
        defpackage.fmq fmxVar;
        java.lang.String str;
        java.lang.String str2;
        aift aiftVar = new aift(4);
        int i2 = etxVar.d;
        int iB = -2;
        while (etxVar.d() > 8) {
            int iJ = etxVar.j();
            int iJ2 = etxVar.c + etxVar.j();
            etxVar.P(iJ2);
            if (iJ != 1414744396) {
                defpackage.fmu fmuVar = null;
                switch (iJ) {
                    case 1718776947:
                        if (iB != 2) {
                            if (iB == 1) {
                                int iL = etxVar.l();
                                if (iL == 1) {
                                    str = "audio/raw";
                                } else if (iL == 85) {
                                    str = "audio/mpeg";
                                } else if (iL == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iL != 8192) {
                                    str = iL != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iL2 = etxVar.l();
                                    int iJ3 = etxVar.j();
                                    etxVar.R(6);
                                    int iO = eum.o(etxVar.l());
                                    int iL3 = etxVar.d() > 0 ? etxVar.l() : 0;
                                    defpackage.eqf eqfVar = new defpackage.eqf();
                                    eqfVar.c(str);
                                    eqfVar.F = iL2;
                                    eqfVar.H = iJ3;
                                    if (str.equals("audio/raw") && iO != 0) {
                                        eqfVar.I = iO;
                                    }
                                    if (str.equals("audio/mp4a-latm") && iL3 > 0) {
                                        byte[] bArr = new byte[iL3];
                                        etxVar.L(bArr, 0, iL3);
                                        eqfVar.q = aify.p(bArr);
                                    }
                                    fmxVar = new defpackage.fmx(new defpackage.eqg(eqfVar));
                                } else {
                                    defpackage.etr.f("StreamFormatChunk", a.bj(iL, "Ignoring track with unsupported format tag "));
                                }
                            } else {
                                defpackage.etr.f("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(eum.K(iB)));
                            }
                            fmxVar = fmuVar;
                            break;
                        } else {
                            etxVar.R(4);
                            int iJ4 = etxVar.j();
                            int iJ5 = etxVar.j();
                            etxVar.R(4);
                            int iJ6 = etxVar.j();
                            switch (iJ6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                defpackage.eqf eqfVar2 = new defpackage.eqf();
                                eqfVar2.t = iJ4;
                                eqfVar2.u = iJ5;
                                eqfVar2.c(str2);
                                fmxVar = new defpackage.fmx(new defpackage.eqg(eqfVar2));
                            } else {
                                defpackage.etr.f("StreamFormatChunk", a.bj(iJ6, "Ignoring track with unsupported compression "));
                                fmxVar = fmuVar;
                            }
                        }
                        break;
                    case 1751742049:
                        int iJ7 = etxVar.j();
                        etxVar.R(8);
                        int iJ8 = etxVar.j();
                        int iJ9 = etxVar.j();
                        etxVar.R(4);
                        etxVar.j();
                        etxVar.R(12);
                        fmxVar = new defpackage.fmt(iJ7, iJ8, iJ9);
                        break;
                    case 1752331379:
                        int iJ10 = etxVar.j();
                        etxVar.R(12);
                        etxVar.j();
                        int iJ11 = etxVar.j();
                        int iJ12 = etxVar.j();
                        etxVar.R(4);
                        int iJ13 = etxVar.j();
                        int iJ14 = etxVar.j();
                        etxVar.R(4);
                        fmuVar = new defpackage.fmu(iJ10, iJ11, iJ12, iJ13, iJ14, etxVar.j());
                        fmxVar = fmuVar;
                        break;
                    case 1852994675:
                        fmxVar = new defpackage.fmy(etxVar.C(etxVar.d()));
                        break;
                    default:
                        fmxVar = fmuVar;
                        break;
                }
            } else {
                fmxVar = c(etxVar.j(), etxVar);
            }
            if (fmxVar != null) {
                if (fmxVar.a() == 1752331379) {
                    iB = ((defpackage.fmu) fmxVar).b();
                }
                aiftVar.i(fmxVar);
            }
            etxVar.Q(iJ2);
            etxVar.P(i2);
        }
        return new defpackage.fmw(i, aiftVar.h());
    }

    @Override // defpackage.fmq
    public final int a() {
        return this.b;
    }

    public final defpackage.fmq b(java.lang.Class cls) {
        defpackage.fmq fmqVar;
        int i = 0;
        do {
            aike aikeVar = this.a;
            if (i >= aikeVar.d) {
                return null;
            }
            fmqVar = (defpackage.fmq) aikeVar.get(i);
            i++;
        } while (fmqVar.getClass() != cls);
        return fmqVar;
    }
}
