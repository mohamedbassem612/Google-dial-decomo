package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aikj extends defpackage.aigf {
    public static final defpackage.aigf b = new defpackage.aikj(null, new java.lang.Object[0], 0);
    private static final long serialVersionUID = 0;
    final transient java.lang.Object[] c;
    public final transient int d;
    private final transient java.lang.Object e;

    private aikj(java.lang.Object obj, java.lang.Object[] objArr, int i) {
        this.e = obj;
        this.c = objArr;
        this.d = i;
    }

    public static defpackage.aikj a(int i, java.lang.Object[] objArr, defpackage.aigb aigbVar) {
        if (i == 0) {
            return (defpackage.aikj) b;
        }
        if (i == 1) {
            defpackage.ahvr.bB(j$.util.Objects.requireNonNull(objArr[0]), j$.util.Objects.requireNonNull(objArr[1]));
            return new defpackage.aikj(null, objArr, 1);
        }
        defpackage.ahvr.cm(i, objArr.length >> 1);
        java.lang.Object objU = u(objArr, i, defpackage.aihd.d(i), 0);
        if (objU instanceof java.lang.Object[]) {
            java.lang.Object[] objArr2 = (java.lang.Object[]) objU;
            defpackage.aogc aogcVar = (defpackage.aogc) objArr2[2];
            if (aigbVar == null) {
                throw aogcVar.n();
            }
            aigbVar.e = aogcVar;
            java.lang.Object obj = objArr2[0];
            int iIntValue = ((java.lang.Integer) objArr2[1]).intValue();
            objArr = java.util.Arrays.copyOf(objArr, iIntValue << 1);
            objU = obj;
            i = iIntValue;
        }
        return new defpackage.aikj(objU, objArr, i);
    }

    static java.lang.Object s(java.lang.Object[] objArr, int i, int i2, int i3) {
        java.lang.Object objU = u(objArr, i, i2, i3);
        if (objU instanceof java.lang.Object[]) {
            throw ((defpackage.aogc) ((java.lang.Object[]) objU)[2]).n();
        }
        return objU;
    }

    static java.lang.Object t(java.lang.Object obj, java.lang.Object[] objArr, int i, int i2, java.lang.Object obj2) {
        if (obj2 != null) {
            if (i != 1) {
                if (obj != null) {
                    if (!(obj instanceof byte[])) {
                        if (!(obj instanceof short[])) {
                            int[] iArr = (int[]) obj;
                            int length = iArr.length - 1;
                            int iBy = defpackage.ahvr.by(obj2.hashCode());
                            while (true) {
                                int i3 = iBy & length;
                                int i4 = iArr[i3];
                                if (i4 == -1) {
                                    break;
                                }
                                if (obj2.equals(objArr[i4])) {
                                    return objArr[i4 ^ 1];
                                }
                                iBy = i3 + 1;
                            }
                        } else {
                            short[] sArr = (short[]) obj;
                            int length2 = sArr.length - 1;
                            int iBy2 = defpackage.ahvr.by(obj2.hashCode());
                            while (true) {
                                int i5 = iBy2 & length2;
                                char c = (char) sArr[i5];
                                if (c == 65535) {
                                    break;
                                }
                                if (obj2.equals(objArr[c])) {
                                    return objArr[c ^ 1];
                                }
                                iBy2 = i5 + 1;
                            }
                        }
                    } else {
                        byte[] bArr = (byte[]) obj;
                        int length3 = bArr.length - 1;
                        int iBy3 = defpackage.ahvr.by(obj2.hashCode());
                        while (true) {
                            int i6 = iBy3 & length3;
                            int i7 = bArr[i6] & 255;
                            if (i7 == 255) {
                                break;
                            }
                            if (obj2.equals(objArr[i7])) {
                                return objArr[i7 ^ 1];
                            }
                            iBy3 = i6 + 1;
                        }
                    }
                }
            } else if (j$.util.Objects.requireNonNull(objArr[i2]).equals(obj2)) {
                return j$.util.Objects.requireNonNull(objArr[i2 ^ 1]);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.Object[]] */
    private static java.lang.Object u(java.lang.Object[] objArr, int i, int i2, int i3) {
        byte[] bArr;
        int i4;
        java.lang.Object[] objArr2;
        defpackage.aogc aogcVar = null;
        int i5 = 1;
        if (i == 1) {
            defpackage.ahvr.bB(j$.util.Objects.requireNonNull(objArr[i3]), j$.util.Objects.requireNonNull(objArr[i3 ^ 1]));
            return null;
        }
        int i6 = i2 - 1;
        if (i2 <= 128) {
            bArr = new byte[i2];
            java.util.Arrays.fill(bArr, (byte) -1);
            int i7 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = (i8 << 1) + i3;
                int i10 = (i7 << 1) + i3;
                java.lang.Object objRequireNonNull = j$.util.Objects.requireNonNull(objArr[i9]);
                java.lang.Object objRequireNonNull2 = j$.util.Objects.requireNonNull(objArr[i9 ^ 1]);
                defpackage.ahvr.bB(objRequireNonNull, objRequireNonNull2);
                int iBy = defpackage.ahvr.by(objRequireNonNull.hashCode());
                while (true) {
                    int i11 = iBy & i6;
                    int i12 = bArr[i11] & 255;
                    if (i12 == 255) {
                        bArr[i11] = (byte) i10;
                        if (i7 < i8) {
                            objArr[i10] = objRequireNonNull;
                            objArr[i10 ^ 1] = objRequireNonNull2;
                        }
                        i7++;
                        break;
                    }
                    if (objRequireNonNull.equals(objArr[i12])) {
                        int i13 = i12 ^ 1;
                        aogcVar = new defpackage.aogc(objRequireNonNull, objRequireNonNull2, j$.util.Objects.requireNonNull(objArr[i13]));
                        objArr[i13] = objRequireNonNull2;
                        break;
                    }
                    iBy = i11 + 1;
                }
            }
            if (i7 != i) {
                objArr2 = new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i7), aogcVar};
                return objArr2;
            }
            return bArr;
        }
        if (i2 <= 32768) {
            bArr = new short[i2];
            java.util.Arrays.fill(bArr, (short) -1);
            int i14 = 0;
            for (int i15 = 0; i15 < i; i15++) {
                int i16 = (i15 << 1) + i3;
                int i17 = (i14 << 1) + i3;
                java.lang.Object objRequireNonNull3 = j$.util.Objects.requireNonNull(objArr[i16]);
                java.lang.Object objRequireNonNull4 = j$.util.Objects.requireNonNull(objArr[i16 ^ 1]);
                defpackage.ahvr.bB(objRequireNonNull3, objRequireNonNull4);
                int iBy2 = defpackage.ahvr.by(objRequireNonNull3.hashCode());
                while (true) {
                    int i18 = iBy2 & i6;
                    char c = (char) bArr[i18];
                    if (c == 65535) {
                        bArr[i18] = (short) i17;
                        if (i14 < i15) {
                            objArr[i17] = objRequireNonNull3;
                            objArr[i17 ^ 1] = objRequireNonNull4;
                        }
                        i14++;
                        break;
                    }
                    if (objRequireNonNull3.equals(objArr[c])) {
                        int i19 = c ^ 1;
                        aogcVar = new defpackage.aogc(objRequireNonNull3, objRequireNonNull4, j$.util.Objects.requireNonNull(objArr[i19]));
                        objArr[i19] = objRequireNonNull4;
                        break;
                    }
                    iBy2 = i18 + 1;
                }
            }
            if (i14 != i) {
                objArr2 = new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i14), aogcVar};
                return objArr2;
            }
        } else {
            bArr = new int[i2];
            java.util.Arrays.fill((int[]) bArr, -1);
            int i20 = 0;
            int i21 = 0;
            while (i20 < i) {
                int i22 = (i20 << 1) + i3;
                int i23 = (i21 << 1) + i3;
                java.lang.Object objRequireNonNull5 = j$.util.Objects.requireNonNull(objArr[i22]);
                java.lang.Object objRequireNonNull6 = j$.util.Objects.requireNonNull(objArr[i22 ^ i5]);
                defpackage.ahvr.bB(objRequireNonNull5, objRequireNonNull6);
                int iBy3 = defpackage.ahvr.by(objRequireNonNull5.hashCode());
                while (true) {
                    int i24 = iBy3 & i6;
                    ?? r15 = bArr[i24];
                    if (r15 == -1) {
                        bArr[i24] = i23;
                        if (i21 < i20) {
                            objArr[i23] = objRequireNonNull5;
                            objArr[i23 ^ 1] = objRequireNonNull6;
                        }
                        i21++;
                        i4 = i5;
                        break;
                    }
                    i4 = i5;
                    if (objRequireNonNull5.equals(objArr[r15])) {
                        int i25 = r15 ^ 1;
                        aogcVar = new defpackage.aogc(objRequireNonNull5, objRequireNonNull6, j$.util.Objects.requireNonNull(objArr[i25]));
                        objArr[i25] = objRequireNonNull6;
                        break;
                    }
                    iBy3 = i24 + 1;
                    i5 = i4;
                }
                i20++;
                i5 = i4;
            }
            int i26 = i5;
            if (i21 != i) {
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(i21);
                ?? r3 = new java.lang.Object[3];
                r3[0] = bArr;
                r3[i26] = numValueOf;
                r3[2] = aogcVar;
                return r3;
            }
        }
        return bArr;
    }

    @Override // defpackage.aigf, java.util.Map
    /* JADX INFO: renamed from: c */
    public final defpackage.aifo values() {
        return new defpackage.aiki(this.c, 1, this.d);
    }

    @Override // defpackage.aigf, java.util.Map
    /* JADX INFO: renamed from: e */
    public final defpackage.aihd entrySet() {
        return new defpackage.aikg(this, this.c, 0, this.d);
    }

    @Override // defpackage.aigf, java.util.Map
    /* JADX INFO: renamed from: f */
    public final defpackage.aihd keySet() {
        return new defpackage.aikh(this, new defpackage.aiki(this.c, 0, this.d));
    }

    @Override // defpackage.aigf
    public final boolean fr() {
        return false;
    }

    @Override // defpackage.aigf, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Object objT = t(this.e, this.c, this.d, 0, obj);
        if (objT == null) {
            return null;
        }
        return objT;
    }

    @Override // java.util.Map
    public final int size() {
        return this.d;
    }

    @Override // defpackage.aigf
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
