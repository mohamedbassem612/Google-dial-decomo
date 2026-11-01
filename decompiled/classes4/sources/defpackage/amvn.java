package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amvn extends defpackage.amvh {
    @Override // defpackage.amvh
    public final int b(char c, java.lang.StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        }
        if (c >= 'a' && c <= 'z') {
            sb.append((char) (c - 'S'));
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
        } else if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
        } else if (c == '`') {
            sb.append("\u0002\u0000");
        } else if (c <= 'Z') {
            sb.append((char) 2);
            sb.append((char) (c - '@'));
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

    @Override // defpackage.amvh
    public final int c() {
        return 2;
    }
}
