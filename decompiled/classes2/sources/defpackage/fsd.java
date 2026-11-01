package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fsd extends defpackage.fsg {
    private final defpackage.etx a = new defpackage.etx();
    private final defpackage.etv d = new defpackage.etv();
    private int e = -1;
    private final int f;
    private final defpackage.fsb[] g;
    private defpackage.fsb h;
    private java.util.List i;
    private java.util.List j;
    private defpackage.fsc k;
    private int l;

    public fsd(int i, java.util.List list) {
        this.f = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = defpackage.ete.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.g = new defpackage.fsb[8];
        int i2 = 0;
        while (true) {
            defpackage.fsb[] fsbVarArr = this.g;
            if (i2 >= 8) {
                this.h = fsbVarArr[0];
                return;
            } else {
                fsbVarArr[i2] = new defpackage.fsb();
                i2++;
            }
        }
    }

    private final java.util.List k() {
        android.text.Layout.Alignment alignment;
        float f;
        float f2;
        float f3;
        defpackage.fsa fsaVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < 8; i++) {
            defpackage.fsb[] fsbVarArr = this.g;
            if (!fsbVarArr[i].f()) {
                defpackage.fsb fsbVar = fsbVarArr[i];
                if (fsbVar.n) {
                    if (fsbVar.f()) {
                        fsaVar = null;
                    } else {
                        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                        int i2 = 0;
                        while (true) {
                            java.util.List list = fsbVar.k;
                            if (i2 >= list.size()) {
                                break;
                            }
                            spannableStringBuilder.append((java.lang.CharSequence) list.get(i2));
                            spannableStringBuilder.append('\n');
                            i2++;
                        }
                        spannableStringBuilder.append((java.lang.CharSequence) fsbVar.b());
                        int i3 = fsbVar.u;
                        if (i3 == 0) {
                            alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                        } else if (i3 == 1) {
                            alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i3 != 2) {
                            if (i3 != 3) {
                                throw new java.lang.IllegalArgumentException(a.bj(i3, "Unexpected justification value: "));
                            }
                            alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = android.text.Layout.Alignment.ALIGN_CENTER;
                        }
                        if (fsbVar.p) {
                            f = fsbVar.r;
                            f3 = 99.0f;
                            f2 = fsbVar.q / 99.0f;
                        } else {
                            f = fsbVar.r;
                            f2 = fsbVar.q / 74.0f;
                            f3 = 209.0f;
                        }
                        float f4 = f / f3;
                        int i4 = fsbVar.s;
                        int i5 = i4 / 3;
                        int i6 = i5 == 0 ? 0 : i5 == 1 ? 1 : 2;
                        int i7 = i4 % 3;
                        int i8 = i7 == 0 ? 0 : i7 == 1 ? 1 : 2;
                        int i9 = fsbVar.x;
                        fsaVar = new defpackage.fsa(spannableStringBuilder, alignment, (f2 * 0.9f) + 0.05f, i6, (0.9f * f4) + 0.05f, i8, i9 != defpackage.fsb.b, i9, fsbVar.o);
                    }
                    if (fsaVar != null) {
                        arrayList.add(fsaVar);
                    }
                } else {
                    continue;
                }
            }
        }
        j$.util.List.-EL.sort(arrayList, defpackage.fsa.a);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(((defpackage.fsa) arrayList.get(i10)).b);
        }
        return j$.util.DesugarCollections.unmodifiableList(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:218:0x0519  */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x011d. Please report as an issue. */
    private final void l() {
        int i;
        int i2;
        boolean z;
        int i3;
        defpackage.fsc fscVar = this.k;
        if (fscVar != null) {
            int i4 = fscVar.b;
            int i5 = fscVar.d;
            int i6 = (i4 << 1) - 1;
            if (i5 != i6) {
                defpackage.etr.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + i6 + ", but current index is " + i5 + " (sequence number " + fscVar.a + ");");
            }
            defpackage.etv etvVar = this.d;
            defpackage.fsc fscVar2 = this.k;
            etvVar.k(fscVar2.c, fscVar2.d);
            boolean z2 = false;
            while (etvVar.a() > 0) {
                int i7 = 3;
                int iD = etvVar.d(3);
                int iD2 = etvVar.d(5);
                int i8 = 2;
                if (iD == 7) {
                    etvVar.n(2);
                    iD = etvVar.d(6);
                    if (iD < 7) {
                        defpackage.etr.f("Cea708Decoder", a.bj(iD, "Invalid extended service number: "));
                    }
                }
                if (iD2 == 0) {
                    if (iD != 0) {
                        defpackage.etr.f("Cea708Decoder", a.bs(iD, "serviceNumber is non-zero (", ") when blockSize is 0"));
                    }
                    if (z2) {
                        this.i = k();
                    }
                    this.k = null;
                }
                if (iD != this.f) {
                    etvVar.o(iD2);
                } else {
                    int iC = etvVar.c() + (iD2 << 3);
                    while (etvVar.c() < iC) {
                        int iD3 = etvVar.d(8);
                        if (iD3 == 16) {
                            z = true;
                            int iD4 = etvVar.d(8);
                            if (iD4 <= 31) {
                                if (iD4 > 7) {
                                    if (iD4 <= 15) {
                                        etvVar.n(8);
                                    } else if (iD4 <= 23) {
                                        etvVar.n(16);
                                    } else {
                                        etvVar.n(24);
                                    }
                                }
                            } else if (iD4 <= 127) {
                                if (iD4 == 32) {
                                    this.h.c(' ');
                                } else if (iD4 == 33) {
                                    this.h.c((char) 160);
                                } else if (iD4 == 37) {
                                    this.h.c((char) 8230);
                                } else if (iD4 == 42) {
                                    this.h.c((char) 352);
                                } else if (iD4 == 44) {
                                    this.h.c((char) 338);
                                } else if (iD4 == 63) {
                                    this.h.c((char) 376);
                                } else if (iD4 == 57) {
                                    this.h.c((char) 8482);
                                } else if (iD4 == 58) {
                                    this.h.c((char) 353);
                                } else if (iD4 == 60) {
                                    this.h.c((char) 339);
                                } else if (iD4 != 61) {
                                    switch (iD4) {
                                        case 48:
                                            this.h.c((char) 9608);
                                            break;
                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                            this.h.c((char) 8216);
                                            break;
                                        case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                            this.h.c((char) 8217);
                                            break;
                                        case 51:
                                            this.h.c((char) 8220);
                                            break;
                                        case 52:
                                            this.h.c((char) 8221);
                                            break;
                                        case 53:
                                            this.h.c((char) 8226);
                                            break;
                                        default:
                                            switch (iD4) {
                                                case 118:
                                                    this.h.c((char) 8539);
                                                    break;
                                                case 119:
                                                    this.h.c((char) 8540);
                                                    break;
                                                case 120:
                                                    this.h.c((char) 8541);
                                                    break;
                                                case 121:
                                                    this.h.c((char) 8542);
                                                    break;
                                                case 122:
                                                    this.h.c((char) 9474);
                                                    break;
                                                case 123:
                                                    this.h.c((char) 9488);
                                                    break;
                                                case 124:
                                                    this.h.c((char) 9492);
                                                    break;
                                                case 125:
                                                    this.h.c((char) 9472);
                                                    break;
                                                case 126:
                                                    this.h.c((char) 9496);
                                                    break;
                                                case 127:
                                                    this.h.c((char) 9484);
                                                    break;
                                                default:
                                                    defpackage.etr.f("Cea708Decoder", a.bj(iD4, "Invalid G2 character: "));
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.h.c((char) 8480);
                                }
                                z2 = z;
                                i7 = 3;
                                i8 = 2;
                            } else {
                                if (iD4 > 159) {
                                    i2 = 2;
                                    i = 3;
                                    if (iD4 <= 255) {
                                        if (iD4 == 160) {
                                            this.h.c((char) 13252);
                                        } else {
                                            defpackage.etr.f("Cea708Decoder", a.bj(iD4, "Invalid G3 character: "));
                                            this.h.c('_');
                                        }
                                        z2 = true;
                                        i7 = 3;
                                        i8 = 2;
                                    } else {
                                        defpackage.etr.f("Cea708Decoder", a.bj(iD4, "Invalid extended command: "));
                                    }
                                } else if (iD4 <= 135) {
                                    etvVar.n(32);
                                } else if (iD4 <= 143) {
                                    etvVar.n(40);
                                } else {
                                    i2 = 2;
                                    etvVar.n(2);
                                    i = 3;
                                    etvVar.n(etvVar.d(6) << 3);
                                }
                                i8 = i2;
                                i7 = i;
                            }
                            i2 = 2;
                            i = 3;
                            i8 = i2;
                            i7 = i;
                        } else if (iD3 <= 31) {
                            if (iD3 != 0) {
                                if (iD3 == i7) {
                                    this.i = k();
                                } else if (iD3 != 8) {
                                    switch (iD3) {
                                        case 12:
                                            m();
                                            break;
                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                                            this.h.c('\n');
                                            break;
                                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                                            break;
                                        default:
                                            if (iD3 >= 17 && iD3 <= 23) {
                                                defpackage.etr.f("Cea708Decoder", a.bj(iD3, "Currently unsupported COMMAND_EXT1 Command: "));
                                                etvVar.n(8);
                                            } else if (iD3 >= 24) {
                                                defpackage.etr.f("Cea708Decoder", a.bj(iD3, "Currently unsupported COMMAND_P16 Command: "));
                                                etvVar.n(16);
                                            } else {
                                                defpackage.etr.f("Cea708Decoder", a.bj(iD3, "Invalid C0 command: "));
                                            }
                                            break;
                                    }
                                } else {
                                    android.text.SpannableStringBuilder spannableStringBuilder = this.h.l;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                            i = i7;
                            i2 = i8;
                            i8 = i2;
                            i7 = i;
                        } else {
                            if (iD3 <= 127) {
                                defpackage.fsb fsbVar = this.h;
                                if (iD3 == 127) {
                                    fsbVar.c((char) 9835);
                                } else {
                                    fsbVar.c((char) (iD3 & 255));
                                }
                            } else {
                                if (iD3 <= 159) {
                                    switch (iD3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z = true;
                                            int i9 = iD3 - 128;
                                            if (this.l != i9) {
                                                this.l = i9;
                                                this.h = this.g[i9];
                                            }
                                            break;
                                        case 136:
                                            z = true;
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (etvVar.p()) {
                                                    this.g[8 - i10].d();
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i11 = 1; i11 <= 8; i11++) {
                                                if (etvVar.p()) {
                                                    this.g[8 - i11].n = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (etvVar.p()) {
                                                    this.g[8 - i12].n = false;
                                                }
                                            }
                                            z2 = true;
                                            i7 = 3;
                                            i8 = 2;
                                            break;
                                        case 139:
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (etvVar.p()) {
                                                    defpackage.fsb fsbVar2 = this.g[8 - i13];
                                                    fsbVar2.n = !fsbVar2.n;
                                                }
                                            }
                                            z2 = true;
                                            i7 = 3;
                                            i8 = 2;
                                            break;
                                        case 140:
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (etvVar.p()) {
                                                    this.g[8 - i14].e();
                                                }
                                            }
                                            z2 = true;
                                            i7 = 3;
                                            i8 = 2;
                                            break;
                                        case 141:
                                            etvVar.n(8);
                                            z2 = true;
                                            i7 = 3;
                                            i8 = 2;
                                            break;
                                        case 142:
                                            break;
                                        case 143:
                                            m();
                                            z2 = true;
                                            i7 = 3;
                                            i8 = 2;
                                            break;
                                        case 144:
                                            i3 = i8;
                                            if (this.h.m) {
                                                etvVar.d(4);
                                                etvVar.d(i3);
                                                etvVar.d(i3);
                                                boolean zP = etvVar.p();
                                                boolean zP2 = etvVar.p();
                                                etvVar.d(3);
                                                etvVar.d(3);
                                                this.h.g(zP, zP2);
                                                z2 = true;
                                                i7 = 3;
                                                i8 = 2;
                                            } else {
                                                etvVar.n(16);
                                                i8 = i3;
                                                z2 = true;
                                                i7 = 3;
                                            }
                                            break;
                                        case 145:
                                            if (this.h.m) {
                                                i3 = 2;
                                                int iA = defpackage.fsb.a(etvVar.d(2), etvVar.d(2), etvVar.d(2), etvVar.d(2));
                                                int iA2 = defpackage.fsb.a(etvVar.d(2), etvVar.d(2), etvVar.d(2), etvVar.d(2));
                                                etvVar.n(2);
                                                defpackage.fsb.a(etvVar.d(2), etvVar.d(2), etvVar.d(2), 0);
                                                this.h.h(iA, iA2);
                                                i8 = i3;
                                                z2 = true;
                                                i7 = 3;
                                            } else {
                                                etvVar.n(24);
                                                z2 = true;
                                                i7 = 3;
                                                i8 = 2;
                                            }
                                            break;
                                        case 146:
                                            if (this.h.m) {
                                                etvVar.n(4);
                                                int iD5 = etvVar.d(4);
                                                etvVar.n(2);
                                                etvVar.d(6);
                                                defpackage.fsb fsbVar3 = this.h;
                                                if (fsbVar3.y != iD5) {
                                                    fsbVar3.c('\n');
                                                }
                                                fsbVar3.y = iD5;
                                            } else {
                                                etvVar.n(16);
                                            }
                                            z2 = true;
                                            i7 = 3;
                                            i8 = 2;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            z = true;
                                            defpackage.etr.f("Cea708Decoder", a.bj(iD3, "Invalid C1 command: "));
                                            break;
                                        case 151:
                                            if (this.h.m) {
                                                int iA3 = defpackage.fsb.a(etvVar.d(2), etvVar.d(2), etvVar.d(2), etvVar.d(2));
                                                etvVar.d(2);
                                                defpackage.fsb.a(etvVar.d(2), etvVar.d(2), etvVar.d(2), 0);
                                                etvVar.p();
                                                etvVar.p();
                                                etvVar.d(2);
                                                etvVar.d(2);
                                                int iD6 = etvVar.d(2);
                                                etvVar.n(8);
                                                this.h.i(iA3, iD6);
                                            } else {
                                                etvVar.n(32);
                                            }
                                            z2 = true;
                                            i7 = 3;
                                            i8 = 2;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i15 = iD3 - 152;
                                            defpackage.fsb[] fsbVarArr = this.g;
                                            defpackage.fsb fsbVar4 = fsbVarArr[i15];
                                            etvVar.n(i8);
                                            boolean zP3 = etvVar.p();
                                            etvVar.n(i8);
                                            int iD7 = etvVar.d(i7);
                                            boolean zP4 = etvVar.p();
                                            int iD8 = etvVar.d(7);
                                            int iD9 = etvVar.d(8);
                                            int iD10 = etvVar.d(4);
                                            int iD11 = etvVar.d(4);
                                            etvVar.n(i8);
                                            etvVar.n(6);
                                            etvVar.n(i8);
                                            int iD12 = etvVar.d(3);
                                            int iD13 = etvVar.d(3);
                                            fsbVar4.m = true;
                                            fsbVar4.n = zP3;
                                            fsbVar4.o = iD7;
                                            fsbVar4.p = zP4;
                                            fsbVar4.q = iD8;
                                            fsbVar4.r = iD9;
                                            fsbVar4.s = iD10;
                                            int i16 = iD11 + 1;
                                            if (fsbVar4.t != i16) {
                                                fsbVar4.t = i16;
                                                while (true) {
                                                    java.util.List list = fsbVar4.k;
                                                    if (list.size() >= fsbVar4.t || list.size() >= 15) {
                                                        list.remove(0);
                                                    }
                                                }
                                            }
                                            if (iD12 != 0 && fsbVar4.v != iD12) {
                                                fsbVar4.v = iD12;
                                                int i17 = iD12 - 1;
                                                int i18 = defpackage.fsb.g[i17];
                                                boolean z3 = defpackage.fsb.f[i17];
                                                int i19 = defpackage.fsb.d[i17];
                                                int i20 = defpackage.fsb.e[i17];
                                                fsbVar4.i(i18, defpackage.fsb.c[i17]);
                                            }
                                            if (iD13 != 0 && fsbVar4.w != iD13) {
                                                fsbVar4.w = iD13;
                                                int i21 = iD13 - 1;
                                                int i22 = defpackage.fsb.i[i21];
                                                int i23 = defpackage.fsb.h[i21];
                                                fsbVar4.g(false, false);
                                                fsbVar4.h(defpackage.fsb.a, defpackage.fsb.j[i21]);
                                            }
                                            if (this.l != i15) {
                                                this.l = i15;
                                                this.h = fsbVarArr[i15];
                                            }
                                            z2 = true;
                                            i7 = 3;
                                            i8 = 2;
                                            break;
                                    }
                                } else {
                                    z = true;
                                    if (iD3 <= 255) {
                                        this.h.c((char) (iD3 & 255));
                                    } else {
                                        defpackage.etr.f("Cea708Decoder", a.bj(iD3, "Invalid base command: "));
                                        i2 = 2;
                                        i = 3;
                                        i8 = i2;
                                        i7 = i;
                                    }
                                }
                                z2 = z;
                                i7 = 3;
                                i8 = 2;
                            }
                            z2 = true;
                        }
                    }
                }
            }
            if (z2) {
                this.i = k();
            }
            this.k = null;
        }
    }

    private final void m() {
        for (int i = 0; i < 8; i++) {
            this.g[i].e();
        }
    }

    @Override // defpackage.fsg, defpackage.ewr
    public final void c() {
        super.c();
        this.i = null;
        this.j = null;
        this.l = 0;
        this.h = this.g[0];
        m();
        this.k = null;
    }

    @Override // defpackage.fsg
    protected final defpackage.frj g() {
        java.util.List list = this.i;
        this.j = list;
        ahvr.ci(list);
        return new defpackage.fsh(list);
    }

    @Override // defpackage.fsg
    protected final void i(defpackage.fro froVar) {
        defpackage.fsc fscVar;
        java.nio.ByteBuffer byteBuffer = froVar.d;
        ahvr.ci(byteBuffer);
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        defpackage.etx etxVar = this.a;
        etxVar.O(bArrArray, iLimit);
        while (etxVar.d() >= 3) {
            int iN = etxVar.n();
            int i = iN & 3;
            byte bA = etxVar.a();
            byte bA2 = etxVar.a();
            if (i != 2) {
                if (i == 3) {
                    i = 3;
                }
            }
            if ((iN & 4) == 4) {
                if (i == 3) {
                    l();
                    int i2 = this.e;
                    int i3 = (bA & 192) >> 6;
                    if (i2 != -1 && i3 != ((i2 + 1) & 3)) {
                        m();
                        defpackage.etr.f("Cea708Decoder", "Sequence number discontinuity. previous=" + this.e + " current=" + i3);
                    }
                    this.e = i3;
                    int i4 = bA & 63;
                    if (i4 == 0) {
                        i4 = 64;
                    }
                    fscVar = new defpackage.fsc(i3, i4);
                    this.k = fscVar;
                    byte[] bArr = fscVar.c;
                    int i5 = fscVar.d;
                    fscVar.d = i5 + 1;
                    bArr[i5] = bA2;
                } else {
                    defpackage.fsc fscVar2 = this.k;
                    if (fscVar2 == null) {
                        defpackage.etr.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        int i6 = fscVar2.d;
                        int i7 = i6 + 1;
                        fscVar2.d = i7;
                        byte[] bArr2 = fscVar2.c;
                        bArr2[i6] = bA;
                        fscVar2.d = i6 + 2;
                        bArr2[i7] = bA2;
                        fscVar = fscVar2;
                    }
                }
                if (fscVar.d == (fscVar.b << 1) - 1) {
                    l();
                }
            }
        }
    }

    @Override // defpackage.fsg
    protected final boolean j() {
        return this.i != this.j;
    }

    @Override // defpackage.fsg, defpackage.ewr
    public final /* bridge */ /* synthetic */ void e() {
    }
}
