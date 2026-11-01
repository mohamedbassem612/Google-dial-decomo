package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eqw {
    public static final defpackage.eqw a = new defpackage.eqw(new defpackage.eqv());
    public final java.lang.CharSequence A;
    public final java.lang.Integer B;
    public final aify C;
    public final aify D;
    public final java.lang.CharSequence b;
    public final java.lang.CharSequence c;
    public final java.lang.CharSequence d;
    public final java.lang.CharSequence e;
    public final java.lang.CharSequence f;
    public final byte[] g;
    public final java.lang.Integer h;
    public final java.lang.Integer i;
    public final java.lang.Integer j;

    @java.lang.Deprecated
    public final java.lang.Integer k;
    public final java.lang.Boolean l;

    @java.lang.Deprecated
    public final java.lang.Integer m;
    public final java.lang.Integer n;
    public final java.lang.Integer o;
    public final java.lang.Integer p;
    public final java.lang.Integer q;
    public final java.lang.Integer r;
    public final java.lang.Integer s;
    public final java.lang.CharSequence t;
    public final java.lang.CharSequence u;
    public final java.lang.CharSequence v;
    public final java.lang.CharSequence w;
    public final java.lang.Integer x;
    public final java.lang.Integer y;
    public final java.lang.CharSequence z;

    static {
        java.lang.String str = eum.a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    public eqw(defpackage.eqv eqvVar) {
        java.lang.Boolean boolValueOf = eqvVar.k;
        java.lang.Integer numValueOf = eqvVar.j;
        java.lang.Integer numValueOf2 = eqvVar.z;
        int i = 1;
        int i2 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                        case 16:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            break;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                        default:
                            i = 0;
                            break;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_LEFT /* 21 */:
                            i = 2;
                            break;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_RIGHT /* 22 */:
                            i = 3;
                            break;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_LEFT /* 23 */:
                            i = 4;
                            break;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                            i = 5;
                            break;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_LEFT /* 25 */:
                            i = 6;
                            break;
                    }
                } else {
                    i = 0;
                }
                numValueOf = java.lang.Integer.valueOf(i);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = java.lang.Boolean.valueOf(z);
            boolValueOf.getClass();
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = java.lang.Integer.valueOf(i2);
            }
        } else {
            numValueOf = null;
        }
        this.b = eqvVar.a;
        this.c = eqvVar.b;
        this.d = eqvVar.c;
        this.e = eqvVar.d;
        this.f = eqvVar.e;
        this.g = eqvVar.f;
        this.h = eqvVar.g;
        this.i = eqvVar.h;
        this.j = eqvVar.i;
        this.k = numValueOf;
        this.l = boolValueOf;
        java.lang.Integer num = eqvVar.l;
        this.m = num;
        this.n = num;
        this.o = eqvVar.m;
        this.p = eqvVar.n;
        this.q = eqvVar.o;
        this.r = eqvVar.p;
        this.s = eqvVar.q;
        this.t = eqvVar.r;
        this.u = eqvVar.s;
        this.v = eqvVar.t;
        this.w = eqvVar.u;
        this.x = eqvVar.v;
        this.y = eqvVar.w;
        this.z = eqvVar.x;
        this.A = eqvVar.y;
        this.B = numValueOf2;
        this.C = eqvVar.A;
        this.D = eqvVar.B;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.eqw eqwVar = (defpackage.eqw) obj;
            if (android.text.TextUtils.equals(this.b, eqwVar.b) && android.text.TextUtils.equals(this.c, eqwVar.c) && android.text.TextUtils.equals(this.d, eqwVar.d) && android.text.TextUtils.equals(this.e, eqwVar.e) && android.text.TextUtils.equals(this.f, eqwVar.f) && j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && java.util.Arrays.equals(this.g, eqwVar.g) && j$.util.Objects.equals(this.h, eqwVar.h) && j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && j$.util.Objects.equals(this.i, eqwVar.i) && j$.util.Objects.equals(this.j, eqwVar.j) && j$.util.Objects.equals(this.k, eqwVar.k) && j$.util.Objects.equals(this.l, eqwVar.l) && j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && j$.util.Objects.equals(this.n, eqwVar.n) && j$.util.Objects.equals(this.o, eqwVar.o) && j$.util.Objects.equals(this.p, eqwVar.p) && j$.util.Objects.equals(this.q, eqwVar.q) && j$.util.Objects.equals(this.r, eqwVar.r) && j$.util.Objects.equals(this.s, eqwVar.s) && android.text.TextUtils.equals(this.t, eqwVar.t) && android.text.TextUtils.equals(this.u, eqwVar.u) && android.text.TextUtils.equals(this.v, eqwVar.v) && android.text.TextUtils.equals(this.w, eqwVar.w) && j$.util.Objects.equals(this.x, eqwVar.x) && j$.util.Objects.equals(this.y, eqwVar.y) && android.text.TextUtils.equals(this.z, eqwVar.z) && android.text.TextUtils.equals(this.A, eqwVar.A) && j$.util.Objects.equals(this.B, eqwVar.B) && j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && j$.util.Objects.equals(this.C, eqwVar.C) && j$.util.Objects.equals(this.D, eqwVar.D)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, this.c, this.d, this.e, null, null, this.f, null, null, null, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.g)), this.h, null, this.i, this.j, this.k, this.l, null, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, null, this.A, this.B, java.lang.Boolean.TRUE, this.D, null, this.C});
    }
}
