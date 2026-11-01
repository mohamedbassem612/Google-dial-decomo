package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dln {
    private final java.lang.CharSequence a;
    private final int b;
    private final int c;
    private final java.text.BreakIterator d;

    public dln(java.lang.CharSequence charSequence, int i, java.util.Locale locale) {
        this.a = charSequence;
        if (charSequence.length() < 0) {
            defpackage.dnv.b("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            defpackage.dnv.b("input end index is outside the CharSequence");
        }
        java.text.BreakIterator wordInstance = java.text.BreakIterator.getWordInstance(locale);
        this.d = wordInstance;
        this.b = 0;
        this.c = java.lang.Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new defpackage.dlc(charSequence, i));
    }

    private final void i(int i) {
        if (i >= this.c || this.b > i) {
            return;
        }
        ekb ekbVar = ekb.b;
    }

    private final void j(int i) {
        if (i <= this.b || i >= this.c) {
            return;
        }
        ekb ekbVar = ekb.b;
    }

    public final int a(int i) {
        c(i);
        int iFollowing = this.d.following(i);
        if (iFollowing != -1) {
            j(iFollowing);
        }
        return iFollowing;
    }

    public final int b(int i) {
        c(i);
        int iPreceding = this.d.preceding(i);
        if (iPreceding != -1) {
            j(iPreceding);
        }
        return iPreceding;
    }

    public final void c(int i) {
        int i2 = this.c;
        if (i > i2 || this.b > i) {
            defpackage.dnv.b("Invalid offset: " + i + ". Valid range is [" + this.b + " , " + i2 + ']');
        }
    }

    public final boolean d(int i) {
        if (i <= this.c && this.b + 1 <= i) {
            if (java.lang.Character.isLetterOrDigit(java.lang.Character.codePointBefore(this.a, i))) {
                return true;
            }
            i(i - 1);
        }
        return false;
    }

    public final boolean e(int i) {
        if (i > this.c || this.b + 1 > i) {
            return false;
        }
        return defpackage.xa.c(java.lang.Character.codePointBefore(this.a, i));
    }

    public final boolean f(int i) {
        c(i);
        if (!this.d.isBoundary(i)) {
            return false;
        }
        j(i);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    public final boolean g(int i) {
        int i2;
        int i3;
        int i4 = this.c;
        if (i < i4 && (i2 = this.b) <= i) {
            if (i < i4 && i2 <= i) {
                java.lang.CharSequence charSequence = this.a;
                if (!java.lang.Character.isLowSurrogate(charSequence.charAt(i)) || i <= i2) {
                    i3 = i;
                } else {
                    i3 = i - 1;
                    if (!java.lang.Character.isHighSurrogate(charSequence.charAt(i3))) {
                        i3 = i;
                    }
                }
                if (java.lang.Character.isLetterOrDigit(java.lang.Character.codePointAt(charSequence, i3))) {
                    return true;
                }
            }
            i(i);
        }
        return false;
    }

    public final boolean h(int i) {
        if (i >= this.c || this.b > i) {
            return false;
        }
        return defpackage.xa.c(java.lang.Character.codePointAt(this.a, i));
    }
}
