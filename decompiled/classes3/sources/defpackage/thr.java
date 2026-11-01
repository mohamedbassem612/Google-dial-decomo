package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class thr {
    private static final aimz a = aimz.i("com/android/dialer/searchfragment/common/QueryBoldingUtil");

    public static java.lang.CharSequence a(java.lang.String str, java.lang.String str2, android.content.Context context, int i) {
        int i2;
        if (str2 == null) {
            a.bI(a.c().m(aioa.b), "Received null for name", "com/android/dialer/searchfragment/common/QueryBoldingUtil", "getNameWithQueryBoldedAndColored", 'J', "QueryBoldingUtil.java", zct.b);
            return new android.text.SpannableString("");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return str2;
        }
        if (!defpackage.ths.f(str, str2, context)) {
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(^|\\s)".concat(java.lang.String.valueOf(java.util.regex.Pattern.quote(ahvr.p(str))))).matcher(ahvr.p(str2));
            return matcher.find() ? c(str2, matcher.start(), matcher.end(), i) : str2;
        }
        int iB = defpackage.ths.b(str, str2, context);
        int i3 = -1;
        if (iB != -1) {
            int length = str.length();
            int i4 = iB;
            while (true) {
                i2 = iB + length;
                if (i4 > i2 || i4 >= str2.length()) {
                    break;
                }
                if (!java.lang.Character.isLetter(str2.charAt(i4))) {
                    length++;
                }
                i4++;
            }
            return c(str2, iB, i2, i);
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(str2);
        java.lang.String strP = ahvr.p(str2);
        int i5 = 0;
        while (true) {
            int i6 = i3 + 1;
            if (i6 >= strP.length() || i5 >= str.length()) {
                break;
            }
            if ((i6 == 0 || strP.charAt(i3) == ' ') && defpackage.ths.a(strP.charAt(i6), context) == str.charAt(i5)) {
                int i7 = i3 + 2;
                spannableString.setSpan(new android.text.style.StyleSpan(1), i6, i7, 18);
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(i), i6, i7, 18);
                i5++;
            }
            i3 = i6;
        }
        return spannableString;
    }

    public static java.lang.CharSequence b(java.lang.String str, java.lang.String str2, int i) {
        if (str2 == null) {
            a.bI(a.c().m(aioa.b), "Received null for number", "com/android/dialer/searchfragment/common/QueryBoldingUtil", "getNumberWithQueryBoldedAndColored", (char) 158, "QueryBoldingUtil.java", zct.b);
            return new android.text.SpannableString("");
        }
        if (android.text.TextUtils.isEmpty(str) || !defpackage.ths.g(str, str2)) {
            return str2;
        }
        int iC = defpackage.ths.c(str, str2);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (!java.lang.Character.isDigit(str.charAt(i3))) {
                length--;
            }
        }
        while (true) {
            int i4 = iC + length;
            if (i2 >= i4) {
                return c(str2, iC, i4, i);
            }
            if (!java.lang.Character.isDigit(str2.charAt(i2))) {
                if (i2 <= iC) {
                    iC++;
                } else {
                    length++;
                }
            }
            i2++;
        }
    }

    private static android.text.SpannableString c(java.lang.String str, int i, int i2, int i3) {
        if (i2 > str.length()) {
            a.bI(a.c().m(aioa.b), "number of bolded characters exceeded length of string.", "com/android/dialer/searchfragment/common/QueryBoldingUtil", "getBoldedAndColoredString", (char) 194, "QueryBoldingUtil.java", zct.b);
            i2 = str.length();
        }
        if (i >= i2) {
            a.bI(a.c().m(aioa.b), "not a valid region (start index is larger than end index)", "com/android/dialer/searchfragment/common/QueryBoldingUtil", "getBoldedAndColoredString", (char) 203, "QueryBoldingUtil.java", zct.b);
            return new android.text.SpannableString(str);
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        spannableString.setSpan(new android.text.style.StyleSpan(1), i, i2, 17);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(i3), i, i2, 18);
        return spannableString;
    }
}
