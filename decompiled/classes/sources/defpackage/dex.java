package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dex implements defpackage.dgk {
    private final android.view.ViewConfiguration a;

    public dex(android.view.ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.dgk
    public final float a() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.dgk
    public final float b() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.dgk
    public final long c() {
        return android.view.ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.dgk
    public final long d() {
        return android.view.ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.dgk
    public final /* synthetic */ long e() {
        return defpackage.mni.bj(48.0f, 48.0f);
    }
}
