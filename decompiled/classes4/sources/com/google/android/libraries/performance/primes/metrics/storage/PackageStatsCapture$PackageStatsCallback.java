package com.google.android.libraries.performance.primes.metrics.storage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class PackageStatsCapture$PackageStatsCallback extends android.content.pm.IPackageStatsObserver.Stub {
    private final java.util.concurrent.Semaphore a = new java.util.concurrent.Semaphore(1);
    private volatile android.content.pm.PackageStats b;

    private PackageStatsCapture$PackageStatsCallback() {
    }

    public void onGetStatsCompleted(android.content.pm.PackageStats packageStats, boolean z) {
        if (z) {
            this.b = packageStats;
        } else {
            aenr.a.d().l("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsCallback", "onGetStatsCompleted", 53, "PackageStatsCapture.java").v("Failure getting PackageStats");
        }
        this.a.release();
    }
}
