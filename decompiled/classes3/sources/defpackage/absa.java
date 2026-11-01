package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class absa extends java.lang.ThreadLocal {
    public static final defpackage.absa a = new defpackage.absa();

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
        int iMyTid = android.os.Process.myTid();
        return new abry(java.lang.Thread.currentThread(), iMyTid, true, android.os.Process.getThreadPriority(iMyTid), true, false);
    }
}
