package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class NetworkQualityRttListener {
    private final java.util.concurrent.Executor mExecutor;

    public NetworkQualityRttListener(java.util.concurrent.Executor executor) {
        if (executor == null) {
            throw new java.lang.IllegalStateException("Executor must not be null");
        }
        this.mExecutor = executor;
    }

    public java.util.concurrent.Executor getExecutor() {
        return this.mExecutor;
    }

    public abstract void onRttObservation(int i, long j, int i2);
}
