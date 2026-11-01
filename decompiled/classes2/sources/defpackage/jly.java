package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jly {
    public final defpackage.jlx a;
    public final defpackage.jmb b;
    public final rlv c;
    public final aoin d;
    public defpackage.jms e;
    public final ucm f;
    public final zzx g;

    public jly(defpackage.jlx jlxVar, ucm ucmVar, defpackage.jmb jmbVar, rlv rlvVar, zzx zzxVar, aoin aoinVar) {
        aooh.f(ucmVar, "tiktokAlertDialogs");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "enableHorizontalScrolling");
        this.a = jlxVar;
        this.f = ucmVar;
        this.b = jmbVar;
        this.c = rlvVar;
        this.g = zzxVar;
        this.d = aoinVar;
    }

    public final com.google.android.material.textfield.TextInputEditText a() {
        android.app.Dialog dialog = this.a.d;
        if (dialog != null) {
            return ft$.ExternalSyntheticApiModelOutline0.m(dialog, 2131429147);
        }
        return null;
    }
}
