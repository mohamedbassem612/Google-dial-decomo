package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ths {
    public static final /* synthetic */ int a = 0;
    private static final aec b;
    private static final java.util.regex.Pattern c;

    static {
        aec aecVar = mip.a;
        b = mim.b;
        c = java.util.regex.Pattern.compile("[\\-()2-9]+");
    }

    public static char a(char c2, android.content.Context context) {
        java.lang.Character ch;
        aec aecVar = b;
        java.lang.Character chValueOf = java.lang.Character.valueOf(c2);
        java.lang.Character ch2 = (java.lang.Character) aecVar.get(chValueOf);
        if (ch2 != null) {
            return ch2.charValue();
        }
        aec aecVar2 = (aec) mip.a.get(gus.ae(context).getISO3Language());
        return (aecVar2 == null || (ch = (java.lang.Character) aecVar2.get(chValueOf)) == null) ? c2 : ch.charValue();
    }

    public static int b(java.lang.String str, java.lang.String str2, android.content.Context context) {
        if (str2.isEmpty()) {
            return -1;
        }
        java.lang.String strD = d(str);
        java.lang.String strJ = new ahxc('0', '9').j(str2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(strJ.length());
        for (char c2 : strJ.toLowerCase().toCharArray()) {
            sb.append(a(c2, context));
        }
        java.lang.String string = sb.toString();
        java.lang.String strD2 = d(string);
        if (strD2.startsWith(strD)) {
            return 0;
        }
        int i = !java.lang.Character.isDigit(string.charAt(0)) ? 1 : 0;
        for (int i2 = 1; i2 < string.length(); i2++) {
            if (java.lang.Character.isDigit(string.charAt(i2))) {
                int i3 = i2 - i;
                if (!java.lang.Character.isDigit(string.charAt(i2 - 1)) && strD2.startsWith(strD, i3)) {
                    return i2;
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    public static int c(java.lang.String str, java.lang.String str2) {
        return d(str2).indexOf(d(str));
    }

    public static java.lang.String d(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (java.lang.Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static boolean e(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return false;
        }
        return java.util.regex.Pattern.compile("(^|\\s)".concat(java.lang.String.valueOf(java.util.regex.Pattern.quote(str.toLowerCase(java.util.Locale.getDefault()))))).matcher(str2.toLowerCase(java.util.Locale.getDefault())).find();
    }

    public static boolean f(java.lang.String str, java.lang.String str2, android.content.Context context) {
        if (!c.matcher(str).matches()) {
            return false;
        }
        java.lang.String strD = d(str);
        if (b(strD, str2, context) == -1) {
            java.util.List listJ = ahzf.e("\\s").j(str2.toLowerCase(java.util.Locale.getDefault()));
            int i = 0;
            for (int i2 = 0; i2 < listJ.size() && i < strD.length(); i2++) {
                if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) listJ.get(i2)) && a(((java.lang.String) listJ.get(i2)).charAt(0), context) == strD.charAt(i)) {
                    i++;
                }
            }
            if (i != strD.length()) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(java.lang.String str, java.lang.String str2) {
        return android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(str) && c(str, str2) != -1;
    }
}
