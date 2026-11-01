package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fuy implements defpackage.fus {
    final /* synthetic */ defpackage.fuz a;
    private final defpackage.etv b;
    private final android.util.SparseArray c;
    private final android.util.SparseIntArray d;
    private final int e;

    public fuy(defpackage.fuz fuzVar, int i) {
        j$.util.Objects.requireNonNull(fuzVar);
        this.a = fuzVar;
        this.b = new defpackage.etv(new byte[5]);
        this.c = new android.util.SparseArray();
        this.d = new android.util.SparseIntArray();
        this.e = i;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0236  */
    /* JADX WARN: Code duplicated, block: B:103:0x0249  */
    /* JADX WARN: Code duplicated, block: B:111:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:63:0x018f  */
    /* JADX WARN: Code duplicated, block: B:66:0x019d  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a7  */
    @Override // defpackage.fus
    public final void a(defpackage.etx etxVar) {
        defpackage.fva fvaVar;
        int i;
        defpackage.fvc fuoVar;
        defpackage.fvc fuoVar2;
        int i2;
        defpackage.etv etvVar;
        if (etxVar.n() == 2) {
            defpackage.fuz fuzVar = this.a;
            defpackage.euk eukVar = (defpackage.euk) fuzVar.a.get(0);
            if ((etxVar.n() & 128) != 0) {
                etxVar.R(1);
                int iS = etxVar.s();
                int i3 = 3;
                etxVar.R(3);
                defpackage.etv etvVar2 = this.b;
                etxVar.J(etvVar2, 2);
                etvVar2.n(3);
                int i4 = 13;
                fuzVar.h = etvVar2.d(13);
                etxVar.J(etvVar2, 2);
                int i5 = 4;
                etvVar2.n(4);
                int i6 = 12;
                etxVar.R(etvVar2.d(12));
                android.util.SparseArray sparseArray = this.c;
                sparseArray.clear();
                android.util.SparseIntArray sparseIntArray = this.d;
                sparseIntArray.clear();
                int iD = etxVar.d();
                while (iD > 0) {
                    int i7 = 5;
                    etxVar.J(etvVar2, 5);
                    int iD2 = etvVar2.d(8);
                    etvVar2.n(i3);
                    int iD3 = etvVar2.d(i4);
                    etvVar2.n(i5);
                    int iD4 = etvVar2.d(i6);
                    int i8 = etxVar.c;
                    int i9 = i8 + iD4;
                    int i10 = -1;
                    java.lang.String strTrim = null;
                    int iN = 0;
                    java.util.ArrayList arrayList = null;
                    while (etxVar.c < i9) {
                        int iN2 = etxVar.n();
                        int iN3 = etxVar.c + etxVar.n();
                        if (iN3 <= i9) {
                            if (iN2 == i7) {
                                long jW = etxVar.w();
                                if (jW == 1094921523) {
                                    i2 = iN3;
                                    etvVar = etvVar2;
                                    i10 = 129;
                                } else if (jW == 1161904947) {
                                    etvVar = etvVar2;
                                    i10 = 135;
                                    i2 = iN3;
                                } else if (jW == 1094921524) {
                                    i2 = iN3;
                                    etvVar = etvVar2;
                                    i10 = 172;
                                } else if (jW == 1212503619) {
                                    i2 = iN3;
                                    etvVar = etvVar2;
                                    i10 = 36;
                                } else {
                                    i2 = iN3;
                                    etvVar = etvVar2;
                                }
                            } else if (iN2 == 106) {
                                i2 = iN3;
                                etvVar = etvVar2;
                                i10 = 129;
                            } else if (iN2 == 122) {
                                etvVar = etvVar2;
                                i10 = 135;
                                i2 = iN3;
                            } else if (iN2 == 127) {
                                int iN4 = etxVar.n();
                                if (iN4 == 21) {
                                    i2 = iN3;
                                    etvVar = etvVar2;
                                    i10 = 172;
                                } else {
                                    if (iN4 == 14) {
                                        i10 = 136;
                                    } else if (iN4 == 33) {
                                        i2 = iN3;
                                        etvVar = etvVar2;
                                        i10 = 139;
                                    }
                                    i2 = iN3;
                                    etvVar = etvVar2;
                                }
                            } else if (iN2 == 123) {
                                i2 = iN3;
                                etvVar = etvVar2;
                                i10 = 138;
                            } else if (iN2 == 10) {
                                strTrim = etxVar.C(3).trim();
                                iN = etxVar.n();
                                i2 = iN3;
                                etvVar = etvVar2;
                            } else {
                                int i11 = 3;
                                if (iN2 == 89) {
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    while (etxVar.c < iN3) {
                                        java.lang.String strTrim2 = etxVar.C(i11).trim();
                                        etxVar.n();
                                        int i12 = iN3;
                                        byte[] bArr = new byte[4];
                                        etxVar.L(bArr, 0, 4);
                                        arrayList2.add(new ils(strTrim2, bArr, (byte[]) null));
                                        iN3 = i12;
                                        etvVar2 = etvVar2;
                                        i11 = 3;
                                    }
                                    i2 = iN3;
                                    etvVar = etvVar2;
                                    arrayList = arrayList2;
                                    i10 = 89;
                                } else {
                                    i2 = iN3;
                                    etvVar = etvVar2;
                                    if (iN2 == 111) {
                                        i10 = 257;
                                    }
                                }
                            }
                            etxVar.R(i2 - etxVar.c);
                            etvVar2 = etvVar;
                            i7 = 5;
                        } else {
                            defpackage.etv etvVar3 = etvVar2;
                            etxVar.Q(i9);
                            fvaVar = new defpackage.fva(i10, strTrim, iN, arrayList, java.util.Arrays.copyOfRange(etxVar.b, i8, i9));
                            if (iD2 != 6 || iD2 == 5) {
                                iD2 = fvaVar.a;
                            }
                            iD -= iD4 + 5;
                            if (fuzVar.c.get(iD3)) {
                                i = 4;
                            } else {
                                defpackage.vk vkVar = fuzVar.i;
                                if (iD2 != 2) {
                                    i = 4;
                                    if (iD2 != 3 || iD2 == 4) {
                                        fuoVar = new defpackage.fuo(new defpackage.fuj(fvaVar.b, fvaVar.a(), "video/mp2t"));
                                    } else {
                                        if (iD2 == 21) {
                                            fuoVar2 = new defpackage.fuo(new defpackage.fuh());
                                        } else if (iD2 == 27) {
                                            fuoVar = new defpackage.fuo(new defpackage.fue(vkVar.i(fvaVar)));
                                        } else if (iD2 == 36) {
                                            fuoVar = new defpackage.fuo(new defpackage.fug(vkVar.i(fvaVar)));
                                        } else if (iD2 == 45) {
                                            fuoVar2 = new defpackage.fuo(new defpackage.fuk());
                                        } else if (iD2 == 89) {
                                            fuoVar2 = new defpackage.fuo(new defpackage.ftw(fvaVar.d));
                                        } else if (iD2 == 172) {
                                            fuoVar = new defpackage.fuo(new defpackage.fts(fvaVar.b, fvaVar.a(), "video/mp2t"));
                                        } else if (iD2 == 257) {
                                            fuoVar2 = new defpackage.fut(new defpackage.fun("application/vnd.dvb.ait"));
                                        } else if (iD2 != 128) {
                                            if (iD2 == 129) {
                                                fuoVar = new defpackage.fuo(new defpackage.ftq(fvaVar.b, fvaVar.a(), "video/mp2t"));
                                            } else if (iD2 == 138) {
                                                fuoVar = new defpackage.fuo(new defpackage.ftv(fvaVar.b, fvaVar.a(), 4096));
                                            } else if (iD2 != 139) {
                                                switch (iD2) {
                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                                                        fuoVar = new defpackage.fuo(new defpackage.ftu(false, fvaVar.b, fvaVar.a(), "video/mp2t"));
                                                        break;
                                                    case 16:
                                                        fuoVar = new defpackage.fuo(new defpackage.fuc(vkVar.g(fvaVar)));
                                                        break;
                                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                                        fuoVar = new defpackage.fuo(new defpackage.fui(fvaVar.b, fvaVar.a()));
                                                        break;
                                                    default:
                                                        switch (iD2) {
                                                            case 134:
                                                                fuoVar2 = new defpackage.fut(new defpackage.fun("application/x-scte35"));
                                                                break;
                                                            case 135:
                                                                fuoVar = new defpackage.fuo(new defpackage.ftq(fvaVar.b, fvaVar.a(), "video/mp2t"));
                                                                break;
                                                            case 136:
                                                                fuoVar = new defpackage.fuo(new defpackage.ftv(fvaVar.b, fvaVar.a(), 4096));
                                                                break;
                                                            default:
                                                                fuoVar2 = null;
                                                                break;
                                                        }
                                                        break;
                                                }
                                            } else {
                                                fuoVar = new defpackage.fuo(new defpackage.ftv(fvaVar.b, fvaVar.a(), 5408));
                                            }
                                        }
                                        sparseIntArray.put(iD3, iD3);
                                        sparseArray.put(iD3, fuoVar2);
                                    }
                                    fuoVar2 = fuoVar;
                                    sparseIntArray.put(iD3, iD3);
                                    sparseArray.put(iD3, fuoVar2);
                                } else {
                                    i = 4;
                                }
                                fuoVar = new defpackage.fuo(new defpackage.ftz(vkVar.g(fvaVar), "video/mp2t"));
                                fuoVar2 = fuoVar;
                                sparseIntArray.put(iD3, iD3);
                                sparseArray.put(iD3, fuoVar2);
                            }
                            i5 = i;
                            etvVar2 = etvVar3;
                            i3 = 3;
                            i4 = 13;
                            i6 = 12;
                        }
                    }
                    defpackage.etv etvVar4 = etvVar2;
                    etxVar.Q(i9);
                    fvaVar = new defpackage.fva(i10, strTrim, iN, arrayList, java.util.Arrays.copyOfRange(etxVar.b, i8, i9));
                    if (iD2 != 6) {
                        iD2 = fvaVar.a;
                    } else {
                        iD2 = fvaVar.a;
                    }
                    iD -= iD4 + 5;
                    if (fuzVar.c.get(iD3)) {
                        i = 4;
                    } else {
                        defpackage.vk vkVar2 = fuzVar.i;
                        if (iD2 != 2) {
                            i = 4;
                            if (iD2 != 3) {
                                fuoVar = new defpackage.fuo(new defpackage.fuj(fvaVar.b, fvaVar.a(), "video/mp2t"));
                                fuoVar2 = fuoVar;
                            } else {
                                fuoVar = new defpackage.fuo(new defpackage.fuj(fvaVar.b, fvaVar.a(), "video/mp2t"));
                                fuoVar2 = fuoVar;
                            }
                            sparseIntArray.put(iD3, iD3);
                            sparseArray.put(iD3, fuoVar2);
                        } else {
                            i = 4;
                        }
                        fuoVar = new defpackage.fuo(new defpackage.ftz(vkVar2.g(fvaVar), "video/mp2t"));
                        fuoVar2 = fuoVar;
                        sparseIntArray.put(iD3, iD3);
                        sparseArray.put(iD3, fuoVar2);
                    }
                    i5 = i;
                    etvVar2 = etvVar4;
                    i3 = 3;
                    i4 = 13;
                    i6 = 12;
                }
                int size = sparseIntArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    int iKeyAt = sparseIntArray.keyAt(i13);
                    int iValueAt = sparseIntArray.valueAt(i13);
                    fuzVar.c.put(iKeyAt, true);
                    fuzVar.d.put(iValueAt, true);
                    defpackage.fvc fvcVar = (defpackage.fvc) sparseArray.valueAt(i13);
                    if (fvcVar != null) {
                        fvcVar.b(eukVar, fuzVar.e, new defpackage.fvb(iS, iKeyAt, 8192));
                        fuzVar.b.put(iValueAt, fvcVar);
                    }
                }
                fuzVar.b.remove(this.e);
                fuzVar.f = 0;
                fuzVar.e.s();
                fuzVar.g = true;
            }
        }
    }

    @Override // defpackage.fus
    public final void b(defpackage.euk eukVar, defpackage.fll fllVar, defpackage.fvb fvbVar) {
    }
}
