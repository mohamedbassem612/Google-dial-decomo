package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tiq {
    private static final aimz a = aimz.i("com/android/dialer/searchfragment/enhancedsearch/EnhancedQueryBoldingUtil");

    public static java.lang.CharSequence a(java.lang.String str, java.lang.String str2, android.content.Context context) {
        int i;
        if (android.text.TextUtils.isEmpty(str)) {
            return str2;
        }
        java.lang.String str3 = d(str).a;
        java.lang.String str4 = d(str2).a;
        java.util.List listAsList = java.util.Arrays.asList(" ", "-", "_", "@", "(", ")");
        int iIndexOf = str4.indexOf(str3);
        if (iIndexOf != 0) {
            java.util.Iterator it = listAsList.iterator();
            while (it.hasNext() && (iIndexOf = str4.indexOf(java.lang.String.valueOf((java.lang.String) it.next()).concat(str3))) < 0) {
            }
        }
        if (iIndexOf > 0) {
            iIndexOf++;
        }
        int i2 = -1;
        if (iIndexOf >= 0) {
            int iIndexOf2 = str2.toLowerCase(java.util.Locale.getDefault()).indexOf(str.toLowerCase(java.util.Locale.getDefault()));
            if (iIndexOf2 != -1) {
                iIndexOf = iIndexOf2;
            }
            return e(str2, iIndexOf, str.length() + iIndexOf, context);
        }
        int iCharCount = 0;
        if (!defpackage.ths.f(str, str2, context)) {
            while (iCharCount < str.length()) {
                int iCodePointAt = java.lang.Character.codePointAt(str, iCharCount);
                if (fh$.ExternalSyntheticApiModelOutline0.m(iCodePointAt) != fh$.ExternalSyntheticApiModelOutline0.m()) {
                    java.lang.Character.UnicodeBlock unicodeBlockOf = java.lang.Character.UnicodeBlock.of(iCodePointAt);
                    if (!java.lang.Character.UnicodeBlock.HIRAGANA.equals(unicodeBlockOf) && !java.lang.Character.UnicodeBlock.KATAKANA.equals(unicodeBlockOf) && !java.lang.Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS.equals(unicodeBlockOf) && fh$.ExternalSyntheticApiModelOutline0.m(iCodePointAt) != fh$.ExternalSyntheticApiModelOutline0.m$1()) {
                        return str2;
                    }
                }
                iCharCount += java.lang.Character.charCount(iCodePointAt);
            }
            int iIndexOf3 = str2.indexOf(str);
            return iIndexOf3 >= 0 ? e(str2, iIndexOf3, str.length() + iIndexOf3, context) : str2;
        }
        int iB = defpackage.ths.b(str, str2, context);
        if (iB != -1) {
            int length = str.length();
            int i3 = iB;
            while (true) {
                i = iB + length;
                if (i3 > i || i3 >= str2.length()) {
                    break;
                }
                if (!java.lang.Character.isLetter(str2.charAt(i3))) {
                    length++;
                }
                i3++;
            }
            return e(str2, iB, i, context);
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(str2);
        java.lang.String strP = ahvr.p(str2);
        while (true) {
            int i4 = i2 + 1;
            if (i4 >= strP.length() || iCharCount >= str.length()) {
                break;
            }
            if ((i4 == 0 || strP.charAt(i2) == ' ') && defpackage.ths.a(strP.charAt(i4), context) == str.charAt(iCharCount)) {
                f(spannableString, i4, i2 + 2, context);
                iCharCount++;
            }
            i2 = i4;
        }
        return spannableString;
    }

    public static java.lang.CharSequence b(java.lang.String str, java.lang.String str2, android.content.Context context) {
        int i;
        int iIndexOf;
        if (str2 == null) {
            return "";
        }
        int iIndexOf2 = str2.indexOf(91);
        if (iIndexOf2 != -1) {
            int iLastIndexOf = str2.lastIndexOf(10, iIndexOf2);
            int length = str2.length();
            int iLastIndexOf2 = str2.lastIndexOf(93);
            if (iLastIndexOf2 != -1 && (iIndexOf = str2.indexOf(10, iLastIndexOf2)) != -1) {
                length = iIndexOf;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (int i2 = iLastIndexOf != -1 ? iLastIndexOf + 1 : 0; i2 < length; i2++) {
                char cCharAt = str2.charAt(i2);
                if (cCharAt != '[' && cCharAt != ']') {
                    sb.append(cCharAt);
                }
            }
            str2 = sb.toString();
        }
        int iIndexOf3 = str2.indexOf(10);
        if (iIndexOf3 >= 0) {
            str2 = str2.substring(str2.charAt(0) != 8230 ? 0 : 1, iIndexOf3);
        }
        int i3 = 0;
        while (i3 < str.length() && !java.lang.Character.isLetterOrDigit(str.charAt(i3))) {
            i3++;
        }
        java.lang.String strSubstring = str.substring(i3);
        int length2 = str2.length();
        int length3 = strSubstring.length();
        if (length3 == 0 || length2 < length3) {
            i = -1;
            break;
        }
        i = 0;
        while (true) {
            if (i < length2) {
                while (i < length2 && !java.lang.Character.isLetterOrDigit(str2.charAt(i))) {
                    i++;
                }
                if (i + length3 <= length2) {
                    int i4 = 0;
                    while (i4 < length3 && java.lang.Character.toUpperCase(str2.charAt(i + i4)) == java.lang.Character.toUpperCase(strSubstring.charAt(i4))) {
                        i4++;
                    }
                    if (i4 == length3) {
                        break;
                    }
                    while (i < length2 && java.lang.Character.isLetterOrDigit(str2.charAt(i))) {
                        i++;
                    }
                }
            }
            i = -1;
            break;
        }
        if (i == -1) {
            return str2;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(str2);
        f(spannableString, i, strSubstring.length() + i, context);
        return spannableString;
    }

    public static java.lang.CharSequence c(java.lang.String str, java.lang.String str2, android.content.Context context) {
        if (str2 == null) {
            a.bI(a.c().m(aioa.b), "Received null for phone number", "com/android/dialer/searchfragment/enhancedsearch/EnhancedQueryBoldingUtil", "getPhoneNumberWithQueryBolded", (char) 204, "EnhancedQueryBoldingUtil.java", zct.b);
            return new android.text.SpannableString("");
        }
        java.lang.String strG = ahxn.m("()-.").g(str);
        if (android.text.TextUtils.isEmpty(str) || !defpackage.ths.g(strG, str2)) {
            return str2;
        }
        int iC = defpackage.ths.c(str, str2);
        int i = 0;
        for (int i2 = 0; i2 <= iC; i2++) {
            if (!java.lang.Character.isDigit(str2.charAt(i2))) {
                iC++;
            }
        }
        int length = str.length();
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (!java.lang.Character.isDigit(str.charAt(i3))) {
                length--;
            }
        }
        for (int i4 = iC + 1; i4 < iC + length; i4++) {
            if (!java.lang.Character.isDigit(str2.charAt(i4))) {
                length++;
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < str.length() && !java.lang.Character.isDigit(str.charAt(i6)); i6++) {
            i5++;
        }
        int i7 = iC - i5;
        if (i7 >= 0 && str2.startsWith(str.substring(0, i5), i7)) {
            length += i5;
            iC = i7;
        }
        int length2 = str.length();
        while (true) {
            length2--;
            if (length2 < 0 || java.lang.Character.isDigit(str.charAt(length2))) {
                break;
            }
            i++;
        }
        int i8 = iC + length;
        if (i8 < str2.length() && str2.startsWith(str.substring(str.length() - i), i8)) {
            length += i;
        }
        return e(str2, iC, length + iC, context);
    }

    private static defpackage.tip d(java.lang.String str) {
        java.lang.String strNormalize = java.text.Normalizer.normalize(str, java.text.Normalizer.Form.NFKD);
        java.lang.String lowerCase = strNormalize.toLowerCase(java.util.Locale.getDefault());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = lowerCase.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = lowerCase.codePointAt(iCharCount);
            iCharCount += java.lang.Character.charCount(iCodePointAt);
            int type = java.lang.Character.getType(iCodePointAt);
            if (type != 6 && type != 8) {
                sb.appendCodePoint(java.lang.Character.toLowerCase(iCodePointAt));
            }
        }
        return new defpackage.tip(strNormalize, sb.toString());
    }

    private static java.lang.CharSequence e(java.lang.String str, int i, int i2, android.content.Context context) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        if (i < 0) {
            a.b().l("com/android/dialer/searchfragment/enhancedsearch/EnhancedQueryBoldingUtil", "boldText", 348, "EnhancedQueryBoldingUtil.java").v("Cannot apply span with start range < 0");
            i = 0;
        }
        if (i2 > str.length()) {
            a.b().l("com/android/dialer/searchfragment/enhancedsearch/EnhancedQueryBoldingUtil", "boldText", 352, "EnhancedQueryBoldingUtil.java").v("Cannot apply span with an end range > text.length");
            i2 = str.length();
        }
        if (i > i2) {
            a.b().l("com/android/dialer/searchfragment/enhancedsearch/EnhancedQueryBoldingUtil", "boldText", 356, "EnhancedQueryBoldingUtil.java").v("Cannot apply span with start range > end range");
            i = i2;
        }
        f(spannableString, i, i2, context);
        return spannableString;
    }

    private static void f(android.text.SpannableString spannableString, int i, int i2, android.content.Context context) {
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(urg.c(context, 2130969072));
        android.text.style.StyleSpan styleSpan = new android.text.style.StyleSpan(1);
        spannableString.setSpan(foregroundColorSpan, i, i2, 33);
        spannableString.setSpan(styleSpan, i, i2, 33);
    }
}
