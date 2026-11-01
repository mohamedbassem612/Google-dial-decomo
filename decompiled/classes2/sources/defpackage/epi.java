package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class epi extends defpackage.epl {
    public volatile defpackage.eph a;
    public volatile defpackage.eph b;
    private java.util.concurrent.Executor c;

    public epi(android.content.Context context) {
        super(context);
    }

    public abstract java.lang.Object a();

    final void c(defpackage.eph ephVar, java.lang.Object obj) {
        f(obj);
        if (this.b == ephVar) {
            if (this.m) {
                o();
            }
            android.os.SystemClock.uptimeMillis();
            this.b = null;
            e();
        }
    }

    @Override // defpackage.epl
    @java.lang.Deprecated
    public void d(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.g);
        printWriter.print(" mListener=");
        printWriter.println(this.n);
        if (this.i || this.l || this.m) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.i);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.l);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.m);
        }
        if (this.j || this.k) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.j);
            printWriter.print(" mReset=");
            printWriter.println(this.k);
        }
        if (this.a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.a);
            printWriter.print(" waiting=");
            boolean z = this.a.a;
            printWriter.println(false);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.b);
            printWriter.print(" waiting=");
            boolean z2 = this.b.a;
            printWriter.println(false);
        }
    }

    final void e() {
        if (this.b != null || this.a == null) {
            return;
        }
        boolean z = this.a.a;
        if (this.c == null) {
            this.c = android.os.AsyncTask.THREAD_POOL_EXECUTOR;
        }
        defpackage.eph ephVar = this.a;
        java.util.concurrent.Executor executor = this.c;
        if (ephVar.f == 1) {
            ephVar.f = 2;
            executor.execute(ephVar.c);
            return;
        }
        int i = ephVar.f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            throw new java.lang.IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 == 2) {
            throw new java.lang.IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new java.lang.IllegalStateException("We should never reach this state");
    }

    @Override // defpackage.epl
    protected final void g() {
        h();
        this.a = new defpackage.eph(this);
        e();
    }

    @Override // defpackage.epl
    public final void h() {
        if (this.a != null) {
            if (!this.i) {
                o();
            }
            defpackage.eph ephVar = this.b;
            defpackage.eph ephVar2 = this.a;
            if (ephVar != null) {
                boolean z = ephVar2.a;
            } else {
                boolean z2 = ephVar2.a;
                defpackage.eph ephVar3 = this.a;
                ephVar3.d.set(true);
                if (ephVar3.c.cancel(false)) {
                    this.b = this.a;
                    b();
                }
            }
            this.a = null;
        }
    }

    public void b() {
    }

    public void f(java.lang.Object obj) {
    }
}
