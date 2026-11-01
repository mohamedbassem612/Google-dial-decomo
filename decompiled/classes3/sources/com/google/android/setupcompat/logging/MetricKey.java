package com.google.android.setupcompat.logging;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class MetricKey implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.acay(15);
    private static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]+");
    private final java.lang.String b;
    private final java.lang.String c;

    static {
        java.util.regex.Pattern.compile("^([a-z][a-z0-9_]+[.])+[A-Z][a-zA-Z0-9_$]+");
        java.util.regex.Pattern.compile("^[a-zA-Z][a-zA-Z0-9_$]+");
    }

    public MetricKey(java.lang.String str, java.lang.String str2) {
        this.b = str;
        this.c = str2;
    }

    public static android.os.Bundle a(com.google.android.setupcompat.logging.MetricKey metricKey) {
        anty.aI(metricKey, "MetricKey cannot be null.");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("MetricKey_version", 1);
        bundle.putString("MetricKey_name", metricKey.b);
        bundle.putString("MetricKey_screenName", metricKey.c);
        return bundle;
    }

    public static com.google.android.setupcompat.logging.MetricKey b(java.lang.String str, android.app.Activity activity) {
        java.lang.String className = activity.getComponentName().getClassName();
        defpackage.agft.a(str, "MetricKey.name", 5, 30);
        afsq.s(a.matcher(str).matches(), "Invalid MetricKey, only alpha numeric characters are allowed.");
        return new com.google.android.setupcompat.logging.MetricKey(str, className);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.setupcompat.logging.MetricKey) {
            com.google.android.setupcompat.logging.MetricKey metricKey = (com.google.android.setupcompat.logging.MetricKey) obj;
            if (anty.H(this.b, metricKey.b) && anty.H(this.c, metricKey.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
