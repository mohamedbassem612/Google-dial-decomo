package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amvg implements defpackage.amvj {
    private final /* synthetic */ int $cid;

    public amvg(int i) {
        this.$cid = i;
    }

    private static java.lang.String b(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            throw new java.lang.IllegalStateException("StringBuilder must not be empty");
        }
        char cCharAt = charSequence.charAt(0);
        char cCharAt2 = length >= 2 ? charSequence.charAt(1) : (char) 0;
        char cCharAt3 = length >= 3 ? charSequence.charAt(2) : (char) 0;
        char cCharAt4 = length >= 4 ? charSequence.charAt(3) : (char) 0;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(3);
        int i = (cCharAt << 18) + (cCharAt2 << '\f') + (cCharAt3 << 6) + cCharAt4;
        sb.append((char) ((i >> 16) & 255));
        if (length >= 2) {
            sb.append((char) ((i >> 8) & 255));
        }
        if (length >= 3) {
            sb.append((char) (i & 255));
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0091 A[Catch: all -> 0x00db, TryCatch #0 {all -> 0x00db, blocks: (B:26:0x005f, B:29:0x0067, B:31:0x0079, B:36:0x0091, B:41:0x00a2, B:43:0x00b5, B:46:0x00cd, B:45:0x00c4, B:49:0x00d3, B:50:0x00da), top: B:114:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2 A[Catch: all -> 0x00db, TryCatch #0 {all -> 0x00db, blocks: (B:26:0x005f, B:29:0x0067, B:31:0x0079, B:36:0x0091, B:41:0x00a2, B:43:0x00b5, B:46:0x00cd, B:45:0x00c4, B:49:0x00d3, B:50:0x00da), top: B:114:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5 A[Catch: all -> 0x00db, TryCatch #0 {all -> 0x00db, blocks: (B:26:0x005f, B:29:0x0067, B:31:0x0079, B:36:0x0091, B:41:0x00a2, B:43:0x00b5, B:46:0x00cd, B:45:0x00c4, B:49:0x00d3, B:50:0x00da), top: B:114:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4 A[Catch: all -> 0x00db, TryCatch #0 {all -> 0x00db, blocks: (B:26:0x005f, B:29:0x0067, B:31:0x0079, B:36:0x0091, B:41:0x00a2, B:43:0x00b5, B:46:0x00cd, B:45:0x00c4, B:49:0x00d3, B:50:0x00da), top: B:114:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd A[Catch: all -> 0x00db, TRY_LEAVE, TryCatch #0 {all -> 0x00db, blocks: (B:26:0x005f, B:29:0x0067, B:31:0x0079, B:36:0x0091, B:41:0x00a2, B:43:0x00b5, B:46:0x00cd, B:45:0x00c4, B:49:0x00d3, B:50:0x00da), top: B:114:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3 A[Catch: all -> 0x00db, TRY_ENTER, TryCatch #0 {all -> 0x00db, blocks: (B:26:0x005f, B:29:0x0067, B:31:0x0079, B:36:0x0091, B:41:0x00a2, B:43:0x00b5, B:46:0x00cd, B:45:0x00c4, B:49:0x00d3, B:50:0x00da), top: B:114:0x005f }] */
    @Override // defpackage.amvj
    public final void a(defpackage.amvk amvkVar) {
        int i;
        java.lang.String strB;
        boolean z;
        int i2 = this.$cid;
        if (i2 == 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append((char) 0);
            while (amvkVar.i()) {
                sb.append(amvkVar.a());
                int i3 = amvkVar.c + 1;
                amvkVar.c = i3;
                if (anar.H(amvkVar.a, i3, 5) != 5) {
                    amvkVar.d = 0;
                    break;
                }
            }
            int length = sb.length() - 1;
            int iB = amvkVar.b() + length + 1;
            amvkVar.f(iB);
            int i4 = amvkVar.e.b - iB;
            if (amvkVar.i() || i4 > 0) {
                if (length <= 249) {
                    sb.setCharAt(0, (char) length);
                } else {
                    if (length > 1555) {
                        throw new java.lang.IllegalStateException(a.bj(length, "Message length not in valid ranges: "));
                    }
                    sb.setCharAt(0, (char) ((length / 250) + 249));
                    sb.insert(1, (char) (length % 250));
                }
            }
            int length2 = sb.length();
            for (int i5 = 0; i5 < length2; i5++) {
                int iCharAt = sb.charAt(i5) + (((amvkVar.b() + 1) * 149) % 255) + 1;
                if (iCharAt > 255) {
                    iCharAt -= 256;
                }
                amvkVar.g((char) iCharAt);
            }
            return;
        }
        if (i2 == 1) {
            java.lang.String str = amvkVar.a;
            int i6 = amvkVar.c;
            int length3 = str.length();
            int i7 = i6;
            while (i7 < length3 && anty.ai(str.charAt(i7))) {
                i7++;
            }
            if (i7 - i6 >= 2) {
                char cCharAt = str.charAt(amvkVar.c);
                char cCharAt2 = str.charAt(amvkVar.c + 1);
                if (!anty.ai(cCharAt) || !anty.ai(cCharAt2)) {
                    throw new java.lang.IllegalArgumentException("not digits: " + cCharAt + cCharAt2);
                }
                amvkVar.g((char) (((cCharAt - '0') * 10) + (cCharAt2 - '0') + 130));
                amvkVar.c += 2;
                return;
            }
            char cA = amvkVar.a();
            int iH = anar.H(str, amvkVar.c, 0);
            if (iH == 0) {
                if (!anar.J(cA)) {
                    amvkVar.g((char) (cA + 1));
                    amvkVar.c++;
                    return;
                } else {
                    amvkVar.g((char) 235);
                    amvkVar.g((char) (cA - 127));
                    amvkVar.c++;
                    return;
                }
            }
            if (iH == 1) {
                amvkVar.g((char) 230);
                amvkVar.d = 1;
                return;
            }
            if (iH == 2) {
                amvkVar.g((char) 239);
                amvkVar.d = 2;
                return;
            } else if (iH == 3) {
                amvkVar.g((char) 238);
                amvkVar.d = 3;
                return;
            } else if (iH != 4) {
                amvkVar.g((char) 231);
                amvkVar.d = 5;
                return;
            } else {
                amvkVar.g((char) 240);
                amvkVar.d = 4;
                return;
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        while (amvkVar.i()) {
            char cA2 = amvkVar.a();
            if (cA2 >= ' ' && cA2 <= '?') {
                sb2.append(cA2);
            } else if (cA2 < '@' || cA2 > '^') {
                anar.I(cA2);
            } else {
                sb2.append((char) (cA2 - '@'));
            }
            amvkVar.c++;
            if (sb2.length() >= 4) {
                amvkVar.h(b(sb2));
                sb2.delete(0, 4);
                if (anar.H(amvkVar.a, amvkVar.c, 4) != 4) {
                    amvkVar.d = 0;
                    break;
                }
            }
        }
        sb2.append((char) 31);
        try {
            int length4 = sb2.length();
            if (length4 != 0) {
                if (length4 == 1) {
                    amvkVar.e();
                    int iB2 = amvkVar.e.b - amvkVar.b();
                    int iC = amvkVar.c();
                    if (iC > iB2) {
                        amvkVar.f(amvkVar.b() + 1);
                        iB2 = amvkVar.e.b - amvkVar.b();
                    }
                    if (iC > iB2 || iB2 > 2) {
                        length4 = 1;
                        if (length4 <= 4) {
                            throw new java.lang.IllegalStateException("Count must not exceed 4");
                        }
                        i = length4 - 1;
                        strB = b(sb2);
                        z = amvkVar.i() && i <= 2;
                        if (i <= 2) {
                            amvkVar.f(amvkVar.b() + i);
                            if (amvkVar.e.b - amvkVar.b() >= 3) {
                                amvkVar.f(amvkVar.b() + strB.length());
                            } else if (z) {
                                amvkVar.d();
                                amvkVar.c -= i;
                            }
                            amvkVar.h(strB);
                        } else if (z) {
                            amvkVar.d();
                            amvkVar.c -= i;
                        } else {
                            amvkVar.h(strB);
                        }
                    }
                } else {
                    if (length4 <= 4) {
                        throw new java.lang.IllegalStateException("Count must not exceed 4");
                    }
                    i = length4 - 1;
                    strB = b(sb2);
                    if (amvkVar.i()) {
                    }
                    if (i <= 2) {
                        amvkVar.f(amvkVar.b() + i);
                        if (amvkVar.e.b - amvkVar.b() >= 3) {
                            amvkVar.f(amvkVar.b() + strB.length());
                        } else if (z) {
                            amvkVar.d();
                            amvkVar.c -= i;
                        }
                        amvkVar.h(strB);
                    } else if (z) {
                        amvkVar.d();
                        amvkVar.c -= i;
                    } else {
                        amvkVar.h(strB);
                    }
                }
            }
            amvkVar.d = 0;
        } catch (java.lang.Throwable th) {
            amvkVar.d = 0;
            throw th;
        }
    }
}
