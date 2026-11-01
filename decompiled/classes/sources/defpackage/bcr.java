package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bcr implements android.view.View.OnAttachStateChangeListener, java.lang.Runnable, android.view.Choreographer.FrameCallback, defpackage.bfb {
    public static long a;
    private final android.view.View c;
    private boolean d;
    private boolean g;
    private long h;
    private long i;
    public final java.util.PriorityQueue b = new java.util.PriorityQueue(11, new defpackage.beg(1));
    private final android.view.Choreographer e = android.view.Choreographer.getInstance();
    private final defpackage.bcq f = new defpackage.bcq();

    public bcr(android.view.View view) {
        this.c = view;
        if (a == 0) {
            android.view.Display display = view.getDisplay();
            float f = 60.0f;
            if (!view.isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            a = (long) (1.0E9f / f);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    private final boolean d() {
        java.util.PriorityQueue priorityQueue = this.b;
        java.lang.Object objPeek = priorityQueue.peek();
        if (objPeek == null) {
            defpackage.aooh.g();
        }
        boolean zG = ((bfa) ((amwp) objPeek).b).g(this.f);
        if (!zG) {
            priorityQueue.poll();
        }
        return zG;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c.post(this);
    }

    @Override // defpackage.bfb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void c(bfa bfaVar) {
        this.b.add(new amwp(1, bfaVar, (byte[]) null));
        a();
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.g) {
            this.h = j;
            this.c.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.g = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.g = false;
        this.c.removeCallbacks(this);
        this.e.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean zD;
        java.util.PriorityQueue priorityQueue = this.b;
        if (!priorityQueue.isEmpty() && this.d && this.g) {
            android.view.View view = this.c;
            if (view.getWindowVisibility() == 0) {
                long jMax = java.lang.Math.max(this.h, java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime()));
                boolean z3 = true;
                if (java.lang.System.nanoTime() - jMax <= (a << 1)) {
                    z = false;
                    z2 = false;
                } else if (this.i == jMax) {
                    jMax = java.lang.System.nanoTime();
                    z2 = false;
                    z = true;
                } else {
                    this.i = jMax;
                    view.post(this);
                    z = false;
                    z2 = true;
                }
                defpackage.bcq bcqVar = this.f;
                bcqVar.a = jMax + a;
                while (true) {
                    if (!priorityQueue.isEmpty()) {
                        long jA = bcqVar.a();
                        if (jA <= 0) {
                            break;
                        }
                        da$.ExternalSyntheticApiModelOutline0.m("compose:lazy:prefetch:available_time_nanos", jA);
                        if (z) {
                            android.os.Trace.beginSection("compose:lazy:prefetch:idle_frame");
                            try {
                                zD = d();
                                android.os.Trace.endSection();
                            } catch (java.lang.Throwable th) {
                                android.os.Trace.endSection();
                                throw th;
                            }
                        } else {
                            zD = d();
                        }
                        if (zD) {
                            break;
                        } else {
                            z = false;
                        }
                    } else {
                        z3 = false;
                        break;
                    }
                }
                if (z2) {
                    return;
                }
                if (z3) {
                    this.e.postFrameCallback(this);
                    return;
                } else {
                    this.d = false;
                    return;
                }
            }
        }
        this.d = false;
    }
}
