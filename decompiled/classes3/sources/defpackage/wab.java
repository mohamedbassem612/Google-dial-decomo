package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wab extends aomh implements aonj {
    java.lang.Object a;
    java.lang.Object b;
    boolean c;
    int d;
    final /* synthetic */ wad e;
    final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wab(wad wadVar, boolean z, aoln aolnVar) {
        super(1, aolnVar);
        this.e = wadVar;
        this.f = z;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.wab(this.e, this.f, (aoln) obj).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:9:0x002c, B:11:0x0033, B:13:0x003c, B:15:0x004c, B:17:0x005d), top: B:24:0x002c }] */
    public final java.lang.Object b(java.lang.Object obj) {
        wad wadVar;
        boolean z;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        aolu aoluVar = aolu.a;
        if (this.d != 0) {
            z = this.c;
            obj4 = this.b;
            obj2 = this.a;
            aooc.af(obj);
        } else {
            aooc.af(obj);
            wadVar = this.e;
            boolean z2 = this.f;
            apdp apdpVar = wadVar.f;
            this.a = apdpVar;
            this.b = wadVar;
            this.c = z2;
            this.d = 1;
            if (apdpVar.b(this) == aoluVar) {
                return aoluVar;
            }
            z = z2;
            obj2 = apdpVar;
        }
        if (z) {
            try {
                obj3 = wadVar;
                obj3 = obj4;
                android.telecom.CallAudioState callAudioState = ((wad) obj3).d;
                if (callAudioState != null && ((wad) obj3).g(callAudioState)) {
                    zpm zpmVar = ((wad) obj3).e;
                    aooh.f(zpmVar, "<this>");
                    if (wsc.ag(zpmVar)) {
                        aihd aihdVarB = zpmVar.b(defpackage.zpo.d);
                        aooh.e(aihdVarB, "getCallScopesWithState(...)");
                        if (aihdVarB.isEmpty()) {
                            ((wad) obj3).a().b(mce.gT);
                            ((wad) obj3).b.e(defpackage.zmw.ROUTE_EARPIECE);
                        }
                    } else {
                        ((wad) obj3).a().b(mce.gT);
                        ((wad) obj3).b.e(defpackage.zmw.ROUTE_EARPIECE);
                    }
                }
            } finally {
                ((apdp) obj2).d();
            }
        }
        obj3 = wadVar;
        obj3 = obj4;
        return aojh.a;
    }
}
