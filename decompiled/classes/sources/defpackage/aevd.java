package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aevd {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public aevd(android.content.Context context) {
        this.b = new java.util.HashSet();
        this.a = context;
    }

    public static void a(java.io.File file, long j) {
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            long j2 = j - 172800;
            for (java.io.File file2 : fileArrListFiles) {
                java.lang.String name = file2.getName();
                int iIndexOf = name.indexOf(95);
                if (iIndexOf == -1) {
                    b(file2);
                } else {
                    try {
                        if (java.lang.Long.parseLong(name.substring(iIndexOf + 1)) < j2) {
                            if (file2.delete()) {
                                file2.getName();
                            } else {
                                ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "cleanupOldFlightRecords", 111, "FlightRecordWriterImpl.java")).y("Failed to delete old flight record: %s", file2.getName());
                            }
                        }
                    } catch (java.lang.NumberFormatException unused) {
                        b(file2);
                    }
                }
            }
        }
    }

    private static void b(java.io.File file) {
        if (file.delete()) {
            file.getName();
        } else {
            ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "deleteMalformedFile", 125, "FlightRecordWriterImpl.java")).y("Failed to delete malformed flight record: %s", file.getName());
        }
    }

    public aevd(android.content.Context context, defpackage.aoin aoinVar) {
        this.a = context;
        this.b = aoinVar;
    }

    public aevd(defpackage.adao adaoVar, defpackage.amwu amwuVar) {
        this.a = adaoVar;
        this.b = amwuVar;
    }
}
