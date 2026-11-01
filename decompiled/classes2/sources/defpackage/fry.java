package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fry {
    public final java.util.List a = new java.util.ArrayList();
    public final java.util.List b = new java.util.ArrayList();
    public final java.lang.StringBuilder c = new java.lang.StringBuilder();
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public fry(int i, int i2) {
        e(i);
        this.h = i2;
    }

    private static void h(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if (i3 != -1) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i3), i, i2, 33);
        }
    }

    private static void i(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i, i2, 33);
    }

    private static void j(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, i2, 33);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:46:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0015 A[SYNTHETIC] */
    public final android.text.SpannableString a() {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(this.c);
        int length = spannableStringBuilder.length();
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (true) {
            java.util.List list = this.a;
            if (i5 >= list.size()) {
                break;
            }
            defpackage.frx frxVar = (defpackage.frx) list.get(i5);
            boolean z2 = frxVar.b;
            int i7 = frxVar.a;
            if (i7 != 8) {
                z = i7 == 7;
                if (i7 != 7) {
                    i4 = defpackage.frz.a[i7];
                }
            }
            int i8 = frxVar.c;
            i5++;
            if (i8 != (i5 < list.size() ? ((defpackage.frx) list.get(i5)).c : length)) {
                if (i != -1) {
                    if (!z2) {
                        j(spannableStringBuilder, i, i8);
                        i = -1;
                    }
                    if (i2 != -1) {
                        if (!z) {
                            i(spannableStringBuilder, i2, i8);
                            i2 = -1;
                        }
                        if (i4 != i3) {
                            h(spannableStringBuilder, i6, i8, i3);
                            i6 = i8;
                            i3 = i4;
                        }
                    } else {
                        i2 = -1;
                    }
                    if (i2 == -1 && z) {
                        i2 = i8;
                    }
                    if (i4 != i3) {
                        h(spannableStringBuilder, i6, i8, i3);
                        i6 = i8;
                        i3 = i4;
                    }
                } else {
                    i = -1;
                }
                if (i == -1 && z2) {
                    i = i8;
                }
                if (i2 != -1) {
                    if (!z) {
                        i(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    }
                    if (i4 != i3) {
                        h(spannableStringBuilder, i6, i8, i3);
                        i6 = i8;
                        i3 = i4;
                    }
                } else {
                    i2 = -1;
                }
                if (i2 == -1) {
                    i2 = i8;
                }
                if (i4 != i3) {
                    h(spannableStringBuilder, i6, i8, i3);
                    i6 = i8;
                    i3 = i4;
                }
            }
        }
        if (i != -1 && i != length) {
            j(spannableStringBuilder, i, length);
        }
        if (i2 != -1 && i2 != length) {
            i(spannableStringBuilder, i2, length);
        }
        if (i6 != length) {
            h(spannableStringBuilder, i6, length, i3);
        }
        return new android.text.SpannableString(spannableStringBuilder);
    }

    public final defpackage.ess b(int i) {
        float f;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            java.util.List list = this.b;
            if (i2 >= list.size()) {
                break;
            }
            spannableStringBuilder.append((java.lang.CharSequence) list.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((java.lang.CharSequence) a());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i3 = this.e + this.f;
        int length = (32 - i3) - spannableStringBuilder.length();
        if (i == Integer.MIN_VALUE) {
            int i4 = i3 - length;
            if (this.g != 2 || (java.lang.Math.abs(i4) >= 3 && length >= 0)) {
                i = (this.g != 2 || i4 <= 0) ? 0 : 2;
            } else {
                i = 1;
            }
        }
        if (i != 1) {
            if (i == 2) {
                i3 = 32 - length;
            }
            f = ((i3 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i5 = this.d;
        if (i5 > 7) {
            i5 -= 17;
        } else if (this.g == 1) {
            i5 -= this.h - 1;
        }
        defpackage.esr esrVar = new defpackage.esr();
        esrVar.d(spannableStringBuilder);
        esrVar.b = android.text.Layout.Alignment.ALIGN_NORMAL;
        esrVar.c(i5, 1);
        esrVar.e = f;
        esrVar.f = i;
        return esrVar.a();
    }

    public final void c(char c) {
        java.lang.StringBuilder sb = this.c;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    public final void d() {
        defpackage.frx frxVar;
        int i;
        java.lang.StringBuilder sb = this.c;
        int length = sb.length();
        if (length <= 0) {
            return;
        }
        sb.delete(length - 1, length);
        java.util.List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0 || (i = (frxVar = (defpackage.frx) list.get(size)).c) != length) {
                return;
            } else {
                frxVar.c = i - 1;
            }
        }
    }

    public final void e(int i) {
        this.g = i;
        this.a.clear();
        this.b.clear();
        this.c.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
    }

    public final void f(int i, boolean z) {
        this.a.add(new defpackage.frx(i, z, this.c.length()));
    }

    public final boolean g() {
        return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
    }
}
