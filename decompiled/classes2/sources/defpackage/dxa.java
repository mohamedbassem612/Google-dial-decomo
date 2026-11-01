package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@java.lang.Deprecated
public final class dxa {
    public boolean a;
    public boolean b;
    public jxt c;

    public final void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.b = true;
            jxt jxtVar = this.c;
            if (jxtVar != null) {
                try {
                    jxtVar.a();
                } catch (java.lang.Throwable th) {
                    synchronized (this) {
                        this.b = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.b = false;
                notifyAll();
            }
        }
    }
}
