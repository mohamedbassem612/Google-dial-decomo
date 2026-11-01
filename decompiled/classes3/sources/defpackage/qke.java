package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qke {
    private static final aimz b = aimz.i("com/android/dialer/incall/statusbarnotification/basiccontent/CallStatusTextGenerator");
    public final android.content.Context a;
    private final defpackage.zpo c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final j$.util.Optional l;
    private final j$.util.Optional m;

    public qke(android.content.Context context, defpackage.zpo zpoVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, j$.util.Optional optional, j$.util.Optional optional2) {
        this.a = context;
        this.c = zpoVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = z8;
        this.l = optional;
        this.m = optional2;
    }

    private final boolean d() {
        return this.k && this.m.isPresent();
    }

    final java.lang.CharSequence a(boolean z) {
        boolean z2 = this.i;
        java.lang.String string = (!z2 || z) ? this.a.getString(2132019501) : this.a.getString(2132019502);
        defpackage.zpo zpoVar = this.c;
        byte[] bArr = null;
        if (zpoVar != defpackage.zpo.d) {
            if (zpoVar == defpackage.zpo.e) {
                return this.a.getString(2132019555);
            }
            if (zpoVar == defpackage.zpo.c) {
                return b(2132019503, 2132019504);
            }
            if (this.h) {
                return b(2132019567, 2132019568);
            }
            if (this.j) {
                return b(2132019560, 2132019561);
            }
            if (this.g) {
                return b(2132019562, 2132019563);
            }
            if (this.e) {
                return c(new defpackage.pin(this, string, 6, bArr), new defpackage.pgq(this, string, 8, bArr));
            }
            return (!z2 || z) ? b(2132019556, 2132019557) : b(2132019564, 2132019565);
        }
        if (!this.d) {
            if (this.f) {
                return b(2132019519, 2132019520);
            }
            if (this.g) {
                return b(2132019525, 2132019526);
            }
            if (this.e) {
                return c(new defpackage.pin(this, string, 5, bArr), new defpackage.pgq(this, string, 7, bArr));
            }
            return (!z2 || z) ? b(2132019515, 2132019516) : b(2132019527, 2132019528);
        }
        boolean zD = d();
        android.content.Context context = this.a;
        if (!zD) {
            return context.getString(defpackage.yee.g(context) + (-1) != 0 ? 2132019522 : 2132019521);
        }
        java.lang.String str = (java.lang.String) this.m.orElseThrow();
        j$.util.Optional optional = this.l;
        android.text.SpannableString spannableString = new android.text.SpannableString(context.getString(defpackage.yee.g(context) + (-1) != 0 ? 2132019524 : 2132019523, str));
        if (!optional.isPresent() || ((java.lang.Integer) optional.orElseThrow()).equals(0)) {
            return spannableString;
        }
        int iLastIndexOf = spannableString.toString().lastIndexOf(str);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(((java.lang.Integer) optional.orElseThrow()).intValue()), iLastIndexOf, str.length() + iLastIndexOf, 17);
        return spannableString;
    }

    public final java.lang.CharSequence b(final int i, int i2) {
        return c(new java.util.function.Supplier() { // from class: qkd
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return this.a.a.getString(i);
            }
        }, new amdi(this, i2, 1));
    }

    public final java.lang.String c(java.util.function.Supplier supplier, java.util.function.Function function) {
        java.lang.String str = d() ? (java.lang.String) aa$.ExternalSyntheticApiModelOutline1.m(function, (java.lang.String) this.m.orElseThrow()) : (java.lang.String) aa$.ExternalSyntheticApiModelOutline1.m(supplier);
        b.b().l("com/android/dialer/incall/statusbarnotification/basiccontent/CallStatusTextGenerator", "getCallStatusTextFromResources", 169, "CallStatusTextGenerator.java").y("Notification call status text: %s", str);
        return str;
    }
}
