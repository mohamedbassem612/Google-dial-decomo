package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gjh implements java.lang.AutoCloseable {
    public final defpackage.gip a;

    public gjh(defpackage.gip gipVar) {
        this.a = gipVar;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00d9  */
    public final defpackage.gin a(java.lang.String str) {
        java.lang.String strSubstring;
        int i;
        int i2;
        if (str == null) {
            defpackage.aooh.i("sql");
        }
        defpackage.gip gipVar = this.a;
        if (!gipVar.m()) {
            fsu.J(21, "connection is closed");
            throw new defpackage.aoiq();
        }
        if (str == null) {
            defpackage.aooh.i("sql");
        }
        java.lang.String string = defpackage.aoov.x(str).toString();
        if (string == null) {
            defpackage.aooh.i("sql");
        }
        int length = string.length() - 2;
        int i3 = -1;
        if (length >= 0) {
            int iM = 0;
            loop0: while (iM < length) {
                char cCharAt = string.charAt(iM);
                if (cCharAt > ' ') {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iM2 = iM + 1;
                            if (string.charAt(iM2) == '*') {
                                do {
                                    iM2 = defpackage.aoov.M(string, '*', iM2 + 1);
                                    if (iM2 < 0) {
                                        break loop0;
                                    }
                                    i2 = iM2 + 1;
                                    if (i2 >= length) {
                                        break;
                                    }
                                } while (string.charAt(i2) != '/');
                                iM = iM2 + 2;
                            }
                        }
                        i3 = iM;
                        break;
                    }
                    if (string.charAt(iM + 1) != '-') {
                        i3 = iM;
                        break;
                    }
                    iM = defpackage.aoov.M(string, '\n', iM + 2);
                    if (iM < 0) {
                        break;
                    }
                }
                iM++;
            }
        }
        defpackage.gji gjiVar = null;
        if (i3 < 0 || i3 > string.length()) {
            strSubstring = null;
        } else {
            strSubstring = string.substring(i3, java.lang.Math.min(i3 + 3, string.length()));
            defpackage.aooh.e(strSubstring, "substring(...)");
        }
        if (strSubstring == null) {
            return new defpackage.gjk(gipVar, str);
        }
        if (defpackage.aoov.s("END", strSubstring, true) || defpackage.aoov.s("COM", strSubstring, true)) {
            i = 1;
        } else if (defpackage.aoov.s("ROL", strSubstring, true)) {
            if (defpackage.aoov.G(string, " TO ", true)) {
                i = 0;
            } else {
                i = 2;
            }
        } else if (!defpackage.aoov.s("BEG", strSubstring, true)) {
            i = 0;
        } else if (defpackage.aoov.G(string, "EXCLUSIVE", true)) {
            i = 3;
        } else {
            i = defpackage.aoov.G(string, "IMMEDIATE", true) ? 4 : 5;
        }
        if (i != 0) {
            return new defpackage.gjn(gipVar, str, i);
        }
        if (defpackage.aoov.s("PRA", strSubstring, true)) {
            java.lang.String lowerCase = string.toLowerCase(java.util.Locale.ROOT);
            defpackage.aooh.e(lowerCase, "toLowerCase(...)");
            if (defpackage.aoov.G(defpackage.aoov.B(lowerCase, "journal_mode", ""), "=", false)) {
                gjiVar = defpackage.gji.a;
            }
        }
        if (gjiVar instanceof defpackage.gji) {
            return new defpackage.gjj(gipVar, str, new defpackage.gjm(gipVar, str));
        }
        return (defpackage.aoov.s("SEL", strSubstring, true) || defpackage.aoov.s("PRA", strSubstring, true) || defpackage.aoov.s("WIT", strSubstring, true)) ? new defpackage.gjm(gipVar, str) : new defpackage.gjk(gipVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
