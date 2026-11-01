package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class afan implements defpackage.afah {
    public final /* synthetic */ java.util.Map a;
    public final /* synthetic */ java.util.Map b;
    public final /* synthetic */ defpackage.adag c;

    public /* synthetic */ afan(defpackage.adag adagVar, java.util.Map map, java.util.Map map2) {
        this.c = adagVar;
        this.a = map;
        this.b = map2;
    }

    @Override // defpackage.afah
    public final void a() {
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1259, "Startup Listeners", defpackage.ahot.a, true);
        try {
            boolean zR = this.c.r();
            java.util.Map map = this.a;
            if (zR) {
                double dRandom = java.lang.Math.random();
                java.util.Map map2 = this.b;
                if (dRandom < 0.5d) {
                    defpackage.agab.an(map);
                    defpackage.agab.an(map2);
                } else {
                    defpackage.agab.an(map2);
                    defpackage.agab.an(map);
                }
            } else {
                defpackage.agab.an(map);
            }
            ahoqVarX.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
