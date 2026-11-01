package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class anm extends dap implements dat {
    private final amn a;
    private final ang b;
    private final ayy c;

    public anm(dao daoVar, amn amnVar, ang angVar, ayy ayyVar) {
        this.a = amnVar;
        this.b = angVar;
        this.c = ayyVar;
        V(daoVar);
    }

    private static final boolean b(float f, long j, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & j)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final void o(dbm dbmVar) {
        boolean zB;
        amn amnVar = this.a;
        amnVar.i(dbmVar.o());
        if (cpp.d(dbmVar.o())) {
            dbmVar.D();
            return;
        }
        dbmVar.D();
        amnVar.c.a();
        android.graphics.Canvas canvasA = cpr.a(dbmVar.q().b());
        ang angVar = this.b;
        if (angVar.l()) {
            zB = b(270.0f, (((long) java.lang.Float.floatToRawIntBits(-java.lang.Float.intBitsToFloat((int) (dbmVar.o() & 4294967295L)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(dbmVar.dl(this.c.b(dbmVar.p())))) & 4294967295L), angVar.c(), canvasA);
        } else {
            zB = false;
        }
        if (angVar.r()) {
            zB = b(0.0f, ((long) java.lang.Float.floatToRawIntBits(dbmVar.dl(this.c.a))) & 4294967295L, angVar.g(), canvasA) || zB;
        }
        if (angVar.o()) {
            zB = b(90.0f, ((long) java.lang.Float.floatToRawIntBits((-((float) aopc.i(java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> 32))))) + dbmVar.dl(this.c.c(dbmVar.p())))) & 4294967295L, angVar.e(), canvasA) || zB;
        }
        if (angVar.i()) {
            android.widget.EdgeEffect edgeEffectA = angVar.a();
            zB = b(180.0f, (((long) java.lang.Float.floatToRawIntBits(-java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits((-java.lang.Float.intBitsToFloat((int) (dbmVar.o() & 4294967295L))) + dbmVar.dl(this.c.b))) & 4294967295L), edgeEffectA, canvasA) || zB;
        }
        if (zB) {
            amnVar.h();
        }
    }

    public final /* synthetic */ void m() {
    }
}
