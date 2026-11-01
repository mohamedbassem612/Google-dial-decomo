package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tto implements defpackage.abwn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public tto(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.abwn
    public final java.lang.Object a() {
        int i = this.$cid;
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    @Override // defpackage.abwn
    public final java.lang.Object b(defpackage.ahbq ahbqVar, defpackage.aoln aolnVar) {
        ttn ttnVar;
        java.lang.Object it;
        defpackage.abwm abwmVar;
        if (this.$cid != 0) {
            defpackage.srl srlVar = (defpackage.srl) this.a;
            if (((java.lang.Boolean) srlVar.f.a()).booleanValue()) {
                defpackage.ojo ojoVar = srlVar.e;
                android.net.Uri uri = defpackage.sro.a;
                defpackage.aooh.e(uri, "CONTENT_URI");
                ojoVar.p(uri);
                srlVar.i.t(defpackage.ajcm.a, defpackage.srp.b);
            }
            return defpackage.aojh.a;
        }
        if (aolnVar instanceof ttn) {
            ttnVar = (ttn) aolnVar;
            int i = ttnVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttnVar.d = i - Integer.MIN_VALUE;
            } else {
                ttnVar = new ttn(this, aolnVar);
            }
        } else {
            ttnVar = new ttn(this, aolnVar);
        }
        java.lang.Object obj = ttnVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ttnVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            it = ((defpackage.zzx) ((defpackage.zth) this.a).d).e().iterator();
            defpackage.aooh.e(it, "iterator(...)");
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = ttnVar.a;
            ahbqVar = ttnVar.e;
            defpackage.aooc.af(obj);
        }
        do {
            defpackage.ailj ailjVar = (defpackage.ailj) it;
            if (!ailjVar.hasNext()) {
                return defpackage.aojh.a;
            }
            abwmVar = (defpackage.abwm) ailjVar.next();
            ttnVar.e = ahbqVar;
            ttnVar.a = it;
            ttnVar.d = 1;
        } while (abwmVar.a(ahbqVar, ttnVar) != aoluVar);
        return aoluVar;
    }
}
