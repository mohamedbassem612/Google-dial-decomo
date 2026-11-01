package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dds extends defpackage.ddm {
    public static defpackage.dds b;
    public final java.text.BreakIterator c;

    public dds(java.util.Locale locale) {
        this.c = java.text.BreakIterator.getWordInstance(locale);
    }

    private final boolean e(int i) {
        if (i <= 0 || !f(i - 1)) {
            return false;
        }
        return i == a().length() || !f(i);
    }

    private final boolean f(int i) {
        if (i < 0 || i >= a().length()) {
            return false;
        }
        return java.lang.Character.isLetterOrDigit(a().codePointAt(i));
    }

    private final boolean g(int i) {
        if (f(i)) {
            return i == 0 || !f(i + (-1));
        }
        return false;
    }

    @Override // defpackage.ddr
    public final int[] c(int i) {
        if (a().length() > 0 && i < a().length()) {
            if (i < 0) {
                i = 0;
            }
            while (!f(i) && !g(i)) {
                java.text.BreakIterator breakIterator = this.c;
                if (breakIterator == null) {
                    aooh.j("impl");
                    breakIterator = null;
                }
                i = breakIterator.following(i);
                if (i == -1) {
                }
            }
            java.text.BreakIterator breakIterator2 = this.c;
            if (breakIterator2 == null) {
                aooh.j("impl");
                breakIterator2 = null;
            }
            int iFollowing = breakIterator2.following(i);
            if (iFollowing != -1 && e(iFollowing)) {
                return b(i, iFollowing);
            }
        }
        return null;
    }

    @Override // defpackage.ddr
    public final int[] d(int i) {
        int length = a().length();
        if (length > 0 && i > 0) {
            if (i > length) {
                i = length;
            }
            while (i > 0 && !f(i - 1) && !e(i)) {
                java.text.BreakIterator breakIterator = this.c;
                if (breakIterator == null) {
                    aooh.j("impl");
                    breakIterator = null;
                }
                i = breakIterator.preceding(i);
                if (i == -1) {
                }
            }
            java.text.BreakIterator breakIterator2 = this.c;
            if (breakIterator2 == null) {
                aooh.j("impl");
                breakIterator2 = null;
            }
            int iPreceding = breakIterator2.preceding(i);
            if (iPreceding != -1 && g(iPreceding)) {
                return b(iPreceding, i);
            }
        }
        return null;
    }
}
