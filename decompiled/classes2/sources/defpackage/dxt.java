package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dxt {
    static final defpackage.dxt a;
    static final defpackage.dxt b;
    static final akwb c;
    private static final java.lang.String d = "\u200e";
    private static final java.lang.String e = "\u200f";
    private final boolean f;
    private final akwb g;

    static {
        akwb akwbVar = defpackage.dxv.c;
        c = akwbVar;
        a = new defpackage.dxt(false, akwbVar);
        b = new defpackage.dxt(true, akwbVar);
    }

    public dxt(boolean z, akwb akwbVar) {
        this.f = z;
        this.g = akwbVar;
    }

    public static defpackage.dxt a() {
        return android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) == 1 ? b : a;
    }

    private static int e(java.lang.CharSequence charSequence) {
        byte b2;
        defpackage.dxs dxsVar = new defpackage.dxs(charSequence);
        dxsVar.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = dxsVar.c;
            if (i4 < dxsVar.b && i == 0) {
                java.lang.CharSequence charSequence2 = dxsVar.a;
                char cCharAt = charSequence2.charAt(i4);
                dxsVar.d = cCharAt;
                boolean zIsHighSurrogate = java.lang.Character.isHighSurrogate(cCharAt);
                int i5 = dxsVar.c;
                if (zIsHighSurrogate) {
                    int iCodePointAt = java.lang.Character.codePointAt(charSequence2, i5);
                    dxsVar.c += java.lang.Character.charCount(iCodePointAt);
                    b2 = java.lang.Character.getDirectionality(iCodePointAt);
                } else {
                    dxsVar.c = i5 + 1;
                    b2 = defpackage.dxs.b(dxsVar.d);
                }
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                i3++;
                                i2 = 1;
                                continue;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i == 0) {
            return 0;
        }
        if (i2 != 0) {
            return i2;
        }
        while (dxsVar.c > 0) {
            switch (dxsVar.a()) {
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                    if (i == i3) {
                        return -1;
                    }
                    i3--;
                    break;
                case 16:
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (i == i3) {
                        return 1;
                    }
                    i3--;
                    break;
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    i3++;
                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    private static int f(java.lang.CharSequence charSequence) {
        defpackage.dxs dxsVar = new defpackage.dxs(charSequence);
        dxsVar.c = dxsVar.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (dxsVar.c > 0) {
                byte bA = dxsVar.a();
                if (bA == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public final java.lang.String b(java.lang.String str) {
        return d(str, this.g);
    }

    public final java.lang.String c(java.lang.String str) {
        return d(str, this.g);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    public final java.lang.String d(java.lang.String str, akwb akwbVar) {
        java.lang.String str2;
        if (str == null) {
            return null;
        }
        boolean zF = akwbVar.f(str, str.length());
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        boolean zF2 = (zF ? defpackage.dxv.b : defpackage.dxv.a).f(str, str.length());
        boolean z = this.f;
        boolean z2 = false;
        java.lang.String str3 = "";
        if (z) {
            if (z || (zF2 && e(str) != -1)) {
                str2 = "";
            } else {
                str2 = e;
            }
        } else if (zF2 || e(str) == 1) {
            str2 = d;
        } else {
            zF2 = false;
            if (z) {
                str2 = "";
            } else {
                str2 = "";
            }
        }
        spannableStringBuilder.append((java.lang.CharSequence) str2);
        if (zF != z) {
            spannableStringBuilder.append(true != zF ? (char) 8234 : (char) 8235);
            spannableStringBuilder.append((java.lang.CharSequence) str);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append((java.lang.CharSequence) str);
        }
        boolean zF3 = (zF ? defpackage.dxv.b : defpackage.dxv.a).f(str, str.length());
        if (!z) {
            if (zF3 || f(str) == 1) {
                str3 = d;
            }
            spannableStringBuilder.append((java.lang.CharSequence) str3);
            return spannableStringBuilder.toString();
        }
        z2 = zF3;
        if (z && (!z2 || f(str) == -1)) {
            str3 = e;
        }
        spannableStringBuilder.append((java.lang.CharSequence) str3);
        return spannableStringBuilder.toString();
    }
}
