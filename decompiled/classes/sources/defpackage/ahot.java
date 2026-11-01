package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahot extends defpackage.ahou implements defpackage.ahos {
    public static final defpackage.ahou a = new defpackage.ahot(null, new defpackage.aec(0)).f();
    static final defpackage.ahou b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        defpackage.ahos ahosVarB = defpackage.ahou.b();
        ahosVarB.a(defpackage.ahou.e, java.lang.Boolean.TRUE);
        b = ((defpackage.ahou) ahosVarB).f();
    }

    @Override // defpackage.ahos
    public final void a(defpackage.agab agabVar, java.lang.Object obj) {
        defpackage.ahvr.bZ(!this.d, "Can't mutate after handing to trace");
        obj.getClass();
        defpackage.ahvr.bZ(!i(agabVar), "Key already present");
        this.c.put(agabVar, obj);
    }
}
