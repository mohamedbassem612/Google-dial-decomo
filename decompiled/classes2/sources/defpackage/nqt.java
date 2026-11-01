package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class nqt implements afig {
    public final java.lang.Object a(adag adagVar) {
        aimz aimzVar = nri.a;
        adag adagVar2 = new adag((byte[]) null);
        adagVar2.n(nri.d);
        adag adagVarB = adagVar2.B();
        aift aiftVar = new aift(4);
        android.database.Cursor cursorY = adagVar.y(adagVarB);
        while (cursorY.moveToNext()) {
            try {
                aooh.c(cursorY);
                defpackage.nsp nspVarAl = gus.al(cursorY);
                if (nspVarAl != null) {
                    aiftVar.i(nspVarAl);
                }
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak(cursorY, th);
                    throw th2;
                }
            }
        }
        ajsz.ak(cursorY, (java.lang.Throwable) null);
        aify aifyVarH = aiftVar.h();
        aooh.e(aifyVarH, "build(...)");
        return aifyVarH;
    }
}
