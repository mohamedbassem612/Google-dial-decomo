package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class der extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
        android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        if (looperMyLooper == null) {
            throw new java.lang.IllegalStateException("no Looper on this thread");
        }
        defpackage.det detVar = new defpackage.det(choreographer, ft$.ExternalSyntheticApiModelOutline0.m(looperMyLooper));
        return detVar.plus(detVar.j);
    }
}
