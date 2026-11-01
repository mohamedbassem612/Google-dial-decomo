package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ofs extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.oft c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofs(defpackage.oft oftVar, boolean z, boolean z2, aoln aolnVar) {
        super(2, aolnVar);
        this.c = oftVar;
        this.d = z;
        this.e = z2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        defpackage.ogj ogjVar;
        aolu aoluVar = aolu.a;
        int i = this.b;
        if (i == 0) {
            aooc.af(obj);
            defpackage.oft oftVar = this.c;
            if (!oftVar.d && !oftVar.e) {
                boolean z = this.d;
                boolean z2 = this.e;
                this.b = 1;
                obj = oftVar.a(z, z2, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        if (i != 1) {
            obj2 = this.a;
            aooc.af(obj);
        } else {
            aooc.af(obj);
        }
        ((defpackage.oft) obj2).h = (defpackage.ogj) obj;
        defpackage.oft oftVar2 = this.c;
        ogjVar = oftVar2.h;
        if (ogjVar != null) {
            ogjVar.g();
            ogjVar.d();
        }
        oftVar2.d = true;
        return aojh.a;
        if (!((java.lang.Boolean) obj).booleanValue()) {
            defpackage.oft oftVar3 = this.c;
            android.media.AudioManager audioManager = oftVar3.c;
            oftVar3.f = audioManager.getStreamVolume(2);
            audioManager.setStreamVolume(2, audioManager.getStreamMaxVolume(2), 0);
            this.a = oftVar3;
            this.b = 2;
            java.lang.Object objAj = aoov.aj(oftVar3.b, new defpackage.mhq(oftVar3, (aoln) null, 20), this);
            if (objAj == aoluVar) {
                return aoluVar;
            }
            obj2 = oftVar3;
            obj = objAj;
            ((defpackage.oft) obj2).h = (defpackage.ogj) obj;
            defpackage.oft oftVar4 = this.c;
            ogjVar = oftVar4.h;
            if (ogjVar != null) {
                ogjVar.g();
                ogjVar.d();
            }
            oftVar4.d = true;
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ofs(this.c, this.d, this.e, aolnVar);
    }
}
