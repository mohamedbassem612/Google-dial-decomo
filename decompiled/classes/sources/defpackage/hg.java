package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hg {
    final defpackage.apnt d;
    private final defpackage.dxz f = new defpackage.dya(30);
    public final java.util.ArrayList a = new java.util.ArrayList();
    public final java.util.ArrayList b = new java.util.ArrayList();
    public int c = 0;
    final defpackage.kaw e = new defpackage.kaw(this);

    public hg(defpackage.apnt apntVar) {
        this.d = apntVar;
    }

    private final int l(int i, int i2) {
        int i3;
        int i4;
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            hf hfVar = (hf) arrayList.get(size);
            int i5 = hfVar.a;
            if (i5 == 8) {
                int i6 = hfVar.b;
                int i7 = hfVar.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            hfVar.b = i6 + 1;
                            hfVar.d = i7 + 1;
                        } else if (i2 == 2) {
                            hfVar.b = i6 - 1;
                            hfVar.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        hfVar.d = i7 + 1;
                    } else if (i2 == 2) {
                        hfVar.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        hfVar.b = i6 + 1;
                    } else if (i2 == 2) {
                        hfVar.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = hfVar.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= hfVar.d;
                    } else if (i5 == 2) {
                        i += hfVar.d;
                    }
                } else if (i2 == 1) {
                    hfVar.b = i8 + 1;
                } else if (i2 == 2) {
                    hfVar.b = i8 - 1;
                }
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return i;
            }
            hf hfVar2 = (hf) arrayList.get(size2);
            if (hfVar2.a == 8) {
                int i9 = hfVar2.d;
                if (i9 == hfVar2.b || i9 < 0) {
                    arrayList.remove(size2);
                    g(hfVar2);
                }
            } else if (hfVar2.d <= 0) {
                arrayList.remove(size2);
                g(hfVar2);
            }
        }
    }

    private final void m(hf hfVar) {
        int i;
        int i2 = hfVar.a;
        if (i2 == 1 || i2 == 8) {
            throw new java.lang.IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(hfVar.b, i2);
        int i3 = hfVar.b;
        int i4 = hfVar.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                java.util.Objects.toString(hfVar);
                throw new java.lang.IllegalArgumentException("op should be remove or update.".concat(java.lang.String.valueOf(hfVar)));
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < hfVar.d; i6++) {
            int iL2 = l(hfVar.b + (i * i6), hfVar.a);
            int i7 = hfVar.a;
            if (i7 == 2 ? iL2 != iL : !(i7 == 4 && iL2 == iL + 1)) {
                hf hfVarB = b(i7, iL, i5, hfVar.c);
                e(hfVarB, i3);
                g(hfVarB);
                if (hfVar.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iL = iL2;
            } else {
                i5++;
            }
        }
        java.lang.Object obj = hfVar.c;
        g(hfVar);
        if (i5 > 0) {
            hf hfVarB2 = b(hfVar.a, iL, i5, obj);
            e(hfVarB2, i3);
            g(hfVarB2);
        }
    }

    private final void n(hf hfVar) {
        this.b.add(hfVar);
        int i = hfVar.a;
        if (i == 1) {
            this.d.A(hfVar.b, hfVar.d);
            return;
        }
        if (i == 2) {
            defpackage.apnt apntVar = this.d;
            int i2 = hfVar.b;
            int i3 = hfVar.d;
            android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) apntVar.a;
            recyclerView.N(i2, i3, false);
            recyclerView.N = true;
            return;
        }
        if (i == 4) {
            this.d.z(hfVar.b, hfVar.d, hfVar.c);
        } else if (i == 8) {
            this.d.B(hfVar.b, hfVar.d);
        } else {
            java.util.Objects.toString(hfVar);
            throw new java.lang.IllegalArgumentException("Unknown update op type for ".concat(java.lang.String.valueOf(hfVar)));
        }
    }

    private final boolean o(int i) {
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            hf hfVar = (hf) arrayList.get(i2);
            int i4 = hfVar.a;
            if (i4 != 8) {
                if (i4 == 1) {
                    int i5 = hfVar.b;
                    int i6 = hfVar.d + i5;
                    while (i5 < i6) {
                        if (a(i5, i3) == i) {
                            return true;
                        }
                        i5++;
                    }
                } else {
                    continue;
                }
                i2 = i3;
            } else {
                if (a(hfVar.d, i3) == i) {
                    return true;
                }
                i2 = i3;
            }
        }
        return false;
    }

    final int a(int i, int i2) {
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (i2 < size) {
            hf hfVar = (hf) arrayList.get(i2);
            int i3 = hfVar.a;
            if (i3 == 8) {
                int i4 = hfVar.b;
                if (i4 == i) {
                    i = hfVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (hfVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = hfVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = hfVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += hfVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final hf b(int i, int i2, int i3, java.lang.Object obj) {
        hf hfVar = (hf) this.f.a();
        if (hfVar == null) {
            return new hf(i, i2, i3, obj);
        }
        hfVar.a = i;
        hfVar.b = i2;
        hfVar.d = i3;
        hfVar.c = obj;
        return hfVar;
    }

    public final void c() {
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.d.y((hf) arrayList.get(i));
        }
        h(arrayList);
        this.c = 0;
    }

    public final void d() {
        c();
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hf hfVar = (hf) arrayList.get(i);
            int i2 = hfVar.a;
            if (i2 == 1) {
                defpackage.apnt apntVar = this.d;
                apntVar.y(hfVar);
                apntVar.A(hfVar.b, hfVar.d);
            } else if (i2 == 2) {
                defpackage.apnt apntVar2 = this.d;
                apntVar2.y(hfVar);
                apntVar2.C(hfVar.b, hfVar.d);
            } else if (i2 == 4) {
                defpackage.apnt apntVar3 = this.d;
                apntVar3.y(hfVar);
                apntVar3.z(hfVar.b, hfVar.d, hfVar.c);
            } else if (i2 == 8) {
                defpackage.apnt apntVar4 = this.d;
                apntVar4.y(hfVar);
                apntVar4.B(hfVar.b, hfVar.d);
            }
        }
        h(arrayList);
        this.c = 0;
    }

    final void e(hf hfVar, int i) {
        defpackage.apnt apntVar = this.d;
        apntVar.y(hfVar);
        int i2 = hfVar.a;
        if (i2 == 2) {
            apntVar.C(i, hfVar.d);
        } else {
            if (i2 != 4) {
                throw new java.lang.IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            apntVar.z(i, hfVar.d, hfVar.c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017e  */
    /* JADX WARN: Code duplicated, block: B:103:0x018c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0190  */
    /* JADX WARN: Code duplicated, block: B:177:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0124  */
    /* JADX WARN: Code duplicated, block: B:74:0x0126  */
    /* JADX WARN: Code duplicated, block: B:76:0x012c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0137  */
    /* JADX WARN: Code duplicated, block: B:83:0x0143  */
    /* JADX WARN: Code duplicated, block: B:86:0x014e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0154  */
    /* JADX WARN: Code duplicated, block: B:88:0x0156  */
    /* JADX WARN: Code duplicated, block: B:90:0x015c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0167  */
    /* JADX WARN: Code duplicated, block: B:97:0x0173  */
    public final void f() {
        java.util.ArrayList arrayList;
        int i;
        boolean z;
        byte b;
        hf hfVarB;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        hf hfVarB2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        while (true) {
            arrayList = this.a;
            i = -1;
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((hf) arrayList.get(size)).a != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                } else {
                    z4 = false;
                }
                size--;
            }
            hf hfVarB3 = null;
            if (size == -1) {
                break;
            }
            defpackage.kaw kawVar = this.e;
            int i13 = size + 1;
            hf hfVar = (hf) arrayList.get(size);
            hf hfVar2 = (hf) arrayList.get(i13);
            int i14 = hfVar2.a;
            if (i14 == 1) {
                int i15 = hfVar.d;
                int i16 = hfVar2.b;
                i = i15 >= i16 ? 0 : -1;
                int i17 = hfVar.b;
                if (i17 < i16) {
                    i++;
                } else {
                    hfVar.b = i17 + hfVar2.d;
                }
                int i18 = hfVar2.b;
                if (i18 <= i15) {
                    hfVar.d = i15 + hfVar2.d;
                }
                hfVar2.b = i18 + i;
                arrayList.set(size, hfVar2);
                arrayList.set(i13, hfVar);
            } else if (i14 == 2) {
                int i19 = hfVar.b;
                int i20 = hfVar.d;
                if (i19 < i20) {
                    if (hfVar2.b == i19 && hfVar2.d == i20 - i19) {
                        z3 = true;
                        z2 = false;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (hfVar2.b == i20 + 1 && hfVar2.d == i19 - i20) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                int i21 = hfVar2.b;
                if (i20 < i21) {
                    i21--;
                    hfVar2.b = i21;
                } else {
                    int i22 = hfVar2.d;
                    if (i20 < i21 + i22) {
                        hfVar2.d = i22 - 1;
                        hfVar.a = 2;
                        hfVar.d = 1;
                        if (hfVar2.d == 0) {
                            arrayList.remove(i13);
                            ((defpackage.hg) kawVar.a).g(hfVar2);
                        }
                    }
                }
                int i23 = hfVar.b;
                if (i23 <= i21) {
                    hfVar2.b = i21 + 1;
                } else {
                    int i24 = i21 + hfVar2.d;
                    if (i23 < i24) {
                        hfVarB2 = ((defpackage.hg) kawVar.a).b(2, i23 + 1, i24 - i23, null);
                        hfVar2.d = hfVar.b - hfVar2.b;
                    }
                    if (z3) {
                        arrayList.set(size, hfVar2);
                        arrayList.remove(i13);
                        ((defpackage.hg) kawVar.a).g(hfVar);
                    } else {
                        if (z2) {
                            if (hfVarB2 != null) {
                                i11 = hfVar.b;
                                if (i11 > hfVarB2.b) {
                                    hfVar.b = i11 - hfVarB2.d;
                                }
                                i12 = hfVar.d;
                                if (i12 > hfVarB2.b) {
                                    hfVar.d = i12 - hfVarB2.d;
                                }
                                hfVarB3 = hfVarB2;
                            }
                            i9 = hfVar.b;
                            if (i9 > hfVar2.b) {
                                hfVar.b = i9 - hfVar2.d;
                            }
                            i10 = hfVar.d;
                            if (i10 > hfVar2.b) {
                                hfVar.d = i10 - hfVar2.d;
                            }
                        } else {
                            if (hfVarB2 != null) {
                                i7 = hfVar.b;
                                if (i7 >= hfVarB2.b) {
                                    hfVar.b = i7 - hfVarB2.d;
                                }
                                i8 = hfVar.d;
                                if (i8 >= hfVarB2.b) {
                                    hfVar.d = i8 - hfVarB2.d;
                                }
                                hfVarB3 = hfVarB2;
                            }
                            i5 = hfVar.b;
                            if (i5 >= hfVar2.b) {
                                hfVar.b = i5 - hfVar2.d;
                            }
                            i6 = hfVar.d;
                            if (i6 >= hfVar2.b) {
                                hfVar.d = i6 - hfVar2.d;
                            }
                        }
                        arrayList.set(size, hfVar2);
                        if (hfVar.b != hfVar.d) {
                            arrayList.set(i13, hfVar);
                        } else {
                            arrayList.remove(i13);
                        }
                        if (hfVarB3 != null) {
                            arrayList.add(size, hfVarB3);
                        }
                    }
                }
                hfVarB2 = null;
                if (z3) {
                    arrayList.set(size, hfVar2);
                    arrayList.remove(i13);
                    ((defpackage.hg) kawVar.a).g(hfVar);
                } else {
                    if (z2) {
                        if (hfVarB2 != null) {
                            i11 = hfVar.b;
                            if (i11 > hfVarB2.b) {
                                hfVar.b = i11 - hfVarB2.d;
                            }
                            i12 = hfVar.d;
                            if (i12 > hfVarB2.b) {
                                hfVar.d = i12 - hfVarB2.d;
                            }
                            hfVarB3 = hfVarB2;
                        }
                        i9 = hfVar.b;
                        if (i9 > hfVar2.b) {
                            hfVar.b = i9 - hfVar2.d;
                        }
                        i10 = hfVar.d;
                        if (i10 > hfVar2.b) {
                            hfVar.d = i10 - hfVar2.d;
                        }
                    } else {
                        if (hfVarB2 != null) {
                            i7 = hfVar.b;
                            if (i7 >= hfVarB2.b) {
                                hfVar.b = i7 - hfVarB2.d;
                            }
                            i8 = hfVar.d;
                            if (i8 >= hfVarB2.b) {
                                hfVar.d = i8 - hfVarB2.d;
                            }
                            hfVarB3 = hfVarB2;
                        }
                        i5 = hfVar.b;
                        if (i5 >= hfVar2.b) {
                            hfVar.b = i5 - hfVar2.d;
                        }
                        i6 = hfVar.d;
                        if (i6 >= hfVar2.b) {
                            hfVar.d = i6 - hfVar2.d;
                        }
                    }
                    arrayList.set(size, hfVar2);
                    if (hfVar.b != hfVar.d) {
                        arrayList.set(i13, hfVar);
                    } else {
                        arrayList.remove(i13);
                    }
                    if (hfVarB3 != null) {
                        arrayList.add(size, hfVarB3);
                    }
                }
            } else if (i14 == 4) {
                int i25 = hfVar.d;
                int i26 = hfVar2.b;
                if (i25 < i26) {
                    hfVar2.b = i26 - 1;
                } else {
                    int i27 = hfVar2.d;
                    if (i25 < i26 + i27) {
                        hfVar2.d = i27 - 1;
                        hfVarB = ((defpackage.hg) kawVar.a).b(4, hfVar.b, 1, hfVar2.c);
                    }
                    i2 = hfVar.b;
                    i3 = hfVar2.b;
                    if (i2 <= i3) {
                        hfVar2.b = i3 + 1;
                    } else {
                        i4 = i3 + hfVar2.d;
                        if (i2 < i4) {
                            int i28 = i4 - i2;
                            hfVarB3 = ((defpackage.hg) kawVar.a).b(4, i2 + 1, i28, hfVar2.c);
                            hfVar2.d -= i28;
                        }
                    }
                    arrayList.set(i13, hfVar);
                    if (hfVar2.d > 0) {
                        arrayList.set(size, hfVar2);
                    } else {
                        arrayList.remove(size);
                        ((defpackage.hg) kawVar.a).g(hfVar2);
                    }
                    if (hfVarB != null) {
                        arrayList.add(size, hfVarB);
                    }
                    if (hfVarB3 != null) {
                        arrayList.add(size, hfVarB3);
                    }
                }
                hfVarB = null;
                i2 = hfVar.b;
                i3 = hfVar2.b;
                if (i2 <= i3) {
                    hfVar2.b = i3 + 1;
                } else {
                    i4 = i3 + hfVar2.d;
                    if (i2 < i4) {
                        int i29 = i4 - i2;
                        hfVarB3 = ((defpackage.hg) kawVar.a).b(4, i2 + 1, i29, hfVar2.c);
                        hfVar2.d -= i29;
                    }
                }
                arrayList.set(i13, hfVar);
                if (hfVar2.d > 0) {
                    arrayList.set(size, hfVar2);
                } else {
                    arrayList.remove(size);
                    ((defpackage.hg) kawVar.a).g(hfVar2);
                }
                if (hfVarB != null) {
                    arrayList.add(size, hfVarB);
                }
                if (hfVarB3 != null) {
                    arrayList.add(size, hfVarB3);
                }
            }
        }
        int size2 = arrayList.size();
        int i30 = 0;
        while (i30 < size2) {
            hf hfVarB4 = (hf) arrayList.get(i30);
            int i31 = hfVarB4.a;
            if (i31 == 1) {
                n(hfVarB4);
            } else if (i31 == 2) {
                int i32 = hfVarB4.b;
                int i33 = hfVarB4.d + i32;
                int i34 = i32;
                int i35 = 0;
                byte b2 = -1;
                while (i34 < i33) {
                    if (this.d.x(i34) != null || o(i34)) {
                        if (b2 == 0) {
                            m(b(2, i32, i35, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b2 == 1) {
                            n(b(2, i32, i35, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i34 -= i35;
                        i33 -= i35;
                        i35 = 1;
                    } else {
                        i35++;
                    }
                    i34++;
                    b2 = b;
                }
                if (i35 != hfVarB4.d) {
                    g(hfVarB4);
                    hfVarB4 = b(2, i32, i35, null);
                }
                if (b2 == 0) {
                    m(hfVarB4);
                } else {
                    n(hfVarB4);
                }
            } else if (i31 == 4) {
                int i36 = hfVarB4.b;
                int i37 = hfVarB4.d + i36;
                int i38 = i36;
                int i39 = 0;
                while (i36 < i37) {
                    if (this.d.x(i36) != null || o(i36)) {
                        if (i == 0) {
                            m(b(4, i38, i39, hfVarB4.c));
                            i38 = i36;
                            i39 = 0;
                        }
                        i = 1;
                    } else {
                        if (i == 1) {
                            n(b(4, i38, i39, hfVarB4.c));
                            i38 = i36;
                            i39 = 0;
                        }
                        i = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != hfVarB4.d) {
                    java.lang.Object obj = hfVarB4.c;
                    g(hfVarB4);
                    hfVarB4 = b(4, i38, i39, obj);
                }
                if (i == 0) {
                    m(hfVarB4);
                } else {
                    n(hfVarB4);
                }
            } else if (i31 == 8) {
                n(hfVarB4);
            }
            i30++;
            i = -1;
        }
        arrayList.clear();
    }

    public final void g(hf hfVar) {
        hfVar.c = null;
        this.f.b(hfVar);
    }

    final void h(java.util.List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            g((hf) list.get(i));
        }
        list.clear();
    }

    public final void i() {
        h(this.a);
        h(this.b);
        this.c = 0;
    }

    public final boolean j(int i) {
        return (this.c & i) != 0;
    }

    public final boolean k() {
        return this.a.size() > 0;
    }
}
