package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kdu implements defpackage.abwn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    private final defpackage.aoir b;

    public kdu(defpackage.zzx zzxVar, defpackage.itf itfVar, int i) {
        this.$cid = i;
        this.a = itfVar;
        this.b = defpackage.aooc.ah(3, new defpackage.gpg(zzxVar, 17));
    }

    @Override // defpackage.abwn
    public final java.lang.Object a() {
        int i = this.$cid;
        return defpackage.aojh.a;
    }

    @Override // defpackage.abwn
    public final java.lang.Object b(defpackage.ahbq ahbqVar, defpackage.aoln aolnVar) {
        if (this.$cid != 0) {
            for (defpackage.aoiu aoiuVar : (java.util.List) this.b.a()) {
                defpackage.abwm abwmVar = (defpackage.abwm) aoiuVar.a;
                defpackage.ahda ahdaVar = (defpackage.ahda) aoiuVar.b;
                java.lang.Object obj = this.a;
                defpackage.ahvr.ag(((defpackage.itf) obj).b, ahdaVar, new iiw(abwmVar, ahbqVar, (defpackage.aoln) null, 16)).p(new guv(15));
            }
            return defpackage.aojh.a;
        }
        defpackage.kdw kdwVar = (defpackage.kdw) this.a;
        kdwVar.g = null;
        kdwVar.h = null;
        for (defpackage.aoiu aoiuVar2 : (java.util.List) this.b.a()) {
            defpackage.abwm abwmVar2 = (defpackage.abwm) aoiuVar2.a;
            defpackage.ahvr.ag(kdwVar.e, (defpackage.ahda) aoiuVar2.b, new jpj(abwmVar2, ahbqVar, (defpackage.aoln) null, 13)).p(new kbz(7));
        }
        return defpackage.aojh.a;
    }

    public kdu(defpackage.kdw kdwVar, int i) {
        this.$cid = i;
        this.a = kdwVar;
        this.b = defpackage.aooc.ah(3, new defpackage.jza(kdwVar, 10));
    }
}
