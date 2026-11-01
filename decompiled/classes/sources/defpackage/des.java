package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class des implements android.view.Choreographer.FrameCallback, java.lang.Runnable {
    final /* synthetic */ defpackage.det a;

    public des(defpackage.det detVar) {
        this.a = detVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        defpackage.det detVar = this.a;
        detVar.d.removeCallbacks(this);
        detVar.b();
        synchronized (detVar.e) {
            if (detVar.h) {
                detVar.h = false;
                java.util.List list = detVar.f;
                detVar.f = detVar.g;
                detVar.g = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((android.view.Choreographer.FrameCallback) list.get(i)).doFrame(j);
                }
                list.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.det detVar = this.a;
        detVar.b();
        synchronized (detVar.e) {
            if (detVar.f.isEmpty()) {
                detVar.c.removeFrameCallback(this);
                detVar.h = false;
            }
        }
    }
}
