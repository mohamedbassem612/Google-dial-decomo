package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class vvy extends defpackage.aomh implements defpackage.aonn {
    int a;
    int b;
    final /* synthetic */ defpackage.vvz c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvy(defpackage.vvz vvzVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.c = vvzVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.vvy) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.aosy aosyVar;
        int i;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = this.b;
        byte[] bArr = null;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    aosyVar = (defpackage.aosy) this.d;
                    defpackage.aooc.af(obj);
                } else if (i2 != 2) {
                    defpackage.aooc.af(obj);
                } else {
                    i = this.a;
                    defpackage.aooc.af(obj);
                    if (!j$.util.Collection.-EL.stream((defpackage.aify) obj).anyMatch(new defpackage.vpl(new defpackage.ukw(11), 8)) || i != 0) {
                        return java.lang.Boolean.TRUE;
                    }
                    defpackage.ajcq ajcqVarA = this.c.j.a();
                    this.b = 3;
                    obj = defpackage.aosv.D(ajcqVarA, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                }
                return java.lang.Boolean.valueOf(((defpackage.vtn) obj).c);
            }
            defpackage.aooc.af(obj);
            defpackage.aoss aossVar = (defpackage.aoss) this.d;
            defpackage.vvz vvzVar = this.c;
            if (vvzVar.o.m()) {
                return java.lang.Boolean.FALSE;
            }
            defpackage.ajcq ajcqVarC = vvzVar.k.c();
            defpackage.aooh.e(ajcqVarC, "getVoicemailStatusList(...)");
            int i3 = 12;
            defpackage.aosy aosyVarAm = defpackage.aoov.am(aossVar, 0, new defpackage.ung(ajcqVarC, (defpackage.aoln) null, 12), 3);
            aosyVarAm.p(new defpackage.lwl(ajcqVarC, 14));
            defpackage.vtv vtvVar = vvzVar.b;
            defpackage.rsr rsrVarM = defpackage.vva.m(j$.util.Optional.empty());
            rsrVarM.aC(new defpackage.kaw("archived").aI("=", 1));
            defpackage.ajcq ajcqVarN = ((defpackage.vva) vtvVar).n(rsrVarM);
            defpackage.kvf kvfVar = new defpackage.kvf(i3);
            defpackage.ajcu ajcuVar = ((defpackage.vva) vtvVar).g;
            defpackage.ahrv ahrvVarI = defpackage.ahrv.g(((defpackage.vva) vtvVar).m.a()).i(new defpackage.vmv(vtvVar, defpackage.ahvr.H(ajcqVarN, kvfVar, ajcuVar), i3, bArr), ajcuVar);
            this.d = aosyVarAm;
            this.b = 1;
            java.lang.Object objD = defpackage.aosv.D(ahrvVarI, this);
            if (objD == aoluVar) {
                return aoluVar;
            }
            aosyVar = aosyVarAm;
            obj = objD;
            defpackage.aooh.e(obj, "await(...)");
            int iIntValue = ((java.lang.Number) obj).intValue();
            this.d = null;
            this.a = iIntValue;
            this.b = 2;
            java.lang.Object objA = aosyVar.a(this);
            if (objA == aoluVar) {
                return aoluVar;
            }
            i = iIntValue;
            obj = objA;
            if (!j$.util.Collection.-EL.stream((defpackage.aify) obj).anyMatch(new defpackage.vpl(new defpackage.ukw(11), 8))) {
            }
            return java.lang.Boolean.TRUE;
        } catch (java.lang.Exception e) {
            e = e;
            j$.util.Objects.checkIndex(0, 3);
            if (e instanceof defpackage.aguh) {
                ((defpackage.aimw) ((defpackage.aimw) defpackage.vvz.a.b()).k(e).l("com/android/dialer/voicemail/tab/impl/mainscreenintegration/VoicemailTabRetainedState", "voicemailTabAvailable$<anonymous>", 237, "VoicemailTabRetainedState.kt")).v("Failed to get archived voicemail count possibly due to missing permission or Dialer not being the default dialer.");
            } else if (e instanceof java.util.concurrent.ExecutionException) {
                java.lang.Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                ((defpackage.aimw) ((defpackage.aimw) defpackage.vvz.a.b()).k(e).l("com/android/dialer/voicemail/tab/impl/mainscreenintegration/VoicemailTabRetainedState", "voicemailTabAvailable$<anonymous>", 248, "VoicemailTabRetainedState.kt")).v("Futures to get archived voicemail count failed");
            } else {
                ((defpackage.aimw) ((defpackage.aimw) defpackage.vvz.a.b()).k(e).l("com/android/dialer/voicemail/tab/impl/mainscreenintegration/VoicemailTabRetainedState", "voicemailTabAvailable$<anonymous>", 251, "VoicemailTabRetainedState.kt")).v("getArchivedVoicemailsCount failed");
            }
            return java.lang.Boolean.FALSE;
        }
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.vvy vvyVar = new defpackage.vvy(this.c, aolnVar);
        vvyVar.d = obj;
        return vvyVar;
    }
}
