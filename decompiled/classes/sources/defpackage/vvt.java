package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class vvt extends defpackage.aomh implements defpackage.aonj {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ defpackage.vvz e;
    final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvt(defpackage.vvz vvzVar, boolean z, defpackage.aoln aolnVar) {
        super(1, aolnVar);
        this.e = vvzVar;
        this.f = z;
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.vvt(this.e, this.f, (defpackage.aoln) obj).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00be  */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.vvz vvzVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        defpackage.vvz vvzVar2;
        java.lang.Object obj4;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        if (this.d == 0) {
            defpackage.aooc.af(obj);
            vvzVar = this.e;
            boolean z = this.f;
            defpackage.vvr vvrVar = vvzVar.i;
            vvzVar.i = defpackage.vvr.a(vvrVar, z, 0, false, 6);
            defpackage.aimz aimzVar = defpackage.vvz.a;
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/voicemail/tab/impl/mainscreenintegration/VoicemailTabRetainedState", "getVoicemailTabState$<anonymous>$<anonymous>$<anonymous>$<anonymous>$<anonymous>$<anonymous>", 120, "VoicemailTabRetainedState.kt")).y("previousState = %s", vvrVar);
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/voicemail/tab/impl/mainscreenintegration/VoicemailTabRetainedState", "getVoicemailTabState$<anonymous>$<anonymous>$<anonymous>$<anonymous>$<anonymous>$<anonymous>", 121, "VoicemailTabRetainedState.kt")).y("currentState = %s", vvzVar.i);
            if (z) {
                defpackage.vvr vvrVar2 = vvzVar.i;
                defpackage.vtv vtvVar = vvzVar.b;
                defpackage.vva vvaVar = (defpackage.vva) vtvVar;
                defpackage.ajcq ajcqVarA = ((vup) vvaVar.l.a()).a();
                defpackage.ajcq ajcqVarA2 = vvaVar.m.a();
                vmq vmqVar = new vmq(vtvVar, 18);
                defpackage.ajcu ajcuVar = vvaVar.g;
                defpackage.ajcq ajcqVarI = defpackage.ahvr.I(ajcqVarA2, vmqVar, ajcuVar);
                defpackage.ajcq ajcqVarO = defpackage.ahvr.ak(ajcqVarA, ajcqVarI).o(new defpackage.vms(ajcqVarA, ajcqVarI, 11, null), ajcuVar);
                this.a = vvrVar;
                this.b = vvzVar;
                this.c = vvrVar2;
                this.d = 1;
                java.lang.Object objD = defpackage.aosv.D(ajcqVarO, this);
                if (objD == aoluVar) {
                    obj3 = vvrVar;
                    return aoluVar;
                }
                obj3 = vvrVar;
                obj2 = vvrVar2;
                obj = objD;
                obj4 = vvrVar;
            }
            obj3 = vvrVar;
            vvzVar2 = this.e;
            if (!defpackage.aooh.n(vvzVar2.i, obj3)) {
                ((defpackage.ipc) vvzVar2.m.g().orElseThrow()).aS();
            }
            return defpackage.aojh.a;
        }
        obj2 = this.c;
        vvzVar = (defpackage.vvz) this.b;
        java.lang.Object obj5 = this.a;
        defpackage.aooc.af(obj);
        obj4 = obj5;
        defpackage.aooh.e(obj, "await(...)");
        vvzVar.i = defpackage.vvr.a((defpackage.vvr) obj2, false, ((java.lang.Number) obj).intValue(), false, 5);
        obj3 = obj4;
        obj3 = vvrVar;
        vvzVar2 = this.e;
        if (!defpackage.aooh.n(vvzVar2.i, obj3)) {
            ((defpackage.ipc) vvzVar2.m.g().orElseThrow()).aS();
        }
        return defpackage.aojh.a;
    }
}
