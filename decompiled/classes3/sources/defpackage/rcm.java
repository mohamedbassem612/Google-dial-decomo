package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rcm {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public rcm(zpz zpzVar) {
        aooh.f(zpzVar, "inCallUpdatePropagator");
        this.c = zpzVar;
        this.b = new java.util.concurrent.atomic.AtomicBoolean();
        this.a = new defpackage.rai(this);
    }

    public final j$.util.Optional a() {
        j$.util.Optional optionalH = ((zpm) this.c).h();
        return true == optionalH.isPresent() ? j$.util.Optional.ofNullable(((defpackage.rcl) ((defpackage.apqr) optionalH.get()).a(defpackage.rcl.class)).ap()) : optionalH;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aoin, java.lang.Object] */
    public final defpackage.qtm b(defpackage.qtl qtlVar) {
        zpm zpmVar = (zpm) this.c.a();
        zpmVar.getClass();
        aazc aazcVar = (aazc) this.a.a();
        aazcVar.getClass();
        ajcu ajcuVar = (ajcu) this.b.a();
        ajcuVar.getClass();
        return new defpackage.qtm(qtlVar, zpmVar, aazcVar, ajcuVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aoin, java.lang.Object] */
    public final defpackage.qth c(defpackage.qtg qtgVar) {
        android.content.Context context = (android.content.Context) this.c.a();
        android.view.WindowManager windowManager = (android.view.WindowManager) this.b.a();
        mgu mguVar = (mgu) this.a.a();
        mguVar.getClass();
        qtgVar.getClass();
        return new defpackage.qth(context, windowManager, mguVar, qtgVar);
    }

    public rcm(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, byte[] bArr) {
        this.c = aoinVar;
        this.b = aoinVar2;
        aoinVar3.getClass();
        this.a = aoinVar3;
    }

    public rcm(aoin aoinVar, aoin aoinVar2, aoin aoinVar3) {
        aoinVar.getClass();
        this.c = aoinVar;
        aoinVar2.getClass();
        this.a = aoinVar2;
        aoinVar3.getClass();
        this.b = aoinVar3;
    }

    public rcm(defpackage.rck rckVar, ucm ucmVar, zpm zpmVar) {
        this.a = rckVar;
        this.b = ucmVar;
        this.c = zpmVar;
    }
}
