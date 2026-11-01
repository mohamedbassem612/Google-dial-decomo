package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akwb {
    public final java.lang.Object a;
    public final boolean b;

    public akwb(boolean z, afbc afbcVar) {
        this.b = z;
        this.a = (afbc) ahvr.m(afbcVar, afbc.a);
    }

    public final android.text.SpannableString a(java.lang.CharSequence charSequence, android.view.View.OnClickListener onClickListener) {
        return c(charSequence, ((android.content.Context) this.a).getString(2132018781), onClickListener);
    }

    public final android.text.SpannableString b(java.lang.CharSequence charSequence, java.lang.String str) {
        return d(charSequence, ((android.content.Context) this.a).getString(2132018781), str);
    }

    public final android.text.SpannableString c(java.lang.CharSequence charSequence, java.lang.String str, android.view.View.OnClickListener onClickListener) {
        android.text.SpannableString spannableString = new android.text.SpannableString(android.text.TextUtils.expandTemplate(charSequence, str));
        ahvr.bR(spannableString.toString().contains(str), "Couldn't add learn more link to %s", charSequence);
        int iLastIndexOf = spannableString.toString().lastIndexOf(str);
        e(spannableString, iLastIndexOf, str.length() + iLastIndexOf, onClickListener);
        return spannableString;
    }

    public final android.text.SpannableString d(java.lang.CharSequence charSequence, java.lang.String str, java.lang.String str2) {
        android.text.SpannableString spannableString = new android.text.SpannableString(android.text.TextUtils.expandTemplate(charSequence, str));
        ahvr.bR(spannableString.toString().contains(str), "Couldn't add learn more link to %s", charSequence);
        int iLastIndexOf = spannableString.toString().lastIndexOf(str);
        int length = str.length() + iLastIndexOf;
        if (this.b) {
            spannableString.setSpan(new android.text.style.TypefaceSpan(android.graphics.Typeface.create("google-sans-text-medium", 0)), iLastIndexOf, length, 33);
        } else {
            spannableString.setSpan(new android.text.style.TypefaceSpan("google-sans-text-medium"), iLastIndexOf, length, 33);
        }
        spannableString.setSpan(new com.android.dialer.spannable.UrlSpanWithoutUnderline(str2), iLastIndexOf, length, 33);
        return spannableString;
    }

    public final void e(android.text.SpannableString spannableString, int i, int i2, android.view.View.OnClickListener onClickListener) {
        if (this.b) {
            spannableString.setSpan(new android.text.style.TypefaceSpan(android.graphics.Typeface.create("google-sans-text-medium", 0)), i, i2, 33);
        } else {
            spannableString.setSpan(new android.text.style.TypefaceSpan("google-sans-text-medium"), i, i2, 33);
        }
        spannableString.setSpan(new defpackage.ump(this, onClickListener), i, i2, 33);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    public final boolean f(java.lang.CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        if (this.a != null) {
            char c = 0;
            c = 2;
            for (int i2 = 0; i2 < i && c == 2; i2++) {
                byte directionality = java.lang.Character.getDirectionality(charSequence.charAt(i2));
                if (directionality == 0) {
                    c = 1;
                    continue;
                } else if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                        case 15:
                            c = 1;
                            continue;
                        case 16:
                        case 17:
                            break;
                        default:
                            c = 2;
                            continue;
                    }
                }
            }
            if (c == 0) {
                return true;
            }
            if (c == 1) {
                return false;
            }
        }
        return this.b;
    }

    public akwb(java.lang.Object obj) {
        this.a = obj;
        this.b = false;
    }

    public akwb(java.lang.Object obj, boolean z) {
        this.a = obj;
        this.b = z;
    }

    public akwb(boolean z, ajcq ajcqVar) {
        this.b = z;
        this.a = ajcqVar;
    }

    public akwb(boolean z, java.lang.String str) {
        this.b = z;
        this.a = str;
    }

    public akwb(android.content.Context context, boolean z) {
        this.a = context.getApplicationContext();
        this.b = z;
    }

    public akwb(dxu dxuVar, boolean z) {
        this.a = dxuVar;
        this.b = z;
    }
}
