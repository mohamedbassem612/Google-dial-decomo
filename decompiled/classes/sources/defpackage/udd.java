package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class udd implements defpackage.kfh {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/spam/calllog/SpamCallDataSource");
    public final defpackage.ucr b;
    public final defpackage.aoin c;
    private final defpackage.ajct d;
    private final defpackage.rsr e;

    public udd(defpackage.ucr ucrVar, defpackage.rsr rsrVar, defpackage.ajct ajctVar, defpackage.aoin aoinVar) {
        this.b = ucrVar;
        this.d = ajctVar;
        this.e = rsrVar;
        this.c = aoinVar;
    }

    @Override // defpackage.kfh
    public final defpackage.aenj a() {
        return new defpackage.aenj("SpamCallDataSource");
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq b(defpackage.kfj kfjVar) {
        defpackage.ajcq ajcqVarH;
        defpackage.ajcq ajcqVar;
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/spam/calllog/SpamCallDataSource", "fill", 87, "SpamCallDataSource.java")).v("fill");
        defpackage.ajcq[] ajcqVarArr = new defpackage.ajcq[2];
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/spam/calllog/SpamCallDataSource", "handleInserts", 93, "SpamCallDataSource.java")).v("handleInserts");
        defpackage.kfk kfkVar = (defpackage.kfk) kfjVar;
        java.util.Map map = kfkVar.a;
        if (map.isEmpty()) {
            ajcqVarH = defpackage.ajcm.a;
        } else {
            defpackage.ahrv ahrvVarG = defpackage.ahrv.g(this.b.a((defpackage.aify) j$.util.Collection.-EL.stream(map.values()).map(new thw(7)).collect(defpackage.aido.a)));
            defpackage.ubc ubcVar = new defpackage.ubc(4);
            defpackage.ajct ajctVar = this.d;
            ajcqVarH = ahrvVarG.e(java.lang.Throwable.class, ubcVar, ajctVar).h(new tcy(map, 16), ajctVar);
        }
        ajcqVarArr[0] = ajcqVarH;
        java.util.Set set = kfkVar.c;
        if (set.isEmpty()) {
            ajcqVar = defpackage.ajcm.a;
        } else {
            defpackage.ajcq ajcqVarH2 = defpackage.ahvr.H(this.e.ab(set), new tcy(this, 15), this.d);
            tct tctVar = new tct(this, 20);
            long j = defpackage.ahqx.a;
            defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), (defpackage.ajat) tctVar, 1);
            defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
            defpackage.ajax ajaxVar2 = new defpackage.ajax(defpackage.ahns.c(false), ajaxVar, 1);
            int i = defpackage.ajan.c;
            defpackage.ajal ajalVar = new defpackage.ajal(ajcqVarH2, ajaxVar2);
            ajcqVarH2.c(ajalVar, defpackage.aiql.t(ajbmVar, ajalVar));
            ajcqVar = ajalVar;
        }
        ajcqVarArr[1] = ajcqVar;
        defpackage.ahda ahdaVar = new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.o(ajcqVarArr)), (byte[]) null);
        defpackage.kve kveVar = new defpackage.kve(4);
        long j2 = defpackage.ahqx.a;
        return ahdaVar.o(new defpackage.ajav(defpackage.ahns.c(false), kveVar, 1), defpackage.ajbm.INSTANCE);
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq d() {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq e() {
        return defpackage.ajcm.a;
    }
}
