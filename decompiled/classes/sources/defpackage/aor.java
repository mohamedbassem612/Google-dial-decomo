package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aor extends defpackage.dap implements defpackage.dat {
    private final defpackage.amn a;
    private final defpackage.ang b;
    private android.graphics.RenderNode c;

    public aor(defpackage.dao daoVar, defpackage.amn amnVar, defpackage.ang angVar) {
        this.a = amnVar;
        this.b = angVar;
        V(daoVar);
    }

    private final android.graphics.RenderNode b() {
        android.graphics.RenderNode renderNode = this.c;
        if (renderNode != null) {
            return renderNode;
        }
        android.graphics.RenderNode renderNode2 = new android.graphics.RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.c = renderNode2;
        return renderNode2;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x01b7 A[PHI: r17
      0x01b7: PHI (r17v2 boolean) = (r17v1 boolean), (r17v11 boolean) binds: [B:77:0x0184, B:84:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.dat
    public final void o(defpackage.dbm dbmVar) {
        long j;
        boolean zDraw;
        char c;
        defpackage.amn amnVar = this.a;
        amnVar.i(dbmVar.o());
        defpackage.cqf cqfVarB = dbmVar.q().b();
        android.graphics.Canvas canvas = defpackage.cpr.a;
        if (cqfVarB == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        }
        android.graphics.Canvas canvas2 = ((defpackage.cpq) cqfVarB).a;
        amnVar.c.a();
        if (defpackage.cpp.d(dbmVar.o())) {
            dbmVar.D();
            return;
        }
        if (!canvas2.isHardwareAccelerated()) {
            defpackage.ang angVar = this.b;
            android.widget.EdgeEffect edgeEffect = angVar.b;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            android.widget.EdgeEffect edgeEffect2 = angVar.c;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            android.widget.EdgeEffect edgeEffect3 = angVar.d;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            android.widget.EdgeEffect edgeEffect4 = angVar.e;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            android.widget.EdgeEffect edgeEffect5 = angVar.f;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            android.widget.EdgeEffect edgeEffect6 = angVar.g;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            android.widget.EdgeEffect edgeEffect7 = angVar.h;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            android.widget.EdgeEffect edgeEffect8 = angVar.i;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            dbmVar.D();
            return;
        }
        int iDp = dbmVar.dp(30.0f);
        defpackage.ang angVar2 = this.b;
        boolean z = angVar2.r() || angVar2.s() || angVar2.i() || angVar2.j();
        boolean z2 = angVar2.l() || angVar2.m() || angVar2.o() || angVar2.p();
        if (z) {
            if (z2) {
                da$.ExternalSyntheticApiModelOutline0.m(b(), 0, 0, canvas2.getWidth(), canvas2.getHeight());
            } else {
                da$.ExternalSyntheticApiModelOutline0.m(b(), 0, 0, canvas2.getWidth() + (iDp << 1), canvas2.getHeight());
            }
        } else {
            if (!z2) {
                dbmVar.D();
                return;
            }
            da$.ExternalSyntheticApiModelOutline0.m(b(), 0, 0, canvas2.getWidth(), canvas2.getHeight() + (iDp << 1));
        }
        android.graphics.RecordingCanvas recordingCanvasM = da$.ExternalSyntheticApiModelOutline0.m(b());
        if (angVar2.m()) {
            android.widget.EdgeEffect edgeEffectD = angVar2.d();
            int iSave = recordingCanvasM.save();
            recordingCanvasM.rotate(90.0f);
            edgeEffectD.draw(recordingCanvasM);
            recordingCanvasM.restoreToCount(iSave);
            edgeEffectD.finish();
        }
        if (angVar2.l()) {
            android.widget.EdgeEffect edgeEffectC = angVar2.c();
            int iSave2 = recordingCanvasM.save();
            recordingCanvasM.rotate(270.0f);
            zDraw = edgeEffectC.draw(recordingCanvasM);
            recordingCanvasM.restoreToCount(iSave2);
            if (angVar2.n()) {
                j = 4294967295L;
                zb.c(angVar2.d(), zb.a(edgeEffectC), 1.0f - java.lang.Float.intBitsToFloat((int) (amnVar.e() & 4294967295L)));
            } else {
                j = 4294967295L;
            }
        } else {
            j = 4294967295L;
            zDraw = false;
        }
        if (angVar2.s()) {
            android.widget.EdgeEffect edgeEffectH = angVar2.h();
            int iSave3 = recordingCanvasM.save();
            recordingCanvasM.rotate(180.0f);
            edgeEffectH.draw(recordingCanvasM);
            recordingCanvasM.restoreToCount(iSave3);
            edgeEffectH.finish();
        }
        if (angVar2.r()) {
            android.widget.EdgeEffect edgeEffectG = angVar2.g();
            zDraw = edgeEffectG.draw(recordingCanvasM) || zDraw;
            if (angVar2.t()) {
                c = ' ';
                zb.c(angVar2.h(), zb.a(edgeEffectG), java.lang.Float.intBitsToFloat((int) (amnVar.e() >> 32)));
            } else {
                c = ' ';
            }
        } else {
            c = ' ';
        }
        if (angVar2.p()) {
            android.widget.EdgeEffect edgeEffectF = angVar2.f();
            int iSave4 = recordingCanvasM.save();
            recordingCanvasM.rotate(270.0f);
            edgeEffectF.draw(recordingCanvasM);
            recordingCanvasM.restoreToCount(iSave4);
            edgeEffectF.finish();
        }
        if (angVar2.o()) {
            android.widget.EdgeEffect edgeEffectE = angVar2.e();
            int iSave5 = recordingCanvasM.save();
            recordingCanvasM.rotate(90.0f);
            boolean zDraw2 = edgeEffectE.draw(recordingCanvasM);
            recordingCanvasM.restoreToCount(iSave5);
            zDraw = zDraw2 || zDraw;
            if (angVar2.q()) {
                zb.c(angVar2.f(), zb.a(edgeEffectE), java.lang.Float.intBitsToFloat((int) (amnVar.e() & j)));
            }
        }
        if (angVar2.j()) {
            android.widget.EdgeEffect edgeEffectB = angVar2.b();
            edgeEffectB.draw(recordingCanvasM);
            edgeEffectB.finish();
        }
        if (angVar2.i()) {
            android.widget.EdgeEffect edgeEffectA = angVar2.a();
            int iSave6 = recordingCanvasM.save();
            recordingCanvasM.rotate(180.0f);
            boolean zDraw3 = edgeEffectA.draw(recordingCanvasM);
            recordingCanvasM.restoreToCount(iSave6);
            boolean z3 = zDraw3 || zDraw;
            if (angVar2.k()) {
                zb.c(angVar2.b(), zb.a(edgeEffectA), 1.0f - java.lang.Float.intBitsToFloat((int) (amnVar.e() >> c)));
            }
            zDraw = z3;
        }
        if (zDraw) {
            amnVar.h();
        }
        float f = z2 ? 0.0f : iDp;
        float f2 = z ? 0.0f : iDp;
        defpackage.dpq dpqVarP = dbmVar.p();
        defpackage.cpq cpqVar = new defpackage.cpq();
        cpqVar.a = recordingCanvasM;
        long jO = dbmVar.o();
        defpackage.dpf dpfVarC = dbmVar.q().c();
        defpackage.dpq dpqVarD = dbmVar.q().d();
        defpackage.cqf cqfVarB2 = dbmVar.q().b();
        long jA = dbmVar.q().a();
        defpackage.cso csoVar = dbmVar.q().a;
        defpackage.csg csgVarQ = dbmVar.q();
        csgVarQ.f(dbmVar);
        csgVarQ.g(dpqVarP);
        csgVarQ.e(cpqVar);
        csgVarQ.h(jO);
        csgVarQ.a = null;
        cpqVar.g();
        try {
            dbmVar.q().c.r(f, f2);
            try {
                dbmVar.D();
                float f3 = -f2;
                float f4 = -f;
                dbmVar.q().c.r(f4, f3);
                cpqVar.e();
                defpackage.csg csgVarQ2 = dbmVar.q();
                csgVarQ2.f(dpfVarC);
                csgVarQ2.g(dpqVarD);
                csgVarQ2.e(cqfVarB2);
                csgVarQ2.h(jA);
                csgVarQ2.a = csoVar;
                da$.ExternalSyntheticApiModelOutline0.m(b());
                int iSave7 = canvas2.save();
                canvas2.translate(f4, f3);
                da$.ExternalSyntheticApiModelOutline0.m(canvas2, b());
                canvas2.restoreToCount(iSave7);
            } catch (java.lang.Throwable th) {
                dbmVar.q().c.r(-f, -f2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            cpqVar.e();
            defpackage.csg csgVarQ3 = dbmVar.q();
            csgVarQ3.f(dpfVarC);
            csgVarQ3.g(dpqVarD);
            csgVarQ3.e(cqfVarB2);
            csgVarQ3.h(jA);
            csgVarQ3.a = csoVar;
            throw th2;
        }
    }

    @Override // defpackage.dat
    public final /* synthetic */ void m() {
    }
}
