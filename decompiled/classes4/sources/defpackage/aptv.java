package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aptv {
    static final java.util.BitSet a = a(58);
    public static final java.util.BitSet b = a(61, 59);
    public static final java.util.BitSet c = a(59);
    public static final defpackage.aptv d = new defpackage.aptv();

    public static java.util.BitSet a(int... iArr) {
        java.util.BitSet bitSet = new java.util.BitSet(iArr.length);
        for (int i : iArr) {
            bitSet.set(i);
        }
        return bitSet;
    }

    public final java.lang.String b(defpackage.aptw aptwVar, defpackage.aptt apttVar, java.util.BitSet bitSet) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (!apttVar.b()) {
                    int iA = aptwVar.a(apttVar.b) & 255;
                    if (bitSet != null && bitSet.get(iA)) {
                        break loop0;
                    }
                    if (aodc.v((char) iA)) {
                        e(aptwVar, apttVar);
                        z = true;
                    } else if (iA == 40) {
                        d(aptwVar, apttVar);
                    }
                } else {
                    break loop0;
                }
            }
            if (sb.length() > 0 && z) {
                sb.append(' ');
            }
            int i = apttVar.b;
            int i2 = apttVar.a;
            int i3 = i;
            while (i < i2) {
                int iA2 = aptwVar.a(i) & 255;
                if (bitSet != null && bitSet.get(iA2)) {
                    break;
                }
                char c2 = (char) iA2;
                if (aodc.v(c2) || iA2 == 40) {
                    break;
                }
                i3++;
                sb.append(c2);
                i++;
            }
            apttVar.a(i3);
        }
        return sb.toString();
    }

    public final defpackage.aptu c(defpackage.aptw aptwVar) throws defpackage.aprn {
        defpackage.aptt apttVar = new defpackage.aptt(0, aptwVar.b);
        java.lang.String strB = b(aptwVar, apttVar, a);
        if (apttVar.b()) {
            throw new defpackage.aprn("Invalid MIME field: no name/value separator found: ".concat(java.lang.String.valueOf(aptwVar.toString())));
        }
        return new defpackage.aptu(aptwVar, apttVar.b, strB);
    }

    public final void d(defpackage.aptw aptwVar, defpackage.aptt apttVar) {
        if (apttVar.b()) {
            return;
        }
        int i = apttVar.b;
        int i2 = apttVar.a;
        if ((aptwVar.a(i) & 255) == 40) {
            int i3 = i + 1;
            int i4 = i3;
            int i5 = 1;
            boolean z = false;
            while (i3 < i2) {
                i4++;
                int iA = aptwVar.a(i3) & 255;
                if (z) {
                    z = false;
                } else if (iA == 92) {
                    z = true;
                } else {
                    if (iA == 40) {
                        i5++;
                    } else if (iA == 41) {
                        i5--;
                    }
                    z = false;
                }
                if (i5 <= 0) {
                    break;
                } else {
                    i3++;
                }
            }
            apttVar.a(i4);
        }
    }

    public final void e(defpackage.aptw aptwVar, defpackage.aptt apttVar) {
        int i = apttVar.b;
        int i2 = i;
        while (i < apttVar.a && aodc.v((char) (aptwVar.a(i) & 255))) {
            i2++;
            i++;
        }
        apttVar.a(i2);
    }
}
