package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iac implements defpackage.hzq {
    private final oju a;

    public iac(oju ojuVar) {
        this.a = ojuVar;
    }

    @Override // defpackage.hzq
    public final ajcq e(boolean z) {
        oju ojuVar = this.a;
        ojuVar.f.setMicrophoneMute(z);
        zjv.i(ojuVar.d, mgv.dE, ajsz.aY(gus.ax(z)), (mhc) null, 0, 28);
        return aiql.z((java.lang.Object) null);
    }

    @Override // defpackage.hzq
    public final boolean f() {
        oju ojuVar = this.a;
        return ((java.lang.Boolean) new mgf(ojuVar.e, ojuVar.f.isMicrophoneMute()).a(mgv.dF).f()).booleanValue();
    }
}
