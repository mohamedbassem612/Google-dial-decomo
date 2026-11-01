package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afpv {
    public final com.google.android.material.badge.BadgeState$State a;
    public final com.google.android.material.badge.BadgeState$State b;
    final float c;
    final float d;
    final float e;
    final float f;
    final float g;
    final float h;
    final int i;
    final int j;
    final int k;
    public int l;

    public afpv(android.content.Context context, com.google.android.material.badge.BadgeState$State badgeState$State) {
        android.util.AttributeSet attributeSetV;
        int styleAttribute;
        com.google.android.material.badge.BadgeState$State badgeState$State2 = new com.google.android.material.badge.BadgeState$State();
        this.b = badgeState$State2;
        badgeState$State = badgeState$State == null ? new com.google.android.material.badge.BadgeState$State() : badgeState$State;
        int i = badgeState$State.a;
        if (i != 0) {
            attributeSetV = agab.V(context, i);
            styleAttribute = attributeSetV.getStyleAttribute();
        } else {
            attributeSetV = null;
            styleAttribute = 0;
        }
        android.content.res.TypedArray typedArrayA = afvl.a(context, attributeSetV, defpackage.afpw.a, 2130968697, styleAttribute == 0 ? 2132086066 : styleAttribute, new int[0]);
        android.content.res.Resources resources = context.getResources();
        this.c = typedArrayA.getDimensionPixelSize(5, -1);
        this.i = context.getResources().getDimensionPixelSize(2131166994);
        this.j = context.getResources().getDimensionPixelSize(2131166997);
        this.d = typedArrayA.getDimensionPixelSize(15, -1);
        this.e = typedArrayA.getDimension(13, resources.getDimension(2131166266));
        this.g = typedArrayA.getDimension(18, resources.getDimension(2131166270));
        this.f = typedArrayA.getDimension(4, resources.getDimension(2131166266));
        this.h = typedArrayA.getDimension(14, resources.getDimension(2131166270));
        this.k = typedArrayA.getInt(25, 1);
        this.l = typedArrayA.getInt(2, 0);
        int i2 = badgeState$State.i;
        badgeState$State2.i = i2 == -2 ? 255 : i2;
        int i3 = badgeState$State.k;
        if (i3 != -2) {
            badgeState$State2.k = i3;
        } else if (typedArrayA.hasValue(24)) {
            badgeState$State2.k = typedArrayA.getInt(24, 0);
        } else {
            badgeState$State2.k = -1;
        }
        java.lang.String str = badgeState$State.j;
        if (str != null) {
            badgeState$State2.j = str;
        } else if (typedArrayA.hasValue(8)) {
            badgeState$State2.j = typedArrayA.getString(8);
        }
        badgeState$State2.o = badgeState$State.o;
        java.lang.CharSequence charSequence = badgeState$State.p;
        badgeState$State2.p = charSequence == null ? context.getString(2132019364) : charSequence;
        int i4 = badgeState$State.q;
        badgeState$State2.q = i4 == 0 ? 2131886106 : i4;
        int i5 = badgeState$State.r;
        badgeState$State2.r = i5 == 0 ? 2132019381 : i5;
        java.lang.Boolean bool = badgeState$State.t;
        badgeState$State2.t = java.lang.Boolean.valueOf(bool == null || bool.booleanValue());
        int i6 = badgeState$State.l;
        badgeState$State2.l = i6 == -2 ? typedArrayA.getInt(22, -2) : i6;
        int i7 = badgeState$State.m;
        badgeState$State2.m = i7 == -2 ? typedArrayA.getInt(23, -2) : i7;
        java.lang.Integer num = badgeState$State.e;
        badgeState$State2.e = java.lang.Integer.valueOf(num == null ? typedArrayA.getResourceId(6, 2132083726) : num.intValue());
        java.lang.Integer num2 = badgeState$State.f;
        badgeState$State2.f = java.lang.Integer.valueOf(num2 == null ? typedArrayA.getResourceId(7, 0) : num2.intValue());
        java.lang.Integer num3 = badgeState$State.g;
        badgeState$State2.g = java.lang.Integer.valueOf(num3 == null ? typedArrayA.getResourceId(16, 2132083726) : num3.intValue());
        java.lang.Integer num4 = badgeState$State.h;
        badgeState$State2.h = java.lang.Integer.valueOf(num4 == null ? typedArrayA.getResourceId(17, 0) : num4.intValue());
        java.lang.Integer num5 = badgeState$State.b;
        badgeState$State2.b = java.lang.Integer.valueOf(num5 == null ? l(context, typedArrayA, 1) : num5.intValue());
        java.lang.Integer num6 = badgeState$State.d;
        badgeState$State2.d = java.lang.Integer.valueOf(num6 == null ? typedArrayA.getResourceId(9, 2132084496) : num6.intValue());
        java.lang.Integer num7 = badgeState$State.c;
        if (num7 != null) {
            badgeState$State2.c = num7;
        } else if (typedArrayA.hasValue(10)) {
            badgeState$State2.c = java.lang.Integer.valueOf(l(context, typedArrayA, 10));
        } else {
            badgeState$State2.c = java.lang.Integer.valueOf(new defpackage.afza(context, badgeState$State2.d.intValue()).k.getDefaultColor());
        }
        java.lang.Integer num8 = badgeState$State.s;
        badgeState$State2.s = java.lang.Integer.valueOf(num8 == null ? typedArrayA.getInt(3, 8388661) : num8.intValue());
        java.lang.Integer num9 = badgeState$State.u;
        badgeState$State2.u = java.lang.Integer.valueOf(num9 == null ? typedArrayA.getDimensionPixelSize(12, resources.getDimensionPixelSize(2131166995)) : num9.intValue());
        java.lang.Integer num10 = badgeState$State.v;
        badgeState$State2.v = java.lang.Integer.valueOf(num10 == null ? typedArrayA.getDimensionPixelSize(11, resources.getDimensionPixelSize(2131166272)) : num10.intValue());
        java.lang.Integer num11 = badgeState$State.w;
        badgeState$State2.w = java.lang.Integer.valueOf(num11 == null ? typedArrayA.getDimensionPixelOffset(19, 0) : num11.intValue());
        java.lang.Integer num12 = badgeState$State.x;
        badgeState$State2.x = java.lang.Integer.valueOf(num12 == null ? typedArrayA.getDimensionPixelOffset(26, 0) : num12.intValue());
        java.lang.Integer num13 = badgeState$State.y;
        badgeState$State2.y = java.lang.Integer.valueOf(num13 == null ? typedArrayA.getDimensionPixelOffset(20, badgeState$State2.w.intValue()) : num13.intValue());
        java.lang.Integer num14 = badgeState$State.z;
        badgeState$State2.z = java.lang.Integer.valueOf(num14 == null ? typedArrayA.getDimensionPixelOffset(27, badgeState$State2.x.intValue()) : num14.intValue());
        java.lang.Integer num15 = badgeState$State.C;
        badgeState$State2.C = java.lang.Integer.valueOf(num15 == null ? typedArrayA.getDimensionPixelOffset(21, 0) : num15.intValue());
        java.lang.Integer num16 = badgeState$State.A;
        badgeState$State2.A = java.lang.Integer.valueOf(num16 == null ? 0 : num16.intValue());
        java.lang.Integer num17 = badgeState$State.B;
        badgeState$State2.B = java.lang.Integer.valueOf(num17 == null ? 0 : num17.intValue());
        java.lang.Boolean bool2 = badgeState$State.D;
        badgeState$State2.D = java.lang.Boolean.valueOf(bool2 == null ? typedArrayA.getBoolean(0, false) : bool2.booleanValue());
        typedArrayA.recycle();
        java.util.Locale locale = badgeState$State.n;
        badgeState$State2.n = locale == null ? aa$.ExternalSyntheticApiModelOutline1.m(aa$.ExternalSyntheticApiModelOutline1.m()) : locale;
        this.a = badgeState$State;
    }

    private static int l(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        return agab.o(context, typedArray, i).getDefaultColor();
    }

    final int a() {
        return this.b.s.intValue();
    }

    final int b() {
        return this.b.f.intValue();
    }

    final int c() {
        return this.b.e.intValue();
    }

    final int d() {
        return this.b.h.intValue();
    }

    final int e() {
        return this.b.g.intValue();
    }

    public final int f() {
        return this.b.q;
    }

    public final int g() {
        return this.b.w.intValue();
    }

    public final int h() {
        return this.b.k;
    }

    final java.util.Locale i() {
        return this.b.n;
    }

    final boolean j() {
        return this.b.k != -1;
    }

    final boolean k() {
        return this.b.j != null;
    }
}
