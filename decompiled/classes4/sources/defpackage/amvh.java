package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class amvh implements defpackage.amvj {
    static void e(defpackage.amvk amvkVar, java.lang.StringBuilder sb) {
        int iCharAt = (sb.charAt(0) * 1600) + (sb.charAt(1) * '(') + sb.charAt(2) + 1;
        amvkVar.h(new java.lang.String(new char[]{(char) (iCharAt >> 8), (char) (iCharAt & 255)}));
        sb.delete(0, 3);
    }

    private final int f(defpackage.amvk amvkVar, java.lang.StringBuilder sb, java.lang.StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        amvkVar.c--;
        int iB = b(amvkVar.a(), sb2);
        amvkVar.d();
        return iB;
    }

    @Override // defpackage.amvj
    public void a(defpackage.amvk amvkVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (amvkVar.i()) {
            char cA = amvkVar.a();
            amvkVar.c++;
            int iB = b(cA, sb);
            int iB2 = amvkVar.b() + ((sb.length() / 3) << 1);
            amvkVar.f(iB2);
            int i = amvkVar.e.b - iB2;
            if (!amvkVar.i()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                if (sb.length() % 3 == 2 && i != 2) {
                    iB = f(amvkVar, sb, sb2, iB);
                }
                while (sb.length() % 3 == 1 && (iB > 3 || i != 1)) {
                    iB = f(amvkVar, sb, sb2, iB);
                }
                break;
            }
            if (sb.length() % 3 == 0 && anar.H(amvkVar.a, amvkVar.c, c()) != c()) {
                amvkVar.d = 0;
                break;
            }
        }
        d(amvkVar, sb);
    }

    public int b(char c, java.lang.StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) (c - '3'));
            return 1;
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
        } else if (c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
        } else if (c <= '@') {
            sb.append((char) 1);
            sb.append((char) (c - '+'));
        } else if (c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
        } else {
            if (c > 127) {
                sb.append("\u0001\u001e");
                return b((char) (c - 128), sb) + 2;
            }
            sb.append((char) 2);
            sb.append((char) (c - '`'));
        }
        return 2;
    }

    public int c() {
        return 1;
    }

    public void d(defpackage.amvk amvkVar, java.lang.StringBuilder sb) {
        int length = sb.length() / 3;
        int length2 = sb.length() % 3;
        int i = 1;
        int iB = amvkVar.b() + (length << 1);
        amvkVar.f(iB);
        int i2 = amvkVar.e.b - iB;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                e(amvkVar, sb);
            }
            if (amvkVar.i()) {
                amvkVar.g((char) 254);
            }
        } else {
            if (i2 != 1) {
                i = i2;
            } else if (length2 == 1) {
                while (sb.length() >= 3) {
                    e(amvkVar, sb);
                }
                if (amvkVar.i()) {
                    amvkVar.g((char) 254);
                }
                amvkVar.c--;
            }
            if (length2 != 0) {
                throw new java.lang.IllegalStateException("Unexpected case. Please report!");
            }
            while (sb.length() >= 3) {
                e(amvkVar, sb);
            }
            if (i > 0 || amvkVar.i()) {
                amvkVar.g((char) 254);
            }
        }
        amvkVar.d = 0;
    }
}
