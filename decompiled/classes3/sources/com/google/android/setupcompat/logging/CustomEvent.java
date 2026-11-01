package com.google.android.setupcompat.logging;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class CustomEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.agfu();
    private final long a;
    private final com.google.android.setupcompat.logging.MetricKey b;
    private final android.os.PersistableBundle c;
    private final android.os.PersistableBundle d;

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public CustomEvent(long j, com.google.android.setupcompat.logging.MetricKey metricKey, android.os.PersistableBundle persistableBundle, android.os.PersistableBundle persistableBundle2) {
        afsq.s((boolean) (((j > 0L ? 1 : (j == 0L ? 0 : -1)) ^ (-1)) >>> 31), "Timestamp cannot be negative.");
        anty.aI(metricKey, "MetricKey cannot be null.");
        anty.aI(persistableBundle, "Bundle cannot be null.");
        afsq.s(!persistableBundle.isEmpty(), "Bundle cannot be empty.");
        anty.aI(persistableBundle2, "piiValues cannot be null.");
        for (java.lang.String str : persistableBundle.keySet()) {
            defpackage.agft.a(str, "bundle key", 3, 50);
            java.lang.Object obj = persistableBundle.get(str);
            if (obj instanceof java.lang.String) {
                java.lang.String str2 = (java.lang.String) obj;
                if (str2.length() > 50) {
                    persistableBundle.putString(str, c(str2));
                }
            }
        }
        this.a = j;
        this.b = metricKey;
        this.c = new android.os.PersistableBundle(persistableBundle);
        this.d = new android.os.PersistableBundle(persistableBundle2);
    }

    public static android.os.Bundle a(com.google.android.setupcompat.logging.CustomEvent customEvent) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("CustomEvent_version", 1);
        bundle.putLong("CustomEvent_timestamp", customEvent.a);
        bundle.putBundle("CustomEvent_metricKey", com.google.android.setupcompat.logging.MetricKey.a(customEvent.b));
        bundle.putBundle("CustomEvent_bundleValues", defpackage.agfn.a(new android.os.PersistableBundle(customEvent.c)));
        bundle.putBundle("CustomEvent_pii_bundleValues", defpackage.agfn.a(customEvent.d));
        return bundle;
    }

    public static com.google.android.setupcompat.logging.CustomEvent b(com.google.android.setupcompat.logging.MetricKey metricKey, android.os.PersistableBundle persistableBundle) {
        android.os.PersistableBundle persistableBundle2 = android.os.PersistableBundle.EMPTY;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
        long jNanoTime = java.lang.System.nanoTime() / 1000000;
        defpackage.agfn.d(persistableBundle);
        defpackage.agfn.d(persistableBundle2);
        return new com.google.android.setupcompat.logging.CustomEvent(jNanoTime, metricKey, persistableBundle, persistableBundle2);
    }

    public static java.lang.String c(java.lang.String str) {
        return str.length() > 50 ? "truncated.".concat(java.lang.String.valueOf(str.substring(str.length() - 40))) : str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.setupcompat.logging.CustomEvent) {
            com.google.android.setupcompat.logging.CustomEvent customEvent = (com.google.android.setupcompat.logging.CustomEvent) obj;
            if (this.a == customEvent.a && anty.H(this.b, customEvent.b) && defpackage.agfn.c(this.c, customEvent.c) && defpackage.agfn.c(this.d, customEvent.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writePersistableBundle(this.c);
        parcel.writePersistableBundle(this.d);
    }
}
