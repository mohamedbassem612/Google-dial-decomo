package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kkv implements defpackage.hsf {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ ld a;
    public final /* synthetic */ defpackage.kkx b;

    public /* synthetic */ kkv(ld ldVar, defpackage.kkx kkxVar, int i) {
        this.$cid = i;
        this.a = ldVar;
        this.b = kkxVar;
    }

    @Override // defpackage.hsf
    public final void a(float f) {
        if (this.$cid != 0) {
            android.view.animation.Interpolator interpolator = defpackage.kla.a;
            this.a.a.requestLayout();
            defpackage.kkx kkxVar = this.b;
            kkxVar.e.b.requestLayout();
            kkxVar.d.b.requestLayout();
            return;
        }
        android.view.animation.Interpolator interpolator2 = defpackage.kla.a;
        android.view.View view = ((defpackage.kma) this.a).a;
        view.requestLayout();
        this.b.e.b.requestLayout();
        view.findViewById(2131427762).requestLayout();
    }
}
