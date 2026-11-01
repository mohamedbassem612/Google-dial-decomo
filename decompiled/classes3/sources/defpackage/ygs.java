package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ygs {
    private static final float[] b = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};
    private static final float[] c = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};
    int a;

    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:16:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:40:0x0090  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[DONT_INVERT, PHI: r12
      0x0096: PHI (r12v2 int) = (r12v1 int), (r12v4 int) binds: [B:40:0x0090, B:42:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:76:0x0100 A[PHI: r15
      0x0100: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v6 int), (r15v7 int), (r15v2 int) binds: [B:46:0x009e, B:63:0x00d6, B:75:0x00fe, B:74:0x00fb, B:50:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0105  */
    /* JADX WARN: Code duplicated, block: B:82:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0110  */
    /* JADX WARN: Code duplicated, block: B:84:0x0115  */
    /* JADX WARN: Code duplicated, block: B:85:0x0117  */
    /* JADX WARN: Code duplicated, block: B:87:0x011b  */
    /* JADX WARN: Code duplicated, block: B:92:0x012e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0088 A[ADDED_TO_REGION, EDGE_INSN: B:95:0x0088->B:37:0x0088 BREAK  A[LOOP:0: B:12:0x002f->B:35:0x007d], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0086 A[SYNTHETIC] */
    public final float a(java.lang.String str, int i, int i2) {
        boolean z;
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j2;
        int i10;
        int i11;
        float f;
        float f2;
        float f3;
        char cCharAt;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char cCharAt2;
        char cCharAt3;
        this.a = i;
        if (i < i2) {
            char cCharAt4 = str.charAt(i);
            int i17 = 1;
            if (cCharAt4 != '+') {
                if (cCharAt4 != '-') {
                    z = false;
                } else {
                    z = true;
                }
                int i18 = this.a;
                i3 = 0;
                j = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 0;
                while (true) {
                    i8 = this.a;
                    i9 = i17;
                    if (i8 < i2) {
                        j2 = 0;
                        break;
                    }
                    cCharAt3 = str.charAt(i8);
                    if (cCharAt3 == '0') {
                        j2 = 0;
                        if (cCharAt3 >= '1' && cCharAt3 <= '9') {
                            int i19 = i3 + i4;
                            while (i4 > 0) {
                                if (j <= 922337203685477580L) {
                                    j *= 10;
                                    i4--;
                                }
                            }
                            if (j <= 922337203685477580L) {
                                i3 = i19 + 1;
                                j = (j * 10) + ((long) (cCharAt3 - '0'));
                                if (j < 0) {
                                }
                            }
                        } else {
                            if (cCharAt3 == '.' || i6 != 0) {
                                break;
                            }
                            i7 = this.a - i18;
                            i6 = i9;
                        }
                    } else if (i3 == 0) {
                        i5++;
                        i3 = 0;
                    } else {
                        i4++;
                    }
                    this.a++;
                    i17 = i9;
                }
                if (i6 != 0 || this.a != i7 + 1) {
                    if (i3 != 0) {
                        if (i6 != 0) {
                            i4 = (i7 - i5) - i3;
                        }
                        i10 = this.a;
                        if (i10 < i2 || !((cCharAt = str.charAt(i10)) == 'E' || cCharAt == 'e')) {
                            i11 = i3 + i4;
                            if (i11 <= 39 && i11 >= -44) {
                                f = j;
                                if (j != j2) {
                                    if (i4 > 0) {
                                        f3 = b[i4];
                                    } else if (i4 < 0) {
                                        if (i4 < -38) {
                                            i4 += 20;
                                            f = (float) (((double) f) * 1.0E-20d);
                                        }
                                        f3 = c[-i4];
                                    }
                                    f *= f3;
                                }
                                f2 = f;
                                if (z) {
                                    return -f2;
                                }
                                return f2;
                            }
                        } else {
                            int i20 = this.a + 1;
                            this.a = i20;
                            if (i20 != i2) {
                                char cCharAt5 = str.charAt(i20);
                                if (cCharAt5 != '+') {
                                    if (cCharAt5 != '-') {
                                        switch (cCharAt5) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                i12 = 0;
                                                i13 = 0;
                                                break;
                                            default:
                                                this.a--;
                                                i13 = i9;
                                                i12 = 0;
                                                break;
                                        }
                                    } else {
                                        i12 = i9;
                                    }
                                    if (i13 == 0) {
                                        i14 = this.a;
                                        i15 = 0;
                                        while (true) {
                                            i16 = this.a;
                                            if (i16 >= i2 && (cCharAt2 = str.charAt(i16)) >= '0' && cCharAt2 <= '9') {
                                                this.a++;
                                                i15 = (i15 * 10) + (cCharAt2 - '0');
                                            }
                                        }
                                        if (this.a != i14) {
                                            if (i12 != 0) {
                                                i4 -= i15;
                                            } else {
                                                i4 += i15;
                                            }
                                            i11 = i3 + i4;
                                            if (i11 <= 39) {
                                                f = j;
                                                if (j != j2) {
                                                    if (i4 > 0) {
                                                        f3 = b[i4];
                                                    } else if (i4 < 0) {
                                                        if (i4 < -38) {
                                                            i4 += 20;
                                                            f = (float) (((double) f) * 1.0E-20d);
                                                        }
                                                        f3 = c[-i4];
                                                    }
                                                    f *= f3;
                                                }
                                                f2 = f;
                                                if (z) {
                                                    return -f2;
                                                }
                                                return f2;
                                            }
                                        }
                                    } else {
                                        i11 = i3 + i4;
                                        if (i11 <= 39) {
                                            f = j;
                                            if (j != j2) {
                                                if (i4 > 0) {
                                                    f3 = b[i4];
                                                } else if (i4 < 0) {
                                                    if (i4 < -38) {
                                                        i4 += 20;
                                                        f = (float) (((double) f) * 1.0E-20d);
                                                    }
                                                    f3 = c[-i4];
                                                }
                                                f *= f3;
                                            }
                                            f2 = f;
                                            if (z) {
                                                return -f2;
                                            }
                                            return f2;
                                        }
                                    }
                                } else {
                                    i12 = 0;
                                }
                                this.a++;
                                i13 = 0;
                                if (i13 == 0) {
                                    i14 = this.a;
                                    i15 = 0;
                                    while (true) {
                                        i16 = this.a;
                                        if (i16 >= i2) {
                                        }
                                        if (this.a != i14) {
                                            if (i12 != 0) {
                                                i4 -= i15;
                                            } else {
                                                i4 += i15;
                                            }
                                            i11 = i3 + i4;
                                            if (i11 <= 39) {
                                                f = j;
                                                if (j != j2) {
                                                    if (i4 > 0) {
                                                        f3 = b[i4];
                                                    } else if (i4 < 0) {
                                                        if (i4 < -38) {
                                                            i4 += 20;
                                                            f = (float) (((double) f) * 1.0E-20d);
                                                        }
                                                        f3 = c[-i4];
                                                    }
                                                    f *= f3;
                                                }
                                                f2 = f;
                                                if (z) {
                                                    return -f2;
                                                }
                                                return f2;
                                            }
                                        }
                                        this.a++;
                                        i15 = (i15 * 10) + (cCharAt2 - '0');
                                    }
                                } else {
                                    i11 = i3 + i4;
                                    if (i11 <= 39) {
                                        f = j;
                                        if (j != j2) {
                                            if (i4 > 0) {
                                                f3 = b[i4];
                                            } else if (i4 < 0) {
                                                if (i4 < -38) {
                                                    i4 += 20;
                                                    f = (float) (((double) f) * 1.0E-20d);
                                                }
                                                f3 = c[-i4];
                                            }
                                            f *= f3;
                                        }
                                        f2 = f;
                                        if (z) {
                                            return -f2;
                                        }
                                        return f2;
                                    }
                                }
                            }
                        }
                    } else if (i5 != 0) {
                        i3 = i9;
                        if (i6 != 0) {
                            i4 = (i7 - i5) - i3;
                        }
                        i10 = this.a;
                        if (i10 < i2) {
                            i11 = i3 + i4;
                            if (i11 <= 39) {
                                f = j;
                                if (j != j2) {
                                    if (i4 > 0) {
                                        f3 = b[i4];
                                    } else if (i4 < 0) {
                                        if (i4 < -38) {
                                            i4 += 20;
                                            f = (float) (((double) f) * 1.0E-20d);
                                        }
                                        f3 = c[-i4];
                                    }
                                    f *= f3;
                                }
                                f2 = f;
                                if (z) {
                                    return -f2;
                                }
                                return f2;
                            }
                        } else {
                            i11 = i3 + i4;
                            if (i11 <= 39) {
                                f = j;
                                if (j != j2) {
                                    if (i4 > 0) {
                                        f3 = b[i4];
                                    } else if (i4 < 0) {
                                        if (i4 < -38) {
                                            i4 += 20;
                                            f = (float) (((double) f) * 1.0E-20d);
                                        }
                                        f3 = c[-i4];
                                    }
                                    f *= f3;
                                }
                                f2 = f;
                                if (z) {
                                    return -f2;
                                }
                                return f2;
                            }
                        }
                    }
                }
            } else {
                z = false;
            }
            this.a++;
            int i110 = this.a;
            i3 = 0;
            j = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            while (true) {
                i8 = this.a;
                i9 = i17;
                if (i8 < i2) {
                    j2 = 0;
                    break;
                }
                cCharAt3 = str.charAt(i8);
                if (cCharAt3 == '0') {
                    j2 = 0;
                    if (cCharAt3 >= '1') {
                        if (cCharAt3 == '.') {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    if (cCharAt3 == '.') {
                        break;
                    }
                    break;
                    break;
                }
                if (i3 == 0) {
                    i5++;
                    i3 = 0;
                } else {
                    i4++;
                }
                this.a++;
                i17 = i9;
            }
            if (i6 != 0) {
                if (i3 != 0) {
                    if (i6 != 0) {
                        i4 = (i7 - i5) - i3;
                    }
                    i10 = this.a;
                    if (i10 < i2) {
                        i11 = i3 + i4;
                        if (i11 <= 39) {
                            f = j;
                            if (j != j2) {
                                if (i4 > 0) {
                                    f3 = b[i4];
                                } else if (i4 < 0) {
                                    if (i4 < -38) {
                                        i4 += 20;
                                        f = (float) (((double) f) * 1.0E-20d);
                                    }
                                    f3 = c[-i4];
                                }
                                f *= f3;
                            }
                            f2 = f;
                            if (z) {
                                return -f2;
                            }
                            return f2;
                        }
                    } else {
                        i11 = i3 + i4;
                        if (i11 <= 39) {
                            f = j;
                            if (j != j2) {
                                if (i4 > 0) {
                                    f3 = b[i4];
                                } else if (i4 < 0) {
                                    if (i4 < -38) {
                                        i4 += 20;
                                        f = (float) (((double) f) * 1.0E-20d);
                                    }
                                    f3 = c[-i4];
                                }
                                f *= f3;
                            }
                            f2 = f;
                            if (z) {
                                return -f2;
                            }
                            return f2;
                        }
                    }
                } else if (i5 != 0) {
                    i3 = i9;
                    if (i6 != 0) {
                        i4 = (i7 - i5) - i3;
                    }
                    i10 = this.a;
                    if (i10 < i2) {
                        i11 = i3 + i4;
                        if (i11 <= 39) {
                            f = j;
                            if (j != j2) {
                                if (i4 > 0) {
                                    f3 = b[i4];
                                } else if (i4 < 0) {
                                    if (i4 < -38) {
                                        i4 += 20;
                                        f = (float) (((double) f) * 1.0E-20d);
                                    }
                                    f3 = c[-i4];
                                }
                                f *= f3;
                            }
                            f2 = f;
                            if (z) {
                                return -f2;
                            }
                            return f2;
                        }
                    } else {
                        i11 = i3 + i4;
                        if (i11 <= 39) {
                            f = j;
                            if (j != j2) {
                                if (i4 > 0) {
                                    f3 = b[i4];
                                } else if (i4 < 0) {
                                    if (i4 < -38) {
                                        i4 += 20;
                                        f = (float) (((double) f) * 1.0E-20d);
                                    }
                                    f3 = c[-i4];
                                }
                                f *= f3;
                            }
                            f2 = f;
                            if (z) {
                                return -f2;
                            }
                            return f2;
                        }
                    }
                }
            } else if (i3 != 0) {
                if (i6 != 0) {
                    i4 = (i7 - i5) - i3;
                }
                i10 = this.a;
                if (i10 < i2) {
                    i11 = i3 + i4;
                    if (i11 <= 39) {
                        f = j;
                        if (j != j2) {
                            if (i4 > 0) {
                                f3 = b[i4];
                            } else if (i4 < 0) {
                                if (i4 < -38) {
                                    i4 += 20;
                                    f = (float) (((double) f) * 1.0E-20d);
                                }
                                f3 = c[-i4];
                            }
                            f *= f3;
                        }
                        f2 = f;
                        if (z) {
                            return -f2;
                        }
                        return f2;
                    }
                } else {
                    i11 = i3 + i4;
                    if (i11 <= 39) {
                        f = j;
                        if (j != j2) {
                            if (i4 > 0) {
                                f3 = b[i4];
                            } else if (i4 < 0) {
                                if (i4 < -38) {
                                    i4 += 20;
                                    f = (float) (((double) f) * 1.0E-20d);
                                }
                                f3 = c[-i4];
                            }
                            f *= f3;
                        }
                        f2 = f;
                        if (z) {
                            return -f2;
                        }
                        return f2;
                    }
                }
            } else if (i5 != 0) {
                i3 = i9;
                if (i6 != 0) {
                    i4 = (i7 - i5) - i3;
                }
                i10 = this.a;
                if (i10 < i2) {
                    i11 = i3 + i4;
                    if (i11 <= 39) {
                        f = j;
                        if (j != j2) {
                            if (i4 > 0) {
                                f3 = b[i4];
                            } else if (i4 < 0) {
                                if (i4 < -38) {
                                    i4 += 20;
                                    f = (float) (((double) f) * 1.0E-20d);
                                }
                                f3 = c[-i4];
                            }
                            f *= f3;
                        }
                        f2 = f;
                        if (z) {
                            return -f2;
                        }
                        return f2;
                    }
                } else {
                    i11 = i3 + i4;
                    if (i11 <= 39) {
                        f = j;
                        if (j != j2) {
                            if (i4 > 0) {
                                f3 = b[i4];
                            } else if (i4 < 0) {
                                if (i4 < -38) {
                                    i4 += 20;
                                    f = (float) (((double) f) * 1.0E-20d);
                                }
                                f3 = c[-i4];
                            }
                            f *= f3;
                        }
                        f2 = f;
                        if (z) {
                            return -f2;
                        }
                        return f2;
                    }
                }
            }
        }
        return Float.NaN;
    }
}
