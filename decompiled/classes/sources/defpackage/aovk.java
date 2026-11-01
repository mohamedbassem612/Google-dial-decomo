package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aovk extends java.util.concurrent.CancellationException implements defpackage.aosm {
    public final transient defpackage.aoub a;

    public aovk(java.lang.String str, defpackage.aoub aoubVar) {
        super(str);
        this.a = aoubVar;
    }

    @Override // defpackage.aosm
    public final /* bridge */ /* synthetic */ java.lang.Throwable a() {
        java.lang.String message = getMessage();
        if (message == null) {
            message = "";
        }
        defpackage.aovk aovkVar = new defpackage.aovk(message, this.a);
        aovkVar.initCause(this);
        return aovkVar;
    }
}
