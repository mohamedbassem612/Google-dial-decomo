package com.bumptech.glide.manager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class LifecycleLifecycle implements defpackage.ydl, emw {
    private final java.util.Set a = new java.util.HashSet();
    private final ems b;

    public LifecycleLifecycle(ems emsVar) {
        this.b = emsVar;
        emsVar.c(this);
    }

    @Override // defpackage.ydl
    public final void a(defpackage.ydm ydmVar) {
        this.a.add(ydmVar);
        ems emsVar = this.b;
        if (emsVar.a() == emq.a) {
            ydmVar.i();
        } else if (emsVar.a().a(emq.d)) {
            ydmVar.j();
        } else {
            ydmVar.k();
        }
    }

    @Override // defpackage.ydl
    public final void b(defpackage.ydm ydmVar) {
        this.a.remove(ydmVar);
    }

    @androidx.lifecycle.OnLifecycleEvent(a = emp.ON_DESTROY)
    public void onDestroy(emx emxVar) {
        java.util.Iterator it = defpackage.ygc.e(this.a).iterator();
        while (it.hasNext()) {
            ((defpackage.ydm) it.next()).i();
        }
        emxVar.P().d(this);
    }

    @androidx.lifecycle.OnLifecycleEvent(a = emp.ON_START)
    public void onStart(emx emxVar) {
        java.util.Iterator it = defpackage.ygc.e(this.a).iterator();
        while (it.hasNext()) {
            ((defpackage.ydm) it.next()).j();
        }
    }

    @androidx.lifecycle.OnLifecycleEvent(a = emp.ON_STOP)
    public void onStop(emx emxVar) {
        java.util.Iterator it = defpackage.ygc.e(this.a).iterator();
        while (it.hasNext()) {
            ((defpackage.ydm) it.next()).k();
        }
    }
}
