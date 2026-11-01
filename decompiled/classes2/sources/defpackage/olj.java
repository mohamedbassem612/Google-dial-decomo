package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class olj extends defpackage.bs {
    final /* synthetic */ defpackage.oll b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olj(defpackage.oll ollVar, bo boVar) {
        super(boVar, 1);
        j$.util.Objects.requireNonNull(ollVar);
        this.b = ollVar;
    }

    @Override // defpackage.bs
    public final aw a(int i) {
        return (aw) this.b.a.b().get(i);
    }

    @Override // defpackage.gmi
    public final int i() {
        return this.b.a.b().size();
    }
}
