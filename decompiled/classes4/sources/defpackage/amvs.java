package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amvs extends defpackage.amwb {
    private static int h(java.lang.CharSequence charSequence, int i) {
        char cCharAt;
        int length = charSequence.length();
        if (i >= length) {
            return 1;
        }
        char cCharAt2 = charSequence.charAt(i);
        if (cCharAt2 == 241) {
            return 4;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            return 1;
        }
        int i2 = i + 1;
        return (i2 >= length || (cCharAt = charSequence.charAt(i2)) < '0' || cCharAt > '9') ? 2 : 3;
    }

    @Override // defpackage.amwb
    protected final java.util.Collection b() {
        return java.util.Collections.singleton(defpackage.amun.e);
    }

    @Override // defpackage.amwb
    public final boolean[] c(java.lang.String str) {
        return d(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8 A[PHI: r7
      0x00a8: PHI (r7v13 int) = (r7v3 int), (r7v3 int), (r7v3 int), (r7v3 int), (r7v3 int), (r7v3 int), (r7v1 int), (r7v1 int), (r7v1 int) binds: [B:56:0x00a3, B:40:0x0076, B:42:0x007e, B:43:0x0080, B:52:0x0098, B:46:0x008a, B:20:0x004b, B:23:0x0055, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.amwb
    public final boolean[] d(java.lang.String str) {
        int i;
        int iH;
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            switch (cCharAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (cCharAt > 127) {
                        throw new java.lang.IllegalArgumentException(a.bj(cCharAt, "Bad character in input: ASCII value="));
                    }
                    break;
                    break;
            }
        }
        int length2 = str.length();
        java.util.ArrayList<int[]> arrayList = new java.util.ArrayList();
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = 103;
            if (i4 >= length2) {
                int i8 = i5 % 103;
                if (i8 < 0) {
                    throw new java.lang.IllegalArgumentException("Unable to compute a valid input checksum");
                }
                int[][] iArr = defpackage.amvr.a;
                arrayList.add(iArr[i8]);
                arrayList.add(iArr[106]);
                int i9 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i10 : iArr2) {
                        i9 += i10;
                    }
                }
                boolean[] zArr = new boolean[i9];
                java.util.Iterator it = arrayList.iterator();
                int iE = 0;
                while (it.hasNext()) {
                    iE += e(zArr, iE, (int[]) it.next(), true);
                }
                return zArr;
            }
            int iH2 = h(str, i4);
            int iCharAt = 96;
            int i11 = 101;
            if (iH2 == 2) {
                if (i6 == 101) {
                    i = 101;
                    i6 = 101;
                } else {
                    i = 100;
                }
            } else if (iH2 != 1) {
                if (i6 == 101) {
                    if (iH2 == 4) {
                        i = 101;
                        i6 = 101;
                    } else {
                        i6 = 101;
                    }
                }
                i = 99;
                if (i6 != 99) {
                    if (i6 == 100) {
                        if (iH2 != 4 && (iH = h(str, i4 + 2)) != 1 && iH != 2) {
                            if (iH != 4) {
                                int i12 = i4 + 4;
                                while (true) {
                                    int iH3 = h(str, i12);
                                    if (iH3 == 3) {
                                        i12 += 2;
                                    } else if (iH3 != 2) {
                                        i = 99;
                                    }
                                }
                            } else if (h(str, i4 + 3) == 3) {
                                i = 99;
                            }
                        }
                        i = 100;
                    } else {
                        if (iH2 == 4) {
                            iH2 = h(str, i4 + 1);
                        }
                        if (iH2 == 3) {
                            i = 99;
                        } else {
                            i = 100;
                        }
                    }
                }
            } else if (i4 >= str.length()) {
                i = 100;
            } else {
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 < ' ') {
                    i = 101;
                } else if (i6 != 101) {
                    i = 100;
                } else if (cCharAt2 < '`' || (cCharAt2 >= 241 && cCharAt2 <= 244)) {
                    i = 101;
                    i6 = 101;
                } else {
                    i = 100;
                    i6 = 101;
                }
            }
            if (i == i6) {
                switch (str.charAt(i4)) {
                    case 241:
                        iCharAt = 102;
                        i11 = i6;
                        i4++;
                        i6 = i11;
                        break;
                    case 242:
                        iCharAt = 97;
                        i11 = i6;
                        i4++;
                        i6 = i11;
                        break;
                    case 243:
                        i11 = i6;
                        i4++;
                        i6 = i11;
                        break;
                    case 244:
                        if (i6 == 101) {
                            iCharAt = 101;
                        } else {
                            i11 = i6;
                            iCharAt = 100;
                        }
                        i4++;
                        i6 = i11;
                        break;
                    default:
                        if (i6 == 100) {
                            iCharAt = str.charAt(i4) - ' ';
                        } else if (i6 != 101) {
                            int i13 = i4 + 1;
                            if (i13 == length2) {
                                throw new java.lang.IllegalArgumentException("Bad number of characters for digit only encoding.");
                            }
                            iCharAt = java.lang.Integer.parseInt(str.substring(i4, i4 + 2));
                            i4 = i13;
                        } else {
                            char cCharAt3 = str.charAt(i4);
                            iCharAt = cCharAt3 - ' ';
                            if (iCharAt < 0) {
                                iCharAt = cCharAt3 + '@';
                            }
                        }
                        i11 = i6;
                        i4++;
                        i6 = i11;
                        break;
                }
            } else {
                if (i6 != 0) {
                    i7 = i;
                } else if (i == 100) {
                    i7 = 104;
                } else if (i != 101) {
                    i7 = 105;
                }
                i6 = i;
                iCharAt = i7;
            }
            arrayList.add(defpackage.amvr.a[iCharAt]);
            i5 += iCharAt * i3;
            if (i4 != 0) {
                i3++;
            }
        }
    }
}
