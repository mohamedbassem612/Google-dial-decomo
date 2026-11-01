package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dhk implements android.view.ScrollCaptureCallback {
    public static final /* synthetic */ int d = 0;
    public final dij a;
    public final defpackage.dho b;
    public final ipc c;
    private final dpo e;
    private final android.view.View f;
    private final aoss g;

    public dhk(dij dijVar, dpo dpoVar, aoss aossVar, ipc ipcVar, android.view.View view) {
        this.a = dijVar;
        this.e = dpoVar;
        this.c = ipcVar;
        this.f = view;
        this.g = aosv.p(aossVar, dhm.b);
        this.b = new defpackage.dho(dpoVar.a(), new defpackage.dhj(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.ScrollCaptureSession, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    public final java.lang.Object a(android.view.ScrollCaptureSession scrollCaptureSession, dpo dpoVar, aoln aolnVar) {
        defpackage.dhi dhiVar;
        int i;
        int i2;
        ?? r0;
        dpo dpoVar2;
        int i3;
        int i4;
        int iA;
        int iA2;
        dpo dpoVar3;
        android.graphics.Canvas canvasLockHardwareCanvas;
        if (aolnVar instanceof defpackage.dhi) {
            dhiVar = (defpackage.dhi) aolnVar;
            int i5 = dhiVar.f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dhiVar.f = i5 - Integer.MIN_VALUE;
            } else {
                dhiVar = new defpackage.dhi(this, aolnVar);
            }
        } else {
            dhiVar = new defpackage.dhi(this, aolnVar);
        }
        java.lang.Object obj = dhiVar.d;
        aolu aoluVar = aolu.a;
        int i6 = dhiVar.f;
        if (i6 != 0) {
            if (i6 == 1) {
                int i7 = dhiVar.c;
                int i8 = dhiVar.b;
                dpo dpoVar4 = dhiVar.g;
                java.lang.Object obj2 = dhiVar.a;
                aooc.af(obj);
                i = i8;
                dpoVar = dpoVar4;
                i2 = i7;
                scrollCaptureSession = obj2;
            } else {
                if (i6 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i4 = dhiVar.c;
                i3 = dhiVar.b;
                dpoVar2 = dhiVar.g;
                java.lang.Object obj3 = dhiVar.a;
                aooc.af(obj);
                r0 = obj3;
            }
            defpackage.dho dhoVar = this.b;
            iA = dhoVar.a(i3);
            iA2 = dhoVar.a(i4);
            dpoVar3 = new dpo(dpoVar2.b, iA, dpoVar2.d, iA2);
            if (iA == iA2) {
                return dpo.a;
            }
            canvasLockHardwareCanvas = ac$.ExternalSyntheticApiModelOutline0.m(ac$.ExternalSyntheticApiModelOutline0.m((java.lang.Object) r0)).lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.save();
                canvasLockHardwareCanvas.translate(-dpoVar3.b, -dpoVar3.c);
                dpo dpoVar5 = this.e;
                canvasLockHardwareCanvas.translate(-dpoVar5.b, -dpoVar5.c);
                this.f.getRootView().draw(canvasLockHardwareCanvas);
                int i9 = aopc.i(this.b.b);
                return new dpo(dpoVar3.b, dpoVar3.c + i9, dpoVar3.d, dpoVar3.e + i9);
            } finally {
                ac$.ExternalSyntheticApiModelOutline0.m(ac$.ExternalSyntheticApiModelOutline0.m((java.lang.Object) r0)).unlockCanvasAndPost(canvasLockHardwareCanvas);
            }
        }
        aooc.af(obj);
        i = dpoVar.c;
        i2 = dpoVar.e;
        defpackage.dho dhoVar2 = this.b;
        dhiVar.a = scrollCaptureSession;
        dhiVar.g = dpoVar;
        dhiVar.b = i;
        dhiVar.c = i2;
        dhiVar.f = 1;
        if (i > i2) {
            throw new java.lang.IllegalArgumentException(a.bf(i2, i, "Expected min=", " ≤ max="));
        }
        int i10 = dhoVar2.a;
        int i11 = i2 - i;
        if (i11 > i10) {
            throw new java.lang.IllegalArgumentException("Expected range (" + i11 + ") to be ≤ viewportSize=" + dhoVar2.a);
        }
        java.lang.Object objC = dhoVar2.c(((i11 / 2) + i) - (i10 / 2), dhiVar);
        if (objC != aoluVar) {
            objC = aojh.a;
        }
        if (objC == aoluVar) {
            return aoluVar;
        }
        defpackage.bxb bxbVar = new defpackage.bxb(15);
        dhiVar.a = scrollCaptureSession;
        dhiVar.g = dpoVar;
        dhiVar.b = i;
        dhiVar.c = i2;
        dhiVar.f = 2;
        if (cdh.f(bxbVar, dhiVar) == aoluVar) {
            return aoluVar;
        }
        r0 = scrollCaptureSession;
        dpoVar2 = dpoVar;
        i3 = i;
        i4 = i2;
        defpackage.dho dhoVar3 = this.b;
        iA = dhoVar3.a(i3);
        iA2 = dhoVar3.a(i4);
        dpoVar3 = new dpo(dpoVar2.b, iA, dpoVar2.d, iA2);
        if (iA == iA2) {
            return dpo.a;
        }
        canvasLockHardwareCanvas = ac$.ExternalSyntheticApiModelOutline0.m(ac$.ExternalSyntheticApiModelOutline0.m((java.lang.Object) r0)).lockHardwareCanvas();
        canvasLockHardwareCanvas.save();
        canvasLockHardwareCanvas.translate(-dpoVar3.b, -dpoVar3.c);
        dpo dpoVar6 = this.e;
        canvasLockHardwareCanvas.translate(-dpoVar6.b, -dpoVar6.c);
        this.f.getRootView().draw(canvasLockHardwareCanvas);
        int i12 = aopc.i(this.b.b);
        return new dpo(dpoVar3.b, dpoVar3.c + i12, dpoVar3.d, dpoVar3.e + i12);
    }

    public final void onScrollCaptureEnd(java.lang.Runnable runnable) {
        aoov.an(this.g, aour.a, 0, new bnl(this, runnable, (aoln) null, 11), 2);
    }

    public final void onScrollCaptureImageRequest(android.view.ScrollCaptureSession scrollCaptureSession, android.os.CancellationSignal cancellationSignal, android.graphics.Rect rect, java.util.function.Consumer consumer) {
        final aoub aoubVarAn = aoov.an(this.g, (aolr) null, 0, new defpackage.dhh(this, scrollCaptureSession, rect, consumer, null), 3);
        aoubVarAn.p(new dih(cancellationSignal, 1));
        cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: dhl
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                aoubVarAn.s((java.util.concurrent.CancellationException) null);
            }
        });
    }

    public final void onScrollCaptureSearch(android.os.CancellationSignal cancellationSignal, java.util.function.Consumer consumer) {
        aa$.ExternalSyntheticApiModelOutline1.m(consumer, cfd.A(this.e));
    }

    public final void onScrollCaptureStart(android.view.ScrollCaptureSession scrollCaptureSession, android.os.CancellationSignal cancellationSignal, java.lang.Runnable runnable) {
        this.b.b = 0.0f;
        this.c.af(true);
        runnable.run();
    }
}
