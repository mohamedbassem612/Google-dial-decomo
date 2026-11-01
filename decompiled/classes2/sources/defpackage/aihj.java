package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aihj extends defpackage.aigh {
    final /* synthetic */ defpackage.aihl a;

    public aihj(defpackage.aihl aihlVar) {
        j$.util.Objects.requireNonNull(aihlVar);
        this.a = aihlVar;
    }

    @Override // defpackage.aigh
    public final aigf a() {
        return this.a;
    }

    public final aify h() {
        return new defpackage.aihi(this);
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final ailj iterator() {
        return g().y(0);
    }

    @Override // defpackage.aigh
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
