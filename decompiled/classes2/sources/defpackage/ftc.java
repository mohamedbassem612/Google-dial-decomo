package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ftc implements defpackage.frt {
    private final defpackage.etx a = new defpackage.etx();
    private final boolean b;
    private final int c;
    private final int d;
    private final java.lang.String e;
    private final float f;
    private final int g;

    public ftc(java.util.List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.e = true == "Serif".equals(eum.I(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = eum.a((((bArr[10] & 255) << 8) | (bArr[11] & 255)) / i, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    private static void d(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(((i & 255) << 24) | (i >>> 8)), i3, i4, i5 | 33);
        }
    }

    private static void e(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 != 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i3, i4, i6);
                    z = false;
                }
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i3, i4, i6);
            } else {
                z = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(0), i3, i4, i6);
            }
        }
    }

    @Override // defpackage.frt
    public final /* synthetic */ defpackage.frj a(byte[] bArr, int i, int i2) {
        return defpackage.fsu.a(this, bArr, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.frt
    public final void b(byte[] bArr, int i, int i2, defpackage.frs frsVar, java.util.function.Consumer consumer) {
        java.lang.String strD;
        int i3;
        int i4;
        android.text.SpannableStringBuilder spannableStringBuilder;
        int i5;
        defpackage.etx etxVar = this.a;
        etxVar.O(bArr, i + i2);
        etxVar.Q(i);
        int i6 = 1;
        int i7 = 0;
        int i8 = 2;
        ahvr.bM(etxVar.d() >= 2);
        int iS = etxVar.s();
        if (iS == 0) {
            strD = "";
        } else {
            int i9 = etxVar.c;
            java.nio.charset.Charset charsetE = etxVar.E();
            int i10 = etxVar.c - i9;
            if (charsetE == null) {
                charsetE = java.nio.charset.StandardCharsets.UTF_8;
            }
            strD = etxVar.D(iS - i10, charsetE);
        }
        if (strD.isEmpty()) {
            aa$.ExternalSyntheticApiModelOutline1.m(consumer, new defpackage.frf(aike.a, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(strD);
        int i11 = this.c;
        e(spannableStringBuilder2, i11, 0, 0, spannableStringBuilder2.length(), 16711680);
        int i12 = i11;
        int i13 = this.d;
        d(spannableStringBuilder2, i13, -1, 0, spannableStringBuilder2.length(), 16711680);
        java.lang.String str = this.e;
        int length = spannableStringBuilder2.length();
        if (str != "sans-serif") {
            spannableStringBuilder2.setSpan(new android.text.style.TypefaceSpan(str), 0, length, 16711713);
        }
        float fA = this.f;
        while (etxVar.d() >= 8) {
            int i14 = etxVar.c;
            int i15 = etxVar.i();
            int i16 = etxVar.i();
            if (i16 == 1937013100) {
                ahvr.bM(etxVar.d() >= i8 ? i6 : i7);
                int iS2 = etxVar.s();
                int i17 = i7;
                while (i17 < iS2) {
                    ahvr.bM(etxVar.d() >= 12 ? i6 : i7);
                    int iS3 = etxVar.s();
                    int iS4 = etxVar.s();
                    etxVar.R(i8);
                    int i18 = iS2;
                    int iN = etxVar.n();
                    etxVar.R(i6);
                    int i19 = etxVar.i();
                    if (iS4 > spannableStringBuilder2.length()) {
                        spannableStringBuilder = spannableStringBuilder2;
                        defpackage.etr.f("Tx3gParser", "Truncating styl end (" + iS4 + ") to cueText.length() (" + spannableStringBuilder2.length() + ").");
                        iS4 = spannableStringBuilder.length();
                    } else {
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                    if (iS3 >= iS4) {
                        defpackage.etr.f("Tx3gParser", a.bA(iS4, iS3, "Ignoring styl with start (", ") >= end (", ")."));
                        i5 = i12;
                        spannableStringBuilder2 = spannableStringBuilder;
                    } else {
                        spannableStringBuilder2 = spannableStringBuilder;
                        int i20 = i12;
                        e(spannableStringBuilder2, iN, i20, iS3, iS4, 0);
                        i5 = i20;
                        d(spannableStringBuilder2, i19, i13, iS3, iS4, 0);
                    }
                    i17++;
                    iS2 = i18;
                    i12 = i5;
                    i6 = 1;
                    i7 = 0;
                    i8 = 2;
                }
                i3 = i12;
                i4 = i8;
            } else {
                i3 = i12;
                if (i16 == 1952608120 && this.b) {
                    i4 = 2;
                    ahvr.bM(etxVar.d() >= 2);
                    fA = eum.a(etxVar.s() / this.g, 0.0f, 0.95f);
                } else {
                    i4 = 2;
                }
            }
            etxVar.Q(i14 + i15);
            i12 = i3;
            i8 = i4;
            i6 = 1;
            i7 = 0;
        }
        defpackage.esr esrVar = new defpackage.esr();
        esrVar.d(spannableStringBuilder2);
        esrVar.c(fA, 0);
        esrVar.d = 0;
        aa$.ExternalSyntheticApiModelOutline1.m(consumer, new defpackage.frf(aify.p(esrVar.a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.frt
    public final /* synthetic */ void c() {
    }
}
