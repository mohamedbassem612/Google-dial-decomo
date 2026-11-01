package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaoe {
    public static final java.lang.StringBuilder a;

    static {
        new java.text.SimpleDateFormat("MM-dd HH:mm:ss.SSS", java.util.Locale.ROOT);
        new java.text.SimpleDateFormat("MM-dd HH:mm:ss", java.util.Locale.ROOT);
        a = new java.lang.StringBuilder(33);
    }

    public static void a(long j, java.lang.StringBuilder sb) {
        if (j == 0) {
            sb.append("0s");
            return;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z = false;
        if (j < 0) {
            sb.append('-');
            if (j != Long.MIN_VALUE) {
                j = -j;
            } else {
                z = true;
                j = Long.MAX_VALUE;
            }
        }
        if (j >= 86400000) {
            sb.append(j / 86400000);
            sb.append('d');
            j %= 86400000;
        }
        if (z) {
            j++;
        }
        if (j >= 3600000) {
            sb.append(j / 3600000);
            sb.append('h');
            j %= 3600000;
        }
        if (j >= 60000) {
            sb.append(j / 60000);
            sb.append('m');
            j %= 60000;
        }
        if (j >= 1000) {
            sb.append(j / 1000);
            sb.append('s');
            j %= 1000;
        }
        if (j > 0) {
            sb.append(j);
            sb.append("ms");
        }
    }
}
