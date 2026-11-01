package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lbw implements defpackage.zcr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callscreen/impl/CallScreenEnabledFn");
    private final defpackage.aoin b;
    private final defpackage.mnk c;
    private final defpackage.zzx d;

    public lbw(defpackage.aoin aoinVar, defpackage.mnk mnkVar, defpackage.zzx zzxVar) {
        this.b = aoinVar;
        this.c = mnkVar;
        this.d = zzxVar;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        if (this.d.m()) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/callscreen/impl/CallScreenEnabledFn", "isEnabled", '#', "CallScreenEnabledFn.java")).v("feature disabled in direct boot");
            return false;
        }
        if (!((java.lang.Boolean) this.b.a()).booleanValue()) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/callscreen/impl/CallScreenEnabledFn", "isEnabled", '(', "CallScreenEnabledFn.java")).v("feature disabled by tidepods call screen flag");
            return false;
        }
        if (!this.c.a()) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/callscreen/impl/CallScreenEnabledFn", "isEnabled", ',', "CallScreenEnabledFn.java")).v("feature disabled because Dobby is enabled");
        return false;
    }
}
