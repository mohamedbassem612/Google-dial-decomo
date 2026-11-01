package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pum implements defpackage.pug {
    private static final aimz a = aimz.i("com/android/dialer/incall/core/call/events/impl/UnknownEventState");
    private final android.telecom.Call b;
    private final aoin c;

    public pum(android.telecom.Call call, aoin aoinVar) {
        this.b = call;
        this.c = aoinVar;
    }

    @Override // defpackage.pug
    public final j$.util.Optional a(defpackage.pty ptyVar) {
        return ptyVar.a.ordinal() != 5 ? j$.util.Optional.empty() : j$.util.Optional.of((defpackage.pug) this.c.a());
    }

    @Override // defpackage.pug
    public final java.lang.String b() {
        return "UNKNOWN";
    }

    @Override // defpackage.pug
    public final void c() {
        ainm ainmVarD = a.d();
        android.telecom.Call call = this.b;
        a.bt(ainmVarD, "unhandled state %s", defpackage.zpo.a(call.getState()), "com/android/dialer/incall/core/call/events/impl/UnknownEventState", "fireEvent", '*', "UnknownEventState.java", zct.b);
    }
}
