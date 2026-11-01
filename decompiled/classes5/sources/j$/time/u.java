package j$.time;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract /* synthetic */ class u {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[j$.time.temporal.ChronoUnit.values().length];
        b = iArr;
        try {
            iArr[j$.time.temporal.ChronoUnit.MONTHS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            b[j$.time.temporal.ChronoUnit.YEARS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            b[j$.time.temporal.ChronoUnit.DECADES.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            b[j$.time.temporal.ChronoUnit.CENTURIES.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            b[j$.time.temporal.ChronoUnit.MILLENNIA.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            b[j$.time.temporal.ChronoUnit.ERAS.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[j$.time.temporal.a.values().length];
        a = iArr2;
        try {
            iArr2[j$.time.temporal.a.MONTH_OF_YEAR.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            a[j$.time.temporal.a.PROLEPTIC_MONTH.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            a[j$.time.temporal.a.YEAR.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
        try {
            a[j$.time.temporal.a.ERA.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused11) {
        }
    }
}
