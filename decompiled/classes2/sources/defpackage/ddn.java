package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ddn extends defpackage.ddm {
    public static defpackage.ddn b;
    public final java.text.BreakIterator c;

    public ddn(java.util.Locale locale) {
        this.c = java.text.BreakIterator.getCharacterInstance(locale);
    }

    @Override // defpackage.ddr
    public final int[] c(int i) {
        java.text.BreakIterator breakIterator;
        int length = a().length();
        if (length > 0 && i < length) {
            if (i < 0) {
                i = 0;
            }
            do {
                java.text.BreakIterator breakIterator2 = this.c;
                if (breakIterator2 == null) {
                    aooh.j("impl");
                    breakIterator = null;
                } else {
                    breakIterator = breakIterator2;
                }
                if (breakIterator.isBoundary(i)) {
                    if (breakIterator2 == null) {
                        aooh.j("impl");
                        breakIterator2 = null;
                    }
                    int iFollowing = breakIterator2.following(i);
                    if (iFollowing == -1) {
                        break;
                    }
                    return b(i, iFollowing);
                }
                if (breakIterator2 == null) {
                    aooh.j("impl");
                    breakIterator2 = null;
                }
                i = breakIterator2.following(i);
            } while (i != -1);
        }
        return null;
    }

    @Override // defpackage.ddr
    public final int[] d(int i) {
        java.text.BreakIterator breakIterator;
        int length = a().length();
        if (length > 0 && i > 0) {
            if (i > length) {
                i = length;
            }
            do {
                java.text.BreakIterator breakIterator2 = this.c;
                if (breakIterator2 == null) {
                    aooh.j("impl");
                    breakIterator = null;
                } else {
                    breakIterator = breakIterator2;
                }
                if (breakIterator.isBoundary(i)) {
                    if (breakIterator2 == null) {
                        aooh.j("impl");
                        breakIterator2 = null;
                    }
                    int iPreceding = breakIterator2.preceding(i);
                    if (iPreceding == -1) {
                        break;
                    }
                    return b(iPreceding, i);
                }
                if (breakIterator2 == null) {
                    aooh.j("impl");
                    breakIterator2 = null;
                }
                i = breakIterator2.preceding(i);
            } while (i != -1);
        }
        return null;
    }
}
