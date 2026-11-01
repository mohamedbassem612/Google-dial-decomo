package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
@java.lang.Deprecated
public final class lpb {
    public static final void a() {
        defpackage.ahvr.bZ(!android.os.Looper.getMainLooper().equals(android.os.Looper.myLooper()), "background thread expected");
    }

    public static final void b() {
        defpackage.ahvr.cc("Audio-HighPriority-Serial".equals(java.lang.Thread.currentThread().getName()), "thread %s expected", "Audio-HighPriority-Serial");
    }
}
