package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aoky {
    public final defpackage.aola a;
    public int b;
    public int c = -1;
    private int d;

    public aoky(defpackage.aola aolaVar) {
        this.a = aolaVar;
        this.d = aolaVar.f;
        b();
    }

    public final void a() {
        if (this.a.f != this.d) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final void b() {
        while (true) {
            int i = this.b;
            defpackage.aola aolaVar = this.a;
            if (i >= aolaVar.e || aolaVar.d[i] >= 0) {
                return;
            } else {
                this.b = i + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.b < this.a.e;
    }

    public final void remove() {
        a();
        if (this.c == -1) {
            throw new java.lang.IllegalStateException("Call next() before removing element from the iterator.");
        }
        defpackage.aola aolaVar = this.a;
        aolaVar.f();
        aolaVar.g(this.c);
        this.c = -1;
        this.d = aolaVar.f;
    }
}
