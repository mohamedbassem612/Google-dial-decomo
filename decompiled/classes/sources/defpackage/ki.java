package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ki extends android.database.Observable {
    public final void a() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((defpackage.den) this.mObservers.get(size)).ch();
            }
        }
    }

    public final void b(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((defpackage.den) this.mObservers.get(size)).g(i, i2);
            }
        }
    }

    public final void c(int i, int i2, java.lang.Object obj) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((defpackage.den) this.mObservers.get(size)).ci(i, i2, obj);
            }
        }
    }

    public final void d(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((defpackage.den) this.mObservers.get(size)).cj(i, i2);
            }
        }
    }

    public final void e(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((defpackage.den) this.mObservers.get(size)).d(i, i2);
            }
        }
    }

    public final void f() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((defpackage.den) this.mObservers.get(size)).e();
            }
        }
    }

    public final boolean g() {
        return !this.mObservers.isEmpty();
    }
}
