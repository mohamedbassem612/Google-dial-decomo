package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anxn implements defpackage.anoz {
    private final /* synthetic */ int $cid;

    public anxn(int i) {
        this.$cid = i;
    }

    @Override // defpackage.anoz
    public final /* synthetic */ java.lang.Object a(java.lang.String str) {
        if (this.$cid != 0) {
            return str;
        }
        defpackage.ahvr.bN(str.length() > 0, "empty timeout");
        defpackage.ahvr.bN(str.length() <= 9, "bad timeout format");
        long j = java.lang.Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.HOURS.toNanos(j));
        }
        if (cCharAt == 'M') {
            return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MINUTES.toNanos(j));
        }
        if (cCharAt == 'S') {
            return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.SECONDS.toNanos(j));
        }
        if (cCharAt == 'u') {
            return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MICROSECONDS.toNanos(j));
        }
        if (cCharAt == 'm') {
            return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j));
        }
        if (cCharAt == 'n') {
            return java.lang.Long.valueOf(j);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Invalid timeout unit: %s", java.lang.Character.valueOf(cCharAt)));
    }

    @Override // defpackage.anoz
    public final /* synthetic */ java.lang.String b(java.lang.Object obj) {
        if (this.$cid != 0) {
            return (java.lang.String) obj;
        }
        long jMax = java.lang.Math.max(1L, ((java.lang.Long) obj).longValue());
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
        if (jMax < 100000000) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(jMax);
            sb.append('n');
            return sb.toString();
        }
        if (jMax < 100000000000L) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(jMax / 1000);
            sb2.append('u');
            return sb2.toString();
        }
        if (jMax < 100000000000000L) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(jMax / 1000000);
            sb3.append('m');
            return sb3.toString();
        }
        if (jMax < 100000000000000000L) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(jMax / 1000000000);
            sb4.append('S');
            return sb4.toString();
        }
        if (jMax < 6000000000000000000L) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(jMax / 60000000000L);
            sb5.append('M');
            return sb5.toString();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(jMax / 3600000000000L);
        sb6.append('H');
        return sb6.toString();
    }
}
