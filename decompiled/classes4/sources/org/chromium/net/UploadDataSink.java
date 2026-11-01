package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class UploadDataSink {
    public abstract void onReadError(java.lang.Exception exc);

    public abstract void onReadSucceeded(boolean z);

    public abstract void onRewindError(java.lang.Exception exc);

    public abstract void onRewindSucceeded();
}
