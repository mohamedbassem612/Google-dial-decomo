package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agzb extends java.lang.RuntimeException {
    public agzb(java.lang.Throwable th) {
        super("A LocalSubscriptionCallbacks didn't handle an error. It must either catch the error and pass it as part of onLoaded(), or register an error handler in onLoadError().", th);
    }
}
