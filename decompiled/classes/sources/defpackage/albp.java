package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class albp {
    public static final defpackage.albp a = new defpackage.albp();
    private final java.util.concurrent.ConcurrentMap b = new j$.util.concurrent.ConcurrentHashMap();

    private albp() {
    }

    /* JADX WARN: Code duplicated, block: B:138:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:139:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:142:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:180:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:194:0x040f  */
    private defpackage.albw c(java.lang.Class cls) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i2;
        int i3;
        int i4;
        int iCharAt4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        albl albkVar;
        int i14;
        int i15;
        int i16;
        defpackage.albh albhVar;
        int i17;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        int i20;
        java.lang.reflect.Field fieldF;
        int i21;
        char cCharAt8;
        int i22;
        int i23;
        int i24;
        int i25;
        java.lang.Object obj;
        java.lang.reflect.Field fieldF2;
        int i26;
        java.lang.Object obj2;
        java.lang.reflect.Field fieldF3;
        int i27;
        char cCharAt9;
        int i28;
        int i29;
        char cCharAt10;
        int i30;
        int i31;
        char cCharAt11;
        int i32;
        char cCharAt12;
        if (!defpackage.alad.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(java.lang.String.valueOf(cls.getName())));
        }
        try {
            alcd alcdVar = (defpackage.albf) defpackage.alad.q(cls.asSubclass(defpackage.alad.class)).a(3, null);
            if (alcdVar.b()) {
                albkVar = new albl(defpackage.albx.a, alcdVar.a());
            } else {
                defpackage.alci alciVar = defpackage.albx.a;
                int i33 = 1;
                defpackage.ajsz ajszVar = alcdVar.c() + (-1) != 1 ? defpackage.akzr.a : null;
                sun.misc.Unsafe unsafe = defpackage.albk.b;
                if (unsafe == null) {
                    throw new java.lang.RuntimeException("Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode.");
                }
                if (!(alcdVar instanceof defpackage.albr)) {
                    throw null;
                }
                defpackage.albr albrVar = (defpackage.albr) alcdVar;
                java.lang.String str = albrVar.b;
                int length = str.length();
                int iCharAt5 = 0;
                if (str.charAt(0) >= 55296) {
                    int i34 = 1;
                    while (true) {
                        i = i34 + 1;
                        if (str.charAt(i34) < 55296) {
                            break;
                        }
                        i34 = i;
                    }
                } else {
                    i = 1;
                }
                int i35 = i + 1;
                int iCharAt6 = str.charAt(i);
                if (iCharAt6 >= 55296) {
                    int i36 = iCharAt6 & 8191;
                    int i37 = 13;
                    while (true) {
                        i32 = i35 + 1;
                        cCharAt12 = str.charAt(i35);
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i36 |= (cCharAt12 & 8191) << i37;
                        i37 += 13;
                        i35 = i32;
                    }
                    iCharAt6 = i36 | (cCharAt12 << i37);
                    i35 = i32;
                }
                if (iCharAt6 == 0) {
                    iArr = defpackage.albk.a;
                    i33 = 1;
                    i6 = 0;
                    iCharAt4 = 0;
                    iCharAt = 0;
                    iCharAt2 = 0;
                    iCharAt3 = 0;
                    i5 = 0;
                } else {
                    int i38 = i35 + 1;
                    int iCharAt7 = str.charAt(i35);
                    if (iCharAt7 >= 55296) {
                        int i39 = iCharAt7 & 8191;
                        int i40 = 13;
                        while (true) {
                            i13 = i38 + 1;
                            cCharAt7 = str.charAt(i38);
                            if (cCharAt7 < 55296) {
                                break;
                            }
                            i39 |= (cCharAt7 & 8191) << i40;
                            i40 += 13;
                            i38 = i13;
                        }
                        iCharAt7 = i39 | (cCharAt7 << i40);
                        i38 = i13;
                    }
                    int i41 = i38 + 1;
                    int iCharAt8 = str.charAt(i38);
                    if (iCharAt8 >= 55296) {
                        int i42 = iCharAt8 & 8191;
                        int i43 = 13;
                        while (true) {
                            i12 = i41 + 1;
                            cCharAt6 = str.charAt(i41);
                            if (cCharAt6 < 55296) {
                                break;
                            }
                            i42 |= (cCharAt6 & 8191) << i43;
                            i43 += 13;
                            i41 = i12;
                        }
                        iCharAt8 = i42 | (cCharAt6 << i43);
                        i41 = i12;
                    }
                    int i44 = i41 + 1;
                    iCharAt = str.charAt(i41);
                    if (iCharAt >= 55296) {
                        int i45 = iCharAt & 8191;
                        int i46 = 13;
                        while (true) {
                            i11 = i44 + 1;
                            cCharAt5 = str.charAt(i44);
                            if (cCharAt5 < 55296) {
                                break;
                            }
                            i45 |= (cCharAt5 & 8191) << i46;
                            i46 += 13;
                            i44 = i11;
                        }
                        iCharAt = i45 | (cCharAt5 << i46);
                        i44 = i11;
                    }
                    int i47 = i44 + 1;
                    iCharAt2 = str.charAt(i44);
                    if (iCharAt2 >= 55296) {
                        int i48 = iCharAt2 & 8191;
                        int i49 = 13;
                        while (true) {
                            i10 = i47 + 1;
                            cCharAt4 = str.charAt(i47);
                            if (cCharAt4 < 55296) {
                                break;
                            }
                            i48 |= (cCharAt4 & 8191) << i49;
                            i49 += 13;
                            i47 = i10;
                        }
                        iCharAt2 = i48 | (cCharAt4 << i49);
                        i47 = i10;
                    }
                    int i50 = i47 + 1;
                    iCharAt3 = str.charAt(i47);
                    if (iCharAt3 >= 55296) {
                        int i51 = iCharAt3 & 8191;
                        int i52 = i50;
                        int i53 = 13;
                        while (true) {
                            i9 = i52 + 1;
                            cCharAt3 = str.charAt(i52);
                            if (cCharAt3 < 55296) {
                                break;
                            }
                            i51 |= (cCharAt3 & 8191) << i53;
                            i53 += 13;
                            i52 = i9;
                        }
                        iCharAt3 = i51 | (cCharAt3 << i53);
                        i2 = i9;
                    } else {
                        i2 = i50;
                    }
                    int i54 = i2 + 1;
                    iCharAt5 = str.charAt(i2);
                    if (iCharAt5 >= 55296) {
                        int i55 = iCharAt5 & 8191;
                        int i56 = i54;
                        int i57 = 13;
                        while (true) {
                            i8 = i56 + 1;
                            cCharAt2 = str.charAt(i56);
                            if (cCharAt2 < 55296) {
                                break;
                            }
                            i55 |= (cCharAt2 & 8191) << i57;
                            i57 += 13;
                            i56 = i8;
                        }
                        iCharAt5 = i55 | (cCharAt2 << i57);
                        i3 = i8;
                    } else {
                        i3 = i54;
                    }
                    int i58 = i3 + 1;
                    if (str.charAt(i3) >= 55296) {
                        do {
                            i4 = i58;
                            i58 = i4 + 1;
                        } while (str.charAt(i4) >= 55296);
                    }
                    int i59 = i58;
                    int i60 = i59 + 1;
                    iCharAt4 = str.charAt(i59);
                    if (iCharAt4 >= 55296) {
                        int i61 = iCharAt4 & 8191;
                        int i62 = i60;
                        int i63 = 13;
                        while (true) {
                            i7 = i62 + 1;
                            cCharAt = str.charAt(i62);
                            if (cCharAt < 55296) {
                                break;
                            }
                            i61 |= (cCharAt & 8191) << i63;
                            i63 += 13;
                            i62 = i7;
                        }
                        iCharAt4 = i61 | (cCharAt << i63);
                        i60 = i7;
                    }
                    i5 = (iCharAt7 << 1) + iCharAt8;
                    iArr = new int[iCharAt4 + iCharAt5 + iCharAt7];
                    i6 = iCharAt7;
                    i35 = i60;
                }
                java.lang.Object[] objArr = albrVar.c;
                defpackage.albh albhVar2 = albrVar.a;
                java.lang.Class<?> cls2 = albhVar2.getClass();
                int i64 = i6;
                int i65 = iCharAt5 + iCharAt4;
                int[] iArr2 = new int[iCharAt3 * 3];
                java.lang.Object[] objArr2 = new java.lang.Object[iCharAt3 << 1];
                int i66 = i65;
                int i67 = iCharAt4;
                int i68 = 0;
                int i69 = 0;
                while (i35 < length) {
                    int i70 = i35 + 1;
                    int iCharAt9 = str.charAt(i35);
                    int[] iArr3 = iArr2;
                    if (iCharAt9 >= 55296) {
                        int i71 = iCharAt9 & 8191;
                        int i72 = i70;
                        int i73 = 13;
                        while (true) {
                            i31 = i72 + 1;
                            cCharAt11 = str.charAt(i72);
                            i14 = length;
                            if (cCharAt11 < 55296) {
                                break;
                            }
                            i71 |= (cCharAt11 & 8191) << i73;
                            i73 += 13;
                            i72 = i31;
                            length = i14;
                        }
                        iCharAt9 = i71 | (cCharAt11 << i73);
                        i15 = i31;
                    } else {
                        i14 = length;
                        i15 = i70;
                    }
                    int i74 = i15 + 1;
                    int iCharAt10 = str.charAt(i15);
                    if (iCharAt10 >= 55296) {
                        int i75 = iCharAt10 & 8191;
                        int i76 = i74;
                        int i77 = 13;
                        while (true) {
                            i29 = i76 + 1;
                            cCharAt10 = str.charAt(i76);
                            i30 = i75;
                            if (cCharAt10 < 55296) {
                                break;
                            }
                            i75 = i30 | ((cCharAt10 & 8191) << i77);
                            i77 += 13;
                            i76 = i29;
                        }
                        iCharAt10 = i30 | (cCharAt10 << i77);
                        i16 = i29;
                    } else {
                        i16 = i74;
                    }
                    int i78 = i65;
                    if ((iCharAt10 & 1024) != 0) {
                        iArr[i68] = i69;
                        i68++;
                    }
                    int i79 = iCharAt10 & 255;
                    int i80 = iCharAt9;
                    int i81 = iCharAt10 & 2048;
                    if (i79 >= 51) {
                        int i82 = i16 + 1;
                        int iCharAt11 = str.charAt(i16);
                        if (iCharAt11 >= 55296) {
                            int i83 = iCharAt11 & 8191;
                            int i84 = i82;
                            int i85 = 13;
                            while (true) {
                                i27 = i84 + 1;
                                cCharAt9 = str.charAt(i84);
                                i28 = i83;
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i83 = i28 | ((cCharAt9 & 8191) << i85);
                                i85 += 13;
                                i84 = i27;
                            }
                            iCharAt11 = i28 | (cCharAt9 << i85);
                            i23 = i27;
                        } else {
                            i23 = i82;
                        }
                        int i86 = iCharAt11;
                        int i87 = i79 - 51;
                        int i88 = i23;
                        if (i87 == 9 || i87 == 17) {
                            i24 = i5 + 1;
                            objArr2[((i69 / 3) << 1) + 1] = objArr[i5];
                        } else {
                            if (i87 == 12) {
                                if (albrVar.c() == i33 || i81 != 0) {
                                    i24 = i5 + 1;
                                    objArr2[((i69 / 3) << 1) + 1] = objArr[i5];
                                } else {
                                    i81 = 0;
                                }
                            }
                            i25 = i86 << 1;
                            obj = objArr[i25];
                            if (obj instanceof java.lang.reflect.Field) {
                                fieldF2 = (java.lang.reflect.Field) obj;
                            } else {
                                fieldF2 = defpackage.albk.f(cls2, (java.lang.String) obj);
                                objArr[i25] = fieldF2;
                                iArr[i66] = i69;
                                i66++;
                            }
                            albhVar = albhVar2;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF2);
                            i26 = i25 + 1;
                            obj2 = objArr[i26];
                            if (obj2 instanceof java.lang.reflect.Field) {
                                fieldF3 = (java.lang.reflect.Field) obj2;
                            } else {
                                fieldF3 = defpackage.albk.f(cls2, (java.lang.String) obj2);
                                objArr[i26] = fieldF3;
                            }
                            int i89 = i81;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF3);
                            i20 = iObjectFieldOffset3;
                            i18 = i89;
                            iArr = iArr;
                            i35 = i88;
                            i19 = 0;
                            i33 = 1;
                        }
                        i5 = i24;
                        i25 = i86 << 1;
                        obj = objArr[i25];
                        if (obj instanceof java.lang.reflect.Field) {
                            fieldF2 = (java.lang.reflect.Field) obj;
                        } else {
                            fieldF2 = defpackage.albk.f(cls2, (java.lang.String) obj);
                            objArr[i25] = fieldF2;
                            iArr[i66] = i69;
                            i66++;
                        }
                        albhVar = albhVar2;
                        int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldF2);
                        i26 = i25 + 1;
                        obj2 = objArr[i26];
                        if (obj2 instanceof java.lang.reflect.Field) {
                            fieldF3 = (java.lang.reflect.Field) obj2;
                        } else {
                            fieldF3 = defpackage.albk.f(cls2, (java.lang.String) obj2);
                            objArr[i26] = fieldF3;
                        }
                        int i810 = i81;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF3);
                        i20 = iObjectFieldOffset4;
                        i18 = i810;
                        iArr = iArr;
                        i35 = i88;
                        i19 = 0;
                        i33 = 1;
                    } else {
                        albhVar = albhVar2;
                        int i90 = i5 + 1;
                        java.lang.reflect.Field fieldF4 = defpackage.albk.f(cls2, (java.lang.String) objArr[i5]);
                        if (i79 == 9 || i79 == 17) {
                            objArr2[((i69 / 3) << 1) + 1] = fieldF4.getType();
                        } else {
                            if (i79 != 27) {
                                if (i79 == 49) {
                                    i5 += 2;
                                    i22 = 1;
                                } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                                    iArr = iArr;
                                    if (albrVar.c() == 1 || i81 != 0) {
                                        i5 += 2;
                                        objArr2[((i69 / 3) << 1) + 1] = objArr[i90];
                                        i17 = i81;
                                    } else {
                                        i5 = i90;
                                        i17 = 0;
                                    }
                                } else if (i79 == 50) {
                                    int i91 = i5 + 2;
                                    i67++;
                                    iArr[i67] = i69;
                                    int i92 = (i69 / 3) << 1;
                                    objArr2[i92] = objArr[i90];
                                    if (i81 != 0) {
                                        i5 += 3;
                                        objArr2[i92 + 1] = objArr[i91];
                                        i17 = i81;
                                    } else {
                                        i5 = i91;
                                        i17 = 0;
                                    }
                                    iArr = iArr;
                                }
                                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                                iObjectFieldOffset2 = 1048575;
                                if ((iCharAt10 & 4096) != 0 || i79 > 17) {
                                    i33 = 1;
                                    i18 = i17;
                                    i19 = 0;
                                    i35 = i16;
                                    i20 = iObjectFieldOffset;
                                } else {
                                    int i93 = i16 + 1;
                                    int iCharAt12 = str.charAt(i16);
                                    if (iCharAt12 >= 55296) {
                                        int i94 = iCharAt12 & 8191;
                                        int i95 = 13;
                                        while (true) {
                                            i21 = i93 + 1;
                                            cCharAt8 = str.charAt(i93);
                                            if (cCharAt8 < 55296) {
                                                break;
                                            }
                                            i94 |= (cCharAt8 & 8191) << i95;
                                            i95 += 13;
                                            i93 = i21;
                                        }
                                        iCharAt12 = i94 | (cCharAt8 << i95);
                                        i93 = i21;
                                    }
                                    i33 = 1;
                                    int i96 = (i64 << 1) + (iCharAt12 / 32);
                                    java.lang.Object obj3 = objArr[i96];
                                    if (obj3 instanceof java.lang.reflect.Field) {
                                        fieldF = (java.lang.reflect.Field) obj3;
                                    } else {
                                        fieldF = defpackage.albk.f(cls2, (java.lang.String) obj3);
                                        objArr[i96] = fieldF;
                                    }
                                    i19 = iCharAt12 % 32;
                                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
                                    i18 = i17;
                                    i20 = iObjectFieldOffset;
                                    i35 = i93;
                                }
                            } else {
                                i22 = 1;
                                i5 += 2;
                            }
                            objArr2[((i69 / 3) << i22) + i22] = objArr[i90];
                            i17 = i81;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                            iObjectFieldOffset2 = 1048575;
                            if ((iCharAt10 & 4096) != 0) {
                                i33 = 1;
                                i18 = i17;
                                i19 = 0;
                                i35 = i16;
                                i20 = iObjectFieldOffset;
                            } else {
                                i33 = 1;
                                i18 = i17;
                                i19 = 0;
                                i35 = i16;
                                i20 = iObjectFieldOffset;
                            }
                        }
                        i17 = i81;
                        i5 = i90;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt10 & 4096) != 0) {
                            i33 = 1;
                            i18 = i17;
                            i19 = 0;
                            i35 = i16;
                            i20 = iObjectFieldOffset;
                        } else {
                            i33 = 1;
                            i18 = i17;
                            i19 = 0;
                            i35 = i16;
                            i20 = iObjectFieldOffset;
                        }
                    }
                    int i97 = i69 + 1;
                    iArr3[i69] = i80;
                    int i98 = i69 + 2;
                    java.lang.Class<?> cls3 = cls2;
                    iArr3[i97] = ((iCharAt10 & 512) != 0 ? 536870912 : 0) | ((iCharAt10 & 256) != 0 ? 268435456 : 0) | (i18 != 0 ? Integer.MIN_VALUE : 0) | (i79 << 20) | i20;
                    i69 += 3;
                    iArr3[i98] = (i19 << 20) | iObjectFieldOffset2;
                    cls2 = cls3;
                    i65 = i78;
                    iArr2 = iArr3;
                    length = i14;
                    iArr = iArr;
                    str = str;
                    albhVar2 = albhVar;
                }
                albkVar = new defpackage.albk(iArr2, objArr2, iCharAt, iCharAt2, albhVar2, iArr, iCharAt4, i65, alciVar, ajszVar);
            }
            defpackage.albw albwVar = (defpackage.albw) this.b.putIfAbsent(cls, albkVar);
            return albwVar != null ? albwVar : albkVar;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Unable to get message info for ".concat(java.lang.String.valueOf(cls.getName())), e);
        }
    }

    final defpackage.albw a(defpackage.alad aladVar) {
        return b(aladVar.getClass());
    }

    public final defpackage.albw b(java.lang.Class cls) {
        java.lang.Object obj = this.b.get(cls);
        return obj == null ? c(cls) : (defpackage.albw) obj;
    }
}
