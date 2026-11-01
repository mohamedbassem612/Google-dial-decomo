package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eug implements defpackage.etc {
    @Override // defpackage.etc
    public final long a() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // defpackage.etc
    public final defpackage.etk b(android.os.Looper looper, android.os.Handler.Callback callback) {
        return new defpackage.euh(new android.os.Handler(looper, callback));
    }
}
