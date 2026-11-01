package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mje implements defpackage.lvn {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ defpackage.mjf b;

    public mje(defpackage.mjf mjfVar, java.lang.String str) {
        this.a = str;
        j$.util.Objects.requireNonNull(mjfVar);
        this.b = mjfVar;
    }

    @Override // defpackage.lvn
    public final void b(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z) {
        this.b.f.w(this.a, phoneAccountHandle);
    }

    @Override // defpackage.lvn
    public final void a() {
    }
}
