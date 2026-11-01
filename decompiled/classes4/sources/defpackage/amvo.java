package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amvo extends defpackage.amvh {
    @Override // defpackage.amvh, defpackage.amvj
    public final void a(defpackage.amvk amvkVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (amvkVar.i()) {
            char cA = amvkVar.a();
            amvkVar.c++;
            b(cA, sb);
            if (sb.length() % 3 == 0) {
                e(amvkVar, sb);
                if (anar.H(amvkVar.a, amvkVar.c, 3) != 3) {
                    amvkVar.d = 0;
                    break;
                }
            }
        }
        d(amvkVar, sb);
    }

    @Override // defpackage.amvh
    public final int b(char c, java.lang.StringBuilder sb) {
        if (c == '\r') {
            sb.append((char) 0);
        } else if (c == ' ') {
            sb.append((char) 3);
        } else if (c == '*') {
            sb.append((char) 1);
        } else if (c == '>') {
            sb.append((char) 2);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
        } else if (c < 'A' || c > 'Z') {
            anar.I(c);
        } else {
            sb.append((char) (c - '3'));
        }
        return 1;
    }

    @Override // defpackage.amvh
    public final int c() {
        return 3;
    }

    @Override // defpackage.amvh
    public final void d(defpackage.amvk amvkVar, java.lang.StringBuilder sb) {
        amvkVar.e();
        int iB = amvkVar.e.b - amvkVar.b();
        amvkVar.c -= sb.length();
        if (amvkVar.c() > 1 || iB > 1 || amvkVar.c() != iB) {
            amvkVar.g((char) 254);
        }
        if (amvkVar.d < 0) {
            amvkVar.d = 0;
        }
    }
}
